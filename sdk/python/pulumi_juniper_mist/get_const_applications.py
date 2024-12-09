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
    'GetConstApplicationsResult',
    'AwaitableGetConstApplicationsResult',
    'get_const_applications',
    'get_const_applications_output',
]

@pulumi.output_type
class GetConstApplicationsResult:
    """
    A collection of values returned by getConstApplications.
    """
    def __init__(__self__, const_applications=None, id=None):
        if const_applications and not isinstance(const_applications, list):
            raise TypeError("Expected argument 'const_applications' to be a list")
        pulumi.set(__self__, "const_applications", const_applications)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="constApplications")
    def const_applications(self) -> Sequence['outputs.GetConstApplicationsConstApplicationResult']:
        return pulumi.get(self, "const_applications")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetConstApplicationsResult(GetConstApplicationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConstApplicationsResult(
            const_applications=self.const_applications,
            id=self.id)


def get_const_applications(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConstApplicationsResult:
    """
    This data source provides the of ConstApplications.
    This information can be used as `apps` in the `org.Service` resource, the `site.Setting` resource (`mist_site_setting.gateway_mgmt.app_probing.apps`) or in the `org.Setting` resource (`mist_org_setting.gateway_mgmt.app_probing.apps`)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_applications = junipermist.get_const_applications()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:index/getConstApplications:getConstApplications', __args__, opts=opts, typ=GetConstApplicationsResult).value

    return AwaitableGetConstApplicationsResult(
        const_applications=pulumi.get(__ret__, 'const_applications'),
        id=pulumi.get(__ret__, 'id'))
def get_const_applications_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetConstApplicationsResult]:
    """
    This data source provides the of ConstApplications.
    This information can be used as `apps` in the `org.Service` resource, the `site.Setting` resource (`mist_site_setting.gateway_mgmt.app_probing.apps`) or in the `org.Setting` resource (`mist_org_setting.gateway_mgmt.app_probing.apps`)

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_applications = junipermist.get_const_applications()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:index/getConstApplications:getConstApplications', __args__, opts=opts, typ=GetConstApplicationsResult)
    return __ret__.apply(lambda __response__: GetConstApplicationsResult(
        const_applications=pulumi.get(__response__, 'const_applications'),
        id=pulumi.get(__response__, 'id')))
