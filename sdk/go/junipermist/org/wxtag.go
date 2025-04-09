// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Org WxLan tags (labels).
//
// A WxTag is a label or tag used in the mist system to classify and categorize applications, users, and resources for the purpose of creating policies and making network management decisions. They can be used
// * within the Org WxRules to create filtering rules:
//   - `mist_org_wxrule.dst_allow_wxtags`
//   - `mist_org_wxrule.dst_deny_wxtags`
//   - `mist_org_wxrule.dst_wxtags`
//   - `mist_org_wxrule.src_wxtags`
//
// * within the Org WxRules to assign specific VLAN:
//   - `mist_org_wxrule.apply_tags`
//
// * in the WLANs configuration to assign a WLAN to specific APs:
//   - `mist_org_wlan.wxtag_ids`
//
// * to identify unknown application used by Wi-Fi clients
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
//			_, err := org.NewWxtag(ctx, "wxtag_one", &org.WxtagArgs{
//				OrgId: pulumi.Any(terraformTest.Id),
//				Name:  pulumi.String("wxtag_one"),
//				Values: pulumi.StringArray{
//					pulumi.String("10.3.0.0/16"),
//				},
//				Op:    pulumi.String("in"),
//				Type:  pulumi.String("match"),
//				Match: pulumi.String("ip_range_subnet"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import `mist_org_wxtag` with:
//
// Org WxTag can be imported by specifying the org_id and the wxtag_id
//
// ```sh
// $ pulumi import junipermist:org/wxtag:Wxtag wxtag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Wxtag struct {
	pulumi.CustomResourceState

	// If `type`==`client`, Client MAC Address
	Mac pulumi.StringPtrOutput `pulumi:"mac"`
	// required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
	// `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
	Match pulumi.StringPtrOutput `pulumi:"match"`
	// The name
	Name pulumi.StringOutput `pulumi:"name"`
	// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
	Op    pulumi.StringPtrOutput `pulumi:"op"`
	OrgId pulumi.StringOutput    `pulumi:"orgId"`
	// If `type`==`spec`
	Specs WxtagSpecArrayOutput `pulumi:"specs"`
	// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
	Type pulumi.StringOutput `pulumi:"type"`
	// Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
	// `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
	// `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
	// `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
	// Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
	// RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
	// ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
	// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
	// `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
	// of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
	Values pulumi.StringArrayOutput `pulumi:"values"`
	VlanId pulumi.StringPtrOutput   `pulumi:"vlanId"`
}

// NewWxtag registers a new resource with the given unique name, arguments, and options.
func NewWxtag(ctx *pulumi.Context,
	name string, args *WxtagArgs, opts ...pulumi.ResourceOption) (*Wxtag, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Wxtag
	err := ctx.RegisterResource("junipermist:org/wxtag:Wxtag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWxtag gets an existing Wxtag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWxtag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WxtagState, opts ...pulumi.ResourceOption) (*Wxtag, error) {
	var resource Wxtag
	err := ctx.ReadResource("junipermist:org/wxtag:Wxtag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Wxtag resources.
type wxtagState struct {
	// If `type`==`client`, Client MAC Address
	Mac *string `pulumi:"mac"`
	// required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
	// `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
	Match *string `pulumi:"match"`
	// The name
	Name *string `pulumi:"name"`
	// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
	Op    *string `pulumi:"op"`
	OrgId *string `pulumi:"orgId"`
	// If `type`==`spec`
	Specs []WxtagSpec `pulumi:"specs"`
	// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
	Type *string `pulumi:"type"`
	// Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
	// `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
	// `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
	// `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
	// Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
	// RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
	// ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
	// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
	// `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
	// of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
	Values []string `pulumi:"values"`
	VlanId *string  `pulumi:"vlanId"`
}

type WxtagState struct {
	// If `type`==`client`, Client MAC Address
	Mac pulumi.StringPtrInput
	// required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
	// `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
	Match pulumi.StringPtrInput
	// The name
	Name pulumi.StringPtrInput
	// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
	Op    pulumi.StringPtrInput
	OrgId pulumi.StringPtrInput
	// If `type`==`spec`
	Specs WxtagSpecArrayInput
	// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
	Type pulumi.StringPtrInput
	// Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
	// `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
	// `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
	// `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
	// Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
	// RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
	// ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
	// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
	// `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
	// of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
	Values pulumi.StringArrayInput
	VlanId pulumi.StringPtrInput
}

func (WxtagState) ElementType() reflect.Type {
	return reflect.TypeOf((*wxtagState)(nil)).Elem()
}

type wxtagArgs struct {
	// If `type`==`client`, Client MAC Address
	Mac *string `pulumi:"mac"`
	// required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
	// `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
	Match *string `pulumi:"match"`
	// The name
	Name *string `pulumi:"name"`
	// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
	Op    *string `pulumi:"op"`
	OrgId string  `pulumi:"orgId"`
	// If `type`==`spec`
	Specs []WxtagSpec `pulumi:"specs"`
	// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
	Type string `pulumi:"type"`
	// Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
	// `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
	// `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
	// `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
	// Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
	// RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
	// ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
	// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
	// `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
	// of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
	Values []string `pulumi:"values"`
	VlanId *string  `pulumi:"vlanId"`
}

// The set of arguments for constructing a Wxtag resource.
type WxtagArgs struct {
	// If `type`==`client`, Client MAC Address
	Mac pulumi.StringPtrInput
	// required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
	// `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
	Match pulumi.StringPtrInput
	// The name
	Name pulumi.StringPtrInput
	// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
	Op    pulumi.StringPtrInput
	OrgId pulumi.StringInput
	// If `type`==`spec`
	Specs WxtagSpecArrayInput
	// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
	Type pulumi.StringInput
	// Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
	// `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
	// `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
	// `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
	// Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
	// RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
	// ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
	// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
	// `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
	// of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
	Values pulumi.StringArrayInput
	VlanId pulumi.StringPtrInput
}

func (WxtagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wxtagArgs)(nil)).Elem()
}

type WxtagInput interface {
	pulumi.Input

	ToWxtagOutput() WxtagOutput
	ToWxtagOutputWithContext(ctx context.Context) WxtagOutput
}

func (*Wxtag) ElementType() reflect.Type {
	return reflect.TypeOf((**Wxtag)(nil)).Elem()
}

func (i *Wxtag) ToWxtagOutput() WxtagOutput {
	return i.ToWxtagOutputWithContext(context.Background())
}

func (i *Wxtag) ToWxtagOutputWithContext(ctx context.Context) WxtagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WxtagOutput)
}

// WxtagArrayInput is an input type that accepts WxtagArray and WxtagArrayOutput values.
// You can construct a concrete instance of `WxtagArrayInput` via:
//
//	WxtagArray{ WxtagArgs{...} }
type WxtagArrayInput interface {
	pulumi.Input

	ToWxtagArrayOutput() WxtagArrayOutput
	ToWxtagArrayOutputWithContext(context.Context) WxtagArrayOutput
}

type WxtagArray []WxtagInput

func (WxtagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Wxtag)(nil)).Elem()
}

func (i WxtagArray) ToWxtagArrayOutput() WxtagArrayOutput {
	return i.ToWxtagArrayOutputWithContext(context.Background())
}

func (i WxtagArray) ToWxtagArrayOutputWithContext(ctx context.Context) WxtagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WxtagArrayOutput)
}

// WxtagMapInput is an input type that accepts WxtagMap and WxtagMapOutput values.
// You can construct a concrete instance of `WxtagMapInput` via:
//
//	WxtagMap{ "key": WxtagArgs{...} }
type WxtagMapInput interface {
	pulumi.Input

	ToWxtagMapOutput() WxtagMapOutput
	ToWxtagMapOutputWithContext(context.Context) WxtagMapOutput
}

type WxtagMap map[string]WxtagInput

func (WxtagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Wxtag)(nil)).Elem()
}

func (i WxtagMap) ToWxtagMapOutput() WxtagMapOutput {
	return i.ToWxtagMapOutputWithContext(context.Background())
}

func (i WxtagMap) ToWxtagMapOutputWithContext(ctx context.Context) WxtagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WxtagMapOutput)
}

type WxtagOutput struct{ *pulumi.OutputState }

func (WxtagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Wxtag)(nil)).Elem()
}

func (o WxtagOutput) ToWxtagOutput() WxtagOutput {
	return o
}

func (o WxtagOutput) ToWxtagOutputWithContext(ctx context.Context) WxtagOutput {
	return o
}

// If `type`==`client`, Client MAC Address
func (o WxtagOutput) Mac() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringPtrOutput { return v.Mac }).(pulumi.StringPtrOutput)
}

// required if `type`==`match`. enum: `apId`, `app`, `assetMac`, `clientMac`, `hostname`, `ipRangeSubnet`, `port`,
// `pskName`, `pskRole`, `radiusAttr`, `radiusClass`, `radiusGroup`, `radiusUsername`, `sdkclientUuid`, `wlanId`
func (o WxtagOutput) Match() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringPtrOutput { return v.Match }).(pulumi.StringPtrOutput)
}

// The name
func (o WxtagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// required if `type`==`match`, type of tag (inclusive/exclusive). enum: `in`, `notIn`
func (o WxtagOutput) Op() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringPtrOutput { return v.Op }).(pulumi.StringPtrOutput)
}

func (o WxtagOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// If `type`==`spec`
func (o WxtagOutput) Specs() WxtagSpecArrayOutput {
	return o.ApplyT(func(v *Wxtag) WxtagSpecArrayOutput { return v.Specs }).(WxtagSpecArrayOutput)
}

// enum: `client`, `match`, `resource`, `spec`, `subnet`, `vlan`
func (o WxtagOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// Required if `type`==`match` and * `match`==`apId`: list of AP IDs * `match`==`app`: list of Application Names *
// `match`==`assetMac`: list of Asset MAC Addresses * `match`==`clientMac`: list of Client MAC Addresses *
// `match`==`hostname`: list of Resources Hostnames * `match`==`ipRangeSubnet`: list of IP Addresses and/or CIDRs *
// `match`==`pskName`: list of PSK Names * `match`==`pskRole`: list of PSK Roles * `match`==`port`: list of Ports or Port
// Ranges * `match`==`radiusAttr`: list of RADIUS Attributes. The values are [ "6=1", "26=10.2.3.4" ], this support other
// RADIUS attributes where we know the type * `match`==`radiusClass`: list of RADIUS Classes. This matches the
// ATTR-Class(25) * `match`==`radiusGroup`: list of RADIUS Groups. This is a smart tag that matches RADIUS-Filter-ID,
// Airespace-ACL-Name (VendorID=14179, VendorType=6) / Aruba-User-Role (VendorID=14823, VendorType=1) *
// `match`==`radiusUsername`: list of RADIUS Usernames. This matches the ATTR-User-Name(1) * `match`==`sdkclientUuid`: list
// of SDK UUIDs * `match`==`wlanId`: list of WLAN IDs **Notes**: Variables are not allowed
func (o WxtagOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringArrayOutput { return v.Values }).(pulumi.StringArrayOutput)
}

func (o WxtagOutput) VlanId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Wxtag) pulumi.StringPtrOutput { return v.VlanId }).(pulumi.StringPtrOutput)
}

type WxtagArrayOutput struct{ *pulumi.OutputState }

func (WxtagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Wxtag)(nil)).Elem()
}

func (o WxtagArrayOutput) ToWxtagArrayOutput() WxtagArrayOutput {
	return o
}

func (o WxtagArrayOutput) ToWxtagArrayOutputWithContext(ctx context.Context) WxtagArrayOutput {
	return o
}

func (o WxtagArrayOutput) Index(i pulumi.IntInput) WxtagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Wxtag {
		return vs[0].([]*Wxtag)[vs[1].(int)]
	}).(WxtagOutput)
}

type WxtagMapOutput struct{ *pulumi.OutputState }

func (WxtagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Wxtag)(nil)).Elem()
}

func (o WxtagMapOutput) ToWxtagMapOutput() WxtagMapOutput {
	return o
}

func (o WxtagMapOutput) ToWxtagMapOutputWithContext(ctx context.Context) WxtagMapOutput {
	return o
}

func (o WxtagMapOutput) MapIndex(k pulumi.StringInput) WxtagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Wxtag {
		return vs[0].(map[string]*Wxtag)[vs[1].(string)]
	}).(WxtagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WxtagInput)(nil)).Elem(), &Wxtag{})
	pulumi.RegisterInputType(reflect.TypeOf((*WxtagArrayInput)(nil)).Elem(), WxtagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WxtagMapInput)(nil)).Elem(), WxtagMap{})
	pulumi.RegisterOutputType(WxtagOutput{})
	pulumi.RegisterOutputType(WxtagArrayOutput{})
	pulumi.RegisterOutputType(WxtagMapOutput{})
}
