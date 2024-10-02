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

__all__ = ['SsoRoleArgs', 'SsoRole']

@pulumi.input_type
class SsoRoleArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 privileges: pulumi.Input[Sequence[pulumi.Input['SsoRolePrivilegeArgs']]],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SsoRole resource.
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "privileges", privileges)
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
    def privileges(self) -> pulumi.Input[Sequence[pulumi.Input['SsoRolePrivilegeArgs']]]:
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: pulumi.Input[Sequence[pulumi.Input['SsoRolePrivilegeArgs']]]):
        pulumi.set(self, "privileges", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SsoRoleState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input['SsoRolePrivilegeArgs']]]] = None):
        """
        Input properties used for looking up and filtering SsoRole resources.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)

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
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SsoRolePrivilegeArgs']]]]:
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SsoRolePrivilegeArgs']]]]):
        pulumi.set(self, "privileges", value)


class SsoRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SsoRolePrivilegeArgs', 'SsoRolePrivilegeArgsDict']]]]] = None,
                 __props__=None):
        """
        This resource manages Org SSO Roles for Admin Authantication.
        SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.
        These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.
        Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects..

        ## Import

        Using `pulumi import`, import `mist_org_sso_role` with:

        Org PSK can be imported by specifying the org_id and the sso_role_id

        ```sh
        $ pulumi import junipermist:org/ssoRole:SsoRole sso_role_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SsoRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages Org SSO Roles for Admin Authantication.
        SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.
        These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.
        Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects..

        ## Import

        Using `pulumi import`, import `mist_org_sso_role` with:

        Org PSK can be imported by specifying the org_id and the sso_role_id

        ```sh
        $ pulumi import junipermist:org/ssoRole:SsoRole sso_role_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param SsoRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SsoRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SsoRolePrivilegeArgs', 'SsoRolePrivilegeArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SsoRoleArgs.__new__(SsoRoleArgs)

            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if privileges is None and not opts.urn:
                raise TypeError("Missing required property 'privileges'")
            __props__.__dict__["privileges"] = privileges
        super(SsoRole, __self__).__init__(
            'junipermist:org/ssoRole:SsoRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            privileges: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SsoRolePrivilegeArgs', 'SsoRolePrivilegeArgsDict']]]]] = None) -> 'SsoRole':
        """
        Get an existing SsoRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SsoRoleState.__new__(_SsoRoleState)

        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["privileges"] = privileges
        return SsoRole(resource_name, opts=opts, __props__=__props__)

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
    def privileges(self) -> pulumi.Output[Sequence['outputs.SsoRolePrivilege']]:
        return pulumi.get(self, "privileges")
