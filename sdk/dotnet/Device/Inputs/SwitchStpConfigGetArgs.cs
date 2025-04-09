// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchStpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Switch STP priority. Range [0, 4k, 8k.. 60k] in steps of 4k. Bridge priority applies to both VSTP and RSTP.
        /// </summary>
        [Input("bridgePriority")]
        public Input<string>? BridgePriority { get; set; }

        public SwitchStpConfigGetArgs()
        {
        }
        public static new SwitchStpConfigGetArgs Empty => new SwitchStpConfigGetArgs();
    }
}
