// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileGatewayServicePolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required when `servicepolicy_id` is not defined, optional otherwise (override the servicepolicy action). enum: `allow`, `deny`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// For SRX-only
        /// </summary>
        [Input("antivirus")]
        public Input<Inputs.DeviceprofileGatewayServicePolicyAntivirusArgs>? Antivirus { get; set; }

        /// <summary>
        /// For SRX Only
        /// </summary>
        [Input("appqoe")]
        public Input<Inputs.DeviceprofileGatewayServicePolicyAppqoeArgs>? Appqoe { get; set; }

        [Input("ewfs")]
        private InputList<Inputs.DeviceprofileGatewayServicePolicyEwfArgs>? _ewfs;
        public InputList<Inputs.DeviceprofileGatewayServicePolicyEwfArgs> Ewfs
        {
            get => _ewfs ?? (_ewfs = new InputList<Inputs.DeviceprofileGatewayServicePolicyEwfArgs>());
            set => _ewfs = value;
        }

        [Input("idp")]
        public Input<Inputs.DeviceprofileGatewayServicePolicyIdpArgs>? Idp { get; set; }

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
        /// By default, we derive all paths available and use them. Optionally, you can customize by using `path_preference`
        /// </summary>
        [Input("pathPreference")]
        public Input<string>? PathPreference { get; set; }

        /// <summary>
        /// Used to link servicepolicy defined at org level and overwrite some attributes
        /// </summary>
        [Input("servicepolicyId")]
        public Input<string>? ServicepolicyId { get; set; }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// Required when `servicepolicy_id` is not defined. List of Applications / Destinations
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        /// <summary>
        /// For SRX-only
        /// </summary>
        [Input("sslProxy")]
        public Input<Inputs.DeviceprofileGatewayServicePolicySslProxyArgs>? SslProxy { get; set; }

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

        public DeviceprofileGatewayServicePolicyArgs()
        {
        }
        public static new DeviceprofileGatewayServicePolicyArgs Empty => new DeviceprofileGatewayServicePolicyArgs();
    }
}
