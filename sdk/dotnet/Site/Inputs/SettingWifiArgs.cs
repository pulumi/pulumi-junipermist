// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingWifiArgs : global::Pulumi.ResourceArgs
    {
        [Input("ciscoEnabled")]
        public Input<bool>? CiscoEnabled { get; set; }

        /// <summary>
        /// whether to disable 11k
        /// </summary>
        [Input("disable11k")]
        public Input<bool>? Disable11k { get; set; }

        [Input("disableRadiosWhenPowerConstrained")]
        public Input<bool>? DisableRadiosWhenPowerConstrained { get; set; }

        /// <summary>
        /// when proxy_arp is enabled, check for arp spoofing.
        /// </summary>
        [Input("enableArpSpoofCheck")]
        public Input<bool>? EnableArpSpoofCheck { get; set; }

        [Input("enableSharedRadioScanning")]
        public Input<bool>? EnableSharedRadioScanning { get; set; }

        /// <summary>
        /// enable WIFI feature (using SUB-MAN license)
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// whether to locate connected clients
        /// </summary>
        [Input("locateConnected")]
        public Input<bool>? LocateConnected { get; set; }

        /// <summary>
        /// whether to locate unconnected clients
        /// </summary>
        [Input("locateUnconnected")]
        public Input<bool>? LocateUnconnected { get; set; }

        /// <summary>
        /// whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will distrupt the connection. If roaming is desired, keep it disabled.
        /// </summary>
        [Input("meshAllowDfs")]
        public Input<bool>? MeshAllowDfs { get; set; }

        /// <summary>
        /// used to enable/disable CRM
        /// </summary>
        [Input("meshEnableCrm")]
        public Input<bool>? MeshEnableCrm { get; set; }

        /// <summary>
        /// whether to enable Mesh feature for the site
        /// </summary>
        [Input("meshEnabled")]
        public Input<bool>? MeshEnabled { get; set; }

        [Input("meshPsk")]
        private Input<string>? _meshPsk;

        /// <summary>
        /// optional passphrase of mesh networking, default is generated randomly
        /// </summary>
        public Input<string>? MeshPsk
        {
            get => _meshPsk;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _meshPsk = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// optional ssid of mesh networking, default is based on site_id
        /// </summary>
        [Input("meshSsid")]
        public Input<string>? MeshSsid { get; set; }

        /// <summary>
        /// enum: `default`, `disabled`, `enabled`
        /// </summary>
        [Input("proxyArp")]
        public Input<string>? ProxyArp { get; set; }

        public SettingWifiArgs()
        {
        }
        public static new SettingWifiArgs Empty => new SettingWifiArgs();
    }
}