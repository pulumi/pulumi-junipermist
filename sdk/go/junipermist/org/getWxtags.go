// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource provides the list of Org WxLan tags (labels).
// A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions.They can be used   * within the WxRules to create filtering rules, or assign specific VLAN  * in the WLANs configuration to assign a WLAN to specific APs  * to identify unknown application used by Wi-Fi clients
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/device"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := device.GetSwitchStats(ctx, &device.GetSwitchStatsArgs{
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
func GetWxtags(ctx *pulumi.Context, args *GetWxtagsArgs, opts ...pulumi.InvokeOption) (*GetWxtagsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWxtagsResult
	err := ctx.Invoke("junipermist:org/getWxtags:getWxtags", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWxtags.
type GetWxtagsArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getWxtags.
type GetWxtagsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string              `pulumi:"id"`
	OrgId     string              `pulumi:"orgId"`
	OrgWxtags []GetWxtagsOrgWxtag `pulumi:"orgWxtags"`
}

func GetWxtagsOutput(ctx *pulumi.Context, args GetWxtagsOutputArgs, opts ...pulumi.InvokeOption) GetWxtagsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWxtagsResultOutput, error) {
			args := v.(GetWxtagsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetWxtagsResult
			secret, err := ctx.InvokePackageRaw("junipermist:org/getWxtags:getWxtags", args, &rv, "", opts...)
			if err != nil {
				return GetWxtagsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetWxtagsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetWxtagsResultOutput), nil
			}
			return output, nil
		}).(GetWxtagsResultOutput)
}

// A collection of arguments for invoking getWxtags.
type GetWxtagsOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetWxtagsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWxtagsArgs)(nil)).Elem()
}

// A collection of values returned by getWxtags.
type GetWxtagsResultOutput struct{ *pulumi.OutputState }

func (GetWxtagsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWxtagsResult)(nil)).Elem()
}

func (o GetWxtagsResultOutput) ToGetWxtagsResultOutput() GetWxtagsResultOutput {
	return o
}

func (o GetWxtagsResultOutput) ToGetWxtagsResultOutputWithContext(ctx context.Context) GetWxtagsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetWxtagsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWxtagsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWxtagsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWxtagsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetWxtagsResultOutput) OrgWxtags() GetWxtagsOrgWxtagArrayOutput {
	return o.ApplyT(func(v GetWxtagsResult) []GetWxtagsOrgWxtag { return v.OrgWxtags }).(GetWxtagsOrgWxtagArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWxtagsResultOutput{})
}
