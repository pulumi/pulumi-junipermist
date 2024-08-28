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
    public sealed class GetConstAppCategoriesConstAppCategoryResult
    {
        /// <summary>
        /// Description of the app category
        /// </summary>
        public readonly string Display;
        public readonly Outputs.GetConstAppCategoriesConstAppCategoryFiltersResult Filters;
        /// <summary>
        /// List of other App Categories contained by this one
        /// </summary>
        public readonly ImmutableArray<string> Includes;
        /// <summary>
        /// Key name of the app category
        /// </summary>
        public readonly string Key;

        [OutputConstructor]
        private GetConstAppCategoriesConstAppCategoryResult(
            string display,

            Outputs.GetConstAppCategoriesConstAppCategoryFiltersResult filters,

            ImmutableArray<string> includes,

            string key)
        {
            Display = display;
            Filters = filters;
            Includes = includes;
            Key = key;
        }
    }
}