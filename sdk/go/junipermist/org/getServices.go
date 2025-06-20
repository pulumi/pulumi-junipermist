// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of WAN Assurance Services (Applications).
//
// A Service is used to define a Custom Application that can be used in the `servicePolicies`. These Services can be referenced by their name in
// * the Service Policies (`mist_org_servicepolicy.services`)
// * the Gateway configuration (`mist_device_gateway.service_policies.services`)
// * the Gateway Templates (`mist_org_gatewaytemplate.service_policies.services`)
// * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies.services`)
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
//			_, err := org.GetServices(ctx, &org.GetServicesArgs{
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
func GetServices(ctx *pulumi.Context, args *GetServicesArgs, opts ...pulumi.InvokeOption) (*GetServicesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServicesResult
	err := ctx.Invoke("junipermist:org/getServices:getServices", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServices.
type GetServicesArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getServices.
type GetServicesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string                  `pulumi:"id"`
	OrgId       string                  `pulumi:"orgId"`
	OrgServices []GetServicesOrgService `pulumi:"orgServices"`
}

func GetServicesOutput(ctx *pulumi.Context, args GetServicesOutputArgs, opts ...pulumi.InvokeOption) GetServicesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetServicesResultOutput, error) {
			args := v.(GetServicesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:org/getServices:getServices", args, GetServicesResultOutput{}, options).(GetServicesResultOutput), nil
		}).(GetServicesResultOutput)
}

// A collection of arguments for invoking getServices.
type GetServicesOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetServicesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicesArgs)(nil)).Elem()
}

// A collection of values returned by getServices.
type GetServicesResultOutput struct{ *pulumi.OutputState }

func (GetServicesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicesResult)(nil)).Elem()
}

func (o GetServicesResultOutput) ToGetServicesResultOutput() GetServicesResultOutput {
	return o
}

func (o GetServicesResultOutput) ToGetServicesResultOutputWithContext(ctx context.Context) GetServicesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetServicesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetServicesResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicesResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetServicesResultOutput) OrgServices() GetServicesOrgServiceArrayOutput {
	return o.ApplyT(func(v GetServicesResult) []GetServicesOrgService { return v.OrgServices }).(GetServicesOrgServiceArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServicesResultOutput{})
}
