// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class AlarmtemplateRulesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Delivery object to configure the alarm delivery
        /// </summary>
        [Input("delivery")]
        public Input<Inputs.AlarmtemplateRulesDeliveryGetArgs>? Delivery { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public AlarmtemplateRulesGetArgs()
        {
        }
        public static new AlarmtemplateRulesGetArgs Empty => new AlarmtemplateRulesGetArgs();
    }
}
