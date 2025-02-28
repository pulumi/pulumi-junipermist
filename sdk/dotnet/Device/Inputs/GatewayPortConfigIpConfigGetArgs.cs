// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayPortConfigIpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("dns")]
        private InputList<string>? _dns;

        /// <summary>
        /// Except for out-of_band interface (vme/em0/fxp0)
        /// </summary>
        public InputList<string> Dns
        {
            get => _dns ?? (_dns = new InputList<string>());
            set => _dns = value;
        }

        [Input("dnsSuffixes")]
        private InputList<string>? _dnsSuffixes;

        /// <summary>
        /// Except for out-of_band interface (vme/em0/fxp0)
        /// </summary>
        public InputList<string> DnsSuffixes
        {
            get => _dnsSuffixes ?? (_dnsSuffixes = new InputList<string>());
            set => _dnsSuffixes = value;
        }

        /// <summary>
        /// Except for out-of_band interface (vme/em0/fxp0). Interface Default Gateway IP Address (i.e. "192.168.1.1") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// Interface IP Address (i.e. "192.168.1.8") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        [Input("ip")]
        public Input<string>? Ip { get; set; }

        /// <summary>
        /// Used only if `subnet` is not specified in `networks`. Interface Netmask (i.e. "/24") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        [Input("netmask")]
        public Input<string>? Netmask { get; set; }

        /// <summary>
        /// Optional, the network to be used for mgmt
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("poserPassword")]
        private Input<string>? _poserPassword;

        /// <summary>
        /// If `type`==`pppoe`
        /// </summary>
        public Input<string>? PoserPassword
        {
            get => _poserPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _poserPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// if `type`==`pppoe`. enum: `chap`, `none`, `pap`
        /// </summary>
        [Input("pppoeAuth")]
        public Input<string>? PppoeAuth { get; set; }

        /// <summary>
        /// If `type`==`pppoe`
        /// </summary>
        [Input("pppoeUsername")]
        public Input<string>? PppoeUsername { get; set; }

        /// <summary>
        /// enum: `dhcp`, `pppoe`, `static`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GatewayPortConfigIpConfigGetArgs()
        {
        }
        public static new GatewayPortConfigIpConfigGetArgs Empty => new GatewayPortConfigIpConfigGetArgs();
    }
}
