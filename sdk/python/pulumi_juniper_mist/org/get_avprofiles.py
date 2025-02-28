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
    'GetAvprofilesResult',
    'AwaitableGetAvprofilesResult',
    'get_avprofiles',
    'get_avprofiles_output',
]

@pulumi.output_type
class GetAvprofilesResult:
    """
    A collection of values returned by getAvprofiles.
    """
    def __init__(__self__, id=None, org_avprofiles=None, org_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if org_avprofiles and not isinstance(org_avprofiles, list):
            raise TypeError("Expected argument 'org_avprofiles' to be a list")
        pulumi.set(__self__, "org_avprofiles", org_avprofiles)
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
    @pulumi.getter(name="orgAvprofiles")
    def org_avprofiles(self) -> Sequence['outputs.GetAvprofilesOrgAvprofileResult']:
        return pulumi.get(self, "org_avprofiles")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")


class AwaitableGetAvprofilesResult(GetAvprofilesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAvprofilesResult(
            id=self.id,
            org_avprofiles=self.org_avprofiles,
            org_id=self.org_id)


def get_avprofiles(org_id: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAvprofilesResult:
    """
    This data source provides the list of WAN Assurance Antivirus Profiles.

    An Antivirus Profile is used to configure the Antivirus feature on SRX devices. It specifies which content the Antivirus should analyse and which content should be ignored.

    The Antivirus profiles can be used within the following resources:
     * `mist_org_servicepolicy.antivirus`
     * `mist_org_gatewaytemplate.service_policies.antivirus`
     * `mist_org_deviceprofile_gateway.service_policies.antivirus`
     * `mist_device_gateway.service_policies.antivirus`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    avprofiles = junipermist.org.get_avprofiles(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getAvprofiles:getAvprofiles', __args__, opts=opts, typ=GetAvprofilesResult).value

    return AwaitableGetAvprofilesResult(
        id=pulumi.get(__ret__, 'id'),
        org_avprofiles=pulumi.get(__ret__, 'org_avprofiles'),
        org_id=pulumi.get(__ret__, 'org_id'))
def get_avprofiles_output(org_id: Optional[pulumi.Input[str]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAvprofilesResult]:
    """
    This data source provides the list of WAN Assurance Antivirus Profiles.

    An Antivirus Profile is used to configure the Antivirus feature on SRX devices. It specifies which content the Antivirus should analyse and which content should be ignored.

    The Antivirus profiles can be used within the following resources:
     * `mist_org_servicepolicy.antivirus`
     * `mist_org_gatewaytemplate.service_policies.antivirus`
     * `mist_org_deviceprofile_gateway.service_policies.antivirus`
     * `mist_device_gateway.service_policies.antivirus`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    avprofiles = junipermist.org.get_avprofiles(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550")
    ```
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:org/getAvprofiles:getAvprofiles', __args__, opts=opts, typ=GetAvprofilesResult)
    return __ret__.apply(lambda __response__: GetAvprofilesResult(
        id=pulumi.get(__response__, 'id'),
        org_avprofiles=pulumi.get(__response__, 'org_avprofiles'),
        org_id=pulumi.get(__response__, 'org_id')))
