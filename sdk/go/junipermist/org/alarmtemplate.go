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

// This resource manages Alarm Templates.
// An Alarm Template is a set of Alarm Rules that could be applied to one or more sites (while each site can only pick one Alarm Template), or to the whole org.
//
// Once created, the Alarm template must be assigned with the `alarmtemplateId` attribute to one of the following
//   - the whole org with the `org.base` resource
//   - one or multiple sites with the `site.base` resource
//
// # It is possible to use the `getConstAlarms` data source to get a list of the available alarms
//
// ## Import
//
// Using `pulumi import`, import `mist_org_alarmtemplate` with:
//
// Org RF Template can be imported by specifying the org_id and the alarmtemplate_id
//
// ```sh
// $ pulumi import junipermist:org/alarmtemplate:Alarmtemplate alarmtemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Alarmtemplate struct {
	pulumi.CustomResourceState

	// Delivery object to configure the alarm delivery
	Delivery AlarmtemplateDeliveryOutput `pulumi:"delivery"`
	// Some string to name the alarm template
	Name  pulumi.StringOutput `pulumi:"name"`
	OrgId pulumi.StringOutput `pulumi:"orgId"`
	// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `getConstAlarms` data source).
	Rules AlarmtemplateRulesMapOutput `pulumi:"rules"`
}

// NewAlarmtemplate registers a new resource with the given unique name, arguments, and options.
func NewAlarmtemplate(ctx *pulumi.Context,
	name string, args *AlarmtemplateArgs, opts ...pulumi.ResourceOption) (*Alarmtemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Delivery == nil {
		return nil, errors.New("invalid value for required argument 'Delivery'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Alarmtemplate
	err := ctx.RegisterResource("junipermist:org/alarmtemplate:Alarmtemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlarmtemplate gets an existing Alarmtemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlarmtemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlarmtemplateState, opts ...pulumi.ResourceOption) (*Alarmtemplate, error) {
	var resource Alarmtemplate
	err := ctx.ReadResource("junipermist:org/alarmtemplate:Alarmtemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Alarmtemplate resources.
type alarmtemplateState struct {
	// Delivery object to configure the alarm delivery
	Delivery *AlarmtemplateDelivery `pulumi:"delivery"`
	// Some string to name the alarm template
	Name  *string `pulumi:"name"`
	OrgId *string `pulumi:"orgId"`
	// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `getConstAlarms` data source).
	Rules map[string]AlarmtemplateRules `pulumi:"rules"`
}

type AlarmtemplateState struct {
	// Delivery object to configure the alarm delivery
	Delivery AlarmtemplateDeliveryPtrInput
	// Some string to name the alarm template
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringPtrInput
	// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `getConstAlarms` data source).
	Rules AlarmtemplateRulesMapInput
}

func (AlarmtemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*alarmtemplateState)(nil)).Elem()
}

type alarmtemplateArgs struct {
	// Delivery object to configure the alarm delivery
	Delivery AlarmtemplateDelivery `pulumi:"delivery"`
	// Some string to name the alarm template
	Name  *string `pulumi:"name"`
	OrgId string  `pulumi:"orgId"`
	// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `getConstAlarms` data source).
	Rules map[string]AlarmtemplateRules `pulumi:"rules"`
}

// The set of arguments for constructing a Alarmtemplate resource.
type AlarmtemplateArgs struct {
	// Delivery object to configure the alarm delivery
	Delivery AlarmtemplateDeliveryInput
	// Some string to name the alarm template
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringInput
	// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `getConstAlarms` data source).
	Rules AlarmtemplateRulesMapInput
}

func (AlarmtemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alarmtemplateArgs)(nil)).Elem()
}

type AlarmtemplateInput interface {
	pulumi.Input

	ToAlarmtemplateOutput() AlarmtemplateOutput
	ToAlarmtemplateOutputWithContext(ctx context.Context) AlarmtemplateOutput
}

func (*Alarmtemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**Alarmtemplate)(nil)).Elem()
}

func (i *Alarmtemplate) ToAlarmtemplateOutput() AlarmtemplateOutput {
	return i.ToAlarmtemplateOutputWithContext(context.Background())
}

func (i *Alarmtemplate) ToAlarmtemplateOutputWithContext(ctx context.Context) AlarmtemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlarmtemplateOutput)
}

// AlarmtemplateArrayInput is an input type that accepts AlarmtemplateArray and AlarmtemplateArrayOutput values.
// You can construct a concrete instance of `AlarmtemplateArrayInput` via:
//
//	AlarmtemplateArray{ AlarmtemplateArgs{...} }
type AlarmtemplateArrayInput interface {
	pulumi.Input

	ToAlarmtemplateArrayOutput() AlarmtemplateArrayOutput
	ToAlarmtemplateArrayOutputWithContext(context.Context) AlarmtemplateArrayOutput
}

type AlarmtemplateArray []AlarmtemplateInput

func (AlarmtemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Alarmtemplate)(nil)).Elem()
}

func (i AlarmtemplateArray) ToAlarmtemplateArrayOutput() AlarmtemplateArrayOutput {
	return i.ToAlarmtemplateArrayOutputWithContext(context.Background())
}

func (i AlarmtemplateArray) ToAlarmtemplateArrayOutputWithContext(ctx context.Context) AlarmtemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlarmtemplateArrayOutput)
}

// AlarmtemplateMapInput is an input type that accepts AlarmtemplateMap and AlarmtemplateMapOutput values.
// You can construct a concrete instance of `AlarmtemplateMapInput` via:
//
//	AlarmtemplateMap{ "key": AlarmtemplateArgs{...} }
type AlarmtemplateMapInput interface {
	pulumi.Input

	ToAlarmtemplateMapOutput() AlarmtemplateMapOutput
	ToAlarmtemplateMapOutputWithContext(context.Context) AlarmtemplateMapOutput
}

type AlarmtemplateMap map[string]AlarmtemplateInput

func (AlarmtemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Alarmtemplate)(nil)).Elem()
}

func (i AlarmtemplateMap) ToAlarmtemplateMapOutput() AlarmtemplateMapOutput {
	return i.ToAlarmtemplateMapOutputWithContext(context.Background())
}

func (i AlarmtemplateMap) ToAlarmtemplateMapOutputWithContext(ctx context.Context) AlarmtemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlarmtemplateMapOutput)
}

type AlarmtemplateOutput struct{ *pulumi.OutputState }

func (AlarmtemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Alarmtemplate)(nil)).Elem()
}

func (o AlarmtemplateOutput) ToAlarmtemplateOutput() AlarmtemplateOutput {
	return o
}

func (o AlarmtemplateOutput) ToAlarmtemplateOutputWithContext(ctx context.Context) AlarmtemplateOutput {
	return o
}

// Delivery object to configure the alarm delivery
func (o AlarmtemplateOutput) Delivery() AlarmtemplateDeliveryOutput {
	return o.ApplyT(func(v *Alarmtemplate) AlarmtemplateDeliveryOutput { return v.Delivery }).(AlarmtemplateDeliveryOutput)
}

// Some string to name the alarm template
func (o AlarmtemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Alarmtemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o AlarmtemplateOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Alarmtemplate) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `getConstAlarms` data source).
func (o AlarmtemplateOutput) Rules() AlarmtemplateRulesMapOutput {
	return o.ApplyT(func(v *Alarmtemplate) AlarmtemplateRulesMapOutput { return v.Rules }).(AlarmtemplateRulesMapOutput)
}

type AlarmtemplateArrayOutput struct{ *pulumi.OutputState }

func (AlarmtemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Alarmtemplate)(nil)).Elem()
}

func (o AlarmtemplateArrayOutput) ToAlarmtemplateArrayOutput() AlarmtemplateArrayOutput {
	return o
}

func (o AlarmtemplateArrayOutput) ToAlarmtemplateArrayOutputWithContext(ctx context.Context) AlarmtemplateArrayOutput {
	return o
}

func (o AlarmtemplateArrayOutput) Index(i pulumi.IntInput) AlarmtemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Alarmtemplate {
		return vs[0].([]*Alarmtemplate)[vs[1].(int)]
	}).(AlarmtemplateOutput)
}

type AlarmtemplateMapOutput struct{ *pulumi.OutputState }

func (AlarmtemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Alarmtemplate)(nil)).Elem()
}

func (o AlarmtemplateMapOutput) ToAlarmtemplateMapOutput() AlarmtemplateMapOutput {
	return o
}

func (o AlarmtemplateMapOutput) ToAlarmtemplateMapOutputWithContext(ctx context.Context) AlarmtemplateMapOutput {
	return o
}

func (o AlarmtemplateMapOutput) MapIndex(k pulumi.StringInput) AlarmtemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Alarmtemplate {
		return vs[0].(map[string]*Alarmtemplate)[vs[1].(string)]
	}).(AlarmtemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlarmtemplateInput)(nil)).Elem(), &Alarmtemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlarmtemplateArrayInput)(nil)).Elem(), AlarmtemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlarmtemplateMapInput)(nil)).Elem(), AlarmtemplateMap{})
	pulumi.RegisterOutputType(AlarmtemplateOutput{})
	pulumi.RegisterOutputType(AlarmtemplateArrayOutput{})
	pulumi.RegisterOutputType(AlarmtemplateMapOutput{})
}
