// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayPathPreferencesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("paths")]
        private InputList<Inputs.DeviceprofileGatewayPathPreferencesPathGetArgs>? _paths;
        public InputList<Inputs.DeviceprofileGatewayPathPreferencesPathGetArgs> Paths
        {
            get => _paths ?? (_paths = new InputList<Inputs.DeviceprofileGatewayPathPreferencesPathGetArgs>());
            set => _paths = value;
        }

        /// <summary>
        /// enum: `ecmp`, `ordered`, `weighted`
        /// </summary>
        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        public DeviceprofileGatewayPathPreferencesGetArgs()
        {
        }
        public static new DeviceprofileGatewayPathPreferencesGetArgs Empty => new DeviceprofileGatewayPathPreferencesGetArgs();
    }
}
