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
    'GetNactagsResult',
    'AwaitableGetNactagsResult',
    'get_nactags',
    'get_nactags_output',
]

@pulumi.output_type
class GetNactagsResult:
    """
    A collection of values returned by getNactags.
    """
    def __init__(__self__, id=None, match=None, name=None, org_id=None, org_nactags=None, type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if match and not isinstance(match, str):
            raise TypeError("Expected argument 'match' to be a str")
        pulumi.set(__self__, "match", match)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if org_nactags and not isinstance(org_nactags, list):
            raise TypeError("Expected argument 'org_nactags' to be a list")
        pulumi.set(__self__, "org_nactags", org_nactags)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def match(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "match")

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> _builtins.str:
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="orgNactags")
    def org_nactags(self) -> Sequence['outputs.GetNactagsOrgNactagResult']:
        return pulumi.get(self, "org_nactags")

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "type")


class AwaitableGetNactagsResult(GetNactagsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNactagsResult(
            id=self.id,
            match=self.match,
            name=self.name,
            org_id=self.org_id,
            org_nactags=self.org_nactags,
            type=self.type)


def get_nactags(match: Optional[_builtins.str] = None,
                name: Optional[_builtins.str] = None,
                org_id: Optional[_builtins.str] = None,
                type: Optional[_builtins.str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNactagsResult:
    """
    This data source provides the list of NAC Tags (Auth Policy Labels).

    The NAC Tags can be used in the NAC Rules to define the matching criteria or the returned RADIUS Attributes

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    nactags = junipermist.org.get_nactags(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        type="match",
        match="cert_issuer")
    ```
    """
    __args__ = dict()
    __args__['match'] = match
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:org/getNactags:getNactags', __args__, opts=opts, typ=GetNactagsResult).value

    return AwaitableGetNactagsResult(
        id=pulumi.get(__ret__, 'id'),
        match=pulumi.get(__ret__, 'match'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        org_nactags=pulumi.get(__ret__, 'org_nactags'),
        type=pulumi.get(__ret__, 'type'))
def get_nactags_output(match: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       org_id: Optional[pulumi.Input[_builtins.str]] = None,
                       type: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNactagsResult]:
    """
    This data source provides the list of NAC Tags (Auth Policy Labels).

    The NAC Tags can be used in the NAC Rules to define the matching criteria or the returned RADIUS Attributes

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    nactags = junipermist.org.get_nactags(org_id="15fca2ac-b1a6-47cc-9953-cc6906281550",
        type="match",
        match="cert_issuer")
    ```
    """
    __args__ = dict()
    __args__['match'] = match
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['type'] = type
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:org/getNactags:getNactags', __args__, opts=opts, typ=GetNactagsResult)
    return __ret__.apply(lambda __response__: GetNactagsResult(
        id=pulumi.get(__response__, 'id'),
        match=pulumi.get(__response__, 'match'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        org_nactags=pulumi.get(__response__, 'org_nactags'),
        type=pulumi.get(__response__, 'type')))
