// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NacruleNotMatchingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `psk`
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        [Input("nactags")]
        private InputList<string>? _nactags;
        public InputList<string> Nactags
        {
            get => _nactags ?? (_nactags = new InputList<string>());
            set => _nactags = value;
        }

        [Input("portTypes")]
        private InputList<string>? _portTypes;
        public InputList<string> PortTypes
        {
            get => _portTypes ?? (_portTypes = new InputList<string>());
            set => _portTypes = value;
        }

        [Input("siteIds")]
        private InputList<string>? _siteIds;

        /// <summary>
        /// list of site ids to match
        /// </summary>
        public InputList<string> SiteIds
        {
            get => _siteIds ?? (_siteIds = new InputList<string>());
            set => _siteIds = value;
        }

        [Input("sitegroupIds")]
        private InputList<string>? _sitegroupIds;

        /// <summary>
        /// list of sitegroup ids to match
        /// </summary>
        public InputList<string> SitegroupIds
        {
            get => _sitegroupIds ?? (_sitegroupIds = new InputList<string>());
            set => _sitegroupIds = value;
        }

        [Input("vendors")]
        private InputList<string>? _vendors;

        /// <summary>
        /// list of vendors to match
        /// </summary>
        public InputList<string> Vendors
        {
            get => _vendors ?? (_vendors = new InputList<string>());
            set => _vendors = value;
        }

        public NacruleNotMatchingGetArgs()
        {
        }
        public static new NacruleNotMatchingGetArgs Empty => new NacruleNotMatchingGetArgs();
    }
}
