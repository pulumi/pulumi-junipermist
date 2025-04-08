// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class VpnPathsTrafficShapingArgs : global::Pulumi.ResourceArgs
    {
        [Input("classPercentages")]
        private InputList<int>? _classPercentages;

        /// <summary>
        /// percentages for different class of traffic: high / medium / low / best-effort adding up to 100
        /// </summary>
        public InputList<int> ClassPercentages
        {
            get => _classPercentages ?? (_classPercentages = new InputList<int>());
            set => _classPercentages = value;
        }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("maxTxKbps")]
        public Input<int>? MaxTxKbps { get; set; }

        public VpnPathsTrafficShapingArgs()
        {
        }
        public static new VpnPathsTrafficShapingArgs Empty => new VpnPathsTrafficShapingArgs();
    }
}
