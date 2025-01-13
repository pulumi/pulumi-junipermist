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

// This resource manages the Gateway configuration.
//
// It can be used to define specific configuration at the device level or to override Org Gateway template settings.
//
// > **WARNING** For **adopted** devices, make sure to set `managed`=`true` to allow Mist to manage the gateway
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
//			_, err := device.NewGateway(ctx, "gateway_one", &device.GatewayArgs{
//				Name:     pulumi.String("gateway_one"),
//				DeviceId: pulumi.Any(clusterOne.DeviceId),
//				SiteId:   pulumi.Any(clusterOne.SiteId),
//				OobIpConfig: &device.GatewayOobIpConfigArgs{
//					Type: pulumi.String("dhcp"),
//				},
//				DnsServers: pulumi.StringArray{
//					pulumi.String("8.8.8.8"),
//				},
//				AdditionalConfigCmds: pulumi.StringArray{
//					pulumi.String("annotate system \" -- custom-main -- Template level --\""),
//					pulumi.String("delete apply-groups custom-main"),
//					pulumi.String("delete groups custom-main"),
//					pulumi.String("set groups custom-main"),
//					pulumi.String("set groups custom-main system services ssh root-login allow"),
//					pulumi.String("set apply-groups custom-main"),
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
// Using `pulumi import`, import `mist_device_gateway` with:
//
// Gateway Configuration can be imported by specifying the site_id and the device_id
//
// ```sh
// $ pulumi import junipermist:device/gateway:Gateway gateway_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Gateway struct {
	pulumi.CustomResourceState

	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayOutput    `pulumi:"additionalConfigCmds"`
	BgpConfig            GatewayBgpConfigMapOutput   `pulumi:"bgpConfig"`
	DeviceId             pulumi.StringOutput         `pulumi:"deviceId"`
	DhcpdConfig          GatewayDhcpdConfigPtrOutput `pulumi:"dhcpdConfig"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayOutput `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayOutput `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes GatewayExtraRoutesMapOutput `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 GatewayExtraRoutes6MapOutput `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles GatewayIdpProfilesMapOutput `pulumi:"idpProfiles"`
	Image1Url   pulumi.StringOutput         `pulumi:"image1Url"`
	Image2Url   pulumi.StringOutput         `pulumi:"image2Url"`
	Image3Url   pulumi.StringOutput         `pulumi:"image3Url"`
	// Property key is the network name
	IpConfigs GatewayIpConfigsMapOutput `pulumi:"ipConfigs"`
	// device MAC address
	Mac     pulumi.StringOutput  `pulumi:"mac"`
	Managed pulumi.BoolPtrOutput `pulumi:"managed"`
	// map where the device belongs to
	MapId pulumi.StringPtrOutput `pulumi:"mapId"`
	// device Model
	Model      pulumi.StringOutput       `pulumi:"model"`
	MspId      pulumi.StringPtrOutput    `pulumi:"mspId"`
	Name       pulumi.StringOutput       `pulumi:"name"`
	Networks   GatewayNetworkArrayOutput `pulumi:"networks"`
	Notes      pulumi.StringPtrOutput    `pulumi:"notes"`
	NtpServers pulumi.StringArrayOutput  `pulumi:"ntpServers"`
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig GatewayOobIpConfigOutput `pulumi:"oobIpConfig"`
	OrgId       pulumi.StringOutput      `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences GatewayPathPreferencesMapOutput `pulumi:"pathPreferences"`
	// Property key is the port name or range (e.g. "ge-0/0/0-10")
	PortConfig    GatewayPortConfigMapOutput    `pulumi:"portConfig"`
	PortMirroring GatewayPortMirroringPtrOutput `pulumi:"portMirroring"`
	// auto assigned if not set
	RouterId pulumi.StringPtrOutput `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies GatewayRoutingPoliciesMapOutput `pulumi:"routingPolicies"`
	// device Serial
	Serial          pulumi.StringOutput             `pulumi:"serial"`
	ServicePolicies GatewayServicePolicyArrayOutput `pulumi:"servicePolicies"`
	SiteId          pulumi.StringOutput             `pulumi:"siteId"`
	// Property key is the tunnel name
	TunnelConfigs         GatewayTunnelConfigsMapOutput         `pulumi:"tunnelConfigs"`
	TunnelProviderOptions GatewayTunnelProviderOptionsPtrOutput `pulumi:"tunnelProviderOptions"`
	// Device Type. enum: `gateway`
	Type pulumi.StringOutput `pulumi:"type"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars      pulumi.StringMapOutput    `pulumi:"vars"`
	VrfConfig GatewayVrfConfigPtrOutput `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances GatewayVrfInstancesMapOutput `pulumi:"vrfInstances"`
	// x in pixel
	X pulumi.Float64PtrOutput `pulumi:"x"`
	// y in pixel
	Y pulumi.Float64PtrOutput `pulumi:"y"`
}

// NewGateway registers a new resource with the given unique name, arguments, and options.
func NewGateway(ctx *pulumi.Context,
	name string, args *GatewayArgs, opts ...pulumi.ResourceOption) (*Gateway, error) {
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
	var resource Gateway
	err := ctx.RegisterResource("junipermist:device/gateway:Gateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGateway gets an existing Gateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayState, opts ...pulumi.ResourceOption) (*Gateway, error) {
	var resource Gateway
	err := ctx.ReadResource("junipermist:device/gateway:Gateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Gateway resources.
type gatewayState struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds []string                    `pulumi:"additionalConfigCmds"`
	BgpConfig            map[string]GatewayBgpConfig `pulumi:"bgpConfig"`
	DeviceId             *string                     `pulumi:"deviceId"`
	DhcpdConfig          *GatewayDhcpdConfig         `pulumi:"dhcpdConfig"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes map[string]GatewayExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 map[string]GatewayExtraRoutes6 `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles map[string]GatewayIdpProfiles `pulumi:"idpProfiles"`
	Image1Url   *string                       `pulumi:"image1Url"`
	Image2Url   *string                       `pulumi:"image2Url"`
	Image3Url   *string                       `pulumi:"image3Url"`
	// Property key is the network name
	IpConfigs map[string]GatewayIpConfigs `pulumi:"ipConfigs"`
	// device MAC address
	Mac     *string `pulumi:"mac"`
	Managed *bool   `pulumi:"managed"`
	// map where the device belongs to
	MapId *string `pulumi:"mapId"`
	// device Model
	Model      *string          `pulumi:"model"`
	MspId      *string          `pulumi:"mspId"`
	Name       *string          `pulumi:"name"`
	Networks   []GatewayNetwork `pulumi:"networks"`
	Notes      *string          `pulumi:"notes"`
	NtpServers []string         `pulumi:"ntpServers"`
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig *GatewayOobIpConfig `pulumi:"oobIpConfig"`
	OrgId       *string             `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences map[string]GatewayPathPreferences `pulumi:"pathPreferences"`
	// Property key is the port name or range (e.g. "ge-0/0/0-10")
	PortConfig    map[string]GatewayPortConfig `pulumi:"portConfig"`
	PortMirroring *GatewayPortMirroring        `pulumi:"portMirroring"`
	// auto assigned if not set
	RouterId *string `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies map[string]GatewayRoutingPolicies `pulumi:"routingPolicies"`
	// device Serial
	Serial          *string                `pulumi:"serial"`
	ServicePolicies []GatewayServicePolicy `pulumi:"servicePolicies"`
	SiteId          *string                `pulumi:"siteId"`
	// Property key is the tunnel name
	TunnelConfigs         map[string]GatewayTunnelConfigs `pulumi:"tunnelConfigs"`
	TunnelProviderOptions *GatewayTunnelProviderOptions   `pulumi:"tunnelProviderOptions"`
	// Device Type. enum: `gateway`
	Type *string `pulumi:"type"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars      map[string]string `pulumi:"vars"`
	VrfConfig *GatewayVrfConfig `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]GatewayVrfInstances `pulumi:"vrfInstances"`
	// x in pixel
	X *float64 `pulumi:"x"`
	// y in pixel
	Y *float64 `pulumi:"y"`
}

type GatewayState struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	BgpConfig            GatewayBgpConfigMapInput
	DeviceId             pulumi.StringPtrInput
	DhcpdConfig          GatewayDhcpdConfigPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes GatewayExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 GatewayExtraRoutes6MapInput
	// Property key is the profile name
	IdpProfiles GatewayIdpProfilesMapInput
	Image1Url   pulumi.StringPtrInput
	Image2Url   pulumi.StringPtrInput
	Image3Url   pulumi.StringPtrInput
	// Property key is the network name
	IpConfigs GatewayIpConfigsMapInput
	// device MAC address
	Mac     pulumi.StringPtrInput
	Managed pulumi.BoolPtrInput
	// map where the device belongs to
	MapId pulumi.StringPtrInput
	// device Model
	Model      pulumi.StringPtrInput
	MspId      pulumi.StringPtrInput
	Name       pulumi.StringPtrInput
	Networks   GatewayNetworkArrayInput
	Notes      pulumi.StringPtrInput
	NtpServers pulumi.StringArrayInput
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig GatewayOobIpConfigPtrInput
	OrgId       pulumi.StringPtrInput
	// Property key is the path name
	PathPreferences GatewayPathPreferencesMapInput
	// Property key is the port name or range (e.g. "ge-0/0/0-10")
	PortConfig    GatewayPortConfigMapInput
	PortMirroring GatewayPortMirroringPtrInput
	// auto assigned if not set
	RouterId pulumi.StringPtrInput
	// Property key is the routing policy name
	RoutingPolicies GatewayRoutingPoliciesMapInput
	// device Serial
	Serial          pulumi.StringPtrInput
	ServicePolicies GatewayServicePolicyArrayInput
	SiteId          pulumi.StringPtrInput
	// Property key is the tunnel name
	TunnelConfigs         GatewayTunnelConfigsMapInput
	TunnelProviderOptions GatewayTunnelProviderOptionsPtrInput
	// Device Type. enum: `gateway`
	Type pulumi.StringPtrInput
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars      pulumi.StringMapInput
	VrfConfig GatewayVrfConfigPtrInput
	// Property key is the network name
	VrfInstances GatewayVrfInstancesMapInput
	// x in pixel
	X pulumi.Float64PtrInput
	// y in pixel
	Y pulumi.Float64PtrInput
}

func (GatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayState)(nil)).Elem()
}

type gatewayArgs struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds []string                    `pulumi:"additionalConfigCmds"`
	BgpConfig            map[string]GatewayBgpConfig `pulumi:"bgpConfig"`
	DeviceId             string                      `pulumi:"deviceId"`
	DhcpdConfig          *GatewayDhcpdConfig         `pulumi:"dhcpdConfig"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes map[string]GatewayExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 map[string]GatewayExtraRoutes6 `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles map[string]GatewayIdpProfiles `pulumi:"idpProfiles"`
	// Property key is the network name
	IpConfigs map[string]GatewayIpConfigs `pulumi:"ipConfigs"`
	Managed   *bool                       `pulumi:"managed"`
	// map where the device belongs to
	MapId      *string          `pulumi:"mapId"`
	MspId      *string          `pulumi:"mspId"`
	Name       *string          `pulumi:"name"`
	Networks   []GatewayNetwork `pulumi:"networks"`
	Notes      *string          `pulumi:"notes"`
	NtpServers []string         `pulumi:"ntpServers"`
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig *GatewayOobIpConfig `pulumi:"oobIpConfig"`
	// Property key is the path name
	PathPreferences map[string]GatewayPathPreferences `pulumi:"pathPreferences"`
	// Property key is the port name or range (e.g. "ge-0/0/0-10")
	PortConfig    map[string]GatewayPortConfig `pulumi:"portConfig"`
	PortMirroring *GatewayPortMirroring        `pulumi:"portMirroring"`
	// auto assigned if not set
	RouterId *string `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies map[string]GatewayRoutingPolicies `pulumi:"routingPolicies"`
	ServicePolicies []GatewayServicePolicy            `pulumi:"servicePolicies"`
	SiteId          string                            `pulumi:"siteId"`
	// Property key is the tunnel name
	TunnelConfigs         map[string]GatewayTunnelConfigs `pulumi:"tunnelConfigs"`
	TunnelProviderOptions *GatewayTunnelProviderOptions   `pulumi:"tunnelProviderOptions"`
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars      map[string]string `pulumi:"vars"`
	VrfConfig *GatewayVrfConfig `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]GatewayVrfInstances `pulumi:"vrfInstances"`
	// x in pixel
	X *float64 `pulumi:"x"`
	// y in pixel
	Y *float64 `pulumi:"y"`
}

// The set of arguments for constructing a Gateway resource.
type GatewayArgs struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	BgpConfig            GatewayBgpConfigMapInput
	DeviceId             pulumi.StringInput
	DhcpdConfig          GatewayDhcpdConfigPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	// Property key is the destination CIDR (e.g. "10.0.0.0/8")
	ExtraRoutes GatewayExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
	ExtraRoutes6 GatewayExtraRoutes6MapInput
	// Property key is the profile name
	IdpProfiles GatewayIdpProfilesMapInput
	// Property key is the network name
	IpConfigs GatewayIpConfigsMapInput
	Managed   pulumi.BoolPtrInput
	// map where the device belongs to
	MapId      pulumi.StringPtrInput
	MspId      pulumi.StringPtrInput
	Name       pulumi.StringPtrInput
	Networks   GatewayNetworkArrayInput
	Notes      pulumi.StringPtrInput
	NtpServers pulumi.StringArrayInput
	// out-of-band (vme/em0/fxp0) IP config
	OobIpConfig GatewayOobIpConfigPtrInput
	// Property key is the path name
	PathPreferences GatewayPathPreferencesMapInput
	// Property key is the port name or range (e.g. "ge-0/0/0-10")
	PortConfig    GatewayPortConfigMapInput
	PortMirroring GatewayPortMirroringPtrInput
	// auto assigned if not set
	RouterId pulumi.StringPtrInput
	// Property key is the routing policy name
	RoutingPolicies GatewayRoutingPoliciesMapInput
	ServicePolicies GatewayServicePolicyArrayInput
	SiteId          pulumi.StringInput
	// Property key is the tunnel name
	TunnelConfigs         GatewayTunnelConfigsMapInput
	TunnelProviderOptions GatewayTunnelProviderOptionsPtrInput
	// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars      pulumi.StringMapInput
	VrfConfig GatewayVrfConfigPtrInput
	// Property key is the network name
	VrfInstances GatewayVrfInstancesMapInput
	// x in pixel
	X pulumi.Float64PtrInput
	// y in pixel
	Y pulumi.Float64PtrInput
}

func (GatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayArgs)(nil)).Elem()
}

type GatewayInput interface {
	pulumi.Input

	ToGatewayOutput() GatewayOutput
	ToGatewayOutputWithContext(ctx context.Context) GatewayOutput
}

func (*Gateway) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (i *Gateway) ToGatewayOutput() GatewayOutput {
	return i.ToGatewayOutputWithContext(context.Background())
}

func (i *Gateway) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayOutput)
}

// GatewayArrayInput is an input type that accepts GatewayArray and GatewayArrayOutput values.
// You can construct a concrete instance of `GatewayArrayInput` via:
//
//	GatewayArray{ GatewayArgs{...} }
type GatewayArrayInput interface {
	pulumi.Input

	ToGatewayArrayOutput() GatewayArrayOutput
	ToGatewayArrayOutputWithContext(context.Context) GatewayArrayOutput
}

type GatewayArray []GatewayInput

func (GatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (i GatewayArray) ToGatewayArrayOutput() GatewayArrayOutput {
	return i.ToGatewayArrayOutputWithContext(context.Background())
}

func (i GatewayArray) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayArrayOutput)
}

// GatewayMapInput is an input type that accepts GatewayMap and GatewayMapOutput values.
// You can construct a concrete instance of `GatewayMapInput` via:
//
//	GatewayMap{ "key": GatewayArgs{...} }
type GatewayMapInput interface {
	pulumi.Input

	ToGatewayMapOutput() GatewayMapOutput
	ToGatewayMapOutputWithContext(context.Context) GatewayMapOutput
}

type GatewayMap map[string]GatewayInput

func (GatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (i GatewayMap) ToGatewayMapOutput() GatewayMapOutput {
	return i.ToGatewayMapOutputWithContext(context.Background())
}

func (i GatewayMap) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayMapOutput)
}

type GatewayOutput struct{ *pulumi.OutputState }

func (GatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Gateway)(nil)).Elem()
}

func (o GatewayOutput) ToGatewayOutput() GatewayOutput {
	return o
}

func (o GatewayOutput) ToGatewayOutputWithContext(ctx context.Context) GatewayOutput {
	return o
}

// additional CLI commands to append to the generated Junos config. **Note**: no check is done
func (o GatewayOutput) AdditionalConfigCmds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringArrayOutput { return v.AdditionalConfigCmds }).(pulumi.StringArrayOutput)
}

func (o GatewayOutput) BgpConfig() GatewayBgpConfigMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayBgpConfigMapOutput { return v.BgpConfig }).(GatewayBgpConfigMapOutput)
}

func (o GatewayOutput) DeviceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.DeviceId }).(pulumi.StringOutput)
}

func (o GatewayOutput) DhcpdConfig() GatewayDhcpdConfigPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayDhcpdConfigPtrOutput { return v.DhcpdConfig }).(GatewayDhcpdConfigPtrOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o GatewayOutput) DnsServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringArrayOutput { return v.DnsServers }).(pulumi.StringArrayOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o GatewayOutput) DnsSuffixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringArrayOutput { return v.DnsSuffixes }).(pulumi.StringArrayOutput)
}

// Property key is the destination CIDR (e.g. "10.0.0.0/8")
func (o GatewayOutput) ExtraRoutes() GatewayExtraRoutesMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayExtraRoutesMapOutput { return v.ExtraRoutes }).(GatewayExtraRoutesMapOutput)
}

// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
func (o GatewayOutput) ExtraRoutes6() GatewayExtraRoutes6MapOutput {
	return o.ApplyT(func(v *Gateway) GatewayExtraRoutes6MapOutput { return v.ExtraRoutes6 }).(GatewayExtraRoutes6MapOutput)
}

// Property key is the profile name
func (o GatewayOutput) IdpProfiles() GatewayIdpProfilesMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayIdpProfilesMapOutput { return v.IdpProfiles }).(GatewayIdpProfilesMapOutput)
}

func (o GatewayOutput) Image1Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Image1Url }).(pulumi.StringOutput)
}

func (o GatewayOutput) Image2Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Image2Url }).(pulumi.StringOutput)
}

func (o GatewayOutput) Image3Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Image3Url }).(pulumi.StringOutput)
}

// Property key is the network name
func (o GatewayOutput) IpConfigs() GatewayIpConfigsMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayIpConfigsMapOutput { return v.IpConfigs }).(GatewayIpConfigsMapOutput)
}

// device MAC address
func (o GatewayOutput) Mac() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Mac }).(pulumi.StringOutput)
}

func (o GatewayOutput) Managed() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.BoolPtrOutput { return v.Managed }).(pulumi.BoolPtrOutput)
}

// map where the device belongs to
func (o GatewayOutput) MapId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.MapId }).(pulumi.StringPtrOutput)
}

// device Model
func (o GatewayOutput) Model() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Model }).(pulumi.StringOutput)
}

func (o GatewayOutput) MspId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.MspId }).(pulumi.StringPtrOutput)
}

func (o GatewayOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o GatewayOutput) Networks() GatewayNetworkArrayOutput {
	return o.ApplyT(func(v *Gateway) GatewayNetworkArrayOutput { return v.Networks }).(GatewayNetworkArrayOutput)
}

func (o GatewayOutput) Notes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.Notes }).(pulumi.StringPtrOutput)
}

func (o GatewayOutput) NtpServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringArrayOutput { return v.NtpServers }).(pulumi.StringArrayOutput)
}

// out-of-band (vme/em0/fxp0) IP config
func (o GatewayOutput) OobIpConfig() GatewayOobIpConfigOutput {
	return o.ApplyT(func(v *Gateway) GatewayOobIpConfigOutput { return v.OobIpConfig }).(GatewayOobIpConfigOutput)
}

func (o GatewayOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Property key is the path name
func (o GatewayOutput) PathPreferences() GatewayPathPreferencesMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayPathPreferencesMapOutput { return v.PathPreferences }).(GatewayPathPreferencesMapOutput)
}

// Property key is the port name or range (e.g. "ge-0/0/0-10")
func (o GatewayOutput) PortConfig() GatewayPortConfigMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayPortConfigMapOutput { return v.PortConfig }).(GatewayPortConfigMapOutput)
}

func (o GatewayOutput) PortMirroring() GatewayPortMirroringPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayPortMirroringPtrOutput { return v.PortMirroring }).(GatewayPortMirroringPtrOutput)
}

// auto assigned if not set
func (o GatewayOutput) RouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringPtrOutput { return v.RouterId }).(pulumi.StringPtrOutput)
}

// Property key is the routing policy name
func (o GatewayOutput) RoutingPolicies() GatewayRoutingPoliciesMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayRoutingPoliciesMapOutput { return v.RoutingPolicies }).(GatewayRoutingPoliciesMapOutput)
}

// device Serial
func (o GatewayOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Serial }).(pulumi.StringOutput)
}

func (o GatewayOutput) ServicePolicies() GatewayServicePolicyArrayOutput {
	return o.ApplyT(func(v *Gateway) GatewayServicePolicyArrayOutput { return v.ServicePolicies }).(GatewayServicePolicyArrayOutput)
}

func (o GatewayOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// Property key is the tunnel name
func (o GatewayOutput) TunnelConfigs() GatewayTunnelConfigsMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayTunnelConfigsMapOutput { return v.TunnelConfigs }).(GatewayTunnelConfigsMapOutput)
}

func (o GatewayOutput) TunnelProviderOptions() GatewayTunnelProviderOptionsPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayTunnelProviderOptionsPtrOutput { return v.TunnelProviderOptions }).(GatewayTunnelProviderOptionsPtrOutput)
}

// Device Type. enum: `gateway`
func (o GatewayOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// a dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
func (o GatewayOutput) Vars() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Gateway) pulumi.StringMapOutput { return v.Vars }).(pulumi.StringMapOutput)
}

func (o GatewayOutput) VrfConfig() GatewayVrfConfigPtrOutput {
	return o.ApplyT(func(v *Gateway) GatewayVrfConfigPtrOutput { return v.VrfConfig }).(GatewayVrfConfigPtrOutput)
}

// Property key is the network name
func (o GatewayOutput) VrfInstances() GatewayVrfInstancesMapOutput {
	return o.ApplyT(func(v *Gateway) GatewayVrfInstancesMapOutput { return v.VrfInstances }).(GatewayVrfInstancesMapOutput)
}

// x in pixel
func (o GatewayOutput) X() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.Float64PtrOutput { return v.X }).(pulumi.Float64PtrOutput)
}

// y in pixel
func (o GatewayOutput) Y() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Gateway) pulumi.Float64PtrOutput { return v.Y }).(pulumi.Float64PtrOutput)
}

type GatewayArrayOutput struct{ *pulumi.OutputState }

func (GatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Gateway)(nil)).Elem()
}

func (o GatewayArrayOutput) ToGatewayArrayOutput() GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) ToGatewayArrayOutputWithContext(ctx context.Context) GatewayArrayOutput {
	return o
}

func (o GatewayArrayOutput) Index(i pulumi.IntInput) GatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].([]*Gateway)[vs[1].(int)]
	}).(GatewayOutput)
}

type GatewayMapOutput struct{ *pulumi.OutputState }

func (GatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Gateway)(nil)).Elem()
}

func (o GatewayMapOutput) ToGatewayMapOutput() GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) ToGatewayMapOutputWithContext(ctx context.Context) GatewayMapOutput {
	return o
}

func (o GatewayMapOutput) MapIndex(k pulumi.StringInput) GatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Gateway {
		return vs[0].(map[string]*Gateway)[vs[1].(string)]
	}).(GatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayInput)(nil)).Elem(), &Gateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayArrayInput)(nil)).Elem(), GatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayMapInput)(nil)).Elem(), GatewayMap{})
	pulumi.RegisterOutputType(GatewayOutput{})
	pulumi.RegisterOutputType(GatewayArrayOutput{})
	pulumi.RegisterOutputType(GatewayMapOutput{})
}
