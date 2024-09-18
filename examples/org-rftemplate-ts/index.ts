import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

new junipermist.org.Rftemplate("rftemplate", {
  orgId: organizationId,
  name: "Integration_Template_Test",
  countryCode: "US",
});
