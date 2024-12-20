// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSnmpConfigV3ConfigUsmGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `local_engine`, `remote_engine`
        /// </summary>
        [Input("engineType")]
        public Input<string>? EngineType { get; set; }

        /// <summary>
        /// required only if `engine_type`==`remote_engine`
        /// </summary>
        [Input("engineid")]
        public Input<string>? Engineid { get; set; }

        [Input("users")]
        private InputList<Inputs.SwitchSnmpConfigV3ConfigUsmUserGetArgs>? _users;
        public InputList<Inputs.SwitchSnmpConfigV3ConfigUsmUserGetArgs> Users
        {
            get => _users ?? (_users = new InputList<Inputs.SwitchSnmpConfigV3ConfigUsmUserGetArgs>());
            set => _users = value;
        }

        public SwitchSnmpConfigV3ConfigUsmGetArgs()
        {
        }
        public static new SwitchSnmpConfigV3ConfigUsmGetArgs Empty => new SwitchSnmpConfigV3ConfigUsmGetArgs();
    }
}
