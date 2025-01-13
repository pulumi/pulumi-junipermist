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

// This resources manages the Site basic information.
//
// This resource can be used to assign templates to a site, or to change basic information (e.g. Site Address)
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
//			_, err := site.Newbase(ctx, "juniper_france", &site.baseArgs{
//				OrgId:       pulumi.Any(terraformTest.Id),
//				Name:        pulumi.String("JNP-FR-PAR"),
//				CountryCode: pulumi.String("FR"),
//				Timezone:    pulumi.String("Europe/Paris"),
//				Address:     pulumi.String("41 Rue de Villiers, 92100 Neuilly sur Seine, France"),
//				Notes:       pulumi.String("Created with Terraform, Updated with Terraform"),
//				Latlng: &site.BaseLatlngArgs{
//					Lat: pulumi.Float64(48.899268),
//					Lng: pulumi.Float64(2.214447),
//				},
//				SitegroupIds: pulumi.StringArray{
//					testGroup.Id,
//					testGroup2.Id,
//				},
//				NetworktemplateId: pulumi.Any(networktemplateOne.Id),
//				RftemplateId:      pulumi.Any(rftemplateOne.Id),
//				GatewaytemplateId: pulumi.Any(gatewaytemplateOne.Id),
//				AlarmtemplateId:   pulumi.Any(alarmtemplateOne.Id),
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
// Using `pulumi import`, import `mist_site` with:
//
// Site can be imported by specifying the site_id
//
// ```sh
// $ pulumi import junipermist:site/base:base site_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Base struct {
	pulumi.CustomResourceState

	// full address of the site
	Address pulumi.StringOutput `pulumi:"address"`
	// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
	AlarmtemplateId pulumi.StringPtrOutput `pulumi:"alarmtemplateId"`
	// AP Template ID, used by APs
	AptemplateId pulumi.StringPtrOutput `pulumi:"aptemplateId"`
	// country code for the site (for AP config generation), in two-character
	CountryCode pulumi.StringPtrOutput `pulumi:"countryCode"`
	// Gateway Template ID, used by gateways
	GatewaytemplateId pulumi.StringPtrOutput `pulumi:"gatewaytemplateId"`
	Latlng            BaseLatlngPtrOutput    `pulumi:"latlng"`
	Name              pulumi.StringOutput    `pulumi:"name"`
	// Network Template ID, this takes precedence over Site Settings
	NetworktemplateId pulumi.StringPtrOutput `pulumi:"networktemplateId"`
	// optional, any notes about the site
	Notes pulumi.StringPtrOutput `pulumi:"notes"`
	OrgId pulumi.StringOutput    `pulumi:"orgId"`
	// RF Template ID, this takes precedence over Site Settings
	RftemplateId pulumi.StringPtrOutput `pulumi:"rftemplateId"`
	// SecPolicy ID
	SecpolicyId pulumi.StringPtrOutput `pulumi:"secpolicyId"`
	// sitegroups this site belongs to
	SitegroupIds pulumi.StringArrayOutput `pulumi:"sitegroupIds"`
	// Site Template ID
	SitetemplateId pulumi.StringPtrOutput `pulumi:"sitetemplateId"`
	// Timezone the site is at
	Timezone pulumi.StringOutput `pulumi:"timezone"`
}

// NewBase registers a new resource with the given unique name, arguments, and options.
func NewBase(ctx *pulumi.Context,
	name string, args *BaseArgs, opts ...pulumi.ResourceOption) (*Base, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("junipermist:device/base:base"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Base
	err := ctx.RegisterResource("junipermist:site/base:base", name, args, &resource, opts...)
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
	err := ctx.ReadResource("junipermist:site/base:base", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Base resources.
type baseState struct {
	// full address of the site
	Address *string `pulumi:"address"`
	// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
	AlarmtemplateId *string `pulumi:"alarmtemplateId"`
	// AP Template ID, used by APs
	AptemplateId *string `pulumi:"aptemplateId"`
	// country code for the site (for AP config generation), in two-character
	CountryCode *string `pulumi:"countryCode"`
	// Gateway Template ID, used by gateways
	GatewaytemplateId *string     `pulumi:"gatewaytemplateId"`
	Latlng            *BaseLatlng `pulumi:"latlng"`
	Name              *string     `pulumi:"name"`
	// Network Template ID, this takes precedence over Site Settings
	NetworktemplateId *string `pulumi:"networktemplateId"`
	// optional, any notes about the site
	Notes *string `pulumi:"notes"`
	OrgId *string `pulumi:"orgId"`
	// RF Template ID, this takes precedence over Site Settings
	RftemplateId *string `pulumi:"rftemplateId"`
	// SecPolicy ID
	SecpolicyId *string `pulumi:"secpolicyId"`
	// sitegroups this site belongs to
	SitegroupIds []string `pulumi:"sitegroupIds"`
	// Site Template ID
	SitetemplateId *string `pulumi:"sitetemplateId"`
	// Timezone the site is at
	Timezone *string `pulumi:"timezone"`
}

type BaseState struct {
	// full address of the site
	Address pulumi.StringPtrInput
	// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
	AlarmtemplateId pulumi.StringPtrInput
	// AP Template ID, used by APs
	AptemplateId pulumi.StringPtrInput
	// country code for the site (for AP config generation), in two-character
	CountryCode pulumi.StringPtrInput
	// Gateway Template ID, used by gateways
	GatewaytemplateId pulumi.StringPtrInput
	Latlng            BaseLatlngPtrInput
	Name              pulumi.StringPtrInput
	// Network Template ID, this takes precedence over Site Settings
	NetworktemplateId pulumi.StringPtrInput
	// optional, any notes about the site
	Notes pulumi.StringPtrInput
	OrgId pulumi.StringPtrInput
	// RF Template ID, this takes precedence over Site Settings
	RftemplateId pulumi.StringPtrInput
	// SecPolicy ID
	SecpolicyId pulumi.StringPtrInput
	// sitegroups this site belongs to
	SitegroupIds pulumi.StringArrayInput
	// Site Template ID
	SitetemplateId pulumi.StringPtrInput
	// Timezone the site is at
	Timezone pulumi.StringPtrInput
}

func (BaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*baseState)(nil)).Elem()
}

type baseArgs struct {
	// full address of the site
	Address string `pulumi:"address"`
	// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
	AlarmtemplateId *string `pulumi:"alarmtemplateId"`
	// AP Template ID, used by APs
	AptemplateId *string `pulumi:"aptemplateId"`
	// country code for the site (for AP config generation), in two-character
	CountryCode *string `pulumi:"countryCode"`
	// Gateway Template ID, used by gateways
	GatewaytemplateId *string     `pulumi:"gatewaytemplateId"`
	Latlng            *BaseLatlng `pulumi:"latlng"`
	Name              *string     `pulumi:"name"`
	// Network Template ID, this takes precedence over Site Settings
	NetworktemplateId *string `pulumi:"networktemplateId"`
	// optional, any notes about the site
	Notes *string `pulumi:"notes"`
	OrgId string  `pulumi:"orgId"`
	// RF Template ID, this takes precedence over Site Settings
	RftemplateId *string `pulumi:"rftemplateId"`
	// SecPolicy ID
	SecpolicyId *string `pulumi:"secpolicyId"`
	// sitegroups this site belongs to
	SitegroupIds []string `pulumi:"sitegroupIds"`
	// Site Template ID
	SitetemplateId *string `pulumi:"sitetemplateId"`
	// Timezone the site is at
	Timezone *string `pulumi:"timezone"`
}

// The set of arguments for constructing a Base resource.
type BaseArgs struct {
	// full address of the site
	Address pulumi.StringInput
	// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
	AlarmtemplateId pulumi.StringPtrInput
	// AP Template ID, used by APs
	AptemplateId pulumi.StringPtrInput
	// country code for the site (for AP config generation), in two-character
	CountryCode pulumi.StringPtrInput
	// Gateway Template ID, used by gateways
	GatewaytemplateId pulumi.StringPtrInput
	Latlng            BaseLatlngPtrInput
	Name              pulumi.StringPtrInput
	// Network Template ID, this takes precedence over Site Settings
	NetworktemplateId pulumi.StringPtrInput
	// optional, any notes about the site
	Notes pulumi.StringPtrInput
	OrgId pulumi.StringInput
	// RF Template ID, this takes precedence over Site Settings
	RftemplateId pulumi.StringPtrInput
	// SecPolicy ID
	SecpolicyId pulumi.StringPtrInput
	// sitegroups this site belongs to
	SitegroupIds pulumi.StringArrayInput
	// Site Template ID
	SitetemplateId pulumi.StringPtrInput
	// Timezone the site is at
	Timezone pulumi.StringPtrInput
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

// full address of the site
func (o BaseOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
func (o BaseOutput) AlarmtemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.AlarmtemplateId }).(pulumi.StringPtrOutput)
}

// AP Template ID, used by APs
func (o BaseOutput) AptemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.AptemplateId }).(pulumi.StringPtrOutput)
}

// country code for the site (for AP config generation), in two-character
func (o BaseOutput) CountryCode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.CountryCode }).(pulumi.StringPtrOutput)
}

// Gateway Template ID, used by gateways
func (o BaseOutput) GatewaytemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.GatewaytemplateId }).(pulumi.StringPtrOutput)
}

func (o BaseOutput) Latlng() BaseLatlngPtrOutput {
	return o.ApplyT(func(v *Base) BaseLatlngPtrOutput { return v.Latlng }).(BaseLatlngPtrOutput)
}

func (o BaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Network Template ID, this takes precedence over Site Settings
func (o BaseOutput) NetworktemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.NetworktemplateId }).(pulumi.StringPtrOutput)
}

// optional, any notes about the site
func (o BaseOutput) Notes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.Notes }).(pulumi.StringPtrOutput)
}

func (o BaseOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// RF Template ID, this takes precedence over Site Settings
func (o BaseOutput) RftemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.RftemplateId }).(pulumi.StringPtrOutput)
}

// SecPolicy ID
func (o BaseOutput) SecpolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.SecpolicyId }).(pulumi.StringPtrOutput)
}

// sitegroups this site belongs to
func (o BaseOutput) SitegroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Base) pulumi.StringArrayOutput { return v.SitegroupIds }).(pulumi.StringArrayOutput)
}

// Site Template ID
func (o BaseOutput) SitetemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Base) pulumi.StringPtrOutput { return v.SitetemplateId }).(pulumi.StringPtrOutput)
}

// Timezone the site is at
func (o BaseOutput) Timezone() pulumi.StringOutput {
	return o.ApplyT(func(v *Base) pulumi.StringOutput { return v.Timezone }).(pulumi.StringOutput)
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
