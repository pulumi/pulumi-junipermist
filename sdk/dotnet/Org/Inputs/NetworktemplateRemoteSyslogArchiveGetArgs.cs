// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateRemoteSyslogArchiveGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("files")]
        public Input<int>? Files { get; set; }

        [Input("size")]
        public Input<string>? Size { get; set; }

        public NetworktemplateRemoteSyslogArchiveGetArgs()
        {
        }
        public static new NetworktemplateRemoteSyslogArchiveGetArgs Empty => new NetworktemplateRemoteSyslogArchiveGetArgs();
    }
}