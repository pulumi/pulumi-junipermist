// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site
{
    /// <summary>
    /// This resource manages the Site Network configuration (Switch configuration).The Site Network template can be used to override the Org Network template assign to the site, or to configure common switch settings accross the site without having to create an Org Network template.
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_site_networktemplate` with:
    /// 
    /// Site Network Template can be imported by specifying the site_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:site/networktemplate:Networktemplate networktemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:site/networktemplate:Networktemplate")]
    public partial class Networktemplate : global::Pulumi.CustomResource
    {
        [Output("aclPolicies")]
        public Output<ImmutableArray<Outputs.NetworktemplateAclPolicy>> AclPolicies { get; private set; } = null!;

        /// <summary>
        /// ACL Tags to identify traffic source or destination. Key name is the tag name
        /// </summary>
        [Output("aclTags")]
        public Output<ImmutableDictionary<string, Outputs.NetworktemplateAclTags>?> AclTags { get; private set; } = null!;

        /// <summary>
        /// additional CLI commands to append to the generated Junos config **Note**: no check is done
        /// </summary>
        [Output("additionalConfigCmds")]
        public Output<ImmutableArray<string>> AdditionalConfigCmds { get; private set; } = null!;

        [Output("dhcpSnooping")]
        public Output<Outputs.NetworktemplateDhcpSnooping?> DhcpSnooping { get; private set; } = null!;

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

        [Output("extraRoutes")]
        public Output<ImmutableDictionary<string, Outputs.NetworktemplateExtraRoutes>?> ExtraRoutes { get; private set; } = null!;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        [Output("extraRoutes6")]
        public Output<ImmutableDictionary<string, Outputs.NetworktemplateExtraRoutes6>?> ExtraRoutes6 { get; private set; } = null!;

        /// <summary>
        /// enable mist_nac to use radsec
        /// </summary>
        [Output("mistNac")]
        public Output<Outputs.NetworktemplateMistNac?> MistNac { get; private set; } = null!;

        /// <summary>
        /// Property key is network name
        /// </summary>
        [Output("networks")]
        public Output<ImmutableDictionary<string, Outputs.NetworktemplateNetworks>?> Networks { get; private set; } = null!;

        /// <summary>
        /// list of NTP servers
        /// </summary>
        [Output("ntpServers")]
        public Output<ImmutableArray<string>> NtpServers { get; private set; } = null!;

        /// <summary>
        /// Property key is the port mirroring instance name port_mirroring can be added under device/site settings. It takes
        /// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        [Output("portMirroring")]
        public Output<ImmutableDictionary<string, Outputs.NetworktemplatePortMirroring>?> PortMirroring { get; private set; } = null!;

        [Output("portUsages")]
        public Output<ImmutableDictionary<string, Outputs.NetworktemplatePortUsages>?> PortUsages { get; private set; } = null!;

        /// <summary>
        /// Junos Radius config
        /// </summary>
        [Output("radiusConfig")]
        public Output<Outputs.NetworktemplateRadiusConfig?> RadiusConfig { get; private set; } = null!;

        [Output("remoteSyslog")]
        public Output<Outputs.NetworktemplateRemoteSyslog?> RemoteSyslog { get; private set; } = null!;

        /// <summary>
        /// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
        /// </summary>
        [Output("removeExistingConfigs")]
        public Output<bool> RemoveExistingConfigs { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;

        [Output("snmpConfig")]
        public Output<Outputs.NetworktemplateSnmpConfig?> SnmpConfig { get; private set; } = null!;

        /// <summary>
        /// Switch template
        /// </summary>
        [Output("switchMatching")]
        public Output<Outputs.NetworktemplateSwitchMatching?> SwitchMatching { get; private set; } = null!;

        /// <summary>
        /// Switch settings
        /// </summary>
        [Output("switchMgmt")]
        public Output<Outputs.NetworktemplateSwitchMgmt?> SwitchMgmt { get; private set; } = null!;

        [Output("uplinkPortConfig")]
        public Output<Outputs.NetworktemplateUplinkPortConfig?> UplinkPortConfig { get; private set; } = null!;

        [Output("vrfConfig")]
        public Output<Outputs.NetworktemplateVrfConfig?> VrfConfig { get; private set; } = null!;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        [Output("vrfInstances")]
        public Output<ImmutableDictionary<string, Outputs.NetworktemplateVrfInstances>?> VrfInstances { get; private set; } = null!;


        /// <summary>
        /// Create a Networktemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Networktemplate(string name, NetworktemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("junipermist:site/networktemplate:Networktemplate", name, args ?? new NetworktemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Networktemplate(string name, Input<string> id, NetworktemplateState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:site/networktemplate:Networktemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Networktemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Networktemplate Get(string name, Input<string> id, NetworktemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new Networktemplate(name, id, state, options);
        }
    }

    public sealed class NetworktemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("aclPolicies")]
        private InputList<Inputs.NetworktemplateAclPolicyArgs>? _aclPolicies;
        public InputList<Inputs.NetworktemplateAclPolicyArgs> AclPolicies
        {
            get => _aclPolicies ?? (_aclPolicies = new InputList<Inputs.NetworktemplateAclPolicyArgs>());
            set => _aclPolicies = value;
        }

        [Input("aclTags")]
        private InputMap<Inputs.NetworktemplateAclTagsArgs>? _aclTags;

        /// <summary>
        /// ACL Tags to identify traffic source or destination. Key name is the tag name
        /// </summary>
        public InputMap<Inputs.NetworktemplateAclTagsArgs> AclTags
        {
            get => _aclTags ?? (_aclTags = new InputMap<Inputs.NetworktemplateAclTagsArgs>());
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

        [Input("dhcpSnooping")]
        public Input<Inputs.NetworktemplateDhcpSnoopingArgs>? DhcpSnooping { get; set; }

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
        private InputMap<Inputs.NetworktemplateExtraRoutesArgs>? _extraRoutes;
        public InputMap<Inputs.NetworktemplateExtraRoutesArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.NetworktemplateExtraRoutesArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.NetworktemplateExtraRoutes6Args>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.NetworktemplateExtraRoutes6Args> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.NetworktemplateExtraRoutes6Args>());
            set => _extraRoutes6 = value;
        }

        /// <summary>
        /// enable mist_nac to use radsec
        /// </summary>
        [Input("mistNac")]
        public Input<Inputs.NetworktemplateMistNacArgs>? MistNac { get; set; }

        [Input("networks")]
        private InputMap<Inputs.NetworktemplateNetworksArgs>? _networks;

        /// <summary>
        /// Property key is network name
        /// </summary>
        public InputMap<Inputs.NetworktemplateNetworksArgs> Networks
        {
            get => _networks ?? (_networks = new InputMap<Inputs.NetworktemplateNetworksArgs>());
            set => _networks = value;
        }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;

        /// <summary>
        /// list of NTP servers
        /// </summary>
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        [Input("portMirroring")]
        private InputMap<Inputs.NetworktemplatePortMirroringArgs>? _portMirroring;

        /// <summary>
        /// Property key is the port mirroring instance name port_mirroring can be added under device/site settings. It takes
        /// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        public InputMap<Inputs.NetworktemplatePortMirroringArgs> PortMirroring
        {
            get => _portMirroring ?? (_portMirroring = new InputMap<Inputs.NetworktemplatePortMirroringArgs>());
            set => _portMirroring = value;
        }

        [Input("portUsages")]
        private InputMap<Inputs.NetworktemplatePortUsagesArgs>? _portUsages;
        public InputMap<Inputs.NetworktemplatePortUsagesArgs> PortUsages
        {
            get => _portUsages ?? (_portUsages = new InputMap<Inputs.NetworktemplatePortUsagesArgs>());
            set => _portUsages = value;
        }

        /// <summary>
        /// Junos Radius config
        /// </summary>
        [Input("radiusConfig")]
        public Input<Inputs.NetworktemplateRadiusConfigArgs>? RadiusConfig { get; set; }

        [Input("remoteSyslog")]
        public Input<Inputs.NetworktemplateRemoteSyslogArgs>? RemoteSyslog { get; set; }

        /// <summary>
        /// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
        /// </summary>
        [Input("removeExistingConfigs")]
        public Input<bool>? RemoveExistingConfigs { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("snmpConfig")]
        public Input<Inputs.NetworktemplateSnmpConfigArgs>? SnmpConfig { get; set; }

        /// <summary>
        /// Switch template
        /// </summary>
        [Input("switchMatching")]
        public Input<Inputs.NetworktemplateSwitchMatchingArgs>? SwitchMatching { get; set; }

        /// <summary>
        /// Switch settings
        /// </summary>
        [Input("switchMgmt")]
        public Input<Inputs.NetworktemplateSwitchMgmtArgs>? SwitchMgmt { get; set; }

        [Input("uplinkPortConfig")]
        public Input<Inputs.NetworktemplateUplinkPortConfigArgs>? UplinkPortConfig { get; set; }

        [Input("vrfConfig")]
        public Input<Inputs.NetworktemplateVrfConfigArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.NetworktemplateVrfInstancesArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.NetworktemplateVrfInstancesArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.NetworktemplateVrfInstancesArgs>());
            set => _vrfInstances = value;
        }

        public NetworktemplateArgs()
        {
        }
        public static new NetworktemplateArgs Empty => new NetworktemplateArgs();
    }

    public sealed class NetworktemplateState : global::Pulumi.ResourceArgs
    {
        [Input("aclPolicies")]
        private InputList<Inputs.NetworktemplateAclPolicyGetArgs>? _aclPolicies;
        public InputList<Inputs.NetworktemplateAclPolicyGetArgs> AclPolicies
        {
            get => _aclPolicies ?? (_aclPolicies = new InputList<Inputs.NetworktemplateAclPolicyGetArgs>());
            set => _aclPolicies = value;
        }

        [Input("aclTags")]
        private InputMap<Inputs.NetworktemplateAclTagsGetArgs>? _aclTags;

        /// <summary>
        /// ACL Tags to identify traffic source or destination. Key name is the tag name
        /// </summary>
        public InputMap<Inputs.NetworktemplateAclTagsGetArgs> AclTags
        {
            get => _aclTags ?? (_aclTags = new InputMap<Inputs.NetworktemplateAclTagsGetArgs>());
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

        [Input("dhcpSnooping")]
        public Input<Inputs.NetworktemplateDhcpSnoopingGetArgs>? DhcpSnooping { get; set; }

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
        private InputMap<Inputs.NetworktemplateExtraRoutesGetArgs>? _extraRoutes;
        public InputMap<Inputs.NetworktemplateExtraRoutesGetArgs> ExtraRoutes
        {
            get => _extraRoutes ?? (_extraRoutes = new InputMap<Inputs.NetworktemplateExtraRoutesGetArgs>());
            set => _extraRoutes = value;
        }

        [Input("extraRoutes6")]
        private InputMap<Inputs.NetworktemplateExtraRoutes6GetArgs>? _extraRoutes6;

        /// <summary>
        /// Property key is the destination CIDR (e.g. "2a02:1234:420a:10c9::/64")
        /// </summary>
        public InputMap<Inputs.NetworktemplateExtraRoutes6GetArgs> ExtraRoutes6
        {
            get => _extraRoutes6 ?? (_extraRoutes6 = new InputMap<Inputs.NetworktemplateExtraRoutes6GetArgs>());
            set => _extraRoutes6 = value;
        }

        /// <summary>
        /// enable mist_nac to use radsec
        /// </summary>
        [Input("mistNac")]
        public Input<Inputs.NetworktemplateMistNacGetArgs>? MistNac { get; set; }

        [Input("networks")]
        private InputMap<Inputs.NetworktemplateNetworksGetArgs>? _networks;

        /// <summary>
        /// Property key is network name
        /// </summary>
        public InputMap<Inputs.NetworktemplateNetworksGetArgs> Networks
        {
            get => _networks ?? (_networks = new InputMap<Inputs.NetworktemplateNetworksGetArgs>());
            set => _networks = value;
        }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;

        /// <summary>
        /// list of NTP servers
        /// </summary>
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        [Input("portMirroring")]
        private InputMap<Inputs.NetworktemplatePortMirroringGetArgs>? _portMirroring;

        /// <summary>
        /// Property key is the port mirroring instance name port_mirroring can be added under device/site settings. It takes
        /// interface and ports as input for ingress, interface as input for egress and can take interface and port as output.
        /// </summary>
        public InputMap<Inputs.NetworktemplatePortMirroringGetArgs> PortMirroring
        {
            get => _portMirroring ?? (_portMirroring = new InputMap<Inputs.NetworktemplatePortMirroringGetArgs>());
            set => _portMirroring = value;
        }

        [Input("portUsages")]
        private InputMap<Inputs.NetworktemplatePortUsagesGetArgs>? _portUsages;
        public InputMap<Inputs.NetworktemplatePortUsagesGetArgs> PortUsages
        {
            get => _portUsages ?? (_portUsages = new InputMap<Inputs.NetworktemplatePortUsagesGetArgs>());
            set => _portUsages = value;
        }

        /// <summary>
        /// Junos Radius config
        /// </summary>
        [Input("radiusConfig")]
        public Input<Inputs.NetworktemplateRadiusConfigGetArgs>? RadiusConfig { get; set; }

        [Input("remoteSyslog")]
        public Input<Inputs.NetworktemplateRemoteSyslogGetArgs>? RemoteSyslog { get; set; }

        /// <summary>
        /// by default, when we configure a device, we only clean up config we generates. Remove existing configs if enabled
        /// </summary>
        [Input("removeExistingConfigs")]
        public Input<bool>? RemoveExistingConfigs { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("snmpConfig")]
        public Input<Inputs.NetworktemplateSnmpConfigGetArgs>? SnmpConfig { get; set; }

        /// <summary>
        /// Switch template
        /// </summary>
        [Input("switchMatching")]
        public Input<Inputs.NetworktemplateSwitchMatchingGetArgs>? SwitchMatching { get; set; }

        /// <summary>
        /// Switch settings
        /// </summary>
        [Input("switchMgmt")]
        public Input<Inputs.NetworktemplateSwitchMgmtGetArgs>? SwitchMgmt { get; set; }

        [Input("uplinkPortConfig")]
        public Input<Inputs.NetworktemplateUplinkPortConfigGetArgs>? UplinkPortConfig { get; set; }

        [Input("vrfConfig")]
        public Input<Inputs.NetworktemplateVrfConfigGetArgs>? VrfConfig { get; set; }

        [Input("vrfInstances")]
        private InputMap<Inputs.NetworktemplateVrfInstancesGetArgs>? _vrfInstances;

        /// <summary>
        /// Property key is the network name
        /// </summary>
        public InputMap<Inputs.NetworktemplateVrfInstancesGetArgs> VrfInstances
        {
            get => _vrfInstances ?? (_vrfInstances = new InputMap<Inputs.NetworktemplateVrfInstancesGetArgs>());
            set => _vrfInstances = value;
        }

        public NetworktemplateState()
        {
        }
        public static new NetworktemplateState Empty => new NetworktemplateState();
    }
}
