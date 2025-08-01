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
from . import outputs

__all__ = [
    'GetWlansResult',
    'AwaitableGetWlansResult',
    'get_wlans',
    'get_wlans_output',
]

@pulumi.output_type
class GetWlansResult:
    """
    A collection of values returned by getWlans.
    """
    def __init__(__self__, id=None, site_id=None, site_wlans=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if site_id and not isinstance(site_id, str):
            raise TypeError("Expected argument 'site_id' to be a str")
        pulumi.set(__self__, "site_id", site_id)
        if site_wlans and not isinstance(site_wlans, list):
            raise TypeError("Expected argument 'site_wlans' to be a list")
        pulumi.set(__self__, "site_wlans", site_wlans)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="siteId")
    def site_id(self) -> _builtins.str:
        return pulumi.get(self, "site_id")

    @_builtins.property
    @pulumi.getter(name="siteWlans")
    def site_wlans(self) -> Sequence['outputs.GetWlansSiteWlanResult']:
        return pulumi.get(self, "site_wlans")


class AwaitableGetWlansResult(GetWlansResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWlansResult(
            id=self.id,
            site_id=self.site_id,
            site_wlans=self.site_wlans)


def get_wlans(site_id: Optional[_builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWlansResult:
    """
    This data source provides the list of Site Wlans.

    The WLAN object contains all the required configuration to broadcast an SSID (Authentication, VLAN, ...)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    site_wlans = junipermist.site.get_wlans(site_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['siteId'] = site_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:site/getWlans:getWlans', __args__, opts=opts, typ=GetWlansResult).value

    return AwaitableGetWlansResult(
        id=pulumi.get(__ret__, 'id'),
        site_id=pulumi.get(__ret__, 'site_id'),
        site_wlans=pulumi.get(__ret__, 'site_wlans'))
def get_wlans_output(site_id: Optional[pulumi.Input[_builtins.str]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetWlansResult]:
    """
    This data source provides the list of Site Wlans.

    The WLAN object contains all the required configuration to broadcast an SSID (Authentication, VLAN, ...)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    site_wlans = junipermist.site.get_wlans(site_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['siteId'] = site_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:site/getWlans:getWlans', __args__, opts=opts, typ=GetWlansResult)
    return __ret__.apply(lambda __response__: GetWlansResult(
        id=pulumi.get(__response__, 'id'),
        site_id=pulumi.get(__response__, 'site_id'),
        site_wlans=pulumi.get(__response__, 'site_wlans')))
