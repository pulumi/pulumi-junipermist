// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of NAC Tags (Auth Policy Labels).The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
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
//			_, err := org.GetNactags(ctx, &org.GetNactagsArgs{
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
func GetNactags(ctx *pulumi.Context, args *GetNactagsArgs, opts ...pulumi.InvokeOption) (*GetNactagsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNactagsResult
	err := ctx.Invoke("junipermist:org/getNactags:getNactags", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNactags.
type GetNactagsArgs struct {
	Limit *int    `pulumi:"limit"`
	Match *string `pulumi:"match"`
	Name  *string `pulumi:"name"`
	OrgId string  `pulumi:"orgId"`
	Page  *int    `pulumi:"page"`
	Type  *string `pulumi:"type"`
}

// A collection of values returned by getNactags.
type GetNactagsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                `pulumi:"id"`
	Limit      *int                  `pulumi:"limit"`
	Match      *string               `pulumi:"match"`
	Name       *string               `pulumi:"name"`
	OrgId      string                `pulumi:"orgId"`
	OrgNactags []GetNactagsOrgNactag `pulumi:"orgNactags"`
	Page       *int                  `pulumi:"page"`
	Type       *string               `pulumi:"type"`
}

func GetNactagsOutput(ctx *pulumi.Context, args GetNactagsOutputArgs, opts ...pulumi.InvokeOption) GetNactagsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNactagsResultOutput, error) {
			args := v.(GetNactagsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetNactagsResult
			secret, err := ctx.InvokePackageRaw("junipermist:org/getNactags:getNactags", args, &rv, "", opts...)
			if err != nil {
				return GetNactagsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetNactagsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetNactagsResultOutput), nil
			}
			return output, nil
		}).(GetNactagsResultOutput)
}

// A collection of arguments for invoking getNactags.
type GetNactagsOutputArgs struct {
	Limit pulumi.IntPtrInput    `pulumi:"limit"`
	Match pulumi.StringPtrInput `pulumi:"match"`
	Name  pulumi.StringPtrInput `pulumi:"name"`
	OrgId pulumi.StringInput    `pulumi:"orgId"`
	Page  pulumi.IntPtrInput    `pulumi:"page"`
	Type  pulumi.StringPtrInput `pulumi:"type"`
}

func (GetNactagsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNactagsArgs)(nil)).Elem()
}

// A collection of values returned by getNactags.
type GetNactagsResultOutput struct{ *pulumi.OutputState }

func (GetNactagsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNactagsResult)(nil)).Elem()
}

func (o GetNactagsResultOutput) ToGetNactagsResultOutput() GetNactagsResultOutput {
	return o
}

func (o GetNactagsResultOutput) ToGetNactagsResultOutputWithContext(ctx context.Context) GetNactagsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetNactagsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNactagsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNactagsResultOutput) Limit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNactagsResult) *int { return v.Limit }).(pulumi.IntPtrOutput)
}

func (o GetNactagsResultOutput) Match() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNactagsResult) *string { return v.Match }).(pulumi.StringPtrOutput)
}

func (o GetNactagsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNactagsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetNactagsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNactagsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetNactagsResultOutput) OrgNactags() GetNactagsOrgNactagArrayOutput {
	return o.ApplyT(func(v GetNactagsResult) []GetNactagsOrgNactag { return v.OrgNactags }).(GetNactagsOrgNactagArrayOutput)
}

func (o GetNactagsResultOutput) Page() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNactagsResult) *int { return v.Page }).(pulumi.IntPtrOutput)
}

func (o GetNactagsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNactagsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNactagsResultOutput{})
}
