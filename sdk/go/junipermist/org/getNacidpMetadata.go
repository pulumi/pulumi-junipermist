// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the NAC IDP Metadata information.
//
// # The provided information (`entityId`, `acsUrl`, `logoutUrl` and `metadata`) are the information required to configure the IDP
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
//			_, err := org.GetNacidpMetadata(ctx, &org.GetNacidpMetadataArgs{
//				OrgId:    terraformTest.Id,
//				NacidpId: samlIdpOne.Id,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetNacidpMetadata(ctx *pulumi.Context, args *GetNacidpMetadataArgs, opts ...pulumi.InvokeOption) (*GetNacidpMetadataResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNacidpMetadataResult
	err := ctx.Invoke("junipermist:org/getNacidpMetadata:getNacidpMetadata", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNacidpMetadata.
type GetNacidpMetadataArgs struct {
	NacidpId string `pulumi:"nacidpId"`
	OrgId    string `pulumi:"orgId"`
}

// A collection of values returned by getNacidpMetadata.
type GetNacidpMetadataResult struct {
	// If `idpType`==`saml`
	AcsUrl string `pulumi:"acsUrl"`
	// If `idpType`==`saml`
	EntityId string `pulumi:"entityId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// If `idpType`==`saml`
	LogoutUrl string `pulumi:"logoutUrl"`
	// If `idpType`==`saml`
	Metadata string `pulumi:"metadata"`
	NacidpId string `pulumi:"nacidpId"`
	OrgId    string `pulumi:"orgId"`
	// If `idpType`==`oauth` and `scimEnabled`==`true`
	ScimBaseUrl string `pulumi:"scimBaseUrl"`
}

func GetNacidpMetadataOutput(ctx *pulumi.Context, args GetNacidpMetadataOutputArgs, opts ...pulumi.InvokeOption) GetNacidpMetadataResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetNacidpMetadataResultOutput, error) {
			args := v.(GetNacidpMetadataArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:org/getNacidpMetadata:getNacidpMetadata", args, GetNacidpMetadataResultOutput{}, options).(GetNacidpMetadataResultOutput), nil
		}).(GetNacidpMetadataResultOutput)
}

// A collection of arguments for invoking getNacidpMetadata.
type GetNacidpMetadataOutputArgs struct {
	NacidpId pulumi.StringInput `pulumi:"nacidpId"`
	OrgId    pulumi.StringInput `pulumi:"orgId"`
}

func (GetNacidpMetadataOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNacidpMetadataArgs)(nil)).Elem()
}

// A collection of values returned by getNacidpMetadata.
type GetNacidpMetadataResultOutput struct{ *pulumi.OutputState }

func (GetNacidpMetadataResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNacidpMetadataResult)(nil)).Elem()
}

func (o GetNacidpMetadataResultOutput) ToGetNacidpMetadataResultOutput() GetNacidpMetadataResultOutput {
	return o
}

func (o GetNacidpMetadataResultOutput) ToGetNacidpMetadataResultOutputWithContext(ctx context.Context) GetNacidpMetadataResultOutput {
	return o
}

// If `idpType`==`saml`
func (o GetNacidpMetadataResultOutput) AcsUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.AcsUrl }).(pulumi.StringOutput)
}

// If `idpType`==`saml`
func (o GetNacidpMetadataResultOutput) EntityId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.EntityId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetNacidpMetadataResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.Id }).(pulumi.StringOutput)
}

// If `idpType`==`saml`
func (o GetNacidpMetadataResultOutput) LogoutUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.LogoutUrl }).(pulumi.StringOutput)
}

// If `idpType`==`saml`
func (o GetNacidpMetadataResultOutput) Metadata() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.Metadata }).(pulumi.StringOutput)
}

func (o GetNacidpMetadataResultOutput) NacidpId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.NacidpId }).(pulumi.StringOutput)
}

func (o GetNacidpMetadataResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// If `idpType`==`oauth` and `scimEnabled`==`true`
func (o GetNacidpMetadataResultOutput) ScimBaseUrl() pulumi.StringOutput {
	return o.ApplyT(func(v GetNacidpMetadataResult) string { return v.ScimBaseUrl }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNacidpMetadataResultOutput{})
}
