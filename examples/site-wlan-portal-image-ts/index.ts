import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

const wlan = new junipermist.site.Wlan("wlan-portal-image", {
  ssid: "site_wlan_portal_image_ts",
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

new junipermist.site.WlanPortalImage("portal-image", {
  siteId: wlan.siteId,
  wlanId: wlan.id,
  file: "./pulumi_logo.png",
});
