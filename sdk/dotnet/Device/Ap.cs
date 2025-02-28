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
    /// This resource manages the Wireless Access Point configuration.
    /// 
    /// It can be used to define specific configuration at the device level or to override AP Device Profile (`junipermist.org.DeviceprofileAp`).
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_device_ap` with:
    /// 
    /// AP Configuration can be imported by specifying the site_id and the device_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:device/ap:Ap ap_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:device/ap:Ap")]
    public partial class Ap : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Aeroscout AP settings
        /// </summary>
        [Output("aeroscout")]
        public Output<Outputs.ApAeroscout?> Aeroscout { get; private set; } = null!;

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Output("bleConfig")]
        public Output<Outputs.ApBleConfig?> BleConfig { get; private set; } = null!;

        [Output("centrak")]
        public Output<Outputs.ApCentrak?> Centrak { get; private set; } = null!;

        [Output("clientBridge")]
        public Output<Outputs.ApClientBridge?> ClientBridge { get; private set; } = null!;

        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        /// <summary>
        /// Whether to disable eth1 port
        /// </summary>
        [Output("disableEth1")]
        public Output<bool> DisableEth1 { get; private set; } = null!;

        /// <summary>
        /// Whether to disable eth2 port
        /// </summary>
        [Output("disableEth2")]
        public Output<bool> DisableEth2 { get; private set; } = null!;

        /// <summary>
        /// Whether to disable eth3 port
        /// </summary>
        [Output("disableEth3")]
        public Output<bool> DisableEth3 { get; private set; } = null!;

        /// <summary>
        /// Whether to disable module port
        /// </summary>
        [Output("disableModule")]
        public Output<bool> DisableModule { get; private set; } = null!;

        [Output("eslConfig")]
        public Output<Outputs.ApEslConfig?> EslConfig { get; private set; } = null!;

        /// <summary>
        /// For some AP models, flow_control can be enabled to address some switch compatibility issue
        /// </summary>
        [Output("flowControl")]
        public Output<bool> FlowControl { get; private set; } = null!;

        /// <summary>
        /// Height, in meters, optional
        /// </summary>
        [Output("height")]
        public Output<double?> Height { get; private set; } = null!;

        [Output("image1Url")]
        public Output<string> Image1Url { get; private set; } = null!;

        [Output("image2Url")]
        public Output<string> Image2Url { get; private set; } = null!;

        [Output("image3Url")]
        public Output<string> Image3Url { get; private set; } = null!;

        /// <summary>
        /// IP AP settings
        /// </summary>
        [Output("ipConfig")]
        public Output<Outputs.ApIpConfig?> IpConfig { get; private set; } = null!;

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Output("led")]
        public Output<Outputs.ApLed?> Led { get; private set; } = null!;

        /// <summary>
        /// Whether this map is considered locked down
        /// </summary>
        [Output("locked")]
        public Output<bool?> Locked { get; private set; } = null!;

        /// <summary>
        /// Device MAC address
        /// </summary>
        [Output("mac")]
        public Output<string> Mac { get; private set; } = null!;

        /// <summary>
        /// Map where the device belongs to
        /// </summary>
        [Output("mapId")]
        public Output<string?> MapId { get; private set; } = null!;

        /// <summary>
        /// Mesh AP settings
        /// </summary>
        [Output("mesh")]
        public Output<Outputs.ApMesh?> Mesh { get; private set; } = null!;

        /// <summary>
        /// Device Model
        /// </summary>
        [Output("model")]
        public Output<string> Model { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Any notes about this AP
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        [Output("ntpServers")]
        public Output<ImmutableArray<string>> NtpServers { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Orientation, 0-359, in degrees, up is 0, right is 90.
        /// </summary>
        [Output("orientation")]
        public Output<int?> Orientation { get; private set; } = null!;

        /// <summary>
        /// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
        /// </summary>
        [Output("poePassthrough")]
        public Output<bool> PoePassthrough { get; private set; } = null!;

        /// <summary>
        /// Power related configs
        /// </summary>
        [Output("pwrConfig")]
        public Output<Outputs.ApPwrConfig?> PwrConfig { get; private set; } = null!;

        /// <summary>
        /// Radio AP settings
        /// </summary>
        [Output("radioConfig")]
        public Output<Outputs.ApRadioConfig?> RadioConfig { get; private set; } = null!;

        /// <summary>
        /// Device Serial
        /// </summary>
        [Output("serial")]
        public Output<string> Serial { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;

        /// <summary>
        /// Device Type. enum: `ap`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// AP Uplink port configuration
        /// </summary>
        [Output("uplinkPortConfig")]
        public Output<Outputs.ApUplinkPortConfig?> UplinkPortConfig { get; private set; } = null!;

        /// <summary>
        /// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
        /// moved to ESL Config.
        /// </summary>
        [Output("usbConfig")]
        public Output<Outputs.ApUsbConfig?> UsbConfig { get; private set; } = null!;

        /// <summary>
        /// Dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        [Output("vars")]
        public Output<ImmutableDictionary<string, string>?> Vars { get; private set; } = null!;

        /// <summary>
        /// X in pixel
        /// </summary>
        [Output("x")]
        public Output<double?> X { get; private set; } = null!;

        /// <summary>
        /// Y in pixel
        /// </summary>
        [Output("y")]
        public Output<double?> Y { get; private set; } = null!;


        /// <summary>
        /// Create a Ap resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ap(string name, ApArgs args, CustomResourceOptions? options = null)
            : base("junipermist:device/ap:Ap", name, args ?? new ApArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ap(string name, Input<string> id, ApState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:device/ap:Ap", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Ap resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ap Get(string name, Input<string> id, ApState? state = null, CustomResourceOptions? options = null)
        {
            return new Ap(name, id, state, options);
        }
    }

    public sealed class ApArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aeroscout AP settings
        /// </summary>
        [Input("aeroscout")]
        public Input<Inputs.ApAeroscoutArgs>? Aeroscout { get; set; }

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Input("bleConfig")]
        public Input<Inputs.ApBleConfigArgs>? BleConfig { get; set; }

        [Input("centrak")]
        public Input<Inputs.ApCentrakArgs>? Centrak { get; set; }

        [Input("clientBridge")]
        public Input<Inputs.ApClientBridgeArgs>? ClientBridge { get; set; }

        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        /// <summary>
        /// Whether to disable eth1 port
        /// </summary>
        [Input("disableEth1")]
        public Input<bool>? DisableEth1 { get; set; }

        /// <summary>
        /// Whether to disable eth2 port
        /// </summary>
        [Input("disableEth2")]
        public Input<bool>? DisableEth2 { get; set; }

        /// <summary>
        /// Whether to disable eth3 port
        /// </summary>
        [Input("disableEth3")]
        public Input<bool>? DisableEth3 { get; set; }

        /// <summary>
        /// Whether to disable module port
        /// </summary>
        [Input("disableModule")]
        public Input<bool>? DisableModule { get; set; }

        [Input("eslConfig")]
        public Input<Inputs.ApEslConfigArgs>? EslConfig { get; set; }

        /// <summary>
        /// For some AP models, flow_control can be enabled to address some switch compatibility issue
        /// </summary>
        [Input("flowControl")]
        public Input<bool>? FlowControl { get; set; }

        /// <summary>
        /// Height, in meters, optional
        /// </summary>
        [Input("height")]
        public Input<double>? Height { get; set; }

        /// <summary>
        /// IP AP settings
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.ApIpConfigArgs>? IpConfig { get; set; }

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Input("led")]
        public Input<Inputs.ApLedArgs>? Led { get; set; }

        /// <summary>
        /// Whether this map is considered locked down
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Map where the device belongs to
        /// </summary>
        [Input("mapId")]
        public Input<string>? MapId { get; set; }

        /// <summary>
        /// Mesh AP settings
        /// </summary>
        [Input("mesh")]
        public Input<Inputs.ApMeshArgs>? Mesh { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any notes about this AP
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        /// <summary>
        /// Orientation, 0-359, in degrees, up is 0, right is 90.
        /// </summary>
        [Input("orientation")]
        public Input<int>? Orientation { get; set; }

        /// <summary>
        /// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
        /// </summary>
        [Input("poePassthrough")]
        public Input<bool>? PoePassthrough { get; set; }

        /// <summary>
        /// Power related configs
        /// </summary>
        [Input("pwrConfig")]
        public Input<Inputs.ApPwrConfigArgs>? PwrConfig { get; set; }

        /// <summary>
        /// Radio AP settings
        /// </summary>
        [Input("radioConfig")]
        public Input<Inputs.ApRadioConfigArgs>? RadioConfig { get; set; }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        /// <summary>
        /// AP Uplink port configuration
        /// </summary>
        [Input("uplinkPortConfig")]
        public Input<Inputs.ApUplinkPortConfigArgs>? UplinkPortConfig { get; set; }

        /// <summary>
        /// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
        /// moved to ESL Config.
        /// </summary>
        [Input("usbConfig")]
        public Input<Inputs.ApUsbConfigArgs>? UsbConfig { get; set; }

        [Input("vars")]
        private InputMap<string>? _vars;

        /// <summary>
        /// Dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        public InputMap<string> Vars
        {
            get => _vars ?? (_vars = new InputMap<string>());
            set => _vars = value;
        }

        /// <summary>
        /// X in pixel
        /// </summary>
        [Input("x")]
        public Input<double>? X { get; set; }

        /// <summary>
        /// Y in pixel
        /// </summary>
        [Input("y")]
        public Input<double>? Y { get; set; }

        public ApArgs()
        {
        }
        public static new ApArgs Empty => new ApArgs();
    }

    public sealed class ApState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aeroscout AP settings
        /// </summary>
        [Input("aeroscout")]
        public Input<Inputs.ApAeroscoutGetArgs>? Aeroscout { get; set; }

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Input("bleConfig")]
        public Input<Inputs.ApBleConfigGetArgs>? BleConfig { get; set; }

        [Input("centrak")]
        public Input<Inputs.ApCentrakGetArgs>? Centrak { get; set; }

        [Input("clientBridge")]
        public Input<Inputs.ApClientBridgeGetArgs>? ClientBridge { get; set; }

        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// Whether to disable eth1 port
        /// </summary>
        [Input("disableEth1")]
        public Input<bool>? DisableEth1 { get; set; }

        /// <summary>
        /// Whether to disable eth2 port
        /// </summary>
        [Input("disableEth2")]
        public Input<bool>? DisableEth2 { get; set; }

        /// <summary>
        /// Whether to disable eth3 port
        /// </summary>
        [Input("disableEth3")]
        public Input<bool>? DisableEth3 { get; set; }

        /// <summary>
        /// Whether to disable module port
        /// </summary>
        [Input("disableModule")]
        public Input<bool>? DisableModule { get; set; }

        [Input("eslConfig")]
        public Input<Inputs.ApEslConfigGetArgs>? EslConfig { get; set; }

        /// <summary>
        /// For some AP models, flow_control can be enabled to address some switch compatibility issue
        /// </summary>
        [Input("flowControl")]
        public Input<bool>? FlowControl { get; set; }

        /// <summary>
        /// Height, in meters, optional
        /// </summary>
        [Input("height")]
        public Input<double>? Height { get; set; }

        [Input("image1Url")]
        public Input<string>? Image1Url { get; set; }

        [Input("image2Url")]
        public Input<string>? Image2Url { get; set; }

        [Input("image3Url")]
        public Input<string>? Image3Url { get; set; }

        /// <summary>
        /// IP AP settings
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.ApIpConfigGetArgs>? IpConfig { get; set; }

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Input("led")]
        public Input<Inputs.ApLedGetArgs>? Led { get; set; }

        /// <summary>
        /// Whether this map is considered locked down
        /// </summary>
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        /// <summary>
        /// Device MAC address
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// Map where the device belongs to
        /// </summary>
        [Input("mapId")]
        public Input<string>? MapId { get; set; }

        /// <summary>
        /// Mesh AP settings
        /// </summary>
        [Input("mesh")]
        public Input<Inputs.ApMeshGetArgs>? Mesh { get; set; }

        /// <summary>
        /// Device Model
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Any notes about this AP
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Orientation, 0-359, in degrees, up is 0, right is 90.
        /// </summary>
        [Input("orientation")]
        public Input<int>? Orientation { get; set; }

        /// <summary>
        /// Whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
        /// </summary>
        [Input("poePassthrough")]
        public Input<bool>? PoePassthrough { get; set; }

        /// <summary>
        /// Power related configs
        /// </summary>
        [Input("pwrConfig")]
        public Input<Inputs.ApPwrConfigGetArgs>? PwrConfig { get; set; }

        /// <summary>
        /// Radio AP settings
        /// </summary>
        [Input("radioConfig")]
        public Input<Inputs.ApRadioConfigGetArgs>? RadioConfig { get; set; }

        /// <summary>
        /// Device Serial
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        /// <summary>
        /// Device Type. enum: `ap`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// AP Uplink port configuration
        /// </summary>
        [Input("uplinkPortConfig")]
        public Input<Inputs.ApUplinkPortConfigGetArgs>? UplinkPortConfig { get; set; }

        /// <summary>
        /// USB AP settings - Note: if native imagotag is enabled, BLE will be disabled automatically - Note: legacy, new config
        /// moved to ESL Config.
        /// </summary>
        [Input("usbConfig")]
        public Input<Inputs.ApUsbConfigGetArgs>? UsbConfig { get; set; }

        [Input("vars")]
        private InputMap<string>? _vars;

        /// <summary>
        /// Dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        public InputMap<string> Vars
        {
            get => _vars ?? (_vars = new InputMap<string>());
            set => _vars = value;
        }

        /// <summary>
        /// X in pixel
        /// </summary>
        [Input("x")]
        public Input<double>? X { get; set; }

        /// <summary>
        /// Y in pixel
        /// </summary>
        [Input("y")]
        public Input<double>? Y { get; set; }

        public ApState()
        {
        }
        public static new ApState Empty => new ApState();
    }
}
