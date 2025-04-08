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
from . import _utilities
from . import outputs

__all__ = [
    'GetSitesResult',
    'AwaitableGetSitesResult',
    'get_sites',
    'get_sites_output',
]

@pulumi.output_type
class GetSitesResult:
    """
    A collection of values returned by getSites.
    """
    def __init__(__self__, id=None, org_id=None, sites=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if sites and not isinstance(sites, list):
            raise TypeError("Expected argument 'sites' to be a list")
        pulumi.set(__self__, "sites", sites)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> builtins.str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def sites(self) -> Sequence['outputs.GetSitesSiteResult']:
        return pulumi.get(self, "sites")


class AwaitableGetSitesResult(GetSitesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSitesResult(
            id=self.id,
            org_id=self.org_id,
            sites=self.sites)


def get_sites(org_id: Optional[builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSitesResult:
    """
    This datasource provides the list of sites in a Mist Organization.
    A site represents a project, a deployment. A site contains a set of Maps, Wlans, Policies, Zones, ...

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    sites = junipermist.get_sites(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:index/getSites:getSites', __args__, opts=opts, typ=GetSitesResult).value

    return AwaitableGetSitesResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        sites=pulumi.get(__ret__, 'sites'))
def get_sites_output(org_id: Optional[pulumi.Input[builtins.str]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSitesResult]:
    """
    This datasource provides the list of sites in a Mist Organization.
    A site represents a project, a deployment. A site contains a set of Maps, Wlans, Policies, Zones, ...

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    sites = junipermist.get_sites(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:index/getSites:getSites', __args__, opts=opts, typ=GetSitesResult)
    return __ret__.apply(lambda __response__: GetSitesResult(
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        sites=pulumi.get(__response__, 'sites')))
