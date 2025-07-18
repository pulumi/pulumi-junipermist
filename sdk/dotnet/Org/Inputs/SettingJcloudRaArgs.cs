// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingJcloudRaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JCloud Routing Assurance Org Token
        /// </summary>
        [Input("orgApitoken")]
        public Input<string>? OrgApitoken { get; set; }

        /// <summary>
        /// JCloud Routing Assurance Org Token Name
        /// </summary>
        [Input("orgApitokenName")]
        public Input<string>? OrgApitokenName { get; set; }

        /// <summary>
        /// JCloud Routing Assurance Org ID
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        public SettingJcloudRaArgs()
        {
        }
        public static new SettingJcloudRaArgs Empty => new SettingJcloudRaArgs();
    }
}
