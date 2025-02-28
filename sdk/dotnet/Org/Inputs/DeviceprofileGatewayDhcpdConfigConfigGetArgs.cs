// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayDhcpdConfigConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dnsServers")]
        private InputList<string>? _dnsServers;

        /// <summary>
        /// If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
        /// </summary>
        public InputList<string> DnsServers
        {
            get => _dnsServers ?? (_dnsServers = new InputList<string>());
            set => _dnsServers = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// If `type`==`local` or `type6`==`local` - optional, if not defined, system one will be used
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        [Input("fixedBindings")]
        private InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigFixedBindingsGetArgs>? _fixedBindings;

        /// <summary>
        /// If `type`==`local` or `type6`==`local`. Property key is the MAC Address. Format is `[0-9a-f]{12}` (e.g "5684dae9ac8b")
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigFixedBindingsGetArgs> FixedBindings
        {
            get => _fixedBindings ?? (_fixedBindings = new InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigFixedBindingsGetArgs>());
            set => _fixedBindings = value;
        }

        /// <summary>
        /// If `type`==`local` - optional, `ip` will be used if not provided
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// If `type`==`local`
        /// </summary>
        [Input("ipEnd")]
        public Input<string>? IpEnd { get; set; }

        /// <summary>
        /// If `type6`==`local`
        /// </summary>
        [Input("ipEnd6")]
        public Input<string>? IpEnd6 { get; set; }

        /// <summary>
        /// If `type`==`local`
        /// </summary>
        [Input("ipStart")]
        public Input<string>? IpStart { get; set; }

        /// <summary>
        /// If `type6`==`local`
        /// </summary>
        [Input("ipStart6")]
        public Input<string>? IpStart6 { get; set; }

        /// <summary>
        /// In seconds, lease time has to be between 3600 [1hr] - 604800 [1 week], default is 86400 [1 day]
        /// </summary>
        [Input("leaseTime")]
        public Input<int>? LeaseTime { get; set; }

        [Input("options")]
        private InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigOptionsGetArgs>? _options;

        /// <summary>
        /// If `type`==`local` or `type6`==`local`. Property key is the DHCP option number
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigOptionsGetArgs> Options
        {
            get => _options ?? (_options = new InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigOptionsGetArgs>());
            set => _options = value;
        }

        /// <summary>
        /// `server_id_override`==`true` means the device, when acts as DHCP relay and forwards DHCP responses from DHCP server to clients, 
        /// should overwrite the Sever Identifier option (i.e. DHCP option 54) in DHCP responses with its own IP address.
        /// </summary>
        [Input("serverIdOverride")]
        public Input<bool>? ServerIdOverride { get; set; }

        [Input("servers")]
        private InputList<string>? _servers;

        /// <summary>
        /// If `type`==`relay`
        /// </summary>
        public InputList<string> Servers
        {
            get => _servers ?? (_servers = new InputList<string>());
            set => _servers = value;
        }

        [Input("servers6s")]
        private InputList<string>? _servers6s;

        /// <summary>
        /// If `type6`==`relay`
        /// </summary>
        public InputList<string> Servers6s
        {
            get => _servers6s ?? (_servers6s = new InputList<string>());
            set => _servers6s = value;
        }

        /// <summary>
        /// enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// enum: `local` (DHCP Server), `none`, `relay` (DHCP Relay)
        /// </summary>
        [Input("type6")]
        public Input<string>? Type6 { get; set; }

        [Input("vendorEncapsulated")]
        private InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigVendorEncapsulatedGetArgs>? _vendorEncapsulated;

        /// <summary>
        /// If `type`==`local` or `type6`==`local`. Property key is &lt;enterprise number&gt;:&lt;sub option code&gt;, with
        ///   * enterprise number: 1-65535 (https://www.iana.org/assignments/enterprise-numbers/enterprise-numbers)
        ///   * sub option code: 1-255, sub-option code
        /// </summary>
        public InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigVendorEncapsulatedGetArgs> VendorEncapsulated
        {
            get => _vendorEncapsulated ?? (_vendorEncapsulated = new InputMap<Inputs.DeviceprofileGatewayDhcpdConfigConfigVendorEncapsulatedGetArgs>());
            set => _vendorEncapsulated = value;
        }

        public DeviceprofileGatewayDhcpdConfigConfigGetArgs()
        {
        }
        public static new DeviceprofileGatewayDhcpdConfigConfigGetArgs Empty => new DeviceprofileGatewayDhcpdConfigConfigGetArgs();
    }
}
