import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

new junipermist.site.Setting("site-setting", {
  siteId: sites.sites[0].id,
  apUpdownThreshold: 5,
  deviceUpdownThreshold: 5,
  vars: { key: "value", otherKey: "otherValue" },
  persistConfigOnDevice: true,
  autoUpgrade: {
    enabled: true,
    dayOfWeek: "sun",
    timeOfDay: "04:00",
    version: "beta",
  },
  rogue: {
    enabled: true,
    honeypotEnabled: true,
    minDuration: 20,
    minRssi: -85,
  },
  gatewayMgmt: {
    appUsage: true,
    rootPassword: "myRootPassword",
    appProbing: {
      apps: ["aws", "azure"],
      customApps: [
        {
          hostnames: ["example.com"],
          name: "customTestApp",
          protocol: "http",
        },
      ],
    },
  },
});
