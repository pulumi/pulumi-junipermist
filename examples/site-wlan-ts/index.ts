import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

new junipermist.site.Wlan("org-wlan-one", {
  ssid: "site_wlan_ts",
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
