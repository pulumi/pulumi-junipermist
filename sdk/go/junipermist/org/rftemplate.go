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

// This resource manages the RF Templates.
//
// # The RF Templates can be used to define Wireless Access Points radio configuration, and can be assigned to the sites
//
// ## Import
//
// Using `pulumi import`, import `mist_org_rftemplate` with:
//
// Org RF Template can be imported by specifying the org_id and the rftemplate_id
//
// ```sh
// $ pulumi import junipermist:org/rftemplate:Rftemplate rftemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Rftemplate struct {
	pulumi.CustomResourceState

	AntGain24 pulumi.IntOutput `pulumi:"antGain24"`
	AntGain5  pulumi.IntOutput `pulumi:"antGain5"`
	AntGain6  pulumi.IntOutput `pulumi:"antGain6"`
	// Radio Band AP settings
	Band24 RftemplateBand24PtrOutput `pulumi:"band24"`
	// enum: `24`, `5`, `6`, `auto`
	Band24Usage pulumi.StringPtrOutput `pulumi:"band24Usage"`
	// Radio Band AP settings
	Band5 RftemplateBand5PtrOutput `pulumi:"band5"`
	// Radio Band AP settings
	Band5On24Radio RftemplateBand5On24RadioPtrOutput `pulumi:"band5On24Radio"`
	// Radio Band AP settings
	Band6 RftemplateBand6PtrOutput `pulumi:"band6"`
	// optional, country code to use. If specified, this gets applied to all sites using the RF Template
	CountryCode pulumi.StringPtrOutput `pulumi:"countryCode"`
	// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
	ModelSpecific RftemplateModelSpecificMapOutput `pulumi:"modelSpecific"`
	// The name of the RF template
	Name  pulumi.StringOutput `pulumi:"name"`
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// whether scanning radio is enabled
	ScanningEnabled pulumi.BoolPtrOutput `pulumi:"scanningEnabled"`
}

// NewRftemplate registers a new resource with the given unique name, arguments, and options.
func NewRftemplate(ctx *pulumi.Context,
	name string, args *RftemplateArgs, opts ...pulumi.ResourceOption) (*Rftemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Rftemplate
	err := ctx.RegisterResource("junipermist:org/rftemplate:Rftemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRftemplate gets an existing Rftemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRftemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RftemplateState, opts ...pulumi.ResourceOption) (*Rftemplate, error) {
	var resource Rftemplate
	err := ctx.ReadResource("junipermist:org/rftemplate:Rftemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rftemplate resources.
type rftemplateState struct {
	AntGain24 *int `pulumi:"antGain24"`
	AntGain5  *int `pulumi:"antGain5"`
	AntGain6  *int `pulumi:"antGain6"`
	// Radio Band AP settings
	Band24 *RftemplateBand24 `pulumi:"band24"`
	// enum: `24`, `5`, `6`, `auto`
	Band24Usage *string `pulumi:"band24Usage"`
	// Radio Band AP settings
	Band5 *RftemplateBand5 `pulumi:"band5"`
	// Radio Band AP settings
	Band5On24Radio *RftemplateBand5On24Radio `pulumi:"band5On24Radio"`
	// Radio Band AP settings
	Band6 *RftemplateBand6 `pulumi:"band6"`
	// optional, country code to use. If specified, this gets applied to all sites using the RF Template
	CountryCode *string `pulumi:"countryCode"`
	// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
	ModelSpecific map[string]RftemplateModelSpecific `pulumi:"modelSpecific"`
	// The name of the RF template
	Name  *string `pulumi:"name"`
	OrgId *string `pulumi:"orgId"`
	// whether scanning radio is enabled
	ScanningEnabled *bool `pulumi:"scanningEnabled"`
}

type RftemplateState struct {
	AntGain24 pulumi.IntPtrInput
	AntGain5  pulumi.IntPtrInput
	AntGain6  pulumi.IntPtrInput
	// Radio Band AP settings
	Band24 RftemplateBand24PtrInput
	// enum: `24`, `5`, `6`, `auto`
	Band24Usage pulumi.StringPtrInput
	// Radio Band AP settings
	Band5 RftemplateBand5PtrInput
	// Radio Band AP settings
	Band5On24Radio RftemplateBand5On24RadioPtrInput
	// Radio Band AP settings
	Band6 RftemplateBand6PtrInput
	// optional, country code to use. If specified, this gets applied to all sites using the RF Template
	CountryCode pulumi.StringPtrInput
	// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
	ModelSpecific RftemplateModelSpecificMapInput
	// The name of the RF template
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringPtrInput
	// whether scanning radio is enabled
	ScanningEnabled pulumi.BoolPtrInput
}

func (RftemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*rftemplateState)(nil)).Elem()
}

type rftemplateArgs struct {
	AntGain24 *int `pulumi:"antGain24"`
	AntGain5  *int `pulumi:"antGain5"`
	AntGain6  *int `pulumi:"antGain6"`
	// Radio Band AP settings
	Band24 *RftemplateBand24 `pulumi:"band24"`
	// enum: `24`, `5`, `6`, `auto`
	Band24Usage *string `pulumi:"band24Usage"`
	// Radio Band AP settings
	Band5 *RftemplateBand5 `pulumi:"band5"`
	// Radio Band AP settings
	Band5On24Radio *RftemplateBand5On24Radio `pulumi:"band5On24Radio"`
	// Radio Band AP settings
	Band6 *RftemplateBand6 `pulumi:"band6"`
	// optional, country code to use. If specified, this gets applied to all sites using the RF Template
	CountryCode *string `pulumi:"countryCode"`
	// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
	ModelSpecific map[string]RftemplateModelSpecific `pulumi:"modelSpecific"`
	// The name of the RF template
	Name  *string `pulumi:"name"`
	OrgId string  `pulumi:"orgId"`
	// whether scanning radio is enabled
	ScanningEnabled *bool `pulumi:"scanningEnabled"`
}

// The set of arguments for constructing a Rftemplate resource.
type RftemplateArgs struct {
	AntGain24 pulumi.IntPtrInput
	AntGain5  pulumi.IntPtrInput
	AntGain6  pulumi.IntPtrInput
	// Radio Band AP settings
	Band24 RftemplateBand24PtrInput
	// enum: `24`, `5`, `6`, `auto`
	Band24Usage pulumi.StringPtrInput
	// Radio Band AP settings
	Band5 RftemplateBand5PtrInput
	// Radio Band AP settings
	Band5On24Radio RftemplateBand5On24RadioPtrInput
	// Radio Band AP settings
	Band6 RftemplateBand6PtrInput
	// optional, country code to use. If specified, this gets applied to all sites using the RF Template
	CountryCode pulumi.StringPtrInput
	// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
	ModelSpecific RftemplateModelSpecificMapInput
	// The name of the RF template
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringInput
	// whether scanning radio is enabled
	ScanningEnabled pulumi.BoolPtrInput
}

func (RftemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rftemplateArgs)(nil)).Elem()
}

type RftemplateInput interface {
	pulumi.Input

	ToRftemplateOutput() RftemplateOutput
	ToRftemplateOutputWithContext(ctx context.Context) RftemplateOutput
}

func (*Rftemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**Rftemplate)(nil)).Elem()
}

func (i *Rftemplate) ToRftemplateOutput() RftemplateOutput {
	return i.ToRftemplateOutputWithContext(context.Background())
}

func (i *Rftemplate) ToRftemplateOutputWithContext(ctx context.Context) RftemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RftemplateOutput)
}

// RftemplateArrayInput is an input type that accepts RftemplateArray and RftemplateArrayOutput values.
// You can construct a concrete instance of `RftemplateArrayInput` via:
//
//	RftemplateArray{ RftemplateArgs{...} }
type RftemplateArrayInput interface {
	pulumi.Input

	ToRftemplateArrayOutput() RftemplateArrayOutput
	ToRftemplateArrayOutputWithContext(context.Context) RftemplateArrayOutput
}

type RftemplateArray []RftemplateInput

func (RftemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rftemplate)(nil)).Elem()
}

func (i RftemplateArray) ToRftemplateArrayOutput() RftemplateArrayOutput {
	return i.ToRftemplateArrayOutputWithContext(context.Background())
}

func (i RftemplateArray) ToRftemplateArrayOutputWithContext(ctx context.Context) RftemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RftemplateArrayOutput)
}

// RftemplateMapInput is an input type that accepts RftemplateMap and RftemplateMapOutput values.
// You can construct a concrete instance of `RftemplateMapInput` via:
//
//	RftemplateMap{ "key": RftemplateArgs{...} }
type RftemplateMapInput interface {
	pulumi.Input

	ToRftemplateMapOutput() RftemplateMapOutput
	ToRftemplateMapOutputWithContext(context.Context) RftemplateMapOutput
}

type RftemplateMap map[string]RftemplateInput

func (RftemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rftemplate)(nil)).Elem()
}

func (i RftemplateMap) ToRftemplateMapOutput() RftemplateMapOutput {
	return i.ToRftemplateMapOutputWithContext(context.Background())
}

func (i RftemplateMap) ToRftemplateMapOutputWithContext(ctx context.Context) RftemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RftemplateMapOutput)
}

type RftemplateOutput struct{ *pulumi.OutputState }

func (RftemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rftemplate)(nil)).Elem()
}

func (o RftemplateOutput) ToRftemplateOutput() RftemplateOutput {
	return o
}

func (o RftemplateOutput) ToRftemplateOutputWithContext(ctx context.Context) RftemplateOutput {
	return o
}

func (o RftemplateOutput) AntGain24() pulumi.IntOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.IntOutput { return v.AntGain24 }).(pulumi.IntOutput)
}

func (o RftemplateOutput) AntGain5() pulumi.IntOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.IntOutput { return v.AntGain5 }).(pulumi.IntOutput)
}

func (o RftemplateOutput) AntGain6() pulumi.IntOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.IntOutput { return v.AntGain6 }).(pulumi.IntOutput)
}

// Radio Band AP settings
func (o RftemplateOutput) Band24() RftemplateBand24PtrOutput {
	return o.ApplyT(func(v *Rftemplate) RftemplateBand24PtrOutput { return v.Band24 }).(RftemplateBand24PtrOutput)
}

// enum: `24`, `5`, `6`, `auto`
func (o RftemplateOutput) Band24Usage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.StringPtrOutput { return v.Band24Usage }).(pulumi.StringPtrOutput)
}

// Radio Band AP settings
func (o RftemplateOutput) Band5() RftemplateBand5PtrOutput {
	return o.ApplyT(func(v *Rftemplate) RftemplateBand5PtrOutput { return v.Band5 }).(RftemplateBand5PtrOutput)
}

// Radio Band AP settings
func (o RftemplateOutput) Band5On24Radio() RftemplateBand5On24RadioPtrOutput {
	return o.ApplyT(func(v *Rftemplate) RftemplateBand5On24RadioPtrOutput { return v.Band5On24Radio }).(RftemplateBand5On24RadioPtrOutput)
}

// Radio Band AP settings
func (o RftemplateOutput) Band6() RftemplateBand6PtrOutput {
	return o.ApplyT(func(v *Rftemplate) RftemplateBand6PtrOutput { return v.Band6 }).(RftemplateBand6PtrOutput)
}

// optional, country code to use. If specified, this gets applied to all sites using the RF Template
func (o RftemplateOutput) CountryCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.StringPtrOutput { return v.CountryCode }).(pulumi.StringPtrOutput)
}

// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
func (o RftemplateOutput) ModelSpecific() RftemplateModelSpecificMapOutput {
	return o.ApplyT(func(v *Rftemplate) RftemplateModelSpecificMapOutput { return v.ModelSpecific }).(RftemplateModelSpecificMapOutput)
}

// The name of the RF template
func (o RftemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o RftemplateOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// whether scanning radio is enabled
func (o RftemplateOutput) ScanningEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Rftemplate) pulumi.BoolPtrOutput { return v.ScanningEnabled }).(pulumi.BoolPtrOutput)
}

type RftemplateArrayOutput struct{ *pulumi.OutputState }

func (RftemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rftemplate)(nil)).Elem()
}

func (o RftemplateArrayOutput) ToRftemplateArrayOutput() RftemplateArrayOutput {
	return o
}

func (o RftemplateArrayOutput) ToRftemplateArrayOutputWithContext(ctx context.Context) RftemplateArrayOutput {
	return o
}

func (o RftemplateArrayOutput) Index(i pulumi.IntInput) RftemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rftemplate {
		return vs[0].([]*Rftemplate)[vs[1].(int)]
	}).(RftemplateOutput)
}

type RftemplateMapOutput struct{ *pulumi.OutputState }

func (RftemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rftemplate)(nil)).Elem()
}

func (o RftemplateMapOutput) ToRftemplateMapOutput() RftemplateMapOutput {
	return o
}

func (o RftemplateMapOutput) ToRftemplateMapOutputWithContext(ctx context.Context) RftemplateMapOutput {
	return o
}

func (o RftemplateMapOutput) MapIndex(k pulumi.StringInput) RftemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rftemplate {
		return vs[0].(map[string]*Rftemplate)[vs[1].(string)]
	}).(RftemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RftemplateInput)(nil)).Elem(), &Rftemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*RftemplateArrayInput)(nil)).Elem(), RftemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RftemplateMapInput)(nil)).Elem(), RftemplateMap{})
	pulumi.RegisterOutputType(RftemplateOutput{})
	pulumi.RegisterOutputType(RftemplateArrayOutput{})
	pulumi.RegisterOutputType(RftemplateMapOutput{})
}
