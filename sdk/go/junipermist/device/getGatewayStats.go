// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package device

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Gateways with their statistics.
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
//			_, err := device.GetGatewayStats(ctx, &device.GetGatewayStatsArgs{
//				OrgId:    "15fca2ac-b1a6-47cc-9953-cc6906281550",
//				Mac:      pulumi.StringRef("e8a245000000"),
//				SiteId:   pulumi.StringRef("4a422ae5-7ca0-4599-87a3-8e49aa63685f"),
//				Status:   pulumi.StringRef("connected"),
//				Duration: pulumi.StringRef("1d"),
//				Start:    pulumi.IntRef(1736031600),
//				End:      pulumi.IntRef(1736175934),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGatewayStats(ctx *pulumi.Context, args *GetGatewayStatsArgs, opts ...pulumi.InvokeOption) (*GetGatewayStatsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewayStatsResult
	err := ctx.Invoke("junipermist:device/getGatewayStats:getGatewayStats", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGatewayStats.
type GetGatewayStatsArgs struct {
	// Duration like 7d, 2w
	Duration *string `pulumi:"duration"`
	// End datetime, can be epoch or relative time like -1d, -2h; now if not specified
	End    *int    `pulumi:"end"`
	Mac    *string `pulumi:"mac"`
	OrgId  string  `pulumi:"orgId"`
	SiteId *string `pulumi:"siteId"`
	// Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
	Start *int `pulumi:"start"`
	// enum: `all`, `connected`, `disconnected`
	Status *string `pulumi:"status"`
}

// A collection of values returned by getGatewayStats.
type GetGatewayStatsResult struct {
	DeviceGatewayStats []GetGatewayStatsDeviceGatewayStat `pulumi:"deviceGatewayStats"`
	// Duration like 7d, 2w
	Duration *string `pulumi:"duration"`
	// End datetime, can be epoch or relative time like -1d, -2h; now if not specified
	End *int `pulumi:"end"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Mac    *string `pulumi:"mac"`
	OrgId  string  `pulumi:"orgId"`
	SiteId *string `pulumi:"siteId"`
	// Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
	Start *int `pulumi:"start"`
	// enum: `all`, `connected`, `disconnected`
	Status *string `pulumi:"status"`
}

func GetGatewayStatsOutput(ctx *pulumi.Context, args GetGatewayStatsOutputArgs, opts ...pulumi.InvokeOption) GetGatewayStatsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetGatewayStatsResultOutput, error) {
			args := v.(GetGatewayStatsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:device/getGatewayStats:getGatewayStats", args, GetGatewayStatsResultOutput{}, options).(GetGatewayStatsResultOutput), nil
		}).(GetGatewayStatsResultOutput)
}

// A collection of arguments for invoking getGatewayStats.
type GetGatewayStatsOutputArgs struct {
	// Duration like 7d, 2w
	Duration pulumi.StringPtrInput `pulumi:"duration"`
	// End datetime, can be epoch or relative time like -1d, -2h; now if not specified
	End    pulumi.IntPtrInput    `pulumi:"end"`
	Mac    pulumi.StringPtrInput `pulumi:"mac"`
	OrgId  pulumi.StringInput    `pulumi:"orgId"`
	SiteId pulumi.StringPtrInput `pulumi:"siteId"`
	// Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
	Start pulumi.IntPtrInput `pulumi:"start"`
	// enum: `all`, `connected`, `disconnected`
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetGatewayStatsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayStatsArgs)(nil)).Elem()
}

// A collection of values returned by getGatewayStats.
type GetGatewayStatsResultOutput struct{ *pulumi.OutputState }

func (GetGatewayStatsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayStatsResult)(nil)).Elem()
}

func (o GetGatewayStatsResultOutput) ToGetGatewayStatsResultOutput() GetGatewayStatsResultOutput {
	return o
}

func (o GetGatewayStatsResultOutput) ToGetGatewayStatsResultOutputWithContext(ctx context.Context) GetGatewayStatsResultOutput {
	return o
}

func (o GetGatewayStatsResultOutput) DeviceGatewayStats() GetGatewayStatsDeviceGatewayStatArrayOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) []GetGatewayStatsDeviceGatewayStat { return v.DeviceGatewayStats }).(GetGatewayStatsDeviceGatewayStatArrayOutput)
}

// Duration like 7d, 2w
func (o GetGatewayStatsResultOutput) Duration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) *string { return v.Duration }).(pulumi.StringPtrOutput)
}

// End datetime, can be epoch or relative time like -1d, -2h; now if not specified
func (o GetGatewayStatsResultOutput) End() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) *int { return v.End }).(pulumi.IntPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewayStatsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGatewayStatsResultOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) *string { return v.Mac }).(pulumi.StringPtrOutput)
}

func (o GetGatewayStatsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetGatewayStatsResultOutput) SiteId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) *string { return v.SiteId }).(pulumi.StringPtrOutput)
}

// Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
func (o GetGatewayStatsResultOutput) Start() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) *int { return v.Start }).(pulumi.IntPtrOutput)
}

// enum: `all`, `connected`, `disconnected`
func (o GetGatewayStatsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGatewayStatsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewayStatsResultOutput{})
}
