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
from ._inputs import *

__all__ = ['RftemplateArgs', 'Rftemplate']

@pulumi.input_type
class RftemplateArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[_builtins.str],
                 ant_gain24: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain5: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain6: Optional[pulumi.Input[_builtins.int]] = None,
                 band24: Optional[pulumi.Input['RftemplateBand24Args']] = None,
                 band24_usage: Optional[pulumi.Input[_builtins.str]] = None,
                 band5: Optional[pulumi.Input['RftemplateBand5Args']] = None,
                 band5_on24_radio: Optional[pulumi.Input['RftemplateBand5On24RadioArgs']] = None,
                 band6: Optional[pulumi.Input['RftemplateBand6Args']] = None,
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 model_specific: Optional[pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 scanning_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a Rftemplate resource.
        :param pulumi.Input['RftemplateBand24Args'] band24: Radio Band AP settings
        :param pulumi.Input[_builtins.str] band24_usage: enum: `24`, `5`, `6`, `auto`
        :param pulumi.Input['RftemplateBand5Args'] band5: Radio Band AP settings
        :param pulumi.Input['RftemplateBand5On24RadioArgs'] band5_on24_radio: Radio Band AP settings
        :param pulumi.Input['RftemplateBand6Args'] band6: Radio Band AP settings
        :param pulumi.Input[_builtins.str] country_code: Optional, country code to use. If specified, this gets applied to all sites using the RF Template
        :param pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]] model_specific: overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        :param pulumi.Input[_builtins.str] name: The name of the RF template
        :param pulumi.Input[_builtins.bool] scanning_enabled: Whether scanning radio is enabled
        """
        pulumi.set(__self__, "org_id", org_id)
        if ant_gain24 is not None:
            pulumi.set(__self__, "ant_gain24", ant_gain24)
        if ant_gain5 is not None:
            pulumi.set(__self__, "ant_gain5", ant_gain5)
        if ant_gain6 is not None:
            pulumi.set(__self__, "ant_gain6", ant_gain6)
        if band24 is not None:
            pulumi.set(__self__, "band24", band24)
        if band24_usage is not None:
            pulumi.set(__self__, "band24_usage", band24_usage)
        if band5 is not None:
            pulumi.set(__self__, "band5", band5)
        if band5_on24_radio is not None:
            pulumi.set(__self__, "band5_on24_radio", band5_on24_radio)
        if band6 is not None:
            pulumi.set(__self__, "band6", band6)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if model_specific is not None:
            pulumi.set(__self__, "model_specific", model_specific)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if scanning_enabled is not None:
            pulumi.set(__self__, "scanning_enabled", scanning_enabled)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[_builtins.str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter(name="antGain24")
    def ant_gain24(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "ant_gain24")

    @ant_gain24.setter
    def ant_gain24(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ant_gain24", value)

    @_builtins.property
    @pulumi.getter(name="antGain5")
    def ant_gain5(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "ant_gain5")

    @ant_gain5.setter
    def ant_gain5(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ant_gain5", value)

    @_builtins.property
    @pulumi.getter(name="antGain6")
    def ant_gain6(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "ant_gain6")

    @ant_gain6.setter
    def ant_gain6(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ant_gain6", value)

    @_builtins.property
    @pulumi.getter
    def band24(self) -> Optional[pulumi.Input['RftemplateBand24Args']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band24")

    @band24.setter
    def band24(self, value: Optional[pulumi.Input['RftemplateBand24Args']]):
        pulumi.set(self, "band24", value)

    @_builtins.property
    @pulumi.getter(name="band24Usage")
    def band24_usage(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        enum: `24`, `5`, `6`, `auto`
        """
        return pulumi.get(self, "band24_usage")

    @band24_usage.setter
    def band24_usage(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "band24_usage", value)

    @_builtins.property
    @pulumi.getter
    def band5(self) -> Optional[pulumi.Input['RftemplateBand5Args']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band5")

    @band5.setter
    def band5(self, value: Optional[pulumi.Input['RftemplateBand5Args']]):
        pulumi.set(self, "band5", value)

    @_builtins.property
    @pulumi.getter(name="band5On24Radio")
    def band5_on24_radio(self) -> Optional[pulumi.Input['RftemplateBand5On24RadioArgs']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band5_on24_radio")

    @band5_on24_radio.setter
    def band5_on24_radio(self, value: Optional[pulumi.Input['RftemplateBand5On24RadioArgs']]):
        pulumi.set(self, "band5_on24_radio", value)

    @_builtins.property
    @pulumi.getter
    def band6(self) -> Optional[pulumi.Input['RftemplateBand6Args']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band6")

    @band6.setter
    def band6(self, value: Optional[pulumi.Input['RftemplateBand6Args']]):
        pulumi.set(self, "band6", value)

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional, country code to use. If specified, this gets applied to all sites using the RF Template
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "country_code", value)

    @_builtins.property
    @pulumi.getter(name="modelSpecific")
    def model_specific(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]]]:
        """
        overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        """
        return pulumi.get(self, "model_specific")

    @model_specific.setter
    def model_specific(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]]]):
        pulumi.set(self, "model_specific", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the RF template
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="scanningEnabled")
    def scanning_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether scanning radio is enabled
        """
        return pulumi.get(self, "scanning_enabled")

    @scanning_enabled.setter
    def scanning_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "scanning_enabled", value)


@pulumi.input_type
class _RftemplateState:
    def __init__(__self__, *,
                 ant_gain24: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain5: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain6: Optional[pulumi.Input[_builtins.int]] = None,
                 band24: Optional[pulumi.Input['RftemplateBand24Args']] = None,
                 band24_usage: Optional[pulumi.Input[_builtins.str]] = None,
                 band5: Optional[pulumi.Input['RftemplateBand5Args']] = None,
                 band5_on24_radio: Optional[pulumi.Input['RftemplateBand5On24RadioArgs']] = None,
                 band6: Optional[pulumi.Input['RftemplateBand6Args']] = None,
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 model_specific: Optional[pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scanning_enabled: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        Input properties used for looking up and filtering Rftemplate resources.
        :param pulumi.Input['RftemplateBand24Args'] band24: Radio Band AP settings
        :param pulumi.Input[_builtins.str] band24_usage: enum: `24`, `5`, `6`, `auto`
        :param pulumi.Input['RftemplateBand5Args'] band5: Radio Band AP settings
        :param pulumi.Input['RftemplateBand5On24RadioArgs'] band5_on24_radio: Radio Band AP settings
        :param pulumi.Input['RftemplateBand6Args'] band6: Radio Band AP settings
        :param pulumi.Input[_builtins.str] country_code: Optional, country code to use. If specified, this gets applied to all sites using the RF Template
        :param pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]] model_specific: overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        :param pulumi.Input[_builtins.str] name: The name of the RF template
        :param pulumi.Input[_builtins.bool] scanning_enabled: Whether scanning radio is enabled
        """
        if ant_gain24 is not None:
            pulumi.set(__self__, "ant_gain24", ant_gain24)
        if ant_gain5 is not None:
            pulumi.set(__self__, "ant_gain5", ant_gain5)
        if ant_gain6 is not None:
            pulumi.set(__self__, "ant_gain6", ant_gain6)
        if band24 is not None:
            pulumi.set(__self__, "band24", band24)
        if band24_usage is not None:
            pulumi.set(__self__, "band24_usage", band24_usage)
        if band5 is not None:
            pulumi.set(__self__, "band5", band5)
        if band5_on24_radio is not None:
            pulumi.set(__self__, "band5_on24_radio", band5_on24_radio)
        if band6 is not None:
            pulumi.set(__self__, "band6", band6)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if model_specific is not None:
            pulumi.set(__self__, "model_specific", model_specific)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if scanning_enabled is not None:
            pulumi.set(__self__, "scanning_enabled", scanning_enabled)

    @_builtins.property
    @pulumi.getter(name="antGain24")
    def ant_gain24(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "ant_gain24")

    @ant_gain24.setter
    def ant_gain24(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ant_gain24", value)

    @_builtins.property
    @pulumi.getter(name="antGain5")
    def ant_gain5(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "ant_gain5")

    @ant_gain5.setter
    def ant_gain5(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ant_gain5", value)

    @_builtins.property
    @pulumi.getter(name="antGain6")
    def ant_gain6(self) -> Optional[pulumi.Input[_builtins.int]]:
        return pulumi.get(self, "ant_gain6")

    @ant_gain6.setter
    def ant_gain6(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "ant_gain6", value)

    @_builtins.property
    @pulumi.getter
    def band24(self) -> Optional[pulumi.Input['RftemplateBand24Args']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band24")

    @band24.setter
    def band24(self, value: Optional[pulumi.Input['RftemplateBand24Args']]):
        pulumi.set(self, "band24", value)

    @_builtins.property
    @pulumi.getter(name="band24Usage")
    def band24_usage(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        enum: `24`, `5`, `6`, `auto`
        """
        return pulumi.get(self, "band24_usage")

    @band24_usage.setter
    def band24_usage(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "band24_usage", value)

    @_builtins.property
    @pulumi.getter
    def band5(self) -> Optional[pulumi.Input['RftemplateBand5Args']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band5")

    @band5.setter
    def band5(self, value: Optional[pulumi.Input['RftemplateBand5Args']]):
        pulumi.set(self, "band5", value)

    @_builtins.property
    @pulumi.getter(name="band5On24Radio")
    def band5_on24_radio(self) -> Optional[pulumi.Input['RftemplateBand5On24RadioArgs']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band5_on24_radio")

    @band5_on24_radio.setter
    def band5_on24_radio(self, value: Optional[pulumi.Input['RftemplateBand5On24RadioArgs']]):
        pulumi.set(self, "band5_on24_radio", value)

    @_builtins.property
    @pulumi.getter
    def band6(self) -> Optional[pulumi.Input['RftemplateBand6Args']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band6")

    @band6.setter
    def band6(self, value: Optional[pulumi.Input['RftemplateBand6Args']]):
        pulumi.set(self, "band6", value)

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional, country code to use. If specified, this gets applied to all sites using the RF Template
        """
        return pulumi.get(self, "country_code")

    @country_code.setter
    def country_code(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "country_code", value)

    @_builtins.property
    @pulumi.getter(name="modelSpecific")
    def model_specific(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]]]:
        """
        overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        """
        return pulumi.get(self, "model_specific")

    @model_specific.setter
    def model_specific(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input['RftemplateModelSpecificArgs']]]]):
        pulumi.set(self, "model_specific", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the RF template
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "org_id", value)

    @_builtins.property
    @pulumi.getter(name="scanningEnabled")
    def scanning_enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Whether scanning radio is enabled
        """
        return pulumi.get(self, "scanning_enabled")

    @scanning_enabled.setter
    def scanning_enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "scanning_enabled", value)


@pulumi.type_token("junipermist:org/rftemplate:Rftemplate")
class Rftemplate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ant_gain24: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain5: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain6: Optional[pulumi.Input[_builtins.int]] = None,
                 band24: Optional[pulumi.Input[Union['RftemplateBand24Args', 'RftemplateBand24ArgsDict']]] = None,
                 band24_usage: Optional[pulumi.Input[_builtins.str]] = None,
                 band5: Optional[pulumi.Input[Union['RftemplateBand5Args', 'RftemplateBand5ArgsDict']]] = None,
                 band5_on24_radio: Optional[pulumi.Input[Union['RftemplateBand5On24RadioArgs', 'RftemplateBand5On24RadioArgsDict']]] = None,
                 band6: Optional[pulumi.Input[Union['RftemplateBand6Args', 'RftemplateBand6ArgsDict']]] = None,
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 model_specific: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['RftemplateModelSpecificArgs', 'RftemplateModelSpecificArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scanning_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        This resource manages the RF Templates.

        The RF Templates can be used to define Wireless Access Points radio configuration, and can be assigned to the sites

        ## Import

        Using `pulumi import`, import `mist_org_rftemplate` with:

        Org RF Template can be imported by specifying the org_id and the rftemplate_id

        ```sh
        $ pulumi import junipermist:org/rftemplate:Rftemplate rftemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['RftemplateBand24Args', 'RftemplateBand24ArgsDict']] band24: Radio Band AP settings
        :param pulumi.Input[_builtins.str] band24_usage: enum: `24`, `5`, `6`, `auto`
        :param pulumi.Input[Union['RftemplateBand5Args', 'RftemplateBand5ArgsDict']] band5: Radio Band AP settings
        :param pulumi.Input[Union['RftemplateBand5On24RadioArgs', 'RftemplateBand5On24RadioArgsDict']] band5_on24_radio: Radio Band AP settings
        :param pulumi.Input[Union['RftemplateBand6Args', 'RftemplateBand6ArgsDict']] band6: Radio Band AP settings
        :param pulumi.Input[_builtins.str] country_code: Optional, country code to use. If specified, this gets applied to all sites using the RF Template
        :param pulumi.Input[Mapping[str, pulumi.Input[Union['RftemplateModelSpecificArgs', 'RftemplateModelSpecificArgsDict']]]] model_specific: overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        :param pulumi.Input[_builtins.str] name: The name of the RF template
        :param pulumi.Input[_builtins.bool] scanning_enabled: Whether scanning radio is enabled
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RftemplateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the RF Templates.

        The RF Templates can be used to define Wireless Access Points radio configuration, and can be assigned to the sites

        ## Import

        Using `pulumi import`, import `mist_org_rftemplate` with:

        Org RF Template can be imported by specifying the org_id and the rftemplate_id

        ```sh
        $ pulumi import junipermist:org/rftemplate:Rftemplate rftemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param RftemplateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RftemplateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ant_gain24: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain5: Optional[pulumi.Input[_builtins.int]] = None,
                 ant_gain6: Optional[pulumi.Input[_builtins.int]] = None,
                 band24: Optional[pulumi.Input[Union['RftemplateBand24Args', 'RftemplateBand24ArgsDict']]] = None,
                 band24_usage: Optional[pulumi.Input[_builtins.str]] = None,
                 band5: Optional[pulumi.Input[Union['RftemplateBand5Args', 'RftemplateBand5ArgsDict']]] = None,
                 band5_on24_radio: Optional[pulumi.Input[Union['RftemplateBand5On24RadioArgs', 'RftemplateBand5On24RadioArgsDict']]] = None,
                 band6: Optional[pulumi.Input[Union['RftemplateBand6Args', 'RftemplateBand6ArgsDict']]] = None,
                 country_code: Optional[pulumi.Input[_builtins.str]] = None,
                 model_specific: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['RftemplateModelSpecificArgs', 'RftemplateModelSpecificArgsDict']]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 org_id: Optional[pulumi.Input[_builtins.str]] = None,
                 scanning_enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RftemplateArgs.__new__(RftemplateArgs)

            __props__.__dict__["ant_gain24"] = ant_gain24
            __props__.__dict__["ant_gain5"] = ant_gain5
            __props__.__dict__["ant_gain6"] = ant_gain6
            __props__.__dict__["band24"] = band24
            __props__.__dict__["band24_usage"] = band24_usage
            __props__.__dict__["band5"] = band5
            __props__.__dict__["band5_on24_radio"] = band5_on24_radio
            __props__.__dict__["band6"] = band6
            __props__.__dict__["country_code"] = country_code
            __props__.__dict__["model_specific"] = model_specific
            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["scanning_enabled"] = scanning_enabled
        super(Rftemplate, __self__).__init__(
            'junipermist:org/rftemplate:Rftemplate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ant_gain24: Optional[pulumi.Input[_builtins.int]] = None,
            ant_gain5: Optional[pulumi.Input[_builtins.int]] = None,
            ant_gain6: Optional[pulumi.Input[_builtins.int]] = None,
            band24: Optional[pulumi.Input[Union['RftemplateBand24Args', 'RftemplateBand24ArgsDict']]] = None,
            band24_usage: Optional[pulumi.Input[_builtins.str]] = None,
            band5: Optional[pulumi.Input[Union['RftemplateBand5Args', 'RftemplateBand5ArgsDict']]] = None,
            band5_on24_radio: Optional[pulumi.Input[Union['RftemplateBand5On24RadioArgs', 'RftemplateBand5On24RadioArgsDict']]] = None,
            band6: Optional[pulumi.Input[Union['RftemplateBand6Args', 'RftemplateBand6ArgsDict']]] = None,
            country_code: Optional[pulumi.Input[_builtins.str]] = None,
            model_specific: Optional[pulumi.Input[Mapping[str, pulumi.Input[Union['RftemplateModelSpecificArgs', 'RftemplateModelSpecificArgsDict']]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            org_id: Optional[pulumi.Input[_builtins.str]] = None,
            scanning_enabled: Optional[pulumi.Input[_builtins.bool]] = None) -> 'Rftemplate':
        """
        Get an existing Rftemplate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['RftemplateBand24Args', 'RftemplateBand24ArgsDict']] band24: Radio Band AP settings
        :param pulumi.Input[_builtins.str] band24_usage: enum: `24`, `5`, `6`, `auto`
        :param pulumi.Input[Union['RftemplateBand5Args', 'RftemplateBand5ArgsDict']] band5: Radio Band AP settings
        :param pulumi.Input[Union['RftemplateBand5On24RadioArgs', 'RftemplateBand5On24RadioArgsDict']] band5_on24_radio: Radio Band AP settings
        :param pulumi.Input[Union['RftemplateBand6Args', 'RftemplateBand6ArgsDict']] band6: Radio Band AP settings
        :param pulumi.Input[_builtins.str] country_code: Optional, country code to use. If specified, this gets applied to all sites using the RF Template
        :param pulumi.Input[Mapping[str, pulumi.Input[Union['RftemplateModelSpecificArgs', 'RftemplateModelSpecificArgsDict']]]] model_specific: overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        :param pulumi.Input[_builtins.str] name: The name of the RF template
        :param pulumi.Input[_builtins.bool] scanning_enabled: Whether scanning radio is enabled
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RftemplateState.__new__(_RftemplateState)

        __props__.__dict__["ant_gain24"] = ant_gain24
        __props__.__dict__["ant_gain5"] = ant_gain5
        __props__.__dict__["ant_gain6"] = ant_gain6
        __props__.__dict__["band24"] = band24
        __props__.__dict__["band24_usage"] = band24_usage
        __props__.__dict__["band5"] = band5
        __props__.__dict__["band5_on24_radio"] = band5_on24_radio
        __props__.__dict__["band6"] = band6
        __props__.__dict__["country_code"] = country_code
        __props__.__dict__["model_specific"] = model_specific
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["scanning_enabled"] = scanning_enabled
        return Rftemplate(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="antGain24")
    def ant_gain24(self) -> pulumi.Output[_builtins.int]:
        return pulumi.get(self, "ant_gain24")

    @_builtins.property
    @pulumi.getter(name="antGain5")
    def ant_gain5(self) -> pulumi.Output[_builtins.int]:
        return pulumi.get(self, "ant_gain5")

    @_builtins.property
    @pulumi.getter(name="antGain6")
    def ant_gain6(self) -> pulumi.Output[_builtins.int]:
        return pulumi.get(self, "ant_gain6")

    @_builtins.property
    @pulumi.getter
    def band24(self) -> pulumi.Output[Optional['outputs.RftemplateBand24']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band24")

    @_builtins.property
    @pulumi.getter(name="band24Usage")
    def band24_usage(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        enum: `24`, `5`, `6`, `auto`
        """
        return pulumi.get(self, "band24_usage")

    @_builtins.property
    @pulumi.getter
    def band5(self) -> pulumi.Output[Optional['outputs.RftemplateBand5']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band5")

    @_builtins.property
    @pulumi.getter(name="band5On24Radio")
    def band5_on24_radio(self) -> pulumi.Output[Optional['outputs.RftemplateBand5On24Radio']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band5_on24_radio")

    @_builtins.property
    @pulumi.getter
    def band6(self) -> pulumi.Output[Optional['outputs.RftemplateBand6']]:
        """
        Radio Band AP settings
        """
        return pulumi.get(self, "band6")

    @_builtins.property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional, country code to use. If specified, this gets applied to all sites using the RF Template
        """
        return pulumi.get(self, "country_code")

    @_builtins.property
    @pulumi.getter(name="modelSpecific")
    def model_specific(self) -> pulumi.Output[Optional[Mapping[str, 'outputs.RftemplateModelSpecific']]]:
        """
        overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        """
        return pulumi.get(self, "model_specific")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the RF template
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[_builtins.str]:
        return pulumi.get(self, "org_id")

    @_builtins.property
    @pulumi.getter(name="scanningEnabled")
    def scanning_enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Whether scanning radio is enabled
        """
        return pulumi.get(self, "scanning_enabled")

