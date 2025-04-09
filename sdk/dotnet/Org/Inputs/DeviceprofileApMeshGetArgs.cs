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
        [Input("bands")]
        private InputList<string>? _bands;

        /// <summary>
        /// List of bands that the mesh should apply to. For relay, the first viable one will be picked. For relay, the first viable one will be picked. enum: `24`, `5`, `6`
        /// </summary>
        public InputList<string> Bands
        {
            get => _bands ?? (_bands = new InputList<string>());
            set => _bands = value;
        }

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
