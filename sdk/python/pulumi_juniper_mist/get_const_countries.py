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
    'GetConstCountriesResult',
    'AwaitableGetConstCountriesResult',
    'get_const_countries',
    'get_const_countries_output',
]

@pulumi.output_type
class GetConstCountriesResult:
    """
    A collection of values returned by getConstCountries.
    """
    def __init__(__self__, const_countries=None, id=None):
        if const_countries and not isinstance(const_countries, list):
            raise TypeError("Expected argument 'const_countries' to be a list")
        pulumi.set(__self__, "const_countries", const_countries)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="constCountries")
    def const_countries(self) -> Sequence['outputs.GetConstCountriesConstCountryResult']:
        return pulumi.get(self, "const_countries")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetConstCountriesResult(GetConstCountriesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConstCountriesResult(
            const_countries=self.const_countries,
            id=self.id)


def get_const_countries(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConstCountriesResult:
    """
    This data source provides the of ConstCountries.
    This information can be used to define the Country in the RF templates (`org.Rftemplate`)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_countries = junipermist.get_const_countries()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:index/getConstCountries:getConstCountries', __args__, opts=opts, typ=GetConstCountriesResult).value

    return AwaitableGetConstCountriesResult(
        const_countries=pulumi.get(__ret__, 'const_countries'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_const_countries)
def get_const_countries_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConstCountriesResult]:
    """
    This data source provides the of ConstCountries.
    This information can be used to define the Country in the RF templates (`org.Rftemplate`)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_countries = junipermist.get_const_countries()
    ```
    """
    ...