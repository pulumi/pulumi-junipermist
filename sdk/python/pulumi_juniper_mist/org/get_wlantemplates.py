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

__all__ = [
    'GetWlantemplatesResult',
    'AwaitableGetWlantemplatesResult',
    'get_wlantemplates',
    'get_wlantemplates_output',
]

@pulumi.output_type
class GetWlantemplatesResult:
    """
    A collection of values returned by getWlantemplates.
    """
    def __init__(__self__, id=None, org_id=None, org_wlantemplates=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_wlantemplates and not isinstance(org_wlantemplates, list):
            raise TypeError("Expected argument 'org_wlantemplates' to be a list")
        pulumi.set(__self__, "org_wlantemplates", org_wlantemplates)

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
    @pulumi.getter(name="orgWlantemplates")
    def org_wlantemplates(self) -> Sequence['outputs.GetWlantemplatesOrgWlantemplateResult']:
        return pulumi.get(self, "org_wlantemplates")


class AwaitableGetWlantemplatesResult(GetWlantemplatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWlantemplatesResult(
            id=self.id,
            org_id=self.org_id,
            org_wlantemplates=self.org_wlantemplates)


def get_wlantemplates(org_id: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWlantemplatesResult:
    """
    This datasource provides the list of WLAN Templates in a Mist Organization.
    A WLAN template is a collection of WLANs, tunneling policies, and wxlan policies. It is used to create and manage wlan configurations at an organizational level. WLAN templates allow for modular, scalable, and easy-to-manage configuration of ssids and their application to specific sites, site groups, or ap device profiles. They are valuable for automating configuration across multiple sites and profiles, making it easier to scale efficiently.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    templates = junipermist.org.get_wlantemplates(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getWlantemplates:getWlantemplates', __args__, opts=opts, typ=GetWlantemplatesResult).value

    return AwaitableGetWlantemplatesResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_wlantemplates=pulumi.get(__ret__, 'org_wlantemplates'))


@_utilities.lift_output_func(get_wlantemplates)
def get_wlantemplates_output(org_id: Optional[pulumi.Input[str]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWlantemplatesResult]:
    """
    This datasource provides the list of WLAN Templates in a Mist Organization.
    A WLAN template is a collection of WLANs, tunneling policies, and wxlan policies. It is used to create and manage wlan configurations at an organizational level. WLAN templates allow for modular, scalable, and easy-to-manage configuration of ssids and their application to specific sites, site groups, or ap device profiles. They are valuable for automating configuration across multiple sites and profiles, making it easier to scale efficiently.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    templates = junipermist.org.get_wlantemplates(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    ...
