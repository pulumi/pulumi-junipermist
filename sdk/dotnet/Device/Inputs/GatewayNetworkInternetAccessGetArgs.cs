// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayNetworkInternetAccessGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("createSimpleServicePolicy")]
        public Input<bool>? CreateSimpleServicePolicy { get; set; }

        [Input("destinationNat")]
        private InputMap<Inputs.GatewayNetworkInternetAccessDestinationNatGetArgs>? _destinationNat;

        /// <summary>
        /// Property key can be an External IP (i.e. "63.16.0.3"), an External IP:Port (i.e. "63.16.0.3:443"), an External Port (i.e. ":443"), an External CIDR (i.e. "63.16.0.0/30"), an External CIDR:Port (i.e. "63.16.0.0/30:443") or a Variable (i.e. "{{myvar}}"). At least one of the `internal_ip` or `port` must be defined
        /// </summary>
        public InputMap<Inputs.GatewayNetworkInternetAccessDestinationNatGetArgs> DestinationNat
        {
            get => _destinationNat ?? (_destinationNat = new InputMap<Inputs.GatewayNetworkInternetAccessDestinationNatGetArgs>());
            set => _destinationNat = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// By default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
        /// </summary>
        [Input("restricted")]
        public Input<bool>? Restricted { get; set; }

        [Input("staticNat")]
        private InputMap<Inputs.GatewayNetworkInternetAccessStaticNatGetArgs>? _staticNat;

        /// <summary>
        /// Property key may be an External IP Address (i.e. "63.16.0.3"), a CIDR (i.e. "63.16.0.12/20") or a Variable (i.e. "{{myvar}}")
        /// </summary>
        public InputMap<Inputs.GatewayNetworkInternetAccessStaticNatGetArgs> StaticNat
        {
            get => _staticNat ?? (_staticNat = new InputMap<Inputs.GatewayNetworkInternetAccessStaticNatGetArgs>());
            set => _staticNat = value;
        }

        public GatewayNetworkInternetAccessGetArgs()
        {
        }
        public static new GatewayNetworkInternetAccessGetArgs Empty => new GatewayNetworkInternetAccessGetArgs();
    }
}
