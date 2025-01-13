// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Org Wlans.
//
// The WLAN object contains all the required configuration to broadcast an SSID (Authentication, VLAN, ...)
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
//			_, err := org.GetWlans(ctx, &org.GetWlansArgs{
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
func GetWlans(ctx *pulumi.Context, args *GetWlansArgs, opts ...pulumi.InvokeOption) (*GetWlansResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWlansResult
	err := ctx.Invoke("junipermist:org/getWlans:getWlans", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWlans.
type GetWlansArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getWlans.
type GetWlansResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id       string            `pulumi:"id"`
	OrgId    string            `pulumi:"orgId"`
	OrgWlans []GetWlansOrgWlan `pulumi:"orgWlans"`
}

func GetWlansOutput(ctx *pulumi.Context, args GetWlansOutputArgs, opts ...pulumi.InvokeOption) GetWlansResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWlansResultOutput, error) {
			args := v.(GetWlansArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:org/getWlans:getWlans", args, GetWlansResultOutput{}, options).(GetWlansResultOutput), nil
		}).(GetWlansResultOutput)
}

// A collection of arguments for invoking getWlans.
type GetWlansOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetWlansOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWlansArgs)(nil)).Elem()
}

// A collection of values returned by getWlans.
type GetWlansResultOutput struct{ *pulumi.OutputState }

func (GetWlansResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWlansResult)(nil)).Elem()
}

func (o GetWlansResultOutput) ToGetWlansResultOutput() GetWlansResultOutput {
	return o
}

func (o GetWlansResultOutput) ToGetWlansResultOutputWithContext(ctx context.Context) GetWlansResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetWlansResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWlansResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWlansResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWlansResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetWlansResultOutput) OrgWlans() GetWlansOrgWlanArrayOutput {
	return o.ApplyT(func(v GetWlansResult) []GetWlansOrgWlan { return v.OrgWlans }).(GetWlansOrgWlanArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWlansResultOutput{})
}
