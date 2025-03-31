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
        /// enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `peap-tls`, `psk`
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        [Input("families")]
        private InputList<string>? _families;

        /// <summary>
        /// List of client device families to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed family values
        /// </summary>
        public InputList<string> Families
        {
            get => _families ?? (_families = new InputList<string>());
            set => _families = value;
        }

        [Input("mfgs")]
        private InputList<string>? _mfgs;

        /// <summary>
        /// List of client device models to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed model values
        /// </summary>
        public InputList<string> Mfgs
        {
            get => _mfgs ?? (_mfgs = new InputList<string>());
            set => _mfgs = value;
        }

        [Input("models")]
        private InputList<string>? _models;

        /// <summary>
        /// List of client device manufacturers to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed mfg values
        /// </summary>
        public InputList<string> Models
        {
            get => _models ?? (_models = new InputList<string>());
            set => _models = value;
        }

        [Input("nactags")]
        private InputList<string>? _nactags;
        public InputList<string> Nactags
        {
            get => _nactags ?? (_nactags = new InputList<string>());
            set => _nactags = value;
        }

        [Input("osTypes")]
        private InputList<string>? _osTypes;

        /// <summary>
        /// List of client device os types to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed os_type values
        /// </summary>
        public InputList<string> OsTypes
        {
            get => _osTypes ?? (_osTypes = new InputList<string>());
            set => _osTypes = value;
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
        /// List of site ids to match
        /// </summary>
        public InputList<string> SiteIds
        {
            get => _siteIds ?? (_siteIds = new InputList<string>());
            set => _siteIds = value;
        }

        [Input("sitegroupIds")]
        private InputList<string>? _sitegroupIds;

        /// <summary>
        /// List of sitegroup ids to match
        /// </summary>
        public InputList<string> SitegroupIds
        {
            get => _sitegroupIds ?? (_sitegroupIds = new InputList<string>());
            set => _sitegroupIds = value;
        }

        [Input("vendors")]
        private InputList<string>? _vendors;

        /// <summary>
        /// List of vendors to match
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
