// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class SettingEngagementHours
    {
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        public readonly string? Fri;
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        public readonly string? Mon;
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        public readonly string? Sat;
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        public readonly string? Sun;
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        public readonly string? Thu;
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        public readonly string? Tue;
        /// <summary>
        /// Hour range of the day (e.g. `09:00-17:00`). If the hour is not defined then it's treated as 00:00-23:59.
        /// </summary>
        public readonly string? Wed;

        [OutputConstructor]
        private SettingEngagementHours(
            string? fri,

            string? mon,

            string? sat,

            string? sun,

            string? thu,

            string? tue,

            string? wed)
        {
            Fri = fri;
            Mon = mon;
            Sat = sat;
            Sun = sun;
            Thu = thu;
            Tue = tue;
            Wed = wed;
        }
    }
}
