// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device
{
    /// <summary>
    /// This resource manages the Switch configuration.
    /// It can be used to define specific configuration at the device level or to override Org/Site Network template settings.
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_device_switch` with:
    /// 
    /// Switch Configuration can be imported by specifying the site_id and the device_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:device/switch:Switch switch_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:device/switch:Switch")]
    public partial class Switch : global::Pulumi.CustomResource
    {
        [Output("aclPolicies")]
        public Output<ImmutableArray<Outputs.SwitchAclPolicy>> AclPolicies { get; private set; } = null!;

        /// <summary>
        /// ACL Tags to identify traffic source or destination. Key name is the tag name
        /// </summary>
        [Output("aclTags")]
        public Output<ImmutableDictionary<string, Outputs.SwitchAclTags>?> AclTags { get; private set; } = null!;

        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        [Output("additionalConfigCmds")]
        public Output<ImmutableArray<string>> AdditionalConfigCmds { get; private set; } = null!;

        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        [Output("dhcpSnooping")]
        public Output<Outputs.SwitchDhcpSnooping?> DhcpSnooping { get; private set; } = null!;

        [Output("dhcpdConfig")]
        public Output<Outputs.SwitchDhcpdConfig?> DhcpdConfig { get; private set; } = null!;

        /// <summary>
        /// for a claimed switch, we control the configs by default. This option (disables the behavior)
        /// </summary>
        [Output("disableAutoConfig")]
        public Output<bool> DisableAutoConfig { get; private set; } = null!;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        [Output("dnsServers")]
        public Output<ImmutableArray<string>> DnsServers { get; private set; } = null!;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        [Output("dnsSuffixes")]
        public Output<ImmutableArray<string>> DnsSuffixes { get; private set; } = null!;

        /// <summary>
        /// EVPN Junos settings
        /// </summary>
        [Output("evpnConfig")]
        public Output<Outputs.SwitchEvpnConfig?> EvpnConfig { get; private set; } = null!;

        [Output("extraRoutes")]
        public Output<ImmutableDictionary<string, Outputs.SwitchExtraRoutes>?> ExtraRoutes { get; private set; } = null!;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        [Output("extraRoutes6")]
        public Output<ImmutableDictionary<string, Outputs.SwitchExtraRoutes6>?> ExtraRoutes6 { get; private set; } = null!;

        [Output("image1Url")]
        public Output<string> Image1Url { get; private set; } = null!;

        [Output("image2Url")]
        public Output<string> Image2Url { get; private set; } = null!;

        [Output("image3Url")]
        public Output<string> Image3Url { get; private set; } = null!;

        /// <summary>
        /// Junos IP Config
        /// </summary>
        [Output("ipConfig")]
        public Output<Outputs.SwitchIpConfig?> IpConfig { get; private set; } = null!;

        /// <summary>
        /// device MAC address
        /// </summary>
        [Output("mac")]
        public Output<string> Mac { get; private set; } = null!;

        /// <summary>
        /// for an adopted switch, we don’t overwrite their existing configs automatically
        /// </summary>
        [Output("managed")]
        public Output<bool> Managed { get; private set; } = null!;

        /// <summary>
        /// map where the device belongs to
        /// </summary>
        [Output("mapId")]
        public Output<string?> MapId { get; private set; } = null!;

        /// <summary>
        /// enable mist_nac to use radsec
        /// </summary>
        [Output("mistNac")]
        public Output<Outputs.SwitchMistNac?> MistNac { get; private set; } = null!;

        /// <summary>
        /// device Model
        /// </summary>
        [Output("model")]
        public Output<string> Model { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Property key is network name
        /// </summary>
        [Output("networks")]
        public Output<ImmutableDictionary<string, Outputs.SwitchNetworks>?> Networks { get; private set; } = null!;

        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// list of NTP servers specific to this device. By default, those in Site Settings will be used
        /// </summary>
        [Output("ntpServers")]
        public Output<ImmutableArray<string>> NtpServers { get; private set; } = null!;

        /// <summary>
        /// - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines, re1 mgmt IP has to be
        /// set separately (if desired): key parameter = `re1`
        /// </summary>
        [Output("oobIpConfig")]
        public Output<Outputs.SwitchOobIpConfig?> OobIpConfig { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Junos OSPF areas
        /// </summary>
        [Output("ospfAreas")]
        public Output<ImmutableDictionary<string, Outputs.SwitchOspfAreas>?> OspfAreas { get; private set; } = null!;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        [Output("otherIpConfigs")]
        public Output<ImmutableDictionary<string, Outputs.SwitchOtherIpConfigs>?> OtherIpConfigs { get; private set; } = null!;

        /// <summary>
        /// Property key is the port name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        [Output("portConfig")]
        public Output<ImmutableDictionary<string, Outputs.SwitchPortConfig>?> PortConfig { get; private set; } = null!;

        /// <summary>
        /// Property key is the port mirroring instance name (Maximum: 4) port_mirroring can be added under device/site settings. It
        /// takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        [Output("portMirroring")]
        public Output<ImmutableDictionary<string, Outputs.SwitchPortMirroring>?> PortMirroring { get; private set; } = null!;

        [Output("portUsages")]
        public Output<ImmutableDictionary<string, Outputs.SwitchPortUsages>?> PortUsages { get; private set; } = null!;

        /// <summary>
        /// Junos Radius config
        /// </summary>
        [Output("radiusConfig")]
        public Output<Outputs.SwitchRadiusConfig?> RadiusConfig { get; private set; } = null!;

        [Output("remoteSyslog")]
        public Output<Outputs.SwitchRemoteSyslog?> RemoteSyslog { get; private set; } = null!;

        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// used for OSPF / BGP / EVPN
        /// </summary>
        [Output("routerId")]
        public Output<string?> RouterId { get; private set; } = null!;

        /// <summary>
        /// device Serial
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;

        [Output("snmpConfig")]
        public Output<Outputs.SwitchSnmpConfig?> SnmpConfig { get; private set; } = null!;

        [Output("stpConfig")]
        public Output<Outputs.SwitchStpConfig?> StpConfig { get; private set; } = null!;

        /// <summary>
        /// Switch settings
        /// </summary>
        [Output("switchMgmt")]
        public Output<Outputs.SwitchSwitchMgmt?> SwitchMgmt { get; private set; } = null!;

        /// <summary>
        /// Device Type. enum: `switch`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// whether to use it for snmp / syslog / tacplus / radius
        /// </summary>
        [Output("useRouterIdAsSourceIp")]
        public Output<bool> UseRouterIdAsSourceIp { get; private set; } = null!;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        [Output("vars")]
        public Output<ImmutableDictionary<string, string>?> Vars { get; private set; } = null!;

        /// <summary>
        /// required for preprovisioned Virtual Chassis
        /// </summary>
        [Output("virtualChassis")]
        public Output<Outputs.SwitchVirtualChassis?> VirtualChassis { get; private set; } = null!;

        [Output("vrfConfig")]
        public Output<Outputs.SwitchVrfConfig?> VrfConfig { get; private set; } = null!;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        [Output("vrfInstances")]
        public Output<ImmutableDictionary<string, Outputs.SwitchVrfInstances>?> VrfInstances { get; private set; } = null!;

        /// <summary>
        /// Junos VRRP config
        /// </summary>
        [Output("vrrpConfig")]
        public Output<Outputs.SwitchVrrpConfig?> VrrpConfig { get; private set; } = null!;

        /// <summary>
        /// x in pixel
        /// </summary>
        [Output("x")]
        public Output<double?> X { get; private set; } = null!;

        /// <summary>
        /// y in pixel
        /// </summary>
        [Output("y")]
        public Output<double?> Y { get; private set; } = null!;


        /// <summary>
        /// Create a Switch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Switch(string name, SwitchArgs args, CustomResourceOptions? options = null)
            : base("junipermist:device/switch:Switch", name, args ?? new SwitchArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Switch(string name, Input<string> id, SwitchState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:device/switch:Switch", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Switch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Switch Get(string name, Input<string> id, SwitchState? state = null, CustomResourceOptions? options = null)
        {
            return new Switch(name, id, state, options);
        }
    }

    public sealed class SwitchArgs : global::Pulumi.ResourceArgs
    {
        [Input("aclPolicies")]
        private InputList<Inputs.SwitchAclPolicyArgs>? _aclPolicies;
        public InputList<Inputs.SwitchAclPolicyArgs> AclPolicies
        {
            get => _aclPolicies ?? (_aclPolicies = new InputList<Inputs.SwitchAclPolicyArgs>());
            set => _aclPolicies = value;
        }

        [Input("aclTags")]
        private InputMap<Inputs.SwitchAclTagsArgs>? _aclTags;

        /// <summary>
        /// ACL Tags to identify traffic source or destination. Key name is the tag name
        /// </summary>
        public InputMap<Inputs.SwitchAclTagsArgs> AclTags
        {
            get => _aclTags ?? (_aclTags = new InputMap<Inputs.SwitchAclTagsArgs>());
            set => _aclTags = value;
        }

        [Input("additionalConfigCmds")]
        private InputList<string>? _additionalConfigCmds;

        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        public InputList<string> AdditionalConfigCmds
        {
            get => _additionalConfigCmds ?? (_additionalConfigCmds = new InputList<string>());
            set => _additionalConfigCmds = value;
        }

        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        [Input("dhcpSnooping")]
        public Input<Inputs.SwitchDhcpSnoopingArgs>? DhcpSnooping { get; set; }

        [Input("dhcpdConfig")]
        public Input<Inputs.SwitchDhcpdConfigArgs>? DhcpdConfig { get; set; }

        /// <summary>
        /// for a claimed switch, we control the configs by default. This option (disables the behavior)
        /// </summary>
        [Input("disableAutoConfig")]
        public Input<bool>? DisableAutoConfig { get; set; }

        [Input("dnsServers")]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        /// <summary>
        /// EVPN Junos settings
        /// </summary>
        [Input("evpnConfig")]
        public Input<Inputs.SwitchEvpnConfigArgs>? EvpnConfig { get; set; }

        [Input("extraRoutes")]
        private InputMap<Inputs.SwitchExtraRoutesArgs>? _extraRoutes;
        public InputMap<Inputs.SwitchExtraRoutesArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.SwitchExtraRoutesArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.SwitchExtraRoutes6Args>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.SwitchExtraRoutes6Args> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.SwitchExtraRoutes6Args>());
            set => _extraRoutes6 = value;
        }

        /// <summary>
        /// Junos IP Config
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.SwitchIpConfigArgs>? IpConfig { get; set; }

        /// <summary>
        /// for an adopted switch, we don’t overwrite their existing configs automatically
        /// </summary>
        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// map where the device belongs to
        /// </summary>
        [Input("mapId")]
        public Input<string>? MapId { get; set; }

        /// <summary>
        /// enable mist_nac to use radsec
        /// </summary>
        [Input("mistNac")]
        public Input<Inputs.SwitchMistNacArgs>? MistNac { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputMap<Inputs.SwitchNetworksArgs>? _networks;

        /// <summary>
        /// Property key is network name
        /// </summary>
        public InputMap<Inputs.SwitchNetworksArgs> Networks
        {
            get => _networks ?? (_networks = new InputMap<Inputs.SwitchNetworksArgs>());
            set => _networks = value;
        }

        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;

        /// <summary>
        /// list of NTP servers specific to this device. By default, those in Site Settings will be used
        /// </summary>
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        /// <summary>
        /// - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines, re1 mgmt IP has to be
        /// set separately (if desired): key parameter = `re1`
        /// </summary>
        [Input("oobIpConfig")]
        public Input<Inputs.SwitchOobIpConfigArgs>? OobIpConfig { get; set; }

        [Input("ospfAreas")]
        private InputMap<Inputs.SwitchOspfAreasArgs>? _ospfAreas;

        /// <summary>
        /// Junos OSPF areas
        /// </summary>
        public InputMap<Inputs.SwitchOspfAreasArgs> OspfAreas
        {
            get => _ospfAreas ?? (_ospfAreas = new InputMap<Inputs.SwitchOspfAreasArgs>());
            set => _ospfAreas = value;
        }

        [Input("otherIpConfigs")]
        private InputMap<Inputs.SwitchOtherIpConfigsArgs>? _otherIpConfigs;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.SwitchOtherIpConfigsArgs> OtherIpConfigs
        {
            get => _otherIpConfigs ?? (_otherIpConfigs = new InputMap<Inputs.SwitchOtherIpConfigsArgs>());
            set => _otherIpConfigs = value;
        }

        [Input("portConfig")]
        private InputMap<Inputs.SwitchPortConfigArgs>? _portConfig;

        /// <summary>
        /// Property key is the port name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        public InputMap<Inputs.SwitchPortConfigArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.SwitchPortConfigArgs>());
            set => _portConfig = value;
        }

        [Input("portMirroring")]
        private InputMap<Inputs.SwitchPortMirroringArgs>? _portMirroring;

        /// <summary>
        /// Property key is the port mirroring instance name (Maximum: 4) port_mirroring can be added under device/site settings. It
        /// takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        public InputMap<Inputs.SwitchPortMirroringArgs> PortMirroring
        {
            get => _portMirroring ?? (_portMirroring = new InputMap<Inputs.SwitchPortMirroringArgs>());
            set => _portMirroring = value;
        }

        [Input("portUsages")]
        private InputMap<Inputs.SwitchPortUsagesArgs>? _portUsages;
        public InputMap<Inputs.SwitchPortUsagesArgs> PortUsages
        {
            get => _portUsages ?? (_portUsages = new InputMap<Inputs.SwitchPortUsagesArgs>());
            set => _portUsages = value;
        }

        /// <summary>
        /// Junos Radius config
        /// </summary>
        [Input("radiusConfig")]
        public Input<Inputs.SwitchRadiusConfigArgs>? RadiusConfig { get; set; }

        [Input("remoteSyslog")]
        public Input<Inputs.SwitchRemoteSyslogArgs>? RemoteSyslog { get; set; }

        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// used for OSPF / BGP / EVPN
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        [Input("snmpConfig")]
        public Input<Inputs.SwitchSnmpConfigArgs>? SnmpConfig { get; set; }

        [Input("stpConfig")]
        public Input<Inputs.SwitchStpConfigArgs>? StpConfig { get; set; }

        /// <summary>
        /// Switch settings
        /// </summary>
        [Input("switchMgmt")]
        public Input<Inputs.SwitchSwitchMgmtArgs>? SwitchMgmt { get; set; }

        /// <summary>
        /// whether to use it for snmp / syslog / tacplus / radius
        /// </summary>
        [Input("useRouterIdAsSourceIp")]
        public Input<bool>? UseRouterIdAsSourceIp { get; set; }

        [Input("vars")]
        private InputMap<string>? _vars;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        public InputMap<string> Vars
        {
            get => _vars ?? (_vars = new InputMap<string>());
            set => _vars = value;
        }

        /// <summary>
        /// required for preprovisioned Virtual Chassis
        /// </summary>
        [Input("virtualChassis")]
        public Input<Inputs.SwitchVirtualChassisArgs>? VirtualChassis { get; set; }

        [Input("vrfConfig")]
        public Input<Inputs.SwitchVrfConfigArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.SwitchVrfInstancesArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.SwitchVrfInstancesArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.SwitchVrfInstancesArgs>());
            set => _vrfInstances = value;
        }

        /// <summary>
        /// Junos VRRP config
        /// </summary>
        [Input("vrrpConfig")]
        public Input<Inputs.SwitchVrrpConfigArgs>? VrrpConfig { get; set; }

        /// <summary>
        /// x in pixel
        /// </summary>
        [Input("x")]
        public Input<double>? X { get; set; }

        /// <summary>
        /// y in pixel
        /// </summary>
        [Input("y")]
        public Input<double>? Y { get; set; }

        public SwitchArgs()
        {
        }
        public static new SwitchArgs Empty => new SwitchArgs();
    }

    public sealed class SwitchState : global::Pulumi.ResourceArgs
    {
        [Input("aclPolicies")]
        private InputList<Inputs.SwitchAclPolicyGetArgs>? _aclPolicies;
        public InputList<Inputs.SwitchAclPolicyGetArgs> AclPolicies
        {
            get => _aclPolicies ?? (_aclPolicies = new InputList<Inputs.SwitchAclPolicyGetArgs>());
            set => _aclPolicies = value;
        }

        [Input("aclTags")]
        private InputMap<Inputs.SwitchAclTagsGetArgs>? _aclTags;

        /// <summary>
        /// ACL Tags to identify traffic source or destination. Key name is the tag name
        /// </summary>
        public InputMap<Inputs.SwitchAclTagsGetArgs> AclTags
        {
            get => _aclTags ?? (_aclTags = new InputMap<Inputs.SwitchAclTagsGetArgs>());
            set => _aclTags = value;
        }

        [Input("additionalConfigCmds")]
        private InputList<string>? _additionalConfigCmds;

        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        public InputList<string> AdditionalConfigCmds
        {
            get => _additionalConfigCmds ?? (_additionalConfigCmds = new InputList<string>());
            set => _additionalConfigCmds = value;
        }

        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        [Input("dhcpSnooping")]
        public Input<Inputs.SwitchDhcpSnoopingGetArgs>? DhcpSnooping { get; set; }

        [Input("dhcpdConfig")]
        public Input<Inputs.SwitchDhcpdConfigGetArgs>? DhcpdConfig { get; set; }

        /// <summary>
        /// for a claimed switch, we control the configs by default. This option (disables the behavior)
        /// </summary>
        [Input("disableAutoConfig")]
        public Input<bool>? DisableAutoConfig { get; set; }

        [Input("dnsServers")]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// Global dns settings. To keep compatibility, dns settings in `ip_config` and `oob_ip_config` will overwrite this setting
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        /// <summary>
        /// EVPN Junos settings
        /// </summary>
        [Input("evpnConfig")]
        public Input<Inputs.SwitchEvpnConfigGetArgs>? EvpnConfig { get; set; }

        [Input("extraRoutes")]
        private InputMap<Inputs.SwitchExtraRoutesGetArgs>? _extraRoutes;
        public InputMap<Inputs.SwitchExtraRoutesGetArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.SwitchExtraRoutesGetArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.SwitchExtraRoutes6GetArgs>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.SwitchExtraRoutes6GetArgs> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.SwitchExtraRoutes6GetArgs>());
            set => _extraRoutes6 = value;
        }

        [Input("image1Url")]
        public Input<string>? Image1Url { get; set; }

        [Input("image2Url")]
        public Input<string>? Image2Url { get; set; }

        [Input("image3Url")]
        public Input<string>? Image3Url { get; set; }

        /// <summary>
        /// Junos IP Config
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.SwitchIpConfigGetArgs>? IpConfig { get; set; }

        /// <summary>
        /// device MAC address
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// for an adopted switch, we don’t overwrite their existing configs automatically
        /// </summary>
        [Input("managed")]
        public Input<bool>? Managed { get; set; }

        /// <summary>
        /// map where the device belongs to
        /// </summary>
        [Input("mapId")]
        public Input<string>? MapId { get; set; }

        /// <summary>
        /// enable mist_nac to use radsec
        /// </summary>
        [Input("mistNac")]
        public Input<Inputs.SwitchMistNacGetArgs>? MistNac { get; set; }

        /// <summary>
        /// device Model
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputMap<Inputs.SwitchNetworksGetArgs>? _networks;

        /// <summary>
        /// Property key is network name
        /// </summary>
        public InputMap<Inputs.SwitchNetworksGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputMap<Inputs.SwitchNetworksGetArgs>());
            set => _networks = value;
        }

        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;

        /// <summary>
        /// list of NTP servers specific to this device. By default, those in Site Settings will be used
        /// </summary>
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        /// <summary>
        /// - If HA configuration: key parameter will be nodeX (eg: node1) - If there are 2 routing engines, re1 mgmt IP has to be
        /// set separately (if desired): key parameter = `re1`
        /// </summary>
        [Input("oobIpConfig")]
        public Input<Inputs.SwitchOobIpConfigGetArgs>? OobIpConfig { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("ospfAreas")]
        private InputMap<Inputs.SwitchOspfAreasGetArgs>? _ospfAreas;

        /// <summary>
        /// Junos OSPF areas
        /// </summary>
        public InputMap<Inputs.SwitchOspfAreasGetArgs> OspfAreas
        {
            get => _ospfAreas ?? (_ospfAreas = new InputMap<Inputs.SwitchOspfAreasGetArgs>());
            set => _ospfAreas = value;
        }

        [Input("otherIpConfigs")]
        private InputMap<Inputs.SwitchOtherIpConfigsGetArgs>? _otherIpConfigs;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.SwitchOtherIpConfigsGetArgs> OtherIpConfigs
        {
            get => _otherIpConfigs ?? (_otherIpConfigs = new InputMap<Inputs.SwitchOtherIpConfigsGetArgs>());
            set => _otherIpConfigs = value;
        }

        [Input("portConfig")]
        private InputMap<Inputs.SwitchPortConfigGetArgs>? _portConfig;

        /// <summary>
        /// Property key is the port name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        public InputMap<Inputs.SwitchPortConfigGetArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.SwitchPortConfigGetArgs>());
            set => _portConfig = value;
        }

        [Input("portMirroring")]
        private InputMap<Inputs.SwitchPortMirroringGetArgs>? _portMirroring;

        /// <summary>
        /// Property key is the port mirroring instance name (Maximum: 4) port_mirroring can be added under device/site settings. It
        /// takes interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        public InputMap<Inputs.SwitchPortMirroringGetArgs> PortMirroring
        {
            get => _portMirroring ?? (_portMirroring = new InputMap<Inputs.SwitchPortMirroringGetArgs>());
            set => _portMirroring = value;
        }

        [Input("portUsages")]
        private InputMap<Inputs.SwitchPortUsagesGetArgs>? _portUsages;
        public InputMap<Inputs.SwitchPortUsagesGetArgs> PortUsages
        {
            get => _portUsages ?? (_portUsages = new InputMap<Inputs.SwitchPortUsagesGetArgs>());
            set => _portUsages = value;
        }

        /// <summary>
        /// Junos Radius config
        /// </summary>
        [Input("radiusConfig")]
        public Input<Inputs.SwitchRadiusConfigGetArgs>? RadiusConfig { get; set; }

        [Input("remoteSyslog")]
        public Input<Inputs.SwitchRemoteSyslogGetArgs>? RemoteSyslog { get; set; }

        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// used for OSPF / BGP / EVPN
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        /// <summary>
        /// device Serial
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("snmpConfig")]
        public Input<Inputs.SwitchSnmpConfigGetArgs>? SnmpConfig { get; set; }

        [Input("stpConfig")]
        public Input<Inputs.SwitchStpConfigGetArgs>? StpConfig { get; set; }

        /// <summary>
        /// Switch settings
        /// </summary>
        [Input("switchMgmt")]
        public Input<Inputs.SwitchSwitchMgmtGetArgs>? SwitchMgmt { get; set; }

        /// <summary>
        /// Device Type. enum: `switch`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// whether to use it for snmp / syslog / tacplus / radius
        /// </summary>
        [Input("useRouterIdAsSourceIp")]
        public Input<bool>? UseRouterIdAsSourceIp { get; set; }

        [Input("vars")]
        private InputMap<string>? _vars;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        public InputMap<string> Vars
        {
            get => _vars ?? (_vars = new InputMap<string>());
            set => _vars = value;
        }

        /// <summary>
        /// required for preprovisioned Virtual Chassis
        /// </summary>
        [Input("virtualChassis")]
        public Input<Inputs.SwitchVirtualChassisGetArgs>? VirtualChassis { get; set; }

        [Input("vrfConfig")]
        public Input<Inputs.SwitchVrfConfigGetArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.SwitchVrfInstancesGetArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.SwitchVrfInstancesGetArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.SwitchVrfInstancesGetArgs>());
            set => _vrfInstances = value;
        }

        /// <summary>
        /// Junos VRRP config
        /// </summary>
        [Input("vrrpConfig")]
        public Input<Inputs.SwitchVrrpConfigGetArgs>? VrrpConfig { get; set; }

        /// <summary>
        /// x in pixel
        /// </summary>
        [Input("x")]
        public Input<double>? X { get; set; }

        /// <summary>
        /// y in pixel
        /// </summary>
        [Input("y")]
        public Input<double>? Y { get; set; }

        public SwitchState()
        {
        }
        public static new SwitchState Empty => new SwitchState();
    }
}
