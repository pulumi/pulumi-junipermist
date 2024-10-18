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
from ._inputs import *

__all__ = ['InventoryArgs', 'Inventory']

@pulumi.input_type
class InventoryArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 devices: Optional[pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]]] = None):
        """
        The set of arguments for constructing a Inventory resource.
        :param pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]] devices: Can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist Organization
               and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device already in the
               Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) Removing a device from the
               list will NOT release it unless `unclaim_when_destroyed` is set to `true`
        """
        pulumi.set(__self__, "org_id", org_id)
        if devices is not None:
            pulumi.set(__self__, "devices", devices)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def devices(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]]]:
        """
        Can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist Organization
        and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device already in the
        Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) Removing a device from the
        list will NOT release it unless `unclaim_when_destroyed` is set to `true`
        """
        return pulumi.get(self, "devices")

    @devices.setter
    def devices(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]]]):
        pulumi.set(self, "devices", value)


@pulumi.input_type
class _InventoryState:
    def __init__(__self__, *,
                 devices: Optional[pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]]] = None,
                 org_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Inventory resources.
        :param pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]] devices: Can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist Organization
               and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device already in the
               Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) Removing a device from the
               list will NOT release it unless `unclaim_when_destroyed` is set to `true`
        """
        if devices is not None:
            pulumi.set(__self__, "devices", devices)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter
    def devices(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]]]:
        """
        Can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist Organization
        and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device already in the
        Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) Removing a device from the
        list will NOT release it unless `unclaim_when_destroyed` is set to `true`
        """
        return pulumi.get(self, "devices")

    @devices.setter
    def devices(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['InventoryDevicesArgs']]]]):
        pulumi.set(self, "devices", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)


class Inventory(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 devices: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['InventoryDevicesArgs', 'InventoryDevicesArgsDict']]]]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource manages the Org inventory.
        It can be used to claim, unclaim, assign, unassign, reassign devices

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        inventory = junipermist.org.Inventory("inventory",
            org_id=terraform_test["id"],
            devices={
                "CPKL2EXXXXXXXXX": {},
                "G87JHBFXXXXXXXX": {
                    "site_id": terraform_site["id"],
                    "unclaim_when_destroyed": True,
                },
                "2c2131000000": {
                    "site_id": terraform_site["id"],
                    "unclaim_when_destroyed": True,
                },
                "2c2131000001": {
                    "unclaim_when_destroyed": False,
                },
            })
        ```

        ## Import

        Using `pulumi import`, import `mist_org_inventory` with:

        Org Inventory can be imported by specifying the org_id

        ```sh
        $ pulumi import junipermist:org/inventory:Inventory inventory_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[Union['InventoryDevicesArgs', 'InventoryDevicesArgsDict']]]] devices: Can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist Organization
               and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device already in the
               Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) Removing a device from the
               list will NOT release it unless `unclaim_when_destroyed` is set to `true`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InventoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the Org inventory.
        It can be used to claim, unclaim, assign, unassign, reassign devices

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        inventory = junipermist.org.Inventory("inventory",
            org_id=terraform_test["id"],
            devices={
                "CPKL2EXXXXXXXXX": {},
                "G87JHBFXXXXXXXX": {
                    "site_id": terraform_site["id"],
                    "unclaim_when_destroyed": True,
                },
                "2c2131000000": {
                    "site_id": terraform_site["id"],
                    "unclaim_when_destroyed": True,
                },
                "2c2131000001": {
                    "unclaim_when_destroyed": False,
                },
            })
        ```

        ## Import

        Using `pulumi import`, import `mist_org_inventory` with:

        Org Inventory can be imported by specifying the org_id

        ```sh
        $ pulumi import junipermist:org/inventory:Inventory inventory_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
        ```

        :param str resource_name: The name of the resource.
        :param InventoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InventoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 devices: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['InventoryDevicesArgs', 'InventoryDevicesArgsDict']]]]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InventoryArgs.__new__(InventoryArgs)

            __props__.__dict__["devices"] = devices
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
        super(Inventory, __self__).__init__(
            'junipermist:org/inventory:Inventory',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            devices: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['InventoryDevicesArgs', 'InventoryDevicesArgsDict']]]]] = None,
            org_id: Optional[pulumi.Input[str]] = None) -> 'Inventory':
        """
        Get an existing Inventory resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[Union['InventoryDevicesArgs', 'InventoryDevicesArgsDict']]]] devices: Can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist Organization
               and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device already in the
               Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) Removing a device from the
               list will NOT release it unless `unclaim_when_destroyed` is set to `true`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InventoryState.__new__(_InventoryState)

        __props__.__dict__["devices"] = devices
        __props__.__dict__["org_id"] = org_id
        return Inventory(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def devices(self) -> pulumi.Output[Mapping[str, 'outputs.InventoryDevices']]:
        """
        Can be the device Claim Code or the device MAC Address: * Claim Code: used to claim the device to the Mist Organization
        and manage it. Format is `[0-9A-Z]{15}` (e.g `01234ABCDE56789`) * MAC Address: used to managed a device already in the
        Mist Organization (claimed or adopted devices). Format is `[0-9a-f]{12}` (e.g `5684dae9ac8b`) Removing a device from the
        list will NOT release it unless `unclaim_when_destroyed` is set to `true`
        """
        return pulumi.get(self, "devices")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")

