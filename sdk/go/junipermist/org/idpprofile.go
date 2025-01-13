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

// This resource manages WAN Assurance Idp Profiles.
//
// An IDP Profile is a configuration setting that defines the behavior and actions of an intrusion detection and prevention (IDP) system. It specifies how the idp system should detect and respond to potential security threats or attacks on a network.
//
// The profile includes rules and policies that determine which types of traffic or attacks should be monitored, what actions should be taken when a threat is detected, and any exceptions or exclusions for specific destinations or attack types.
//
// ## Import
//
// Using `pulumi import`, import `mist_org_idpprofile` with:
//
// IDP Profile can be imported by specifying the org_id and the idpprofile_id
//
// ```sh
// $ pulumi import junipermist:org/idpprofile:Idpprofile idpprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Idpprofile struct {
	pulumi.CustomResourceState

	// enum: `critical`, `standard`, `strict`
	BaseProfile pulumi.StringOutput            `pulumi:"baseProfile"`
	Name        pulumi.StringOutput            `pulumi:"name"`
	OrgId       pulumi.StringOutput            `pulumi:"orgId"`
	Overwrites  IdpprofileOverwriteArrayOutput `pulumi:"overwrites"`
}

// NewIdpprofile registers a new resource with the given unique name, arguments, and options.
func NewIdpprofile(ctx *pulumi.Context,
	name string, args *IdpprofileArgs, opts ...pulumi.ResourceOption) (*Idpprofile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BaseProfile == nil {
		return nil, errors.New("invalid value for required argument 'BaseProfile'")
	}
	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Idpprofile
	err := ctx.RegisterResource("junipermist:org/idpprofile:Idpprofile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIdpprofile gets an existing Idpprofile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIdpprofile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IdpprofileState, opts ...pulumi.ResourceOption) (*Idpprofile, error) {
	var resource Idpprofile
	err := ctx.ReadResource("junipermist:org/idpprofile:Idpprofile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Idpprofile resources.
type idpprofileState struct {
	// enum: `critical`, `standard`, `strict`
	BaseProfile *string               `pulumi:"baseProfile"`
	Name        *string               `pulumi:"name"`
	OrgId       *string               `pulumi:"orgId"`
	Overwrites  []IdpprofileOverwrite `pulumi:"overwrites"`
}

type IdpprofileState struct {
	// enum: `critical`, `standard`, `strict`
	BaseProfile pulumi.StringPtrInput
	Name        pulumi.StringPtrInput
	OrgId       pulumi.StringPtrInput
	Overwrites  IdpprofileOverwriteArrayInput
}

func (IdpprofileState) ElementType() reflect.Type {
	return reflect.TypeOf((*idpprofileState)(nil)).Elem()
}

type idpprofileArgs struct {
	// enum: `critical`, `standard`, `strict`
	BaseProfile string                `pulumi:"baseProfile"`
	Name        *string               `pulumi:"name"`
	OrgId       string                `pulumi:"orgId"`
	Overwrites  []IdpprofileOverwrite `pulumi:"overwrites"`
}

// The set of arguments for constructing a Idpprofile resource.
type IdpprofileArgs struct {
	// enum: `critical`, `standard`, `strict`
	BaseProfile pulumi.StringInput
	Name        pulumi.StringPtrInput
	OrgId       pulumi.StringInput
	Overwrites  IdpprofileOverwriteArrayInput
}

func (IdpprofileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*idpprofileArgs)(nil)).Elem()
}

type IdpprofileInput interface {
	pulumi.Input

	ToIdpprofileOutput() IdpprofileOutput
	ToIdpprofileOutputWithContext(ctx context.Context) IdpprofileOutput
}

func (*Idpprofile) ElementType() reflect.Type {
	return reflect.TypeOf((**Idpprofile)(nil)).Elem()
}

func (i *Idpprofile) ToIdpprofileOutput() IdpprofileOutput {
	return i.ToIdpprofileOutputWithContext(context.Background())
}

func (i *Idpprofile) ToIdpprofileOutputWithContext(ctx context.Context) IdpprofileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdpprofileOutput)
}

// IdpprofileArrayInput is an input type that accepts IdpprofileArray and IdpprofileArrayOutput values.
// You can construct a concrete instance of `IdpprofileArrayInput` via:
//
//	IdpprofileArray{ IdpprofileArgs{...} }
type IdpprofileArrayInput interface {
	pulumi.Input

	ToIdpprofileArrayOutput() IdpprofileArrayOutput
	ToIdpprofileArrayOutputWithContext(context.Context) IdpprofileArrayOutput
}

type IdpprofileArray []IdpprofileInput

func (IdpprofileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Idpprofile)(nil)).Elem()
}

func (i IdpprofileArray) ToIdpprofileArrayOutput() IdpprofileArrayOutput {
	return i.ToIdpprofileArrayOutputWithContext(context.Background())
}

func (i IdpprofileArray) ToIdpprofileArrayOutputWithContext(ctx context.Context) IdpprofileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdpprofileArrayOutput)
}

// IdpprofileMapInput is an input type that accepts IdpprofileMap and IdpprofileMapOutput values.
// You can construct a concrete instance of `IdpprofileMapInput` via:
//
//	IdpprofileMap{ "key": IdpprofileArgs{...} }
type IdpprofileMapInput interface {
	pulumi.Input

	ToIdpprofileMapOutput() IdpprofileMapOutput
	ToIdpprofileMapOutputWithContext(context.Context) IdpprofileMapOutput
}

type IdpprofileMap map[string]IdpprofileInput

func (IdpprofileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Idpprofile)(nil)).Elem()
}

func (i IdpprofileMap) ToIdpprofileMapOutput() IdpprofileMapOutput {
	return i.ToIdpprofileMapOutputWithContext(context.Background())
}

func (i IdpprofileMap) ToIdpprofileMapOutputWithContext(ctx context.Context) IdpprofileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IdpprofileMapOutput)
}

type IdpprofileOutput struct{ *pulumi.OutputState }

func (IdpprofileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Idpprofile)(nil)).Elem()
}

func (o IdpprofileOutput) ToIdpprofileOutput() IdpprofileOutput {
	return o
}

func (o IdpprofileOutput) ToIdpprofileOutputWithContext(ctx context.Context) IdpprofileOutput {
	return o
}

// enum: `critical`, `standard`, `strict`
func (o IdpprofileOutput) BaseProfile() pulumi.StringOutput {
	return o.ApplyT(func(v *Idpprofile) pulumi.StringOutput { return v.BaseProfile }).(pulumi.StringOutput)
}

func (o IdpprofileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Idpprofile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o IdpprofileOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Idpprofile) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

func (o IdpprofileOutput) Overwrites() IdpprofileOverwriteArrayOutput {
	return o.ApplyT(func(v *Idpprofile) IdpprofileOverwriteArrayOutput { return v.Overwrites }).(IdpprofileOverwriteArrayOutput)
}

type IdpprofileArrayOutput struct{ *pulumi.OutputState }

func (IdpprofileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Idpprofile)(nil)).Elem()
}

func (o IdpprofileArrayOutput) ToIdpprofileArrayOutput() IdpprofileArrayOutput {
	return o
}

func (o IdpprofileArrayOutput) ToIdpprofileArrayOutputWithContext(ctx context.Context) IdpprofileArrayOutput {
	return o
}

func (o IdpprofileArrayOutput) Index(i pulumi.IntInput) IdpprofileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Idpprofile {
		return vs[0].([]*Idpprofile)[vs[1].(int)]
	}).(IdpprofileOutput)
}

type IdpprofileMapOutput struct{ *pulumi.OutputState }

func (IdpprofileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Idpprofile)(nil)).Elem()
}

func (o IdpprofileMapOutput) ToIdpprofileMapOutput() IdpprofileMapOutput {
	return o
}

func (o IdpprofileMapOutput) ToIdpprofileMapOutputWithContext(ctx context.Context) IdpprofileMapOutput {
	return o
}

func (o IdpprofileMapOutput) MapIndex(k pulumi.StringInput) IdpprofileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Idpprofile {
		return vs[0].(map[string]*Idpprofile)[vs[1].(string)]
	}).(IdpprofileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IdpprofileInput)(nil)).Elem(), &Idpprofile{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdpprofileArrayInput)(nil)).Elem(), IdpprofileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IdpprofileMapInput)(nil)).Elem(), IdpprofileMap{})
	pulumi.RegisterOutputType(IdpprofileOutput{})
	pulumi.RegisterOutputType(IdpprofileArrayOutput{})
	pulumi.RegisterOutputType(IdpprofileMapOutput{})
}
