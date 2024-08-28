// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class SettingRtsaGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("appWaking")]
        public Input<bool>? AppWaking { get; set; }

        [Input("disableDeadReckoning")]
        public Input<bool>? DisableDeadReckoning { get; set; }

        [Input("disablePressureSensor")]
        public Input<bool>? DisablePressureSensor { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// asset tracking related
        /// </summary>
        [Input("trackAsset")]
        public Input<bool>? TrackAsset { get; set; }

        public SettingRtsaGetArgs()
        {
        }
        public static new SettingRtsaGetArgs Empty => new SettingRtsaGetArgs();
    }
}