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

__all__ = [
    'GetSsoRolesResult',
    'AwaitableGetSsoRolesResult',
    'get_sso_roles',
    'get_sso_roles_output',
]

@pulumi.output_type
class GetSsoRolesResult:
    """
    A collection of values returned by getSsoRoles.
    """
    def __init__(__self__, id=None, org_id=None, org_sso_roles=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_sso_roles and not isinstance(org_sso_roles, list):
            raise TypeError("Expected argument 'org_sso_roles' to be a list")
        pulumi.set(__self__, "org_sso_roles", org_sso_roles)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="orgSsoRoles")
    def org_sso_roles(self) -> Sequence['outputs.GetSsoRolesOrgSsoRoleResult']:
        return pulumi.get(self, "org_sso_roles")


class AwaitableGetSsoRolesResult(GetSsoRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSsoRolesResult(
            id=self.id,
            org_id=self.org_id,
            org_sso_roles=self.org_sso_roles)


def get_sso_roles(org_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSsoRolesResult:
    """
    This resource provides the list of SSO Roles.

    SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.\\
    These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.\\
    Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    sso_roles = junipermist.org.get_sso_roles(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getSsoRoles:getSsoRoles', __args__, opts=opts, typ=GetSsoRolesResult).value

    return AwaitableGetSsoRolesResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_sso_roles=pulumi.get(__ret__, 'org_sso_roles'))
def get_sso_roles_output(org_id: Optional[pulumi.Input[str]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSsoRolesResult]:
    """
    This resource provides the list of SSO Roles.

    SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.\\
    These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.\\
    Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    sso_roles = junipermist.org.get_sso_roles(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:org/getSsoRoles:getSsoRoles', __args__, opts=opts, typ=GetSsoRolesResult)
    return __ret__.apply(lambda __response__: GetSsoRolesResult(
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        org_sso_roles=pulumi.get(__response__, 'org_sso_roles')))
