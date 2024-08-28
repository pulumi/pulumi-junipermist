// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientLists")]
        private InputList<Inputs.NetworktemplateSnmpConfigClientListArgs>? _clientLists;
        public InputList<Inputs.NetworktemplateSnmpConfigClientListArgs> ClientLists
        {
            get => _clientLists ?? (_clientLists = new InputList<Inputs.NetworktemplateSnmpConfigClientListArgs>());
            set => _clientLists = value;
        }

        [Input("contact")]
        public Input<string>? Contact { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// enum: `engine-id-suffix`, `local`, `use-default-ip-address`, `use_mac-address`
        /// </summary>
        [Input("engineId")]
        public Input<string>? EngineId { get; set; }

        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("network")]
        public Input<string>? Network { get; set; }

        [Input("trapGroups")]
        private InputList<Inputs.NetworktemplateSnmpConfigTrapGroupArgs>? _trapGroups;
        public InputList<Inputs.NetworktemplateSnmpConfigTrapGroupArgs> TrapGroups
        {
            get => _trapGroups ?? (_trapGroups = new InputList<Inputs.NetworktemplateSnmpConfigTrapGroupArgs>());
            set => _trapGroups = value;
        }

        [Input("v2cConfigs")]
        private InputList<Inputs.NetworktemplateSnmpConfigV2cConfigArgs>? _v2cConfigs;
        public InputList<Inputs.NetworktemplateSnmpConfigV2cConfigArgs> V2cConfigs
        {
            get => _v2cConfigs ?? (_v2cConfigs = new InputList<Inputs.NetworktemplateSnmpConfigV2cConfigArgs>());
            set => _v2cConfigs = value;
        }

        [Input("v3Config")]
        public Input<Inputs.NetworktemplateSnmpConfigV3ConfigArgs>? V3Config { get; set; }

        [Input("views")]
        private InputList<Inputs.NetworktemplateSnmpConfigViewArgs>? _views;
        public InputList<Inputs.NetworktemplateSnmpConfigViewArgs> Views
        {
            get => _views ?? (_views = new InputList<Inputs.NetworktemplateSnmpConfigViewArgs>());
            set => _views = value;
        }

        public NetworktemplateSnmpConfigArgs()
        {
        }
        public static new NetworktemplateSnmpConfigArgs Empty => new NetworktemplateSnmpConfigArgs();
    }
}