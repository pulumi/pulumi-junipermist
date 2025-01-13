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

// This data source provides the list of Site PSKs.
//
// A multi PSK (Pre-Shared Key) is a feature that allows the use of multiple PSKs for securing network connections.\
// It provides a simple and comprehensive way to onboard client devices without relying on client mac addresses.\
// Each psk has its own key name, which can be used for user-level accountability, key rotation, and visibility in the management platform. It supports the creation, rotation, and auto-expiration of psks, and allows vlan assignment and role assignment for dynamic per-user policies.\
// Multi PSKs create virtual broadcast domains and can be used for end-user onboarding via authenticated sso login.
//
// Mist supports two methods of Site PSKs lookup:
// * local
// * radius
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
//			_, err := site.NewPsk(ctx, "psk_one", &site.PskArgs{
//				SiteId:     pulumi.Any(terraformSite.Id),
//				Name:       pulumi.String("JNP-FR-PAR"),
//				Passphrase: pulumi.String("secretone"),
//				Ssid:       pulumi.Any(wlanOne.Ssid),
//				Usage:      pulumi.String("multi"),
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
// Using `pulumi import`, import `mist_site_psk` with:
//
// Site PSK can be imported by specifying the site_id and the psk_id
//
// ```sh
// $ pulumi import junipermist:site/psk:Psk psk_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Psk struct {
	pulumi.CustomResourceState

	// email to send psk expiring notifications to
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
	ExpireTime pulumi.IntOutput `pulumi:"expireTime"`
	// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
	ExpiryNotificationTime pulumi.IntPtrOutput `pulumi:"expiryNotificationTime"`
	// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
	Mac  pulumi.StringPtrOutput `pulumi:"mac"`
	Name pulumi.StringOutput    `pulumi:"name"`
	Note pulumi.StringPtrOutput `pulumi:"note"`
	// If set to true, reminder notification will be sent when psk is about to expire
	NotifyExpiry pulumi.BoolOutput `pulumi:"notifyExpiry"`
	// If set to true, notification will be sent when psk is created or edited
	NotifyOnCreateOrEdit pulumi.BoolPtrOutput `pulumi:"notifyOnCreateOrEdit"`
	// previous passphrase of the PSK if it has been rotated
	OldPassphrase pulumi.StringPtrOutput `pulumi:"oldPassphrase"`
	OrgId         pulumi.StringOutput    `pulumi:"orgId"`
	// passphrase of the PSK (8-63 character or 64 in hex)
	Passphrase pulumi.StringOutput    `pulumi:"passphrase"`
	Role       pulumi.StringPtrOutput `pulumi:"role"`
	SiteId     pulumi.StringOutput    `pulumi:"siteId"`
	// SSID this PSK should be applicable to
	Ssid pulumi.StringOutput `pulumi:"ssid"`
	// enum: `multi`, `single`
	Usage  pulumi.StringOutput    `pulumi:"usage"`
	VlanId pulumi.StringPtrOutput `pulumi:"vlanId"`
}

// NewPsk registers a new resource with the given unique name, arguments, and options.
func NewPsk(ctx *pulumi.Context,
	name string, args *PskArgs, opts ...pulumi.ResourceOption) (*Psk, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Passphrase == nil {
		return nil, errors.New("invalid value for required argument 'Passphrase'")
	}
	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	if args.Ssid == nil {
		return nil, errors.New("invalid value for required argument 'Ssid'")
	}
	if args.OldPassphrase != nil {
		args.OldPassphrase = pulumi.ToSecret(args.OldPassphrase).(pulumi.StringPtrInput)
	}
	if args.Passphrase != nil {
		args.Passphrase = pulumi.ToSecret(args.Passphrase).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"oldPassphrase",
		"passphrase",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Psk
	err := ctx.RegisterResource("junipermist:site/psk:Psk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPsk gets an existing Psk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPsk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PskState, opts ...pulumi.ResourceOption) (*Psk, error) {
	var resource Psk
	err := ctx.ReadResource("junipermist:site/psk:Psk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Psk resources.
type pskState struct {
	// email to send psk expiring notifications to
	Email *string `pulumi:"email"`
	// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
	ExpireTime *int `pulumi:"expireTime"`
	// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
	ExpiryNotificationTime *int `pulumi:"expiryNotificationTime"`
	// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
	Mac  *string `pulumi:"mac"`
	Name *string `pulumi:"name"`
	Note *string `pulumi:"note"`
	// If set to true, reminder notification will be sent when psk is about to expire
	NotifyExpiry *bool `pulumi:"notifyExpiry"`
	// If set to true, notification will be sent when psk is created or edited
	NotifyOnCreateOrEdit *bool `pulumi:"notifyOnCreateOrEdit"`
	// previous passphrase of the PSK if it has been rotated
	OldPassphrase *string `pulumi:"oldPassphrase"`
	OrgId         *string `pulumi:"orgId"`
	// passphrase of the PSK (8-63 character or 64 in hex)
	Passphrase *string `pulumi:"passphrase"`
	Role       *string `pulumi:"role"`
	SiteId     *string `pulumi:"siteId"`
	// SSID this PSK should be applicable to
	Ssid *string `pulumi:"ssid"`
	// enum: `multi`, `single`
	Usage  *string `pulumi:"usage"`
	VlanId *string `pulumi:"vlanId"`
}

type PskState struct {
	// email to send psk expiring notifications to
	Email pulumi.StringPtrInput
	// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
	ExpireTime pulumi.IntPtrInput
	// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
	ExpiryNotificationTime pulumi.IntPtrInput
	// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
	Mac  pulumi.StringPtrInput
	Name pulumi.StringPtrInput
	Note pulumi.StringPtrInput
	// If set to true, reminder notification will be sent when psk is about to expire
	NotifyExpiry pulumi.BoolPtrInput
	// If set to true, notification will be sent when psk is created or edited
	NotifyOnCreateOrEdit pulumi.BoolPtrInput
	// previous passphrase of the PSK if it has been rotated
	OldPassphrase pulumi.StringPtrInput
	OrgId         pulumi.StringPtrInput
	// passphrase of the PSK (8-63 character or 64 in hex)
	Passphrase pulumi.StringPtrInput
	Role       pulumi.StringPtrInput
	SiteId     pulumi.StringPtrInput
	// SSID this PSK should be applicable to
	Ssid pulumi.StringPtrInput
	// enum: `multi`, `single`
	Usage  pulumi.StringPtrInput
	VlanId pulumi.StringPtrInput
}

func (PskState) ElementType() reflect.Type {
	return reflect.TypeOf((*pskState)(nil)).Elem()
}

type pskArgs struct {
	// email to send psk expiring notifications to
	Email *string `pulumi:"email"`
	// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
	ExpireTime *int `pulumi:"expireTime"`
	// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
	ExpiryNotificationTime *int `pulumi:"expiryNotificationTime"`
	// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
	Mac  *string `pulumi:"mac"`
	Name *string `pulumi:"name"`
	Note *string `pulumi:"note"`
	// If set to true, reminder notification will be sent when psk is about to expire
	NotifyExpiry *bool `pulumi:"notifyExpiry"`
	// If set to true, notification will be sent when psk is created or edited
	NotifyOnCreateOrEdit *bool `pulumi:"notifyOnCreateOrEdit"`
	// previous passphrase of the PSK if it has been rotated
	OldPassphrase *string `pulumi:"oldPassphrase"`
	// passphrase of the PSK (8-63 character or 64 in hex)
	Passphrase string  `pulumi:"passphrase"`
	Role       *string `pulumi:"role"`
	SiteId     string  `pulumi:"siteId"`
	// SSID this PSK should be applicable to
	Ssid string `pulumi:"ssid"`
	// enum: `multi`, `single`
	Usage  *string `pulumi:"usage"`
	VlanId *string `pulumi:"vlanId"`
}

// The set of arguments for constructing a Psk resource.
type PskArgs struct {
	// email to send psk expiring notifications to
	Email pulumi.StringPtrInput
	// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
	ExpireTime pulumi.IntPtrInput
	// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
	ExpiryNotificationTime pulumi.IntPtrInput
	// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
	Mac  pulumi.StringPtrInput
	Name pulumi.StringPtrInput
	Note pulumi.StringPtrInput
	// If set to true, reminder notification will be sent when psk is about to expire
	NotifyExpiry pulumi.BoolPtrInput
	// If set to true, notification will be sent when psk is created or edited
	NotifyOnCreateOrEdit pulumi.BoolPtrInput
	// previous passphrase of the PSK if it has been rotated
	OldPassphrase pulumi.StringPtrInput
	// passphrase of the PSK (8-63 character or 64 in hex)
	Passphrase pulumi.StringInput
	Role       pulumi.StringPtrInput
	SiteId     pulumi.StringInput
	// SSID this PSK should be applicable to
	Ssid pulumi.StringInput
	// enum: `multi`, `single`
	Usage  pulumi.StringPtrInput
	VlanId pulumi.StringPtrInput
}

func (PskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pskArgs)(nil)).Elem()
}

type PskInput interface {
	pulumi.Input

	ToPskOutput() PskOutput
	ToPskOutputWithContext(ctx context.Context) PskOutput
}

func (*Psk) ElementType() reflect.Type {
	return reflect.TypeOf((**Psk)(nil)).Elem()
}

func (i *Psk) ToPskOutput() PskOutput {
	return i.ToPskOutputWithContext(context.Background())
}

func (i *Psk) ToPskOutputWithContext(ctx context.Context) PskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PskOutput)
}

// PskArrayInput is an input type that accepts PskArray and PskArrayOutput values.
// You can construct a concrete instance of `PskArrayInput` via:
//
//	PskArray{ PskArgs{...} }
type PskArrayInput interface {
	pulumi.Input

	ToPskArrayOutput() PskArrayOutput
	ToPskArrayOutputWithContext(context.Context) PskArrayOutput
}

type PskArray []PskInput

func (PskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Psk)(nil)).Elem()
}

func (i PskArray) ToPskArrayOutput() PskArrayOutput {
	return i.ToPskArrayOutputWithContext(context.Background())
}

func (i PskArray) ToPskArrayOutputWithContext(ctx context.Context) PskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PskArrayOutput)
}

// PskMapInput is an input type that accepts PskMap and PskMapOutput values.
// You can construct a concrete instance of `PskMapInput` via:
//
//	PskMap{ "key": PskArgs{...} }
type PskMapInput interface {
	pulumi.Input

	ToPskMapOutput() PskMapOutput
	ToPskMapOutputWithContext(context.Context) PskMapOutput
}

type PskMap map[string]PskInput

func (PskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Psk)(nil)).Elem()
}

func (i PskMap) ToPskMapOutput() PskMapOutput {
	return i.ToPskMapOutputWithContext(context.Background())
}

func (i PskMap) ToPskMapOutputWithContext(ctx context.Context) PskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PskMapOutput)
}

type PskOutput struct{ *pulumi.OutputState }

func (PskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Psk)(nil)).Elem()
}

func (o PskOutput) ToPskOutput() PskOutput {
	return o
}

func (o PskOutput) ToPskOutputWithContext(ctx context.Context) PskOutput {
	return o
}

// email to send psk expiring notifications to
func (o PskOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
func (o PskOutput) ExpireTime() pulumi.IntOutput {
	return o.ApplyT(func(v *Psk) pulumi.IntOutput { return v.ExpireTime }).(pulumi.IntOutput)
}

// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
func (o PskOutput) ExpiryNotificationTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.IntPtrOutput { return v.ExpiryNotificationTime }).(pulumi.IntPtrOutput)
}

// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
func (o PskOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringPtrOutput { return v.Mac }).(pulumi.StringPtrOutput)
}

func (o PskOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o PskOutput) Note() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringPtrOutput { return v.Note }).(pulumi.StringPtrOutput)
}

// If set to true, reminder notification will be sent when psk is about to expire
func (o PskOutput) NotifyExpiry() pulumi.BoolOutput {
	return o.ApplyT(func(v *Psk) pulumi.BoolOutput { return v.NotifyExpiry }).(pulumi.BoolOutput)
}

// If set to true, notification will be sent when psk is created or edited
func (o PskOutput) NotifyOnCreateOrEdit() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.BoolPtrOutput { return v.NotifyOnCreateOrEdit }).(pulumi.BoolPtrOutput)
}

// previous passphrase of the PSK if it has been rotated
func (o PskOutput) OldPassphrase() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringPtrOutput { return v.OldPassphrase }).(pulumi.StringPtrOutput)
}

func (o PskOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// passphrase of the PSK (8-63 character or 64 in hex)
func (o PskOutput) Passphrase() pulumi.StringOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringOutput { return v.Passphrase }).(pulumi.StringOutput)
}

func (o PskOutput) Role() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringPtrOutput { return v.Role }).(pulumi.StringPtrOutput)
}

func (o PskOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// SSID this PSK should be applicable to
func (o PskOutput) Ssid() pulumi.StringOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringOutput { return v.Ssid }).(pulumi.StringOutput)
}

// enum: `multi`, `single`
func (o PskOutput) Usage() pulumi.StringOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringOutput { return v.Usage }).(pulumi.StringOutput)
}

func (o PskOutput) VlanId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Psk) pulumi.StringPtrOutput { return v.VlanId }).(pulumi.StringPtrOutput)
}

type PskArrayOutput struct{ *pulumi.OutputState }

func (PskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Psk)(nil)).Elem()
}

func (o PskArrayOutput) ToPskArrayOutput() PskArrayOutput {
	return o
}

func (o PskArrayOutput) ToPskArrayOutputWithContext(ctx context.Context) PskArrayOutput {
	return o
}

func (o PskArrayOutput) Index(i pulumi.IntInput) PskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Psk {
		return vs[0].([]*Psk)[vs[1].(int)]
	}).(PskOutput)
}

type PskMapOutput struct{ *pulumi.OutputState }

func (PskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Psk)(nil)).Elem()
}

func (o PskMapOutput) ToPskMapOutput() PskMapOutput {
	return o
}

func (o PskMapOutput) ToPskMapOutputWithContext(ctx context.Context) PskMapOutput {
	return o
}

func (o PskMapOutput) MapIndex(k pulumi.StringInput) PskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Psk {
		return vs[0].(map[string]*Psk)[vs[1].(string)]
	}).(PskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PskInput)(nil)).Elem(), &Psk{})
	pulumi.RegisterInputType(reflect.TypeOf((*PskArrayInput)(nil)).Elem(), PskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PskMapInput)(nil)).Elem(), PskMap{})
	pulumi.RegisterOutputType(PskOutput{})
	pulumi.RegisterOutputType(PskArrayOutput{})
	pulumi.RegisterOutputType(PskMapOutput{})
}
