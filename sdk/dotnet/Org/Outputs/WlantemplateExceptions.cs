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
    public sealed class WlantemplateExceptions
    {
        /// <summary>
        /// list of site ids
        /// </summary>
        public readonly ImmutableArray<string> SiteIds;
        /// <summary>
        /// list of sitegroup ids
        /// </summary>
        public readonly ImmutableArray<string> SitegroupIds;

        [OutputConstructor]
        private WlantemplateExceptions(
            ImmutableArray<string> siteIds,

            ImmutableArray<string> sitegroupIds)
        {
            SiteIds = siteIds;
            SitegroupIds = sitegroupIds;
        }
    }
}