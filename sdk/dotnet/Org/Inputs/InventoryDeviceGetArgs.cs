// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class InventoryDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Device Claim Code. Required for claimed devices. Removing an adopted device from the list will release it
        /// </summary>
        [Input("claimCode")]
        public Input<string>? ClaimCode { get; set; }

        /// <summary>
        /// Device Hostname
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// Mist Device ID
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Device MAC address. Required to assign adopted devices to site. Removing an adopted device from the list will not release it, but will unassign it from the site. Cannot be specified when `claim_code` is used
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        /// <summary>
        /// Device model
        /// </summary>
        [Input("model")]
        public Input<string>? Model { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Device serial
        /// </summary>
        [Input("serial")]
        public Input<string>? Serial { get; set; }

        /// <summary>
        /// Site ID. Used to assign device to a Site
        /// </summary>
        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Virtual Chassis MAC Address
        /// </summary>
        [Input("vcMac")]
        public Input<string>? VcMac { get; set; }

        public InventoryDeviceGetArgs()
        {
        }
        public static new InventoryDeviceGetArgs Empty => new InventoryDeviceGetArgs();
    }
}
