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
    /// This resource manages the Org Settings.
    /// 
    /// The Org Settings can be used to customize the Org configuration
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_setting` with:
    /// 
    /// Org Setting can be imported by specifying the org_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/setting:Setting setting_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/setting:Setting")]
    public partial class Setting : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Output("apUpdownThreshold")]
        public Output<int> ApUpdownThreshold { get; private set; } = null!;

        [Output("apiPolicy")]
        public Output<Outputs.SettingApiPolicy?> ApiPolicy { get; private set; } = null!;

        /// <summary>
        /// List of PEM-encoded ca certs
        /// </summary>
        [Output("cacerts")]
        public Output<ImmutableArray<string>> Cacerts { get; private set; } = null!;

        [Output("celona")]
        public Output<Outputs.SettingCelona?> Celona { get; private set; } = null!;

        [Output("cloudshark")]
        public Output<Outputs.SettingCloudshark?> Cloudshark { get; private set; } = null!;

        [Output("cradlepoint")]
        public Output<Outputs.SettingCradlepoint> Cradlepoint { get; private set; } = null!;

        /// <summary>
        /// common device cert, optional
        /// </summary>
        [Output("deviceCert")]
        public Output<Outputs.SettingDeviceCert?> DeviceCert { get; private set; } = null!;

        /// <summary>
        /// Enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
        /// AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
        /// immediate)
        /// </summary>
        [Output("deviceUpdownThreshold")]
        public Output<int> DeviceUpdownThreshold { get; private set; } = null!;

        /// <summary>
        /// Whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
        /// </summary>
        [Output("disablePcap")]
        public Output<bool> DisablePcap { get; private set; } = null!;

        /// <summary>
        /// Whether to disable remote shell access for an entire org
        /// </summary>
        [Output("disableRemoteShell")]
        public Output<bool> DisableRemoteShell { get; private set; } = null!;

        /// <summary>
        /// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Output("gatewayUpdownThreshold")]
        public Output<int> GatewayUpdownThreshold { get; private set; } = null!;

        [Output("installer")]
        public Output<Outputs.SettingInstaller?> Installer { get; private set; } = null!;

        [Output("jcloud")]
        public Output<Outputs.SettingJcloud?> Jcloud { get; private set; } = null!;

        /// <summary>
        /// JCloud Routing Assurance connexion
        /// </summary>
        [Output("jcloudRa")]
        public Output<Outputs.SettingJcloudRa?> JcloudRa { get; private set; } = null!;

        [Output("juniper")]
        public Output<Outputs.SettingJuniper> Juniper { get; private set; } = null!;

        /// <summary>
        /// management-related properties
        /// </summary>
        [Output("mgmt")]
        public Output<Outputs.SettingMgmt?> Mgmt { get; private set; } = null!;

        [Output("mistNac")]
        public Output<Outputs.SettingMistNac?> MistNac { get; private set; } = null!;

        [Output("mxedgeFipsEnabled")]
        public Output<bool> MxedgeFipsEnabled { get; private set; } = null!;

        [Output("mxedgeMgmt")]
        public Output<Outputs.SettingMxedgeMgmt?> MxedgeMgmt { get; private set; } = null!;

        /// <summary>
        /// Property key is the interface name or range (e.g. `et-0/0/47`, `et-0/0/48-49`)
        /// </summary>
        [Output("opticPortConfig")]
        public Output<ImmutableDictionary<string, Outputs.SettingOpticPortConfig>?> OpticPortConfig { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// password policy
        /// </summary>
        [Output("passwordPolicy")]
        public Output<Outputs.SettingPasswordPolicy?> PasswordPolicy { get; private set; } = null!;

        [Output("pcap")]
        public Output<Outputs.SettingPcap?> Pcap { get; private set; } = null!;

        [Output("security")]
        public Output<Outputs.SettingSecurity?> Security { get; private set; } = null!;

        [Output("switchMgmt")]
        public Output<Outputs.SettingSwitchMgmt?> SwitchMgmt { get; private set; } = null!;

        /// <summary>
        /// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Output("switchUpdownThreshold")]
        public Output<int> SwitchUpdownThreshold { get; private set; } = null!;

        [Output("syntheticTest")]
        public Output<Outputs.SettingSyntheticTest?> SyntheticTest { get; private set; } = null!;

        /// <summary>
        /// Automatically logout the user when UI session is inactive. `0` means disabled
        /// </summary>
        [Output("uiIdleTimeout")]
        public Output<int> UiIdleTimeout { get; private set; } = null!;

        [Output("vpnOptions")]
        public Output<Outputs.SettingVpnOptions?> VpnOptions { get; private set; } = null!;

        [Output("wanPma")]
        public Output<Outputs.SettingWanPma?> WanPma { get; private set; } = null!;

        [Output("wiredPma")]
        public Output<Outputs.SettingWiredPma?> WiredPma { get; private set; } = null!;

        [Output("wirelessPma")]
        public Output<Outputs.SettingWirelessPma?> WirelessPma { get; private set; } = null!;


        /// <summary>
        /// Create a Setting resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Setting(string name, SettingArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/setting:Setting", name, args ?? new SettingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Setting(string name, Input<string> id, SettingState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/setting:Setting", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Setting resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Setting Get(string name, Input<string> id, SettingState? state = null, CustomResourceOptions? options = null)
        {
            return new Setting(name, id, state, options);
        }
    }

    public sealed class SettingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("apUpdownThreshold")]
        public Input<int>? ApUpdownThreshold { get; set; }

        [Input("apiPolicy")]
        public Input<Inputs.SettingApiPolicyArgs>? ApiPolicy { get; set; }

        [Input("cacerts")]
        private InputList<string>? _cacerts;

        /// <summary>
        /// List of PEM-encoded ca certs
        /// </summary>
        public InputList<string> Cacerts
        {
            get => _cacerts ?? (_cacerts = new InputList<string>());
            set => _cacerts = value;
        }

        [Input("celona")]
        public Input<Inputs.SettingCelonaArgs>? Celona { get; set; }

        [Input("cloudshark")]
        public Input<Inputs.SettingCloudsharkArgs>? Cloudshark { get; set; }

        /// <summary>
        /// common device cert, optional
        /// </summary>
        [Input("deviceCert")]
        public Input<Inputs.SettingDeviceCertArgs>? DeviceCert { get; set; }

        /// <summary>
        /// Enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
        /// AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
        /// immediate)
        /// </summary>
        [Input("deviceUpdownThreshold")]
        public Input<int>? DeviceUpdownThreshold { get; set; }

        /// <summary>
        /// Whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
        /// </summary>
        [Input("disablePcap")]
        public Input<bool>? DisablePcap { get; set; }

        /// <summary>
        /// Whether to disable remote shell access for an entire org
        /// </summary>
        [Input("disableRemoteShell")]
        public Input<bool>? DisableRemoteShell { get; set; }

        /// <summary>
        /// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("gatewayUpdownThreshold")]
        public Input<int>? GatewayUpdownThreshold { get; set; }

        [Input("installer")]
        public Input<Inputs.SettingInstallerArgs>? Installer { get; set; }

        [Input("jcloud")]
        public Input<Inputs.SettingJcloudArgs>? Jcloud { get; set; }

        /// <summary>
        /// JCloud Routing Assurance connexion
        /// </summary>
        [Input("jcloudRa")]
        public Input<Inputs.SettingJcloudRaArgs>? JcloudRa { get; set; }

        /// <summary>
        /// management-related properties
        /// </summary>
        [Input("mgmt")]
        public Input<Inputs.SettingMgmtArgs>? Mgmt { get; set; }

        [Input("mistNac")]
        public Input<Inputs.SettingMistNacArgs>? MistNac { get; set; }

        [Input("mxedgeFipsEnabled")]
        public Input<bool>? MxedgeFipsEnabled { get; set; }

        [Input("mxedgeMgmt")]
        public Input<Inputs.SettingMxedgeMgmtArgs>? MxedgeMgmt { get; set; }

        [Input("opticPortConfig")]
        private InputMap<Inputs.SettingOpticPortConfigArgs>? _opticPortConfig;

        /// <summary>
        /// Property key is the interface name or range (e.g. `et-0/0/47`, `et-0/0/48-49`)
        /// </summary>
        public InputMap<Inputs.SettingOpticPortConfigArgs> OpticPortConfig
        {
            get => _opticPortConfig ?? (_opticPortConfig = new InputMap<Inputs.SettingOpticPortConfigArgs>());
            set => _opticPortConfig = value;
        }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// password policy
        /// </summary>
        [Input("passwordPolicy")]
        public Input<Inputs.SettingPasswordPolicyArgs>? PasswordPolicy { get; set; }

        [Input("pcap")]
        public Input<Inputs.SettingPcapArgs>? Pcap { get; set; }

        [Input("security")]
        public Input<Inputs.SettingSecurityArgs>? Security { get; set; }

        [Input("switchMgmt")]
        public Input<Inputs.SettingSwitchMgmtArgs>? SwitchMgmt { get; set; }

        /// <summary>
        /// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("switchUpdownThreshold")]
        public Input<int>? SwitchUpdownThreshold { get; set; }

        [Input("syntheticTest")]
        public Input<Inputs.SettingSyntheticTestArgs>? SyntheticTest { get; set; }

        /// <summary>
        /// Automatically logout the user when UI session is inactive. `0` means disabled
        /// </summary>
        [Input("uiIdleTimeout")]
        public Input<int>? UiIdleTimeout { get; set; }

        [Input("vpnOptions")]
        public Input<Inputs.SettingVpnOptionsArgs>? VpnOptions { get; set; }

        [Input("wanPma")]
        public Input<Inputs.SettingWanPmaArgs>? WanPma { get; set; }

        [Input("wiredPma")]
        public Input<Inputs.SettingWiredPmaArgs>? WiredPma { get; set; }

        [Input("wirelessPma")]
        public Input<Inputs.SettingWirelessPmaArgs>? WirelessPma { get; set; }

        public SettingArgs()
        {
        }
        public static new SettingArgs Empty => new SettingArgs();
    }

    public sealed class SettingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("apUpdownThreshold")]
        public Input<int>? ApUpdownThreshold { get; set; }

        [Input("apiPolicy")]
        public Input<Inputs.SettingApiPolicyGetArgs>? ApiPolicy { get; set; }

        [Input("cacerts")]
        private InputList<string>? _cacerts;

        /// <summary>
        /// List of PEM-encoded ca certs
        /// </summary>
        public InputList<string> Cacerts
        {
            get => _cacerts ?? (_cacerts = new InputList<string>());
            set => _cacerts = value;
        }

        [Input("celona")]
        public Input<Inputs.SettingCelonaGetArgs>? Celona { get; set; }

        [Input("cloudshark")]
        public Input<Inputs.SettingCloudsharkGetArgs>? Cloudshark { get; set; }

        [Input("cradlepoint")]
        public Input<Inputs.SettingCradlepointGetArgs>? Cradlepoint { get; set; }

        /// <summary>
        /// common device cert, optional
        /// </summary>
        [Input("deviceCert")]
        public Input<Inputs.SettingDeviceCertGetArgs>? DeviceCert { get; set; }

        /// <summary>
        /// Enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
        /// AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
        /// immediate)
        /// </summary>
        [Input("deviceUpdownThreshold")]
        public Input<int>? DeviceUpdownThreshold { get; set; }

        /// <summary>
        /// Whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
        /// </summary>
        [Input("disablePcap")]
        public Input<bool>? DisablePcap { get; set; }

        /// <summary>
        /// Whether to disable remote shell access for an entire org
        /// </summary>
        [Input("disableRemoteShell")]
        public Input<bool>? DisableRemoteShell { get; set; }

        /// <summary>
        /// Enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("gatewayUpdownThreshold")]
        public Input<int>? GatewayUpdownThreshold { get; set; }

        [Input("installer")]
        public Input<Inputs.SettingInstallerGetArgs>? Installer { get; set; }

        [Input("jcloud")]
        public Input<Inputs.SettingJcloudGetArgs>? Jcloud { get; set; }

        /// <summary>
        /// JCloud Routing Assurance connexion
        /// </summary>
        [Input("jcloudRa")]
        public Input<Inputs.SettingJcloudRaGetArgs>? JcloudRa { get; set; }

        [Input("juniper")]
        public Input<Inputs.SettingJuniperGetArgs>? Juniper { get; set; }

        /// <summary>
        /// management-related properties
        /// </summary>
        [Input("mgmt")]
        public Input<Inputs.SettingMgmtGetArgs>? Mgmt { get; set; }

        [Input("mistNac")]
        public Input<Inputs.SettingMistNacGetArgs>? MistNac { get; set; }

        [Input("mxedgeFipsEnabled")]
        public Input<bool>? MxedgeFipsEnabled { get; set; }

        [Input("mxedgeMgmt")]
        public Input<Inputs.SettingMxedgeMgmtGetArgs>? MxedgeMgmt { get; set; }

        [Input("opticPortConfig")]
        private InputMap<Inputs.SettingOpticPortConfigGetArgs>? _opticPortConfig;

        /// <summary>
        /// Property key is the interface name or range (e.g. `et-0/0/47`, `et-0/0/48-49`)
        /// </summary>
        public InputMap<Inputs.SettingOpticPortConfigGetArgs> OpticPortConfig
        {
            get => _opticPortConfig ?? (_opticPortConfig = new InputMap<Inputs.SettingOpticPortConfigGetArgs>());
            set => _opticPortConfig = value;
        }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// password policy
        /// </summary>
        [Input("passwordPolicy")]
        public Input<Inputs.SettingPasswordPolicyGetArgs>? PasswordPolicy { get; set; }

        [Input("pcap")]
        public Input<Inputs.SettingPcapGetArgs>? Pcap { get; set; }

        [Input("security")]
        public Input<Inputs.SettingSecurityGetArgs>? Security { get; set; }

        [Input("switchMgmt")]
        public Input<Inputs.SettingSwitchMgmtGetArgs>? SwitchMgmt { get; set; }

        /// <summary>
        /// Enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
        /// `device_updown_threshold` is ignored.
        /// </summary>
        [Input("switchUpdownThreshold")]
        public Input<int>? SwitchUpdownThreshold { get; set; }

        [Input("syntheticTest")]
        public Input<Inputs.SettingSyntheticTestGetArgs>? SyntheticTest { get; set; }

        /// <summary>
        /// Automatically logout the user when UI session is inactive. `0` means disabled
        /// </summary>
        [Input("uiIdleTimeout")]
        public Input<int>? UiIdleTimeout { get; set; }

        [Input("vpnOptions")]
        public Input<Inputs.SettingVpnOptionsGetArgs>? VpnOptions { get; set; }

        [Input("wanPma")]
        public Input<Inputs.SettingWanPmaGetArgs>? WanPma { get; set; }

        [Input("wiredPma")]
        public Input<Inputs.SettingWiredPmaGetArgs>? WiredPma { get; set; }

        [Input("wirelessPma")]
        public Input<Inputs.SettingWirelessPmaGetArgs>? WirelessPma { get; set; }

        public SettingState()
        {
        }
        public static new SettingState Empty => new SettingState();
    }
}
