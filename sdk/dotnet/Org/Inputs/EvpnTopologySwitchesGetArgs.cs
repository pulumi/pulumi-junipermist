// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class EvpnTopologySwitchesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("deviceprofileId")]
        public Input<string>? DeviceprofileId { get; set; }

        [Input("evpnId")]
        public Input<int>? EvpnId { get; set; }

        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("model")]
        public Input<string>? Model { get; set; }

        /// <summary>
        /// Optionally, for distribution / access / esilag-access, they can be placed into different pods. e.g. 
        ///   * for CLOS, to group dist / access switches into pods
        ///   * for ERB/CRB, to group dist / esilag-access into pods
        /// </summary>
        [Input("pod")]
        public Input<int>? Pod { get; set; }

        [Input("pods")]
        private InputList<int>? _pods;

        /// <summary>
        /// By default, core switches are assumed to be connecting all pods. 
        /// if you want to limit the pods, you can specify pods.
        /// </summary>
        public InputList<int> Pods
        {
            get => _pods ?? (_pods = new InputList<int>());
            set => _pods = value;
        }

        /// <summary>
        /// use `role`==`none` to remove a switch from the topology. enum: `access`, `collapsed-core`, `core`, `distribution`, `esilag-access`, `none`
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        [Input("routerId")]
        public Input<string>? RouterId { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        public EvpnTopologySwitchesGetArgs()
        {
        }
        public static new EvpnTopologySwitchesGetArgs Empty => new EvpnTopologySwitchesGetArgs();
    }
}
