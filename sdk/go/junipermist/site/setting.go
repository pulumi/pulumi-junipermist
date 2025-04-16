// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package site

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages the Site Settings.
//
// The Site Settings can be used to customize the Site configuration and assign Site Variables (Sites Variables can be reused in configuration templates)
//
// > When using the Mist APIs, all the switch settings defined at the site level are stored under the site settings with all the rest of the site configuration (`/api/v1/sites/{site_id}/setting` Mist API Endpoint). To simplify this resource, all the site level switches related settings are moved into the `site.Networktemplate` resource
//
// !> Only ONE `site.Setting` resource can be configured per site. If multiple ones are configured, only the last one defined we be successfully deployed to Mist
//
// ## Import
//
// Using `pulumi import`, import `mist_site_setting` with:
//
// Site Setting can be imported by specifying the site_id
//
// ```sh
// $ pulumi import junipermist:site/setting:Setting site_setting_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
// ```
type Setting struct {
	pulumi.CustomResourceState

	Analytic SettingAnalyticOutput `pulumi:"analytic"`
	// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
	// `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold pulumi.IntPtrOutput `pulumi:"apUpdownThreshold"`
	// Auto Upgrade Settings
	AutoUpgrade  SettingAutoUpgradeOutput `pulumi:"autoUpgrade"`
	BlacklistUrl pulumi.StringOutput      `pulumi:"blacklistUrl"`
	// BLE AP settings
	BleConfig SettingBleConfigPtrOutput `pulumi:"bleConfig"`
	// Whether to enable ap auto config revert
	ConfigAutoRevert pulumi.BoolOutput `pulumi:"configAutoRevert"`
	// Mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy SettingConfigPushPolicyPtrOutput `pulumi:"configPushPolicy"`
	// You can define some URLs that's critical to site operations the latency will be captured and considered for site health
	CriticalUrlMonitoring SettingCriticalUrlMonitoringPtrOutput `pulumi:"criticalUrlMonitoring"`
	// By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
	// type is desired, use the following
	DeviceUpdownThreshold pulumi.IntPtrOutput `pulumi:"deviceUpdownThreshold"`
	EnableUnii4           pulumi.BoolOutput   `pulumi:"enableUnii4"`
	// **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
	// ranges for the same day
	Engagement SettingEngagementOutput `pulumi:"engagement"`
	// Gateway Site settings
	GatewayMgmt SettingGatewayMgmtOutput `pulumi:"gatewayMgmt"`
	// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold pulumi.IntPtrOutput        `pulumi:"gatewayUpdownThreshold"`
	JuniperSrx             SettingJuniperSrxPtrOutput `pulumi:"juniperSrx"`
	// LED AP settings
	Led SettingLedOutput `pulumi:"led"`
	// Occupancy Analytics settings
	Occupancy SettingOccupancyOutput `pulumi:"occupancy"`
	// Whether to store the config on AP
	PersistConfigOnDevice pulumi.BoolOutput `pulumi:"persistConfigOnDevice"`
	// Proxy Configuration to talk to Mist
	Proxy SettingProxyPtrOutput `pulumi:"proxy"`
	// By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
	RemoveExistingConfigs pulumi.BoolPtrOutput `pulumi:"removeExistingConfigs"`
	// Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt pulumi.BoolPtrOutput `pulumi:"reportGatt"`
	// Rogue site settings
	Rogue SettingRogueOutput `pulumi:"rogue"`
	// Managed mobility
	Rtsa SettingRtsaOutput `pulumi:"rtsa"`
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountering over X failures
	SimpleAlert SettingSimpleAlertPtrOutput `pulumi:"simpleAlert"`
	SiteId      pulumi.StringOutput         `pulumi:"siteId"`
	Skyatp      SettingSkyatpPtrOutput      `pulumi:"skyatp"`
	SrxApp      SettingSrxAppPtrOutput      `pulumi:"srxApp"`
	// When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys pulumi.StringArrayOutput `pulumi:"sshKeys"`
	Ssr     SettingSsrOutput         `pulumi:"ssr"`
	// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold pulumi.IntPtrOutput        `pulumi:"switchUpdownThreshold"`
	SyntheticTest         SettingSyntheticTestOutput `pulumi:"syntheticTest"`
	// Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices pulumi.BoolPtrOutput `pulumi:"trackAnonymousDevices"`
	// AP Uplink port configuration
	UplinkPortConfig SettingUplinkPortConfigOutput `pulumi:"uplinkPortConfig"`
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapOutput `pulumi:"vars"`
	Vna  SettingVnaPtrOutput    `pulumi:"vna"`
	// Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
	VsInstance        SettingVsInstanceMapOutput `pulumi:"vsInstance"`
	WanVna            SettingWanVnaPtrOutput     `pulumi:"wanVna"`
	WatchedStationUrl pulumi.StringOutput        `pulumi:"watchedStationUrl"`
	WhitelistUrl      pulumi.StringOutput        `pulumi:"whitelistUrl"`
	// WIDS site settings
	Wids SettingWidsOutput `pulumi:"wids"`
	// Wi-Fi site settings
	Wifi     SettingWifiOutput        `pulumi:"wifi"`
	WiredVna SettingWiredVnaPtrOutput `pulumi:"wiredVna"`
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert SettingZoneOccupancyAlertOutput `pulumi:"zoneOccupancyAlert"`
}

// NewSetting registers a new resource with the given unique name, arguments, and options.
func NewSetting(ctx *pulumi.Context,
	name string, args *SettingArgs, opts ...pulumi.ResourceOption) (*Setting, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Setting
	err := ctx.RegisterResource("junipermist:site/setting:Setting", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSetting gets an existing Setting resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSetting(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SettingState, opts ...pulumi.ResourceOption) (*Setting, error) {
	var resource Setting
	err := ctx.ReadResource("junipermist:site/setting:Setting", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Setting resources.
type settingState struct {
	Analytic *SettingAnalytic `pulumi:"analytic"`
	// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
	// `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold *int `pulumi:"apUpdownThreshold"`
	// Auto Upgrade Settings
	AutoUpgrade  *SettingAutoUpgrade `pulumi:"autoUpgrade"`
	BlacklistUrl *string             `pulumi:"blacklistUrl"`
	// BLE AP settings
	BleConfig *SettingBleConfig `pulumi:"bleConfig"`
	// Whether to enable ap auto config revert
	ConfigAutoRevert *bool `pulumi:"configAutoRevert"`
	// Mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy *SettingConfigPushPolicy `pulumi:"configPushPolicy"`
	// You can define some URLs that's critical to site operations the latency will be captured and considered for site health
	CriticalUrlMonitoring *SettingCriticalUrlMonitoring `pulumi:"criticalUrlMonitoring"`
	// By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
	// type is desired, use the following
	DeviceUpdownThreshold *int  `pulumi:"deviceUpdownThreshold"`
	EnableUnii4           *bool `pulumi:"enableUnii4"`
	// **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
	// ranges for the same day
	Engagement *SettingEngagement `pulumi:"engagement"`
	// Gateway Site settings
	GatewayMgmt *SettingGatewayMgmt `pulumi:"gatewayMgmt"`
	// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold *int               `pulumi:"gatewayUpdownThreshold"`
	JuniperSrx             *SettingJuniperSrx `pulumi:"juniperSrx"`
	// LED AP settings
	Led *SettingLed `pulumi:"led"`
	// Occupancy Analytics settings
	Occupancy *SettingOccupancy `pulumi:"occupancy"`
	// Whether to store the config on AP
	PersistConfigOnDevice *bool `pulumi:"persistConfigOnDevice"`
	// Proxy Configuration to talk to Mist
	Proxy *SettingProxy `pulumi:"proxy"`
	// By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
	RemoveExistingConfigs *bool `pulumi:"removeExistingConfigs"`
	// Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt *bool `pulumi:"reportGatt"`
	// Rogue site settings
	Rogue *SettingRogue `pulumi:"rogue"`
	// Managed mobility
	Rtsa *SettingRtsa `pulumi:"rtsa"`
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountering over X failures
	SimpleAlert *SettingSimpleAlert `pulumi:"simpleAlert"`
	SiteId      *string             `pulumi:"siteId"`
	Skyatp      *SettingSkyatp      `pulumi:"skyatp"`
	SrxApp      *SettingSrxApp      `pulumi:"srxApp"`
	// When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys []string    `pulumi:"sshKeys"`
	Ssr     *SettingSsr `pulumi:"ssr"`
	// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold *int                  `pulumi:"switchUpdownThreshold"`
	SyntheticTest         *SettingSyntheticTest `pulumi:"syntheticTest"`
	// Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices *bool `pulumi:"trackAnonymousDevices"`
	// AP Uplink port configuration
	UplinkPortConfig *SettingUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
	Vna  *SettingVna       `pulumi:"vna"`
	// Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
	VsInstance        map[string]SettingVsInstance `pulumi:"vsInstance"`
	WanVna            *SettingWanVna               `pulumi:"wanVna"`
	WatchedStationUrl *string                      `pulumi:"watchedStationUrl"`
	WhitelistUrl      *string                      `pulumi:"whitelistUrl"`
	// WIDS site settings
	Wids *SettingWids `pulumi:"wids"`
	// Wi-Fi site settings
	Wifi     *SettingWifi     `pulumi:"wifi"`
	WiredVna *SettingWiredVna `pulumi:"wiredVna"`
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert *SettingZoneOccupancyAlert `pulumi:"zoneOccupancyAlert"`
}

type SettingState struct {
	Analytic SettingAnalyticPtrInput
	// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
	// `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold pulumi.IntPtrInput
	// Auto Upgrade Settings
	AutoUpgrade  SettingAutoUpgradePtrInput
	BlacklistUrl pulumi.StringPtrInput
	// BLE AP settings
	BleConfig SettingBleConfigPtrInput
	// Whether to enable ap auto config revert
	ConfigAutoRevert pulumi.BoolPtrInput
	// Mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy SettingConfigPushPolicyPtrInput
	// You can define some URLs that's critical to site operations the latency will be captured and considered for site health
	CriticalUrlMonitoring SettingCriticalUrlMonitoringPtrInput
	// By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
	// type is desired, use the following
	DeviceUpdownThreshold pulumi.IntPtrInput
	EnableUnii4           pulumi.BoolPtrInput
	// **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
	// ranges for the same day
	Engagement SettingEngagementPtrInput
	// Gateway Site settings
	GatewayMgmt SettingGatewayMgmtPtrInput
	// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold pulumi.IntPtrInput
	JuniperSrx             SettingJuniperSrxPtrInput
	// LED AP settings
	Led SettingLedPtrInput
	// Occupancy Analytics settings
	Occupancy SettingOccupancyPtrInput
	// Whether to store the config on AP
	PersistConfigOnDevice pulumi.BoolPtrInput
	// Proxy Configuration to talk to Mist
	Proxy SettingProxyPtrInput
	// By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
	RemoveExistingConfigs pulumi.BoolPtrInput
	// Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt pulumi.BoolPtrInput
	// Rogue site settings
	Rogue SettingRoguePtrInput
	// Managed mobility
	Rtsa SettingRtsaPtrInput
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountering over X failures
	SimpleAlert SettingSimpleAlertPtrInput
	SiteId      pulumi.StringPtrInput
	Skyatp      SettingSkyatpPtrInput
	SrxApp      SettingSrxAppPtrInput
	// When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys pulumi.StringArrayInput
	Ssr     SettingSsrPtrInput
	// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold pulumi.IntPtrInput
	SyntheticTest         SettingSyntheticTestPtrInput
	// Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices pulumi.BoolPtrInput
	// AP Uplink port configuration
	UplinkPortConfig SettingUplinkPortConfigPtrInput
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
	Vna  SettingVnaPtrInput
	// Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
	VsInstance        SettingVsInstanceMapInput
	WanVna            SettingWanVnaPtrInput
	WatchedStationUrl pulumi.StringPtrInput
	WhitelistUrl      pulumi.StringPtrInput
	// WIDS site settings
	Wids SettingWidsPtrInput
	// Wi-Fi site settings
	Wifi     SettingWifiPtrInput
	WiredVna SettingWiredVnaPtrInput
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert SettingZoneOccupancyAlertPtrInput
}

func (SettingState) ElementType() reflect.Type {
	return reflect.TypeOf((*settingState)(nil)).Elem()
}

type settingArgs struct {
	Analytic *SettingAnalytic `pulumi:"analytic"`
	// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
	// `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold *int `pulumi:"apUpdownThreshold"`
	// Auto Upgrade Settings
	AutoUpgrade *SettingAutoUpgrade `pulumi:"autoUpgrade"`
	// BLE AP settings
	BleConfig *SettingBleConfig `pulumi:"bleConfig"`
	// Whether to enable ap auto config revert
	ConfigAutoRevert *bool `pulumi:"configAutoRevert"`
	// Mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy *SettingConfigPushPolicy `pulumi:"configPushPolicy"`
	// You can define some URLs that's critical to site operations the latency will be captured and considered for site health
	CriticalUrlMonitoring *SettingCriticalUrlMonitoring `pulumi:"criticalUrlMonitoring"`
	// By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
	// type is desired, use the following
	DeviceUpdownThreshold *int  `pulumi:"deviceUpdownThreshold"`
	EnableUnii4           *bool `pulumi:"enableUnii4"`
	// **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
	// ranges for the same day
	Engagement *SettingEngagement `pulumi:"engagement"`
	// Gateway Site settings
	GatewayMgmt *SettingGatewayMgmt `pulumi:"gatewayMgmt"`
	// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold *int               `pulumi:"gatewayUpdownThreshold"`
	JuniperSrx             *SettingJuniperSrx `pulumi:"juniperSrx"`
	// LED AP settings
	Led *SettingLed `pulumi:"led"`
	// Occupancy Analytics settings
	Occupancy *SettingOccupancy `pulumi:"occupancy"`
	// Whether to store the config on AP
	PersistConfigOnDevice *bool `pulumi:"persistConfigOnDevice"`
	// Proxy Configuration to talk to Mist
	Proxy *SettingProxy `pulumi:"proxy"`
	// By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
	RemoveExistingConfigs *bool `pulumi:"removeExistingConfigs"`
	// Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt *bool `pulumi:"reportGatt"`
	// Rogue site settings
	Rogue *SettingRogue `pulumi:"rogue"`
	// Managed mobility
	Rtsa *SettingRtsa `pulumi:"rtsa"`
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountering over X failures
	SimpleAlert *SettingSimpleAlert `pulumi:"simpleAlert"`
	SiteId      string              `pulumi:"siteId"`
	Skyatp      *SettingSkyatp      `pulumi:"skyatp"`
	SrxApp      *SettingSrxApp      `pulumi:"srxApp"`
	// When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys []string    `pulumi:"sshKeys"`
	Ssr     *SettingSsr `pulumi:"ssr"`
	// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold *int                  `pulumi:"switchUpdownThreshold"`
	SyntheticTest         *SettingSyntheticTest `pulumi:"syntheticTest"`
	// Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices *bool `pulumi:"trackAnonymousDevices"`
	// AP Uplink port configuration
	UplinkPortConfig *SettingUplinkPortConfig `pulumi:"uplinkPortConfig"`
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars map[string]string `pulumi:"vars"`
	Vna  *SettingVna       `pulumi:"vna"`
	// Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
	VsInstance map[string]SettingVsInstance `pulumi:"vsInstance"`
	WanVna     *SettingWanVna               `pulumi:"wanVna"`
	// WIDS site settings
	Wids *SettingWids `pulumi:"wids"`
	// Wi-Fi site settings
	Wifi     *SettingWifi     `pulumi:"wifi"`
	WiredVna *SettingWiredVna `pulumi:"wiredVna"`
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert *SettingZoneOccupancyAlert `pulumi:"zoneOccupancyAlert"`
}

// The set of arguments for constructing a Setting resource.
type SettingArgs struct {
	Analytic SettingAnalyticPtrInput
	// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
	// `deviceUpdownThreshold` is ignored.
	ApUpdownThreshold pulumi.IntPtrInput
	// Auto Upgrade Settings
	AutoUpgrade SettingAutoUpgradePtrInput
	// BLE AP settings
	BleConfig SettingBleConfigPtrInput
	// Whether to enable ap auto config revert
	ConfigAutoRevert pulumi.BoolPtrInput
	// Mist also uses some heuristic rules to prevent destructive configs from being pushed
	ConfigPushPolicy SettingConfigPushPolicyPtrInput
	// You can define some URLs that's critical to site operations the latency will be captured and considered for site health
	CriticalUrlMonitoring SettingCriticalUrlMonitoringPtrInput
	// By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
	// type is desired, use the following
	DeviceUpdownThreshold pulumi.IntPtrInput
	EnableUnii4           pulumi.BoolPtrInput
	// **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
	// ranges for the same day
	Engagement SettingEngagementPtrInput
	// Gateway Site settings
	GatewayMgmt SettingGatewayMgmtPtrInput
	// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
	// `deviceUpdownThreshold` is ignored.
	GatewayUpdownThreshold pulumi.IntPtrInput
	JuniperSrx             SettingJuniperSrxPtrInput
	// LED AP settings
	Led SettingLedPtrInput
	// Occupancy Analytics settings
	Occupancy SettingOccupancyPtrInput
	// Whether to store the config on AP
	PersistConfigOnDevice pulumi.BoolPtrInput
	// Proxy Configuration to talk to Mist
	Proxy SettingProxyPtrInput
	// By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
	RemoveExistingConfigs pulumi.BoolPtrInput
	// Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
	// serial number, battery %, temperature, humidity)
	ReportGatt pulumi.BoolPtrInput
	// Rogue site settings
	Rogue SettingRoguePtrInput
	// Managed mobility
	Rtsa SettingRtsaPtrInput
	// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
	// window, there are more than Y distinct client encountering over X failures
	SimpleAlert SettingSimpleAlertPtrInput
	SiteId      pulumi.StringInput
	Skyatp      SettingSkyatpPtrInput
	SrxApp      SettingSrxAppPtrInput
	// When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
	// Org:Setting)
	SshKeys pulumi.StringArrayInput
	Ssr     SettingSsrPtrInput
	// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
	// `deviceUpdownThreshold` is ignored.
	SwitchUpdownThreshold pulumi.IntPtrInput
	SyntheticTest         SettingSyntheticTestPtrInput
	// Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
	TrackAnonymousDevices pulumi.BoolPtrInput
	// AP Uplink port configuration
	UplinkPortConfig SettingUplinkPortConfigPtrInput
	// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
	Vars pulumi.StringMapInput
	Vna  SettingVnaPtrInput
	// Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
	VsInstance SettingVsInstanceMapInput
	WanVna     SettingWanVnaPtrInput
	// WIDS site settings
	Wids SettingWidsPtrInput
	// Wi-Fi site settings
	Wifi     SettingWifiPtrInput
	WiredVna SettingWiredVnaPtrInput
	// Zone Occupancy alert site settings
	ZoneOccupancyAlert SettingZoneOccupancyAlertPtrInput
}

func (SettingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*settingArgs)(nil)).Elem()
}

type SettingInput interface {
	pulumi.Input

	ToSettingOutput() SettingOutput
	ToSettingOutputWithContext(ctx context.Context) SettingOutput
}

func (*Setting) ElementType() reflect.Type {
	return reflect.TypeOf((**Setting)(nil)).Elem()
}

func (i *Setting) ToSettingOutput() SettingOutput {
	return i.ToSettingOutputWithContext(context.Background())
}

func (i *Setting) ToSettingOutputWithContext(ctx context.Context) SettingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SettingOutput)
}

// SettingArrayInput is an input type that accepts SettingArray and SettingArrayOutput values.
// You can construct a concrete instance of `SettingArrayInput` via:
//
//	SettingArray{ SettingArgs{...} }
type SettingArrayInput interface {
	pulumi.Input

	ToSettingArrayOutput() SettingArrayOutput
	ToSettingArrayOutputWithContext(context.Context) SettingArrayOutput
}

type SettingArray []SettingInput

func (SettingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Setting)(nil)).Elem()
}

func (i SettingArray) ToSettingArrayOutput() SettingArrayOutput {
	return i.ToSettingArrayOutputWithContext(context.Background())
}

func (i SettingArray) ToSettingArrayOutputWithContext(ctx context.Context) SettingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SettingArrayOutput)
}

// SettingMapInput is an input type that accepts SettingMap and SettingMapOutput values.
// You can construct a concrete instance of `SettingMapInput` via:
//
//	SettingMap{ "key": SettingArgs{...} }
type SettingMapInput interface {
	pulumi.Input

	ToSettingMapOutput() SettingMapOutput
	ToSettingMapOutputWithContext(context.Context) SettingMapOutput
}

type SettingMap map[string]SettingInput

func (SettingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Setting)(nil)).Elem()
}

func (i SettingMap) ToSettingMapOutput() SettingMapOutput {
	return i.ToSettingMapOutputWithContext(context.Background())
}

func (i SettingMap) ToSettingMapOutputWithContext(ctx context.Context) SettingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SettingMapOutput)
}

type SettingOutput struct{ *pulumi.OutputState }

func (SettingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Setting)(nil)).Elem()
}

func (o SettingOutput) ToSettingOutput() SettingOutput {
	return o
}

func (o SettingOutput) ToSettingOutputWithContext(ctx context.Context) SettingOutput {
	return o
}

func (o SettingOutput) Analytic() SettingAnalyticOutput {
	return o.ApplyT(func(v *Setting) SettingAnalyticOutput { return v.Analytic }).(SettingAnalyticOutput)
}

// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
// `deviceUpdownThreshold` is ignored.
func (o SettingOutput) ApUpdownThreshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntPtrOutput { return v.ApUpdownThreshold }).(pulumi.IntPtrOutput)
}

// Auto Upgrade Settings
func (o SettingOutput) AutoUpgrade() SettingAutoUpgradeOutput {
	return o.ApplyT(func(v *Setting) SettingAutoUpgradeOutput { return v.AutoUpgrade }).(SettingAutoUpgradeOutput)
}

func (o SettingOutput) BlacklistUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.BlacklistUrl }).(pulumi.StringOutput)
}

// BLE AP settings
func (o SettingOutput) BleConfig() SettingBleConfigPtrOutput {
	return o.ApplyT(func(v *Setting) SettingBleConfigPtrOutput { return v.BleConfig }).(SettingBleConfigPtrOutput)
}

// Whether to enable ap auto config revert
func (o SettingOutput) ConfigAutoRevert() pulumi.BoolOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolOutput { return v.ConfigAutoRevert }).(pulumi.BoolOutput)
}

// Mist also uses some heuristic rules to prevent destructive configs from being pushed
func (o SettingOutput) ConfigPushPolicy() SettingConfigPushPolicyPtrOutput {
	return o.ApplyT(func(v *Setting) SettingConfigPushPolicyPtrOutput { return v.ConfigPushPolicy }).(SettingConfigPushPolicyPtrOutput)
}

// You can define some URLs that's critical to site operations the latency will be captured and considered for site health
func (o SettingOutput) CriticalUrlMonitoring() SettingCriticalUrlMonitoringPtrOutput {
	return o.ApplyT(func(v *Setting) SettingCriticalUrlMonitoringPtrOutput { return v.CriticalUrlMonitoring }).(SettingCriticalUrlMonitoringPtrOutput)
}

// By default, device_updown_threshold, if set, will apply to all devices types if different values for specific device
// type is desired, use the following
func (o SettingOutput) DeviceUpdownThreshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntPtrOutput { return v.DeviceUpdownThreshold }).(pulumi.IntPtrOutput)
}

func (o SettingOutput) EnableUnii4() pulumi.BoolOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolOutput { return v.EnableUnii4 }).(pulumi.BoolOutput)
}

// **Note**: if hours does not exist, it's treated as everyday of the week, 00:00-23:59. Currently, we don't allow multiple
// ranges for the same day
func (o SettingOutput) Engagement() SettingEngagementOutput {
	return o.ApplyT(func(v *Setting) SettingEngagementOutput { return v.Engagement }).(SettingEngagementOutput)
}

// Gateway Site settings
func (o SettingOutput) GatewayMgmt() SettingGatewayMgmtOutput {
	return o.ApplyT(func(v *Setting) SettingGatewayMgmtOutput { return v.GatewayMgmt }).(SettingGatewayMgmtOutput)
}

// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
// `deviceUpdownThreshold` is ignored.
func (o SettingOutput) GatewayUpdownThreshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntPtrOutput { return v.GatewayUpdownThreshold }).(pulumi.IntPtrOutput)
}

func (o SettingOutput) JuniperSrx() SettingJuniperSrxPtrOutput {
	return o.ApplyT(func(v *Setting) SettingJuniperSrxPtrOutput { return v.JuniperSrx }).(SettingJuniperSrxPtrOutput)
}

// LED AP settings
func (o SettingOutput) Led() SettingLedOutput {
	return o.ApplyT(func(v *Setting) SettingLedOutput { return v.Led }).(SettingLedOutput)
}

// Occupancy Analytics settings
func (o SettingOutput) Occupancy() SettingOccupancyOutput {
	return o.ApplyT(func(v *Setting) SettingOccupancyOutput { return v.Occupancy }).(SettingOccupancyOutput)
}

// Whether to store the config on AP
func (o SettingOutput) PersistConfigOnDevice() pulumi.BoolOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolOutput { return v.PersistConfigOnDevice }).(pulumi.BoolOutput)
}

// Proxy Configuration to talk to Mist
func (o SettingOutput) Proxy() SettingProxyPtrOutput {
	return o.ApplyT(func(v *Setting) SettingProxyPtrOutput { return v.Proxy }).(SettingProxyPtrOutput)
}

// By default, when we configure a device, we only clean up config we generate. Remove existing configs if enabled
func (o SettingOutput) RemoveExistingConfigs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolPtrOutput { return v.RemoveExistingConfigs }).(pulumi.BoolPtrOutput)
}

// Whether AP should periodically connect to BLE devices and report GATT device info (device name, manufacturer name,
// serial number, battery %, temperature, humidity)
func (o SettingOutput) ReportGatt() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolPtrOutput { return v.ReportGatt }).(pulumi.BoolPtrOutput)
}

// Rogue site settings
func (o SettingOutput) Rogue() SettingRogueOutput {
	return o.ApplyT(func(v *Setting) SettingRogueOutput { return v.Rogue }).(SettingRogueOutput)
}

// Managed mobility
func (o SettingOutput) Rtsa() SettingRtsaOutput {
	return o.ApplyT(func(v *Setting) SettingRtsaOutput { return v.Rtsa }).(SettingRtsaOutput)
}

// Set of heuristic rules will be enabled when marvis subscription is not available. It triggers when, in a Z minute
// window, there are more than Y distinct client encountering over X failures
func (o SettingOutput) SimpleAlert() SettingSimpleAlertPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSimpleAlertPtrOutput { return v.SimpleAlert }).(SettingSimpleAlertPtrOutput)
}

func (o SettingOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

func (o SettingOutput) Skyatp() SettingSkyatpPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSkyatpPtrOutput { return v.Skyatp }).(SettingSkyatpPtrOutput)
}

func (o SettingOutput) SrxApp() SettingSrxAppPtrOutput {
	return o.ApplyT(func(v *Setting) SettingSrxAppPtrOutput { return v.SrxApp }).(SettingSrxAppPtrOutput)
}

// When limitSshAccess = true in Org Setting, list of SSH public keys provided by Mist Support to install onto APs (see
// Org:Setting)
func (o SettingOutput) SshKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringArrayOutput { return v.SshKeys }).(pulumi.StringArrayOutput)
}

func (o SettingOutput) Ssr() SettingSsrOutput {
	return o.ApplyT(func(v *Setting) SettingSsrOutput { return v.Ssr }).(SettingSsrOutput)
}

// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
// `deviceUpdownThreshold` is ignored.
func (o SettingOutput) SwitchUpdownThreshold() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Setting) pulumi.IntPtrOutput { return v.SwitchUpdownThreshold }).(pulumi.IntPtrOutput)
}

func (o SettingOutput) SyntheticTest() SettingSyntheticTestOutput {
	return o.ApplyT(func(v *Setting) SettingSyntheticTestOutput { return v.SyntheticTest }).(SettingSyntheticTestOutput)
}

// Whether to track anonymous BLE assets (requires ‘track_asset’ enabled)
func (o SettingOutput) TrackAnonymousDevices() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Setting) pulumi.BoolPtrOutput { return v.TrackAnonymousDevices }).(pulumi.BoolPtrOutput)
}

// AP Uplink port configuration
func (o SettingOutput) UplinkPortConfig() SettingUplinkPortConfigOutput {
	return o.ApplyT(func(v *Setting) SettingUplinkPortConfigOutput { return v.UplinkPortConfig }).(SettingUplinkPortConfigOutput)
}

// Dictionary of name->value, the vars can then be used in Wlans. This can overwrite those from Site Vars
func (o SettingOutput) Vars() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringMapOutput { return v.Vars }).(pulumi.StringMapOutput)
}

func (o SettingOutput) Vna() SettingVnaPtrOutput {
	return o.ApplyT(func(v *Setting) SettingVnaPtrOutput { return v.Vna }).(SettingVnaPtrOutput)
}

// Optional, for EX9200 only to segregate virtual-switches. Property key is the instance name
func (o SettingOutput) VsInstance() SettingVsInstanceMapOutput {
	return o.ApplyT(func(v *Setting) SettingVsInstanceMapOutput { return v.VsInstance }).(SettingVsInstanceMapOutput)
}

func (o SettingOutput) WanVna() SettingWanVnaPtrOutput {
	return o.ApplyT(func(v *Setting) SettingWanVnaPtrOutput { return v.WanVna }).(SettingWanVnaPtrOutput)
}

func (o SettingOutput) WatchedStationUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.WatchedStationUrl }).(pulumi.StringOutput)
}

func (o SettingOutput) WhitelistUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Setting) pulumi.StringOutput { return v.WhitelistUrl }).(pulumi.StringOutput)
}

// WIDS site settings
func (o SettingOutput) Wids() SettingWidsOutput {
	return o.ApplyT(func(v *Setting) SettingWidsOutput { return v.Wids }).(SettingWidsOutput)
}

// Wi-Fi site settings
func (o SettingOutput) Wifi() SettingWifiOutput {
	return o.ApplyT(func(v *Setting) SettingWifiOutput { return v.Wifi }).(SettingWifiOutput)
}

func (o SettingOutput) WiredVna() SettingWiredVnaPtrOutput {
	return o.ApplyT(func(v *Setting) SettingWiredVnaPtrOutput { return v.WiredVna }).(SettingWiredVnaPtrOutput)
}

// Zone Occupancy alert site settings
func (o SettingOutput) ZoneOccupancyAlert() SettingZoneOccupancyAlertOutput {
	return o.ApplyT(func(v *Setting) SettingZoneOccupancyAlertOutput { return v.ZoneOccupancyAlert }).(SettingZoneOccupancyAlertOutput)
}

type SettingArrayOutput struct{ *pulumi.OutputState }

func (SettingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Setting)(nil)).Elem()
}

func (o SettingArrayOutput) ToSettingArrayOutput() SettingArrayOutput {
	return o
}

func (o SettingArrayOutput) ToSettingArrayOutputWithContext(ctx context.Context) SettingArrayOutput {
	return o
}

func (o SettingArrayOutput) Index(i pulumi.IntInput) SettingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Setting {
		return vs[0].([]*Setting)[vs[1].(int)]
	}).(SettingOutput)
}

type SettingMapOutput struct{ *pulumi.OutputState }

func (SettingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Setting)(nil)).Elem()
}

func (o SettingMapOutput) ToSettingMapOutput() SettingMapOutput {
	return o
}

func (o SettingMapOutput) ToSettingMapOutputWithContext(ctx context.Context) SettingMapOutput {
	return o
}

func (o SettingMapOutput) MapIndex(k pulumi.StringInput) SettingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Setting {
		return vs[0].(map[string]*Setting)[vs[1].(string)]
	}).(SettingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SettingInput)(nil)).Elem(), &Setting{})
	pulumi.RegisterInputType(reflect.TypeOf((*SettingArrayInput)(nil)).Elem(), SettingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SettingMapInput)(nil)).Elem(), SettingMap{})
	pulumi.RegisterOutputType(SettingOutput{})
	pulumi.RegisterOutputType(SettingArrayOutput{})
	pulumi.RegisterOutputType(SettingMapOutput{})
}
