// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Outputs
{

    [OutputType]
    public sealed class UpgradeDeviceFwupdate
    {
        public readonly int? Progress;
        /// <summary>
        /// enum: `inprogress`, `failed`, `upgraded`
        /// </summary>
        public readonly string? Status;
        public readonly int? StatusId;
        /// <summary>
        /// Epoch (seconds)
        /// </summary>
        public readonly double? Timestamp;
        public readonly bool? WillRetry;

        [OutputConstructor]
        private UpgradeDeviceFwupdate(
            int? progress,

            string? status,

            int? statusId,

            double? timestamp,

            bool? willRetry)
        {
            Progress = progress;
            Status = status;
            StatusId = statusId;
            Timestamp = timestamp;
            WillRetry = willRetry;
        }
    }
}
