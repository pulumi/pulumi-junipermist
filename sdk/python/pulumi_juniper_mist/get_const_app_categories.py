# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetConstAppCategoriesResult',
    'AwaitableGetConstAppCategoriesResult',
    'get_const_app_categories',
    'get_const_app_categories_output',
]

@pulumi.output_type
class GetConstAppCategoriesResult:
    """
    A collection of values returned by getConstAppCategories.
    """
    def __init__(__self__, const_app_categories=None, id=None):
        if const_app_categories and not isinstance(const_app_categories, list):
            raise TypeError("Expected argument 'const_app_categories' to be a list")
        pulumi.set(__self__, "const_app_categories", const_app_categories)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="constAppCategories")
    def const_app_categories(self) -> Sequence['outputs.GetConstAppCategoriesConstAppCategoryResult']:
        return pulumi.get(self, "const_app_categories")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetConstAppCategoriesResult(GetConstAppCategoriesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConstAppCategoriesResult(
            const_app_categories=self.const_app_categories,
            id=self.id)


def get_const_app_categories(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConstAppCategoriesResult:
    """
    This data source provides the of ConstAppCategories.
    This information can be used as `app_categories` in the `org.Service` resource

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_app_categories = junipermist.get_const_app_categories()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:index/getConstAppCategories:getConstAppCategories', __args__, opts=opts, typ=GetConstAppCategoriesResult).value

    return AwaitableGetConstAppCategoriesResult(
        const_app_categories=pulumi.get(__ret__, 'const_app_categories'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_const_app_categories)
def get_const_app_categories_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConstAppCategoriesResult]:
    """
    This data source provides the of ConstAppCategories.
    This information can be used as `app_categories` in the `org.Service` resource

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_app_categories = junipermist.get_const_app_categories()
    ```
    """
    ...