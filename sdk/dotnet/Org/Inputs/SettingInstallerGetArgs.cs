// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingInstallerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowAllDevices")]
        public Input<bool>? AllowAllDevices { get; set; }

        [Input("allowAllSites")]
        public Input<bool>? AllowAllSites { get; set; }

        [Input("extraSiteIds")]
        private InputList<string>? _extraSiteIds;
        public InputList<string> ExtraSiteIds
        {
            get => _extraSiteIds ?? (_extraSiteIds = new InputList<string>());
            set => _extraSiteIds = value;
        }

        [Input("gracePeriod")]
        public Input<int>? GracePeriod { get; set; }

        public SettingInstallerGetArgs()
        {
        }
        public static new SettingInstallerGetArgs Empty => new SettingInstallerGetArgs();
    }
}
