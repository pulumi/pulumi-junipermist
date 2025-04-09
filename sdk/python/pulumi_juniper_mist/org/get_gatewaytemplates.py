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
    'GetGatewaytemplatesResult',
    'AwaitableGetGatewaytemplatesResult',
    'get_gatewaytemplates',
    'get_gatewaytemplates_output',
]

@pulumi.output_type
class GetGatewaytemplatesResult:
    """
    A collection of values returned by getGatewaytemplates.
    """
    def __init__(__self__, id=None, org_gatewaytemplates=None, org_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_gatewaytemplates and not isinstance(org_gatewaytemplates, list):
            raise TypeError("Expected argument 'org_gatewaytemplates' to be a list")
        pulumi.set(__self__, "org_gatewaytemplates", org_gatewaytemplates)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="orgGatewaytemplates")
    def org_gatewaytemplates(self) -> Sequence['outputs.GetGatewaytemplatesOrgGatewaytemplateResult']:
        return pulumi.get(self, "org_gatewaytemplates")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")


class AwaitableGetGatewaytemplatesResult(GetGatewaytemplatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGatewaytemplatesResult(
            id=self.id,
            org_gatewaytemplates=self.org_gatewaytemplates,
            org_id=self.org_id)


def get_gatewaytemplates(org_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewaytemplatesResult:
    """
    This data source provides the list of Gateway Templates.

    A Gateway template can be used to define generic gateway configuration at the org level and be applied to one or multiple Sites. It works like a blueprint of the network of the site.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    templates = junipermist.org.get_gatewaytemplates(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getGatewaytemplates:getGatewaytemplates', __args__, opts=opts, typ=GetGatewaytemplatesResult).value

    return AwaitableGetGatewaytemplatesResult(
        id=pulumi.get(__ret__, 'id'),
        org_gatewaytemplates=pulumi.get(__ret__, 'org_gatewaytemplates'),
        org_id=pulumi.get(__ret__, 'org_id'))
def get_gatewaytemplates_output(org_id: Optional[pulumi.Input[str]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetGatewaytemplatesResult]:
    """
    This data source provides the list of Gateway Templates.

    A Gateway template can be used to define generic gateway configuration at the org level and be applied to one or multiple Sites. It works like a blueprint of the network of the site.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    templates = junipermist.org.get_gatewaytemplates(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:org/getGatewaytemplates:getGatewaytemplates', __args__, opts=opts, typ=GetGatewaytemplatesResult)
    return __ret__.apply(lambda __response__: GetGatewaytemplatesResult(
        id=pulumi.get(__response__, 'id'),
        org_gatewaytemplates=pulumi.get(__response__, 'org_gatewaytemplates'),
        org_id=pulumi.get(__response__, 'org_id')))
