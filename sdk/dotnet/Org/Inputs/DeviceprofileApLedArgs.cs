// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class DeviceprofileApLedArgs : global::Pulumi.ResourceArgs
    {
        [Input("brightness")]
        public Input<int>? Brightness { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public DeviceprofileApLedArgs()
        {
        }
        public static new DeviceprofileApLedArgs Empty => new DeviceprofileApLedArgs();
    }
}
