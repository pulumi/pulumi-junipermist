// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class SettingWifi
    {
        public readonly bool? CiscoEnabled;
        /// <summary>
        /// whether to disable 11k
        /// </summary>
        public readonly bool? Disable11k;
        public readonly bool? DisableRadiosWhenPowerConstrained;
        /// <summary>
        /// when proxy_arp is enabled, check for arp spoofing.
        /// </summary>
        public readonly bool? EnableArpSpoofCheck;
        public readonly bool? EnableSharedRadioScanning;
        /// <summary>
        /// enable WIFI feature (using SUB-MAN license)
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// whether to locate connected clients
        /// </summary>
        public readonly bool? LocateConnected;
        /// <summary>
        /// whether to locate unconnected clients
        /// </summary>
        public readonly bool? LocateUnconnected;
        /// <summary>
        /// whether to allow Mesh to use DFS channels. For DFS channels, Remote Mesh AP would have to do CAC when scanning for new Base AP, which is slow and will distrupt the connection. If roaming is desired, keep it disabled.
        /// </summary>
        public readonly bool? MeshAllowDfs;
        /// <summary>
        /// used to enable/disable CRM
        /// </summary>
        public readonly bool? MeshEnableCrm;
        /// <summary>
        /// whether to enable Mesh feature for the site
        /// </summary>
        public readonly bool? MeshEnabled;
        /// <summary>
        /// optional passphrase of mesh networking, default is generated randomly
        /// </summary>
        public readonly string? MeshPsk;
        /// <summary>
        /// optional ssid of mesh networking, default is based on site_id
        /// </summary>
        public readonly string? MeshSsid;
        /// <summary>
        /// enum: `default`, `disabled`, `enabled`
        /// </summary>
        public readonly string? ProxyArp;

        [OutputConstructor]
        private SettingWifi(
            bool? ciscoEnabled,

            bool? disable11k,

            bool? disableRadiosWhenPowerConstrained,

            bool? enableArpSpoofCheck,

            bool? enableSharedRadioScanning,

            bool? enabled,

            bool? locateConnected,

            bool? locateUnconnected,

            bool? meshAllowDfs,

            bool? meshEnableCrm,

            bool? meshEnabled,

            string? meshPsk,

            string? meshSsid,

            string? proxyArp)
        {
            CiscoEnabled = ciscoEnabled;
            Disable11k = disable11k;
            DisableRadiosWhenPowerConstrained = disableRadiosWhenPowerConstrained;
            EnableArpSpoofCheck = enableArpSpoofCheck;
            EnableSharedRadioScanning = enableSharedRadioScanning;
            Enabled = enabled;
            LocateConnected = locateConnected;
            LocateUnconnected = locateUnconnected;
            MeshAllowDfs = meshAllowDfs;
            MeshEnableCrm = meshEnableCrm;
            MeshEnabled = meshEnabled;
            MeshPsk = meshPsk;
            MeshSsid = meshSsid;
            ProxyArp = proxyArp;
        }
    }
}