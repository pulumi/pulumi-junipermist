import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

const orgTemplate = new junipermist.org.Wlantemplate("org-template", {
  orgId: organizationId,
  name: "wlan_org_template",
});

const wlan = new junipermist.org.Wlan("wlan_one", {
  templateId: orgTemplate.id,
  ssid: "wlan_one",
  orgId: organizationId,
  auth: {
    type: "psk",
    psk: "secretpsk!",
  },
  interface: "all",
});

new junipermist.org.WlanPortalTemplate("portal-template", {
  orgId: wlan.orgId,
  wlanId: wlan.id,
  portalTemplate: {
    smsMessageFormat: "Code {{code}} expires in {{duration}} minutes.",
    smsValidityDuration: 10,
    pageTitle: "Welcome To My Demo Portal",
    locales: {
      "fr-FR": {
        pageTitle: "Bienvenue sur mon portail de démo",
      },
    },
  },
});
