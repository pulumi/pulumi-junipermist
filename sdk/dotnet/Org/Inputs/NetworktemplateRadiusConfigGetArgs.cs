// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateRadiusConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("acctImmediateUpdate")]
        public Input<bool>? AcctImmediateUpdate { get; set; }

        /// <summary>
        /// How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
        /// </summary>
        [Input("acctInterimInterval")]
        public Input<int>? AcctInterimInterval { get; set; }

        [Input("acctServers")]
        private InputList<Inputs.NetworktemplateRadiusConfigAcctServerGetArgs>? _acctServers;
        public InputList<Inputs.NetworktemplateRadiusConfigAcctServerGetArgs> AcctServers
        {
            get => _acctServers ?? (_acctServers = new InputList<Inputs.NetworktemplateRadiusConfigAcctServerGetArgs>());
            set => _acctServers = value;
        }

        /// <summary>
        /// enum: `ordered`, `unordered`
        /// </summary>
        [Input("authServerSelection")]
        public Input<string>? AuthServerSelection { get; set; }

        [Input("authServers")]
        private InputList<Inputs.NetworktemplateRadiusConfigAuthServerGetArgs>? _authServers;
        public InputList<Inputs.NetworktemplateRadiusConfigAuthServerGetArgs> AuthServers
        {
            get => _authServers ?? (_authServers = new InputList<Inputs.NetworktemplateRadiusConfigAuthServerGetArgs>());
            set => _authServers = value;
        }

        /// <summary>
        /// Radius auth session retries
        /// </summary>
        [Input("authServersRetries")]
        public Input<int>? AuthServersRetries { get; set; }

        /// <summary>
        /// Radius auth session timeout
        /// </summary>
        [Input("authServersTimeout")]
        public Input<int>? AuthServersTimeout { get; set; }

        [Input("coaEnabled")]
        public Input<bool>? CoaEnabled { get; set; }

        [Input("coaPort")]
        public Input<string>? CoaPort { get; set; }

        [Input("fastDot1xTimers")]
        public Input<bool>? FastDot1xTimers { get; set; }

        /// <summary>
        /// Use `network`or `source_ip`. Which network the RADIUS server resides, if there's static IP for this network, we'd use it as source-ip
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// Use `network`or `source_ip`
        /// </summary>
        [Input("sourceIp")]
        public Input<string>? SourceIp { get; set; }

        public NetworktemplateRadiusConfigGetArgs()
        {
        }
        public static new NetworktemplateRadiusConfigGetArgs Empty => new NetworktemplateRadiusConfigGetArgs();
    }
}
