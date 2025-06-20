// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSnmpConfigV3ConfigUsmArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `local_engine`, `remote_engine`
        /// </summary>
        [Input("engineType", required: true)]
        public Input<string> EngineType { get; set; } = null!;

        /// <summary>
        /// Required only if `engine_type`==`remote_engine`
        /// </summary>
        [Input("remoteEngineId")]
        public Input<string>? RemoteEngineId { get; set; }

        [Input("users")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigUsmUserArgs>? _users;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigUsmUserArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.SwitchSnmpConfigV3ConfigUsmUserArgs>());
            set => _users = value;
        }

        public SwitchSnmpConfigV3ConfigUsmArgs()
        {
        }
        public static new SwitchSnmpConfigV3ConfigUsmArgs Empty => new SwitchSnmpConfigV3ConfigUsmArgs();
    }
}
