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
    'GetConstAlarmsResult',
    'AwaitableGetConstAlarmsResult',
    'get_const_alarms',
    'get_const_alarms_output',
]

@pulumi.output_type
class GetConstAlarmsResult:
    """
    A collection of values returned by getConstAlarms.
    """
    def __init__(__self__, const_alarms=None, id=None):
        if const_alarms and not isinstance(const_alarms, list):
            raise TypeError("Expected argument 'const_alarms' to be a list")
        pulumi.set(__self__, "const_alarms", const_alarms)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="constAlarms")
    def const_alarms(self) -> Sequence['outputs.GetConstAlarmsConstAlarmResult']:
        return pulumi.get(self, "const_alarms")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetConstAlarmsResult(GetConstAlarmsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConstAlarmsResult(
            const_alarms=self.const_alarms,
            id=self.id)


def get_const_alarms(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConstAlarmsResult:
    """
    This data source provides the list of  available Alarms.
    The alarm `key` can be used to configure the `mist_org_alarmtemplate.rules`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_alarms = junipermist.get_const_alarms()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('junipermist:index/getConstAlarms:getConstAlarms', __args__, opts=opts, typ=GetConstAlarmsResult).value

    return AwaitableGetConstAlarmsResult(
        const_alarms=pulumi.get(__ret__, 'const_alarms'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_const_alarms)
def get_const_alarms_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConstAlarmsResult]:
    """
    This data source provides the list of  available Alarms.
    The alarm `key` can be used to configure the `mist_org_alarmtemplate.rules`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_junipermist as junipermist

    list_of_alarms = junipermist.get_const_alarms()
    ```
    """
    ...
