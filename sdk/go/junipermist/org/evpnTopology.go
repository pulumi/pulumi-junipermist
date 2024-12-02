// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Org Evpn Topologys.
// EVPN allows an alternative but more efficient LAN architecture utilizing VxLAN / MP-BGP to separate the control plane (MAC / IP Learning) from the forwarding plane.
//
// > To create or manage your EVPN Topology with the Mist Provider, please refer to the `How To - EVPN Topology` Guide.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mist/sdk/go/mist"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mist.NewOrgSiteEvpnTopology(ctx, "evpn_one", &mist.OrgSiteEvpnTopologyArgs{
//				OrgId: terraformTest.Id,
//				Name:  "evpn_one",
//				EvpnOptions: map[string]interface{}{
//					"routedAt": "core",
//					"overlay": map[string]interface{}{
//						"as": 65000,
//					},
//					"coreAsBorder":        true,
//					"autoLoopbackSubnet":  "172.16.192.0/24",
//					"autoLoopbackSubnet6": "fd33:ab00:2::/64",
//					"perVlanVgaV4Mac":     false,
//					"underlay": map[string]interface{}{
//						"asBase":  65001,
//						"useIpv6": false,
//						"subnet":  "10.255.240.0/20",
//					},
//					"autoRouterIdSubnet": "172.16.254.0/23",
//				},
//				Switches: []map[string]interface{}{
//					map[string]interface{}{
//						"mac":  "020004000001",
//						"role": "core",
//					},
//					map[string]interface{}{
//						"mac":  "02000400002",
//						"role": "core",
//					},
//					map[string]interface{}{
//						"mac":  "02000400003",
//						"role": "distribution",
//					},
//					map[string]interface{}{
//						"mac":  "02000400004",
//						"role": "distribution",
//					},
//					map[string]interface{}{
//						"mac":  "02000400005",
//						"role": "access",
//					},
//					map[string]interface{}{
//						"mac":  "02000400006",
//						"role": "access",
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
// Using `pulumi import`, import `mist_org_evpn_topology` with:
//
// EVPN Topology can be imported by specifying the org_id and the evpn_topology_id
//
// ```sh
// $ pulumi import junipermist:org/evpnTopology:EvpnTopology evpn_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type EvpnTopology struct {
	pulumi.CustomResourceState

	// EVPN Options
	EvpnOptions EvpnTopologyEvpnOptionsPtrOutput `pulumi:"evpnOptions"`
	Name        pulumi.StringOutput              `pulumi:"name"`
	OrgId       pulumi.StringOutput              `pulumi:"orgId"`
	// Property key is the pod number
	PodNames pulumi.StringMapOutput `pulumi:"podNames"`
	// Property key can be the switch MAC Address
	Switches EvpnTopologySwitchesMapOutput `pulumi:"switches"`
}

// NewEvpnTopology registers a new resource with the given unique name, arguments, and options.
func NewEvpnTopology(ctx *pulumi.Context,
	name string, args *EvpnTopologyArgs, opts ...pulumi.ResourceOption) (*EvpnTopology, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Switches == nil {
		return nil, errors.New("invalid value for required argument 'Switches'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EvpnTopology
	err := ctx.RegisterResource("junipermist:org/evpnTopology:EvpnTopology", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEvpnTopology gets an existing EvpnTopology resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEvpnTopology(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EvpnTopologyState, opts ...pulumi.ResourceOption) (*EvpnTopology, error) {
	var resource EvpnTopology
	err := ctx.ReadResource("junipermist:org/evpnTopology:EvpnTopology", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EvpnTopology resources.
type evpnTopologyState struct {
	// EVPN Options
	EvpnOptions *EvpnTopologyEvpnOptions `pulumi:"evpnOptions"`
	Name        *string                  `pulumi:"name"`
	OrgId       *string                  `pulumi:"orgId"`
	// Property key is the pod number
	PodNames map[string]string `pulumi:"podNames"`
	// Property key can be the switch MAC Address
	Switches map[string]EvpnTopologySwitches `pulumi:"switches"`
}

type EvpnTopologyState struct {
	// EVPN Options
	EvpnOptions EvpnTopologyEvpnOptionsPtrInput
	Name        pulumi.StringPtrInput
	OrgId       pulumi.StringPtrInput
	// Property key is the pod number
	PodNames pulumi.StringMapInput
	// Property key can be the switch MAC Address
	Switches EvpnTopologySwitchesMapInput
}

func (EvpnTopologyState) ElementType() reflect.Type {
	return reflect.TypeOf((*evpnTopologyState)(nil)).Elem()
}

type evpnTopologyArgs struct {
	// EVPN Options
	EvpnOptions *EvpnTopologyEvpnOptions `pulumi:"evpnOptions"`
	Name        *string                  `pulumi:"name"`
	OrgId       string                   `pulumi:"orgId"`
	// Property key is the pod number
	PodNames map[string]string `pulumi:"podNames"`
	// Property key can be the switch MAC Address
	Switches map[string]EvpnTopologySwitches `pulumi:"switches"`
}

// The set of arguments for constructing a EvpnTopology resource.
type EvpnTopologyArgs struct {
	// EVPN Options
	EvpnOptions EvpnTopologyEvpnOptionsPtrInput
	Name        pulumi.StringPtrInput
	OrgId       pulumi.StringInput
	// Property key is the pod number
	PodNames pulumi.StringMapInput
	// Property key can be the switch MAC Address
	Switches EvpnTopologySwitchesMapInput
}

func (EvpnTopologyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*evpnTopologyArgs)(nil)).Elem()
}

type EvpnTopologyInput interface {
	pulumi.Input

	ToEvpnTopologyOutput() EvpnTopologyOutput
	ToEvpnTopologyOutputWithContext(ctx context.Context) EvpnTopologyOutput
}

func (*EvpnTopology) ElementType() reflect.Type {
	return reflect.TypeOf((**EvpnTopology)(nil)).Elem()
}

func (i *EvpnTopology) ToEvpnTopologyOutput() EvpnTopologyOutput {
	return i.ToEvpnTopologyOutputWithContext(context.Background())
}

func (i *EvpnTopology) ToEvpnTopologyOutputWithContext(ctx context.Context) EvpnTopologyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EvpnTopologyOutput)
}

// EvpnTopologyArrayInput is an input type that accepts EvpnTopologyArray and EvpnTopologyArrayOutput values.
// You can construct a concrete instance of `EvpnTopologyArrayInput` via:
//
//	EvpnTopologyArray{ EvpnTopologyArgs{...} }
type EvpnTopologyArrayInput interface {
	pulumi.Input

	ToEvpnTopologyArrayOutput() EvpnTopologyArrayOutput
	ToEvpnTopologyArrayOutputWithContext(context.Context) EvpnTopologyArrayOutput
}

type EvpnTopologyArray []EvpnTopologyInput

func (EvpnTopologyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EvpnTopology)(nil)).Elem()
}

func (i EvpnTopologyArray) ToEvpnTopologyArrayOutput() EvpnTopologyArrayOutput {
	return i.ToEvpnTopologyArrayOutputWithContext(context.Background())
}

func (i EvpnTopologyArray) ToEvpnTopologyArrayOutputWithContext(ctx context.Context) EvpnTopologyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EvpnTopologyArrayOutput)
}

// EvpnTopologyMapInput is an input type that accepts EvpnTopologyMap and EvpnTopologyMapOutput values.
// You can construct a concrete instance of `EvpnTopologyMapInput` via:
//
//	EvpnTopologyMap{ "key": EvpnTopologyArgs{...} }
type EvpnTopologyMapInput interface {
	pulumi.Input

	ToEvpnTopologyMapOutput() EvpnTopologyMapOutput
	ToEvpnTopologyMapOutputWithContext(context.Context) EvpnTopologyMapOutput
}

type EvpnTopologyMap map[string]EvpnTopologyInput

func (EvpnTopologyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EvpnTopology)(nil)).Elem()
}

func (i EvpnTopologyMap) ToEvpnTopologyMapOutput() EvpnTopologyMapOutput {
	return i.ToEvpnTopologyMapOutputWithContext(context.Background())
}

func (i EvpnTopologyMap) ToEvpnTopologyMapOutputWithContext(ctx context.Context) EvpnTopologyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EvpnTopologyMapOutput)
}

type EvpnTopologyOutput struct{ *pulumi.OutputState }

func (EvpnTopologyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EvpnTopology)(nil)).Elem()
}

func (o EvpnTopologyOutput) ToEvpnTopologyOutput() EvpnTopologyOutput {
	return o
}

func (o EvpnTopologyOutput) ToEvpnTopologyOutputWithContext(ctx context.Context) EvpnTopologyOutput {
	return o
}

// EVPN Options
func (o EvpnTopologyOutput) EvpnOptions() EvpnTopologyEvpnOptionsPtrOutput {
	return o.ApplyT(func(v *EvpnTopology) EvpnTopologyEvpnOptionsPtrOutput { return v.EvpnOptions }).(EvpnTopologyEvpnOptionsPtrOutput)
}

func (o EvpnTopologyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EvpnTopology) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o EvpnTopologyOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *EvpnTopology) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Property key is the pod number
func (o EvpnTopologyOutput) PodNames() pulumi.StringMapOutput {
	return o.ApplyT(func(v *EvpnTopology) pulumi.StringMapOutput { return v.PodNames }).(pulumi.StringMapOutput)
}

// Property key can be the switch MAC Address
func (o EvpnTopologyOutput) Switches() EvpnTopologySwitchesMapOutput {
	return o.ApplyT(func(v *EvpnTopology) EvpnTopologySwitchesMapOutput { return v.Switches }).(EvpnTopologySwitchesMapOutput)
}

type EvpnTopologyArrayOutput struct{ *pulumi.OutputState }

func (EvpnTopologyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EvpnTopology)(nil)).Elem()
}

func (o EvpnTopologyArrayOutput) ToEvpnTopologyArrayOutput() EvpnTopologyArrayOutput {
	return o
}

func (o EvpnTopologyArrayOutput) ToEvpnTopologyArrayOutputWithContext(ctx context.Context) EvpnTopologyArrayOutput {
	return o
}

func (o EvpnTopologyArrayOutput) Index(i pulumi.IntInput) EvpnTopologyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EvpnTopology {
		return vs[0].([]*EvpnTopology)[vs[1].(int)]
	}).(EvpnTopologyOutput)
}

type EvpnTopologyMapOutput struct{ *pulumi.OutputState }

func (EvpnTopologyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EvpnTopology)(nil)).Elem()
}

func (o EvpnTopologyMapOutput) ToEvpnTopologyMapOutput() EvpnTopologyMapOutput {
	return o
}

func (o EvpnTopologyMapOutput) ToEvpnTopologyMapOutputWithContext(ctx context.Context) EvpnTopologyMapOutput {
	return o
}

func (o EvpnTopologyMapOutput) MapIndex(k pulumi.StringInput) EvpnTopologyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EvpnTopology {
		return vs[0].(map[string]*EvpnTopology)[vs[1].(string)]
	}).(EvpnTopologyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EvpnTopologyInput)(nil)).Elem(), &EvpnTopology{})
	pulumi.RegisterInputType(reflect.TypeOf((*EvpnTopologyArrayInput)(nil)).Elem(), EvpnTopologyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EvpnTopologyMapInput)(nil)).Elem(), EvpnTopologyMap{})
	pulumi.RegisterOutputType(EvpnTopologyOutput{})
	pulumi.RegisterOutputType(EvpnTopologyArrayOutput{})
	pulumi.RegisterOutputType(EvpnTopologyMapOutput{})
}
