# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSsoMetadataResult',
    'AwaitableGetSsoMetadataResult',
    'get_sso_metadata',
    'get_sso_metadata_output',
]

@pulumi.output_type
class GetSsoMetadataResult:
    """
    A collection of values returned by getSsoMetadata.
    """
    def __init__(__self__, acs_url=None, entity_id=None, id=None, logout_url=None, metadata=None, org_id=None, sso_id=None):
        if acs_url and not isinstance(acs_url, str):
            raise TypeError("Expected argument 'acs_url' to be a str")
        pulumi.set(__self__, "acs_url", acs_url)
        if entity_id and not isinstance(entity_id, str):
            raise TypeError("Expected argument 'entity_id' to be a str")
        pulumi.set(__self__, "entity_id", entity_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if logout_url and not isinstance(logout_url, str):
            raise TypeError("Expected argument 'logout_url' to be a str")
        pulumi.set(__self__, "logout_url", logout_url)
        if metadata and not isinstance(metadata, str):
            raise TypeError("Expected argument 'metadata' to be a str")
        pulumi.set(__self__, "metadata", metadata)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if sso_id and not isinstance(sso_id, str):
            raise TypeError("Expected argument 'sso_id' to be a str")
        pulumi.set(__self__, "sso_id", sso_id)

    @property
    @pulumi.getter(name="acsUrl")
    def acs_url(self) -> str:
        return pulumi.get(self, "acs_url")

    @property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> str:
        return pulumi.get(self, "entity_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="logoutUrl")
    def logout_url(self) -> str:
        return pulumi.get(self, "logout_url")

    @property
    @pulumi.getter
    def metadata(self) -> str:
        return pulumi.get(self, "metadata")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="ssoId")
    def sso_id(self) -> str:
        return pulumi.get(self, "sso_id")


class AwaitableGetSsoMetadataResult(GetSsoMetadataResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSsoMetadataResult(
            acs_url=self.acs_url,
            entity_id=self.entity_id,
            id=self.id,
            logout_url=self.logout_url,
            metadata=self.metadata,
            org_id=self.org_id,
            sso_id=self.sso_id)


def get_sso_metadata(org_id: Optional[str] = None,
                     sso_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSsoMetadataResult:
    """
    This data source provides the SSO Metadata information.
    The provided information (`entity_id`, `acs_url`, `logout_url` and `metadata`) are the informationrequired to configure the IDP

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    sso_idp = junipermist.org.get_sso_metadata(org_id=terraform_test["id"],
        sso_id=sso_one["id"])
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    __args__['ssoId'] = sso_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getSsoMetadata:getSsoMetadata', __args__, opts=opts, typ=GetSsoMetadataResult).value

    return AwaitableGetSsoMetadataResult(
        acs_url=pulumi.get(__ret__, 'acs_url'),
        entity_id=pulumi.get(__ret__, 'entity_id'),
        id=pulumi.get(__ret__, 'id'),
        logout_url=pulumi.get(__ret__, 'logout_url'),
        metadata=pulumi.get(__ret__, 'metadata'),
        org_id=pulumi.get(__ret__, 'org_id'),
        sso_id=pulumi.get(__ret__, 'sso_id'))


@_utilities.lift_output_func(get_sso_metadata)
def get_sso_metadata_output(org_id: Optional[pulumi.Input[str]] = None,
                            sso_id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSsoMetadataResult]:
    """
    This data source provides the SSO Metadata information.
    The provided information (`entity_id`, `acs_url`, `logout_url` and `metadata`) are the informationrequired to configure the IDP

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    sso_idp = junipermist.org.get_sso_metadata(org_id=terraform_test["id"],
        sso_id=sso_one["id"])
    ```
    """
    ...
