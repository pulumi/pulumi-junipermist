# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
from . import outputs
from ._inputs import *

__all__ = ['UpgradeDeviceArgs', 'UpgradeDevice']

@pulumi.input_type
class UpgradeDeviceArgs:
    def __init__(__self__, *,
                 device_id: pulumi.Input[builtins.str],
                 site_id: pulumi.Input[builtins.str],
                 target_version: pulumi.Input[builtins.str],
                 reboot: Optional[pulumi.Input[builtins.bool]] = None,
                 reboot_at: Optional[pulumi.Input[builtins.int]] = None,
                 snapshot: Optional[pulumi.Input[builtins.bool]] = None,
                 start_time: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade: Optional[pulumi.Input[builtins.bool]] = None,
                 sync_upgrade_refresh_interval: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_start_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_timeout: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a UpgradeDevice resource.
        :param pulumi.Input[builtins.str] target_version: firmware version to deploy to the device. Use the `device_get_versions` datasource to get the list of available firmware versions
        :param pulumi.Input[builtins.bool] reboot: For Switches and Gateways only (APs are automatically rebooted). Reboot device immediately after upgrade is completed
        :param pulumi.Input[builtins.int] reboot_at: For Switches and Gateways only and if `reboot`==`true`. Reboot start time in epoch seconds, default is `start_time`
        :param pulumi.Input[builtins.bool] snapshot: For Junos devices only. Perform recovery snapshot after device is rebooted
        :param pulumi.Input[builtins.int] start_time: Firmware download start time in epoch
        :param pulumi.Input[builtins.bool] sync_upgrade: if set to `false`, the provider will just trigger the upgrade and not wait for the end of the upgrade process. Default is `true`
        :param pulumi.Input[builtins.int] sync_upgrade_refresh_interval: if set to `sync_upgrade`==`true`, how long to wait between each refresh of the upgrade status, in seconds. Default is 30, minimum is 15
        :param pulumi.Input[builtins.int] sync_upgrade_start_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to start before raising an error, in seconds. Default is 60, minimum is 60
        :param pulumi.Input[builtins.int] sync_upgrade_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to end before raising an error, in seconds. Default is 1800
        """
        pulumi.set(__self__, "device_id", device_id)
        pulumi.set(__self__, "site_id", site_id)
        pulumi.set(__self__, "target_version", target_version)
        if reboot is not None:
            pulumi.set(__self__, "reboot", reboot)
        if reboot_at is not None:
            pulumi.set(__self__, "reboot_at", reboot_at)
        if snapshot is not None:
            pulumi.set(__self__, "snapshot", snapshot)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)
        if sync_upgrade is not None:
            pulumi.set(__self__, "sync_upgrade", sync_upgrade)
        if sync_upgrade_refresh_interval is not None:
            pulumi.set(__self__, "sync_upgrade_refresh_interval", sync_upgrade_refresh_interval)
        if sync_upgrade_start_timeout is not None:
            pulumi.set(__self__, "sync_upgrade_start_timeout", sync_upgrade_start_timeout)
        if sync_upgrade_timeout is not None:
            pulumi.set(__self__, "sync_upgrade_timeout", sync_upgrade_timeout)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Input[builtins.str]:
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Input[builtins.str]:
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "site_id", value)

    @property
    @pulumi.getter(name="targetVersion")
    def target_version(self) -> pulumi.Input[builtins.str]:
        """
        firmware version to deploy to the device. Use the `device_get_versions` datasource to get the list of available firmware versions
        """
        return pulumi.get(self, "target_version")

    @target_version.setter
    def target_version(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "target_version", value)

    @property
    @pulumi.getter
    def reboot(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        For Switches and Gateways only (APs are automatically rebooted). Reboot device immediately after upgrade is completed
        """
        return pulumi.get(self, "reboot")

    @reboot.setter
    def reboot(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "reboot", value)

    @property
    @pulumi.getter(name="rebootAt")
    def reboot_at(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        For Switches and Gateways only and if `reboot`==`true`. Reboot start time in epoch seconds, default is `start_time`
        """
        return pulumi.get(self, "reboot_at")

    @reboot_at.setter
    def reboot_at(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "reboot_at", value)

    @property
    @pulumi.getter
    def snapshot(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        For Junos devices only. Perform recovery snapshot after device is rebooted
        """
        return pulumi.get(self, "snapshot")

    @snapshot.setter
    def snapshot(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "snapshot", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Firmware download start time in epoch
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter(name="syncUpgrade")
    def sync_upgrade(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        if set to `false`, the provider will just trigger the upgrade and not wait for the end of the upgrade process. Default is `true`
        """
        return pulumi.get(self, "sync_upgrade")

    @sync_upgrade.setter
    def sync_upgrade(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "sync_upgrade", value)

    @property
    @pulumi.getter(name="syncUpgradeRefreshInterval")
    def sync_upgrade_refresh_interval(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        if set to `sync_upgrade`==`true`, how long to wait between each refresh of the upgrade status, in seconds. Default is 30, minimum is 15
        """
        return pulumi.get(self, "sync_upgrade_refresh_interval")

    @sync_upgrade_refresh_interval.setter
    def sync_upgrade_refresh_interval(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "sync_upgrade_refresh_interval", value)

    @property
    @pulumi.getter(name="syncUpgradeStartTimeout")
    def sync_upgrade_start_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        if set to `sync_upgrade`==`true`, how long to wait for the upgrade to start before raising an error, in seconds. Default is 60, minimum is 60
        """
        return pulumi.get(self, "sync_upgrade_start_timeout")

    @sync_upgrade_start_timeout.setter
    def sync_upgrade_start_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "sync_upgrade_start_timeout", value)

    @property
    @pulumi.getter(name="syncUpgradeTimeout")
    def sync_upgrade_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        if set to `sync_upgrade`==`true`, how long to wait for the upgrade to end before raising an error, in seconds. Default is 1800
        """
        return pulumi.get(self, "sync_upgrade_timeout")

    @sync_upgrade_timeout.setter
    def sync_upgrade_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "sync_upgrade_timeout", value)


@pulumi.input_type
class _UpgradeDeviceState:
    def __init__(__self__, *,
                 device_id: Optional[pulumi.Input[builtins.str]] = None,
                 device_version: Optional[pulumi.Input[builtins.str]] = None,
                 fwupdate: Optional[pulumi.Input['UpgradeDeviceFwupdateArgs']] = None,
                 reboot: Optional[pulumi.Input[builtins.bool]] = None,
                 reboot_at: Optional[pulumi.Input[builtins.int]] = None,
                 site_id: Optional[pulumi.Input[builtins.str]] = None,
                 snapshot: Optional[pulumi.Input[builtins.bool]] = None,
                 start_time: Optional[pulumi.Input[builtins.int]] = None,
                 status: Optional[pulumi.Input[builtins.str]] = None,
                 sync_upgrade: Optional[pulumi.Input[builtins.bool]] = None,
                 sync_upgrade_refresh_interval: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_start_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 target_version: Optional[pulumi.Input[builtins.str]] = None,
                 timestamp: Optional[pulumi.Input[builtins.float]] = None):
        """
        Input properties used for looking up and filtering UpgradeDevice resources.
        :param pulumi.Input[builtins.str] device_version: current device firmware version
        :param pulumi.Input[builtins.bool] reboot: For Switches and Gateways only (APs are automatically rebooted). Reboot device immediately after upgrade is completed
        :param pulumi.Input[builtins.int] reboot_at: For Switches and Gateways only and if `reboot`==`true`. Reboot start time in epoch seconds, default is `start_time`
        :param pulumi.Input[builtins.bool] snapshot: For Junos devices only. Perform recovery snapshot after device is rebooted
        :param pulumi.Input[builtins.int] start_time: Firmware download start time in epoch
        :param pulumi.Input[builtins.str] status: enum: `error`, `inprogress`, `scheduled`, `starting`, `success`
        :param pulumi.Input[builtins.bool] sync_upgrade: if set to `false`, the provider will just trigger the upgrade and not wait for the end of the upgrade process. Default is `true`
        :param pulumi.Input[builtins.int] sync_upgrade_refresh_interval: if set to `sync_upgrade`==`true`, how long to wait between each refresh of the upgrade status, in seconds. Default is 30, minimum is 15
        :param pulumi.Input[builtins.int] sync_upgrade_start_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to start before raising an error, in seconds. Default is 60, minimum is 60
        :param pulumi.Input[builtins.int] sync_upgrade_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to end before raising an error, in seconds. Default is 1800
        :param pulumi.Input[builtins.str] target_version: firmware version to deploy to the device. Use the `device_get_versions` datasource to get the list of available firmware versions
        :param pulumi.Input[builtins.float] timestamp: Epoch (seconds)
        """
        if device_id is not None:
            pulumi.set(__self__, "device_id", device_id)
        if device_version is not None:
            pulumi.set(__self__, "device_version", device_version)
        if fwupdate is not None:
            pulumi.set(__self__, "fwupdate", fwupdate)
        if reboot is not None:
            pulumi.set(__self__, "reboot", reboot)
        if reboot_at is not None:
            pulumi.set(__self__, "reboot_at", reboot_at)
        if site_id is not None:
            pulumi.set(__self__, "site_id", site_id)
        if snapshot is not None:
            pulumi.set(__self__, "snapshot", snapshot)
        if start_time is not None:
            pulumi.set(__self__, "start_time", start_time)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if sync_upgrade is not None:
            pulumi.set(__self__, "sync_upgrade", sync_upgrade)
        if sync_upgrade_refresh_interval is not None:
            pulumi.set(__self__, "sync_upgrade_refresh_interval", sync_upgrade_refresh_interval)
        if sync_upgrade_start_timeout is not None:
            pulumi.set(__self__, "sync_upgrade_start_timeout", sync_upgrade_start_timeout)
        if sync_upgrade_timeout is not None:
            pulumi.set(__self__, "sync_upgrade_timeout", sync_upgrade_timeout)
        if target_version is not None:
            pulumi.set(__self__, "target_version", target_version)
        if timestamp is not None:
            pulumi.set(__self__, "timestamp", timestamp)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "device_id")

    @device_id.setter
    def device_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "device_id", value)

    @property
    @pulumi.getter(name="deviceVersion")
    def device_version(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        current device firmware version
        """
        return pulumi.get(self, "device_version")

    @device_version.setter
    def device_version(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "device_version", value)

    @property
    @pulumi.getter
    def fwupdate(self) -> Optional[pulumi.Input['UpgradeDeviceFwupdateArgs']]:
        return pulumi.get(self, "fwupdate")

    @fwupdate.setter
    def fwupdate(self, value: Optional[pulumi.Input['UpgradeDeviceFwupdateArgs']]):
        pulumi.set(self, "fwupdate", value)

    @property
    @pulumi.getter
    def reboot(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        For Switches and Gateways only (APs are automatically rebooted). Reboot device immediately after upgrade is completed
        """
        return pulumi.get(self, "reboot")

    @reboot.setter
    def reboot(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "reboot", value)

    @property
    @pulumi.getter(name="rebootAt")
    def reboot_at(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        For Switches and Gateways only and if `reboot`==`true`. Reboot start time in epoch seconds, default is `start_time`
        """
        return pulumi.get(self, "reboot_at")

    @reboot_at.setter
    def reboot_at(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "reboot_at", value)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "site_id", value)

    @property
    @pulumi.getter
    def snapshot(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        For Junos devices only. Perform recovery snapshot after device is rebooted
        """
        return pulumi.get(self, "snapshot")

    @snapshot.setter
    def snapshot(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "snapshot", value)

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Firmware download start time in epoch
        """
        return pulumi.get(self, "start_time")

    @start_time.setter
    def start_time(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "start_time", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        enum: `error`, `inprogress`, `scheduled`, `starting`, `success`
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="syncUpgrade")
    def sync_upgrade(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        if set to `false`, the provider will just trigger the upgrade and not wait for the end of the upgrade process. Default is `true`
        """
        return pulumi.get(self, "sync_upgrade")

    @sync_upgrade.setter
    def sync_upgrade(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "sync_upgrade", value)

    @property
    @pulumi.getter(name="syncUpgradeRefreshInterval")
    def sync_upgrade_refresh_interval(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        if set to `sync_upgrade`==`true`, how long to wait between each refresh of the upgrade status, in seconds. Default is 30, minimum is 15
        """
        return pulumi.get(self, "sync_upgrade_refresh_interval")

    @sync_upgrade_refresh_interval.setter
    def sync_upgrade_refresh_interval(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "sync_upgrade_refresh_interval", value)

    @property
    @pulumi.getter(name="syncUpgradeStartTimeout")
    def sync_upgrade_start_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        if set to `sync_upgrade`==`true`, how long to wait for the upgrade to start before raising an error, in seconds. Default is 60, minimum is 60
        """
        return pulumi.get(self, "sync_upgrade_start_timeout")

    @sync_upgrade_start_timeout.setter
    def sync_upgrade_start_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "sync_upgrade_start_timeout", value)

    @property
    @pulumi.getter(name="syncUpgradeTimeout")
    def sync_upgrade_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        if set to `sync_upgrade`==`true`, how long to wait for the upgrade to end before raising an error, in seconds. Default is 1800
        """
        return pulumi.get(self, "sync_upgrade_timeout")

    @sync_upgrade_timeout.setter
    def sync_upgrade_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "sync_upgrade_timeout", value)

    @property
    @pulumi.getter(name="targetVersion")
    def target_version(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        firmware version to deploy to the device. Use the `device_get_versions` datasource to get the list of available firmware versions
        """
        return pulumi.get(self, "target_version")

    @target_version.setter
    def target_version(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "target_version", value)

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


class UpgradeDevice(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_id: Optional[pulumi.Input[builtins.str]] = None,
                 reboot: Optional[pulumi.Input[builtins.bool]] = None,
                 reboot_at: Optional[pulumi.Input[builtins.int]] = None,
                 site_id: Optional[pulumi.Input[builtins.str]] = None,
                 snapshot: Optional[pulumi.Input[builtins.bool]] = None,
                 start_time: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade: Optional[pulumi.Input[builtins.bool]] = None,
                 sync_upgrade_refresh_interval: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_start_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 target_version: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        This resource can be used to upgrade the firmware of a single device (Wi-Fi Access Points, Switches and SRX/SSR Gateways).

        The resource will send the upgrade command to Mist, which will take care of deploying the new firmware version to the device, and reboot it if required.

        The time required to upgrade a device depends on the type of device and its hardware. By default, the resource will track the upgrade process and only return the result once the device is upgraded and rebooted (unless `reboot`==`false` or `reboot_at` is set).\\
        If required it is possible to run the upgrade in async mode (attribute `sync`=`false`). In this case, the resource will only trigger the upgrade and return the Mist response, but will not track the upgrade progress.

        The list of available firmware versions can be retrieved with the `device_get_versions` data source.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        ap_upgrade = junipermist.UpgradeDevice("ap_upgrade",
            site_id=terraform_test["id"],
            device_id=ap_one["id"],
            target_version="0.14.29543")
        switch_upgrade = junipermist.UpgradeDevice("switch_upgrade",
            site_id=terraform_test["id"],
            device_id=switch_one["id"],
            target_version="24.2R1-S1.10",
            reboot=True,
            sync_upgrade_timeout=3600)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] reboot: For Switches and Gateways only (APs are automatically rebooted). Reboot device immediately after upgrade is completed
        :param pulumi.Input[builtins.int] reboot_at: For Switches and Gateways only and if `reboot`==`true`. Reboot start time in epoch seconds, default is `start_time`
        :param pulumi.Input[builtins.bool] snapshot: For Junos devices only. Perform recovery snapshot after device is rebooted
        :param pulumi.Input[builtins.int] start_time: Firmware download start time in epoch
        :param pulumi.Input[builtins.bool] sync_upgrade: if set to `false`, the provider will just trigger the upgrade and not wait for the end of the upgrade process. Default is `true`
        :param pulumi.Input[builtins.int] sync_upgrade_refresh_interval: if set to `sync_upgrade`==`true`, how long to wait between each refresh of the upgrade status, in seconds. Default is 30, minimum is 15
        :param pulumi.Input[builtins.int] sync_upgrade_start_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to start before raising an error, in seconds. Default is 60, minimum is 60
        :param pulumi.Input[builtins.int] sync_upgrade_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to end before raising an error, in seconds. Default is 1800
        :param pulumi.Input[builtins.str] target_version: firmware version to deploy to the device. Use the `device_get_versions` datasource to get the list of available firmware versions
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UpgradeDeviceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can be used to upgrade the firmware of a single device (Wi-Fi Access Points, Switches and SRX/SSR Gateways).

        The resource will send the upgrade command to Mist, which will take care of deploying the new firmware version to the device, and reboot it if required.

        The time required to upgrade a device depends on the type of device and its hardware. By default, the resource will track the upgrade process and only return the result once the device is upgraded and rebooted (unless `reboot`==`false` or `reboot_at` is set).\\
        If required it is possible to run the upgrade in async mode (attribute `sync`=`false`). In this case, the resource will only trigger the upgrade and return the Mist response, but will not track the upgrade progress.

        The list of available firmware versions can be retrieved with the `device_get_versions` data source.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        ap_upgrade = junipermist.UpgradeDevice("ap_upgrade",
            site_id=terraform_test["id"],
            device_id=ap_one["id"],
            target_version="0.14.29543")
        switch_upgrade = junipermist.UpgradeDevice("switch_upgrade",
            site_id=terraform_test["id"],
            device_id=switch_one["id"],
            target_version="24.2R1-S1.10",
            reboot=True,
            sync_upgrade_timeout=3600)
        ```

        :param str resource_name: The name of the resource.
        :param UpgradeDeviceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UpgradeDeviceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device_id: Optional[pulumi.Input[builtins.str]] = None,
                 reboot: Optional[pulumi.Input[builtins.bool]] = None,
                 reboot_at: Optional[pulumi.Input[builtins.int]] = None,
                 site_id: Optional[pulumi.Input[builtins.str]] = None,
                 snapshot: Optional[pulumi.Input[builtins.bool]] = None,
                 start_time: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade: Optional[pulumi.Input[builtins.bool]] = None,
                 sync_upgrade_refresh_interval: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_start_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 sync_upgrade_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 target_version: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UpgradeDeviceArgs.__new__(UpgradeDeviceArgs)

            if device_id is None and not opts.urn:
                raise TypeError("Missing required property 'device_id'")
            __props__.__dict__["device_id"] = device_id
            __props__.__dict__["reboot"] = reboot
            __props__.__dict__["reboot_at"] = reboot_at
            if site_id is None and not opts.urn:
                raise TypeError("Missing required property 'site_id'")
            __props__.__dict__["site_id"] = site_id
            __props__.__dict__["snapshot"] = snapshot
            __props__.__dict__["start_time"] = start_time
            __props__.__dict__["sync_upgrade"] = sync_upgrade
            __props__.__dict__["sync_upgrade_refresh_interval"] = sync_upgrade_refresh_interval
            __props__.__dict__["sync_upgrade_start_timeout"] = sync_upgrade_start_timeout
            __props__.__dict__["sync_upgrade_timeout"] = sync_upgrade_timeout
            if target_version is None and not opts.urn:
                raise TypeError("Missing required property 'target_version'")
            __props__.__dict__["target_version"] = target_version
            __props__.__dict__["device_version"] = None
            __props__.__dict__["fwupdate"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["timestamp"] = None
        super(UpgradeDevice, __self__).__init__(
            'junipermist:index/upgradeDevice:UpgradeDevice',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device_id: Optional[pulumi.Input[builtins.str]] = None,
            device_version: Optional[pulumi.Input[builtins.str]] = None,
            fwupdate: Optional[pulumi.Input[Union['UpgradeDeviceFwupdateArgs', 'UpgradeDeviceFwupdateArgsDict']]] = None,
            reboot: Optional[pulumi.Input[builtins.bool]] = None,
            reboot_at: Optional[pulumi.Input[builtins.int]] = None,
            site_id: Optional[pulumi.Input[builtins.str]] = None,
            snapshot: Optional[pulumi.Input[builtins.bool]] = None,
            start_time: Optional[pulumi.Input[builtins.int]] = None,
            status: Optional[pulumi.Input[builtins.str]] = None,
            sync_upgrade: Optional[pulumi.Input[builtins.bool]] = None,
            sync_upgrade_refresh_interval: Optional[pulumi.Input[builtins.int]] = None,
            sync_upgrade_start_timeout: Optional[pulumi.Input[builtins.int]] = None,
            sync_upgrade_timeout: Optional[pulumi.Input[builtins.int]] = None,
            target_version: Optional[pulumi.Input[builtins.str]] = None,
            timestamp: Optional[pulumi.Input[builtins.float]] = None) -> 'UpgradeDevice':
        """
        Get an existing UpgradeDevice resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] device_version: current device firmware version
        :param pulumi.Input[builtins.bool] reboot: For Switches and Gateways only (APs are automatically rebooted). Reboot device immediately after upgrade is completed
        :param pulumi.Input[builtins.int] reboot_at: For Switches and Gateways only and if `reboot`==`true`. Reboot start time in epoch seconds, default is `start_time`
        :param pulumi.Input[builtins.bool] snapshot: For Junos devices only. Perform recovery snapshot after device is rebooted
        :param pulumi.Input[builtins.int] start_time: Firmware download start time in epoch
        :param pulumi.Input[builtins.str] status: enum: `error`, `inprogress`, `scheduled`, `starting`, `success`
        :param pulumi.Input[builtins.bool] sync_upgrade: if set to `false`, the provider will just trigger the upgrade and not wait for the end of the upgrade process. Default is `true`
        :param pulumi.Input[builtins.int] sync_upgrade_refresh_interval: if set to `sync_upgrade`==`true`, how long to wait between each refresh of the upgrade status, in seconds. Default is 30, minimum is 15
        :param pulumi.Input[builtins.int] sync_upgrade_start_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to start before raising an error, in seconds. Default is 60, minimum is 60
        :param pulumi.Input[builtins.int] sync_upgrade_timeout: if set to `sync_upgrade`==`true`, how long to wait for the upgrade to end before raising an error, in seconds. Default is 1800
        :param pulumi.Input[builtins.str] target_version: firmware version to deploy to the device. Use the `device_get_versions` datasource to get the list of available firmware versions
        :param pulumi.Input[builtins.float] timestamp: Epoch (seconds)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UpgradeDeviceState.__new__(_UpgradeDeviceState)

        __props__.__dict__["device_id"] = device_id
        __props__.__dict__["device_version"] = device_version
        __props__.__dict__["fwupdate"] = fwupdate
        __props__.__dict__["reboot"] = reboot
        __props__.__dict__["reboot_at"] = reboot_at
        __props__.__dict__["site_id"] = site_id
        __props__.__dict__["snapshot"] = snapshot
        __props__.__dict__["start_time"] = start_time
        __props__.__dict__["status"] = status
        __props__.__dict__["sync_upgrade"] = sync_upgrade
        __props__.__dict__["sync_upgrade_refresh_interval"] = sync_upgrade_refresh_interval
        __props__.__dict__["sync_upgrade_start_timeout"] = sync_upgrade_start_timeout
        __props__.__dict__["sync_upgrade_timeout"] = sync_upgrade_timeout
        __props__.__dict__["target_version"] = target_version
        __props__.__dict__["timestamp"] = timestamp
        return UpgradeDevice(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deviceId")
    def device_id(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "device_id")

    @property
    @pulumi.getter(name="deviceVersion")
    def device_version(self) -> pulumi.Output[builtins.str]:
        """
        current device firmware version
        """
        return pulumi.get(self, "device_version")

    @property
    @pulumi.getter
    def fwupdate(self) -> pulumi.Output['outputs.UpgradeDeviceFwupdate']:
        return pulumi.get(self, "fwupdate")

    @property
    @pulumi.getter
    def reboot(self) -> pulumi.Output[builtins.bool]:
        """
        For Switches and Gateways only (APs are automatically rebooted). Reboot device immediately after upgrade is completed
        """
        return pulumi.get(self, "reboot")

    @property
    @pulumi.getter(name="rebootAt")
    def reboot_at(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        For Switches and Gateways only and if `reboot`==`true`. Reboot start time in epoch seconds, default is `start_time`
        """
        return pulumi.get(self, "reboot_at")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "site_id")

    @property
    @pulumi.getter
    def snapshot(self) -> pulumi.Output[builtins.bool]:
        """
        For Junos devices only. Perform recovery snapshot after device is rebooted
        """
        return pulumi.get(self, "snapshot")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        Firmware download start time in epoch
        """
        return pulumi.get(self, "start_time")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[builtins.str]:
        """
        enum: `error`, `inprogress`, `scheduled`, `starting`, `success`
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="syncUpgrade")
    def sync_upgrade(self) -> pulumi.Output[builtins.bool]:
        """
        if set to `false`, the provider will just trigger the upgrade and not wait for the end of the upgrade process. Default is `true`
        """
        return pulumi.get(self, "sync_upgrade")

    @property
    @pulumi.getter(name="syncUpgradeRefreshInterval")
    def sync_upgrade_refresh_interval(self) -> pulumi.Output[builtins.int]:
        """
        if set to `sync_upgrade`==`true`, how long to wait between each refresh of the upgrade status, in seconds. Default is 30, minimum is 15
        """
        return pulumi.get(self, "sync_upgrade_refresh_interval")

    @property
    @pulumi.getter(name="syncUpgradeStartTimeout")
    def sync_upgrade_start_timeout(self) -> pulumi.Output[builtins.int]:
        """
        if set to `sync_upgrade`==`true`, how long to wait for the upgrade to start before raising an error, in seconds. Default is 60, minimum is 60
        """
        return pulumi.get(self, "sync_upgrade_start_timeout")

    @property
    @pulumi.getter(name="syncUpgradeTimeout")
    def sync_upgrade_timeout(self) -> pulumi.Output[builtins.int]:
        """
        if set to `sync_upgrade`==`true`, how long to wait for the upgrade to end before raising an error, in seconds. Default is 1800
        """
        return pulumi.get(self, "sync_upgrade_timeout")

    @property
    @pulumi.getter(name="targetVersion")
    def target_version(self) -> pulumi.Output[builtins.str]:
        """
        firmware version to deploy to the device. Use the `device_get_versions` datasource to get the list of available firmware versions
        """
        return pulumi.get(self, "target_version")

    @property
    @pulumi.getter
    def timestamp(self) -> pulumi.Output[builtins.float]:
        """
        Epoch (seconds)
        """
        return pulumi.get(self, "timestamp")

