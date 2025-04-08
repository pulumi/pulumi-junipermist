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

// This resource manages the Gateway Device Profiles (HUB Profiles).
//
// A HUB profile is a configuration profile that automates the creation of overlay networks and defines the attributes of a hub device in a network. It includes settings for wan interfaces, lan interfaces, dns servers, traffic steering preferences, application policies, and routing options. HUB profiles are used to create consistent configurations for hub devices and ensure efficient connectivity between hubs and spokes in a network.
//
// The Gateway Device Profile can be assigned to a gateway with the `org.DeviceprofileAssign` resource.
//
// ## Import
//
// Using `pulumi import`, import `mist_org_deviceprofile_gateway` with:
//
// Device Profile can be imported by specifying the org_id and the deviceprofile_id
//
// ```sh
// $ pulumi import junipermist:org/deviceprofileGateway:DeviceprofileGateway deviceprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type DeviceprofileGateway struct {
	pulumi.CustomResourceState

	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayOutput                 `pulumi:"additionalConfigCmds"`
	BgpConfig            DeviceprofileGatewayBgpConfigMapOutput   `pulumi:"bgpConfig"`
	DhcpdConfig          DeviceprofileGatewayDhcpdConfigPtrOutput `pulumi:"dhcpdConfig"`
	DnsOverride          pulumi.BoolOutput                        `pulumi:"dnsOverride"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayOutput `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayOutput `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8"), the destination Network name or a variable (e.g. "{{myvar}}")
	ExtraRoutes DeviceprofileGatewayExtraRoutesMapOutput `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64"), the destination Network name or a variable (e.g.
	// "{{myvar}}")
	ExtraRoutes6 DeviceprofileGatewayExtraRoutes6MapOutput `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles DeviceprofileGatewayIdpProfilesMapOutput `pulumi:"idpProfiles"`
	// Property key is the network name
	IpConfigs   DeviceprofileGatewayIpConfigsMapOutput `pulumi:"ipConfigs"`
	Name        pulumi.StringOutput                    `pulumi:"name"`
	Networks    DeviceprofileGatewayNetworkArrayOutput `pulumi:"networks"`
	NtpOverride pulumi.BoolOutput                      `pulumi:"ntpOverride"`
	// List of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayOutput `pulumi:"ntpServers"`
	// Out-of-band (vme/em0/fxp0) IP config
	OobIpConfig DeviceprofileGatewayOobIpConfigOutput `pulumi:"oobIpConfig"`
	OrgId       pulumi.StringOutput                   `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences DeviceprofileGatewayPathPreferencesMapOutput `pulumi:"pathPreferences"`
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig DeviceprofileGatewayPortConfigMapOutput `pulumi:"portConfig"`
	// Auto assigned if not set
	RouterId pulumi.StringPtrOutput `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies DeviceprofileGatewayRoutingPoliciesMapOutput `pulumi:"routingPolicies"`
	ServicePolicies DeviceprofileGatewayServicePolicyArrayOutput `pulumi:"servicePolicies"`
	// Property key is the tunnel name
	TunnelConfigs         DeviceprofileGatewayTunnelConfigsMapOutput         `pulumi:"tunnelConfigs"`
	TunnelProviderOptions DeviceprofileGatewayTunnelProviderOptionsPtrOutput `pulumi:"tunnelProviderOptions"`
	// Device Type. enum: `gateway`
	Type      pulumi.StringOutput                    `pulumi:"type"`
	VrfConfig DeviceprofileGatewayVrfConfigPtrOutput `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances DeviceprofileGatewayVrfInstancesMapOutput `pulumi:"vrfInstances"`
}

// NewDeviceprofileGateway registers a new resource with the given unique name, arguments, and options.
func NewDeviceprofileGateway(ctx *pulumi.Context,
	name string, args *DeviceprofileGatewayArgs, opts ...pulumi.ResourceOption) (*DeviceprofileGateway, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DeviceprofileGateway
	err := ctx.RegisterResource("junipermist:org/deviceprofileGateway:DeviceprofileGateway", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDeviceprofileGateway gets an existing DeviceprofileGateway resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDeviceprofileGateway(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DeviceprofileGatewayState, opts ...pulumi.ResourceOption) (*DeviceprofileGateway, error) {
	var resource DeviceprofileGateway
	err := ctx.ReadResource("junipermist:org/deviceprofileGateway:DeviceprofileGateway", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DeviceprofileGateway resources.
type deviceprofileGatewayState struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds []string                                 `pulumi:"additionalConfigCmds"`
	BgpConfig            map[string]DeviceprofileGatewayBgpConfig `pulumi:"bgpConfig"`
	DhcpdConfig          *DeviceprofileGatewayDhcpdConfig         `pulumi:"dhcpdConfig"`
	DnsOverride          *bool                                    `pulumi:"dnsOverride"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8"), the destination Network name or a variable (e.g. "{{myvar}}")
	ExtraRoutes map[string]DeviceprofileGatewayExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64"), the destination Network name or a variable (e.g.
	// "{{myvar}}")
	ExtraRoutes6 map[string]DeviceprofileGatewayExtraRoutes6 `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles map[string]DeviceprofileGatewayIdpProfiles `pulumi:"idpProfiles"`
	// Property key is the network name
	IpConfigs   map[string]DeviceprofileGatewayIpConfigs `pulumi:"ipConfigs"`
	Name        *string                                  `pulumi:"name"`
	Networks    []DeviceprofileGatewayNetwork            `pulumi:"networks"`
	NtpOverride *bool                                    `pulumi:"ntpOverride"`
	// List of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers []string `pulumi:"ntpServers"`
	// Out-of-band (vme/em0/fxp0) IP config
	OobIpConfig *DeviceprofileGatewayOobIpConfig `pulumi:"oobIpConfig"`
	OrgId       *string                          `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences map[string]DeviceprofileGatewayPathPreferences `pulumi:"pathPreferences"`
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig map[string]DeviceprofileGatewayPortConfig `pulumi:"portConfig"`
	// Auto assigned if not set
	RouterId *string `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies map[string]DeviceprofileGatewayRoutingPolicies `pulumi:"routingPolicies"`
	ServicePolicies []DeviceprofileGatewayServicePolicy            `pulumi:"servicePolicies"`
	// Property key is the tunnel name
	TunnelConfigs         map[string]DeviceprofileGatewayTunnelConfigs `pulumi:"tunnelConfigs"`
	TunnelProviderOptions *DeviceprofileGatewayTunnelProviderOptions   `pulumi:"tunnelProviderOptions"`
	// Device Type. enum: `gateway`
	Type      *string                        `pulumi:"type"`
	VrfConfig *DeviceprofileGatewayVrfConfig `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]DeviceprofileGatewayVrfInstances `pulumi:"vrfInstances"`
}

type DeviceprofileGatewayState struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	BgpConfig            DeviceprofileGatewayBgpConfigMapInput
	DhcpdConfig          DeviceprofileGatewayDhcpdConfigPtrInput
	DnsOverride          pulumi.BoolPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	// Property key is the destination CIDR (e.g. "10.0.0.0/8"), the destination Network name or a variable (e.g. "{{myvar}}")
	ExtraRoutes DeviceprofileGatewayExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64"), the destination Network name or a variable (e.g.
	// "{{myvar}}")
	ExtraRoutes6 DeviceprofileGatewayExtraRoutes6MapInput
	// Property key is the profile name
	IdpProfiles DeviceprofileGatewayIdpProfilesMapInput
	// Property key is the network name
	IpConfigs   DeviceprofileGatewayIpConfigsMapInput
	Name        pulumi.StringPtrInput
	Networks    DeviceprofileGatewayNetworkArrayInput
	NtpOverride pulumi.BoolPtrInput
	// List of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayInput
	// Out-of-band (vme/em0/fxp0) IP config
	OobIpConfig DeviceprofileGatewayOobIpConfigPtrInput
	OrgId       pulumi.StringPtrInput
	// Property key is the path name
	PathPreferences DeviceprofileGatewayPathPreferencesMapInput
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig DeviceprofileGatewayPortConfigMapInput
	// Auto assigned if not set
	RouterId pulumi.StringPtrInput
	// Property key is the routing policy name
	RoutingPolicies DeviceprofileGatewayRoutingPoliciesMapInput
	ServicePolicies DeviceprofileGatewayServicePolicyArrayInput
	// Property key is the tunnel name
	TunnelConfigs         DeviceprofileGatewayTunnelConfigsMapInput
	TunnelProviderOptions DeviceprofileGatewayTunnelProviderOptionsPtrInput
	// Device Type. enum: `gateway`
	Type      pulumi.StringPtrInput
	VrfConfig DeviceprofileGatewayVrfConfigPtrInput
	// Property key is the network name
	VrfInstances DeviceprofileGatewayVrfInstancesMapInput
}

func (DeviceprofileGatewayState) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceprofileGatewayState)(nil)).Elem()
}

type deviceprofileGatewayArgs struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds []string                                 `pulumi:"additionalConfigCmds"`
	BgpConfig            map[string]DeviceprofileGatewayBgpConfig `pulumi:"bgpConfig"`
	DhcpdConfig          *DeviceprofileGatewayDhcpdConfig         `pulumi:"dhcpdConfig"`
	DnsOverride          *bool                                    `pulumi:"dnsOverride"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers []string `pulumi:"dnsServers"`
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes []string `pulumi:"dnsSuffixes"`
	// Property key is the destination CIDR (e.g. "10.0.0.0/8"), the destination Network name or a variable (e.g. "{{myvar}}")
	ExtraRoutes map[string]DeviceprofileGatewayExtraRoutes `pulumi:"extraRoutes"`
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64"), the destination Network name or a variable (e.g.
	// "{{myvar}}")
	ExtraRoutes6 map[string]DeviceprofileGatewayExtraRoutes6 `pulumi:"extraRoutes6"`
	// Property key is the profile name
	IdpProfiles map[string]DeviceprofileGatewayIdpProfiles `pulumi:"idpProfiles"`
	// Property key is the network name
	IpConfigs   map[string]DeviceprofileGatewayIpConfigs `pulumi:"ipConfigs"`
	Name        *string                                  `pulumi:"name"`
	Networks    []DeviceprofileGatewayNetwork            `pulumi:"networks"`
	NtpOverride *bool                                    `pulumi:"ntpOverride"`
	// List of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers []string `pulumi:"ntpServers"`
	// Out-of-band (vme/em0/fxp0) IP config
	OobIpConfig *DeviceprofileGatewayOobIpConfig `pulumi:"oobIpConfig"`
	OrgId       string                           `pulumi:"orgId"`
	// Property key is the path name
	PathPreferences map[string]DeviceprofileGatewayPathPreferences `pulumi:"pathPreferences"`
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig map[string]DeviceprofileGatewayPortConfig `pulumi:"portConfig"`
	// Auto assigned if not set
	RouterId *string `pulumi:"routerId"`
	// Property key is the routing policy name
	RoutingPolicies map[string]DeviceprofileGatewayRoutingPolicies `pulumi:"routingPolicies"`
	ServicePolicies []DeviceprofileGatewayServicePolicy            `pulumi:"servicePolicies"`
	// Property key is the tunnel name
	TunnelConfigs         map[string]DeviceprofileGatewayTunnelConfigs `pulumi:"tunnelConfigs"`
	TunnelProviderOptions *DeviceprofileGatewayTunnelProviderOptions   `pulumi:"tunnelProviderOptions"`
	VrfConfig             *DeviceprofileGatewayVrfConfig               `pulumi:"vrfConfig"`
	// Property key is the network name
	VrfInstances map[string]DeviceprofileGatewayVrfInstances `pulumi:"vrfInstances"`
}

// The set of arguments for constructing a DeviceprofileGateway resource.
type DeviceprofileGatewayArgs struct {
	// additional CLI commands to append to the generated Junos config. **Note**: no check is done
	AdditionalConfigCmds pulumi.StringArrayInput
	BgpConfig            DeviceprofileGatewayBgpConfigMapInput
	DhcpdConfig          DeviceprofileGatewayDhcpdConfigPtrInput
	DnsOverride          pulumi.BoolPtrInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsServers pulumi.StringArrayInput
	// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
	DnsSuffixes pulumi.StringArrayInput
	// Property key is the destination CIDR (e.g. "10.0.0.0/8"), the destination Network name or a variable (e.g. "{{myvar}}")
	ExtraRoutes DeviceprofileGatewayExtraRoutesMapInput
	// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64"), the destination Network name or a variable (e.g.
	// "{{myvar}}")
	ExtraRoutes6 DeviceprofileGatewayExtraRoutes6MapInput
	// Property key is the profile name
	IdpProfiles DeviceprofileGatewayIdpProfilesMapInput
	// Property key is the network name
	IpConfigs   DeviceprofileGatewayIpConfigsMapInput
	Name        pulumi.StringPtrInput
	Networks    DeviceprofileGatewayNetworkArrayInput
	NtpOverride pulumi.BoolPtrInput
	// List of NTP servers specific to this device. By default, those in Site Settings will be used
	NtpServers pulumi.StringArrayInput
	// Out-of-band (vme/em0/fxp0) IP config
	OobIpConfig DeviceprofileGatewayOobIpConfigPtrInput
	OrgId       pulumi.StringInput
	// Property key is the path name
	PathPreferences DeviceprofileGatewayPathPreferencesMapInput
	// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
	PortConfig DeviceprofileGatewayPortConfigMapInput
	// Auto assigned if not set
	RouterId pulumi.StringPtrInput
	// Property key is the routing policy name
	RoutingPolicies DeviceprofileGatewayRoutingPoliciesMapInput
	ServicePolicies DeviceprofileGatewayServicePolicyArrayInput
	// Property key is the tunnel name
	TunnelConfigs         DeviceprofileGatewayTunnelConfigsMapInput
	TunnelProviderOptions DeviceprofileGatewayTunnelProviderOptionsPtrInput
	VrfConfig             DeviceprofileGatewayVrfConfigPtrInput
	// Property key is the network name
	VrfInstances DeviceprofileGatewayVrfInstancesMapInput
}

func (DeviceprofileGatewayArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*deviceprofileGatewayArgs)(nil)).Elem()
}

type DeviceprofileGatewayInput interface {
	pulumi.Input

	ToDeviceprofileGatewayOutput() DeviceprofileGatewayOutput
	ToDeviceprofileGatewayOutputWithContext(ctx context.Context) DeviceprofileGatewayOutput
}

func (*DeviceprofileGateway) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceprofileGateway)(nil)).Elem()
}

func (i *DeviceprofileGateway) ToDeviceprofileGatewayOutput() DeviceprofileGatewayOutput {
	return i.ToDeviceprofileGatewayOutputWithContext(context.Background())
}

func (i *DeviceprofileGateway) ToDeviceprofileGatewayOutputWithContext(ctx context.Context) DeviceprofileGatewayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileGatewayOutput)
}

// DeviceprofileGatewayArrayInput is an input type that accepts DeviceprofileGatewayArray and DeviceprofileGatewayArrayOutput values.
// You can construct a concrete instance of `DeviceprofileGatewayArrayInput` via:
//
//	DeviceprofileGatewayArray{ DeviceprofileGatewayArgs{...} }
type DeviceprofileGatewayArrayInput interface {
	pulumi.Input

	ToDeviceprofileGatewayArrayOutput() DeviceprofileGatewayArrayOutput
	ToDeviceprofileGatewayArrayOutputWithContext(context.Context) DeviceprofileGatewayArrayOutput
}

type DeviceprofileGatewayArray []DeviceprofileGatewayInput

func (DeviceprofileGatewayArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceprofileGateway)(nil)).Elem()
}

func (i DeviceprofileGatewayArray) ToDeviceprofileGatewayArrayOutput() DeviceprofileGatewayArrayOutput {
	return i.ToDeviceprofileGatewayArrayOutputWithContext(context.Background())
}

func (i DeviceprofileGatewayArray) ToDeviceprofileGatewayArrayOutputWithContext(ctx context.Context) DeviceprofileGatewayArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileGatewayArrayOutput)
}

// DeviceprofileGatewayMapInput is an input type that accepts DeviceprofileGatewayMap and DeviceprofileGatewayMapOutput values.
// You can construct a concrete instance of `DeviceprofileGatewayMapInput` via:
//
//	DeviceprofileGatewayMap{ "key": DeviceprofileGatewayArgs{...} }
type DeviceprofileGatewayMapInput interface {
	pulumi.Input

	ToDeviceprofileGatewayMapOutput() DeviceprofileGatewayMapOutput
	ToDeviceprofileGatewayMapOutputWithContext(context.Context) DeviceprofileGatewayMapOutput
}

type DeviceprofileGatewayMap map[string]DeviceprofileGatewayInput

func (DeviceprofileGatewayMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceprofileGateway)(nil)).Elem()
}

func (i DeviceprofileGatewayMap) ToDeviceprofileGatewayMapOutput() DeviceprofileGatewayMapOutput {
	return i.ToDeviceprofileGatewayMapOutputWithContext(context.Background())
}

func (i DeviceprofileGatewayMap) ToDeviceprofileGatewayMapOutputWithContext(ctx context.Context) DeviceprofileGatewayMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DeviceprofileGatewayMapOutput)
}

type DeviceprofileGatewayOutput struct{ *pulumi.OutputState }

func (DeviceprofileGatewayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DeviceprofileGateway)(nil)).Elem()
}

func (o DeviceprofileGatewayOutput) ToDeviceprofileGatewayOutput() DeviceprofileGatewayOutput {
	return o
}

func (o DeviceprofileGatewayOutput) ToDeviceprofileGatewayOutputWithContext(ctx context.Context) DeviceprofileGatewayOutput {
	return o
}

// additional CLI commands to append to the generated Junos config. **Note**: no check is done
func (o DeviceprofileGatewayOutput) AdditionalConfigCmds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringArrayOutput { return v.AdditionalConfigCmds }).(pulumi.StringArrayOutput)
}

func (o DeviceprofileGatewayOutput) BgpConfig() DeviceprofileGatewayBgpConfigMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayBgpConfigMapOutput { return v.BgpConfig }).(DeviceprofileGatewayBgpConfigMapOutput)
}

func (o DeviceprofileGatewayOutput) DhcpdConfig() DeviceprofileGatewayDhcpdConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayDhcpdConfigPtrOutput { return v.DhcpdConfig }).(DeviceprofileGatewayDhcpdConfigPtrOutput)
}

func (o DeviceprofileGatewayOutput) DnsOverride() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.BoolOutput { return v.DnsOverride }).(pulumi.BoolOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o DeviceprofileGatewayOutput) DnsServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringArrayOutput { return v.DnsServers }).(pulumi.StringArrayOutput)
}

// Global dns settings. To keep compatibility, dns settings in `ipConfig` and `oobIpConfig` will overwrite this setting
func (o DeviceprofileGatewayOutput) DnsSuffixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringArrayOutput { return v.DnsSuffixes }).(pulumi.StringArrayOutput)
}

// Property key is the destination CIDR (e.g. "10.0.0.0/8"), the destination Network name or a variable (e.g. "{{myvar}}")
func (o DeviceprofileGatewayOutput) ExtraRoutes() DeviceprofileGatewayExtraRoutesMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayExtraRoutesMapOutput { return v.ExtraRoutes }).(DeviceprofileGatewayExtraRoutesMapOutput)
}

// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64"), the destination Network name or a variable (e.g.
// "{{myvar}}")
func (o DeviceprofileGatewayOutput) ExtraRoutes6() DeviceprofileGatewayExtraRoutes6MapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayExtraRoutes6MapOutput { return v.ExtraRoutes6 }).(DeviceprofileGatewayExtraRoutes6MapOutput)
}

// Property key is the profile name
func (o DeviceprofileGatewayOutput) IdpProfiles() DeviceprofileGatewayIdpProfilesMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayIdpProfilesMapOutput { return v.IdpProfiles }).(DeviceprofileGatewayIdpProfilesMapOutput)
}

// Property key is the network name
func (o DeviceprofileGatewayOutput) IpConfigs() DeviceprofileGatewayIpConfigsMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayIpConfigsMapOutput { return v.IpConfigs }).(DeviceprofileGatewayIpConfigsMapOutput)
}

func (o DeviceprofileGatewayOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o DeviceprofileGatewayOutput) Networks() DeviceprofileGatewayNetworkArrayOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayNetworkArrayOutput { return v.Networks }).(DeviceprofileGatewayNetworkArrayOutput)
}

func (o DeviceprofileGatewayOutput) NtpOverride() pulumi.BoolOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.BoolOutput { return v.NtpOverride }).(pulumi.BoolOutput)
}

// List of NTP servers specific to this device. By default, those in Site Settings will be used
func (o DeviceprofileGatewayOutput) NtpServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringArrayOutput { return v.NtpServers }).(pulumi.StringArrayOutput)
}

// Out-of-band (vme/em0/fxp0) IP config
func (o DeviceprofileGatewayOutput) OobIpConfig() DeviceprofileGatewayOobIpConfigOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayOobIpConfigOutput { return v.OobIpConfig }).(DeviceprofileGatewayOobIpConfigOutput)
}

func (o DeviceprofileGatewayOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// Property key is the path name
func (o DeviceprofileGatewayOutput) PathPreferences() DeviceprofileGatewayPathPreferencesMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayPathPreferencesMapOutput { return v.PathPreferences }).(DeviceprofileGatewayPathPreferencesMapOutput)
}

// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
func (o DeviceprofileGatewayOutput) PortConfig() DeviceprofileGatewayPortConfigMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayPortConfigMapOutput { return v.PortConfig }).(DeviceprofileGatewayPortConfigMapOutput)
}

// Auto assigned if not set
func (o DeviceprofileGatewayOutput) RouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringPtrOutput { return v.RouterId }).(pulumi.StringPtrOutput)
}

// Property key is the routing policy name
func (o DeviceprofileGatewayOutput) RoutingPolicies() DeviceprofileGatewayRoutingPoliciesMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayRoutingPoliciesMapOutput { return v.RoutingPolicies }).(DeviceprofileGatewayRoutingPoliciesMapOutput)
}

func (o DeviceprofileGatewayOutput) ServicePolicies() DeviceprofileGatewayServicePolicyArrayOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayServicePolicyArrayOutput { return v.ServicePolicies }).(DeviceprofileGatewayServicePolicyArrayOutput)
}

// Property key is the tunnel name
func (o DeviceprofileGatewayOutput) TunnelConfigs() DeviceprofileGatewayTunnelConfigsMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayTunnelConfigsMapOutput { return v.TunnelConfigs }).(DeviceprofileGatewayTunnelConfigsMapOutput)
}

func (o DeviceprofileGatewayOutput) TunnelProviderOptions() DeviceprofileGatewayTunnelProviderOptionsPtrOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayTunnelProviderOptionsPtrOutput {
		return v.TunnelProviderOptions
	}).(DeviceprofileGatewayTunnelProviderOptionsPtrOutput)
}

// Device Type. enum: `gateway`
func (o DeviceprofileGatewayOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o DeviceprofileGatewayOutput) VrfConfig() DeviceprofileGatewayVrfConfigPtrOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayVrfConfigPtrOutput { return v.VrfConfig }).(DeviceprofileGatewayVrfConfigPtrOutput)
}

// Property key is the network name
func (o DeviceprofileGatewayOutput) VrfInstances() DeviceprofileGatewayVrfInstancesMapOutput {
	return o.ApplyT(func(v *DeviceprofileGateway) DeviceprofileGatewayVrfInstancesMapOutput { return v.VrfInstances }).(DeviceprofileGatewayVrfInstancesMapOutput)
}

type DeviceprofileGatewayArrayOutput struct{ *pulumi.OutputState }

func (DeviceprofileGatewayArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DeviceprofileGateway)(nil)).Elem()
}

func (o DeviceprofileGatewayArrayOutput) ToDeviceprofileGatewayArrayOutput() DeviceprofileGatewayArrayOutput {
	return o
}

func (o DeviceprofileGatewayArrayOutput) ToDeviceprofileGatewayArrayOutputWithContext(ctx context.Context) DeviceprofileGatewayArrayOutput {
	return o
}

func (o DeviceprofileGatewayArrayOutput) Index(i pulumi.IntInput) DeviceprofileGatewayOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DeviceprofileGateway {
		return vs[0].([]*DeviceprofileGateway)[vs[1].(int)]
	}).(DeviceprofileGatewayOutput)
}

type DeviceprofileGatewayMapOutput struct{ *pulumi.OutputState }

func (DeviceprofileGatewayMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DeviceprofileGateway)(nil)).Elem()
}

func (o DeviceprofileGatewayMapOutput) ToDeviceprofileGatewayMapOutput() DeviceprofileGatewayMapOutput {
	return o
}

func (o DeviceprofileGatewayMapOutput) ToDeviceprofileGatewayMapOutputWithContext(ctx context.Context) DeviceprofileGatewayMapOutput {
	return o
}

func (o DeviceprofileGatewayMapOutput) MapIndex(k pulumi.StringInput) DeviceprofileGatewayOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DeviceprofileGateway {
		return vs[0].(map[string]*DeviceprofileGateway)[vs[1].(string)]
	}).(DeviceprofileGatewayOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileGatewayInput)(nil)).Elem(), &DeviceprofileGateway{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileGatewayArrayInput)(nil)).Elem(), DeviceprofileGatewayArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DeviceprofileGatewayMapInput)(nil)).Elem(), DeviceprofileGatewayMap{})
	pulumi.RegisterOutputType(DeviceprofileGatewayOutput{})
	pulumi.RegisterOutputType(DeviceprofileGatewayArrayOutput{})
	pulumi.RegisterOutputType(DeviceprofileGatewayMapOutput{})
}
