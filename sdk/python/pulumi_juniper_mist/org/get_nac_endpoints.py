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
    'GetNacEndpointsResult',
    'AwaitableGetNacEndpointsResult',
    'get_nac_endpoints',
    'get_nac_endpoints_output',
]

@pulumi.output_type
class GetNacEndpointsResult:
    """
    A collection of values returned by getNacEndpoints.
    """
    def __init__(__self__, id=None, labels=None, mac=None, org_id=None, org_usermacs=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, list):
            raise TypeError("Expected argument 'labels' to be a list")
        pulumi.set(__self__, "labels", labels)
        if mac and not isinstance(mac, str):
            raise TypeError("Expected argument 'mac' to be a str")
        pulumi.set(__self__, "mac", mac)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_usermacs and not isinstance(org_usermacs, list):
            raise TypeError("Expected argument 'org_usermacs' to be a list")
        pulumi.set(__self__, "org_usermacs", org_usermacs)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def labels(self) -> Optional[Sequence[_builtins.str]]:
        """
        Optional, array of strings of labels
        """
        return pulumi.get(self, "labels")

    @_builtins.property
    @pulumi.getter
    def mac(self) -> Optional[_builtins.str]:
        """
        Partial/full MAC address
        """
        return pulumi.get(self, "mac")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> _builtins.str:
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="orgUsermacs")
    def org_usermacs(self) -> Sequence['outputs.GetNacEndpointsOrgUsermacResult']:
        return pulumi.get(self, "org_usermacs")


class AwaitableGetNacEndpointsResult(GetNacEndpointsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNacEndpointsResult(
            id=self.id,
            labels=self.labels,
            mac=self.mac,
            org_id=self.org_id,
            org_usermacs=self.org_usermacs)


def get_nac_endpoints(labels: Optional[Sequence[_builtins.str]] = None,
                      mac: Optional[_builtins.str] = None,
                      org_id: Optional[_builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNacEndpointsResult:
    """
    This data source provides the list of NAC Endpoints (User MACs).

    NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `org.Nactag` resource as match criteria.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    nac_endpoints = junipermist.org.get_nac_endpoints(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        mac="4a422a000000",
        labels=["label_one"])
    ```


    :param Sequence[_builtins.str] labels: Optional, array of strings of labels
    :param _builtins.str mac: Partial/full MAC address
    """
    __args__ = dict()
    __args__['labels'] = labels
    __args__['mac'] = mac
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getNacEndpoints:getNacEndpoints', __args__, opts=opts, typ=GetNacEndpointsResult).value

    return AwaitableGetNacEndpointsResult(
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        mac=pulumi.get(__ret__, 'mac'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_usermacs=pulumi.get(__ret__, 'org_usermacs'))
def get_nac_endpoints_output(labels: Optional[pulumi.Input[Optional[Sequence[_builtins.str]]]] = None,
                             mac: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                             org_id: Optional[pulumi.Input[_builtins.str]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNacEndpointsResult]:
    """
    This data source provides the list of NAC Endpoints (User MACs).

    NAC Endpoints (User MACs) provide a database of endpoints identified by their MAC addresses. They can be used assign each endpoint with various attributes, such as name, VLAN, role and client label.  Once an endpoint is labeled, the label name can be used to create `org.Nactag` resource as match criteria.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    nac_endpoints = junipermist.org.get_nac_endpoints(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        mac="4a422a000000",
        labels=["label_one"])
    ```


    :param Sequence[_builtins.str] labels: Optional, array of strings of labels
    :param _builtins.str mac: Partial/full MAC address
    """
    __args__ = dict()
    __args__['labels'] = labels
    __args__['mac'] = mac
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:org/getNacEndpoints:getNacEndpoints', __args__, opts=opts, typ=GetNacEndpointsResult)
    return __ret__.apply(lambda __response__: GetNacEndpointsResult(
        id=pulumi.get(__response__, 'id'),
        labels=pulumi.get(__response__, 'labels'),
        mac=pulumi.get(__response__, 'mac'),
        org_id=pulumi.get(__response__, 'org_id'),
        org_usermacs=pulumi.get(__response__, 'org_usermacs')))
