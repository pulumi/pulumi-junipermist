// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class SettingMistNac
    {
        /// <summary>
        /// list of PEM-encoded ca certs
        /// </summary>
        public readonly ImmutableArray<string> Cacerts;
        /// <summary>
        /// use this IDP when no explicit realm present in the incoming username/CN OR when no IDP is explicitly mapped to the incoming realm.
        /// </summary>
        public readonly string? DefaultIdpId;
        /// <summary>
        /// to disable RSAE_PSS_SHA256, RSAE_PSS_SHA384, RSAE_PSS_SHA512 from server side. see https://www.openssl.org/docs/man3.0/man1/openssl-ciphers.html
        /// </summary>
        public readonly bool? DisableRsaeAlgorithms;
        /// <summary>
        /// eap ssl security level
        /// see https://www.openssl.org/docs/man1.1.1/man3/SSL_CTX_set_security_level.html#DEFAULT-CALLBACK-BEHAVIOUR
        /// </summary>
        public readonly int? EapSslSecurityLevel;
        /// <summary>
        /// By default NAC POD failover considers all NAC pods available around the globe, i.e. EU, US, or APAC based, failover happens based on geo IP of the originating site.
        /// For strict GDPR compliancy NAC POD failover would only happen between the PODs located within the EU environment, and no authentication would take place outside of EU. This is an org setting that is applicable to WLANs, switch templates, mxedge clusters that have mist_nac enabled
        /// </summary>
        public readonly bool? EuOnly;
        /// <summary>
        /// allow customer to choose the EAP-TLS client certificate's field to use for IDP Machine Groups lookup
        /// </summary>
        public readonly string? IdpMachineCertLookupField;
        /// <summary>
        /// allow customer to choose the EAP-TLS client certificate's field to use for IDP User Groups lookup
        /// </summary>
        public readonly string? IdpUserCertLookupField;
        public readonly ImmutableArray<Outputs.SettingMistNacIdp> Idps;
        /// <summary>
        /// radius server cert to be presented in EAP TLS
        /// </summary>
        public readonly Outputs.SettingMistNacServerCert? ServerCert;
        /// <summary>
        /// by default NAS devices(switches/aps) and proxies(mxedge) are configured to reach mist-nac via IPv4. enum: `v4`, `v6`
        /// </summary>
        public readonly string? UseIpVersion;
        /// <summary>
        /// By default NAS devices (switches/aps) and proxies(mxedge) are configured to use port TCP2083(radsec) to reach mist-nac. 
        /// Set `use_ssl_port`==`true` to override that port with TCP43 (ssl), 
        /// This is a org level setting that is applicable to wlans, switch_templates, and mxedge_clusters that have mist-nac enabled
        /// </summary>
        public readonly bool? UseSslPort;

        [OutputConstructor]
        private SettingMistNac(
            ImmutableArray<string> cacerts,

            string? defaultIdpId,

            bool? disableRsaeAlgorithms,

            int? eapSslSecurityLevel,

            bool? euOnly,

            string? idpMachineCertLookupField,

            string? idpUserCertLookupField,

            ImmutableArray<Outputs.SettingMistNacIdp> idps,

            Outputs.SettingMistNacServerCert? serverCert,

            string? useIpVersion,

            bool? useSslPort)
        {
            Cacerts = cacerts;
            DefaultIdpId = defaultIdpId;
            DisableRsaeAlgorithms = disableRsaeAlgorithms;
            EapSslSecurityLevel = eapSslSecurityLevel;
            EuOnly = euOnly;
            IdpMachineCertLookupField = idpMachineCertLookupField;
            IdpUserCertLookupField = idpUserCertLookupField;
            Idps = idps;
            ServerCert = serverCert;
            UseIpVersion = useIpVersion;
            UseSslPort = useSslPort;
        }
    }
}