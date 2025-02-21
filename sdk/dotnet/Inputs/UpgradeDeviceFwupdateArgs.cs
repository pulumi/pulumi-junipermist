// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Inputs
{

    public sealed class UpgradeDeviceFwupdateArgs : global::Pulumi.ResourceArgs
    {
        [Input("progress")]
        public Input<int>? Progress { get; set; }

        /// <summary>
        /// enum: `inprogress`, `failed`, `upgraded`
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("statusId")]
        public Input<int>? StatusId { get; set; }

        [Input("timestamp")]
        public Input<double>? Timestamp { get; set; }

        [Input("willRetry")]
        public Input<bool>? WillRetry { get; set; }

        public UpgradeDeviceFwupdateArgs()
        {
        }
        public static new UpgradeDeviceFwupdateArgs Empty => new UpgradeDeviceFwupdateArgs();
    }
}
