// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package device

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Wireless Access Point configuration.It can be used to define specific configuration at the device level or to override AP Device Profile (`org.DeviceprofileAp`).
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
//			_, err := device.NewAp(ctx, "ap_one", &device.ApArgs{
//				Name:     pulumi.String("test_ap"),
//				DeviceId: pulumi.Any(inventory.Devices[0].Id),
//				SiteId:   pulumi.Any(inventory.Devices[0].SiteId),
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
// ```sh
// $ pulumi import junipermist:device/ap:Ap Using terraform import, import `mist_device_ap` using the `import` command:
// ```
//
// Gateway cluster can be imported by specifying the site_id and the device_id
//
// ```sh
// $ pulumi import junipermist:device/ap:Ap ap_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
//
// In Terraform v1.5.0 and later, use an import block to import `mist_device_ap` with `id={site_id}.{device_id}`:
//
// tf
//
// import {
//
//	to = mist_device_ap.ap_one
//
//	id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"
//
// }
type Ap struct {
	pulumi.CustomResourceState

	// Aeroscout AP settings
	Aeroscout ApAeroscoutPtrOutput `pulumi:"aeroscout"`
	// BLE AP settings
	BleConfig       ApBleConfigPtrOutput    `pulumi:"bleConfig"`
	Centrak         ApCentrakPtrOutput      `pulumi:"centrak"`
	ClientBridge    ApClientBridgePtrOutput `pulumi:"clientBridge"`
	DeviceId        pulumi.StringOutput     `pulumi:"deviceId"`
	DeviceprofileId pulumi.StringOutput     `pulumi:"deviceprofileId"`
	// whether to disable eth1 port
	DisableEth1 pulumi.BoolOutput `pulumi:"disableEth1"`
	// whether to disable eth2 port
	DisableEth2 pulumi.BoolOutput `pulumi:"disableEth2"`
	// whether to disable eth3 port
	DisableEth3 pulumi.BoolOutput `pulumi:"disableEth3"`
	// whether to disable module port
	DisableModule pulumi.BoolOutput    `pulumi:"disableModule"`
	EslConfig     ApEslConfigPtrOutput `pulumi:"eslConfig"`
	// height, in meters, optional
	Height    pulumi.Float64PtrOutput `pulumi:"height"`
	Image1Url pulumi.StringOutput     `pulumi:"image1Url"`
	Image2Url pulumi.StringOutput     `pulumi:"image2Url"`
	Image3Url pulumi.StringOutput     `pulumi:"image3Url"`
	// IP AP settings
	IpConfig ApIpConfigPtrOutput `pulumi:"ipConfig"`
	// LED AP settings
	Led ApLedPtrOutput `pulumi:"led"`
	// whether this map is considered locked down
	Locked pulumi.BoolPtrOutput `pulumi:"locked"`
	// device MAC address
	Mac pulumi.StringOutput `pulumi:"mac"`
	// map where the device belongs to
	MapId pulumi.StringPtrOutput `pulumi:"mapId"`
	// Mesh AP settings
	Mesh ApMeshPtrOutput `pulumi:"mesh"`
	// device Model
	Model pulumi.StringOutput `pulumi:"model"`
	Name  pulumi.StringOutput `pulumi:"name"`
	// any notes about this AP
	Notes      pulumi.StringPtrOutput   `pulumi:"notes"`
	NtpServers pulumi.StringArrayOutput `pulumi:"ntpServers"`
	OrgId      pulumi.StringOutput      `pulumi:"orgId"`
	// orientation, 0-359, in degrees, up is 0, right is 90.
	Orientation pulumi.IntPtrOutput `pulumi:"orientation"`
	// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough pulumi.BoolOutput `pulumi:"poePassthrough"`
	// power related configs
	PwrConfig ApPwrConfigPtrOutput `pulumi:"pwrConfig"`
	// Radio AP settings
	RadioConfig ApRadioConfigPtrOutput `pulumi:"radioConfig"`
	// device Serial
	Serial pulumi.StringOutput `pulumi:"serial"`
	SiteId pulumi.StringOutput `pulumi:"siteId"`
	// Device Type. enum: `ap`
	Type             pulumi.StringOutput         `pulumi:"type"`
	UplinkPortConfig ApUplinkPortConfigPtrOutput `pulumi:"uplinkPortConfig"`
	// USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
	// to ESL Config.
	UsbConfig ApUsbConfigPtrOutput `pulumi:"usbConfig"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapOutput `pulumi:"vars"`
	// x in pixel
	X pulumi.Float64PtrOutput `pulumi:"x"`
	// y in pixel
	Y pulumi.Float64PtrOutput `pulumi:"y"`
}

// NewAp registers a new resource with the given unique name, arguments, and options.
func NewAp(ctx *pulumi.Context,
	name string, args *ApArgs, opts ...pulumi.ResourceOption) (*Ap, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DeviceId == nil {
		return nil, errors.New("invalid value for required argument 'DeviceId'")
	}
	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Ap
	err := ctx.RegisterResource("junipermist:device/ap:Ap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAp gets an existing Ap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApState, opts ...pulumi.ResourceOption) (*Ap, error) {
	var resource Ap
	err := ctx.ReadResource("junipermist:device/ap:Ap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ap resources.
type apState struct {
	// Aeroscout AP settings
	Aeroscout *ApAeroscout `pulumi:"aeroscout"`
	// BLE AP settings
	BleConfig       *ApBleConfig    `pulumi:"bleConfig"`
	Centrak         *ApCentrak      `pulumi:"centrak"`
	ClientBridge    *ApClientBridge `pulumi:"clientBridge"`
	DeviceId        *string         `pulumi:"deviceId"`
	DeviceprofileId *string         `pulumi:"deviceprofileId"`
	// whether to disable eth1 port
	DisableEth1 *bool `pulumi:"disableEth1"`
	// whether to disable eth2 port
	DisableEth2 *bool `pulumi:"disableEth2"`
	// whether to disable eth3 port
	DisableEth3 *bool `pulumi:"disableEth3"`
	// whether to disable module port
	DisableModule *bool        `pulumi:"disableModule"`
	EslConfig     *ApEslConfig `pulumi:"eslConfig"`
	// height, in meters, optional
	Height    *float64 `pulumi:"height"`
	Image1Url *string  `pulumi:"image1Url"`
	Image2Url *string  `pulumi:"image2Url"`
	Image3Url *string  `pulumi:"image3Url"`
	// IP AP settings
	IpConfig *ApIpConfig `pulumi:"ipConfig"`
	// LED AP settings
	Led *ApLed `pulumi:"led"`
	// whether this map is considered locked down
	Locked *bool `pulumi:"locked"`
	// device MAC address
	Mac *string `pulumi:"mac"`
	// map where the device belongs to
	MapId *string `pulumi:"mapId"`
	// Mesh AP settings
	Mesh *ApMesh `pulumi:"mesh"`
	// device Model
	Model *string `pulumi:"model"`
	Name  *string `pulumi:"name"`
	// any notes about this AP
	Notes      *string  `pulumi:"notes"`
	NtpServers []string `pulumi:"ntpServers"`
	OrgId      *string  `pulumi:"orgId"`
	// orientation, 0-359, in degrees, up is 0, right is 90.
	Orientation *int `pulumi:"orientation"`
	// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough *bool `pulumi:"poePassthrough"`
	// power related configs
	PwrConfig *ApPwrConfig `pulumi:"pwrConfig"`
	// Radio AP settings
	RadioConfig *ApRadioConfig `pulumi:"radioConfig"`
	// device Serial
	Serial *string `pulumi:"serial"`
	SiteId *string `pulumi:"siteId"`
	// Device Type. enum: `ap`
	Type             *string             `pulumi:"type"`
	UplinkPortConfig *ApUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
	// to ESL Config.
	UsbConfig *ApUsbConfig `pulumi:"usbConfig"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
	// x in pixel
	X *float64 `pulumi:"x"`
	// y in pixel
	Y *float64 `pulumi:"y"`
}

type ApState struct {
	// Aeroscout AP settings
	Aeroscout ApAeroscoutPtrInput
	// BLE AP settings
	BleConfig       ApBleConfigPtrInput
	Centrak         ApCentrakPtrInput
	ClientBridge    ApClientBridgePtrInput
	DeviceId        pulumi.StringPtrInput
	DeviceprofileId pulumi.StringPtrInput
	// whether to disable eth1 port
	DisableEth1 pulumi.BoolPtrInput
	// whether to disable eth2 port
	DisableEth2 pulumi.BoolPtrInput
	// whether to disable eth3 port
	DisableEth3 pulumi.BoolPtrInput
	// whether to disable module port
	DisableModule pulumi.BoolPtrInput
	EslConfig     ApEslConfigPtrInput
	// height, in meters, optional
	Height    pulumi.Float64PtrInput
	Image1Url pulumi.StringPtrInput
	Image2Url pulumi.StringPtrInput
	Image3Url pulumi.StringPtrInput
	// IP AP settings
	IpConfig ApIpConfigPtrInput
	// LED AP settings
	Led ApLedPtrInput
	// whether this map is considered locked down
	Locked pulumi.BoolPtrInput
	// device MAC address
	Mac pulumi.StringPtrInput
	// map where the device belongs to
	MapId pulumi.StringPtrInput
	// Mesh AP settings
	Mesh ApMeshPtrInput
	// device Model
	Model pulumi.StringPtrInput
	Name  pulumi.StringPtrInput
	// any notes about this AP
	Notes      pulumi.StringPtrInput
	NtpServers pulumi.StringArrayInput
	OrgId      pulumi.StringPtrInput
	// orientation, 0-359, in degrees, up is 0, right is 90.
	Orientation pulumi.IntPtrInput
	// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough pulumi.BoolPtrInput
	// power related configs
	PwrConfig ApPwrConfigPtrInput
	// Radio AP settings
	RadioConfig ApRadioConfigPtrInput
	// device Serial
	Serial pulumi.StringPtrInput
	SiteId pulumi.StringPtrInput
	// Device Type. enum: `ap`
	Type             pulumi.StringPtrInput
	UplinkPortConfig ApUplinkPortConfigPtrInput
	// USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
	// to ESL Config.
	UsbConfig ApUsbConfigPtrInput
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
	// x in pixel
	X pulumi.Float64PtrInput
	// y in pixel
	Y pulumi.Float64PtrInput
}

func (ApState) ElementType() reflect.Type {
	return reflect.TypeOf((*apState)(nil)).Elem()
}

type apArgs struct {
	// Aeroscout AP settings
	Aeroscout *ApAeroscout `pulumi:"aeroscout"`
	// BLE AP settings
	BleConfig    *ApBleConfig    `pulumi:"bleConfig"`
	Centrak      *ApCentrak      `pulumi:"centrak"`
	ClientBridge *ApClientBridge `pulumi:"clientBridge"`
	DeviceId     string          `pulumi:"deviceId"`
	// whether to disable eth1 port
	DisableEth1 *bool `pulumi:"disableEth1"`
	// whether to disable eth2 port
	DisableEth2 *bool `pulumi:"disableEth2"`
	// whether to disable eth3 port
	DisableEth3 *bool `pulumi:"disableEth3"`
	// whether to disable module port
	DisableModule *bool        `pulumi:"disableModule"`
	EslConfig     *ApEslConfig `pulumi:"eslConfig"`
	// height, in meters, optional
	Height *float64 `pulumi:"height"`
	// IP AP settings
	IpConfig *ApIpConfig `pulumi:"ipConfig"`
	// LED AP settings
	Led *ApLed `pulumi:"led"`
	// whether this map is considered locked down
	Locked *bool `pulumi:"locked"`
	// map where the device belongs to
	MapId *string `pulumi:"mapId"`
	// Mesh AP settings
	Mesh *ApMesh `pulumi:"mesh"`
	Name *string `pulumi:"name"`
	// any notes about this AP
	Notes      *string  `pulumi:"notes"`
	NtpServers []string `pulumi:"ntpServers"`
	// orientation, 0-359, in degrees, up is 0, right is 90.
	Orientation *int `pulumi:"orientation"`
	// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough *bool `pulumi:"poePassthrough"`
	// power related configs
	PwrConfig *ApPwrConfig `pulumi:"pwrConfig"`
	// Radio AP settings
	RadioConfig      *ApRadioConfig      `pulumi:"radioConfig"`
	SiteId           string              `pulumi:"siteId"`
	UplinkPortConfig *ApUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
	// to ESL Config.
	UsbConfig *ApUsbConfig `pulumi:"usbConfig"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
	// x in pixel
	X *float64 `pulumi:"x"`
	// y in pixel
	Y *float64 `pulumi:"y"`
}

// The set of arguments for constructing a Ap resource.
type ApArgs struct {
	// Aeroscout AP settings
	Aeroscout ApAeroscoutPtrInput
	// BLE AP settings
	BleConfig    ApBleConfigPtrInput
	Centrak      ApCentrakPtrInput
	ClientBridge ApClientBridgePtrInput
	DeviceId     pulumi.StringInput
	// whether to disable eth1 port
	DisableEth1 pulumi.BoolPtrInput
	// whether to disable eth2 port
	DisableEth2 pulumi.BoolPtrInput
	// whether to disable eth3 port
	DisableEth3 pulumi.BoolPtrInput
	// whether to disable module port
	DisableModule pulumi.BoolPtrInput
	EslConfig     ApEslConfigPtrInput
	// height, in meters, optional
	Height pulumi.Float64PtrInput
	// IP AP settings
	IpConfig ApIpConfigPtrInput
	// LED AP settings
	Led ApLedPtrInput
	// whether this map is considered locked down
	Locked pulumi.BoolPtrInput
	// map where the device belongs to
	MapId pulumi.StringPtrInput
	// Mesh AP settings
	Mesh ApMeshPtrInput
	Name pulumi.StringPtrInput
	// any notes about this AP
	Notes      pulumi.StringPtrInput
	NtpServers pulumi.StringArrayInput
	// orientation, 0-359, in degrees, up is 0, right is 90.
	Orientation pulumi.IntPtrInput
	// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
	PoePassthrough pulumi.BoolPtrInput
	// power related configs
	PwrConfig ApPwrConfigPtrInput
	// Radio AP settings
	RadioConfig      ApRadioConfigPtrInput
	SiteId           pulumi.StringInput
	UplinkPortConfig ApUplinkPortConfigPtrInput
	// USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
	// to ESL Config.
	UsbConfig ApUsbConfigPtrInput
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
	// x in pixel
	X pulumi.Float64PtrInput
	// y in pixel
	Y pulumi.Float64PtrInput
}

func (ApArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apArgs)(nil)).Elem()
}

type ApInput interface {
	pulumi.Input

	ToApOutput() ApOutput
	ToApOutputWithContext(ctx context.Context) ApOutput
}

func (*Ap) ElementType() reflect.Type {
	return reflect.TypeOf((**Ap)(nil)).Elem()
}

func (i *Ap) ToApOutput() ApOutput {
	return i.ToApOutputWithContext(context.Background())
}

func (i *Ap) ToApOutputWithContext(ctx context.Context) ApOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApOutput)
}

// ApArrayInput is an input type that accepts ApArray and ApArrayOutput values.
// You can construct a concrete instance of `ApArrayInput` via:
//
//	ApArray{ ApArgs{...} }
type ApArrayInput interface {
	pulumi.Input

	ToApArrayOutput() ApArrayOutput
	ToApArrayOutputWithContext(context.Context) ApArrayOutput
}

type ApArray []ApInput

func (ApArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ap)(nil)).Elem()
}

func (i ApArray) ToApArrayOutput() ApArrayOutput {
	return i.ToApArrayOutputWithContext(context.Background())
}

func (i ApArray) ToApArrayOutputWithContext(ctx context.Context) ApArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApArrayOutput)
}

// ApMapInput is an input type that accepts ApMap and ApMapOutput values.
// You can construct a concrete instance of `ApMapInput` via:
//
//	ApMap{ "key": ApArgs{...} }
type ApMapInput interface {
	pulumi.Input

	ToApMapOutput() ApMapOutput
	ToApMapOutputWithContext(context.Context) ApMapOutput
}

type ApMap map[string]ApInput

func (ApMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ap)(nil)).Elem()
}

func (i ApMap) ToApMapOutput() ApMapOutput {
	return i.ToApMapOutputWithContext(context.Background())
}

func (i ApMap) ToApMapOutputWithContext(ctx context.Context) ApMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApMapOutput)
}

type ApOutput struct{ *pulumi.OutputState }

func (ApOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ap)(nil)).Elem()
}

func (o ApOutput) ToApOutput() ApOutput {
	return o
}

func (o ApOutput) ToApOutputWithContext(ctx context.Context) ApOutput {
	return o
}

// Aeroscout AP settings
func (o ApOutput) Aeroscout() ApAeroscoutPtrOutput {
	return o.ApplyT(func(v *Ap) ApAeroscoutPtrOutput { return v.Aeroscout }).(ApAeroscoutPtrOutput)
}

// BLE AP settings
func (o ApOutput) BleConfig() ApBleConfigPtrOutput {
	return o.ApplyT(func(v *Ap) ApBleConfigPtrOutput { return v.BleConfig }).(ApBleConfigPtrOutput)
}

func (o ApOutput) Centrak() ApCentrakPtrOutput {
	return o.ApplyT(func(v *Ap) ApCentrakPtrOutput { return v.Centrak }).(ApCentrakPtrOutput)
}

func (o ApOutput) ClientBridge() ApClientBridgePtrOutput {
	return o.ApplyT(func(v *Ap) ApClientBridgePtrOutput { return v.ClientBridge }).(ApClientBridgePtrOutput)
}

func (o ApOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

func (o ApOutput) DeviceprofileId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.DeviceprofileId }).(pulumi.StringOutput)
}

// whether to disable eth1 port
func (o ApOutput) DisableEth1() pulumi.BoolOutput {
	return o.ApplyT(func(v *Ap) pulumi.BoolOutput { return v.DisableEth1 }).(pulumi.BoolOutput)
}

// whether to disable eth2 port
func (o ApOutput) DisableEth2() pulumi.BoolOutput {
	return o.ApplyT(func(v *Ap) pulumi.BoolOutput { return v.DisableEth2 }).(pulumi.BoolOutput)
}

// whether to disable eth3 port
func (o ApOutput) DisableEth3() pulumi.BoolOutput {
	return o.ApplyT(func(v *Ap) pulumi.BoolOutput { return v.DisableEth3 }).(pulumi.BoolOutput)
}

// whether to disable module port
func (o ApOutput) DisableModule() pulumi.BoolOutput {
	return o.ApplyT(func(v *Ap) pulumi.BoolOutput { return v.DisableModule }).(pulumi.BoolOutput)
}

func (o ApOutput) EslConfig() ApEslConfigPtrOutput {
	return o.ApplyT(func(v *Ap) ApEslConfigPtrOutput { return v.EslConfig }).(ApEslConfigPtrOutput)
}

// height, in meters, optional
func (o ApOutput) Height() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Ap) pulumi.Float64PtrOutput { return v.Height }).(pulumi.Float64PtrOutput)
}

func (o ApOutput) Image1Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Image1Url }).(pulumi.StringOutput)
}

func (o ApOutput) Image2Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Image2Url }).(pulumi.StringOutput)
}

func (o ApOutput) Image3Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Image3Url }).(pulumi.StringOutput)
}

// IP AP settings
func (o ApOutput) IpConfig() ApIpConfigPtrOutput {
	return o.ApplyT(func(v *Ap) ApIpConfigPtrOutput { return v.IpConfig }).(ApIpConfigPtrOutput)
}

// LED AP settings
func (o ApOutput) Led() ApLedPtrOutput {
	return o.ApplyT(func(v *Ap) ApLedPtrOutput { return v.Led }).(ApLedPtrOutput)
}

// whether this map is considered locked down
func (o ApOutput) Locked() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Ap) pulumi.BoolPtrOutput { return v.Locked }).(pulumi.BoolPtrOutput)
}

// device MAC address
func (o ApOutput) Mac() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Mac }).(pulumi.StringOutput)
}

// map where the device belongs to
func (o ApOutput) MapId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringPtrOutput { return v.MapId }).(pulumi.StringPtrOutput)
}

// Mesh AP settings
func (o ApOutput) Mesh() ApMeshPtrOutput {
	return o.ApplyT(func(v *Ap) ApMeshPtrOutput { return v.Mesh }).(ApMeshPtrOutput)
}

// device Model
func (o ApOutput) Model() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Model }).(pulumi.StringOutput)
}

func (o ApOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// any notes about this AP
func (o ApOutput) Notes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringPtrOutput { return v.Notes }).(pulumi.StringPtrOutput)
}

func (o ApOutput) NtpServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringArrayOutput { return v.NtpServers }).(pulumi.StringArrayOutput)
}

func (o ApOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// orientation, 0-359, in degrees, up is 0, right is 90.
func (o ApOutput) Orientation() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Ap) pulumi.IntPtrOutput { return v.Orientation }).(pulumi.IntPtrOutput)
}

// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
func (o ApOutput) PoePassthrough() pulumi.BoolOutput {
	return o.ApplyT(func(v *Ap) pulumi.BoolOutput { return v.PoePassthrough }).(pulumi.BoolOutput)
}

// power related configs
func (o ApOutput) PwrConfig() ApPwrConfigPtrOutput {
	return o.ApplyT(func(v *Ap) ApPwrConfigPtrOutput { return v.PwrConfig }).(ApPwrConfigPtrOutput)
}

// Radio AP settings
func (o ApOutput) RadioConfig() ApRadioConfigPtrOutput {
	return o.ApplyT(func(v *Ap) ApRadioConfigPtrOutput { return v.RadioConfig }).(ApRadioConfigPtrOutput)
}

// device Serial
func (o ApOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

func (o ApOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// Device Type. enum: `ap`
func (o ApOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o ApOutput) UplinkPortConfig() ApUplinkPortConfigPtrOutput {
	return o.ApplyT(func(v *Ap) ApUplinkPortConfigPtrOutput { return v.UplinkPortConfig }).(ApUplinkPortConfigPtrOutput)
}

// USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
// to ESL Config.
func (o ApOutput) UsbConfig() ApUsbConfigPtrOutput {
	return o.ApplyT(func(v *Ap) ApUsbConfigPtrOutput { return v.UsbConfig }).(ApUsbConfigPtrOutput)
}

// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
func (o ApOutput) Vars() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Ap) pulumi.StringMapOutput { return v.Vars }).(pulumi.StringMapOutput)
}

// x in pixel
func (o ApOutput) X() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Ap) pulumi.Float64PtrOutput { return v.X }).(pulumi.Float64PtrOutput)
}

// y in pixel
func (o ApOutput) Y() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Ap) pulumi.Float64PtrOutput { return v.Y }).(pulumi.Float64PtrOutput)
}

type ApArrayOutput struct{ *pulumi.OutputState }

func (ApArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ap)(nil)).Elem()
}

func (o ApArrayOutput) ToApArrayOutput() ApArrayOutput {
	return o
}

func (o ApArrayOutput) ToApArrayOutputWithContext(ctx context.Context) ApArrayOutput {
	return o
}

func (o ApArrayOutput) Index(i pulumi.IntInput) ApOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ap {
		return vs[0].([]*Ap)[vs[1].(int)]
	}).(ApOutput)
}

type ApMapOutput struct{ *pulumi.OutputState }

func (ApMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ap)(nil)).Elem()
}

func (o ApMapOutput) ToApMapOutput() ApMapOutput {
	return o
}

func (o ApMapOutput) ToApMapOutputWithContext(ctx context.Context) ApMapOutput {
	return o
}

func (o ApMapOutput) MapIndex(k pulumi.StringInput) ApOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ap {
		return vs[0].(map[string]*Ap)[vs[1].(string)]
	}).(ApOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApInput)(nil)).Elem(), &Ap{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApArrayInput)(nil)).Elem(), ApArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApMapInput)(nil)).Elem(), ApMap{})
	pulumi.RegisterOutputType(ApOutput{})
	pulumi.RegisterOutputType(ApArrayOutput{})
	pulumi.RegisterOutputType(ApMapOutput{})
}
