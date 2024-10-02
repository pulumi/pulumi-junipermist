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
    'GetWebhooksResult',
    'AwaitableGetWebhooksResult',
    'get_webhooks',
    'get_webhooks_output',
]

@pulumi.output_type
class GetWebhooksResult:
    """
    A collection of values returned by getWebhooks.
    """
    def __init__(__self__, id=None, limit=None, org_id=None, org_webhooks=None, page=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_webhooks and not isinstance(org_webhooks, list):
            raise TypeError("Expected argument 'org_webhooks' to be a list")
        pulumi.set(__self__, "org_webhooks", org_webhooks)
        if page and not isinstance(page, int):
            raise TypeError("Expected argument 'page' to be a int")
        pulumi.set(__self__, "page", page)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def limit(self) -> Optional[int]:
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="orgWebhooks")
    def org_webhooks(self) -> Sequence['outputs.GetWebhooksOrgWebhookResult']:
        return pulumi.get(self, "org_webhooks")

    @property
    @pulumi.getter
    def page(self) -> Optional[int]:
        return pulumi.get(self, "page")


class AwaitableGetWebhooksResult(GetWebhooksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetWebhooksResult(
            id=self.id,
            limit=self.limit,
            org_id=self.org_id,
            org_webhooks=self.org_webhooks,
            page=self.page)


def get_webhooks(limit: Optional[int] = None,
                 org_id: Optional[str] = None,
                 page: Optional[int] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetWebhooksResult:
    """
    This data source provides the list of Org Webhooks.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    webhooks = junipermist.org.get_webhooks(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['orgId'] = org_id
    __args__['page'] = page
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getWebhooks:getWebhooks', __args__, opts=opts, typ=GetWebhooksResult).value

    return AwaitableGetWebhooksResult(
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_webhooks=pulumi.get(__ret__, 'org_webhooks'),
        page=pulumi.get(__ret__, 'page'))


@_utilities.lift_output_func(get_webhooks)
def get_webhooks_output(limit: Optional[pulumi.Input[Optional[int]]] = None,
                        org_id: Optional[pulumi.Input[str]] = None,
                        page: Optional[pulumi.Input[Optional[int]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetWebhooksResult]:
    """
    This data source provides the list of Org Webhooks.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    webhooks = junipermist.org.get_webhooks(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    ...