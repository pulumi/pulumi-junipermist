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
from . import _utilities

__all__ = [
    'GetConstFingerprintsResult',
    'AwaitableGetConstFingerprintsResult',
    'get_const_fingerprints',
    'get_const_fingerprints_output',
]

@pulumi.output_type
class GetConstFingerprintsResult:
    """
    A collection of values returned by getConstFingerprints.
    """
    def __init__(__self__, families=None, id=None, mfgs=None, models=None, os=None):
        if families and not isinstance(families, list):
            raise TypeError("Expected argument 'families' to be a list")
        pulumi.set(__self__, "families", families)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if mfgs and not isinstance(mfgs, list):
            raise TypeError("Expected argument 'mfgs' to be a list")
        pulumi.set(__self__, "mfgs", mfgs)
        if models and not isinstance(models, list):
            raise TypeError("Expected argument 'models' to be a list")
        pulumi.set(__self__, "models", models)
        if os and not isinstance(os, list):
            raise TypeError("Expected argument 'os' to be a list")
        pulumi.set(__self__, "os", os)

    @_builtins.property
    @pulumi.getter
    def families(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "families")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def mfgs(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "mfgs")

    @_builtins.property
    @pulumi.getter
    def models(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "models")

    @_builtins.property
    @pulumi.getter
    def os(self) -> Sequence[_builtins.str]:
        return pulumi.get(self, "os")


class AwaitableGetConstFingerprintsResult(GetConstFingerprintsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConstFingerprintsResult(
            families=self.families,
            id=self.id,
            mfgs=self.mfgs,
            models=self.models,
            os=self.os)


def get_const_fingerprints(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConstFingerprintsResult:
    """
    This data source provides the of list of supported Fingerprints.

    The Fingerprint information can be used within `matching` and `not_matching` attributes of the NAC Rule resource (`org.Nacrule`)

    There are four different types of fingerprints available:* Family
    * Model
    * Mfg
    * OS Type

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_fingerprints = junipermist.get_const_fingerprints()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:index/getConstFingerprints:getConstFingerprints', __args__, opts=opts, typ=GetConstFingerprintsResult).value

    return AwaitableGetConstFingerprintsResult(
        families=pulumi.get(__ret__, 'families'),
        id=pulumi.get(__ret__, 'id'),
        mfgs=pulumi.get(__ret__, 'mfgs'),
        models=pulumi.get(__ret__, 'models'),
        os=pulumi.get(__ret__, 'os'))
def get_const_fingerprints_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetConstFingerprintsResult]:
    """
    This data source provides the of list of supported Fingerprints.

    The Fingerprint information can be used within `matching` and `not_matching` attributes of the NAC Rule resource (`org.Nacrule`)

    There are four different types of fingerprints available:* Family
    * Model
    * Mfg
    * OS Type

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_fingerprints = junipermist.get_const_fingerprints()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('junipermist:index/getConstFingerprints:getConstFingerprints', __args__, opts=opts, typ=GetConstFingerprintsResult)
    return __ret__.apply(lambda __response__: GetConstFingerprintsResult(
        families=pulumi.get(__response__, 'families'),
        id=pulumi.get(__response__, 'id'),
        mfgs=pulumi.get(__response__, 'mfgs'),
        models=pulumi.get(__response__, 'models'),
        os=pulumi.get(__response__, 'os')))
