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
  gatewayMgmt: {
    appProbing: {
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
