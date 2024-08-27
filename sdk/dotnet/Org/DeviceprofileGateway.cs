// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages the Gateway Device Profiles (HUB Profiles).A HUB profile is a configuration profile that automates the creation of overlay networks and defines the attributes of a hub device in a network. It includes settings for wan interfaces, lan interfaces, dns servers, traffic steering preferences, application policies, and routing options. HUB profiles are used to create consistent configurations for hub devices and ensure efficient connectivity between hubs and spokes in a network.
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/deviceprofileGateway:DeviceprofileGateway Using terraform import, import `mist_org_deviceprofile_gateway` using the `import` command:
    /// ```
    /// 
    /// Gateway cluster can be imported by specifying the org_id and the deviceprofile_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/deviceprofileGateway:DeviceprofileGateway deviceprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// 
    /// In Terraform v1.5.0 and later, use an import block to import `mist_org_deviceprofile_gateway` with `id={org_id}.{deviceprofile_id}`:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   to = mist_org_deviceprofile_gateway.deviceprofile_one
    /// 
    ///   id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"
    /// 
    /// }
    /// </summary>
    [JuniperMistResourceType("junipermist:org/deviceprofileGateway:DeviceprofileGateway")]
    public partial class DeviceprofileGateway : global::Pulumi.CustomResource
    {
        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        [Output("additionalConfigCmds")]
        public Output<ImmutableArray<string>> AdditionalConfigCmds { get; private set; } = null!;

        [Output("bgpConfig")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayBgpConfig>?> BgpConfig { get; private set; } = null!;

        [Output("createdTime")]
        public Output<double?> CreatedTime { get; private set; } = null!;

        [Output("dhcpdConfig")]
        public Output<Outputs.DeviceprofileGatewayDhcpdConfig?> DhcpdConfig { get; private set; } = null!;

        [Output("dnsOverride")]
        public Output<bool> DnsOverride { get; private set; } = null!;

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
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        [Output("extraRoutes")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayExtraRoutes>?> ExtraRoutes { get; private set; } = null!;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        [Output("extraRoutes6")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayExtraRoutes6>?> ExtraRoutes6 { get; private set; } = null!;

        /// <summary>
        /// Property key is the profile name
        /// </summary>
        [Output("idpProfiles")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayIdpProfiles>?> IdpProfiles { get; private set; } = null!;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        [Output("ipConfigs")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayIpConfigs>?> IpConfigs { get; private set; } = null!;

        [Output("modifiedTime")]
        public Output<double?> ModifiedTime { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("networks")]
        public Output<ImmutableArray<Outputs.DeviceprofileGatewayNetwork>> Networks { get; private set; } = null!;

        [Output("ntpOverride")]
        public Output<bool> NtpOverride { get; private set; } = null!;

        /// <summary>
        /// list of NTP servers specific to this device. By default, those in Site Settings will be used
        /// </summary>
        [Output("ntpServers")]
        public Output<ImmutableArray<string>> NtpServers { get; private set; } = null!;

        /// <summary>
        /// out-of-band (vme/em0/fxp0) IP config
        /// </summary>
        [Output("oobIpConfig")]
        public Output<Outputs.DeviceprofileGatewayOobIpConfig?> OobIpConfig { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Property key is the path name
        /// </summary>
        [Output("pathPreferences")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayPathPreferences>?> PathPreferences { get; private set; } = null!;

        /// <summary>
        /// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        [Output("portConfig")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayPortConfig>?> PortConfig { get; private set; } = null!;

        /// <summary>
        /// auto assigned if not set
        /// </summary>
        [Output("routerId")]
        public Output<string?> RouterId { get; private set; } = null!;

        /// <summary>
        /// Property key is the routing policy name
        /// </summary>
        [Output("routingPolicies")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayRoutingPolicies>?> RoutingPolicies { get; private set; } = null!;

        [Output("servicePolicies")]
        public Output<ImmutableArray<Outputs.DeviceprofileGatewayServicePolicy>> ServicePolicies { get; private set; } = null!;

        /// <summary>
        /// Property key is the tunnel name
        /// </summary>
        [Output("tunnelConfigs")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayTunnelConfigs>?> TunnelConfigs { get; private set; } = null!;

        [Output("tunnelProviderOptions")]
        public Output<Outputs.DeviceprofileGatewayTunnelProviderOptions?> TunnelProviderOptions { get; private set; } = null!;

        /// <summary>
        /// Device Type. enum: `gateway`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("vrfConfig")]
        public Output<Outputs.DeviceprofileGatewayVrfConfig?> VrfConfig { get; private set; } = null!;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        [Output("vrfInstances")]
        public Output<ImmutableDictionary<string, Outputs.DeviceprofileGatewayVrfInstances>?> VrfInstances { get; private set; } = null!;


        /// <summary>
        /// Create a DeviceprofileGateway resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeviceprofileGateway(string name, DeviceprofileGatewayArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/deviceprofileGateway:DeviceprofileGateway", name, args ?? new DeviceprofileGatewayArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeviceprofileGateway(string name, Input<string> id, DeviceprofileGatewayState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/deviceprofileGateway:DeviceprofileGateway", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeviceprofileGateway resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeviceprofileGateway Get(string name, Input<string> id, DeviceprofileGatewayState? state = null, CustomResourceOptions? options = null)
        {
            return new DeviceprofileGateway(name, id, state, options);
        }
    }

    public sealed class DeviceprofileGatewayArgs : global::Pulumi.ResourceArgs
    {
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

        [Input("bgpConfig")]
        private InputMap<Inputs.DeviceprofileGatewayBgpConfigArgs>? _bgpConfig;
        public InputMap<Inputs.DeviceprofileGatewayBgpConfigArgs> BgpConfig
        {
            get => _bgpConfig ?? (_bgpConfig = new InputMap<Inputs.DeviceprofileGatewayBgpConfigArgs>());
            set => _bgpConfig = value;
        }

        [Input("createdTime")]
        public Input<double>? CreatedTime { get; set; }

        [Input("dhcpdConfig")]
        public Input<Inputs.DeviceprofileGatewayDhcpdConfigArgs>? DhcpdConfig { get; set; }

        [Input("dnsOverride")]
        public Input<bool>? DnsOverride { get; set; }

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

        [Input("extraRoutes")]
        private InputMap<Inputs.DeviceprofileGatewayExtraRoutesArgs>? _extraRoutes;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayExtraRoutesArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.DeviceprofileGatewayExtraRoutesArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.DeviceprofileGatewayExtraRoutes6Args>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayExtraRoutes6Args> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.DeviceprofileGatewayExtraRoutes6Args>());
            set => _extraRoutes6 = value;
        }

        [Input("idpProfiles")]
        private InputMap<Inputs.DeviceprofileGatewayIdpProfilesArgs>? _idpProfiles;

        /// <summary>
        /// Property key is the profile name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayIdpProfilesArgs> IdpProfiles
        {
            get => _idpProfiles ?? (_idpProfiles = new InputMap<Inputs.DeviceprofileGatewayIdpProfilesArgs>());
            set => _idpProfiles = value;
        }

        [Input("ipConfigs")]
        private InputMap<Inputs.DeviceprofileGatewayIpConfigsArgs>? _ipConfigs;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayIpConfigsArgs> IpConfigs
        {
            get => _ipConfigs ?? (_ipConfigs = new InputMap<Inputs.DeviceprofileGatewayIpConfigsArgs>());
            set => _ipConfigs = value;
        }

        [Input("modifiedTime")]
        public Input<double>? ModifiedTime { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.DeviceprofileGatewayNetworkArgs>? _networks;
        public InputList<Inputs.DeviceprofileGatewayNetworkArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.DeviceprofileGatewayNetworkArgs>());
            set => _networks = value;
        }

        [Input("ntpOverride")]
        public Input<bool>? NtpOverride { get; set; }

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
        /// out-of-band (vme/em0/fxp0) IP config
        /// </summary>
        [Input("oobIpConfig")]
        public Input<Inputs.DeviceprofileGatewayOobIpConfigArgs>? OobIpConfig { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("pathPreferences")]
        private InputMap<Inputs.DeviceprofileGatewayPathPreferencesArgs>? _pathPreferences;

        /// <summary>
        /// Property key is the path name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayPathPreferencesArgs> PathPreferences
        {
            get => _pathPreferences ?? (_pathPreferences = new InputMap<Inputs.DeviceprofileGatewayPathPreferencesArgs>());
            set => _pathPreferences = value;
        }

        [Input("portConfig")]
        private InputMap<Inputs.DeviceprofileGatewayPortConfigArgs>? _portConfig;

        /// <summary>
        /// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayPortConfigArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.DeviceprofileGatewayPortConfigArgs>());
            set => _portConfig = value;
        }

        /// <summary>
        /// auto assigned if not set
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        [Input("routingPolicies")]
        private InputMap<Inputs.DeviceprofileGatewayRoutingPoliciesArgs>? _routingPolicies;

        /// <summary>
        /// Property key is the routing policy name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayRoutingPoliciesArgs> RoutingPolicies
        {
            get => _routingPolicies ?? (_routingPolicies = new InputMap<Inputs.DeviceprofileGatewayRoutingPoliciesArgs>());
            set => _routingPolicies = value;
        }

        [Input("servicePolicies")]
        private InputList<Inputs.DeviceprofileGatewayServicePolicyArgs>? _servicePolicies;
        public InputList<Inputs.DeviceprofileGatewayServicePolicyArgs> ServicePolicies
        {
            get => _servicePolicies ?? (_servicePolicies = new InputList<Inputs.DeviceprofileGatewayServicePolicyArgs>());
            set => _servicePolicies = value;
        }

        [Input("tunnelConfigs")]
        private InputMap<Inputs.DeviceprofileGatewayTunnelConfigsArgs>? _tunnelConfigs;

        /// <summary>
        /// Property key is the tunnel name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayTunnelConfigsArgs> TunnelConfigs
        {
            get => _tunnelConfigs ?? (_tunnelConfigs = new InputMap<Inputs.DeviceprofileGatewayTunnelConfigsArgs>());
            set => _tunnelConfigs = value;
        }

        [Input("tunnelProviderOptions")]
        public Input<Inputs.DeviceprofileGatewayTunnelProviderOptionsArgs>? TunnelProviderOptions { get; set; }

        [Input("vrfConfig")]
        public Input<Inputs.DeviceprofileGatewayVrfConfigArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.DeviceprofileGatewayVrfInstancesArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayVrfInstancesArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.DeviceprofileGatewayVrfInstancesArgs>());
            set => _vrfInstances = value;
        }

        public DeviceprofileGatewayArgs()
        {
        }
        public static new DeviceprofileGatewayArgs Empty => new DeviceprofileGatewayArgs();
    }

    public sealed class DeviceprofileGatewayState : global::Pulumi.ResourceArgs
    {
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

        [Input("bgpConfig")]
        private InputMap<Inputs.DeviceprofileGatewayBgpConfigGetArgs>? _bgpConfig;
        public InputMap<Inputs.DeviceprofileGatewayBgpConfigGetArgs> BgpConfig
        {
            get => _bgpConfig ?? (_bgpConfig = new InputMap<Inputs.DeviceprofileGatewayBgpConfigGetArgs>());
            set => _bgpConfig = value;
        }

        [Input("createdTime")]
        public Input<double>? CreatedTime { get; set; }

        [Input("dhcpdConfig")]
        public Input<Inputs.DeviceprofileGatewayDhcpdConfigGetArgs>? DhcpdConfig { get; set; }

        [Input("dnsOverride")]
        public Input<bool>? DnsOverride { get; set; }

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

        [Input("extraRoutes")]
        private InputMap<Inputs.DeviceprofileGatewayExtraRoutesGetArgs>? _extraRoutes;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "10.0.0.0/8")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayExtraRoutesGetArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.DeviceprofileGatewayExtraRoutesGetArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.DeviceprofileGatewayExtraRoutes6GetArgs>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayExtraRoutes6GetArgs> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.DeviceprofileGatewayExtraRoutes6GetArgs>());
            set => _extraRoutes6 = value;
        }

        [Input("idpProfiles")]
        private InputMap<Inputs.DeviceprofileGatewayIdpProfilesGetArgs>? _idpProfiles;

        /// <summary>
        /// Property key is the profile name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayIdpProfilesGetArgs> IdpProfiles
        {
            get => _idpProfiles ?? (_idpProfiles = new InputMap<Inputs.DeviceprofileGatewayIdpProfilesGetArgs>());
            set => _idpProfiles = value;
        }

        [Input("ipConfigs")]
        private InputMap<Inputs.DeviceprofileGatewayIpConfigsGetArgs>? _ipConfigs;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayIpConfigsGetArgs> IpConfigs
        {
            get => _ipConfigs ?? (_ipConfigs = new InputMap<Inputs.DeviceprofileGatewayIpConfigsGetArgs>());
            set => _ipConfigs = value;
        }

        [Input("modifiedTime")]
        public Input<double>? ModifiedTime { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("networks")]
        private InputList<Inputs.DeviceprofileGatewayNetworkGetArgs>? _networks;
        public InputList<Inputs.DeviceprofileGatewayNetworkGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputList<Inputs.DeviceprofileGatewayNetworkGetArgs>());
            set => _networks = value;
        }

        [Input("ntpOverride")]
        public Input<bool>? NtpOverride { get; set; }

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
        /// out-of-band (vme/em0/fxp0) IP config
        /// </summary>
        [Input("oobIpConfig")]
        public Input<Inputs.DeviceprofileGatewayOobIpConfigGetArgs>? OobIpConfig { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("pathPreferences")]
        private InputMap<Inputs.DeviceprofileGatewayPathPreferencesGetArgs>? _pathPreferences;

        /// <summary>
        /// Property key is the path name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayPathPreferencesGetArgs> PathPreferences
        {
            get => _pathPreferences ?? (_pathPreferences = new InputMap<Inputs.DeviceprofileGatewayPathPreferencesGetArgs>());
            set => _pathPreferences = value;
        }

        [Input("portConfig")]
        private InputMap<Inputs.DeviceprofileGatewayPortConfigGetArgs>? _portConfig;

        /// <summary>
        /// Property key is the port(s) name or range (e.g. "ge-0/0/0-10")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayPortConfigGetArgs> PortConfig
        {
            get => _portConfig ?? (_portConfig = new InputMap<Inputs.DeviceprofileGatewayPortConfigGetArgs>());
            set => _portConfig = value;
        }

        /// <summary>
        /// auto assigned if not set
        /// </summary>
        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        [Input("routingPolicies")]
        private InputMap<Inputs.DeviceprofileGatewayRoutingPoliciesGetArgs>? _routingPolicies;

        /// <summary>
        /// Property key is the routing policy name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayRoutingPoliciesGetArgs> RoutingPolicies
        {
            get => _routingPolicies ?? (_routingPolicies = new InputMap<Inputs.DeviceprofileGatewayRoutingPoliciesGetArgs>());
            set => _routingPolicies = value;
        }

        [Input("servicePolicies")]
        private InputList<Inputs.DeviceprofileGatewayServicePolicyGetArgs>? _servicePolicies;
        public InputList<Inputs.DeviceprofileGatewayServicePolicyGetArgs> ServicePolicies
        {
            get => _servicePolicies ?? (_servicePolicies = new InputList<Inputs.DeviceprofileGatewayServicePolicyGetArgs>());
            set => _servicePolicies = value;
        }

        [Input("tunnelConfigs")]
        private InputMap<Inputs.DeviceprofileGatewayTunnelConfigsGetArgs>? _tunnelConfigs;

        /// <summary>
        /// Property key is the tunnel name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayTunnelConfigsGetArgs> TunnelConfigs
        {
            get => _tunnelConfigs ?? (_tunnelConfigs = new InputMap<Inputs.DeviceprofileGatewayTunnelConfigsGetArgs>());
            set => _tunnelConfigs = value;
        }

        [Input("tunnelProviderOptions")]
        public Input<Inputs.DeviceprofileGatewayTunnelProviderOptionsGetArgs>? TunnelProviderOptions { get; set; }

        /// <summary>
        /// Device Type. enum: `gateway`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vrfConfig")]
        public Input<Inputs.DeviceprofileGatewayVrfConfigGetArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.DeviceprofileGatewayVrfInstancesGetArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayVrfInstancesGetArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.DeviceprofileGatewayVrfInstancesGetArgs>());
            set => _vrfInstances = value;
        }

        public DeviceprofileGatewayState()
        {
        }
        public static new DeviceprofileGatewayState Empty => new DeviceprofileGatewayState();
    }
}
