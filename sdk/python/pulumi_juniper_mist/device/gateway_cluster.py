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

__all__ = ['GatewayClusterArgs', 'GatewayCluster']

@pulumi.input_type
class GatewayClusterArgs:
    def __init__(__self__, *,
                 nodes: pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]],
                 site_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a GatewayCluster resource.
        :param pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]] nodes: when replacing a node, either mac has to remain the same as existing cluster
        """
        pulumi.set(__self__, "nodes", nodes)
        pulumi.set(__self__, "site_id", site_id)

    @property
    @pulumi.getter
    def nodes(self) -> pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]:
        """
        when replacing a node, either mac has to remain the same as existing cluster
        """
        return pulumi.get(self, "nodes")

    @nodes.setter
    def nodes(self, value: pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]):
        pulumi.set(self, "nodes", value)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "site_id", value)


@pulumi.input_type
class _GatewayClusterState:
    def __init__(__self__, *,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]] = None,
                 site_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GatewayCluster resources.
        :param pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]] nodes: when replacing a node, either mac has to remain the same as existing cluster
        """
        if nodes is not None:
            pulumi.set(__self__, "nodes", nodes)
        if site_id is not None:
            pulumi.set(__self__, "site_id", site_id)

    @property
    @pulumi.getter
    def nodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]]:
        """
        when replacing a node, either mac has to remain the same as existing cluster
        """
        return pulumi.get(self, "nodes")

    @nodes.setter
    def nodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GatewayClusterNodeArgs']]]]):
        pulumi.set(self, "nodes", value)

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "site_id")

    @site_id.setter
    def site_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "site_id", value)


class GatewayCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GatewayClusterNodeArgs', 'GatewayClusterNodeArgsDict']]]]] = None,
                 site_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource can be used to form or delete a Gateway Clusters. It can be used with two Gateways assigned to the same site.
        Once the Cluster is formed, it can be create just like a Gateway with the `device.Gateway` resource:
        1. Claim the gateways and assign them to a site with the `org.Inventory` resource
        2. Form the Cluster with the `device.GatewayCluster` resource by providing the `site_id` and the two nodes MAC Addresses (the first in the list will be the node0)
        3. Configure the Cluster with the `device.Gateway` resource

        Please check the Juniper Documentation first to validate the cabling between the Gateways

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        cluster_one = junipermist.device.GatewayCluster("cluster_one",
            site_id=terraform_site2["id"],
            nodes=[
                {
                    "mac": "4c961000000",
                },
                {
                    "mac": "4c961000001",
                },
            ])
        ```

        ## Import

        ```sh
        $ pulumi import junipermist:device/gatewayCluster:GatewayCluster Using terraform import, import `mist_device_gateway_cluster` using the `import` command:
        ```

        Gateway cluster can be imported by specifying the org_id and the cluster_id

        ```sh
        $ pulumi import junipermist:device/gatewayCluster:GatewayCluster cluster_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        In Terraform v1.5.0 and later, use an import block to import `mist_device_gateway_cluster` with `id={org_id}.{cluster_id}`:

        tf

        import {

          to = mist_device_gateway_cluster.cluster_one

          id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"

        }

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GatewayClusterNodeArgs', 'GatewayClusterNodeArgsDict']]]] nodes: when replacing a node, either mac has to remain the same as existing cluster
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can be used to form or delete a Gateway Clusters. It can be used with two Gateways assigned to the same site.
        Once the Cluster is formed, it can be create just like a Gateway with the `device.Gateway` resource:
        1. Claim the gateways and assign them to a site with the `org.Inventory` resource
        2. Form the Cluster with the `device.GatewayCluster` resource by providing the `site_id` and the two nodes MAC Addresses (the first in the list will be the node0)
        3. Configure the Cluster with the `device.Gateway` resource

        Please check the Juniper Documentation first to validate the cabling between the Gateways

        ## Example Usage

        ```python
        import pulumi
        import pulumi_juniper_mist as junipermist

        cluster_one = junipermist.device.GatewayCluster("cluster_one",
            site_id=terraform_site2["id"],
            nodes=[
                {
                    "mac": "4c961000000",
                },
                {
                    "mac": "4c961000001",
                },
            ])
        ```

        ## Import

        ```sh
        $ pulumi import junipermist:device/gatewayCluster:GatewayCluster Using terraform import, import `mist_device_gateway_cluster` using the `import` command:
        ```

        Gateway cluster can be imported by specifying the org_id and the cluster_id

        ```sh
        $ pulumi import junipermist:device/gatewayCluster:GatewayCluster cluster_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
        ```

        In Terraform v1.5.0 and later, use an import block to import `mist_device_gateway_cluster` with `id={org_id}.{cluster_id}`:

        tf

        import {

          to = mist_device_gateway_cluster.cluster_one

          id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"

        }

        :param str resource_name: The name of the resource.
        :param GatewayClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GatewayClusterNodeArgs', 'GatewayClusterNodeArgsDict']]]]] = None,
                 site_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayClusterArgs.__new__(GatewayClusterArgs)

            if nodes is None and not opts.urn:
                raise TypeError("Missing required property 'nodes'")
            __props__.__dict__["nodes"] = nodes
            if site_id is None and not opts.urn:
                raise TypeError("Missing required property 'site_id'")
            __props__.__dict__["site_id"] = site_id
        super(GatewayCluster, __self__).__init__(
            'junipermist:device/gatewayCluster:GatewayCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            nodes: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GatewayClusterNodeArgs', 'GatewayClusterNodeArgsDict']]]]] = None,
            site_id: Optional[pulumi.Input[str]] = None) -> 'GatewayCluster':
        """
        Get an existing GatewayCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GatewayClusterNodeArgs', 'GatewayClusterNodeArgsDict']]]] nodes: when replacing a node, either mac has to remain the same as existing cluster
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayClusterState.__new__(_GatewayClusterState)

        __props__.__dict__["nodes"] = nodes
        __props__.__dict__["site_id"] = site_id
        return GatewayCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def nodes(self) -> pulumi.Output[Sequence['outputs.GatewayClusterNode']]:
        """
        when replacing a node, either mac has to remain the same as existing cluster
        """
        return pulumi.get(self, "nodes")

    @property
    @pulumi.getter(name="siteId")
    def site_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "site_id")

