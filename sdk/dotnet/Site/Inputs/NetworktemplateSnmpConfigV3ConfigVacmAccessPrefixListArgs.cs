// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Only required if `type`==`context_prefix`
        /// </summary>
        [Input("contextPrefix")]
        public Input<string>? ContextPrefix { get; set; }

        /// <summary>
        /// Refer to view name
        /// </summary>
        [Input("notifyView")]
        public Input<string>? NotifyView { get; set; }

        /// <summary>
        /// Refer to view name
        /// </summary>
        [Input("readView")]
        public Input<string>? ReadView { get; set; }

        /// <summary>
        /// enum: `authentication`, `none`, `privacy`
        /// </summary>
        [Input("securityLevel")]
        public Input<string>? SecurityLevel { get; set; }

        /// <summary>
        /// enum: `any`, `usm`, `v1`, `v2c`
        /// </summary>
        [Input("securityModel")]
        public Input<string>? SecurityModel { get; set; }

        /// <summary>
        /// enum: `context_prefix`, `default_context_prefix`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Refer to view name
        /// </summary>
        [Input("writeView")]
        public Input<string>? WriteView { get; set; }

        public NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs Empty => new NetworktemplateSnmpConfigV3ConfigVacmAccessPrefixListArgs();
    }
}
