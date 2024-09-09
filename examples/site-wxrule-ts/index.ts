import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

new junipermist.site.Wxrule("pulumi-wxrule", {
  enabled: true,
  action: "allow",
  order: 2,
  siteId: sites.sites[0].id,
  srcWxtags: ["IOT"],
  dstAllowWxtags: ["RFC-1918"],
});
