// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package site

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Site WxRules (WLAN policies).A WxLAN policy is a set of rules and settings that can be applied to devices in a network to determine how they are treated. it provides support for access policies, network segmentation, role-based policies, micro-segmentation, and least privilege. WxLAN policies are used to allow or deny specific users from accessing specific resources in a wireless network.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/site"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := site.NewWxrule(ctx, "wxrule_one", &site.WxruleArgs{
//				SiteId: pulumi.Any(terraformTest.Id),
//				SrcWxtags: pulumi.StringArray{
//					wxtagOne.Id,
//				},
//				Enabled: pulumi.Bool(true),
//				Action:  pulumi.String("allow"),
//				DstDenyWxtags: pulumi.StringArray{
//					wxtagTwo.Id,
//				},
//				Order: pulumi.Int(1),
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
// Using `pulumi import`, import `mist_site_wxrule` with:
//
// Site WxRule can be imported by specifying the site_id and the wxrule_id
//
// ```sh
// $ pulumi import junipermist:site/wxrule:Wxrule wxrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Wxrule struct {
	pulumi.CustomResourceState

	// type of action, allow / block. enum: `allow`, `block`
	Action    pulumi.StringOutput      `pulumi:"action"`
	ApplyTags pulumi.StringArrayOutput `pulumi:"applyTags"`
	// blocked apps (always blocking, ignoring action), the key of Get Application List
	BlockedApps pulumi.StringArrayOutput `pulumi:"blockedApps"`
	// tag list to indicate these tags are allowed access
	DstAllowWxtags pulumi.StringArrayOutput `pulumi:"dstAllowWxtags"`
	// tag list to indicate these tags are blocked access
	DstDenyWxtags pulumi.StringArrayOutput `pulumi:"dstDenyWxtags"`
	// List of WxTag UUID
	DstWxtags pulumi.StringArrayOutput `pulumi:"dstWxtags"`
	Enabled   pulumi.BoolOutput        `pulumi:"enabled"`
	// the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
	Order  pulumi.IntOutput    `pulumi:"order"`
	SiteId pulumi.StringOutput `pulumi:"siteId"`
	// tag list to determine if this rule would match
	SrcWxtags pulumi.StringArrayOutput `pulumi:"srcWxtags"`
	// Only for Org Level WxRule
	TemplateId pulumi.StringPtrOutput `pulumi:"templateId"`
}

// NewWxrule registers a new resource with the given unique name, arguments, and options.
func NewWxrule(ctx *pulumi.Context,
	name string, args *WxruleArgs, opts ...pulumi.ResourceOption) (*Wxrule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Order == nil {
		return nil, errors.New("invalid value for required argument 'Order'")
	}
	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Wxrule
	err := ctx.RegisterResource("junipermist:site/wxrule:Wxrule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWxrule gets an existing Wxrule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWxrule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WxruleState, opts ...pulumi.ResourceOption) (*Wxrule, error) {
	var resource Wxrule
	err := ctx.ReadResource("junipermist:site/wxrule:Wxrule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Wxrule resources.
type wxruleState struct {
	// type of action, allow / block. enum: `allow`, `block`
	Action    *string  `pulumi:"action"`
	ApplyTags []string `pulumi:"applyTags"`
	// blocked apps (always blocking, ignoring action), the key of Get Application List
	BlockedApps []string `pulumi:"blockedApps"`
	// tag list to indicate these tags are allowed access
	DstAllowWxtags []string `pulumi:"dstAllowWxtags"`
	// tag list to indicate these tags are blocked access
	DstDenyWxtags []string `pulumi:"dstDenyWxtags"`
	// List of WxTag UUID
	DstWxtags []string `pulumi:"dstWxtags"`
	Enabled   *bool    `pulumi:"enabled"`
	// the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
	Order  *int    `pulumi:"order"`
	SiteId *string `pulumi:"siteId"`
	// tag list to determine if this rule would match
	SrcWxtags []string `pulumi:"srcWxtags"`
	// Only for Org Level WxRule
	TemplateId *string `pulumi:"templateId"`
}

type WxruleState struct {
	// type of action, allow / block. enum: `allow`, `block`
	Action    pulumi.StringPtrInput
	ApplyTags pulumi.StringArrayInput
	// blocked apps (always blocking, ignoring action), the key of Get Application List
	BlockedApps pulumi.StringArrayInput
	// tag list to indicate these tags are allowed access
	DstAllowWxtags pulumi.StringArrayInput
	// tag list to indicate these tags are blocked access
	DstDenyWxtags pulumi.StringArrayInput
	// List of WxTag UUID
	DstWxtags pulumi.StringArrayInput
	Enabled   pulumi.BoolPtrInput
	// the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
	Order  pulumi.IntPtrInput
	SiteId pulumi.StringPtrInput
	// tag list to determine if this rule would match
	SrcWxtags pulumi.StringArrayInput
	// Only for Org Level WxRule
	TemplateId pulumi.StringPtrInput
}

func (WxruleState) ElementType() reflect.Type {
	return reflect.TypeOf((*wxruleState)(nil)).Elem()
}

type wxruleArgs struct {
	// type of action, allow / block. enum: `allow`, `block`
	Action    string   `pulumi:"action"`
	ApplyTags []string `pulumi:"applyTags"`
	// blocked apps (always blocking, ignoring action), the key of Get Application List
	BlockedApps []string `pulumi:"blockedApps"`
	// tag list to indicate these tags are allowed access
	DstAllowWxtags []string `pulumi:"dstAllowWxtags"`
	// tag list to indicate these tags are blocked access
	DstDenyWxtags []string `pulumi:"dstDenyWxtags"`
	// List of WxTag UUID
	DstWxtags []string `pulumi:"dstWxtags"`
	Enabled   *bool    `pulumi:"enabled"`
	// the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
	Order  int    `pulumi:"order"`
	SiteId string `pulumi:"siteId"`
	// tag list to determine if this rule would match
	SrcWxtags []string `pulumi:"srcWxtags"`
	// Only for Org Level WxRule
	TemplateId *string `pulumi:"templateId"`
}

// The set of arguments for constructing a Wxrule resource.
type WxruleArgs struct {
	// type of action, allow / block. enum: `allow`, `block`
	Action    pulumi.StringInput
	ApplyTags pulumi.StringArrayInput
	// blocked apps (always blocking, ignoring action), the key of Get Application List
	BlockedApps pulumi.StringArrayInput
	// tag list to indicate these tags are allowed access
	DstAllowWxtags pulumi.StringArrayInput
	// tag list to indicate these tags are blocked access
	DstDenyWxtags pulumi.StringArrayInput
	// List of WxTag UUID
	DstWxtags pulumi.StringArrayInput
	Enabled   pulumi.BoolPtrInput
	// the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
	Order  pulumi.IntInput
	SiteId pulumi.StringInput
	// tag list to determine if this rule would match
	SrcWxtags pulumi.StringArrayInput
	// Only for Org Level WxRule
	TemplateId pulumi.StringPtrInput
}

func (WxruleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wxruleArgs)(nil)).Elem()
}

type WxruleInput interface {
	pulumi.Input

	ToWxruleOutput() WxruleOutput
	ToWxruleOutputWithContext(ctx context.Context) WxruleOutput
}

func (*Wxrule) ElementType() reflect.Type {
	return reflect.TypeOf((**Wxrule)(nil)).Elem()
}

func (i *Wxrule) ToWxruleOutput() WxruleOutput {
	return i.ToWxruleOutputWithContext(context.Background())
}

func (i *Wxrule) ToWxruleOutputWithContext(ctx context.Context) WxruleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WxruleOutput)
}

// WxruleArrayInput is an input type that accepts WxruleArray and WxruleArrayOutput values.
// You can construct a concrete instance of `WxruleArrayInput` via:
//
//	WxruleArray{ WxruleArgs{...} }
type WxruleArrayInput interface {
	pulumi.Input

	ToWxruleArrayOutput() WxruleArrayOutput
	ToWxruleArrayOutputWithContext(context.Context) WxruleArrayOutput
}

type WxruleArray []WxruleInput

func (WxruleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Wxrule)(nil)).Elem()
}

func (i WxruleArray) ToWxruleArrayOutput() WxruleArrayOutput {
	return i.ToWxruleArrayOutputWithContext(context.Background())
}

func (i WxruleArray) ToWxruleArrayOutputWithContext(ctx context.Context) WxruleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WxruleArrayOutput)
}

// WxruleMapInput is an input type that accepts WxruleMap and WxruleMapOutput values.
// You can construct a concrete instance of `WxruleMapInput` via:
//
//	WxruleMap{ "key": WxruleArgs{...} }
type WxruleMapInput interface {
	pulumi.Input

	ToWxruleMapOutput() WxruleMapOutput
	ToWxruleMapOutputWithContext(context.Context) WxruleMapOutput
}

type WxruleMap map[string]WxruleInput

func (WxruleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Wxrule)(nil)).Elem()
}

func (i WxruleMap) ToWxruleMapOutput() WxruleMapOutput {
	return i.ToWxruleMapOutputWithContext(context.Background())
}

func (i WxruleMap) ToWxruleMapOutputWithContext(ctx context.Context) WxruleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WxruleMapOutput)
}

type WxruleOutput struct{ *pulumi.OutputState }

func (WxruleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Wxrule)(nil)).Elem()
}

func (o WxruleOutput) ToWxruleOutput() WxruleOutput {
	return o
}

func (o WxruleOutput) ToWxruleOutputWithContext(ctx context.Context) WxruleOutput {
	return o
}

// type of action, allow / block. enum: `allow`, `block`
func (o WxruleOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

func (o WxruleOutput) ApplyTags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringArrayOutput { return v.ApplyTags }).(pulumi.StringArrayOutput)
}

// blocked apps (always blocking, ignoring action), the key of Get Application List
func (o WxruleOutput) BlockedApps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringArrayOutput { return v.BlockedApps }).(pulumi.StringArrayOutput)
}

// tag list to indicate these tags are allowed access
func (o WxruleOutput) DstAllowWxtags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringArrayOutput { return v.DstAllowWxtags }).(pulumi.StringArrayOutput)
}

// tag list to indicate these tags are blocked access
func (o WxruleOutput) DstDenyWxtags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringArrayOutput { return v.DstDenyWxtags }).(pulumi.StringArrayOutput)
}

// List of WxTag UUID
func (o WxruleOutput) DstWxtags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringArrayOutput { return v.DstWxtags }).(pulumi.StringArrayOutput)
}

func (o WxruleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// the order how rules would be looked up, > 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
func (o WxruleOutput) Order() pulumi.IntOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.IntOutput { return v.Order }).(pulumi.IntOutput)
}

func (o WxruleOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// tag list to determine if this rule would match
func (o WxruleOutput) SrcWxtags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringArrayOutput { return v.SrcWxtags }).(pulumi.StringArrayOutput)
}

// Only for Org Level WxRule
func (o WxruleOutput) TemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Wxrule) pulumi.StringPtrOutput { return v.TemplateId }).(pulumi.StringPtrOutput)
}

type WxruleArrayOutput struct{ *pulumi.OutputState }

func (WxruleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Wxrule)(nil)).Elem()
}

func (o WxruleArrayOutput) ToWxruleArrayOutput() WxruleArrayOutput {
	return o
}

func (o WxruleArrayOutput) ToWxruleArrayOutputWithContext(ctx context.Context) WxruleArrayOutput {
	return o
}

func (o WxruleArrayOutput) Index(i pulumi.IntInput) WxruleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Wxrule {
		return vs[0].([]*Wxrule)[vs[1].(int)]
	}).(WxruleOutput)
}

type WxruleMapOutput struct{ *pulumi.OutputState }

func (WxruleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Wxrule)(nil)).Elem()
}

func (o WxruleMapOutput) ToWxruleMapOutput() WxruleMapOutput {
	return o
}

func (o WxruleMapOutput) ToWxruleMapOutputWithContext(ctx context.Context) WxruleMapOutput {
	return o
}

func (o WxruleMapOutput) MapIndex(k pulumi.StringInput) WxruleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Wxrule {
		return vs[0].(map[string]*Wxrule)[vs[1].(string)]
	}).(WxruleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WxruleInput)(nil)).Elem(), &Wxrule{})
	pulumi.RegisterInputType(reflect.TypeOf((*WxruleArrayInput)(nil)).Elem(), WxruleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WxruleMapInput)(nil)).Elem(), WxruleMap{})
	pulumi.RegisterOutputType(WxruleOutput{})
	pulumi.RegisterOutputType(WxruleArrayOutput{})
	pulumi.RegisterOutputType(WxruleMapOutput{})
}
