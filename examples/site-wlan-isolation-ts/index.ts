import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

new junipermist.site.Wlan("wlan-isolation", {
  ssid: "site_wlan_isolation_ts",
  siteId: sites.sites[0].id,
  wlanLimitUpEnabled: false,
  wlanLimitDownEnabled: false,
  clientLimitDownEnabled: false,
  clientLimitUpEnabled: false,
  limitBcast: true,
  allowSsdp: true,
  isolation: true,
  auth: {
    type: "psk",
    psk: "secretpsk!",
  },
  portal: {
    enabled: false,
  },
  interface: "all",
});
