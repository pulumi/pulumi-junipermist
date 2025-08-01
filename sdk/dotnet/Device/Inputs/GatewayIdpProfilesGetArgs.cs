// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayIdpProfilesGetArgs : global::Pulumi.ResourceArgs
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
        private InputList<Inputs.GatewayIdpProfilesOverwriteGetArgs>? _overwrites;
        public InputList<Inputs.GatewayIdpProfilesOverwriteGetArgs> Overwrites
        {
            get => _overwrites ?? (_overwrites = new InputList<Inputs.GatewayIdpProfilesOverwriteGetArgs>());
            set => _overwrites = value;
        }

        public GatewayIdpProfilesGetArgs()
        {
        }
        public static new GatewayIdpProfilesGetArgs Empty => new GatewayIdpProfilesGetArgs();
    }
}
