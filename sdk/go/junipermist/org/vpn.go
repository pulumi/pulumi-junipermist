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

// This resource manages the Org VPN.
//
// ## Import
//
// Using `pulumi import`, import `mist_org_vpn` with:
//
// Org VPN can be imported by specifying the org_id and the vpn_id
//
// ```sh
// $ pulumi import junipermist:org/vpn:Vpn vpn_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Vpn struct {
	pulumi.CustomResourceState

	Name  pulumi.StringOutput `pulumi:"name"`
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Only if `type`==`hubSpoke`
	PathSelection VpnPathSelectionPtrOutput `pulumi:"pathSelection"`
	// For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
	Paths VpnPathsMapOutput `pulumi:"paths"`
	// enum: `hubSpoke`, `mesh`
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewVpn registers a new resource with the given unique name, arguments, and options.
func NewVpn(ctx *pulumi.Context,
	name string, args *VpnArgs, opts ...pulumi.ResourceOption) (*Vpn, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Paths == nil {
		return nil, errors.New("invalid value for required argument 'Paths'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Vpn
	err := ctx.RegisterResource("junipermist:org/vpn:Vpn", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpn gets an existing Vpn resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpn(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpnState, opts ...pulumi.ResourceOption) (*Vpn, error) {
	var resource Vpn
	err := ctx.ReadResource("junipermist:org/vpn:Vpn", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Vpn resources.
type vpnState struct {
	Name  *string `pulumi:"name"`
	OrgId *string `pulumi:"orgId"`
	// Only if `type`==`hubSpoke`
	PathSelection *VpnPathSelection `pulumi:"pathSelection"`
	// For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
	Paths map[string]VpnPaths `pulumi:"paths"`
	// enum: `hubSpoke`, `mesh`
	Type *string `pulumi:"type"`
}

type VpnState struct {
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringPtrInput
	// Only if `type`==`hubSpoke`
	PathSelection VpnPathSelectionPtrInput
	// For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
	Paths VpnPathsMapInput
	// enum: `hubSpoke`, `mesh`
	Type pulumi.StringPtrInput
}

func (VpnState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpnState)(nil)).Elem()
}

type vpnArgs struct {
	Name  *string `pulumi:"name"`
	OrgId string  `pulumi:"orgId"`
	// Only if `type`==`hubSpoke`
	PathSelection *VpnPathSelection `pulumi:"pathSelection"`
	// For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
	Paths map[string]VpnPaths `pulumi:"paths"`
	// enum: `hubSpoke`, `mesh`
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a Vpn resource.
type VpnArgs struct {
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringInput
	// Only if `type`==`hubSpoke`
	PathSelection VpnPathSelectionPtrInput
	// For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
	Paths VpnPathsMapInput
	// enum: `hubSpoke`, `mesh`
	Type pulumi.StringPtrInput
}

func (VpnArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpnArgs)(nil)).Elem()
}

type VpnInput interface {
	pulumi.Input

	ToVpnOutput() VpnOutput
	ToVpnOutputWithContext(ctx context.Context) VpnOutput
}

func (*Vpn) ElementType() reflect.Type {
	return reflect.TypeOf((**Vpn)(nil)).Elem()
}

func (i *Vpn) ToVpnOutput() VpnOutput {
	return i.ToVpnOutputWithContext(context.Background())
}

func (i *Vpn) ToVpnOutputWithContext(ctx context.Context) VpnOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpnOutput)
}

// VpnArrayInput is an input type that accepts VpnArray and VpnArrayOutput values.
// You can construct a concrete instance of `VpnArrayInput` via:
//
//	VpnArray{ VpnArgs{...} }
type VpnArrayInput interface {
	pulumi.Input

	ToVpnArrayOutput() VpnArrayOutput
	ToVpnArrayOutputWithContext(context.Context) VpnArrayOutput
}

type VpnArray []VpnInput

func (VpnArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vpn)(nil)).Elem()
}

func (i VpnArray) ToVpnArrayOutput() VpnArrayOutput {
	return i.ToVpnArrayOutputWithContext(context.Background())
}

func (i VpnArray) ToVpnArrayOutputWithContext(ctx context.Context) VpnArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpnArrayOutput)
}

// VpnMapInput is an input type that accepts VpnMap and VpnMapOutput values.
// You can construct a concrete instance of `VpnMapInput` via:
//
//	VpnMap{ "key": VpnArgs{...} }
type VpnMapInput interface {
	pulumi.Input

	ToVpnMapOutput() VpnMapOutput
	ToVpnMapOutputWithContext(context.Context) VpnMapOutput
}

type VpnMap map[string]VpnInput

func (VpnMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vpn)(nil)).Elem()
}

func (i VpnMap) ToVpnMapOutput() VpnMapOutput {
	return i.ToVpnMapOutputWithContext(context.Background())
}

func (i VpnMap) ToVpnMapOutputWithContext(ctx context.Context) VpnMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpnMapOutput)
}

type VpnOutput struct{ *pulumi.OutputState }

func (VpnOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Vpn)(nil)).Elem()
}

func (o VpnOutput) ToVpnOutput() VpnOutput {
	return o
}

func (o VpnOutput) ToVpnOutputWithContext(ctx context.Context) VpnOutput {
	return o
}

func (o VpnOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpn) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o VpnOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpn) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Only if `type`==`hubSpoke`
func (o VpnOutput) PathSelection() VpnPathSelectionPtrOutput {
	return o.ApplyT(func(v *Vpn) VpnPathSelectionPtrOutput { return v.PathSelection }).(VpnPathSelectionPtrOutput)
}

// For `type`==`hubSpoke`, Property key is the VPN name. For `type`==`mesh`, Property key is the Interface name
func (o VpnOutput) Paths() VpnPathsMapOutput {
	return o.ApplyT(func(v *Vpn) VpnPathsMapOutput { return v.Paths }).(VpnPathsMapOutput)
}

// enum: `hubSpoke`, `mesh`
func (o VpnOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Vpn) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type VpnArrayOutput struct{ *pulumi.OutputState }

func (VpnArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vpn)(nil)).Elem()
}

func (o VpnArrayOutput) ToVpnArrayOutput() VpnArrayOutput {
	return o
}

func (o VpnArrayOutput) ToVpnArrayOutputWithContext(ctx context.Context) VpnArrayOutput {
	return o
}

func (o VpnArrayOutput) Index(i pulumi.IntInput) VpnOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Vpn {
		return vs[0].([]*Vpn)[vs[1].(int)]
	}).(VpnOutput)
}

type VpnMapOutput struct{ *pulumi.OutputState }

func (VpnMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vpn)(nil)).Elem()
}

func (o VpnMapOutput) ToVpnMapOutput() VpnMapOutput {
	return o
}

func (o VpnMapOutput) ToVpnMapOutputWithContext(ctx context.Context) VpnMapOutput {
	return o
}

func (o VpnMapOutput) MapIndex(k pulumi.StringInput) VpnOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Vpn {
		return vs[0].(map[string]*Vpn)[vs[1].(string)]
	}).(VpnOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpnInput)(nil)).Elem(), &Vpn{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpnArrayInput)(nil)).Elem(), VpnArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpnMapInput)(nil)).Elem(), VpnMap{})
	pulumi.RegisterOutputType(VpnOutput{})
	pulumi.RegisterOutputType(VpnArrayOutput{})
	pulumi.RegisterOutputType(VpnMapOutput{})
}
