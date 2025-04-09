# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['WxtagArgs', 'Wxtag']

@pulumi.input_type
class WxtagArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[builtins.str],
                 type: pulumi.Input[builtins.str],
                 mac: Optional[pulumi.Input[builtins.str]] = None,
                 match: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 op: Optional[pulumi.Input[builtins.str]] = None,
                 specs: Optional[pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 vlan_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Wxtag resource.
        :param pulumi.Input[builtins.str] type: enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        :param pulumi.Input[builtins.str] mac: If `type`==`client`, Client MAC Address
        :param pulumi.Input[builtins.str] match: required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
               `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        :param pulumi.Input[builtins.str] name: The name
        :param pulumi.Input[builtins.str] op: required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        :param pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]] specs: If `type`==`spec`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] values: Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
               `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
               `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
               `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
               Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
               RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
               ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
               Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
               `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
               list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "type", type)
        if mac is not None:
            pulumi.set(__self__, "mac", mac)
        if match is not None:
            pulumi.set(__self__, "match", match)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if op is not None:
            pulumi.set(__self__, "op", op)
        if specs is not None:
            pulumi.set(__self__, "specs", specs)
        if values is not None:
            pulumi.set(__self__, "values", values)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[builtins.str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[builtins.str]:
        """
        enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def mac(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        If `type`==`client`, Client MAC Address
        """
        return pulumi.get(self, "mac")

    @mac.setter
    def mac(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mac", value)

    @property
    @pulumi.getter
    def match(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
        `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        """
        return pulumi.get(self, "match")

    @match.setter
    def match(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "match", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def op(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        """
        return pulumi.get(self, "op")

    @op.setter
    def op(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "op", value)

    @property
    @pulumi.getter
    def specs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]]]:
        """
        If `type`==`spec`
        """
        return pulumi.get(self, "specs")

    @specs.setter
    def specs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]]]):
        pulumi.set(self, "specs", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
        `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
        `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
        `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
        Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
        RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
        ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
        Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
        `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
        list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "values", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "vlan_id", value)


@pulumi.input_type
class _WxtagState:
    def __init__(__self__, *,
                 mac: Optional[pulumi.Input[builtins.str]] = None,
                 match: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 op: Optional[pulumi.Input[builtins.str]] = None,
                 org_id: Optional[pulumi.Input[builtins.str]] = None,
                 specs: Optional[pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 vlan_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering Wxtag resources.
        :param pulumi.Input[builtins.str] mac: If `type`==`client`, Client MAC Address
        :param pulumi.Input[builtins.str] match: required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
               `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        :param pulumi.Input[builtins.str] name: The name
        :param pulumi.Input[builtins.str] op: required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        :param pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]] specs: If `type`==`spec`
        :param pulumi.Input[builtins.str] type: enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] values: Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
               `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
               `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
               `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
               Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
               RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
               ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
               Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
               `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
               list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        """
        if mac is not None:
            pulumi.set(__self__, "mac", mac)
        if match is not None:
            pulumi.set(__self__, "match", match)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if op is not None:
            pulumi.set(__self__, "op", op)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if specs is not None:
            pulumi.set(__self__, "specs", specs)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if values is not None:
            pulumi.set(__self__, "values", values)
        if vlan_id is not None:
            pulumi.set(__self__, "vlan_id", vlan_id)

    @property
    @pulumi.getter
    def mac(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        If `type`==`client`, Client MAC Address
        """
        return pulumi.get(self, "mac")

    @mac.setter
    def mac(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mac", value)

    @property
    @pulumi.getter
    def match(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
        `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        """
        return pulumi.get(self, "match")

    @match.setter
    def match(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "match", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def op(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        """
        return pulumi.get(self, "op")

    @op.setter
    def op(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "op", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def specs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]]]:
        """
        If `type`==`spec`
        """
        return pulumi.get(self, "specs")

    @specs.setter
    def specs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WxtagSpecArgs']]]]):
        pulumi.set(self, "specs", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
        `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
        `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
        `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
        Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
        RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
        ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
        Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
        `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
        list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "values", value)

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "vlan_id")

    @vlan_id.setter
    def vlan_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "vlan_id", value)


class Wxtag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mac: Optional[pulumi.Input[builtins.str]] = None,
                 match: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 op: Optional[pulumi.Input[builtins.str]] = None,
                 org_id: Optional[pulumi.Input[builtins.str]] = None,
                 specs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WxtagSpecArgs', 'WxtagSpecArgsDict']]]]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 vlan_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        This resource manages the Org WxLan tags (labels).

        A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions. They can be used
        * within the Org WxRules to create filtering rules:
          * `mist_org_wxrule.dst_allow_wxtags`
          * `mist_org_wxrule.dst_deny_wxtags`
          * `mist_org_wxrule.dst_wxtags`
          * `mist_org_wxrule.src_wxtags`
        * within the Org WxRules to assign specific VLAN:
          * `mist_org_wxrule.apply_tags`
        * in the WLANs configuration to assign a WLAN to specific APs:
          * `mist_org_wlan.wxtag_ids`
        * to identify unknown application used by Wi-Fi clients

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        wxtag_one = junipermist.org.Wxtag("wxtag_one",
            org_id=terraform_test["id"],
            name="wxtag_one",
            values=["10.3.0.0/16"],
            op="in",
            type="match",
            match="ip_range_subnet")
        ```

        ## Import

        Using `pulumi import`, import `mist_org_wxtag` with:

        Org WxTag can be imported by specifying the org_id and the wxtag_id

        ```sh
        $ pulumi import junipermist:org/wxtag:Wxtag wxtag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] mac: If `type`==`client`, Client MAC Address
        :param pulumi.Input[builtins.str] match: required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
               `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        :param pulumi.Input[builtins.str] name: The name
        :param pulumi.Input[builtins.str] op: required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        :param pulumi.Input[Sequence[pulumi.Input[Union['WxtagSpecArgs', 'WxtagSpecArgsDict']]]] specs: If `type`==`spec`
        :param pulumi.Input[builtins.str] type: enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] values: Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
               `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
               `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
               `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
               Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
               RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
               ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
               Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
               `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
               list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WxtagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the Org WxLan tags (labels).

        A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions. They can be used
        * within the Org WxRules to create filtering rules:
          * `mist_org_wxrule.dst_allow_wxtags`
          * `mist_org_wxrule.dst_deny_wxtags`
          * `mist_org_wxrule.dst_wxtags`
          * `mist_org_wxrule.src_wxtags`
        * within the Org WxRules to assign specific VLAN:
          * `mist_org_wxrule.apply_tags`
        * in the WLANs configuration to assign a WLAN to specific APs:
          * `mist_org_wlan.wxtag_ids`
        * to identify unknown application used by Wi-Fi clients

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        wxtag_one = junipermist.org.Wxtag("wxtag_one",
            org_id=terraform_test["id"],
            name="wxtag_one",
            values=["10.3.0.0/16"],
            op="in",
            type="match",
            match="ip_range_subnet")
        ```

        ## Import

        Using `pulumi import`, import `mist_org_wxtag` with:

        Org WxTag can be imported by specifying the org_id and the wxtag_id

        ```sh
        $ pulumi import junipermist:org/wxtag:Wxtag wxtag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param WxtagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WxtagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 mac: Optional[pulumi.Input[builtins.str]] = None,
                 match: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 op: Optional[pulumi.Input[builtins.str]] = None,
                 org_id: Optional[pulumi.Input[builtins.str]] = None,
                 specs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WxtagSpecArgs', 'WxtagSpecArgsDict']]]]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 vlan_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WxtagArgs.__new__(WxtagArgs)

            __props__.__dict__["mac"] = mac
            __props__.__dict__["match"] = match
            __props__.__dict__["name"] = name
            __props__.__dict__["op"] = op
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["specs"] = specs
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["values"] = values
            __props__.__dict__["vlan_id"] = vlan_id
        super(Wxtag, __self__).__init__(
            'junipermist:org/wxtag:Wxtag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            mac: Optional[pulumi.Input[builtins.str]] = None,
            match: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            op: Optional[pulumi.Input[builtins.str]] = None,
            org_id: Optional[pulumi.Input[builtins.str]] = None,
            specs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WxtagSpecArgs', 'WxtagSpecArgsDict']]]]] = None,
            type: Optional[pulumi.Input[builtins.str]] = None,
            values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            vlan_id: Optional[pulumi.Input[builtins.str]] = None) -> 'Wxtag':
        """
        Get an existing Wxtag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] mac: If `type`==`client`, Client MAC Address
        :param pulumi.Input[builtins.str] match: required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
               `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        :param pulumi.Input[builtins.str] name: The name
        :param pulumi.Input[builtins.str] op: required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        :param pulumi.Input[Sequence[pulumi.Input[Union['WxtagSpecArgs', 'WxtagSpecArgsDict']]]] specs: If `type`==`spec`
        :param pulumi.Input[builtins.str] type: enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] values: Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
               `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
               `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
               `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
               Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
               RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
               ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
               Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
               `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
               list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WxtagState.__new__(_WxtagState)

        __props__.__dict__["mac"] = mac
        __props__.__dict__["match"] = match
        __props__.__dict__["name"] = name
        __props__.__dict__["op"] = op
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["specs"] = specs
        __props__.__dict__["type"] = type
        __props__.__dict__["values"] = values
        __props__.__dict__["vlan_id"] = vlan_id
        return Wxtag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def mac(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        If `type`==`client`, Client MAC Address
        """
        return pulumi.get(self, "mac")

    @property
    @pulumi.getter
    def match(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        required if `type`==`match`. enum: `ap_id`, `app`, `asset_mac`, `client_mac`, `hostname`, `ip_range_subnet`, `port`,
        `psk_name`, `psk_role`, `radius_attr`, `radius_class`, `radius_group`, `radius_username`, `sdkclient_uuid`, `wlan_id`
        """
        return pulumi.get(self, "match")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        The name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def op(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `not_in`
        """
        return pulumi.get(self, "op")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def specs(self) -> pulumi.Output[Optional[Sequence['outputs.WxtagSpec']]]:
        """
        If `type`==`spec`
        """
        return pulumi.get(self, "specs")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[builtins.str]:
        """
        enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def values(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        Required if `type`==`match` and * `match`==`ap_id`: list of AP IDs * `match`==`app`: list of Application Names *
        `match`==`asset_mac`: list of Asset MAC Addresses * `match`==`client_mac`: list of Client MAC Addresses *
        `match`==`hostname`: list of Resources Hostnames * `match`==`ip_range_subnet`: list of IP Addresses and/or CIDRs *
        `match`==`psk_name`: list of PSK Names * `match`==`psk_role`: list of PSK Roles * `match`==`port`: list of Ports or Port
        Ranges * `match`==`radius_attr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
        RADIUS attributes where we know the type * `match`==`radius_class`: list of RADIUS Classes. This matches the
        ATTR-Class(25) * `match`==`radius_group`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
        Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
        `match`==`radius_username`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclient_uuid`:
        list of SDK UUIDs * `match`==`wlan_id`: list of WLAN IDs **Notes**: Variables are not allowed
        """
        return pulumi.get(self, "values")

    @property
    @pulumi.getter(name="vlanId")
    def vlan_id(self) -> pulumi.Output[Optional[builtins.str]]:
        return pulumi.get(self, "vlan_id")

