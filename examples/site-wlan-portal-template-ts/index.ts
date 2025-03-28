import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

const wlan = new junipermist.site.Wlan("wlan-portal-template", {
  ssid: "site_wlan_portal_template_ts",
  siteId: sites.sites[0].id,
  wlanLimitUpEnabled: false,
  wlanLimitDownEnabled: false,
  clientLimitDownEnabled: false,
  clientLimitUpEnabled: false,
  auth: {
    type: "psk",
    psk: "secretpsk!",
  },
  interface: "all",
});

new junipermist.site.WlanPortalTemplate("portal-template", {
  siteId: wlan.siteId,
  wlanId: wlan.id,
  portalTemplate: {
    logo: "./pulumi_logo.png",
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
