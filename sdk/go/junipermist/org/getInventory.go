// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Devices in the Org inventory.
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
//			_, err := org.LookupInventory(ctx, &org.LookupInventoryArgs{
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
func LookupInventory(ctx *pulumi.Context, args *LookupInventoryArgs, opts ...pulumi.InvokeOption) (*LookupInventoryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInventoryResult
	err := ctx.Invoke("junipermist:org/getInventory:getInventory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInventory.
type LookupInventoryArgs struct {
	// MAC address
	Mac *string `pulumi:"mac"`
	// device model
	Model *string `pulumi:"model"`
	OrgId string  `pulumi:"orgId"`
	// device serial
	Serial *string `pulumi:"serial"`
	// site id if assigned, null if not assigned
	SiteId *string `pulumi:"siteId"`
	// to display Unassigned devices
	Unassigned *bool `pulumi:"unassigned"`
	// To display Virtual Chassis members
	Vc *bool `pulumi:"vc"`
	// Virtual Chassis MAC Address
	VcMac *string `pulumi:"vcMac"`
}

// A collection of values returned by getInventory.
type LookupInventoryResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// MAC address
	Mac *string `pulumi:"mac"`
	// device model
	Model *string `pulumi:"model"`
	OrgId string  `pulumi:"orgId"`
	// List of devices
	OrgInventories []GetInventoryOrgInventory `pulumi:"orgInventories"`
	// device serial
	Serial *string `pulumi:"serial"`
	// site id if assigned, null if not assigned
	SiteId *string `pulumi:"siteId"`
	// to display Unassigned devices
	Unassigned *bool `pulumi:"unassigned"`
	// To display Virtual Chassis members
	Vc *bool `pulumi:"vc"`
	// Virtual Chassis MAC Address
	VcMac *string `pulumi:"vcMac"`
}

func LookupInventoryOutput(ctx *pulumi.Context, args LookupInventoryOutputArgs, opts ...pulumi.InvokeOption) LookupInventoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInventoryResultOutput, error) {
			args := v.(LookupInventoryArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupInventoryResult
			secret, err := ctx.InvokePackageRaw("junipermist:org/getInventory:getInventory", args, &rv, "", opts...)
			if err != nil {
				return LookupInventoryResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupInventoryResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupInventoryResultOutput), nil
			}
			return output, nil
		}).(LookupInventoryResultOutput)
}

// A collection of arguments for invoking getInventory.
type LookupInventoryOutputArgs struct {
	// MAC address
	Mac pulumi.StringPtrInput `pulumi:"mac"`
	// device model
	Model pulumi.StringPtrInput `pulumi:"model"`
	OrgId pulumi.StringInput    `pulumi:"orgId"`
	// device serial
	Serial pulumi.StringPtrInput `pulumi:"serial"`
	// site id if assigned, null if not assigned
	SiteId pulumi.StringPtrInput `pulumi:"siteId"`
	// to display Unassigned devices
	Unassigned pulumi.BoolPtrInput `pulumi:"unassigned"`
	// To display Virtual Chassis members
	Vc pulumi.BoolPtrInput `pulumi:"vc"`
	// Virtual Chassis MAC Address
	VcMac pulumi.StringPtrInput `pulumi:"vcMac"`
}

func (LookupInventoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInventoryArgs)(nil)).Elem()
}

// A collection of values returned by getInventory.
type LookupInventoryResultOutput struct{ *pulumi.OutputState }

func (LookupInventoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInventoryResult)(nil)).Elem()
}

func (o LookupInventoryResultOutput) ToLookupInventoryResultOutput() LookupInventoryResultOutput {
	return o
}

func (o LookupInventoryResultOutput) ToLookupInventoryResultOutputWithContext(ctx context.Context) LookupInventoryResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInventoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInventoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// MAC address
func (o LookupInventoryResultOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInventoryResult) *string { return v.Mac }).(pulumi.StringPtrOutput)
}

// device model
func (o LookupInventoryResultOutput) Model() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInventoryResult) *string { return v.Model }).(pulumi.StringPtrOutput)
}

func (o LookupInventoryResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInventoryResult) string { return v.OrgId }).(pulumi.StringOutput)
}

// List of devices
func (o LookupInventoryResultOutput) OrgInventories() GetInventoryOrgInventoryArrayOutput {
	return o.ApplyT(func(v LookupInventoryResult) []GetInventoryOrgInventory { return v.OrgInventories }).(GetInventoryOrgInventoryArrayOutput)
}

// device serial
func (o LookupInventoryResultOutput) Serial() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInventoryResult) *string { return v.Serial }).(pulumi.StringPtrOutput)
}

// site id if assigned, null if not assigned
func (o LookupInventoryResultOutput) SiteId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInventoryResult) *string { return v.SiteId }).(pulumi.StringPtrOutput)
}

// to display Unassigned devices
func (o LookupInventoryResultOutput) Unassigned() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupInventoryResult) *bool { return v.Unassigned }).(pulumi.BoolPtrOutput)
}

// To display Virtual Chassis members
func (o LookupInventoryResultOutput) Vc() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupInventoryResult) *bool { return v.Vc }).(pulumi.BoolPtrOutput)
}

// Virtual Chassis MAC Address
func (o LookupInventoryResultOutput) VcMac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInventoryResult) *string { return v.VcMac }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInventoryResultOutput{})
}
