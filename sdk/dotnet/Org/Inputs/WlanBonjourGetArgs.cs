// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanBonjourGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalVlanIds", required: true)]
        private InputList<string>? _additionalVlanIds;

        /// <summary>
        /// additional VLAN IDs (on the LAN side or from other WLANs) should we be forwarding bonjour queries/responses
        /// </summary>
        public InputList<string> AdditionalVlanIds
        {
            get => _additionalVlanIds ?? (_additionalVlanIds = new InputList<string>());
            set => _additionalVlanIds = value;
        }

        /// <summary>
        /// whether to enable bonjour for this WLAN. Once enabled, limit_bcast is assumed true, allow_mdns is assumed false
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("services", required: true)]
        private InputMap<Inputs.WlanBonjourServicesGetArgs>? _services;

        /// <summary>
        /// what services are allowed. 
        /// Property key is the service name
        /// </summary>
        public InputMap<Inputs.WlanBonjourServicesGetArgs> Services
        {
            get => _services ?? (_services = new InputMap<Inputs.WlanBonjourServicesGetArgs>());
            set => _services = value;
        }

        public WlanBonjourGetArgs()
        {
        }
        public static new WlanBonjourGetArgs Empty => new WlanBonjourGetArgs();
    }
}