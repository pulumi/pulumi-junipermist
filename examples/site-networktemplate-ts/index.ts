import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const sites = junipermist.getSitesOutput({
  orgId: organizationId,
});

new junipermist.site.Networktemplate("site-network-template", {
  siteId: sites.sites[0].id,
  portMirroring: {
    test: {
      inputNetworksIngresses: ["default"],
      outputPortId: "ge-0/0/1",
    },
  },
  switchMgmt: {
    protectRe: {
      enabled: true,
      allowedServices: ["icmp", "ssh"],
    },
    rootPassword: "fake-password",
  },
});
