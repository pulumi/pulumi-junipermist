// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Outputs
{

    [OutputType]
    public sealed class GetConstAppCategoriesConstAppCategoryFiltersResult
    {
        public readonly ImmutableArray<string> Srxes;
        public readonly ImmutableArray<string> Ssrs;

        [OutputConstructor]
        private GetConstAppCategoriesConstAppCategoryFiltersResult(
            ImmutableArray<string> srxes,

            ImmutableArray<string> ssrs)
        {
            Srxes = srxes;
            Ssrs = ssrs;
        }
    }
}