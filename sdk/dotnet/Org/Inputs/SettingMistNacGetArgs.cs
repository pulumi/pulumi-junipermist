// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingMistNacGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cacerts")]
        private InputList<string>? _cacerts;

        /// <summary>
        /// list of PEM-encoded ca certs
        /// </summary>
        public InputList<string> Cacerts
        {
            get => _cacerts ?? (_cacerts = new InputList<string>());
            set => _cacerts = value;
        }

        /// <summary>
        /// use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
        /// </summary>
        [Input("defaultIdpId")]
        public Input<string>? DefaultIdpId { get; set; }

        /// <summary>
        /// to disable RSAE_PSS_SHA256, RSAE_PSS_SHA384, RSAE_PSS_SHA512 from server side. see https://www.openssl.org/docs/man3.0/man1/openssl-ciphers.html
        /// </summary>
        [Input("disableRsaeAlgorithms")]
        public Input<bool>? DisableRsaeAlgorithms { get; set; }

        /// <summary>
        /// eap ssl security level
        /// see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
        /// </summary>
        [Input("eapSslSecurityLevel")]
        public Input<int>? EapSslSecurityLevel { get; set; }

        /// <summary>
        /// By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
        /// For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
        /// </summary>
        [Input("euOnly")]
        public Input<bool>? EuOnly { get; set; }

        /// <summary>
        /// allow customer to choose the EAP-TLS client certificate's field to use for IDP Machine Groups lookup
        /// </summary>
        [Input("idpMachineCertLookupField")]
        public Input<string>? IdpMachineCertLookupField { get; set; }

        /// <summary>
        /// allow customer to choose the EAP-TLS client certificate's field to use for IDP User Groups lookup
        /// </summary>
        [Input("idpUserCertLookupField")]
        public Input<string>? IdpUserCertLookupField { get; set; }

        [Input("idps")]
        private InputList<Inputs.SettingMistNacIdpGetArgs>? _idps;
        public InputList<Inputs.SettingMistNacIdpGetArgs> Idps
        {
            get => _idps ?? (_idps = new InputList<Inputs.SettingMistNacIdpGetArgs>());
            set => _idps = value;
        }

        /// <summary>
        /// radius server cert to be presented in EAP TLS
        /// </summary>
        [Input("serverCert")]
        public Input<Inputs.SettingMistNacServerCertGetArgs>? ServerCert { get; set; }

        /// <summary>
        /// by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
        /// </summary>
        [Input("useIpVersion")]
        public Input<string>? UseIpVersion { get; set; }

        /// <summary>
        /// By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac. 
        /// Set `use_ssl_port`==`true` to override that port with TCP43 (ssl), 
        /// This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
        /// </summary>
        [Input("useSslPort")]
        public Input<bool>? UseSslPort { get; set; }

        public SettingMistNacGetArgs()
        {
        }
        public static new SettingMistNacGetArgs Empty => new SettingMistNacGetArgs();
    }
}