# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['VpnArgs', 'Vpn']

@pulumi.input_type
class VpnArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 paths: pulumi.Input[Mapping[str, pulumi.Input['VpnPathsArgs']]],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Vpn resource.
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "paths", paths)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def paths(self) -> pulumi.Input[Mapping[str, pulumi.Input['VpnPathsArgs']]]:
        return pulumi.get(self, "paths")

    @paths.setter
    def paths(self, value: pulumi.Input[Mapping[str, pulumi.Input['VpnPathsArgs']]]):
        pulumi.set(self, "paths", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _VpnState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 paths: Optional[pulumi.Input[Mapping[str, pulumi.Input['VpnPathsArgs']]]] = None):
        """
        Input properties used for looking up and filtering Vpn resources.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if paths is not None:
            pulumi.set(__self__, "paths", paths)

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
    @pulumi.getter
    def paths(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['VpnPathsArgs']]]]:
        return pulumi.get(self, "paths")

    @paths.setter
    def paths(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['VpnPathsArgs']]]]):
        pulumi.set(self, "paths", value)


class Vpn(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 paths: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['VpnPathsArgs', 'VpnPathsArgsDict']]]]] = None,
                 __props__=None):
        """
        This resource manages the Org VPN.

        ## Import

        Using `pulumi import`, import `mist_org_vpn` with:

        Org VPN can be imported by specifying the org_id and the vpn_id

        ```sh
        $ pulumi import junipermist:org/vpn:Vpn vpn_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpnArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the Org VPN.

        ## Import

        Using `pulumi import`, import `mist_org_vpn` with:

        Org VPN can be imported by specifying the org_id and the vpn_id

        ```sh
        $ pulumi import junipermist:org/vpn:Vpn vpn_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param VpnArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpnArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 paths: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['VpnPathsArgs', 'VpnPathsArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpnArgs.__new__(VpnArgs)

            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if paths is None and not opts.urn:
                raise TypeError("Missing required property 'paths'")
            __props__.__dict__["paths"] = paths
        super(Vpn, __self__).__init__(
            'junipermist:org/vpn:Vpn',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            paths: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['VpnPathsArgs', 'VpnPathsArgsDict']]]]] = None) -> 'Vpn':
        """
        Get an existing Vpn resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpnState.__new__(_VpnState)

        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["paths"] = paths
        return Vpn(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def paths(self) -> pulumi.Output[Mapping[str, 'outputs.VpnPaths']]:
        return pulumi.get(self, "paths")

