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

// This resource manages Org SSO Roles for Admin Authentication.
//
// SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.\
// These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.\
// Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects.
//
// ## Import
//
// Using `pulumi import`, import `mist_org_sso_role` with:
//
// Org PSK can be imported by specifying the org_id and the sso_role_id
//
// ```sh
// $ pulumi import junipermist:org/ssoRole:SsoRole sso_role_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type SsoRole struct {
	pulumi.CustomResourceState

	Name       pulumi.StringOutput         `pulumi:"name"`
	OrgId      pulumi.StringOutput         `pulumi:"orgId"`
	Privileges SsoRolePrivilegeArrayOutput `pulumi:"privileges"`
}

// NewSsoRole registers a new resource with the given unique name, arguments, and options.
func NewSsoRole(ctx *pulumi.Context,
	name string, args *SsoRoleArgs, opts ...pulumi.ResourceOption) (*SsoRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Privileges == nil {
		return nil, errors.New("invalid value for required argument 'Privileges'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SsoRole
	err := ctx.RegisterResource("junipermist:org/ssoRole:SsoRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSsoRole gets an existing SsoRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSsoRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SsoRoleState, opts ...pulumi.ResourceOption) (*SsoRole, error) {
	var resource SsoRole
	err := ctx.ReadResource("junipermist:org/ssoRole:SsoRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SsoRole resources.
type ssoRoleState struct {
	Name       *string            `pulumi:"name"`
	OrgId      *string            `pulumi:"orgId"`
	Privileges []SsoRolePrivilege `pulumi:"privileges"`
}

type SsoRoleState struct {
	Name       pulumi.StringPtrInput
	OrgId      pulumi.StringPtrInput
	Privileges SsoRolePrivilegeArrayInput
}

func (SsoRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ssoRoleState)(nil)).Elem()
}

type ssoRoleArgs struct {
	Name       *string            `pulumi:"name"`
	OrgId      string             `pulumi:"orgId"`
	Privileges []SsoRolePrivilege `pulumi:"privileges"`
}

// The set of arguments for constructing a SsoRole resource.
type SsoRoleArgs struct {
	Name       pulumi.StringPtrInput
	OrgId      pulumi.StringInput
	Privileges SsoRolePrivilegeArrayInput
}

func (SsoRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ssoRoleArgs)(nil)).Elem()
}

type SsoRoleInput interface {
	pulumi.Input

	ToSsoRoleOutput() SsoRoleOutput
	ToSsoRoleOutputWithContext(ctx context.Context) SsoRoleOutput
}

func (*SsoRole) ElementType() reflect.Type {
	return reflect.TypeOf((**SsoRole)(nil)).Elem()
}

func (i *SsoRole) ToSsoRoleOutput() SsoRoleOutput {
	return i.ToSsoRoleOutputWithContext(context.Background())
}

func (i *SsoRole) ToSsoRoleOutputWithContext(ctx context.Context) SsoRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SsoRoleOutput)
}

// SsoRoleArrayInput is an input type that accepts SsoRoleArray and SsoRoleArrayOutput values.
// You can construct a concrete instance of `SsoRoleArrayInput` via:
//
//	SsoRoleArray{ SsoRoleArgs{...} }
type SsoRoleArrayInput interface {
	pulumi.Input

	ToSsoRoleArrayOutput() SsoRoleArrayOutput
	ToSsoRoleArrayOutputWithContext(context.Context) SsoRoleArrayOutput
}

type SsoRoleArray []SsoRoleInput

func (SsoRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SsoRole)(nil)).Elem()
}

func (i SsoRoleArray) ToSsoRoleArrayOutput() SsoRoleArrayOutput {
	return i.ToSsoRoleArrayOutputWithContext(context.Background())
}

func (i SsoRoleArray) ToSsoRoleArrayOutputWithContext(ctx context.Context) SsoRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SsoRoleArrayOutput)
}

// SsoRoleMapInput is an input type that accepts SsoRoleMap and SsoRoleMapOutput values.
// You can construct a concrete instance of `SsoRoleMapInput` via:
//
//	SsoRoleMap{ "key": SsoRoleArgs{...} }
type SsoRoleMapInput interface {
	pulumi.Input

	ToSsoRoleMapOutput() SsoRoleMapOutput
	ToSsoRoleMapOutputWithContext(context.Context) SsoRoleMapOutput
}

type SsoRoleMap map[string]SsoRoleInput

func (SsoRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SsoRole)(nil)).Elem()
}

func (i SsoRoleMap) ToSsoRoleMapOutput() SsoRoleMapOutput {
	return i.ToSsoRoleMapOutputWithContext(context.Background())
}

func (i SsoRoleMap) ToSsoRoleMapOutputWithContext(ctx context.Context) SsoRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SsoRoleMapOutput)
}

type SsoRoleOutput struct{ *pulumi.OutputState }

func (SsoRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SsoRole)(nil)).Elem()
}

func (o SsoRoleOutput) ToSsoRoleOutput() SsoRoleOutput {
	return o
}

func (o SsoRoleOutput) ToSsoRoleOutputWithContext(ctx context.Context) SsoRoleOutput {
	return o
}

func (o SsoRoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SsoRole) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SsoRoleOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *SsoRole) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

func (o SsoRoleOutput) Privileges() SsoRolePrivilegeArrayOutput {
	return o.ApplyT(func(v *SsoRole) SsoRolePrivilegeArrayOutput { return v.Privileges }).(SsoRolePrivilegeArrayOutput)
}

type SsoRoleArrayOutput struct{ *pulumi.OutputState }

func (SsoRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SsoRole)(nil)).Elem()
}

func (o SsoRoleArrayOutput) ToSsoRoleArrayOutput() SsoRoleArrayOutput {
	return o
}

func (o SsoRoleArrayOutput) ToSsoRoleArrayOutputWithContext(ctx context.Context) SsoRoleArrayOutput {
	return o
}

func (o SsoRoleArrayOutput) Index(i pulumi.IntInput) SsoRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SsoRole {
		return vs[0].([]*SsoRole)[vs[1].(int)]
	}).(SsoRoleOutput)
}

type SsoRoleMapOutput struct{ *pulumi.OutputState }

func (SsoRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SsoRole)(nil)).Elem()
}

func (o SsoRoleMapOutput) ToSsoRoleMapOutput() SsoRoleMapOutput {
	return o
}

func (o SsoRoleMapOutput) ToSsoRoleMapOutputWithContext(ctx context.Context) SsoRoleMapOutput {
	return o
}

func (o SsoRoleMapOutput) MapIndex(k pulumi.StringInput) SsoRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SsoRole {
		return vs[0].(map[string]*SsoRole)[vs[1].(string)]
	}).(SsoRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SsoRoleInput)(nil)).Elem(), &SsoRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*SsoRoleArrayInput)(nil)).Elem(), SsoRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SsoRoleMapInput)(nil)).Elem(), SsoRoleMap{})
	pulumi.RegisterOutputType(SsoRoleOutput{})
	pulumi.RegisterOutputType(SsoRoleArrayOutput{})
	pulumi.RegisterOutputType(SsoRoleMapOutput{})
}
