// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileApMeshGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether mesh is enabled on this AP
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Mesh group, base AP(s) will only allow remote AP(s) in the same mesh group to join, 1-9, optional
        /// </summary>
        [Input("group")]
        public Input<int>? Group { get; set; }

        /// <summary>
        /// enum: `base`, `remote`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public DeviceprofileApMeshGetArgs()
        {
        }
        public static new DeviceprofileApMeshGetArgs Empty => new DeviceprofileApMeshGetArgs();
    }
}
