// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class GatewaytemplateTunnelConfigsAutoProvisionSecondaryArgs : global::Pulumi.ResourceArgs
    {
        [Input("probeIps")]
        private InputList<string>? _probeIps;
        public InputList<string> ProbeIps
        {
            get => _probeIps ?? (_probeIps = new InputList<string>());
            set => _probeIps = value;
        }

        [Input("wanNames")]
        private InputList<string>? _wanNames;

        /// <summary>
        /// optional, only needed if `vars_only`==`false`
        /// </summary>
        public InputList<string> WanNames
        {
            get => _wanNames ?? (_wanNames = new InputList<string>());
            set => _wanNames = value;
        }

        public GatewaytemplateTunnelConfigsAutoProvisionSecondaryArgs()
        {
        }
        public static new GatewaytemplateTunnelConfigsAutoProvisionSecondaryArgs Empty => new GatewaytemplateTunnelConfigsAutoProvisionSecondaryArgs();
    }
}
