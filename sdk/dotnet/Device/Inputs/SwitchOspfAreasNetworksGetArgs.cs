// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchOspfAreasNetworksGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authKeys")]
        private InputMap<string>? _authKeys;

        /// <summary>
        /// Required if `auth_type`==`md5`. Property key is the key number
        /// </summary>
        public InputMap<string> AuthKeys
        {
            get => _authKeys ?? (_authKeys = new InputMap<string>());
            set => _authKeys = value;
        }

        /// <summary>
        /// Required if `auth_type`==`password`, the password, max length is 8
        /// </summary>
        [Input("authPassword")]
        public Input<string>? AuthPassword { get; set; }

        /// <summary>
        /// auth type. enum: `md5`, `none`, `password`
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        [Input("bfdMinimumInterval")]
        public Input<int>? BfdMinimumInterval { get; set; }

        [Input("deadInterval")]
        public Input<int>? DeadInterval { get; set; }

        [Input("exportPolicy")]
        public Input<string>? ExportPolicy { get; set; }

        [Input("helloInterval")]
        public Input<int>? HelloInterval { get; set; }

        [Input("importPolicy")]
        public Input<string>? ImportPolicy { get; set; }

        /// <summary>
        /// interface type (nbma = non-broadcast multi-access). enum: `broadcast`, `nbma`, `p2mp`, `p2p`
        /// </summary>
        [Input("interfaceType")]
        public Input<string>? InterfaceType { get; set; }

        [Input("metric")]
        public Input<int>? Metric { get; set; }

        /// <summary>
        /// By default, we'll re-advertise all learned OSPF routes toward overlay
        /// </summary>
        [Input("noReadvertiseToOverlay")]
        public Input<bool>? NoReadvertiseToOverlay { get; set; }

        /// <summary>
        /// Whether to send OSPF-Hello
        /// </summary>
        [Input("passive")]
        public Input<bool>? Passive { get; set; }

        public SwitchOspfAreasNetworksGetArgs()
        {
        }
        public static new SwitchOspfAreasNetworksGetArgs Empty => new SwitchOspfAreasNetworksGetArgs();
    }
}
