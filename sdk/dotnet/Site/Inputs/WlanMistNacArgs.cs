// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanMistNacArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When enabled:
        ///   * `auth_servers` is ignored
        ///   * `acct_servers` is ignored
        ///   * `auth_servers_*` are ignored
        ///   * `coa_servers` is ignored
        ///   * `radsec` is ignored
        ///   * `coa_enabled` is assumed
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public WlanMistNacArgs()
        {
        }
        public static new WlanMistNacArgs Empty => new WlanMistNacArgs();
    }
}
