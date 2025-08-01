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

// This resource is used to upload a WLAN Captive Web Portal background image.
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
//			_, err := site.NewWlanPortalImage(ctx, "wlan_one", &site.WlanPortalImageArgs{
//				SiteId: pulumi.Any(terraformTest.Id),
//				WlanId: pulumi.Any(wlanOneMistSiteWlan.Id),
//				File:   pulumi.String("/Users/johndoe/Documents/image.jpg"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type WlanPortalImage struct {
	pulumi.CustomResourceState

	// path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
	File   pulumi.StringOutput `pulumi:"file"`
	SiteId pulumi.StringOutput `pulumi:"siteId"`
	// Site WLAN ID
	WlanId pulumi.StringOutput `pulumi:"wlanId"`
}

// NewWlanPortalImage registers a new resource with the given unique name, arguments, and options.
func NewWlanPortalImage(ctx *pulumi.Context,
	name string, args *WlanPortalImageArgs, opts ...pulumi.ResourceOption) (*WlanPortalImage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.File == nil {
		return nil, errors.New("invalid value for required argument 'File'")
	}
	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	if args.WlanId == nil {
		return nil, errors.New("invalid value for required argument 'WlanId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WlanPortalImage
	err := ctx.RegisterResource("junipermist:site/wlanPortalImage:WlanPortalImage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWlanPortalImage gets an existing WlanPortalImage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWlanPortalImage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WlanPortalImageState, opts ...pulumi.ResourceOption) (*WlanPortalImage, error) {
	var resource WlanPortalImage
	err := ctx.ReadResource("junipermist:site/wlanPortalImage:WlanPortalImage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WlanPortalImage resources.
type wlanPortalImageState struct {
	// path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
	File   *string `pulumi:"file"`
	SiteId *string `pulumi:"siteId"`
	// Site WLAN ID
	WlanId *string `pulumi:"wlanId"`
}

type WlanPortalImageState struct {
	// path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
	File   pulumi.StringPtrInput
	SiteId pulumi.StringPtrInput
	// Site WLAN ID
	WlanId pulumi.StringPtrInput
}

func (WlanPortalImageState) ElementType() reflect.Type {
	return reflect.TypeOf((*wlanPortalImageState)(nil)).Elem()
}

type wlanPortalImageArgs struct {
	// path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
	File   string `pulumi:"file"`
	SiteId string `pulumi:"siteId"`
	// Site WLAN ID
	WlanId string `pulumi:"wlanId"`
}

// The set of arguments for constructing a WlanPortalImage resource.
type WlanPortalImageArgs struct {
	// path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
	File   pulumi.StringInput
	SiteId pulumi.StringInput
	// Site WLAN ID
	WlanId pulumi.StringInput
}

func (WlanPortalImageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wlanPortalImageArgs)(nil)).Elem()
}

type WlanPortalImageInput interface {
	pulumi.Input

	ToWlanPortalImageOutput() WlanPortalImageOutput
	ToWlanPortalImageOutputWithContext(ctx context.Context) WlanPortalImageOutput
}

func (*WlanPortalImage) ElementType() reflect.Type {
	return reflect.TypeOf((**WlanPortalImage)(nil)).Elem()
}

func (i *WlanPortalImage) ToWlanPortalImageOutput() WlanPortalImageOutput {
	return i.ToWlanPortalImageOutputWithContext(context.Background())
}

func (i *WlanPortalImage) ToWlanPortalImageOutputWithContext(ctx context.Context) WlanPortalImageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlanPortalImageOutput)
}

// WlanPortalImageArrayInput is an input type that accepts WlanPortalImageArray and WlanPortalImageArrayOutput values.
// You can construct a concrete instance of `WlanPortalImageArrayInput` via:
//
//	WlanPortalImageArray{ WlanPortalImageArgs{...} }
type WlanPortalImageArrayInput interface {
	pulumi.Input

	ToWlanPortalImageArrayOutput() WlanPortalImageArrayOutput
	ToWlanPortalImageArrayOutputWithContext(context.Context) WlanPortalImageArrayOutput
}

type WlanPortalImageArray []WlanPortalImageInput

func (WlanPortalImageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WlanPortalImage)(nil)).Elem()
}

func (i WlanPortalImageArray) ToWlanPortalImageArrayOutput() WlanPortalImageArrayOutput {
	return i.ToWlanPortalImageArrayOutputWithContext(context.Background())
}

func (i WlanPortalImageArray) ToWlanPortalImageArrayOutputWithContext(ctx context.Context) WlanPortalImageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlanPortalImageArrayOutput)
}

// WlanPortalImageMapInput is an input type that accepts WlanPortalImageMap and WlanPortalImageMapOutput values.
// You can construct a concrete instance of `WlanPortalImageMapInput` via:
//
//	WlanPortalImageMap{ "key": WlanPortalImageArgs{...} }
type WlanPortalImageMapInput interface {
	pulumi.Input

	ToWlanPortalImageMapOutput() WlanPortalImageMapOutput
	ToWlanPortalImageMapOutputWithContext(context.Context) WlanPortalImageMapOutput
}

type WlanPortalImageMap map[string]WlanPortalImageInput

func (WlanPortalImageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WlanPortalImage)(nil)).Elem()
}

func (i WlanPortalImageMap) ToWlanPortalImageMapOutput() WlanPortalImageMapOutput {
	return i.ToWlanPortalImageMapOutputWithContext(context.Background())
}

func (i WlanPortalImageMap) ToWlanPortalImageMapOutputWithContext(ctx context.Context) WlanPortalImageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WlanPortalImageMapOutput)
}

type WlanPortalImageOutput struct{ *pulumi.OutputState }

func (WlanPortalImageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WlanPortalImage)(nil)).Elem()
}

func (o WlanPortalImageOutput) ToWlanPortalImageOutput() WlanPortalImageOutput {
	return o
}

func (o WlanPortalImageOutput) ToWlanPortalImageOutputWithContext(ctx context.Context) WlanPortalImageOutput {
	return o
}

// path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
func (o WlanPortalImageOutput) File() pulumi.StringOutput {
	return o.ApplyT(func(v *WlanPortalImage) pulumi.StringOutput { return v.File }).(pulumi.StringOutput)
}

func (o WlanPortalImageOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *WlanPortalImage) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// Site WLAN ID
func (o WlanPortalImageOutput) WlanId() pulumi.StringOutput {
	return o.ApplyT(func(v *WlanPortalImage) pulumi.StringOutput { return v.WlanId }).(pulumi.StringOutput)
}

type WlanPortalImageArrayOutput struct{ *pulumi.OutputState }

func (WlanPortalImageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WlanPortalImage)(nil)).Elem()
}

func (o WlanPortalImageArrayOutput) ToWlanPortalImageArrayOutput() WlanPortalImageArrayOutput {
	return o
}

func (o WlanPortalImageArrayOutput) ToWlanPortalImageArrayOutputWithContext(ctx context.Context) WlanPortalImageArrayOutput {
	return o
}

func (o WlanPortalImageArrayOutput) Index(i pulumi.IntInput) WlanPortalImageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WlanPortalImage {
		return vs[0].([]*WlanPortalImage)[vs[1].(int)]
	}).(WlanPortalImageOutput)
}

type WlanPortalImageMapOutput struct{ *pulumi.OutputState }

func (WlanPortalImageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WlanPortalImage)(nil)).Elem()
}

func (o WlanPortalImageMapOutput) ToWlanPortalImageMapOutput() WlanPortalImageMapOutput {
	return o
}

func (o WlanPortalImageMapOutput) ToWlanPortalImageMapOutputWithContext(ctx context.Context) WlanPortalImageMapOutput {
	return o
}

func (o WlanPortalImageMapOutput) MapIndex(k pulumi.StringInput) WlanPortalImageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WlanPortalImage {
		return vs[0].(map[string]*WlanPortalImage)[vs[1].(string)]
	}).(WlanPortalImageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WlanPortalImageInput)(nil)).Elem(), &WlanPortalImage{})
	pulumi.RegisterInputType(reflect.TypeOf((*WlanPortalImageArrayInput)(nil)).Elem(), WlanPortalImageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WlanPortalImageMapInput)(nil)).Elem(), WlanPortalImageMap{})
	pulumi.RegisterOutputType(WlanPortalImageOutput{})
	pulumi.RegisterOutputType(WlanPortalImageArrayOutput{})
	pulumi.RegisterOutputType(WlanPortalImageMapOutput{})
}
