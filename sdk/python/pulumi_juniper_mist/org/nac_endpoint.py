# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['NacEndpointArgs', 'NacEndpoint']

@pulumi.input_type
class NacEndpointArgs:
    def __init__(__self__, *,
                 mac: pulumi.Input[_builtins.str],
                 org_id: pulumi.Input[_builtins.str],
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 notes: Optional[pulumi.Input[_builtins.str]] = None,
                 radius_group: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a NacEndpoint resource.
        :param pulumi.Input[_builtins.str] mac: Only non-local-admin MAC is accepted
        """
        pulumi.set(__self__, "mac", mac)
        pulumi.set(__self__, "org_id", org_id)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if radius_group is not None:
            pulumi.set(__self__, "radius_group", radius_group)
        if vlan is not None:
            pulumi.set(__self__, "vlan", vlan)

    @_builtins.property
    @pulumi.getter
    def mac(self) -> pulumi.Input[_builtins.str]:
        """
        Only non-local-admin MAC is accepted
        """
        return pulumi.get(self, "mac")

    @mac.setter
    def mac(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "mac", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "notes", value)

    @_builtins.property
    @pulumi.getter(name="radiusGroup")
    def radius_group(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "radius_group")

    @radius_group.setter
    def radius_group(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "radius_group", value)

    @_builtins.property
    @pulumi.getter
    def vlan(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "vlan")

    @vlan.setter
    def vlan(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vlan", value)


@pulumi.input_type
class _NacEndpointState:
    def __init__(__self__, *,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 mac: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 notes: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 radius_group: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NacEndpoint resources.
        :param pulumi.Input[_builtins.str] mac: Only non-local-admin MAC is accepted
        """
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if mac is not None:
            pulumi.set(__self__, "mac", mac)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notes is not None:
            pulumi.set(__self__, "notes", notes)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if radius_group is not None:
            pulumi.set(__self__, "radius_group", radius_group)
        if vlan is not None:
            pulumi.set(__self__, "vlan", vlan)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "labels", value)

    @_builtins.property
    @pulumi.getter
    def mac(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Only non-local-admin MAC is accepted
        """
        return pulumi.get(self, "mac")

    @mac.setter
    def mac(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mac", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def notes(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "notes")

    @notes.setter
    def notes(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "notes", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter(name="radiusGroup")
    def radius_group(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "radius_group")

    @radius_group.setter
    def radius_group(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "radius_group", value)

    @_builtins.property
    @pulumi.getter
    def vlan(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "vlan")

    @vlan.setter
    def vlan(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "vlan", value)


@pulumi.type_token("junipermist:org/nacEndpoint:NacEndpoint")
class NacEndpoint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 mac: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 notes: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 radius_group: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        This resource manages the NAC Endpoints (User MACs).

        NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `org.Nactag` resource as match criteria.

        The `org.Nactag` resource can be used to create Tags regrouping one or multiple endpoint MAC Addresses, but the use of the User MACs provides additional features:
        * possibility to assign specific attributes, like a Name, a Radius Group, a VLAN ID, ...
        * possibility to assign one or multiple Tags (Labels) to a User MAC
        * improved management for large list of MAC Addresses

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        endpoint_one = junipermist.org.NacEndpoint("endpoint_one",
            mac="921b638445cd",
            labels=[
                "byod",
                "flr1",
            ],
            vlan="30",
            notes="mac address refers to Canon printers",
            name="endpoint_one",
            radius_group="VIP")
        ```

        ## Import

        Using `pulumi import`, import `mist_org_nac_endpoint` with:

        NAC Endpoint can be imported by specifying the org_id and the nac_endpoint_id

        ```sh
        $ pulumi import junipermist:org/nacEndpoint:NacEndpoint endpoint_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] mac: Only non-local-admin MAC is accepted
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NacEndpointArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the NAC Endpoints (User MACs).

        NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `org.Nactag` resource as match criteria.

        The `org.Nactag` resource can be used to create Tags regrouping one or multiple endpoint MAC Addresses, but the use of the User MACs provides additional features:
        * possibility to assign specific attributes, like a Name, a Radius Group, a VLAN ID, ...
        * possibility to assign one or multiple Tags (Labels) to a User MAC
        * improved management for large list of MAC Addresses

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        endpoint_one = junipermist.org.NacEndpoint("endpoint_one",
            mac="921b638445cd",
            labels=[
                "byod",
                "flr1",
            ],
            vlan="30",
            notes="mac address refers to Canon printers",
            name="endpoint_one",
            radius_group="VIP")
        ```

        ## Import

        Using `pulumi import`, import `mist_org_nac_endpoint` with:

        NAC Endpoint can be imported by specifying the org_id and the nac_endpoint_id

        ```sh
        $ pulumi import junipermist:org/nacEndpoint:NacEndpoint endpoint_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param NacEndpointArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NacEndpointArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 mac: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 notes: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 radius_group: Optional[pulumi.Input[_builtins.str]] = None,
                 vlan: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NacEndpointArgs.__new__(NacEndpointArgs)

            __props__.__dict__["labels"] = labels
            if mac is None and not opts.urn:
                raise TypeError("Missing required property 'mac'")
            __props__.__dict__["mac"] = mac
            __props__.__dict__["name"] = name
            __props__.__dict__["notes"] = notes
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["radius_group"] = radius_group
            __props__.__dict__["vlan"] = vlan
        super(NacEndpoint, __self__).__init__(
            'junipermist:org/nacEndpoint:NacEndpoint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            labels: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            mac: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            notes: Optional[pulumi.Input[_builtins.str]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            radius_group: Optional[pulumi.Input[_builtins.str]] = None,
            vlan: Optional[pulumi.Input[_builtins.str]] = None) -> 'NacEndpoint':
        """
        Get an existing NacEndpoint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] mac: Only non-local-admin MAC is accepted
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NacEndpointState.__new__(_NacEndpointState)

        __props__.__dict__["labels"] = labels
        __props__.__dict__["mac"] = mac
        __props__.__dict__["name"] = name
        __props__.__dict__["notes"] = notes
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["radius_group"] = radius_group
        __props__.__dict__["vlan"] = vlan
        return NacEndpoint(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Sequence[_builtins.str]]:
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def mac(self) -> pulumi.Output[_builtins.str]:
        """
        Only non-local-admin MAC is accepted
        """
        return pulumi.get(self, "mac")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def notes(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "notes")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="radiusGroup")
    def radius_group(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "radius_group")

    @_builtins.property
    @pulumi.getter
    def vlan(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "vlan")

