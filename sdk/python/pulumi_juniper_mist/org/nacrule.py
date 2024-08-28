# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NacruleArgs', 'Nacrule']

@pulumi.input_type
class NacruleArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[str],
                 order: pulumi.Input[int],
                 org_id: pulumi.Input[str],
                 apply_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matching: Optional[pulumi.Input['NacruleMatchingArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_matching: Optional[pulumi.Input['NacruleNotMatchingArgs']] = None):
        """
        The set of arguments for constructing a Nacrule resource.
        :param pulumi.Input[str] action: enum: `allow`, `block`
        :param pulumi.Input[int] order: the order of the rule, lower value implies higher priority
        :param pulumi.Input[Sequence[pulumi.Input[str]]] apply_tags: all optional, this goes into Access-Accept
        :param pulumi.Input[bool] enabled: enabled or not
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "order", order)
        pulumi.set(__self__, "org_id", org_id)
        if apply_tags is not None:
            pulumi.set(__self__, "apply_tags", apply_tags)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if matching is not None:
            pulumi.set(__self__, "matching", matching)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if not_matching is not None:
            pulumi.set(__self__, "not_matching", not_matching)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[str]:
        """
        enum: `allow`, `block`
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def order(self) -> pulumi.Input[int]:
        """
        the order of the rule, lower value implies higher priority
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: pulumi.Input[int]):
        pulumi.set(self, "order", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="applyTags")
    def apply_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        all optional, this goes into Access-Accept
        """
        return pulumi.get(self, "apply_tags")

    @apply_tags.setter
    def apply_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "apply_tags", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        enabled or not
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def matching(self) -> Optional[pulumi.Input['NacruleMatchingArgs']]:
        return pulumi.get(self, "matching")

    @matching.setter
    def matching(self, value: Optional[pulumi.Input['NacruleMatchingArgs']]):
        pulumi.set(self, "matching", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notMatching")
    def not_matching(self) -> Optional[pulumi.Input['NacruleNotMatchingArgs']]:
        return pulumi.get(self, "not_matching")

    @not_matching.setter
    def not_matching(self, value: Optional[pulumi.Input['NacruleNotMatchingArgs']]):
        pulumi.set(self, "not_matching", value)


@pulumi.input_type
class _NacruleState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 apply_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matching: Optional[pulumi.Input['NacruleMatchingArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_matching: Optional[pulumi.Input['NacruleNotMatchingArgs']] = None,
                 order: Optional[pulumi.Input[int]] = None,
                 org_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Nacrule resources.
        :param pulumi.Input[str] action: enum: `allow`, `block`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] apply_tags: all optional, this goes into Access-Accept
        :param pulumi.Input[bool] enabled: enabled or not
        :param pulumi.Input[int] order: the order of the rule, lower value implies higher priority
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if apply_tags is not None:
            pulumi.set(__self__, "apply_tags", apply_tags)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if matching is not None:
            pulumi.set(__self__, "matching", matching)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if not_matching is not None:
            pulumi.set(__self__, "not_matching", not_matching)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        enum: `allow`, `block`
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter(name="applyTags")
    def apply_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        all optional, this goes into Access-Accept
        """
        return pulumi.get(self, "apply_tags")

    @apply_tags.setter
    def apply_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "apply_tags", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        enabled or not
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def matching(self) -> Optional[pulumi.Input['NacruleMatchingArgs']]:
        return pulumi.get(self, "matching")

    @matching.setter
    def matching(self, value: Optional[pulumi.Input['NacruleMatchingArgs']]):
        pulumi.set(self, "matching", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notMatching")
    def not_matching(self) -> Optional[pulumi.Input['NacruleNotMatchingArgs']]:
        return pulumi.get(self, "not_matching")

    @not_matching.setter
    def not_matching(self, value: Optional[pulumi.Input['NacruleNotMatchingArgs']]):
        pulumi.set(self, "not_matching", value)

    @property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[int]]:
        """
        the order of the rule, lower value implies higher priority
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "order", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)


class Nacrule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 apply_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matching: Optional[pulumi.Input[Union['NacruleMatchingArgs', 'NacruleMatchingArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_matching: Optional[pulumi.Input[Union['NacruleNotMatchingArgs', 'NacruleNotMatchingArgsDict']]] = None,
                 order: Optional[pulumi.Input[int]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource manages the NAC Rules (Auth Policies).A NAC Rule defines a list of critera (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return

        ## Import

        ```sh
        $ pulumi import junipermist:org/nacrule:Nacrule Using terraform import, import `mist_org_nacrule` using the `import` command:
        ```

        Gateway cluster can be imported by specifying the org_id and the nacrule_id

        ```sh
        $ pulumi import junipermist:org/nacrule:Nacrule nacrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: enum: `allow`, `block`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] apply_tags: all optional, this goes into Access-Accept
        :param pulumi.Input[bool] enabled: enabled or not
        :param pulumi.Input[int] order: the order of the rule, lower value implies higher priority
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NacruleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the NAC Rules (Auth Policies).A NAC Rule defines a list of critera (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return

        ## Import

        ```sh
        $ pulumi import junipermist:org/nacrule:Nacrule Using terraform import, import `mist_org_nacrule` using the `import` command:
        ```

        Gateway cluster can be imported by specifying the org_id and the nacrule_id

        ```sh
        $ pulumi import junipermist:org/nacrule:Nacrule nacrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param NacruleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NacruleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 apply_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 matching: Optional[pulumi.Input[Union['NacruleMatchingArgs', 'NacruleMatchingArgsDict']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 not_matching: Optional[pulumi.Input[Union['NacruleNotMatchingArgs', 'NacruleNotMatchingArgsDict']]] = None,
                 order: Optional[pulumi.Input[int]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NacruleArgs.__new__(NacruleArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            __props__.__dict__["apply_tags"] = apply_tags
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["matching"] = matching
            __props__.__dict__["name"] = name
            __props__.__dict__["not_matching"] = not_matching
            if order is None and not opts.urn:
                raise TypeError("Missing required property 'order'")
            __props__.__dict__["order"] = order
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
        super(Nacrule, __self__).__init__(
            'junipermist:org/nacrule:Nacrule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[str]] = None,
            apply_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            matching: Optional[pulumi.Input[Union['NacruleMatchingArgs', 'NacruleMatchingArgsDict']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            not_matching: Optional[pulumi.Input[Union['NacruleNotMatchingArgs', 'NacruleNotMatchingArgsDict']]] = None,
            order: Optional[pulumi.Input[int]] = None,
            org_id: Optional[pulumi.Input[str]] = None) -> 'Nacrule':
        """
        Get an existing Nacrule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: enum: `allow`, `block`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] apply_tags: all optional, this goes into Access-Accept
        :param pulumi.Input[bool] enabled: enabled or not
        :param pulumi.Input[int] order: the order of the rule, lower value implies higher priority
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NacruleState.__new__(_NacruleState)

        __props__.__dict__["action"] = action
        __props__.__dict__["apply_tags"] = apply_tags
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["matching"] = matching
        __props__.__dict__["name"] = name
        __props__.__dict__["not_matching"] = not_matching
        __props__.__dict__["order"] = order
        __props__.__dict__["org_id"] = org_id
        return Nacrule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        enum: `allow`, `block`
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter(name="applyTags")
    def apply_tags(self) -> pulumi.Output[Sequence[str]]:
        """
        all optional, this goes into Access-Accept
        """
        return pulumi.get(self, "apply_tags")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        enabled or not
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def matching(self) -> pulumi.Output[Optional['outputs.NacruleMatching']]:
        return pulumi.get(self, "matching")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notMatching")
    def not_matching(self) -> pulumi.Output[Optional['outputs.NacruleNotMatching']]:
        return pulumi.get(self, "not_matching")

    @property
    @pulumi.getter
    def order(self) -> pulumi.Output[int]:
        """
        the order of the rule, lower value implies higher priority
        """
        return pulumi.get(self, "order")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")
