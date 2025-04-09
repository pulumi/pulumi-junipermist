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

__all__ = ['AvprofileArgs', 'Avprofile']

@pulumi.input_type
class AvprofileArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 protocols: pulumi.Input[Sequence[pulumi.Input[str]]],
                 fallback_action: Optional[pulumi.Input[str]] = None,
                 max_filesize: Optional[pulumi.Input[int]] = None,
                 mime_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 url_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Avprofile resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
        :param pulumi.Input[str] fallback_action: enum: `block`, `log-and-permit`, `permit`
        :param pulumi.Input[int] max_filesize: In KB
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "protocols", protocols)
        if fallback_action is not None:
            pulumi.set(__self__, "fallback_action", fallback_action)
        if max_filesize is not None:
            pulumi.set(__self__, "max_filesize", max_filesize)
        if mime_whitelists is not None:
            pulumi.set(__self__, "mime_whitelists", mime_whitelists)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if url_whitelists is not None:
            pulumi.set(__self__, "url_whitelists", url_whitelists)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def protocols(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
        """
        return pulumi.get(self, "protocols")

    @protocols.setter
    def protocols(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "protocols", value)

    @property
    @pulumi.getter(name="fallbackAction")
    def fallback_action(self) -> Optional[pulumi.Input[str]]:
        """
        enum: `block`, `log-and-permit`, `permit`
        """
        return pulumi.get(self, "fallback_action")

    @fallback_action.setter
    def fallback_action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fallback_action", value)

    @property
    @pulumi.getter(name="maxFilesize")
    def max_filesize(self) -> Optional[pulumi.Input[int]]:
        """
        In KB
        """
        return pulumi.get(self, "max_filesize")

    @max_filesize.setter
    def max_filesize(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_filesize", value)

    @property
    @pulumi.getter(name="mimeWhitelists")
    def mime_whitelists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "mime_whitelists")

    @mime_whitelists.setter
    def mime_whitelists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "mime_whitelists", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="urlWhitelists")
    def url_whitelists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "url_whitelists")

    @url_whitelists.setter
    def url_whitelists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "url_whitelists", value)


@pulumi.input_type
class _AvprofileState:
    def __init__(__self__, *,
                 fallback_action: Optional[pulumi.Input[str]] = None,
                 max_filesize: Optional[pulumi.Input[int]] = None,
                 mime_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Avprofile resources.
        :param pulumi.Input[str] fallback_action: enum: `block`, `log-and-permit`, `permit`
        :param pulumi.Input[int] max_filesize: In KB
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
        """
        if fallback_action is not None:
            pulumi.set(__self__, "fallback_action", fallback_action)
        if max_filesize is not None:
            pulumi.set(__self__, "max_filesize", max_filesize)
        if mime_whitelists is not None:
            pulumi.set(__self__, "mime_whitelists", mime_whitelists)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if protocols is not None:
            pulumi.set(__self__, "protocols", protocols)
        if url_whitelists is not None:
            pulumi.set(__self__, "url_whitelists", url_whitelists)

    @property
    @pulumi.getter(name="fallbackAction")
    def fallback_action(self) -> Optional[pulumi.Input[str]]:
        """
        enum: `block`, `log-and-permit`, `permit`
        """
        return pulumi.get(self, "fallback_action")

    @fallback_action.setter
    def fallback_action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fallback_action", value)

    @property
    @pulumi.getter(name="maxFilesize")
    def max_filesize(self) -> Optional[pulumi.Input[int]]:
        """
        In KB
        """
        return pulumi.get(self, "max_filesize")

    @max_filesize.setter
    def max_filesize(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_filesize", value)

    @property
    @pulumi.getter(name="mimeWhitelists")
    def mime_whitelists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "mime_whitelists")

    @mime_whitelists.setter
    def mime_whitelists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "mime_whitelists", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def protocols(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
        """
        return pulumi.get(self, "protocols")

    @protocols.setter
    def protocols(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "protocols", value)

    @property
    @pulumi.getter(name="urlWhitelists")
    def url_whitelists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "url_whitelists")

    @url_whitelists.setter
    def url_whitelists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "url_whitelists", value)


class Avprofile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 fallback_action: Optional[pulumi.Input[str]] = None,
                 max_filesize: Optional[pulumi.Input[int]] = None,
                 mime_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        This resource manages the Org Antivirus Profile.

        An Antivirus Profile is used to configure the Antivirus feature on SRX devices. It specifies which content the Antivirus should analyse and which content should be ignored.

        The Antivirus profiles can be used within the following resources:
         * `mist_org_servicepolicy.antivirus`
         * `mist_org_gatewaytemplate.service_policies.antivirus`
         * `mist_org_deviceprofile_gateway.service_policies.antivirus`
         * `mist_device_gateway.service_policies.antivirus`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        avprofile_one = junipermist.org.Avprofile("avprofile_one",
            org_id=terraform_test["id"],
            fallback_action="block",
            max_filesize=5000,
            mime_whitelists=["image/png"],
            name="avprofile_one",
            protocols=[
                "ftp",
                "http",
                "imap",
                "pop3",
                "smtp",
            ],
            url_whitelists=["www.google.fr"])
        ```

        ## Import

        Using `pulumi import`, import `mist_org_avprofile` with:

        IDP Profile can be imported by specifying the org_id and the avprofile_id

        ```sh
        $ pulumi import junipermist:org/avprofile:Avprofile avprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] fallback_action: enum: `block`, `log-and-permit`, `permit`
        :param pulumi.Input[int] max_filesize: In KB
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AvprofileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource manages the Org Antivirus Profile.

        An Antivirus Profile is used to configure the Antivirus feature on SRX devices. It specifies which content the Antivirus should analyse and which content should be ignored.

        The Antivirus profiles can be used within the following resources:
         * `mist_org_servicepolicy.antivirus`
         * `mist_org_gatewaytemplate.service_policies.antivirus`
         * `mist_org_deviceprofile_gateway.service_policies.antivirus`
         * `mist_device_gateway.service_policies.antivirus`

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        avprofile_one = junipermist.org.Avprofile("avprofile_one",
            org_id=terraform_test["id"],
            fallback_action="block",
            max_filesize=5000,
            mime_whitelists=["image/png"],
            name="avprofile_one",
            protocols=[
                "ftp",
                "http",
                "imap",
                "pop3",
                "smtp",
            ],
            url_whitelists=["www.google.fr"])
        ```

        ## Import

        Using `pulumi import`, import `mist_org_avprofile` with:

        IDP Profile can be imported by specifying the org_id and the avprofile_id

        ```sh
        $ pulumi import junipermist:org/avprofile:Avprofile avprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        :param str resource_name: The name of the resource.
        :param AvprofileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AvprofileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 fallback_action: Optional[pulumi.Input[str]] = None,
                 max_filesize: Optional[pulumi.Input[int]] = None,
                 mime_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AvprofileArgs.__new__(AvprofileArgs)

            __props__.__dict__["fallback_action"] = fallback_action
            __props__.__dict__["max_filesize"] = max_filesize
            __props__.__dict__["mime_whitelists"] = mime_whitelists
            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if protocols is None and not opts.urn:
                raise TypeError("Missing required property 'protocols'")
            __props__.__dict__["protocols"] = protocols
            __props__.__dict__["url_whitelists"] = url_whitelists
        super(Avprofile, __self__).__init__(
            'junipermist:org/avprofile:Avprofile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            fallback_action: Optional[pulumi.Input[str]] = None,
            max_filesize: Optional[pulumi.Input[int]] = None,
            mime_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            protocols: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            url_whitelists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Avprofile':
        """
        Get an existing Avprofile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] fallback_action: enum: `block`, `log-and-permit`, `permit`
        :param pulumi.Input[int] max_filesize: In KB
        :param pulumi.Input[Sequence[pulumi.Input[str]]] protocols: List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AvprofileState.__new__(_AvprofileState)

        __props__.__dict__["fallback_action"] = fallback_action
        __props__.__dict__["max_filesize"] = max_filesize
        __props__.__dict__["mime_whitelists"] = mime_whitelists
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["protocols"] = protocols
        __props__.__dict__["url_whitelists"] = url_whitelists
        return Avprofile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="fallbackAction")
    def fallback_action(self) -> pulumi.Output[Optional[str]]:
        """
        enum: `block`, `log-and-permit`, `permit`
        """
        return pulumi.get(self, "fallback_action")

    @property
    @pulumi.getter(name="maxFilesize")
    def max_filesize(self) -> pulumi.Output[int]:
        """
        In KB
        """
        return pulumi.get(self, "max_filesize")

    @property
    @pulumi.getter(name="mimeWhitelists")
    def mime_whitelists(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "mime_whitelists")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def protocols(self) -> pulumi.Output[Sequence[str]]:
        """
        List of protocols to monitor. enum: `ftp`, `http`, `imap`, `pop3`, `smtp`
        """
        return pulumi.get(self, "protocols")

    @property
    @pulumi.getter(name="urlWhitelists")
    def url_whitelists(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "url_whitelists")

