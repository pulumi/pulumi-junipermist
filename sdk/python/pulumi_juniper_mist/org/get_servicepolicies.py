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
    'GetServicepoliciesResult',
    'AwaitableGetServicepoliciesResult',
    'get_servicepolicies',
    'get_servicepolicies_output',
]

@pulumi.output_type
class GetServicepoliciesResult:
    """
    A collection of values returned by getServicepolicies.
    """
    def __init__(__self__, id=None, org_id=None, org_servicepolicies=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_servicepolicies and not isinstance(org_servicepolicies, list):
            raise TypeError("Expected argument 'org_servicepolicies' to be a list")
        pulumi.set(__self__, "org_servicepolicies", org_servicepolicies)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> _builtins.str:
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="orgServicepolicies")
    def org_servicepolicies(self) -> Sequence['outputs.GetServicepoliciesOrgServicepolicyResult']:
        return pulumi.get(self, "org_servicepolicies")


class AwaitableGetServicepoliciesResult(GetServicepoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServicepoliciesResult(
            id=self.id,
            org_id=self.org_id,
            org_servicepolicies=self.org_servicepolicies)


def get_servicepolicies(org_id: Optional[_builtins.str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServicepoliciesResult:
    """
    This data source provides the list of WAN Assurance Service Policies (Application Policies).

    The Service Policies can be used in the `service_policies` object by referencing the Service Policy ID as the `servicepolicy_id` in:
    * the Gateway configuration (`mist_device_gateway.service_policies`)
    * the Gateway Templates (`mist_org_gatewaytemplate.service_policies`)
    * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies`)
      They can be used to manage common policies between multiples configurations

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    servicepolicies = junipermist.org.get_servicepolicies(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getServicepolicies:getServicepolicies', __args__, opts=opts, typ=GetServicepoliciesResult).value

    return AwaitableGetServicepoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_servicepolicies=pulumi.get(__ret__, 'org_servicepolicies'))
def get_servicepolicies_output(org_id: Optional[pulumi.Input[_builtins.str]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServicepoliciesResult]:
    """
    This data source provides the list of WAN Assurance Service Policies (Application Policies).

    The Service Policies can be used in the `service_policies` object by referencing the Service Policy ID as the `servicepolicy_id` in:
    * the Gateway configuration (`mist_device_gateway.service_policies`)
    * the Gateway Templates (`mist_org_gatewaytemplate.service_policies`)
    * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies`)
      They can be used to manage common policies between multiples configurations

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    servicepolicies = junipermist.org.get_servicepolicies(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:org/getServicepolicies:getServicepolicies', __args__, opts=opts, typ=GetServicepoliciesResult)
    return __ret__.apply(lambda __response__: GetServicepoliciesResult(
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        org_servicepolicies=pulumi.get(__response__, 'org_servicepolicies')))
