// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Mist Organization.
//
// An organization usually represents a customer - which has inventories, licenses. An Organization can contain multiple sites. A site usually represents a deployment at the same location (a campus, an office).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/org"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := org.Newbase(ctx, "org_one", &org.baseArgs{
//				Name:            pulumi.String("Org One"),
//				AlarmtemplateId: pulumi.Any(alarmtemplateOne.Id),
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
// Using `pulumi import`, import `mist_org` with:
//
// Organization can be imported by specifying the org_id
//
// ```sh
// $ pulumi import junipermist:org/base:base org_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
// ```
type Base struct {
	pulumi.CustomResourceState

	AlarmtemplateId pulumi.StringPtrOutput `pulumi:"alarmtemplateId"`
	AllowMist       pulumi.BoolOutput      `pulumi:"allowMist"`
	MspId           pulumi.StringOutput    `pulumi:"mspId"`
	// logo uploaded by the MSP with advanced tier, only present if provided
	MspLogoUrl pulumi.StringOutput `pulumi:"mspLogoUrl"`
	// Name of the msp the org belongs to
	MspName       pulumi.StringOutput      `pulumi:"mspName"`
	Name          pulumi.StringOutput      `pulumi:"name"`
	OrggroupIds   pulumi.StringArrayOutput `pulumi:"orggroupIds"`
	SessionExpiry pulumi.IntOutput         `pulumi:"sessionExpiry"`
}

// NewBase registers a new resource with the given unique name, arguments, and options.
func NewBase(ctx *pulumi.Context,
	name string, args *BaseArgs, opts ...pulumi.ResourceOption) (*Base, error) {
	if args == nil {
		args = &BaseArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Base
	err := ctx.RegisterResource("junipermist:org/base:base", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBase gets an existing Base resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BaseState, opts ...pulumi.ResourceOption) (*Base, error) {
	var resource Base
	err := ctx.ReadResource("junipermist:org/base:base", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Base resources.
type baseState struct {
	AlarmtemplateId *string `pulumi:"alarmtemplateId"`
	AllowMist       *bool   `pulumi:"allowMist"`
	MspId           *string `pulumi:"mspId"`
	// logo uploaded by the MSP with advanced tier, only present if provided
	MspLogoUrl *string `pulumi:"mspLogoUrl"`
	// Name of the msp the org belongs to
	MspName       *string  `pulumi:"mspName"`
	Name          *string  `pulumi:"name"`
	OrggroupIds   []string `pulumi:"orggroupIds"`
	SessionExpiry *int     `pulumi:"sessionExpiry"`
}

type BaseState struct {
	AlarmtemplateId pulumi.StringPtrInput
	AllowMist       pulumi.BoolPtrInput
	MspId           pulumi.StringPtrInput
	// logo uploaded by the MSP with advanced tier, only present if provided
	MspLogoUrl pulumi.StringPtrInput
	// Name of the msp the org belongs to
	MspName       pulumi.StringPtrInput
	Name          pulumi.StringPtrInput
	OrggroupIds   pulumi.StringArrayInput
	SessionExpiry pulumi.IntPtrInput
}

func (BaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*baseState)(nil)).Elem()
}

type baseArgs struct {
	AlarmtemplateId *string `pulumi:"alarmtemplateId"`
	AllowMist       *bool   `pulumi:"allowMist"`
	Name            *string `pulumi:"name"`
	SessionExpiry   *int    `pulumi:"sessionExpiry"`
}

// The set of arguments for constructing a Base resource.
type BaseArgs struct {
	AlarmtemplateId pulumi.StringPtrInput
	AllowMist       pulumi.BoolPtrInput
	Name            pulumi.StringPtrInput
	SessionExpiry   pulumi.IntPtrInput
}

func (BaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*baseArgs)(nil)).Elem()
}

type BaseInput interface {
	pulumi.Input

	ToBaseOutput() BaseOutput
	ToBaseOutputWithContext(ctx context.Context) BaseOutput
}

func (*Base) ElementType() reflect.Type {
	return reflect.TypeOf((**Base)(nil)).Elem()
}

func (i *Base) ToBaseOutput() BaseOutput {
	return i.ToBaseOutputWithContext(context.Background())
}

func (i *Base) ToBaseOutputWithContext(ctx context.Context) BaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaseOutput)
}

// BaseArrayInput is an input type that accepts BaseArray and BaseArrayOutput values.
// You can construct a concrete instance of `BaseArrayInput` via:
//
//	BaseArray{ BaseArgs{...} }
type BaseArrayInput interface {
	pulumi.Input

	ToBaseArrayOutput() BaseArrayOutput
	ToBaseArrayOutputWithContext(context.Context) BaseArrayOutput
}

type BaseArray []BaseInput

func (BaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Base)(nil)).Elem()
}

func (i BaseArray) ToBaseArrayOutput() BaseArrayOutput {
	return i.ToBaseArrayOutputWithContext(context.Background())
}

func (i BaseArray) ToBaseArrayOutputWithContext(ctx context.Context) BaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaseArrayOutput)
}

// BaseMapInput is an input type that accepts BaseMap and BaseMapOutput values.
// You can construct a concrete instance of `BaseMapInput` via:
//
//	BaseMap{ "key": BaseArgs{...} }
type BaseMapInput interface {
	pulumi.Input

	ToBaseMapOutput() BaseMapOutput
	ToBaseMapOutputWithContext(context.Context) BaseMapOutput
}

type BaseMap map[string]BaseInput

func (BaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Base)(nil)).Elem()
}

func (i BaseMap) ToBaseMapOutput() BaseMapOutput {
	return i.ToBaseMapOutputWithContext(context.Background())
}

func (i BaseMap) ToBaseMapOutputWithContext(ctx context.Context) BaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BaseMapOutput)
}

type BaseOutput struct{ *pulumi.OutputState }

func (BaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Base)(nil)).Elem()
}

func (o BaseOutput) ToBaseOutput() BaseOutput {
	return o
}

func (o BaseOutput) ToBaseOutputWithContext(ctx context.Context) BaseOutput {
	return o
}

func (o BaseOutput) AlarmtemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.AlarmtemplateId }).(pulumi.StringPtrOutput)
}

func (o BaseOutput) AllowMist() pulumi.BoolOutput {
	return o.ApplyT(func(v *Base) pulumi.BoolOutput { return v.AllowMist }).(pulumi.BoolOutput)
}

func (o BaseOutput) MspId() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.MspId }).(pulumi.StringOutput)
}

// logo uploaded by the MSP with advanced tier, only present if provided
func (o BaseOutput) MspLogoUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.MspLogoUrl }).(pulumi.StringOutput)
}

// Name of the msp the org belongs to
func (o BaseOutput) MspName() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.MspName }).(pulumi.StringOutput)
}

func (o BaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o BaseOutput) OrggroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Base) pulumi.StringArrayOutput { return v.OrggroupIds }).(pulumi.StringArrayOutput)
}

func (o BaseOutput) SessionExpiry() pulumi.IntOutput {
	return o.ApplyT(func(v *Base) pulumi.IntOutput { return v.SessionExpiry }).(pulumi.IntOutput)
}

type BaseArrayOutput struct{ *pulumi.OutputState }

func (BaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Base)(nil)).Elem()
}

func (o BaseArrayOutput) ToBaseArrayOutput() BaseArrayOutput {
	return o
}

func (o BaseArrayOutput) ToBaseArrayOutputWithContext(ctx context.Context) BaseArrayOutput {
	return o
}

func (o BaseArrayOutput) Index(i pulumi.IntInput) BaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Base {
		return vs[0].([]*Base)[vs[1].(int)]
	}).(BaseOutput)
}

type BaseMapOutput struct{ *pulumi.OutputState }

func (BaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Base)(nil)).Elem()
}

func (o BaseMapOutput) ToBaseMapOutput() BaseMapOutput {
	return o
}

func (o BaseMapOutput) ToBaseMapOutputWithContext(ctx context.Context) BaseMapOutput {
	return o
}

func (o BaseMapOutput) MapIndex(k pulumi.StringInput) BaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Base {
		return vs[0].(map[string]*Base)[vs[1].(string)]
	}).(BaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BaseInput)(nil)).Elem(), &Base{})
	pulumi.RegisterInputType(reflect.TypeOf((*BaseArrayInput)(nil)).Elem(), BaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BaseMapInput)(nil)).Elem(), BaseMap{})
	pulumi.RegisterOutputType(BaseOutput{})
	pulumi.RegisterOutputType(BaseArrayOutput{})
	pulumi.RegisterOutputType(BaseMapOutput{})
}
