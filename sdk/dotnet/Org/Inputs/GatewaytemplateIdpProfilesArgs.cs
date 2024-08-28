// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateIdpProfilesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        [Input("baseProfile")]
        public Input<string>? BaseProfile { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("overwrites")]
        private InputList<Inputs.GatewaytemplateIdpProfilesOverwriteArgs>? _overwrites;
        public InputList<Inputs.GatewaytemplateIdpProfilesOverwriteArgs> Overwrites
        {
            get => _overwrites ?? (_overwrites = new InputList<Inputs.GatewaytemplateIdpProfilesOverwriteArgs>());
            set => _overwrites = value;
        }

        public GatewaytemplateIdpProfilesArgs()
        {
        }
        public static new GatewaytemplateIdpProfilesArgs Empty => new GatewaytemplateIdpProfilesArgs();
    }
}