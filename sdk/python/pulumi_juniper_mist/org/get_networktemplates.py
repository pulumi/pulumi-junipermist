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
    'GetNetworktemplatesResult',
    'AwaitableGetNetworktemplatesResult',
    'get_networktemplates',
    'get_networktemplates_output',
]

@pulumi.output_type
class GetNetworktemplatesResult:
    """
    A collection of values returned by getNetworktemplates.
    """
    def __init__(__self__, id=None, org_id=None, org_networktemplates=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_networktemplates and not isinstance(org_networktemplates, list):
            raise TypeError("Expected argument 'org_networktemplates' to be a list")
        pulumi.set(__self__, "org_networktemplates", org_networktemplates)

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
    @pulumi.getter(name="orgNetworktemplates")
    def org_networktemplates(self) -> Sequence['outputs.GetNetworktemplatesOrgNetworktemplateResult']:
        return pulumi.get(self, "org_networktemplates")


class AwaitableGetNetworktemplatesResult(GetNetworktemplatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworktemplatesResult(
            id=self.id,
            org_id=self.org_id,
            org_networktemplates=self.org_networktemplates)


def get_networktemplates(org_id: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworktemplatesResult:
    """
    This data source provides the list of Org Network Templates (Switch templates).

    A network template is a predefined configuration that provides a consistent and reusable set of network settings for devices within an organization. It includes various parameters such as ip addressing, vlan configurations, routing protocols, security policies, and other network-specific settings.\\
    Network templates simplify the deployment and management of switches by ensuring consistent configurations across multiple devices and sites. They help enforce standardization, reduce human error, and streamline troubleshooting and maintenance tasks.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    templates = junipermist.org.get_networktemplates(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getNetworktemplates:getNetworktemplates', __args__, opts=opts, typ=GetNetworktemplatesResult).value

    return AwaitableGetNetworktemplatesResult(
        id=pulumi.get(__ret__, 'id'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_networktemplates=pulumi.get(__ret__, 'org_networktemplates'))
def get_networktemplates_output(org_id: Optional[pulumi.Input[_builtins.str]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworktemplatesResult]:
    """
    This data source provides the list of Org Network Templates (Switch templates).

    A network template is a predefined configuration that provides a consistent and reusable set of network settings for devices within an organization. It includes various parameters such as ip addressing, vlan configurations, routing protocols, security policies, and other network-specific settings.\\
    Network templates simplify the deployment and management of switches by ensuring consistent configurations across multiple devices and sites. They help enforce standardization, reduce human error, and streamline troubleshooting and maintenance tasks.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    templates = junipermist.org.get_networktemplates(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:org/getNetworktemplates:getNetworktemplates', __args__, opts=opts, typ=GetNetworktemplatesResult)
    return __ret__.apply(lambda __response__: GetNetworktemplatesResult(
        id=pulumi.get(__response__, 'id'),
        org_id=pulumi.get(__response__, 'org_id'),
        org_networktemplates=pulumi.get(__response__, 'org_networktemplates')))
