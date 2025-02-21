// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package device

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of available Firmware Versions.
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
//			_, err := device.GetVersions(ctx, &device.GetVersionsArgs{
//				OrgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
//				Type:  "ap",
//				Model: "AP24",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetVersions(ctx *pulumi.Context, args *GetVersionsArgs, opts ...pulumi.InvokeOption) (*GetVersionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVersionsResult
	err := ctx.Invoke("junipermist:device/getVersions:getVersions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVersions.
type GetVersionsArgs struct {
	// Fetch version for device model, use/combine with `type` as needed (for switch and gateway devices)
	Model string `pulumi:"model"`
	OrgId string `pulumi:"orgId"`
	// enum: `ap`, `gateway`, `switch`
	Type string `pulumi:"type"`
}

// A collection of values returned by getVersions.
type GetVersionsResult struct {
	DeviceVersions []GetVersionsDeviceVersion `pulumi:"deviceVersions"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Fetch version for device model, use/combine with `type` as needed (for switch and gateway devices)
	Model string `pulumi:"model"`
	OrgId string `pulumi:"orgId"`
	// enum: `ap`, `gateway`, `switch`
	Type string `pulumi:"type"`
}

func GetVersionsOutput(ctx *pulumi.Context, args GetVersionsOutputArgs, opts ...pulumi.InvokeOption) GetVersionsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetVersionsResultOutput, error) {
			args := v.(GetVersionsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:device/getVersions:getVersions", args, GetVersionsResultOutput{}, options).(GetVersionsResultOutput), nil
		}).(GetVersionsResultOutput)
}

// A collection of arguments for invoking getVersions.
type GetVersionsOutputArgs struct {
	// Fetch version for device model, use/combine with `type` as needed (for switch and gateway devices)
	Model pulumi.StringInput `pulumi:"model"`
	OrgId pulumi.StringInput `pulumi:"orgId"`
	// enum: `ap`, `gateway`, `switch`
	Type pulumi.StringInput `pulumi:"type"`
}

func (GetVersionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVersionsArgs)(nil)).Elem()
}

// A collection of values returned by getVersions.
type GetVersionsResultOutput struct{ *pulumi.OutputState }

func (GetVersionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVersionsResult)(nil)).Elem()
}

func (o GetVersionsResultOutput) ToGetVersionsResultOutput() GetVersionsResultOutput {
	return o
}

func (o GetVersionsResultOutput) ToGetVersionsResultOutputWithContext(ctx context.Context) GetVersionsResultOutput {
	return o
}

func (o GetVersionsResultOutput) DeviceVersions() GetVersionsDeviceVersionArrayOutput {
	return o.ApplyT(func(v GetVersionsResult) []GetVersionsDeviceVersion { return v.DeviceVersions }).(GetVersionsDeviceVersionArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVersionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Fetch version for device model, use/combine with `type` as needed (for switch and gateway devices)
func (o GetVersionsResultOutput) Model() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionsResult) string { return v.Model }).(pulumi.StringOutput)
}

func (o GetVersionsResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionsResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// enum: `ap`, `gateway`, `switch`
func (o GetVersionsResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetVersionsResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVersionsResultOutput{})
}
