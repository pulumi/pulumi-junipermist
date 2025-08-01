// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package site

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource is used customize the WLAN Guest Portal.
// The WLAN Portal Template can be used to define:
// * Guest Authentication methods and parameters (access duration, ...)
// * Default values of the text fields and labels on the portal
// * Values of the text fields and labels based on the User Agent (`locales` property)
//
// **Notes:**
// * There is no feedback from the API, so there is no possibility to validate the changes. The resource states is directly generated based on the resource plan.* There is no option to delete or revert the changes. Deleting the resource will just remove it from the states. Once removed, it is possible to create a new one. It will replace the previous template
type WlanPortalTemplate struct {
	pulumi.CustomResourceState

	// Portal template wlan settings
	PortalTemplate WlanPortalTemplatePortalTemplateOutput `pulumi:"portalTemplate"`
	SiteId         pulumi.StringOutput                    `pulumi:"siteId"`
	// Site WLAN ID
	WlanId pulumi.StringOutput `pulumi:"wlanId"`
}

// NewWlanPortalTemplate registers a new resource with the given unique name, arguments, and options.
func NewWlanPortalTemplate(ctx *pulumi.Context,
	name string, args *WlanPortalTemplateArgs, opts ...pulumi.ResourceOption) (*WlanPortalTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PortalTemplate == nil {
		return nil, errors.New("invalid value for required argument 'PortalTemplate'")
	}
	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	if args.WlanId == nil {
		return nil, errors.New("invalid value for required argument 'WlanId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WlanPortalTemplate
	err := ctx.RegisterResource("junipermist:site/wlanPortalTemplate:WlanPortalTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWlanPortalTemplate gets an existing WlanPortalTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWlanPortalTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WlanPortalTemplateState, opts ...pulumi.ResourceOption) (*WlanPortalTemplate, error) {
	var resource WlanPortalTemplate
	err := ctx.ReadResource("junipermist:site/wlanPortalTemplate:WlanPortalTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WlanPortalTemplate resources.
type wlanPortalTemplateState struct {
	// Portal template wlan settings
	PortalTemplate *WlanPortalTemplatePortalTemplate `pulumi:"portalTemplate"`
	SiteId         *string                           `pulumi:"siteId"`
	// Site WLAN ID
	WlanId *string `pulumi:"wlanId"`
}

type WlanPortalTemplateState struct {
	// Portal template wlan settings
	PortalTemplate WlanPortalTemplatePortalTemplatePtrInput
	SiteId         pulumi.StringPtrInput
	// Site WLAN ID
	WlanId pulumi.StringPtrInput
}

func (WlanPortalTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*wlanPortalTemplateState)(nil)).Elem()
}

type wlanPortalTemplateArgs struct {
	// Portal template wlan settings
	PortalTemplate WlanPortalTemplatePortalTemplate `pulumi:"portalTemplate"`
	SiteId         string                           `pulumi:"siteId"`
	// Site WLAN ID
	WlanId string `pulumi:"wlanId"`
}

// The set of arguments for constructing a WlanPortalTemplate resource.
type WlanPortalTemplateArgs struct {
	// Portal template wlan settings
	PortalTemplate WlanPortalTemplatePortalTemplateInput
	SiteId         pulumi.StringInput
	// Site WLAN ID
	WlanId pulumi.StringInput
}

func (WlanPortalTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wlanPortalTemplateArgs)(nil)).Elem()
}

type WlanPortalTemplateInput interface {
	pulumi.Input

	ToWlanPortalTemplateOutput() WlanPortalTemplateOutput
	ToWlanPortalTemplateOutputWithContext(ctx context.Context) WlanPortalTemplateOutput
}

func (*WlanPortalTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**WlanPortalTemplate)(nil)).Elem()
}

func (i *WlanPortalTemplate) ToWlanPortalTemplateOutput() WlanPortalTemplateOutput {
	return i.ToWlanPortalTemplateOutputWithContext(context.Background())
}

func (i *WlanPortalTemplate) ToWlanPortalTemplateOutputWithContext(ctx context.Context) WlanPortalTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlanPortalTemplateOutput)
}

// WlanPortalTemplateArrayInput is an input type that accepts WlanPortalTemplateArray and WlanPortalTemplateArrayOutput values.
// You can construct a concrete instance of `WlanPortalTemplateArrayInput` via:
//
//	WlanPortalTemplateArray{ WlanPortalTemplateArgs{...} }
type WlanPortalTemplateArrayInput interface {
	pulumi.Input

	ToWlanPortalTemplateArrayOutput() WlanPortalTemplateArrayOutput
	ToWlanPortalTemplateArrayOutputWithContext(context.Context) WlanPortalTemplateArrayOutput
}

type WlanPortalTemplateArray []WlanPortalTemplateInput

func (WlanPortalTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WlanPortalTemplate)(nil)).Elem()
}

func (i WlanPortalTemplateArray) ToWlanPortalTemplateArrayOutput() WlanPortalTemplateArrayOutput {
	return i.ToWlanPortalTemplateArrayOutputWithContext(context.Background())
}

func (i WlanPortalTemplateArray) ToWlanPortalTemplateArrayOutputWithContext(ctx context.Context) WlanPortalTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlanPortalTemplateArrayOutput)
}

// WlanPortalTemplateMapInput is an input type that accepts WlanPortalTemplateMap and WlanPortalTemplateMapOutput values.
// You can construct a concrete instance of `WlanPortalTemplateMapInput` via:
//
//	WlanPortalTemplateMap{ "key": WlanPortalTemplateArgs{...} }
type WlanPortalTemplateMapInput interface {
	pulumi.Input

	ToWlanPortalTemplateMapOutput() WlanPortalTemplateMapOutput
	ToWlanPortalTemplateMapOutputWithContext(context.Context) WlanPortalTemplateMapOutput
}

type WlanPortalTemplateMap map[string]WlanPortalTemplateInput

func (WlanPortalTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WlanPortalTemplate)(nil)).Elem()
}

func (i WlanPortalTemplateMap) ToWlanPortalTemplateMapOutput() WlanPortalTemplateMapOutput {
	return i.ToWlanPortalTemplateMapOutputWithContext(context.Background())
}

func (i WlanPortalTemplateMap) ToWlanPortalTemplateMapOutputWithContext(ctx context.Context) WlanPortalTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlanPortalTemplateMapOutput)
}

type WlanPortalTemplateOutput struct{ *pulumi.OutputState }

func (WlanPortalTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WlanPortalTemplate)(nil)).Elem()
}

func (o WlanPortalTemplateOutput) ToWlanPortalTemplateOutput() WlanPortalTemplateOutput {
	return o
}

func (o WlanPortalTemplateOutput) ToWlanPortalTemplateOutputWithContext(ctx context.Context) WlanPortalTemplateOutput {
	return o
}

// Portal template wlan settings
func (o WlanPortalTemplateOutput) PortalTemplate() WlanPortalTemplatePortalTemplateOutput {
	return o.ApplyT(func(v *WlanPortalTemplate) WlanPortalTemplatePortalTemplateOutput { return v.PortalTemplate }).(WlanPortalTemplatePortalTemplateOutput)
}

func (o WlanPortalTemplateOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *WlanPortalTemplate) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// Site WLAN ID
func (o WlanPortalTemplateOutput) WlanId() pulumi.StringOutput {
	return o.ApplyT(func(v *WlanPortalTemplate) pulumi.StringOutput { return v.WlanId }).(pulumi.StringOutput)
}

type WlanPortalTemplateArrayOutput struct{ *pulumi.OutputState }

func (WlanPortalTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WlanPortalTemplate)(nil)).Elem()
}

func (o WlanPortalTemplateArrayOutput) ToWlanPortalTemplateArrayOutput() WlanPortalTemplateArrayOutput {
	return o
}

func (o WlanPortalTemplateArrayOutput) ToWlanPortalTemplateArrayOutputWithContext(ctx context.Context) WlanPortalTemplateArrayOutput {
	return o
}

func (o WlanPortalTemplateArrayOutput) Index(i pulumi.IntInput) WlanPortalTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WlanPortalTemplate {
		return vs[0].([]*WlanPortalTemplate)[vs[1].(int)]
	}).(WlanPortalTemplateOutput)
}

type WlanPortalTemplateMapOutput struct{ *pulumi.OutputState }

func (WlanPortalTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WlanPortalTemplate)(nil)).Elem()
}

func (o WlanPortalTemplateMapOutput) ToWlanPortalTemplateMapOutput() WlanPortalTemplateMapOutput {
	return o
}

func (o WlanPortalTemplateMapOutput) ToWlanPortalTemplateMapOutputWithContext(ctx context.Context) WlanPortalTemplateMapOutput {
	return o
}

func (o WlanPortalTemplateMapOutput) MapIndex(k pulumi.StringInput) WlanPortalTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WlanPortalTemplate {
		return vs[0].(map[string]*WlanPortalTemplate)[vs[1].(string)]
	}).(WlanPortalTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WlanPortalTemplateInput)(nil)).Elem(), &WlanPortalTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*WlanPortalTemplateArrayInput)(nil)).Elem(), WlanPortalTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WlanPortalTemplateMapInput)(nil)).Elem(), WlanPortalTemplateMap{})
	pulumi.RegisterOutputType(WlanPortalTemplateOutput{})
	pulumi.RegisterOutputType(WlanPortalTemplateArrayOutput{})
	pulumi.RegisterOutputType(WlanPortalTemplateMapOutput{})
}
