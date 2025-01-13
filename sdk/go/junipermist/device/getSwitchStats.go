// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package device

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Switches with their statistics.
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
//				OrgId:      "15fca2ac-b1a6-47cc-9953-cc6906281550",
//				Mac:        pulumi.StringRef("485a0d000000"),
//				SiteId:     pulumi.StringRef("4a422ae5-7ca0-4599-87a3-8e49aa63685f"),
//				Status:     pulumi.StringRef("connected"),
//				EvpnUnused: pulumi.StringRef("true"),
//				EvpntopoId: pulumi.StringRef("92984e2f-94db-4cd8-9763-9cf83fbd079e"),
//				Duration:   pulumi.StringRef("1d"),
//				Start:      pulumi.IntRef(1736031600),
//				End:        pulumi.IntRef(1736175934),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSwitchStats(ctx *pulumi.Context, args *GetSwitchStatsArgs, opts ...pulumi.InvokeOption) (*GetSwitchStatsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSwitchStatsResult
	err := ctx.Invoke("junipermist:device/getSwitchStats:getSwitchStats", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSwitchStats.
type GetSwitchStatsArgs struct {
	// duration like 7d, 2w
	Duration *string `pulumi:"duration"`
	// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
	End *int `pulumi:"end"`
	// if `evpnUnused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
	EvpnUnused *string `pulumi:"evpnUnused"`
	// EVPN Topology ID
	EvpntopoId *string `pulumi:"evpntopoId"`
	Mac        *string `pulumi:"mac"`
	OrgId      string  `pulumi:"orgId"`
	SiteId     *string `pulumi:"siteId"`
	// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
	Start  *int    `pulumi:"start"`
	Status *string `pulumi:"status"`
}

// A collection of values returned by getSwitchStats.
type GetSwitchStatsResult struct {
	DeviceSwitchStats []GetSwitchStatsDeviceSwitchStat `pulumi:"deviceSwitchStats"`
	// duration like 7d, 2w
	Duration *string `pulumi:"duration"`
	// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
	End *int `pulumi:"end"`
	// if `evpnUnused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
	EvpnUnused *string `pulumi:"evpnUnused"`
	// EVPN Topology ID
	EvpntopoId *string `pulumi:"evpntopoId"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Mac    *string `pulumi:"mac"`
	OrgId  string  `pulumi:"orgId"`
	SiteId *string `pulumi:"siteId"`
	// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
	Start  *int    `pulumi:"start"`
	Status *string `pulumi:"status"`
}

func GetSwitchStatsOutput(ctx *pulumi.Context, args GetSwitchStatsOutputArgs, opts ...pulumi.InvokeOption) GetSwitchStatsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSwitchStatsResultOutput, error) {
			args := v.(GetSwitchStatsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:device/getSwitchStats:getSwitchStats", args, GetSwitchStatsResultOutput{}, options).(GetSwitchStatsResultOutput), nil
		}).(GetSwitchStatsResultOutput)
}

// A collection of arguments for invoking getSwitchStats.
type GetSwitchStatsOutputArgs struct {
	// duration like 7d, 2w
	Duration pulumi.StringPtrInput `pulumi:"duration"`
	// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
	End pulumi.IntPtrInput `pulumi:"end"`
	// if `evpnUnused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
	EvpnUnused pulumi.StringPtrInput `pulumi:"evpnUnused"`
	// EVPN Topology ID
	EvpntopoId pulumi.StringPtrInput `pulumi:"evpntopoId"`
	Mac        pulumi.StringPtrInput `pulumi:"mac"`
	OrgId      pulumi.StringInput    `pulumi:"orgId"`
	SiteId     pulumi.StringPtrInput `pulumi:"siteId"`
	// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
	Start  pulumi.IntPtrInput    `pulumi:"start"`
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetSwitchStatsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSwitchStatsArgs)(nil)).Elem()
}

// A collection of values returned by getSwitchStats.
type GetSwitchStatsResultOutput struct{ *pulumi.OutputState }

func (GetSwitchStatsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSwitchStatsResult)(nil)).Elem()
}

func (o GetSwitchStatsResultOutput) ToGetSwitchStatsResultOutput() GetSwitchStatsResultOutput {
	return o
}

func (o GetSwitchStatsResultOutput) ToGetSwitchStatsResultOutputWithContext(ctx context.Context) GetSwitchStatsResultOutput {
	return o
}

func (o GetSwitchStatsResultOutput) DeviceSwitchStats() GetSwitchStatsDeviceSwitchStatArrayOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) []GetSwitchStatsDeviceSwitchStat { return v.DeviceSwitchStats }).(GetSwitchStatsDeviceSwitchStatArrayOutput)
}

// duration like 7d, 2w
func (o GetSwitchStatsResultOutput) Duration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *string { return v.Duration }).(pulumi.StringPtrOutput)
}

// end datetime, can be epoch or relative time like -1d, -2h; now if not specified
func (o GetSwitchStatsResultOutput) End() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *int { return v.End }).(pulumi.IntPtrOutput)
}

// if `evpnUnused`==`true`, find EVPN eligible switches which don’t belong to any EVPN Topology yet
func (o GetSwitchStatsResultOutput) EvpnUnused() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *string { return v.EvpnUnused }).(pulumi.StringPtrOutput)
}

// EVPN Topology ID
func (o GetSwitchStatsResultOutput) EvpntopoId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *string { return v.EvpntopoId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSwitchStatsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSwitchStatsResultOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *string { return v.Mac }).(pulumi.StringPtrOutput)
}

func (o GetSwitchStatsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetSwitchStatsResultOutput) SiteId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *string { return v.SiteId }).(pulumi.StringPtrOutput)
}

// start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
func (o GetSwitchStatsResultOutput) Start() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *int { return v.Start }).(pulumi.IntPtrOutput)
}

func (o GetSwitchStatsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSwitchStatsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSwitchStatsResultOutput{})
}
