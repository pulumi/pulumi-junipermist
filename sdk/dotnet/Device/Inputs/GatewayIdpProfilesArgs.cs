// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayIdpProfilesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        [Input("baseProfile")]
        public Input<string>? BaseProfile { get; set; }

        /// <summary>
        /// Unique ID of the object instance in the Mist Organization
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("overwrites")]
        private InputList<Inputs.GatewayIdpProfilesOverwriteArgs>? _overwrites;
        public InputList<Inputs.GatewayIdpProfilesOverwriteArgs> Overwrites
        {
            get => _overwrites ?? (_overwrites = new InputList<Inputs.GatewayIdpProfilesOverwriteArgs>());
            set => _overwrites = value;
        }

        public GatewayIdpProfilesArgs()
        {
        }
        public static new GatewayIdpProfilesArgs Empty => new GatewayIdpProfilesArgs();
    }
}
