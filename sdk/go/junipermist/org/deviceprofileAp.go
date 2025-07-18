// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the AP Device Profiles.
// AP Device profiles for aps are used to specify a configuration that can be applied to a select set of aps from any site in the organization. They allow for efficient application of configurations based on ap groups, wlan groups, RF settings, and sites. Device profiles enable various use cases such as activating ethernet passthrough, applying different rf settings, applying mesh configuration, activating specific features like esl or vble, and more.
//
// The AP Device Profile can be assigned to a gateway with the `org.DeviceprofileAssign` resource.
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
//			_, err := org.NewDeviceprofileAp(ctx, "deviceprofile_ap_one", &org.DeviceprofileApArgs{
//				Name:  pulumi.String("deviceprofile_ap_one"),
//				OrgId: pulumi.Any(terraformTest.Id),
//				EslConfig: &org.DeviceprofileApEslConfigArgs{
//					Enabled: pulumi.Bool(true),
//					Host:    pulumi.String("1.2.3.4"),
//					Type:    pulumi.String("native"),
//				},
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
// Using `pulumi import`, import `mist_org_deviceprofile_ap` with:
//
// Device Profile can be imported by specifying the org_id and the deviceprofile_id
//
// ```sh
// $ pulumi import junipermist:org/deviceprofileAp:DeviceprofileAp deviceprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type DeviceprofileAp struct {
	pulumi.CustomResourceState

	// Aeroscout AP settings
	Aeroscout DeviceprofileApAeroscoutPtrOutput `pulumi:"aeroscout"`
	// BLE AP settings
	BleConfig DeviceprofileApBleConfigPtrOutput `pulumi:"bleConfig"`
	// Whether to disable eth1 port
	DisableEth1 pulumi.BoolOutput `pulumi:"disableEth1"`
	// Whether to disable eth2 port
	DisableEth2 pulumi.BoolOutput `pulumi:"disableEth2"`
	// Whether to disable eth3 port
	DisableEth3 pulumi.BoolOutput `pulumi:"disableEth3"`
	// Whether to disable module port
	DisableModule pulumi.BoolOutput                 `pulumi:"disableModule"`
	EslConfig     DeviceprofileApEslConfigPtrOutput `pulumi:"eslConfig"`
	// IP AP settings
	IpConfig   DeviceprofileApIpConfigPtrOutput   `pulumi:"ipConfig"`
	LacpConfig DeviceprofileApLacpConfigPtrOutput `pulumi:"lacpConfig"`
	// LED AP settings
	Led DeviceprofileApLedPtrOutput `pulumi:"led"`
	// Mesh AP settings
	Mesh       DeviceprofileApMeshPtrOutput `pulumi:"mesh"`
	Name       pulumi.StringOutput          `pulumi:"name"`
	NtpServers pulumi.StringArrayOutput     `pulumi:"ntpServers"`
	OrgId      pulumi.StringOutput          `pulumi:"orgId"`
	// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough pulumi.BoolOutput `pulumi:"poePassthrough"`
	// eth0 is not allowed here. Property key is the interface(s) name (e.g. `eth1` or `eth1,eth2`). If specified, this takes
	// precedence over switchConfig (deprecated)
	PortConfig DeviceprofileApPortConfigMapOutput `pulumi:"portConfig"`
	// Power related configs
	PwrConfig DeviceprofileApPwrConfigPtrOutput `pulumi:"pwrConfig"`
	// Radio AP settings
	RadioConfig DeviceprofileApRadioConfigPtrOutput `pulumi:"radioConfig"`
	SiteId      pulumi.StringPtrOutput              `pulumi:"siteId"`
	// Device Type. enum: `ap`
	Type pulumi.StringOutput `pulumi:"type"`
	// AP Uplink port configuration
	UplinkPortConfig DeviceprofileApUplinkPortConfigPtrOutput `pulumi:"uplinkPortConfig"`
	// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
	// moved to ESL Config.
	UsbConfig DeviceprofileApUsbConfigPtrOutput `pulumi:"usbConfig"`
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapOutput `pulumi:"vars"`
}

// NewDeviceprofileAp registers a new resource with the given unique name, arguments, and options.
func NewDeviceprofileAp(ctx *pulumi.Context,
	name string, args *DeviceprofileApArgs, opts ...pulumi.ResourceOption) (*DeviceprofileAp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DeviceprofileAp
	err := ctx.RegisterResource("junipermist:org/deviceprofileAp:DeviceprofileAp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeviceprofileAp gets an existing DeviceprofileAp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeviceprofileAp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceprofileApState, opts ...pulumi.ResourceOption) (*DeviceprofileAp, error) {
	var resource DeviceprofileAp
	err := ctx.ReadResource("junipermist:org/deviceprofileAp:DeviceprofileAp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeviceprofileAp resources.
type deviceprofileApState struct {
	// Aeroscout AP settings
	Aeroscout *DeviceprofileApAeroscout `pulumi:"aeroscout"`
	// BLE AP settings
	BleConfig *DeviceprofileApBleConfig `pulumi:"bleConfig"`
	// Whether to disable eth1 port
	DisableEth1 *bool `pulumi:"disableEth1"`
	// Whether to disable eth2 port
	DisableEth2 *bool `pulumi:"disableEth2"`
	// Whether to disable eth3 port
	DisableEth3 *bool `pulumi:"disableEth3"`
	// Whether to disable module port
	DisableModule *bool                     `pulumi:"disableModule"`
	EslConfig     *DeviceprofileApEslConfig `pulumi:"eslConfig"`
	// IP AP settings
	IpConfig   *DeviceprofileApIpConfig   `pulumi:"ipConfig"`
	LacpConfig *DeviceprofileApLacpConfig `pulumi:"lacpConfig"`
	// LED AP settings
	Led *DeviceprofileApLed `pulumi:"led"`
	// Mesh AP settings
	Mesh       *DeviceprofileApMesh `pulumi:"mesh"`
	Name       *string              `pulumi:"name"`
	NtpServers []string             `pulumi:"ntpServers"`
	OrgId      *string              `pulumi:"orgId"`
	// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough *bool `pulumi:"poePassthrough"`
	// eth0 is not allowed here. Property key is the interface(s) name (e.g. `eth1` or `eth1,eth2`). If specified, this takes
	// precedence over switchConfig (deprecated)
	PortConfig map[string]DeviceprofileApPortConfig `pulumi:"portConfig"`
	// Power related configs
	PwrConfig *DeviceprofileApPwrConfig `pulumi:"pwrConfig"`
	// Radio AP settings
	RadioConfig *DeviceprofileApRadioConfig `pulumi:"radioConfig"`
	SiteId      *string                     `pulumi:"siteId"`
	// Device Type. enum: `ap`
	Type *string `pulumi:"type"`
	// AP Uplink port configuration
	UplinkPortConfig *DeviceprofileApUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
	// moved to ESL Config.
	UsbConfig *DeviceprofileApUsbConfig `pulumi:"usbConfig"`
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
}

type DeviceprofileApState struct {
	// Aeroscout AP settings
	Aeroscout DeviceprofileApAeroscoutPtrInput
	// BLE AP settings
	BleConfig DeviceprofileApBleConfigPtrInput
	// Whether to disable eth1 port
	DisableEth1 pulumi.BoolPtrInput
	// Whether to disable eth2 port
	DisableEth2 pulumi.BoolPtrInput
	// Whether to disable eth3 port
	DisableEth3 pulumi.BoolPtrInput
	// Whether to disable module port
	DisableModule pulumi.BoolPtrInput
	EslConfig     DeviceprofileApEslConfigPtrInput
	// IP AP settings
	IpConfig   DeviceprofileApIpConfigPtrInput
	LacpConfig DeviceprofileApLacpConfigPtrInput
	// LED AP settings
	Led DeviceprofileApLedPtrInput
	// Mesh AP settings
	Mesh       DeviceprofileApMeshPtrInput
	Name       pulumi.StringPtrInput
	NtpServers pulumi.StringArrayInput
	OrgId      pulumi.StringPtrInput
	// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough pulumi.BoolPtrInput
	// eth0 is not allowed here. Property key is the interface(s) name (e.g. `eth1` or `eth1,eth2`). If specified, this takes
	// precedence over switchConfig (deprecated)
	PortConfig DeviceprofileApPortConfigMapInput
	// Power related configs
	PwrConfig DeviceprofileApPwrConfigPtrInput
	// Radio AP settings
	RadioConfig DeviceprofileApRadioConfigPtrInput
	SiteId      pulumi.StringPtrInput
	// Device Type. enum: `ap`
	Type pulumi.StringPtrInput
	// AP Uplink port configuration
	UplinkPortConfig DeviceprofileApUplinkPortConfigPtrInput
	// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
	// moved to ESL Config.
	UsbConfig DeviceprofileApUsbConfigPtrInput
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
}

func (DeviceprofileApState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceprofileApState)(nil)).Elem()
}

type deviceprofileApArgs struct {
	// Aeroscout AP settings
	Aeroscout *DeviceprofileApAeroscout `pulumi:"aeroscout"`
	// BLE AP settings
	BleConfig *DeviceprofileApBleConfig `pulumi:"bleConfig"`
	// Whether to disable eth1 port
	DisableEth1 *bool `pulumi:"disableEth1"`
	// Whether to disable eth2 port
	DisableEth2 *bool `pulumi:"disableEth2"`
	// Whether to disable eth3 port
	DisableEth3 *bool `pulumi:"disableEth3"`
	// Whether to disable module port
	DisableModule *bool                     `pulumi:"disableModule"`
	EslConfig     *DeviceprofileApEslConfig `pulumi:"eslConfig"`
	// IP AP settings
	IpConfig   *DeviceprofileApIpConfig   `pulumi:"ipConfig"`
	LacpConfig *DeviceprofileApLacpConfig `pulumi:"lacpConfig"`
	// LED AP settings
	Led *DeviceprofileApLed `pulumi:"led"`
	// Mesh AP settings
	Mesh       *DeviceprofileApMesh `pulumi:"mesh"`
	Name       *string              `pulumi:"name"`
	NtpServers []string             `pulumi:"ntpServers"`
	OrgId      string               `pulumi:"orgId"`
	// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough *bool `pulumi:"poePassthrough"`
	// eth0 is not allowed here. Property key is the interface(s) name (e.g. `eth1` or `eth1,eth2`). If specified, this takes
	// precedence over switchConfig (deprecated)
	PortConfig map[string]DeviceprofileApPortConfig `pulumi:"portConfig"`
	// Power related configs
	PwrConfig *DeviceprofileApPwrConfig `pulumi:"pwrConfig"`
	// Radio AP settings
	RadioConfig *DeviceprofileApRadioConfig `pulumi:"radioConfig"`
	SiteId      *string                     `pulumi:"siteId"`
	// AP Uplink port configuration
	UplinkPortConfig *DeviceprofileApUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
	// moved to ESL Config.
	UsbConfig *DeviceprofileApUsbConfig `pulumi:"usbConfig"`
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
}

// The set of arguments for constructing a DeviceprofileAp resource.
type DeviceprofileApArgs struct {
	// Aeroscout AP settings
	Aeroscout DeviceprofileApAeroscoutPtrInput
	// BLE AP settings
	BleConfig DeviceprofileApBleConfigPtrInput
	// Whether to disable eth1 port
	DisableEth1 pulumi.BoolPtrInput
	// Whether to disable eth2 port
	DisableEth2 pulumi.BoolPtrInput
	// Whether to disable eth3 port
	DisableEth3 pulumi.BoolPtrInput
	// Whether to disable module port
	DisableModule pulumi.BoolPtrInput
	EslConfig     DeviceprofileApEslConfigPtrInput
	// IP AP settings
	IpConfig   DeviceprofileApIpConfigPtrInput
	LacpConfig DeviceprofileApLacpConfigPtrInput
	// LED AP settings
	Led DeviceprofileApLedPtrInput
	// Mesh AP settings
	Mesh       DeviceprofileApMeshPtrInput
	Name       pulumi.StringPtrInput
	NtpServers pulumi.StringArrayInput
	OrgId      pulumi.StringInput
	// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough pulumi.BoolPtrInput
	// eth0 is not allowed here. Property key is the interface(s) name (e.g. `eth1` or `eth1,eth2`). If specified, this takes
	// precedence over switchConfig (deprecated)
	PortConfig DeviceprofileApPortConfigMapInput
	// Power related configs
	PwrConfig DeviceprofileApPwrConfigPtrInput
	// Radio AP settings
	RadioConfig DeviceprofileApRadioConfigPtrInput
	SiteId      pulumi.StringPtrInput
	// AP Uplink port configuration
	UplinkPortConfig DeviceprofileApUplinkPortConfigPtrInput
	// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
	// moved to ESL Config.
	UsbConfig DeviceprofileApUsbConfigPtrInput
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
}

func (DeviceprofileApArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceprofileApArgs)(nil)).Elem()
}

type DeviceprofileApInput interface {
	pulumi.Input

	ToDeviceprofileApOutput() DeviceprofileApOutput
	ToDeviceprofileApOutputWithContext(ctx context.Context) DeviceprofileApOutput
}

func (*DeviceprofileAp) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceprofileAp)(nil)).Elem()
}

func (i *DeviceprofileAp) ToDeviceprofileApOutput() DeviceprofileApOutput {
	return i.ToDeviceprofileApOutputWithContext(context.Background())
}

func (i *DeviceprofileAp) ToDeviceprofileApOutputWithContext(ctx context.Context) DeviceprofileApOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileApOutput)
}

// DeviceprofileApArrayInput is an input type that accepts DeviceprofileApArray and DeviceprofileApArrayOutput values.
// You can construct a concrete instance of `DeviceprofileApArrayInput` via:
//
//	DeviceprofileApArray{ DeviceprofileApArgs{...} }
type DeviceprofileApArrayInput interface {
	pulumi.Input

	ToDeviceprofileApArrayOutput() DeviceprofileApArrayOutput
	ToDeviceprofileApArrayOutputWithContext(context.Context) DeviceprofileApArrayOutput
}

type DeviceprofileApArray []DeviceprofileApInput

func (DeviceprofileApArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceprofileAp)(nil)).Elem()
}

func (i DeviceprofileApArray) ToDeviceprofileApArrayOutput() DeviceprofileApArrayOutput {
	return i.ToDeviceprofileApArrayOutputWithContext(context.Background())
}

func (i DeviceprofileApArray) ToDeviceprofileApArrayOutputWithContext(ctx context.Context) DeviceprofileApArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileApArrayOutput)
}

// DeviceprofileApMapInput is an input type that accepts DeviceprofileApMap and DeviceprofileApMapOutput values.
// You can construct a concrete instance of `DeviceprofileApMapInput` via:
//
//	DeviceprofileApMap{ "key": DeviceprofileApArgs{...} }
type DeviceprofileApMapInput interface {
	pulumi.Input

	ToDeviceprofileApMapOutput() DeviceprofileApMapOutput
	ToDeviceprofileApMapOutputWithContext(context.Context) DeviceprofileApMapOutput
}

type DeviceprofileApMap map[string]DeviceprofileApInput

func (DeviceprofileApMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceprofileAp)(nil)).Elem()
}

func (i DeviceprofileApMap) ToDeviceprofileApMapOutput() DeviceprofileApMapOutput {
	return i.ToDeviceprofileApMapOutputWithContext(context.Background())
}

func (i DeviceprofileApMap) ToDeviceprofileApMapOutputWithContext(ctx context.Context) DeviceprofileApMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileApMapOutput)
}

type DeviceprofileApOutput struct{ *pulumi.OutputState }

func (DeviceprofileApOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceprofileAp)(nil)).Elem()
}

func (o DeviceprofileApOutput) ToDeviceprofileApOutput() DeviceprofileApOutput {
	return o
}

func (o DeviceprofileApOutput) ToDeviceprofileApOutputWithContext(ctx context.Context) DeviceprofileApOutput {
	return o
}

// Aeroscout AP settings
func (o DeviceprofileApOutput) Aeroscout() DeviceprofileApAeroscoutPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApAeroscoutPtrOutput { return v.Aeroscout }).(DeviceprofileApAeroscoutPtrOutput)
}

// BLE AP settings
func (o DeviceprofileApOutput) BleConfig() DeviceprofileApBleConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApBleConfigPtrOutput { return v.BleConfig }).(DeviceprofileApBleConfigPtrOutput)
}

// Whether to disable eth1 port
func (o DeviceprofileApOutput) DisableEth1() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.BoolOutput { return v.DisableEth1 }).(pulumi.BoolOutput)
}

// Whether to disable eth2 port
func (o DeviceprofileApOutput) DisableEth2() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.BoolOutput { return v.DisableEth2 }).(pulumi.BoolOutput)
}

// Whether to disable eth3 port
func (o DeviceprofileApOutput) DisableEth3() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.BoolOutput { return v.DisableEth3 }).(pulumi.BoolOutput)
}

// Whether to disable module port
func (o DeviceprofileApOutput) DisableModule() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.BoolOutput { return v.DisableModule }).(pulumi.BoolOutput)
}

func (o DeviceprofileApOutput) EslConfig() DeviceprofileApEslConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApEslConfigPtrOutput { return v.EslConfig }).(DeviceprofileApEslConfigPtrOutput)
}

// IP AP settings
func (o DeviceprofileApOutput) IpConfig() DeviceprofileApIpConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApIpConfigPtrOutput { return v.IpConfig }).(DeviceprofileApIpConfigPtrOutput)
}

func (o DeviceprofileApOutput) LacpConfig() DeviceprofileApLacpConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApLacpConfigPtrOutput { return v.LacpConfig }).(DeviceprofileApLacpConfigPtrOutput)
}

// LED AP settings
func (o DeviceprofileApOutput) Led() DeviceprofileApLedPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApLedPtrOutput { return v.Led }).(DeviceprofileApLedPtrOutput)
}

// Mesh AP settings
func (o DeviceprofileApOutput) Mesh() DeviceprofileApMeshPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApMeshPtrOutput { return v.Mesh }).(DeviceprofileApMeshPtrOutput)
}

func (o DeviceprofileApOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o DeviceprofileApOutput) NtpServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.StringArrayOutput { return v.NtpServers }).(pulumi.StringArrayOutput)
}

func (o DeviceprofileApOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
func (o DeviceprofileApOutput) PoePassthrough() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.BoolOutput { return v.PoePassthrough }).(pulumi.BoolOutput)
}

// eth0 is not allowed here. Property key is the interface(s) name (e.g. `eth1` or `eth1,eth2`). If specified, this takes
// precedence over switchConfig (deprecated)
func (o DeviceprofileApOutput) PortConfig() DeviceprofileApPortConfigMapOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApPortConfigMapOutput { return v.PortConfig }).(DeviceprofileApPortConfigMapOutput)
}

// Power related configs
func (o DeviceprofileApOutput) PwrConfig() DeviceprofileApPwrConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApPwrConfigPtrOutput { return v.PwrConfig }).(DeviceprofileApPwrConfigPtrOutput)
}

// Radio AP settings
func (o DeviceprofileApOutput) RadioConfig() DeviceprofileApRadioConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApRadioConfigPtrOutput { return v.RadioConfig }).(DeviceprofileApRadioConfigPtrOutput)
}

func (o DeviceprofileApOutput) SiteId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.StringPtrOutput { return v.SiteId }).(pulumi.StringPtrOutput)
}

// Device Type. enum: `ap`
func (o DeviceprofileApOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// AP Uplink port configuration
func (o DeviceprofileApOutput) UplinkPortConfig() DeviceprofileApUplinkPortConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApUplinkPortConfigPtrOutput { return v.UplinkPortConfig }).(DeviceprofileApUplinkPortConfigPtrOutput)
}

// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
// moved to ESL Config.
func (o DeviceprofileApOutput) UsbConfig() DeviceprofileApUsbConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileAp) DeviceprofileApUsbConfigPtrOutput { return v.UsbConfig }).(DeviceprofileApUsbConfigPtrOutput)
}

// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
func (o DeviceprofileApOutput) Vars() pulumi.StringMapOutput {
	return o.ApplyT(func(v *DeviceprofileAp) pulumi.StringMapOutput { return v.Vars }).(pulumi.StringMapOutput)
}

type DeviceprofileApArrayOutput struct{ *pulumi.OutputState }

func (DeviceprofileApArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceprofileAp)(nil)).Elem()
}

func (o DeviceprofileApArrayOutput) ToDeviceprofileApArrayOutput() DeviceprofileApArrayOutput {
	return o
}

func (o DeviceprofileApArrayOutput) ToDeviceprofileApArrayOutputWithContext(ctx context.Context) DeviceprofileApArrayOutput {
	return o
}

func (o DeviceprofileApArrayOutput) Index(i pulumi.IntInput) DeviceprofileApOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeviceprofileAp {
		return vs[0].([]*DeviceprofileAp)[vs[1].(int)]
	}).(DeviceprofileApOutput)
}

type DeviceprofileApMapOutput struct{ *pulumi.OutputState }

func (DeviceprofileApMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceprofileAp)(nil)).Elem()
}

func (o DeviceprofileApMapOutput) ToDeviceprofileApMapOutput() DeviceprofileApMapOutput {
	return o
}

func (o DeviceprofileApMapOutput) ToDeviceprofileApMapOutputWithContext(ctx context.Context) DeviceprofileApMapOutput {
	return o
}

func (o DeviceprofileApMapOutput) MapIndex(k pulumi.StringInput) DeviceprofileApOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeviceprofileAp {
		return vs[0].(map[string]*DeviceprofileAp)[vs[1].(string)]
	}).(DeviceprofileApOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileApInput)(nil)).Elem(), &DeviceprofileAp{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileApArrayInput)(nil)).Elem(), DeviceprofileApArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileApMapInput)(nil)).Elem(), DeviceprofileApMap{})
	pulumi.RegisterOutputType(DeviceprofileApOutput{})
	pulumi.RegisterOutputType(DeviceprofileApArrayOutput{})
	pulumi.RegisterOutputType(DeviceprofileApMapOutput{})
}
