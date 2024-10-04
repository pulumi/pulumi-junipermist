import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

new junipermist.org.Alarmtemplate("alarm_template", {
  orgId: organizationId,
  delivery: {
    toOrgAdmins: true,
    toSiteAdmins: true,
    enabled: false,
  },
  rules: {
    mist_edge_cpu_usage_high: {
      enabled: true,
    },
  },
  name: "CPU Alarm Template",
});
