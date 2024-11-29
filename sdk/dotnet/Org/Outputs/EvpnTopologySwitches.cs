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
    public sealed class EvpnTopologySwitches
    {
        public readonly string? DeviceprofileId;
        public readonly int? EvpnId;
        public readonly string? Mac;
        public readonly string? Model;
        /// <summary>
        /// optionally, for distribution / access / esilag-access, they can be placed into different pods. e.g. 
        ///   * for CLOS, to group dist / access switches into pods
        ///   * for ERB/CRB, to group dist / esilag-access into pods
        /// </summary>
        public readonly int? Pod;
        /// <summary>
        /// by default, core switches are assumed to be connecting all pods. 
        /// if you want to limit the pods, you can specify pods.
        /// </summary>
        public readonly ImmutableArray<int> Pods;
        /// <summary>
        /// use `role`==`none` to remove a switch from the topology. enum: `access`, `collapsed-core`, `core`, `distribution`, `esilag-access`, `none`
        /// </summary>
        public readonly string Role;
        public readonly string? RouterId;
        public readonly string? SiteId;

        [OutputConstructor]
        private EvpnTopologySwitches(
            string? deviceprofileId,

            int? evpnId,

            string? mac,

            string? model,

            int? pod,

            ImmutableArray<int> pods,

            string role,

            string? routerId,

            string? siteId)
        {
            DeviceprofileId = deviceprofileId;
            EvpnId = evpnId;
            Mac = mac;
            Model = model;
            Pod = pod;
            Pods = pods;
            Role = role;
            RouterId = routerId;
            SiteId = siteId;
        }
    }
}
