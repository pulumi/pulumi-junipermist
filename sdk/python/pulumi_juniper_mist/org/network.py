# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NetworkArgs', 'Network']

@pulumi.input_type
class NetworkArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 subnet: pulumi.Input[str],
                 disallow_mist_services: Optional[pulumi.Input[bool]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 internal_access: Optional[pulumi.Input['NetworkInternalAccessArgs']] = None,
                 internet_access: Optional[pulumi.Input['NetworkInternetAccessArgs']] = None,
                 isolation: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 routed_for_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet6: Optional[pulumi.Input[str]] = None,
                 tenants: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkTenantsArgs']]]] = None,
                 vlan_id: Optional[pulumi.Input[str]] = None,
                 vpn_access: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]]] = None):
        """
        The set of arguments for constructing a Network resource.
        :param pulumi.Input[bool] disallow_mist_services: whether to disallow Mist Devices in the network
        :param pulumi.Input['NetworkInternetAccessArgs'] internet_access: whether this network has direct internet access
        :param pulumi.Input[bool] isolation: whether to allow clients in the network to talk to each other
        :param pulumi.Input[Sequence[pulumi.Input[str]]] routed_for_networks: for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        :param pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]] vpn_access: Property key is the VPN name. Whether this network can be accessed from vpn
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "subnet", subnet)
        if disallow_mist_services is not None:
            pulumi.set(__self__, "disallow_mist_services", disallow_mist_services)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if gateway6 is not None:
            pulumi.set(__self__, "gateway6", gateway6)
        if internal_access is not None:
            pulumi.set(__self__, "internal_access", internal_access)
        if internet_access is not None:
            pulumi.set(__self__, "internet_access", internet_access)
        if isolation is not None:
            pulumi.set(__self__, "isolation", isolation)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if routed_for_networks is not None:
            pulumi.set(__self__, "routed_for_networks", routed_for_networks)
        if subnet6 is not None:
            pulumi.set(__self__, "subnet6", subnet6)
        if tenants is not None:
            pulumi.set(__self__, "tenants", tenants)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)
        if vpn_access is not None:
            pulumi.set(__self__, "vpn_access", vpn_access)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def subnet(self) -> pulumi.Input[str]:
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: pulumi.Input[str]):
        pulumi.set(self, "subnet", value)

    @property
    @pulumi.getter(name="disallowMistServices")
    def disallow_mist_services(self) -> Optional[pulumi.Input[bool]]:
        """
        whether to disallow Mist Devices in the network
        """
        return pulumi.get(self, "disallow_mist_services")

    @disallow_mist_services.setter
    def disallow_mist_services(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disallow_mist_services", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter
    def gateway6(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway6")

    @gateway6.setter
    def gateway6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway6", value)

    @property
    @pulumi.getter(name="internalAccess")
    def internal_access(self) -> Optional[pulumi.Input['NetworkInternalAccessArgs']]:
        return pulumi.get(self, "internal_access")

    @internal_access.setter
    def internal_access(self, value: Optional[pulumi.Input['NetworkInternalAccessArgs']]):
        pulumi.set(self, "internal_access", value)

    @property
    @pulumi.getter(name="internetAccess")
    def internet_access(self) -> Optional[pulumi.Input['NetworkInternetAccessArgs']]:
        """
        whether this network has direct internet access
        """
        return pulumi.get(self, "internet_access")

    @internet_access.setter
    def internet_access(self, value: Optional[pulumi.Input['NetworkInternetAccessArgs']]):
        pulumi.set(self, "internet_access", value)

    @property
    @pulumi.getter
    def isolation(self) -> Optional[pulumi.Input[bool]]:
        """
        whether to allow clients in the network to talk to each other
        """
        return pulumi.get(self, "isolation")

    @isolation.setter
    def isolation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "isolation", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="routedForNetworks")
    def routed_for_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        """
        return pulumi.get(self, "routed_for_networks")

    @routed_for_networks.setter
    def routed_for_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "routed_for_networks", value)

    @property
    @pulumi.getter
    def subnet6(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "subnet6")

    @subnet6.setter
    def subnet6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet6", value)

    @property
    @pulumi.getter
    def tenants(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkTenantsArgs']]]]:
        return pulumi.get(self, "tenants")

    @tenants.setter
    def tenants(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkTenantsArgs']]]]):
        pulumi.set(self, "tenants", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vlan_id", value)

    @property
    @pulumi.getter(name="vpnAccess")
    def vpn_access(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]]]:
        """
        Property key is the VPN name. Whether this network can be accessed from vpn
        """
        return pulumi.get(self, "vpn_access")

    @vpn_access.setter
    def vpn_access(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]]]):
        pulumi.set(self, "vpn_access", value)


@pulumi.input_type
class _NetworkState:
    def __init__(__self__, *,
                 disallow_mist_services: Optional[pulumi.Input[bool]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 internal_access: Optional[pulumi.Input['NetworkInternalAccessArgs']] = None,
                 internet_access: Optional[pulumi.Input['NetworkInternetAccessArgs']] = None,
                 isolation: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 routed_for_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 subnet6: Optional[pulumi.Input[str]] = None,
                 tenants: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkTenantsArgs']]]] = None,
                 vlan_id: Optional[pulumi.Input[str]] = None,
                 vpn_access: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]]] = None):
        """
        Input properties used for looking up and filtering Network resources.
        :param pulumi.Input[bool] disallow_mist_services: whether to disallow Mist Devices in the network
        :param pulumi.Input['NetworkInternetAccessArgs'] internet_access: whether this network has direct internet access
        :param pulumi.Input[bool] isolation: whether to allow clients in the network to talk to each other
        :param pulumi.Input[Sequence[pulumi.Input[str]]] routed_for_networks: for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        :param pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]] vpn_access: Property key is the VPN name. Whether this network can be accessed from vpn
        """
        if disallow_mist_services is not None:
            pulumi.set(__self__, "disallow_mist_services", disallow_mist_services)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if gateway6 is not None:
            pulumi.set(__self__, "gateway6", gateway6)
        if internal_access is not None:
            pulumi.set(__self__, "internal_access", internal_access)
        if internet_access is not None:
            pulumi.set(__self__, "internet_access", internet_access)
        if isolation is not None:
            pulumi.set(__self__, "isolation", isolation)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if routed_for_networks is not None:
            pulumi.set(__self__, "routed_for_networks", routed_for_networks)
        if subnet is not None:
            pulumi.set(__self__, "subnet", subnet)
        if subnet6 is not None:
            pulumi.set(__self__, "subnet6", subnet6)
        if tenants is not None:
            pulumi.set(__self__, "tenants", tenants)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)
        if vpn_access is not None:
            pulumi.set(__self__, "vpn_access", vpn_access)

    @property
    @pulumi.getter(name="disallowMistServices")
    def disallow_mist_services(self) -> Optional[pulumi.Input[bool]]:
        """
        whether to disallow Mist Devices in the network
        """
        return pulumi.get(self, "disallow_mist_services")

    @disallow_mist_services.setter
    def disallow_mist_services(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disallow_mist_services", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter
    def gateway6(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "gateway6")

    @gateway6.setter
    def gateway6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway6", value)

    @property
    @pulumi.getter(name="internalAccess")
    def internal_access(self) -> Optional[pulumi.Input['NetworkInternalAccessArgs']]:
        return pulumi.get(self, "internal_access")

    @internal_access.setter
    def internal_access(self, value: Optional[pulumi.Input['NetworkInternalAccessArgs']]):
        pulumi.set(self, "internal_access", value)

    @property
    @pulumi.getter(name="internetAccess")
    def internet_access(self) -> Optional[pulumi.Input['NetworkInternetAccessArgs']]:
        """
        whether this network has direct internet access
        """
        return pulumi.get(self, "internet_access")

    @internet_access.setter
    def internet_access(self, value: Optional[pulumi.Input['NetworkInternetAccessArgs']]):
        pulumi.set(self, "internet_access", value)

    @property
    @pulumi.getter
    def isolation(self) -> Optional[pulumi.Input[bool]]:
        """
        whether to allow clients in the network to talk to each other
        """
        return pulumi.get(self, "isolation")

    @isolation.setter
    def isolation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "isolation", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="routedForNetworks")
    def routed_for_networks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        """
        return pulumi.get(self, "routed_for_networks")

    @routed_for_networks.setter
    def routed_for_networks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "routed_for_networks", value)

    @property
    @pulumi.getter
    def subnet(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "subnet")

    @subnet.setter
    def subnet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet", value)

    @property
    @pulumi.getter
    def subnet6(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "subnet6")

    @subnet6.setter
    def subnet6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subnet6", value)

    @property
    @pulumi.getter
    def tenants(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkTenantsArgs']]]]:
        return pulumi.get(self, "tenants")

    @tenants.setter
    def tenants(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkTenantsArgs']]]]):
        pulumi.set(self, "tenants", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vlan_id", value)

    @property
    @pulumi.getter(name="vpnAccess")
    def vpn_access(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]]]:
        """
        Property key is the VPN name. Whether this network can be accessed from vpn
        """
        return pulumi.get(self, "vpn_access")

    @vpn_access.setter
    def vpn_access(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['NetworkVpnAccessArgs']]]]):
        pulumi.set(self, "vpn_access", value)


class Network(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disallow_mist_services: Optional[pulumi.Input[bool]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 internal_access: Optional[pulumi.Input[Union['NetworkInternalAccessArgs', 'NetworkInternalAccessArgsDict']]] = None,
                 internet_access: Optional[pulumi.Input[Union['NetworkInternetAccessArgs', 'NetworkInternetAccessArgsDict']]] = None,
                 isolation: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 routed_for_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 subnet6: Optional[pulumi.Input[str]] = None,
                 tenants: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkTenantsArgs', 'NetworkTenantsArgsDict']]]]] = None,
                 vlan_id: Optional[pulumi.Input[str]] = None,
                 vpn_access: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkVpnAccessArgs', 'NetworkVpnAccessArgsDict']]]]] = None,
                 __props__=None):
        """
        This resource manages the WAN Assurance Networks.The Networks are used in the `service_policies` from the Gateway configuration and Gateway templates

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        network_one = junipermist.org.Network("network_one",
            org_id=terraform_test["id"],
            name="network_one",
            subnet="10.4.0.0/24",
            disallow_mist_services=False)
        ```

        ## Import

        ```sh
        $ pulumi import junipermist:org/network:Network Using terraform import, import `mist_org_network` using the `import` command:
        ```

        Gateway cluster can be imported by specifying the org_id and the network_id

        ```sh
        $ pulumi import junipermist:org/network:Network network_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        In Terraform v1.5.0 and later, use an import block to import `mist_org_network` with `id={org_id}.{network_id}`:

        tf

        import {

          to = mist_org_network.network_one

          id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"

        }

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] disallow_mist_services: whether to disallow Mist Devices in the network
        :param pulumi.Input[Union['NetworkInternetAccessArgs', 'NetworkInternetAccessArgsDict']] internet_access: whether this network has direct internet access
        :param pulumi.Input[bool] isolation: whether to allow clients in the network to talk to each other
        :param pulumi.Input[Sequence[pulumi.Input[str]]] routed_for_networks: for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        :param pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkVpnAccessArgs', 'NetworkVpnAccessArgsDict']]]] vpn_access: Property key is the VPN name. Whether this network can be accessed from vpn
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the WAN Assurance Networks.The Networks are used in the `service_policies` from the Gateway configuration and Gateway templates

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        network_one = junipermist.org.Network("network_one",
            org_id=terraform_test["id"],
            name="network_one",
            subnet="10.4.0.0/24",
            disallow_mist_services=False)
        ```

        ## Import

        ```sh
        $ pulumi import junipermist:org/network:Network Using terraform import, import `mist_org_network` using the `import` command:
        ```

        Gateway cluster can be imported by specifying the org_id and the network_id

        ```sh
        $ pulumi import junipermist:org/network:Network network_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        In Terraform v1.5.0 and later, use an import block to import `mist_org_network` with `id={org_id}.{network_id}`:

        tf

        import {

          to = mist_org_network.network_one

          id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"

        }

        :param str resource_name: The name of the resource.
        :param NetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 disallow_mist_services: Optional[pulumi.Input[bool]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 internal_access: Optional[pulumi.Input[Union['NetworkInternalAccessArgs', 'NetworkInternalAccessArgsDict']]] = None,
                 internet_access: Optional[pulumi.Input[Union['NetworkInternetAccessArgs', 'NetworkInternetAccessArgsDict']]] = None,
                 isolation: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 routed_for_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 subnet: Optional[pulumi.Input[str]] = None,
                 subnet6: Optional[pulumi.Input[str]] = None,
                 tenants: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkTenantsArgs', 'NetworkTenantsArgsDict']]]]] = None,
                 vlan_id: Optional[pulumi.Input[str]] = None,
                 vpn_access: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkVpnAccessArgs', 'NetworkVpnAccessArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkArgs.__new__(NetworkArgs)

            __props__.__dict__["disallow_mist_services"] = disallow_mist_services
            __props__.__dict__["gateway"] = gateway
            __props__.__dict__["gateway6"] = gateway6
            __props__.__dict__["internal_access"] = internal_access
            __props__.__dict__["internet_access"] = internet_access
            __props__.__dict__["isolation"] = isolation
            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["routed_for_networks"] = routed_for_networks
            if subnet is None and not opts.urn:
                raise TypeError("Missing required property 'subnet'")
            __props__.__dict__["subnet"] = subnet
            __props__.__dict__["subnet6"] = subnet6
            __props__.__dict__["tenants"] = tenants
            __props__.__dict__["vlan_id"] = vlan_id
            __props__.__dict__["vpn_access"] = vpn_access
        super(Network, __self__).__init__(
            'junipermist:org/network:Network',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            disallow_mist_services: Optional[pulumi.Input[bool]] = None,
            gateway: Optional[pulumi.Input[str]] = None,
            gateway6: Optional[pulumi.Input[str]] = None,
            internal_access: Optional[pulumi.Input[Union['NetworkInternalAccessArgs', 'NetworkInternalAccessArgsDict']]] = None,
            internet_access: Optional[pulumi.Input[Union['NetworkInternetAccessArgs', 'NetworkInternetAccessArgsDict']]] = None,
            isolation: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            routed_for_networks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            subnet: Optional[pulumi.Input[str]] = None,
            subnet6: Optional[pulumi.Input[str]] = None,
            tenants: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkTenantsArgs', 'NetworkTenantsArgsDict']]]]] = None,
            vlan_id: Optional[pulumi.Input[str]] = None,
            vpn_access: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkVpnAccessArgs', 'NetworkVpnAccessArgsDict']]]]] = None) -> 'Network':
        """
        Get an existing Network resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] disallow_mist_services: whether to disallow Mist Devices in the network
        :param pulumi.Input[Union['NetworkInternetAccessArgs', 'NetworkInternetAccessArgsDict']] internet_access: whether this network has direct internet access
        :param pulumi.Input[bool] isolation: whether to allow clients in the network to talk to each other
        :param pulumi.Input[Sequence[pulumi.Input[str]]] routed_for_networks: for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        :param pulumi.Input[Mapping[str, pulumi.Input[Union['NetworkVpnAccessArgs', 'NetworkVpnAccessArgsDict']]]] vpn_access: Property key is the VPN name. Whether this network can be accessed from vpn
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkState.__new__(_NetworkState)

        __props__.__dict__["disallow_mist_services"] = disallow_mist_services
        __props__.__dict__["gateway"] = gateway
        __props__.__dict__["gateway6"] = gateway6
        __props__.__dict__["internal_access"] = internal_access
        __props__.__dict__["internet_access"] = internet_access
        __props__.__dict__["isolation"] = isolation
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["routed_for_networks"] = routed_for_networks
        __props__.__dict__["subnet"] = subnet
        __props__.__dict__["subnet6"] = subnet6
        __props__.__dict__["tenants"] = tenants
        __props__.__dict__["vlan_id"] = vlan_id
        __props__.__dict__["vpn_access"] = vpn_access
        return Network(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="disallowMistServices")
    def disallow_mist_services(self) -> pulumi.Output[bool]:
        """
        whether to disallow Mist Devices in the network
        """
        return pulumi.get(self, "disallow_mist_services")

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "gateway")

    @property
    @pulumi.getter
    def gateway6(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "gateway6")

    @property
    @pulumi.getter(name="internalAccess")
    def internal_access(self) -> pulumi.Output[Optional['outputs.NetworkInternalAccess']]:
        return pulumi.get(self, "internal_access")

    @property
    @pulumi.getter(name="internetAccess")
    def internet_access(self) -> pulumi.Output[Optional['outputs.NetworkInternetAccess']]:
        """
        whether this network has direct internet access
        """
        return pulumi.get(self, "internet_access")

    @property
    @pulumi.getter
    def isolation(self) -> pulumi.Output[Optional[bool]]:
        """
        whether to allow clients in the network to talk to each other
        """
        return pulumi.get(self, "isolation")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="routedForNetworks")
    def routed_for_networks(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        for a Network (usually LAN), it can be routable to other networks (e.g. OSPF)
        """
        return pulumi.get(self, "routed_for_networks")

    @property
    @pulumi.getter
    def subnet(self) -> pulumi.Output[str]:
        return pulumi.get(self, "subnet")

    @property
    @pulumi.getter
    def subnet6(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "subnet6")

    @property
    @pulumi.getter
    def tenants(self) -> pulumi.Output[Optional[Mapping[str, 'outputs.NetworkTenants']]]:
        return pulumi.get(self, "tenants")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "vlan_id")

    @property
    @pulumi.getter(name="vpnAccess")
    def vpn_access(self) -> pulumi.Output[Optional[Mapping[str, 'outputs.NetworkVpnAccess']]]:
        """
        Property key is the VPN name. Whether this network can be accessed from vpn
        """
        return pulumi.get(self, "vpn_access")

