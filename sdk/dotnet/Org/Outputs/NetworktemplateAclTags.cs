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
    public sealed class NetworktemplateAclTags
    {
        /// <summary>
        /// required if
        ///   - `type`==`dynamic_gbp` (gbp_tag received from RADIUS)
        ///   - `type`==`gbp_resource`
        ///   - `type`==`static_gbp` (applying gbp tag against matching conditions)
        /// </summary>
        public readonly int? GbpTag;
        /// <summary>
        /// required if 
        /// - `type`==`mac`
        /// - `type`==`static_gbp` if from matching mac
        /// </summary>
        public readonly ImmutableArray<string> Macs;
        /// <summary>
        /// if:
        ///   * `type`==`mac` (optional. default is `any`)
        ///   * `type`==`subnet` (optional. default is `any`)
        ///   * `type`==`network`
        ///   * `type`==`resource` (optional. default is `any`)
        ///   * `type`==`static_gbp` if from matching network (vlan)'
        /// </summary>
        public readonly string? Network;
        /// <summary>
        /// required if:
        ///   * `type`==`radius_group`
        ///   * `type`==`static_gbp`
        /// if from matching radius_group
        /// </summary>
        public readonly string? RadiusGroup;
        /// <summary>
        /// if `type`==`resource` or `type`==`gbp_resource`. Empty means unrestricted, i.e. any
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworktemplateAclTagsSpec> Specs;
        /// <summary>
        /// if 
        /// - `type`==`subnet` 
        /// - `type`==`resource` (optional. default is `any`)
        /// - `type`==`static_gbp` if from matching subnet
        /// </summary>
        public readonly ImmutableArray<string> Subnets;
        /// <summary>
        /// enum: 
        ///   * `any`: matching anything not identified
        ///   * `dynamic_gbp`: from the gbp_tag received from RADIUS
        ///   * `gbp_resource`: can only be used in `dst_tags`
        ///   * `mac`
        ///   * `network`
        ///   * `radius_group`
        ///   * `resource`: can only be used in `dst_tags`
        ///   * `static_gbp`: applying gbp tag against matching conditions
        ///   * `subnet`'
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private NetworktemplateAclTags(
            int? gbpTag,

            ImmutableArray<string> macs,

            string? network,

            string? radiusGroup,

            ImmutableArray<Outputs.NetworktemplateAclTagsSpec> specs,

            ImmutableArray<string> subnets,

            string type)
        {
            GbpTag = gbpTag;
            Macs = macs;
            Network = network;
            RadiusGroup = radiusGroup;
            Specs = specs;
            Subnets = subnets;
            Type = type;
        }
    }
}
