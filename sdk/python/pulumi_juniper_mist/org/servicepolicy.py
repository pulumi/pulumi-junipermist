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

__all__ = ['ServicepolicyArgs', 'Servicepolicy']

@pulumi.input_type
class ServicepolicyArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 action: Optional[pulumi.Input[str]] = None,
                 appqoe: Optional[pulumi.Input['ServicepolicyAppqoeArgs']] = None,
                 ewfs: Optional[pulumi.Input[Sequence[pulumi.Input['ServicepolicyEwfArgs']]]] = None,
                 idp: Optional[pulumi.Input['ServicepolicyIdpArgs']] = None,
                 local_routing: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 path_preference: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tenants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Servicepolicy resource.
        :param pulumi.Input[str] action: enum: `allow`, `deny`
        :param pulumi.Input['ServicepolicyAppqoeArgs'] appqoe: For SRX Only
        :param pulumi.Input[bool] local_routing: access within the same VRF
        :param pulumi.Input[str] path_preference: by default, we derive all paths available and use them
               optionally, you can customize by using `path_preference`
        """
        pulumi.set(__self__, "org_id", org_id)
        if action is not None:
            pulumi.set(__self__, "action", action)
        if appqoe is not None:
            pulumi.set(__self__, "appqoe", appqoe)
        if ewfs is not None:
            pulumi.set(__self__, "ewfs", ewfs)
        if idp is not None:
            pulumi.set(__self__, "idp", idp)
        if local_routing is not None:
            pulumi.set(__self__, "local_routing", local_routing)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if path_preference is not None:
            pulumi.set(__self__, "path_preference", path_preference)
        if services is not None:
            pulumi.set(__self__, "services", services)
        if tenants is not None:
            pulumi.set(__self__, "tenants", tenants)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        enum: `allow`, `deny`
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def appqoe(self) -> Optional[pulumi.Input['ServicepolicyAppqoeArgs']]:
        """
        For SRX Only
        """
        return pulumi.get(self, "appqoe")

    @appqoe.setter
    def appqoe(self, value: Optional[pulumi.Input['ServicepolicyAppqoeArgs']]):
        pulumi.set(self, "appqoe", value)

    @property
    @pulumi.getter
    def ewfs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServicepolicyEwfArgs']]]]:
        return pulumi.get(self, "ewfs")

    @ewfs.setter
    def ewfs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServicepolicyEwfArgs']]]]):
        pulumi.set(self, "ewfs", value)

    @property
    @pulumi.getter
    def idp(self) -> Optional[pulumi.Input['ServicepolicyIdpArgs']]:
        return pulumi.get(self, "idp")

    @idp.setter
    def idp(self, value: Optional[pulumi.Input['ServicepolicyIdpArgs']]):
        pulumi.set(self, "idp", value)

    @property
    @pulumi.getter(name="localRouting")
    def local_routing(self) -> Optional[pulumi.Input[bool]]:
        """
        access within the same VRF
        """
        return pulumi.get(self, "local_routing")

    @local_routing.setter
    def local_routing(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local_routing", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="pathPreference")
    def path_preference(self) -> Optional[pulumi.Input[str]]:
        """
        by default, we derive all paths available and use them
        optionally, you can customize by using `path_preference`
        """
        return pulumi.get(self, "path_preference")

    @path_preference.setter
    def path_preference(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path_preference", value)

    @property
    @pulumi.getter
    def services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "services")

    @services.setter
    def services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "services", value)

    @property
    @pulumi.getter
    def tenants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "tenants")

    @tenants.setter
    def tenants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tenants", value)


@pulumi.input_type
class _ServicepolicyState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 appqoe: Optional[pulumi.Input['ServicepolicyAppqoeArgs']] = None,
                 ewfs: Optional[pulumi.Input[Sequence[pulumi.Input['ServicepolicyEwfArgs']]]] = None,
                 idp: Optional[pulumi.Input['ServicepolicyIdpArgs']] = None,
                 local_routing: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 path_preference: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tenants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Servicepolicy resources.
        :param pulumi.Input[str] action: enum: `allow`, `deny`
        :param pulumi.Input['ServicepolicyAppqoeArgs'] appqoe: For SRX Only
        :param pulumi.Input[bool] local_routing: access within the same VRF
        :param pulumi.Input[str] path_preference: by default, we derive all paths available and use them
               optionally, you can customize by using `path_preference`
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if appqoe is not None:
            pulumi.set(__self__, "appqoe", appqoe)
        if ewfs is not None:
            pulumi.set(__self__, "ewfs", ewfs)
        if idp is not None:
            pulumi.set(__self__, "idp", idp)
        if local_routing is not None:
            pulumi.set(__self__, "local_routing", local_routing)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if path_preference is not None:
            pulumi.set(__self__, "path_preference", path_preference)
        if services is not None:
            pulumi.set(__self__, "services", services)
        if tenants is not None:
            pulumi.set(__self__, "tenants", tenants)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        enum: `allow`, `deny`
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def appqoe(self) -> Optional[pulumi.Input['ServicepolicyAppqoeArgs']]:
        """
        For SRX Only
        """
        return pulumi.get(self, "appqoe")

    @appqoe.setter
    def appqoe(self, value: Optional[pulumi.Input['ServicepolicyAppqoeArgs']]):
        pulumi.set(self, "appqoe", value)

    @property
    @pulumi.getter
    def ewfs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServicepolicyEwfArgs']]]]:
        return pulumi.get(self, "ewfs")

    @ewfs.setter
    def ewfs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServicepolicyEwfArgs']]]]):
        pulumi.set(self, "ewfs", value)

    @property
    @pulumi.getter
    def idp(self) -> Optional[pulumi.Input['ServicepolicyIdpArgs']]:
        return pulumi.get(self, "idp")

    @idp.setter
    def idp(self, value: Optional[pulumi.Input['ServicepolicyIdpArgs']]):
        pulumi.set(self, "idp", value)

    @property
    @pulumi.getter(name="localRouting")
    def local_routing(self) -> Optional[pulumi.Input[bool]]:
        """
        access within the same VRF
        """
        return pulumi.get(self, "local_routing")

    @local_routing.setter
    def local_routing(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "local_routing", value)

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
    @pulumi.getter(name="pathPreference")
    def path_preference(self) -> Optional[pulumi.Input[str]]:
        """
        by default, we derive all paths available and use them
        optionally, you can customize by using `path_preference`
        """
        return pulumi.get(self, "path_preference")

    @path_preference.setter
    def path_preference(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "path_preference", value)

    @property
    @pulumi.getter
    def services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "services")

    @services.setter
    def services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "services", value)

    @property
    @pulumi.getter
    def tenants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "tenants")

    @tenants.setter
    def tenants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tenants", value)


class Servicepolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 appqoe: Optional[pulumi.Input[Union['ServicepolicyAppqoeArgs', 'ServicepolicyAppqoeArgsDict']]] = None,
                 ewfs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServicepolicyEwfArgs', 'ServicepolicyEwfArgsDict']]]]] = None,
                 idp: Optional[pulumi.Input[Union['ServicepolicyIdpArgs', 'ServicepolicyIdpArgsDict']]] = None,
                 local_routing: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 path_preference: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tenants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        This resource manages WAN Assurance Service Policies (Application Policiess).The Service Policies are used in the `servicepolicy_policies` from the Gateway configuration and Gateway templates.They can be used to manage common policies betweeen multiples configurations

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: enum: `allow`, `deny`
        :param pulumi.Input[Union['ServicepolicyAppqoeArgs', 'ServicepolicyAppqoeArgsDict']] appqoe: For SRX Only
        :param pulumi.Input[bool] local_routing: access within the same VRF
        :param pulumi.Input[str] path_preference: by default, we derive all paths available and use them
               optionally, you can customize by using `path_preference`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServicepolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages WAN Assurance Service Policies (Application Policiess).The Service Policies are used in the `servicepolicy_policies` from the Gateway configuration and Gateway templates.They can be used to manage common policies betweeen multiples configurations

        :param str resource_name: The name of the resource.
        :param ServicepolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServicepolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 appqoe: Optional[pulumi.Input[Union['ServicepolicyAppqoeArgs', 'ServicepolicyAppqoeArgsDict']]] = None,
                 ewfs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServicepolicyEwfArgs', 'ServicepolicyEwfArgsDict']]]]] = None,
                 idp: Optional[pulumi.Input[Union['ServicepolicyIdpArgs', 'ServicepolicyIdpArgsDict']]] = None,
                 local_routing: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 path_preference: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tenants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServicepolicyArgs.__new__(ServicepolicyArgs)

            __props__.__dict__["action"] = action
            __props__.__dict__["appqoe"] = appqoe
            __props__.__dict__["ewfs"] = ewfs
            __props__.__dict__["idp"] = idp
            __props__.__dict__["local_routing"] = local_routing
            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["path_preference"] = path_preference
            __props__.__dict__["services"] = services
            __props__.__dict__["tenants"] = tenants
        super(Servicepolicy, __self__).__init__(
            'junipermist:org/servicepolicy:Servicepolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[str]] = None,
            appqoe: Optional[pulumi.Input[Union['ServicepolicyAppqoeArgs', 'ServicepolicyAppqoeArgsDict']]] = None,
            ewfs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServicepolicyEwfArgs', 'ServicepolicyEwfArgsDict']]]]] = None,
            idp: Optional[pulumi.Input[Union['ServicepolicyIdpArgs', 'ServicepolicyIdpArgsDict']]] = None,
            local_routing: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            path_preference: Optional[pulumi.Input[str]] = None,
            services: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tenants: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Servicepolicy':
        """
        Get an existing Servicepolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: enum: `allow`, `deny`
        :param pulumi.Input[Union['ServicepolicyAppqoeArgs', 'ServicepolicyAppqoeArgsDict']] appqoe: For SRX Only
        :param pulumi.Input[bool] local_routing: access within the same VRF
        :param pulumi.Input[str] path_preference: by default, we derive all paths available and use them
               optionally, you can customize by using `path_preference`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServicepolicyState.__new__(_ServicepolicyState)

        __props__.__dict__["action"] = action
        __props__.__dict__["appqoe"] = appqoe
        __props__.__dict__["ewfs"] = ewfs
        __props__.__dict__["idp"] = idp
        __props__.__dict__["local_routing"] = local_routing
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["path_preference"] = path_preference
        __props__.__dict__["services"] = services
        __props__.__dict__["tenants"] = tenants
        return Servicepolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        enum: `allow`, `deny`
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def appqoe(self) -> pulumi.Output[Optional['outputs.ServicepolicyAppqoe']]:
        """
        For SRX Only
        """
        return pulumi.get(self, "appqoe")

    @property
    @pulumi.getter
    def ewfs(self) -> pulumi.Output[Optional[Sequence['outputs.ServicepolicyEwf']]]:
        return pulumi.get(self, "ewfs")

    @property
    @pulumi.getter
    def idp(self) -> pulumi.Output[Optional['outputs.ServicepolicyIdp']]:
        return pulumi.get(self, "idp")

    @property
    @pulumi.getter(name="localRouting")
    def local_routing(self) -> pulumi.Output[bool]:
        """
        access within the same VRF
        """
        return pulumi.get(self, "local_routing")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="pathPreference")
    def path_preference(self) -> pulumi.Output[Optional[str]]:
        """
        by default, we derive all paths available and use them
        optionally, you can customize by using `path_preference`
        """
        return pulumi.get(self, "path_preference")

    @property
    @pulumi.getter
    def services(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "services")

    @property
    @pulumi.getter
    def tenants(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "tenants")

