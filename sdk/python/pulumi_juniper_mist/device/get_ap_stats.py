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
    'GetApStatsResult',
    'AwaitableGetApStatsResult',
    'get_ap_stats',
    'get_ap_stats_output',
]

@pulumi.output_type
class GetApStatsResult:
    """
    A collection of values returned by getApStats.
    """
    def __init__(__self__, device_ap_stats=None, duration=None, end=None, id=None, mac=None, org_id=None, site_id=None, start=None, status=None):
        if device_ap_stats and not isinstance(device_ap_stats, list):
            raise TypeError("Expected argument 'device_ap_stats' to be a list")
        pulumi.set(__self__, "device_ap_stats", device_ap_stats)
        if duration and not isinstance(duration, str):
            raise TypeError("Expected argument 'duration' to be a str")
        pulumi.set(__self__, "duration", duration)
        if end and not isinstance(end, int):
            raise TypeError("Expected argument 'end' to be a int")
        pulumi.set(__self__, "end", end)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mac and not isinstance(mac, str):
            raise TypeError("Expected argument 'mac' to be a str")
        pulumi.set(__self__, "mac", mac)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if site_id and not isinstance(site_id, str):
            raise TypeError("Expected argument 'site_id' to be a str")
        pulumi.set(__self__, "site_id", site_id)
        if start and not isinstance(start, int):
            raise TypeError("Expected argument 'start' to be a int")
        pulumi.set(__self__, "start", start)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="deviceApStats")
    def device_ap_stats(self) -> Sequence['outputs.GetApStatsDeviceApStatResult']:
        return pulumi.get(self, "device_ap_stats")

    @property
    @pulumi.getter
    def duration(self) -> Optional[builtins.str]:
        """
        duration like 7d, 2w
        """
        return pulumi.get(self, "duration")

    @property
    @pulumi.getter
    def end(self) -> Optional[builtins.int]:
        """
        end datetime, can be epoch or relative time like -1d, -2h; now if not specified
        """
        return pulumi.get(self, "end")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def mac(self) -> Optional[builtins.str]:
        return pulumi.get(self, "mac")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> builtins.str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> Optional[builtins.str]:
        return pulumi.get(self, "site_id")

    @property
    @pulumi.getter
    def start(self) -> Optional[builtins.int]:
        """
        start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
        """
        return pulumi.get(self, "start")

    @property
    @pulumi.getter
    def status(self) -> Optional[builtins.str]:
        return pulumi.get(self, "status")


class AwaitableGetApStatsResult(GetApStatsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApStatsResult(
            device_ap_stats=self.device_ap_stats,
            duration=self.duration,
            end=self.end,
            id=self.id,
            mac=self.mac,
            org_id=self.org_id,
            site_id=self.site_id,
            start=self.start,
            status=self.status)


def get_ap_stats(duration: Optional[builtins.str] = None,
                 end: Optional[builtins.int] = None,
                 mac: Optional[builtins.str] = None,
                 org_id: Optional[builtins.str] = None,
                 site_id: Optional[builtins.str] = None,
                 start: Optional[builtins.int] = None,
                 status: Optional[builtins.str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApStatsResult:
    """
    This data source provides the list of Wireless Access Points with their statistics.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    ap_stats = junipermist.device.get_ap_stats(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        mac="5c5b35000000",
        site_id="4a422ae5-7ca0-4599-87a3-8e49aa63685f",
        status="connected",
        duration="1d",
        start=1736031600,
        end=1736175934)
    ```


    :param builtins.str duration: duration like 7d, 2w
    :param builtins.int end: end datetime, can be epoch or relative time like -1d, -2h; now if not specified
    :param builtins.int start: start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
    """
    __args__ = dict()
    __args__['duration'] = duration
    __args__['end'] = end
    __args__['mac'] = mac
    __args__['orgId'] = org_id
    __args__['siteId'] = site_id
    __args__['start'] = start
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:device/getApStats:getApStats', __args__, opts=opts, typ=GetApStatsResult).value

    return AwaitableGetApStatsResult(
        device_ap_stats=pulumi.get(__ret__, 'device_ap_stats'),
        duration=pulumi.get(__ret__, 'duration'),
        end=pulumi.get(__ret__, 'end'),
        id=pulumi.get(__ret__, 'id'),
        mac=pulumi.get(__ret__, 'mac'),
        org_id=pulumi.get(__ret__, 'org_id'),
        site_id=pulumi.get(__ret__, 'site_id'),
        start=pulumi.get(__ret__, 'start'),
        status=pulumi.get(__ret__, 'status'))
def get_ap_stats_output(duration: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                        end: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                        mac: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                        org_id: Optional[pulumi.Input[builtins.str]] = None,
                        site_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                        start: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                        status: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetApStatsResult]:
    """
    This data source provides the list of Wireless Access Points with their statistics.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    ap_stats = junipermist.device.get_ap_stats(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        mac="5c5b35000000",
        site_id="4a422ae5-7ca0-4599-87a3-8e49aa63685f",
        status="connected",
        duration="1d",
        start=1736031600,
        end=1736175934)
    ```


    :param builtins.str duration: duration like 7d, 2w
    :param builtins.int end: end datetime, can be epoch or relative time like -1d, -2h; now if not specified
    :param builtins.int start: start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
    """
    __args__ = dict()
    __args__['duration'] = duration
    __args__['end'] = end
    __args__['mac'] = mac
    __args__['orgId'] = org_id
    __args__['siteId'] = site_id
    __args__['start'] = start
    __args__['status'] = status
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:device/getApStats:getApStats', __args__, opts=opts, typ=GetApStatsResult)
    return __ret__.apply(lambda __response__: GetApStatsResult(
        device_ap_stats=pulumi.get(__response__, 'device_ap_stats'),
        duration=pulumi.get(__response__, 'duration'),
        end=pulumi.get(__response__, 'end'),
        id=pulumi.get(__response__, 'id'),
        mac=pulumi.get(__response__, 'mac'),
        org_id=pulumi.get(__response__, 'org_id'),
        site_id=pulumi.get(__response__, 'site_id'),
        start=pulumi.get(__response__, 'start'),
        status=pulumi.get(__response__, 'status')))
