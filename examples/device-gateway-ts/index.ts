import * as pulumi from "@pulumi/pulumi";
import * as junipermist from "@pulumi/juniper-mist";

const config = new pulumi.Config();
const organizationId = config.requireSecret("organizationId");

const orgResource = junipermist.org
  .getInventoryOutput({
    orgId: organizationId,
  })
  .orgInventories.apply((orgInv) => {
    const siteResource = orgInv.find((inventory) => inventory.siteId);
    if (!siteResource) {
      throw new Error("No inventory device found with siteId");
    }
    return siteResource;
  });

const myOrgPolicy = new junipermist.org.Servicepolicy("service-policy", {
  orgId: organizationId,
  action: "deny",
  name: "test-org-policy",
  services: ["dns", "dhcp"],
});

const gateway = new junipermist.device.Gateway(`gateway-01`, {
  deviceId: orgResource.id,
  vrfConfig: {
    enabled: true,
  },
  ntpServers: ["132.163.96.1", "132.163.96.2"],
  dnsServers: ["8.8.8.8", "1.1.1.1"],
  additionalConfigCmds: ["# Comment #", `# Other Comment! #`],
  oobIpConfig: {
    type: "dhcp",
    node1: {
      type: "dhcp",
    },
  },
  name: "gatewayTest",
  siteId: orgResource.siteId,
  portConfig: {
    "ge-0/0/3": {
      ipConfig: {
        type: "dhcp",
      },
      disabled: false,
      usage: "wan",
      name: "test-port",
      description: "test",
      disableAutoneg: true,
      duplex: "full",
      redundant: true,
      rethIdx: 1,
      wanType: "broadband",
      rethNode: "node0",
    },
  },
  pathPreferences: {
    "ANY-TO-ANY": {
      strategy: "ordered",
      paths: [{ networks: ["default"], type: "local" }],
    },
  },
  vrfInstances: {
    "my-test": {
      networks: ["default"],
    },
  },
  tunnelConfigs: {
    default: {
      ikeLifetime: 28800,
      ikeProposals: [
        {
          authAlgo: "sha2",
          dhGroup: "19",
          encAlgo: "aes256",
        },
      ],
      ipsecLifetime: 3600,
      ipsecProposals: [
        {
          authAlgo: "sha2",
          dhGroup: "19",
          encAlgo: "aes256",
        },
      ],
      localId: "test-local-id",
      primary: {
        hosts: ["192.0.2.1"],
        remoteIds: ["192.0.2.2"],
        wanNames: ["WAN_0"],
      },
      protocol: "ipsec",
      provider: "custom-ipsec",
      psk: "my-secret",
      version: "2",
    },
  },
  ipConfigs: {
    default: {
      ip: "192.0.2.1",
      netmask: "/32",
      type: "static",
      secondaryIps: ["192.0.2.1/23"],
    },
  },
  dhcpdConfig: {
    enabled: true,
    config: {
      "my-test": {
        dnsServers: ["8.8.8.8", "1.1.1.1"],
        gateway: "{{gateway_ip}}.1",
        ipEnd: "192.0.2.255",
        ipStart: "192.0.2.2",
        type: "local",
      },
    },
  },
  servicePolicies: [
    {
      // name: myOrgPolicy.name, // Cannot be set if servicepolicyId is set
      pathPreference: "TO-CORE",
      servicepolicyId: myOrgPolicy.id,
    },
  ],
});

new junipermist.device.Image("gateway-image", {
  deviceId: gateway.id,
  siteId: gateway.siteId,
  file: "./pulumi_logo.png",
  imageNumber: 1,
});
