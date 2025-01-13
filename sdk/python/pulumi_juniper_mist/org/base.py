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

__all__ = ['BaseArgs', 'Base']

@pulumi.input_type
class BaseArgs:
    def __init__(__self__, *,
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 allow_mist: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 session_expiry: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a Base resource.
        """
        if alarmtemplate_id is not None:
            pulumi.set(__self__, "alarmtemplate_id", alarmtemplate_id)
        if allow_mist is not None:
            pulumi.set(__self__, "allow_mist", allow_mist)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if session_expiry is not None:
            pulumi.set(__self__, "session_expiry", session_expiry)

    @property
    @pulumi.getter(name="alarmtemplateId")
    def alarmtemplate_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "alarmtemplate_id")

    @alarmtemplate_id.setter
    def alarmtemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alarmtemplate_id", value)

    @property
    @pulumi.getter(name="allowMist")
    def allow_mist(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "allow_mist")

    @allow_mist.setter
    def allow_mist(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_mist", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sessionExpiry")
    def session_expiry(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "session_expiry")

    @session_expiry.setter
    def session_expiry(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "session_expiry", value)


@pulumi.input_type
class _BaseState:
    def __init__(__self__, *,
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 allow_mist: Optional[pulumi.Input[bool]] = None,
                 msp_id: Optional[pulumi.Input[str]] = None,
                 msp_logo_url: Optional[pulumi.Input[str]] = None,
                 msp_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 orggroup_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 session_expiry: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering Base resources.
        :param pulumi.Input[str] msp_logo_url: logo uploaded by the MSP with advanced tier, only present if provided
        :param pulumi.Input[str] msp_name: name of the msp the org belongs to
        """
        if alarmtemplate_id is not None:
            pulumi.set(__self__, "alarmtemplate_id", alarmtemplate_id)
        if allow_mist is not None:
            pulumi.set(__self__, "allow_mist", allow_mist)
        if msp_id is not None:
            pulumi.set(__self__, "msp_id", msp_id)
        if msp_logo_url is not None:
            pulumi.set(__self__, "msp_logo_url", msp_logo_url)
        if msp_name is not None:
            pulumi.set(__self__, "msp_name", msp_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if orggroup_ids is not None:
            pulumi.set(__self__, "orggroup_ids", orggroup_ids)
        if session_expiry is not None:
            pulumi.set(__self__, "session_expiry", session_expiry)

    @property
    @pulumi.getter(name="alarmtemplateId")
    def alarmtemplate_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "alarmtemplate_id")

    @alarmtemplate_id.setter
    def alarmtemplate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alarmtemplate_id", value)

    @property
    @pulumi.getter(name="allowMist")
    def allow_mist(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "allow_mist")

    @allow_mist.setter
    def allow_mist(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_mist", value)

    @property
    @pulumi.getter(name="mspId")
    def msp_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "msp_id")

    @msp_id.setter
    def msp_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "msp_id", value)

    @property
    @pulumi.getter(name="mspLogoUrl")
    def msp_logo_url(self) -> Optional[pulumi.Input[str]]:
        """
        logo uploaded by the MSP with advanced tier, only present if provided
        """
        return pulumi.get(self, "msp_logo_url")

    @msp_logo_url.setter
    def msp_logo_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "msp_logo_url", value)

    @property
    @pulumi.getter(name="mspName")
    def msp_name(self) -> Optional[pulumi.Input[str]]:
        """
        name of the msp the org belongs to
        """
        return pulumi.get(self, "msp_name")

    @msp_name.setter
    def msp_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "msp_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orggroupIds")
    def orggroup_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "orggroup_ids")

    @orggroup_ids.setter
    def orggroup_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "orggroup_ids", value)

    @property
    @pulumi.getter(name="sessionExpiry")
    def session_expiry(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "session_expiry")

    @session_expiry.setter
    def session_expiry(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "session_expiry", value)


class Base(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 allow_mist: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 session_expiry: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        This resource manages the Mist Organization.

        An organization usually represents a customer - which has inventories, licenses. An Organization can contain multiple sites. A site usually represents a deployment at the same location (a campus, an office).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        org_one = junipermist.org.Base("org_one",
            name="Org One",
            alarmtemplate_id=alarmtemplate_one["id"])
        ```

        ## Import

        Using `pulumi import`, import `mist_org` with:

        Organization can be imported by specifying the org_id

        ```sh
        $ pulumi import junipermist:org/base:base org_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[BaseArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the Mist Organization.

        An organization usually represents a customer - which has inventories, licenses. An Organization can contain multiple sites. A site usually represents a deployment at the same location (a campus, an office).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        org_one = junipermist.org.Base("org_one",
            name="Org One",
            alarmtemplate_id=alarmtemplate_one["id"])
        ```

        ## Import

        Using `pulumi import`, import `mist_org` with:

        Organization can be imported by specifying the org_id

        ```sh
        $ pulumi import junipermist:org/base:base org_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
        ```

        :param str resource_name: The name of the resource.
        :param BaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alarmtemplate_id: Optional[pulumi.Input[str]] = None,
                 allow_mist: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 session_expiry: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BaseArgs.__new__(BaseArgs)

            __props__.__dict__["alarmtemplate_id"] = alarmtemplate_id
            __props__.__dict__["allow_mist"] = allow_mist
            __props__.__dict__["name"] = name
            __props__.__dict__["session_expiry"] = session_expiry
            __props__.__dict__["msp_id"] = None
            __props__.__dict__["msp_logo_url"] = None
            __props__.__dict__["msp_name"] = None
            __props__.__dict__["orggroup_ids"] = None
        super(Base, __self__).__init__(
            'junipermist:org/base:base',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alarmtemplate_id: Optional[pulumi.Input[str]] = None,
            allow_mist: Optional[pulumi.Input[bool]] = None,
            msp_id: Optional[pulumi.Input[str]] = None,
            msp_logo_url: Optional[pulumi.Input[str]] = None,
            msp_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            orggroup_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            session_expiry: Optional[pulumi.Input[int]] = None) -> 'Base':
        """
        Get an existing Base resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] msp_logo_url: logo uploaded by the MSP with advanced tier, only present if provided
        :param pulumi.Input[str] msp_name: name of the msp the org belongs to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BaseState.__new__(_BaseState)

        __props__.__dict__["alarmtemplate_id"] = alarmtemplate_id
        __props__.__dict__["allow_mist"] = allow_mist
        __props__.__dict__["msp_id"] = msp_id
        __props__.__dict__["msp_logo_url"] = msp_logo_url
        __props__.__dict__["msp_name"] = msp_name
        __props__.__dict__["name"] = name
        __props__.__dict__["orggroup_ids"] = orggroup_ids
        __props__.__dict__["session_expiry"] = session_expiry
        return Base(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alarmtemplateId")
    def alarmtemplate_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "alarmtemplate_id")

    @property
    @pulumi.getter(name="allowMist")
    def allow_mist(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "allow_mist")

    @property
    @pulumi.getter(name="mspId")
    def msp_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "msp_id")

    @property
    @pulumi.getter(name="mspLogoUrl")
    def msp_logo_url(self) -> pulumi.Output[str]:
        """
        logo uploaded by the MSP with advanced tier, only present if provided
        """
        return pulumi.get(self, "msp_logo_url")

    @property
    @pulumi.getter(name="mspName")
    def msp_name(self) -> pulumi.Output[str]:
        """
        name of the msp the org belongs to
        """
        return pulumi.get(self, "msp_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orggroupIds")
    def orggroup_ids(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "orggroup_ids")

    @property
    @pulumi.getter(name="sessionExpiry")
    def session_expiry(self) -> pulumi.Output[int]:
        return pulumi.get(self, "session_expiry")

