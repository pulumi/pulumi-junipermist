// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package device

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource can be used to form or delete a Gateway Clusters.
//
// A Gateway Cluster can be formed with two Gateways assigned to the same site. Once the Cluster is formed, it can be configured just like a Gateway with the `device.Gateway` resource:
// 1. Claim the gateways and assign them to the same site with the `org.Inventory` resource
// 2. Form the Cluster with the `device.GatewayCluster` resource by providing the `siteId` and the MAC Addresses of two nodes (the first in the list will be the node0)
// 3. Configure the Cluster with the `device.Gateway` resource
//
// Please check the [SRX Juniper Documentation](https://www.juniper.net/documentation/us/en/software/mist/mist-wan/topics/topic-map/srx-high-availability-configuration.html)or the [SSR Juniper Documentation](https://www.juniper.net/documentation/us/en/software/mist/mist-wan/topics/topic-map/ssr-high-availability-configuration.html) first to validate the cabling between the Gateways
//
// > Both gateways must belong to the same site when creating the Gateway Cluster
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/device"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := device.NewGatewayCluster(ctx, "cluster_one", &device.GatewayClusterArgs{
//				SiteId: pulumi.Any(terraformSite2.Id),
//				Nodes: device.GatewayClusterNodeArray{
//					&device.GatewayClusterNodeArgs{
//						Mac: pulumi.String("4c961000000"),
//					},
//					&device.GatewayClusterNodeArgs{
//						Mac: pulumi.String("4c961000001"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import `mist_device_gateway_cluster` with:
//
// Gateway cluster can be imported by specifying the org_id and the cluster_id
//
// ```sh
// $ pulumi import junipermist:device/gatewayCluster:GatewayCluster cluster_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type GatewayCluster struct {
	pulumi.CustomResourceState

	// When replacing a node, either mac has to remain the same as existing cluster
	Nodes  GatewayClusterNodeArrayOutput `pulumi:"nodes"`
	SiteId pulumi.StringOutput           `pulumi:"siteId"`
}

// NewGatewayCluster registers a new resource with the given unique name, arguments, and options.
func NewGatewayCluster(ctx *pulumi.Context,
	name string, args *GatewayClusterArgs, opts ...pulumi.ResourceOption) (*GatewayCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Nodes == nil {
		return nil, errors.New("invalid value for required argument 'Nodes'")
	}
	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GatewayCluster
	err := ctx.RegisterResource("junipermist:device/gatewayCluster:GatewayCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewayCluster gets an existing GatewayCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewayCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayClusterState, opts ...pulumi.ResourceOption) (*GatewayCluster, error) {
	var resource GatewayCluster
	err := ctx.ReadResource("junipermist:device/gatewayCluster:GatewayCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewayCluster resources.
type gatewayClusterState struct {
	// When replacing a node, either mac has to remain the same as existing cluster
	Nodes  []GatewayClusterNode `pulumi:"nodes"`
	SiteId *string              `pulumi:"siteId"`
}

type GatewayClusterState struct {
	// When replacing a node, either mac has to remain the same as existing cluster
	Nodes  GatewayClusterNodeArrayInput
	SiteId pulumi.StringPtrInput
}

func (GatewayClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayClusterState)(nil)).Elem()
}

type gatewayClusterArgs struct {
	// When replacing a node, either mac has to remain the same as existing cluster
	Nodes  []GatewayClusterNode `pulumi:"nodes"`
	SiteId string               `pulumi:"siteId"`
}

// The set of arguments for constructing a GatewayCluster resource.
type GatewayClusterArgs struct {
	// When replacing a node, either mac has to remain the same as existing cluster
	Nodes  GatewayClusterNodeArrayInput
	SiteId pulumi.StringInput
}

func (GatewayClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayClusterArgs)(nil)).Elem()
}

type GatewayClusterInput interface {
	pulumi.Input

	ToGatewayClusterOutput() GatewayClusterOutput
	ToGatewayClusterOutputWithContext(ctx context.Context) GatewayClusterOutput
}

func (*GatewayCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayCluster)(nil)).Elem()
}

func (i *GatewayCluster) ToGatewayClusterOutput() GatewayClusterOutput {
	return i.ToGatewayClusterOutputWithContext(context.Background())
}

func (i *GatewayCluster) ToGatewayClusterOutputWithContext(ctx context.Context) GatewayClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayClusterOutput)
}

// GatewayClusterArrayInput is an input type that accepts GatewayClusterArray and GatewayClusterArrayOutput values.
// You can construct a concrete instance of `GatewayClusterArrayInput` via:
//
//	GatewayClusterArray{ GatewayClusterArgs{...} }
type GatewayClusterArrayInput interface {
	pulumi.Input

	ToGatewayClusterArrayOutput() GatewayClusterArrayOutput
	ToGatewayClusterArrayOutputWithContext(context.Context) GatewayClusterArrayOutput
}

type GatewayClusterArray []GatewayClusterInput

func (GatewayClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayCluster)(nil)).Elem()
}

func (i GatewayClusterArray) ToGatewayClusterArrayOutput() GatewayClusterArrayOutput {
	return i.ToGatewayClusterArrayOutputWithContext(context.Background())
}

func (i GatewayClusterArray) ToGatewayClusterArrayOutputWithContext(ctx context.Context) GatewayClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayClusterArrayOutput)
}

// GatewayClusterMapInput is an input type that accepts GatewayClusterMap and GatewayClusterMapOutput values.
// You can construct a concrete instance of `GatewayClusterMapInput` via:
//
//	GatewayClusterMap{ "key": GatewayClusterArgs{...} }
type GatewayClusterMapInput interface {
	pulumi.Input

	ToGatewayClusterMapOutput() GatewayClusterMapOutput
	ToGatewayClusterMapOutputWithContext(context.Context) GatewayClusterMapOutput
}

type GatewayClusterMap map[string]GatewayClusterInput

func (GatewayClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayCluster)(nil)).Elem()
}

func (i GatewayClusterMap) ToGatewayClusterMapOutput() GatewayClusterMapOutput {
	return i.ToGatewayClusterMapOutputWithContext(context.Background())
}

func (i GatewayClusterMap) ToGatewayClusterMapOutputWithContext(ctx context.Context) GatewayClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayClusterMapOutput)
}

type GatewayClusterOutput struct{ *pulumi.OutputState }

func (GatewayClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayCluster)(nil)).Elem()
}

func (o GatewayClusterOutput) ToGatewayClusterOutput() GatewayClusterOutput {
	return o
}

func (o GatewayClusterOutput) ToGatewayClusterOutputWithContext(ctx context.Context) GatewayClusterOutput {
	return o
}

// When replacing a node, either mac has to remain the same as existing cluster
func (o GatewayClusterOutput) Nodes() GatewayClusterNodeArrayOutput {
	return o.ApplyT(func(v *GatewayCluster) GatewayClusterNodeArrayOutput { return v.Nodes }).(GatewayClusterNodeArrayOutput)
}

func (o GatewayClusterOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayCluster) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

type GatewayClusterArrayOutput struct{ *pulumi.OutputState }

func (GatewayClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayCluster)(nil)).Elem()
}

func (o GatewayClusterArrayOutput) ToGatewayClusterArrayOutput() GatewayClusterArrayOutput {
	return o
}

func (o GatewayClusterArrayOutput) ToGatewayClusterArrayOutputWithContext(ctx context.Context) GatewayClusterArrayOutput {
	return o
}

func (o GatewayClusterArrayOutput) Index(i pulumi.IntInput) GatewayClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GatewayCluster {
		return vs[0].([]*GatewayCluster)[vs[1].(int)]
	}).(GatewayClusterOutput)
}

type GatewayClusterMapOutput struct{ *pulumi.OutputState }

func (GatewayClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayCluster)(nil)).Elem()
}

func (o GatewayClusterMapOutput) ToGatewayClusterMapOutput() GatewayClusterMapOutput {
	return o
}

func (o GatewayClusterMapOutput) ToGatewayClusterMapOutputWithContext(ctx context.Context) GatewayClusterMapOutput {
	return o
}

func (o GatewayClusterMapOutput) MapIndex(k pulumi.StringInput) GatewayClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GatewayCluster {
		return vs[0].(map[string]*GatewayCluster)[vs[1].(string)]
	}).(GatewayClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayClusterInput)(nil)).Elem(), &GatewayCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayClusterArrayInput)(nil)).Elem(), GatewayClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayClusterMapInput)(nil)).Elem(), GatewayClusterMap{})
	pulumi.RegisterOutputType(GatewayClusterOutput{})
	pulumi.RegisterOutputType(GatewayClusterArrayOutput{})
	pulumi.RegisterOutputType(GatewayClusterMapOutput{})
}
