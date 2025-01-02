// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class GatewayServicePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required when `servicepolicy_id` is not defined, optional otherwise (override the servicepolicy action). enum: `allow`, `deny`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// For SRX Only
        /// </summary>
        [Input("appqoe")]
        public Input<Inputs.GatewayServicePolicyAppqoeArgs>? Appqoe { get; set; }

        [Input("ewfs")]
        private InputList<Inputs.GatewayServicePolicyEwfArgs>? _ewfs;
        public InputList<Inputs.GatewayServicePolicyEwfArgs> Ewfs
        {
            get => _ewfs ?? (_ewfs = new InputList<Inputs.GatewayServicePolicyEwfArgs>());
            set => _ewfs = value;
        }

        [Input("idp")]
        public Input<Inputs.GatewayServicePolicyIdpArgs>? Idp { get; set; }

        /// <summary>
        /// access within the same VRF
        /// </summary>
        [Input("localRouting")]
        public Input<bool>? LocalRouting { get; set; }

        /// <summary>
        /// Required when `servicepolicy_id` is not defined, optional otherwise (override the servicepolicy name)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// by default, we derive all paths available and use them. Optionally, you can customize by using `path_preference`
        /// </summary>
        [Input("pathPreference")]
        public Input<string>? PathPreference { get; set; }

        /// <summary>
        /// used to link servicepolicy defined at org level and overwrite some attributes
        /// </summary>
        [Input("servicepolicyId")]
        public Input<string>? ServicepolicyId { get; set; }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// Required when `servicepolicy_id` is not defined. List of Applications / Desctinations
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        [Input("tenants")]
        private InputList<string>? _tenants;

        /// <summary>
        /// Required when `servicepolicy_id` is not defined. List of Networks / Users
        /// </summary>
        public InputList<string> Tenants
        {
            get => _tenants ?? (_tenants = new InputList<string>());
            set => _tenants = value;
        }

        public GatewayServicePolicyArgs()
        {
        }
        public static new GatewayServicePolicyArgs Empty => new GatewayServicePolicyArgs();
    }
}
