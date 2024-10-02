// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class WlanQos
    {
        /// <summary>
        /// enum: `background`, `best_effort`, `video`, `voice`
        /// </summary>
        public readonly string? Class;
        /// <summary>
        /// whether to overwrite QoS
        /// </summary>
        public readonly bool? Overwrite;

        [OutputConstructor]
        private WlanQos(
            string? @class,

            bool? overwrite)
        {
            Class = @class;
            Overwrite = overwrite;
        }
    }
}