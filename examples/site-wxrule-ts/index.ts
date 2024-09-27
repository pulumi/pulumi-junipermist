import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

const wtag = new junipermist.site.Wxtag("wtag_one", {
  siteId: sites.sites[0].id,
  name: "wtag_one",
  values: ["192.0.2.0/16"],
  op: "in",
  type: "match",
  match: "ip_range_subnet",
});

new junipermist.site.Wxrule("pulumi-wxrule", {
  enabled: true,
  action: "allow",
  order: -1,
  siteId: sites.sites[0].id,
  srcWxtags: ["IOT"],
  dstAllowWxtags: ["RFC-1918"],
});

new junipermist.site.Wxrule("pulumi-wxrule2", {
  enabled: true,
  action: "allow",
  order: 2,
  siteId: wtag.siteId,
  srcWxtags: ["IOT"],
  dstAllowWxtags: [wtag.id],
});
