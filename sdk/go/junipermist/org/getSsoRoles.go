// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource provides the list of SSO Roles.
//
// SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.\
// These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.\
// Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects..
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
//			_, err := org.GetSsoRoles(ctx, &org.GetSsoRolesArgs{
//				OrgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSsoRoles(ctx *pulumi.Context, args *GetSsoRolesArgs, opts ...pulumi.InvokeOption) (*GetSsoRolesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSsoRolesResult
	err := ctx.Invoke("junipermist:org/getSsoRoles:getSsoRoles", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSsoRoles.
type GetSsoRolesArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getSsoRoles.
type GetSsoRolesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string                  `pulumi:"id"`
	OrgId       string                  `pulumi:"orgId"`
	OrgSsoRoles []GetSsoRolesOrgSsoRole `pulumi:"orgSsoRoles"`
}

func GetSsoRolesOutput(ctx *pulumi.Context, args GetSsoRolesOutputArgs, opts ...pulumi.InvokeOption) GetSsoRolesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSsoRolesResultOutput, error) {
			args := v.(GetSsoRolesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:org/getSsoRoles:getSsoRoles", args, GetSsoRolesResultOutput{}, options).(GetSsoRolesResultOutput), nil
		}).(GetSsoRolesResultOutput)
}

// A collection of arguments for invoking getSsoRoles.
type GetSsoRolesOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetSsoRolesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSsoRolesArgs)(nil)).Elem()
}

// A collection of values returned by getSsoRoles.
type GetSsoRolesResultOutput struct{ *pulumi.OutputState }

func (GetSsoRolesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSsoRolesResult)(nil)).Elem()
}

func (o GetSsoRolesResultOutput) ToGetSsoRolesResultOutput() GetSsoRolesResultOutput {
	return o
}

func (o GetSsoRolesResultOutput) ToGetSsoRolesResultOutputWithContext(ctx context.Context) GetSsoRolesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSsoRolesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSsoRolesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSsoRolesResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSsoRolesResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetSsoRolesResultOutput) OrgSsoRoles() GetSsoRolesOrgSsoRoleArrayOutput {
	return o.ApplyT(func(v GetSsoRolesResult) []GetSsoRolesOrgSsoRole { return v.OrgSsoRoles }).(GetSsoRolesOrgSsoRoleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSsoRolesResultOutput{})
}
