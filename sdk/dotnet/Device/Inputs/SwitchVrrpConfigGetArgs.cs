// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchVrrpConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("groups")]
        private InputMap<Inputs.SwitchVrrpConfigGroupsGetArgs>? _groups;

        /// <summary>
        /// Property key is the VRRP name
        /// </summary>
        public InputMap<Inputs.SwitchVrrpConfigGroupsGetArgs> Groups
        {
            get => _groups ?? (_groups = new InputMap<Inputs.SwitchVrrpConfigGroupsGetArgs>());
            set => _groups = value;
        }

        public SwitchVrrpConfigGetArgs()
        {
        }
        public static new SwitchVrrpConfigGetArgs Empty => new SwitchVrrpConfigGetArgs();
    }
}