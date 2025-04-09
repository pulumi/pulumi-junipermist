import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");
const claimCode1 = config.requireSecret("claimCode1");
const claimCode2 = config.requireSecret("claimCode2");

new junipermist.org.Inventory("ap", {
  orgId: organizationId,
  inventory: {
    [claimCode1]: {},
    [claimCode2]: {},
  },
});
