// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the NAC Rules (Auth Policies).
//
// A NAC Rule defines a list of criteria (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return
//
// ## Import
//
// Using `pulumi import`, import `mist_org_nacrule` with:
//
// NAC Rule can be imported by specifying the org_id and the nacrule_id
//
// ```sh
// $ pulumi import junipermist:org/nacrule:Nacrule nacrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Nacrule struct {
	pulumi.CustomResourceState

	// enum: `allow`, `block`
	Action pulumi.StringOutput `pulumi:"action"`
	// All optional, this goes into Access-Accept
	ApplyTags pulumi.StringArrayOutput `pulumi:"applyTags"`
	// Enabled or not
	Enabled     pulumi.BoolOutput           `pulumi:"enabled"`
	Matching    NacruleMatchingPtrOutput    `pulumi:"matching"`
	Name        pulumi.StringOutput         `pulumi:"name"`
	NotMatching NacruleNotMatchingPtrOutput `pulumi:"notMatching"`
	// Order of the rule, lower value implies higher priority
	Order pulumi.IntOutput    `pulumi:"order"`
	OrgId pulumi.StringOutput `pulumi:"orgId"`
}

// NewNacrule registers a new resource with the given unique name, arguments, and options.
func NewNacrule(ctx *pulumi.Context,
	name string, args *NacruleArgs, opts ...pulumi.ResourceOption) (*Nacrule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Order == nil {
		return nil, errors.New("invalid value for required argument 'Order'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Nacrule
	err := ctx.RegisterResource("junipermist:org/nacrule:Nacrule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNacrule gets an existing Nacrule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNacrule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NacruleState, opts ...pulumi.ResourceOption) (*Nacrule, error) {
	var resource Nacrule
	err := ctx.ReadResource("junipermist:org/nacrule:Nacrule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Nacrule resources.
type nacruleState struct {
	// enum: `allow`, `block`
	Action *string `pulumi:"action"`
	// All optional, this goes into Access-Accept
	ApplyTags []string `pulumi:"applyTags"`
	// Enabled or not
	Enabled     *bool               `pulumi:"enabled"`
	Matching    *NacruleMatching    `pulumi:"matching"`
	Name        *string             `pulumi:"name"`
	NotMatching *NacruleNotMatching `pulumi:"notMatching"`
	// Order of the rule, lower value implies higher priority
	Order *int    `pulumi:"order"`
	OrgId *string `pulumi:"orgId"`
}

type NacruleState struct {
	// enum: `allow`, `block`
	Action pulumi.StringPtrInput
	// All optional, this goes into Access-Accept
	ApplyTags pulumi.StringArrayInput
	// Enabled or not
	Enabled     pulumi.BoolPtrInput
	Matching    NacruleMatchingPtrInput
	Name        pulumi.StringPtrInput
	NotMatching NacruleNotMatchingPtrInput
	// Order of the rule, lower value implies higher priority
	Order pulumi.IntPtrInput
	OrgId pulumi.StringPtrInput
}

func (NacruleState) ElementType() reflect.Type {
	return reflect.TypeOf((*nacruleState)(nil)).Elem()
}

type nacruleArgs struct {
	// enum: `allow`, `block`
	Action string `pulumi:"action"`
	// All optional, this goes into Access-Accept
	ApplyTags []string `pulumi:"applyTags"`
	// Enabled or not
	Enabled     *bool               `pulumi:"enabled"`
	Matching    *NacruleMatching    `pulumi:"matching"`
	Name        *string             `pulumi:"name"`
	NotMatching *NacruleNotMatching `pulumi:"notMatching"`
	// Order of the rule, lower value implies higher priority
	Order int    `pulumi:"order"`
	OrgId string `pulumi:"orgId"`
}

// The set of arguments for constructing a Nacrule resource.
type NacruleArgs struct {
	// enum: `allow`, `block`
	Action pulumi.StringInput
	// All optional, this goes into Access-Accept
	ApplyTags pulumi.StringArrayInput
	// Enabled or not
	Enabled     pulumi.BoolPtrInput
	Matching    NacruleMatchingPtrInput
	Name        pulumi.StringPtrInput
	NotMatching NacruleNotMatchingPtrInput
	// Order of the rule, lower value implies higher priority
	Order pulumi.IntInput
	OrgId pulumi.StringInput
}

func (NacruleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nacruleArgs)(nil)).Elem()
}

type NacruleInput interface {
	pulumi.Input

	ToNacruleOutput() NacruleOutput
	ToNacruleOutputWithContext(ctx context.Context) NacruleOutput
}

func (*Nacrule) ElementType() reflect.Type {
	return reflect.TypeOf((**Nacrule)(nil)).Elem()
}

func (i *Nacrule) ToNacruleOutput() NacruleOutput {
	return i.ToNacruleOutputWithContext(context.Background())
}

func (i *Nacrule) ToNacruleOutputWithContext(ctx context.Context) NacruleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NacruleOutput)
}

// NacruleArrayInput is an input type that accepts NacruleArray and NacruleArrayOutput values.
// You can construct a concrete instance of `NacruleArrayInput` via:
//
//	NacruleArray{ NacruleArgs{...} }
type NacruleArrayInput interface {
	pulumi.Input

	ToNacruleArrayOutput() NacruleArrayOutput
	ToNacruleArrayOutputWithContext(context.Context) NacruleArrayOutput
}

type NacruleArray []NacruleInput

func (NacruleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Nacrule)(nil)).Elem()
}

func (i NacruleArray) ToNacruleArrayOutput() NacruleArrayOutput {
	return i.ToNacruleArrayOutputWithContext(context.Background())
}

func (i NacruleArray) ToNacruleArrayOutputWithContext(ctx context.Context) NacruleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NacruleArrayOutput)
}

// NacruleMapInput is an input type that accepts NacruleMap and NacruleMapOutput values.
// You can construct a concrete instance of `NacruleMapInput` via:
//
//	NacruleMap{ "key": NacruleArgs{...} }
type NacruleMapInput interface {
	pulumi.Input

	ToNacruleMapOutput() NacruleMapOutput
	ToNacruleMapOutputWithContext(context.Context) NacruleMapOutput
}

type NacruleMap map[string]NacruleInput

func (NacruleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Nacrule)(nil)).Elem()
}

func (i NacruleMap) ToNacruleMapOutput() NacruleMapOutput {
	return i.ToNacruleMapOutputWithContext(context.Background())
}

func (i NacruleMap) ToNacruleMapOutputWithContext(ctx context.Context) NacruleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NacruleMapOutput)
}

type NacruleOutput struct{ *pulumi.OutputState }

func (NacruleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Nacrule)(nil)).Elem()
}

func (o NacruleOutput) ToNacruleOutput() NacruleOutput {
	return o
}

func (o NacruleOutput) ToNacruleOutputWithContext(ctx context.Context) NacruleOutput {
	return o
}

// enum: `allow`, `block`
func (o NacruleOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *Nacrule) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// All optional, this goes into Access-Accept
func (o NacruleOutput) ApplyTags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Nacrule) pulumi.StringArrayOutput { return v.ApplyTags }).(pulumi.StringArrayOutput)
}

// Enabled or not
func (o NacruleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Nacrule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

func (o NacruleOutput) Matching() NacruleMatchingPtrOutput {
	return o.ApplyT(func(v *Nacrule) NacruleMatchingPtrOutput { return v.Matching }).(NacruleMatchingPtrOutput)
}

func (o NacruleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Nacrule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o NacruleOutput) NotMatching() NacruleNotMatchingPtrOutput {
	return o.ApplyT(func(v *Nacrule) NacruleNotMatchingPtrOutput { return v.NotMatching }).(NacruleNotMatchingPtrOutput)
}

// Order of the rule, lower value implies higher priority
func (o NacruleOutput) Order() pulumi.IntOutput {
	return o.ApplyT(func(v *Nacrule) pulumi.IntOutput { return v.Order }).(pulumi.IntOutput)
}

func (o NacruleOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Nacrule) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

type NacruleArrayOutput struct{ *pulumi.OutputState }

func (NacruleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Nacrule)(nil)).Elem()
}

func (o NacruleArrayOutput) ToNacruleArrayOutput() NacruleArrayOutput {
	return o
}

func (o NacruleArrayOutput) ToNacruleArrayOutputWithContext(ctx context.Context) NacruleArrayOutput {
	return o
}

func (o NacruleArrayOutput) Index(i pulumi.IntInput) NacruleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Nacrule {
		return vs[0].([]*Nacrule)[vs[1].(int)]
	}).(NacruleOutput)
}

type NacruleMapOutput struct{ *pulumi.OutputState }

func (NacruleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Nacrule)(nil)).Elem()
}

func (o NacruleMapOutput) ToNacruleMapOutput() NacruleMapOutput {
	return o
}

func (o NacruleMapOutput) ToNacruleMapOutputWithContext(ctx context.Context) NacruleMapOutput {
	return o
}

func (o NacruleMapOutput) MapIndex(k pulumi.StringInput) NacruleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Nacrule {
		return vs[0].(map[string]*Nacrule)[vs[1].(string)]
	}).(NacruleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NacruleInput)(nil)).Elem(), &Nacrule{})
	pulumi.RegisterInputType(reflect.TypeOf((*NacruleArrayInput)(nil)).Elem(), NacruleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NacruleMapInput)(nil)).Elem(), NacruleMap{})
	pulumi.RegisterOutputType(NacruleOutput{})
	pulumi.RegisterOutputType(NacruleArrayOutput{})
	pulumi.RegisterOutputType(NacruleMapOutput{})
}
