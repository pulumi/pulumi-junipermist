// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Org Network Templates (Switch templates).
//
// A network template is a predefined configuration that provides a consistent and reusable set of network settings for devices within an organization. It includes various parameters such as ip addressing, vlan configurations, routing protocols, security policies, and other network-specific settings.\
// Network templates simplify the deployment and management of switches by ensuring consistent configurations across multiple devices and sites. They help enforce standardization, reduce human error, and streamline troubleshooting and maintenance tasks.
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
//			_, err := org.GetNetworktemplates(ctx, &org.GetNetworktemplatesArgs{
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
func GetNetworktemplates(ctx *pulumi.Context, args *GetNetworktemplatesArgs, opts ...pulumi.InvokeOption) (*GetNetworktemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNetworktemplatesResult
	err := ctx.Invoke("junipermist:org/getNetworktemplates:getNetworktemplates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworktemplates.
type GetNetworktemplatesArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getNetworktemplates.
type GetNetworktemplatesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                  string                                  `pulumi:"id"`
	OrgId               string                                  `pulumi:"orgId"`
	OrgNetworktemplates []GetNetworktemplatesOrgNetworktemplate `pulumi:"orgNetworktemplates"`
}

func GetNetworktemplatesOutput(ctx *pulumi.Context, args GetNetworktemplatesOutputArgs, opts ...pulumi.InvokeOption) GetNetworktemplatesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetNetworktemplatesResultOutput, error) {
			args := v.(GetNetworktemplatesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:org/getNetworktemplates:getNetworktemplates", args, GetNetworktemplatesResultOutput{}, options).(GetNetworktemplatesResultOutput), nil
		}).(GetNetworktemplatesResultOutput)
}

// A collection of arguments for invoking getNetworktemplates.
type GetNetworktemplatesOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetNetworktemplatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworktemplatesArgs)(nil)).Elem()
}

// A collection of values returned by getNetworktemplates.
type GetNetworktemplatesResultOutput struct{ *pulumi.OutputState }

func (GetNetworktemplatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNetworktemplatesResult)(nil)).Elem()
}

func (o GetNetworktemplatesResultOutput) ToGetNetworktemplatesResultOutput() GetNetworktemplatesResultOutput {
	return o
}

func (o GetNetworktemplatesResultOutput) ToGetNetworktemplatesResultOutputWithContext(ctx context.Context) GetNetworktemplatesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetNetworktemplatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworktemplatesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNetworktemplatesResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetNetworktemplatesResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetNetworktemplatesResultOutput) OrgNetworktemplates() GetNetworktemplatesOrgNetworktemplateArrayOutput {
	return o.ApplyT(func(v GetNetworktemplatesResult) []GetNetworktemplatesOrgNetworktemplate {
		return v.OrgNetworktemplates
	}).(GetNetworktemplatesOrgNetworktemplateArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNetworktemplatesResultOutput{})
}
