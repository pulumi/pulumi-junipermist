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
    /// This resource manages the AP Device Profiles.AP Device profiles for aps are used to specify a configuration that can be applied to a select set of aps from any site in the organization. They allow for efficient application of configurations based on ap groups, wlan groups, RF settings, and sites. Device profiles enable various use cases such as activating ethernet passthrough, applying different rf settings, applying mesh configuration, activating specific features like esl or vble, and more.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using JuniperMist = Pulumi.JuniperMist;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var deviceprofileApOne = new JuniperMist.Org.DeviceprofileAp("deviceprofile_ap_one", new()
    ///     {
    ///         Name = "deviceprofile_ap_one",
    ///         OrgId = terraformTest.Id,
    ///         EslConfig = new JuniperMist.Org.Inputs.DeviceprofileApEslConfigArgs
    ///         {
    ///             Enabled = true,
    ///             Host = "1.2.3.4",
    ///             Type = "native",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/deviceprofileAp:DeviceprofileAp Using terraform import, import `mist_org_deviceprofile_ap` using the `import` command:
    /// ```
    /// 
    /// Gateway cluster can be imported by specifying the org_id and the deviceprofile_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/deviceprofileAp:DeviceprofileAp deviceprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// 
    /// In Terraform v1.5.0 and later, use an import block to import `mist_org_deviceprofile_ap` with `id={org_id}.{deviceprofile_id}`:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   to = mist_org_deviceprofile_ap.deviceprofile_one
    /// 
    ///   id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"
    /// 
    /// }
    /// </summary>
    [JuniperMistResourceType("junipermist:org/deviceprofileAp:DeviceprofileAp")]
    public partial class DeviceprofileAp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Aeroscout AP settings
        /// </summary>
        [Output("aeroscout")]
        public Output<Outputs.DeviceprofileApAeroscout?> Aeroscout { get; private set; } = null!;

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Output("bleConfig")]
        public Output<Outputs.DeviceprofileApBleConfig?> BleConfig { get; private set; } = null!;

        /// <summary>
        /// whether to disable eth1 port
        /// </summary>
        [Output("disableEth1")]
        public Output<bool> DisableEth1 { get; private set; } = null!;

        /// <summary>
        /// whether to disable eth2 port
        /// </summary>
        [Output("disableEth2")]
        public Output<bool> DisableEth2 { get; private set; } = null!;

        /// <summary>
        /// whether to disable eth3 port
        /// </summary>
        [Output("disableEth3")]
        public Output<bool> DisableEth3 { get; private set; } = null!;

        /// <summary>
        /// whether to disable module port
        /// </summary>
        [Output("disableModule")]
        public Output<bool> DisableModule { get; private set; } = null!;

        [Output("eslConfig")]
        public Output<Outputs.DeviceprofileApEslConfig?> EslConfig { get; private set; } = null!;

        /// <summary>
        /// IP AP settings
        /// </summary>
        [Output("ipConfig")]
        public Output<Outputs.DeviceprofileApIpConfig?> IpConfig { get; private set; } = null!;

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Output("led")]
        public Output<Outputs.DeviceprofileApLed?> Led { get; private set; } = null!;

        /// <summary>
        /// Mesh AP settings
        /// </summary>
        [Output("mesh")]
        public Output<Outputs.DeviceprofileApMesh?> Mesh { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("ntpServers")]
        public Output<ImmutableArray<string>> NtpServers { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
        /// </summary>
        [Output("poePassthrough")]
        public Output<bool> PoePassthrough { get; private set; } = null!;

        /// <summary>
        /// power related configs
        /// </summary>
        [Output("pwrConfig")]
        public Output<Outputs.DeviceprofileApPwrConfig?> PwrConfig { get; private set; } = null!;

        /// <summary>
        /// Radio AP settings
        /// </summary>
        [Output("radioConfig")]
        public Output<Outputs.DeviceprofileApRadioConfig?> RadioConfig { get; private set; } = null!;

        [Output("siteId")]
        public Output<string?> SiteId { get; private set; } = null!;

        /// <summary>
        /// Device Type. enum: `ap`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("uplinkPortConfig")]
        public Output<Outputs.DeviceprofileApUplinkPortConfig?> UplinkPortConfig { get; private set; } = null!;

        /// <summary>
        /// USB AP settings
        /// Note: if native imagotag is enabled, BLE will be disabled automatically
        /// Note: legacy, new config moved to ESL Config.
        /// </summary>
        [Output("usbConfig")]
        public Output<Outputs.DeviceprofileApUsbConfig?> UsbConfig { get; private set; } = null!;

        /// <summary>
        /// a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
        /// </summary>
        [Output("vars")]
        public Output<ImmutableDictionary<string, string>?> Vars { get; private set; } = null!;


        /// <summary>
        /// Create a DeviceprofileAp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeviceprofileAp(string name, DeviceprofileApArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/deviceprofileAp:DeviceprofileAp", name, args ?? new DeviceprofileApArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeviceprofileAp(string name, Input<string> id, DeviceprofileApState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/deviceprofileAp:DeviceprofileAp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeviceprofileAp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeviceprofileAp Get(string name, Input<string> id, DeviceprofileApState? state = null, CustomResourceOptions? options = null)
        {
            return new DeviceprofileAp(name, id, state, options);
        }
    }

    public sealed class DeviceprofileApArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aeroscout AP settings
        /// </summary>
        [Input("aeroscout")]
        public Input<Inputs.DeviceprofileApAeroscoutArgs>? Aeroscout { get; set; }

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Input("bleConfig")]
        public Input<Inputs.DeviceprofileApBleConfigArgs>? BleConfig { get; set; }

        /// <summary>
        /// whether to disable eth1 port
        /// </summary>
        [Input("disableEth1")]
        public Input<bool>? DisableEth1 { get; set; }

        /// <summary>
        /// whether to disable eth2 port
        /// </summary>
        [Input("disableEth2")]
        public Input<bool>? DisableEth2 { get; set; }

        /// <summary>
        /// whether to disable eth3 port
        /// </summary>
        [Input("disableEth3")]
        public Input<bool>? DisableEth3 { get; set; }

        /// <summary>
        /// whether to disable module port
        /// </summary>
        [Input("disableModule")]
        public Input<bool>? DisableModule { get; set; }

        [Input("eslConfig")]
        public Input<Inputs.DeviceprofileApEslConfigArgs>? EslConfig { get; set; }

        /// <summary>
        /// IP AP settings
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.DeviceprofileApIpConfigArgs>? IpConfig { get; set; }

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Input("led")]
        public Input<Inputs.DeviceprofileApLedArgs>? Led { get; set; }

        /// <summary>
        /// Mesh AP settings
        /// </summary>
        [Input("mesh")]
        public Input<Inputs.DeviceprofileApMeshArgs>? Mesh { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("ntpServers")]
        private InputList<string>? _ntpServers;
        public InputList<string> NtpServers
        {
            get => _ntpServers ?? (_ntpServers = new InputList<string>());
            set => _ntpServers = value;
        }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
        /// </summary>
        [Input("poePassthrough")]
        public Input<bool>? PoePassthrough { get; set; }

        /// <summary>
        /// power related configs
        /// </summary>
        [Input("pwrConfig")]
        public Input<Inputs.DeviceprofileApPwrConfigArgs>? PwrConfig { get; set; }

        /// <summary>
        /// Radio AP settings
        /// </summary>
        [Input("radioConfig")]
        public Input<Inputs.DeviceprofileApRadioConfigArgs>? RadioConfig { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("uplinkPortConfig")]
        public Input<Inputs.DeviceprofileApUplinkPortConfigArgs>? UplinkPortConfig { get; set; }

        /// <summary>
        /// USB AP settings
        /// Note: if native imagotag is enabled, BLE will be disabled automatically
        /// Note: legacy, new config moved to ESL Config.
        /// </summary>
        [Input("usbConfig")]
        public Input<Inputs.DeviceprofileApUsbConfigArgs>? UsbConfig { get; set; }

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

        public DeviceprofileApArgs()
        {
        }
        public static new DeviceprofileApArgs Empty => new DeviceprofileApArgs();
    }

    public sealed class DeviceprofileApState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Aeroscout AP settings
        /// </summary>
        [Input("aeroscout")]
        public Input<Inputs.DeviceprofileApAeroscoutGetArgs>? Aeroscout { get; set; }

        /// <summary>
        /// BLE AP settings
        /// </summary>
        [Input("bleConfig")]
        public Input<Inputs.DeviceprofileApBleConfigGetArgs>? BleConfig { get; set; }

        /// <summary>
        /// whether to disable eth1 port
        /// </summary>
        [Input("disableEth1")]
        public Input<bool>? DisableEth1 { get; set; }

        /// <summary>
        /// whether to disable eth2 port
        /// </summary>
        [Input("disableEth2")]
        public Input<bool>? DisableEth2 { get; set; }

        /// <summary>
        /// whether to disable eth3 port
        /// </summary>
        [Input("disableEth3")]
        public Input<bool>? DisableEth3 { get; set; }

        /// <summary>
        /// whether to disable module port
        /// </summary>
        [Input("disableModule")]
        public Input<bool>? DisableModule { get; set; }

        [Input("eslConfig")]
        public Input<Inputs.DeviceprofileApEslConfigGetArgs>? EslConfig { get; set; }

        /// <summary>
        /// IP AP settings
        /// </summary>
        [Input("ipConfig")]
        public Input<Inputs.DeviceprofileApIpConfigGetArgs>? IpConfig { get; set; }

        /// <summary>
        /// LED AP settings
        /// </summary>
        [Input("led")]
        public Input<Inputs.DeviceprofileApLedGetArgs>? Led { get; set; }

        /// <summary>
        /// Mesh AP settings
        /// </summary>
        [Input("mesh")]
        public Input<Inputs.DeviceprofileApMeshGetArgs>? Mesh { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
        /// </summary>
        [Input("poePassthrough")]
        public Input<bool>? PoePassthrough { get; set; }

        /// <summary>
        /// power related configs
        /// </summary>
        [Input("pwrConfig")]
        public Input<Inputs.DeviceprofileApPwrConfigGetArgs>? PwrConfig { get; set; }

        /// <summary>
        /// Radio AP settings
        /// </summary>
        [Input("radioConfig")]
        public Input<Inputs.DeviceprofileApRadioConfigGetArgs>? RadioConfig { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        /// <summary>
        /// Device Type. enum: `ap`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("uplinkPortConfig")]
        public Input<Inputs.DeviceprofileApUplinkPortConfigGetArgs>? UplinkPortConfig { get; set; }

        /// <summary>
        /// USB AP settings
        /// Note: if native imagotag is enabled, BLE will be disabled automatically
        /// Note: legacy, new config moved to ESL Config.
        /// </summary>
        [Input("usbConfig")]
        public Input<Inputs.DeviceprofileApUsbConfigGetArgs>? UsbConfig { get; set; }

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

        public DeviceprofileApState()
        {
        }
        public static new DeviceprofileApState Empty => new DeviceprofileApState();
    }
}
