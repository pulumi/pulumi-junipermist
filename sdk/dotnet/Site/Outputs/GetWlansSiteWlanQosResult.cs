// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class GetWlansSiteWlanQosResult
    {
        /// <summary>
        /// enum: `background`, `best_effort`, `video`, `voice`
        /// </summary>
        public readonly string Class;
        /// <summary>
        /// Whether to overwrite QoS
        /// </summary>
        public readonly bool Overwrite;

        [OutputConstructor]
        private GetWlansSiteWlanQosResult(
            string @class,

            bool overwrite)
        {
            Class = @class;
            Overwrite = overwrite;
        }
    }
}
