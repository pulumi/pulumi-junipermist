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

__all__ = [
    'GetEvpnTopologiesResult',
    'AwaitableGetEvpnTopologiesResult',
    'get_evpn_topologies',
    'get_evpn_topologies_output',
]

@pulumi.output_type
class GetEvpnTopologiesResult:
    """
    A collection of values returned by getEvpnTopologies.
    """
    def __init__(__self__, id=None, site_evpn_topologies=None, site_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if site_evpn_topologies and not isinstance(site_evpn_topologies, list):
            raise TypeError("Expected argument 'site_evpn_topologies' to be a list")
        pulumi.set(__self__, "site_evpn_topologies", site_evpn_topologies)
        if site_id and not isinstance(site_id, str):
            raise TypeError("Expected argument 'site_id' to be a str")
        pulumi.set(__self__, "site_id", site_id)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="siteEvpnTopologies")
    def site_evpn_topologies(self) -> Sequence['outputs.GetEvpnTopologiesSiteEvpnTopologyResult']:
        return pulumi.get(self, "site_evpn_topologies")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> builtins.str:
        return pulumi.get(self, "site_id")


class AwaitableGetEvpnTopologiesResult(GetEvpnTopologiesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEvpnTopologiesResult(
            id=self.id,
            site_evpn_topologies=self.site_evpn_topologies,
            site_id=self.site_id)


def get_evpn_topologies(site_id: Optional[builtins.str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEvpnTopologiesResult:
    """
    This data source provides the list of Site Evpn Topologies

    EVPN allows an alternative but more efficient LAN architecture utilizing VxLAN / MP-BGP to separate the control plane (MAC / IP Learning) from the forwarding plane.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    site_evpn_topologies = junipermist.site.get_evpn_topologies(site_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['siteId'] = site_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:site/getEvpnTopologies:getEvpnTopologies', __args__, opts=opts, typ=GetEvpnTopologiesResult).value

    return AwaitableGetEvpnTopologiesResult(
        id=pulumi.get(__ret__, 'id'),
        site_evpn_topologies=pulumi.get(__ret__, 'site_evpn_topologies'),
        site_id=pulumi.get(__ret__, 'site_id'))
def get_evpn_topologies_output(site_id: Optional[pulumi.Input[builtins.str]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetEvpnTopologiesResult]:
    """
    This data source provides the list of Site Evpn Topologies

    EVPN allows an alternative but more efficient LAN architecture utilizing VxLAN / MP-BGP to separate the control plane (MAC / IP Learning) from the forwarding plane.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    site_evpn_topologies = junipermist.site.get_evpn_topologies(site_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['siteId'] = site_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:site/getEvpnTopologies:getEvpnTopologies', __args__, opts=opts, typ=GetEvpnTopologiesResult)
    return __ret__.apply(lambda __response__: GetEvpnTopologiesResult(
        id=pulumi.get(__response__, 'id'),
        site_evpn_topologies=pulumi.get(__response__, 'site_evpn_topologies'),
        site_id=pulumi.get(__response__, 'site_id')))
