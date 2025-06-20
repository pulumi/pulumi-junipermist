# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'UpgradeDeviceFwupdateArgs',
    'UpgradeDeviceFwupdateArgsDict',
]

MYPY = False

if not MYPY:
    class UpgradeDeviceFwupdateArgsDict(TypedDict):
        progress: NotRequired[pulumi.Input[builtins.int]]
        status: NotRequired[pulumi.Input[builtins.str]]
        """
        enum: `inprogress`, `failed`, `upgraded`
        """
        status_id: NotRequired[pulumi.Input[builtins.int]]
        timestamp: NotRequired[pulumi.Input[builtins.float]]
        """
        Epoch (seconds)
        """
        will_retry: NotRequired[pulumi.Input[builtins.bool]]
elif False:
    UpgradeDeviceFwupdateArgsDict: TypeAlias = Mapping[str, Any]

@pulumi.input_type
class UpgradeDeviceFwupdateArgs:
    def __init__(__self__, *,
                 progress: Optional[pulumi.Input[builtins.int]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 status_id: Optional[pulumi.Input[builtins.int]] = None,
                 timestamp: Optional[pulumi.Input[builtins.float]] = None,
                 will_retry: Optional[pulumi.Input[builtins.bool]] = None):
        """
        :param pulumi.Input[builtins.str] status: enum: `inprogress`, `failed`, `upgraded`
        :param pulumi.Input[builtins.float] timestamp: Epoch (seconds)
        """
        if progress is not None:
            pulumi.set(__self__, "progress", progress)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if status_id is not None:
            pulumi.set(__self__, "status_id", status_id)
        if timestamp is not None:
            pulumi.set(__self__, "timestamp", timestamp)
        if will_retry is not None:
            pulumi.set(__self__, "will_retry", will_retry)

    @property
    @pulumi.getter
    def progress(self) -> Optional[pulumi.Input[builtins.int]]:
        return pulumi.get(self, "progress")

    @progress.setter
    def progress(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "progress", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        enum: `inprogress`, `failed`, `upgraded`
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="statusId")
    def status_id(self) -> Optional[pulumi.Input[builtins.int]]:
        return pulumi.get(self, "status_id")

    @status_id.setter
    def status_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "status_id", value)

    @property
    @pulumi.getter
    def timestamp(self) -> Optional[pulumi.Input[builtins.float]]:
        """
        Epoch (seconds)
        """
        return pulumi.get(self, "timestamp")

    @timestamp.setter
    def timestamp(self, value: Optional[pulumi.Input[builtins.float]]):
        pulumi.set(self, "timestamp", value)

    @property
    @pulumi.getter(name="willRetry")
    def will_retry(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "will_retry")

    @will_retry.setter
    def will_retry(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "will_retry", value)


