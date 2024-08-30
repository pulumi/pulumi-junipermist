// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class WlanPortalGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// amazon OAuth2 client id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("amazonClientId")]
        public Input<string>? AmazonClientId { get; set; }

        /// <summary>
        /// amazon OAuth2 client secret. If amazon_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        [Input("amazonClientSecret")]
        public Input<string>? AmazonClientSecret { get; set; }

        [Input("amazonEmailDomains")]
        private InputList<string>? _amazonEmailDomains;

        /// <summary>
        /// Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> AmazonEmailDomains
        {
            get => _amazonEmailDomains ?? (_amazonEmailDomains = new InputList<string>());
            set => _amazonEmailDomains = value;
        }

        /// <summary>
        /// whether amazon is enabled as a login method
        /// </summary>
        [Input("amazonEnabled")]
        public Input<bool>? AmazonEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using amazon auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("amazonExpire")]
        public Input<double>? AmazonExpire { get; set; }

        /// <summary>
        /// authentication scheme. enum: `external`, `none`, `sso`
        /// </summary>
        [Input("auth")]
        public Input<string>? Auth { get; set; }

        /// <summary>
        /// Required if `azure_enabled`==`true`.
        /// Azure active directory app client id
        /// </summary>
        [Input("azureClientId")]
        public Input<string>? AzureClientId { get; set; }

        /// <summary>
        /// Required if `azure_enabled`==`true`.
        /// Azure active directory app client secret
        /// </summary>
        [Input("azureClientSecret")]
        public Input<string>? AzureClientSecret { get; set; }

        /// <summary>
        /// whether Azure Active Directory is enabled as a login method
        /// </summary>
        [Input("azureEnabled")]
        public Input<bool>? AzureEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using azure auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("azureExpire")]
        public Input<double>? AzureExpire { get; set; }

        /// <summary>
        /// Required if `azure_enabled`==`true`.
        /// Azure active directory tenant id.
        /// </summary>
        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        [Input("broadnetPassword")]
        private Input<string>? _broadnetPassword;

        /// <summary>
        /// when `sms_provider`==`broadnet`
        /// </summary>
        public Input<string>? BroadnetPassword
        {
            get => _broadnetPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _broadnetPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// when `sms_provider`==`broadnet`
        /// </summary>
        [Input("broadnetSid")]
        public Input<string>? BroadnetSid { get; set; }

        /// <summary>
        /// when `sms_provider`==`broadnet`
        /// </summary>
        [Input("broadnetUserId")]
        public Input<string>? BroadnetUserId { get; set; }

        /// <summary>
        /// whether to bypass the guest portal when cloud not reachable (and apply the default policies)
        /// </summary>
        [Input("bypassWhenCloudDown")]
        public Input<bool>? BypassWhenCloudDown { get; set; }

        /// <summary>
        /// when `sms_provider`==`clickatell`
        /// </summary>
        [Input("clickatellApiKey")]
        public Input<string>? ClickatellApiKey { get; set; }

        /// <summary>
        /// whether to allow guest to roam between WLANs (with same `WLAN.ssid`, regardless of variables) of different sites of same org without reauthentication (disable random_mac for seamless roaming)
        /// </summary>
        [Input("crossSite")]
        public Input<bool>? CrossSite { get; set; }

        /// <summary>
        /// whether email (access code verification) is enabled as a login method
        /// </summary>
        [Input("emailEnabled")]
        public Input<bool>? EmailEnabled { get; set; }

        /// <summary>
        /// whether guest portal is enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// how long to remain authorized, in minutes
        /// </summary>
        [Input("expire")]
        public Input<double>? Expire { get; set; }

        /// <summary>
        /// external portal URL (e.g. https://host/url) where we can append our query parameters to
        /// </summary>
        [Input("externalPortalUrl")]
        public Input<string>? ExternalPortalUrl { get; set; }

        /// <summary>
        /// Required if `facebook_enabled`==`true`.
        /// Facebook OAuth2 app id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("facebookClientId")]
        public Input<string>? FacebookClientId { get; set; }

        /// <summary>
        /// Required if `facebook_enabled`==`true`.
        /// Facebook OAuth2 app secret. If facebook_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        [Input("facebookClientSecret")]
        public Input<string>? FacebookClientSecret { get; set; }

        [Input("facebookEmailDomains")]
        private InputList<string>? _facebookEmailDomains;

        /// <summary>
        /// Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> FacebookEmailDomains
        {
            get => _facebookEmailDomains ?? (_facebookEmailDomains = new InputList<string>());
            set => _facebookEmailDomains = value;
        }

        /// <summary>
        /// whether facebook is enabled as a login method
        /// </summary>
        [Input("facebookEnabled")]
        public Input<bool>? FacebookEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using facebook auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("facebookExpire")]
        public Input<double>? FacebookExpire { get; set; }

        /// <summary>
        /// whether to forward the user to another URL after authorized
        /// </summary>
        [Input("forward")]
        public Input<bool>? Forward { get; set; }

        /// <summary>
        /// the URL to forward the user to
        /// </summary>
        [Input("forwardUrl")]
        public Input<string>? ForwardUrl { get; set; }

        /// <summary>
        /// Google OAuth2 app id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("googleClientId")]
        public Input<string>? GoogleClientId { get; set; }

        /// <summary>
        /// Google OAuth2 app secret. If google_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        [Input("googleClientSecret")]
        public Input<string>? GoogleClientSecret { get; set; }

        [Input("googleEmailDomains")]
        private InputList<string>? _googleEmailDomains;

        /// <summary>
        /// Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> GoogleEmailDomains
        {
            get => _googleEmailDomains ?? (_googleEmailDomains = new InputList<string>());
            set => _googleEmailDomains = value;
        }

        /// <summary>
        /// whether google is enabled as login method
        /// </summary>
        [Input("googleEnabled")]
        public Input<bool>? GoogleEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using google auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("googleExpire")]
        public Input<double>? GoogleExpire { get; set; }

        [Input("gupshupPassword")]
        private Input<string>? _gupshupPassword;

        /// <summary>
        /// when `sms_provider`==`gupshup`
        /// </summary>
        public Input<string>? GupshupPassword
        {
            get => _gupshupPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _gupshupPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// when `sms_provider`==`gupshup`
        /// </summary>
        [Input("gupshupUserid")]
        public Input<string>? GupshupUserid { get; set; }

        /// <summary>
        /// microsoft 365 OAuth2 client id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("microsoftClientId")]
        public Input<string>? MicrosoftClientId { get; set; }

        /// <summary>
        /// microsoft 365 OAuth2 client secret. If microsoft_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        [Input("microsoftClientSecret")]
        public Input<string>? MicrosoftClientSecret { get; set; }

        [Input("microsoftEmailDomains")]
        private InputList<string>? _microsoftEmailDomains;

        /// <summary>
        /// Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> MicrosoftEmailDomains
        {
            get => _microsoftEmailDomains ?? (_microsoftEmailDomains = new InputList<string>());
            set => _microsoftEmailDomains = value;
        }

        /// <summary>
        /// whether microsoft 365 is enabled as a login method
        /// </summary>
        [Input("microsoftEnabled")]
        public Input<bool>? MicrosoftEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using microsoft auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("microsoftExpire")]
        public Input<double>? MicrosoftExpire { get; set; }

        /// <summary>
        /// whether password is enabled
        /// </summary>
        [Input("passphraseEnabled")]
        public Input<bool>? PassphraseEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using passphrase auth (in minutes), if not provided, uses `expire`
        /// </summary>
        [Input("passphraseExpire")]
        public Input<double>? PassphraseExpire { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// passphrase
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// whether to show list of sponsor emails mentioned in `sponsors` object as a dropdown. If both `sponsor_notify_all` and `predefined_sponsors_enabled` are false, behaviour is acc to `sponsor_email_domains`
        /// </summary>
        [Input("predefinedSponsorsEnabled")]
        public Input<bool>? PredefinedSponsorsEnabled { get; set; }

        /// <summary>
        /// whether to hide sponsor’s email from list of sponsors
        /// </summary>
        [Input("predefinedSponsorsHideEmail")]
        public Input<bool>? PredefinedSponsorsHideEmail { get; set; }

        [Input("privacy")]
        public Input<bool>? Privacy { get; set; }

        [Input("puzzelPassword")]
        private Input<string>? _puzzelPassword;

        /// <summary>
        /// when `sms_provider`==`puzzel`
        /// </summary>
        public Input<string>? PuzzelPassword
        {
            get => _puzzelPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _puzzelPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// when `sms_provider`==`puzzel`
        /// </summary>
        [Input("puzzelServiceId")]
        public Input<string>? PuzzelServiceId { get; set; }

        /// <summary>
        /// when `sms_provider`==`puzzel`
        /// </summary>
        [Input("puzzelUsername")]
        public Input<string>? PuzzelUsername { get; set; }

        /// <summary>
        /// whether sms is enabled as a login method
        /// </summary>
        [Input("smsEnabled")]
        public Input<bool>? SmsEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using sms auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("smsExpire")]
        public Input<double>? SmsExpire { get; set; }

        [Input("smsMessageFormat")]
        public Input<string>? SmsMessageFormat { get; set; }

        /// <summary>
        /// enum: `broadnet`, `clickatell`, `gupshup`, `manual`, `puzzel`, `telstra`, `twilio`
        /// </summary>
        [Input("smsProvider")]
        public Input<string>? SmsProvider { get; set; }

        /// <summary>
        /// whether to automatically approve guest and allow sponsor to revoke guest access, needs predefined_sponsors_enabled enabled and sponsor_notify_all disabled
        /// </summary>
        [Input("sponsorAutoApprove")]
        public Input<bool>? SponsorAutoApprove { get; set; }

        [Input("sponsorEmailDomains")]
        private InputList<string>? _sponsorEmailDomains;

        /// <summary>
        /// list of domain allowed for sponsor email. Required if `sponsor_enabled` is `true` and `sponsors` is empty.
        /// </summary>
        public InputList<string> SponsorEmailDomains
        {
            get => _sponsorEmailDomains ?? (_sponsorEmailDomains = new InputList<string>());
            set => _sponsorEmailDomains = value;
        }

        /// <summary>
        /// whether sponsor is enabled
        /// </summary>
        [Input("sponsorEnabled")]
        public Input<bool>? SponsorEnabled { get; set; }

        /// <summary>
        /// interval for which guest remains authorized using sponsor auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("sponsorExpire")]
        public Input<double>? SponsorExpire { get; set; }

        /// <summary>
        /// how long to remain valid sponsored guest request approve/deny link received in email, in minutes.
        /// </summary>
        [Input("sponsorLinkValidityDuration")]
        public Input<string>? SponsorLinkValidityDuration { get; set; }

        /// <summary>
        /// whether to notify all sponsors that are mentioned in `sponsors` object. Both `sponsor_notify_all` and `predefined_sponsors_enabled` should be true in order to notify sponsors. If true, email sent to 10 sponsors in no particular order.
        /// </summary>
        [Input("sponsorNotifyAll")]
        public Input<bool>? SponsorNotifyAll { get; set; }

        /// <summary>
        /// if enabled, guest will get email about sponsor's action (approve/deny)
        /// </summary>
        [Input("sponsorStatusNotify")]
        public Input<bool>? SponsorStatusNotify { get; set; }

        [Input("sponsors")]
        private InputMap<string>? _sponsors;

        /// <summary>
        /// object of allowed sponsors email with name. Required if `sponsor_enabled` is `true` and `sponsor_email_domains` is empty.
        /// Property key is the sponsor email, Property value is the sponsor name
        /// </summary>
        public InputMap<string> Sponsors
        {
            get => _sponsors ?? (_sponsors = new InputMap<string>());
            set => _sponsors = value;
        }

        /// <summary>
        /// default role to assign if there’s no match. By default, an assertion is treated as invalid when there’s no role matched
        /// </summary>
        [Input("ssoDefaultRole")]
        public Input<string>? SsoDefaultRole { get; set; }

        [Input("ssoForcedRole")]
        public Input<string>? SsoForcedRole { get; set; }

        /// <summary>
        /// IDP Cert (used to verify the signed response)
        /// </summary>
        [Input("ssoIdpCert")]
        public Input<string>? SsoIdpCert { get; set; }

        /// <summary>
        /// signing algorithm for SAML Assertion
        /// </summary>
        [Input("ssoIdpSignAlgo")]
        public Input<string>? SsoIdpSignAlgo { get; set; }

        /// <summary>
        /// IDP Single-Sign-On URL
        /// </summary>
        [Input("ssoIdpSsoUrl")]
        public Input<string>? SsoIdpSsoUrl { get; set; }

        /// <summary>
        /// IDP issuer URL
        /// </summary>
        [Input("ssoIssuer")]
        public Input<string>? SsoIssuer { get; set; }

        /// <summary>
        /// enum: `email`, `unspecified`
        /// </summary>
        [Input("ssoNameidFormat")]
        public Input<string>? SsoNameidFormat { get; set; }

        /// <summary>
        /// when `sms_provider`==`telstra`, Client ID provided by Telstra
        /// </summary>
        [Input("telstraClientId")]
        public Input<string>? TelstraClientId { get; set; }

        /// <summary>
        /// when `sms_provider`==`telstra`, Client secret provided by Telstra
        /// </summary>
        [Input("telstraClientSecret")]
        public Input<string>? TelstraClientSecret { get; set; }

        /// <summary>
        /// when `sms_provider`==`twilio`, Auth token account with twilio account
        /// </summary>
        [Input("twilioAuthToken")]
        public Input<string>? TwilioAuthToken { get; set; }

        /// <summary>
        /// when `sms_provider`==`twilio`, Twilio phone number associated with the account. See example for accepted format.
        /// </summary>
        [Input("twilioPhoneNumber")]
        public Input<string>? TwilioPhoneNumber { get; set; }

        /// <summary>
        /// when `sms_provider`==`twilio`, Account SID provided by Twilio
        /// </summary>
        [Input("twilioSid")]
        public Input<string>? TwilioSid { get; set; }

        public WlanPortalGetArgs()
        {
        }
        public static new WlanPortalGetArgs Empty => new WlanPortalGetArgs();
    }
}
