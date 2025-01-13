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
from . import _utilities
from . import outputs

__all__ = [
    'GetConstWebhooksResult',
    'AwaitableGetConstWebhooksResult',
    'get_const_webhooks',
    'get_const_webhooks_output',
]

@pulumi.output_type
class GetConstWebhooksResult:
    """
    A collection of values returned by getConstWebhooks.
    """
    def __init__(__self__, const_webhooks=None, id=None):
        if const_webhooks and not isinstance(const_webhooks, list):
            raise TypeError("Expected argument 'const_webhooks' to be a list")
        pulumi.set(__self__, "const_webhooks", const_webhooks)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="constWebhooks")
    def const_webhooks(self) -> Sequence['outputs.GetConstWebhooksConstWebhookResult']:
        return pulumi.get(self, "const_webhooks")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetConstWebhooksResult(GetConstWebhooksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConstWebhooksResult(
            const_webhooks=self.const_webhooks,
            id=self.id)


def get_const_webhooks(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConstWebhooksResult:
    """
    This data source provides the list of Webhook Topics.

    This information can be used to configure webhooks at the Org level (`org.Webhook` resource) or at the Site level (`site.Webhook` resource).

    > Only the Webhook topics with `for_org`==`  true ` are supported at the Org level.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_webhooks = junipermist.get_const_webhooks()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:index/getConstWebhooks:getConstWebhooks', __args__, opts=opts, typ=GetConstWebhooksResult).value

    return AwaitableGetConstWebhooksResult(
        const_webhooks=pulumi.get(__ret__, 'const_webhooks'),
        id=pulumi.get(__ret__, 'id'))
def get_const_webhooks_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetConstWebhooksResult]:
    """
    This data source provides the list of Webhook Topics.

    This information can be used to configure webhooks at the Org level (`org.Webhook` resource) or at the Site level (`site.Webhook` resource).

    > Only the Webhook topics with `for_org`==`  true ` are supported at the Org level.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_webhooks = junipermist.get_const_webhooks()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:index/getConstWebhooks:getConstWebhooks', __args__, opts=opts, typ=GetConstWebhooksResult)
    return __ret__.apply(lambda __response__: GetConstWebhooksResult(
        const_webhooks=pulumi.get(__response__, 'const_webhooks'),
        id=pulumi.get(__response__, 'id')))
