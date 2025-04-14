// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanPortalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Whether to allow guest to connect to other Guest WLANs (with different `WLAN.ssid`) of same org without reauthentication (disable random_mac for seamless roaming)
        /// </summary>
        [Input("allowWlanIdRoam")]
        public Input<bool>? AllowWlanIdRoam { get; set; }

        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Amazon OAuth2 client id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("amazonClientId")]
        public Input<string>? AmazonClientId { get; set; }

        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Amazon OAuth2 client secret. If amazon_client_id was provided, provide a corresponding value. Else leave blank.
        /// </summary>
        [Input("amazonClientSecret")]
        public Input<string>? AmazonClientSecret { get; set; }

        [Input("amazonEmailDomains")]
        private InputList<string>? _amazonEmailDomains;

        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> AmazonEmailDomains
        {
            get => _amazonEmailDomains ?? (_amazonEmailDomains = new InputList<string>());
            set => _amazonEmailDomains = value;
        }

        /// <summary>
        /// Whether amazon is enabled as a login method
        /// </summary>
        [Input("amazonEnabled")]
        public Input<bool>? AmazonEnabled { get; set; }

        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Interval for which guest remains authorized using amazon auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("amazonExpire")]
        public Input<int>? AmazonExpire { get; set; }

        /// <summary>
        /// authentication scheme. enum: `amazon`, `azure`, `email`, `external`, `facebook`, `google`, `microsoft`, `multi`, `none`, `password`, `sms`, `sponsor`, `sso`
        /// </summary>
        [Input("auth")]
        public Input<string>? Auth { get; set; }

        /// <summary>
        /// Required if `azure_enabled`==`true`. Azure active directory app client id
        /// </summary>
        [Input("azureClientId")]
        public Input<string>? AzureClientId { get; set; }

        /// <summary>
        /// Required if `azure_enabled`==`true`. Azure active directory app client secret
        /// </summary>
        [Input("azureClientSecret")]
        public Input<string>? AzureClientSecret { get; set; }

        /// <summary>
        /// Whether Azure Active Directory is enabled as a login method
        /// </summary>
        [Input("azureEnabled")]
        public Input<bool>? AzureEnabled { get; set; }

        /// <summary>
        /// Interval for which guest remains authorized using azure auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("azureExpire")]
        public Input<int>? AzureExpire { get; set; }

        /// <summary>
        /// Required if `azure_enabled`==`true`. Azure active directory tenant id.
        /// </summary>
        [Input("azureTenantId")]
        public Input<string>? AzureTenantId { get; set; }

        [Input("broadnetPassword")]
        private Input<string>? _broadnetPassword;

        /// <summary>
        /// Required if `sms_provider`==`broadnet`
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
        /// Required if `sms_provider`==`broadnet`
        /// </summary>
        [Input("broadnetSid")]
        public Input<string>? BroadnetSid { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`broadnet`
        /// </summary>
        [Input("broadnetUserId")]
        public Input<string>? BroadnetUserId { get; set; }

        /// <summary>
        /// Whether to bypass the guest portal when cloud not reachable (and apply the default policies)
        /// </summary>
        [Input("bypassWhenCloudDown")]
        public Input<bool>? BypassWhenCloudDown { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`clickatell`
        /// </summary>
        [Input("clickatellApiKey")]
        public Input<string>? ClickatellApiKey { get; set; }

        /// <summary>
        /// Whether to allow guest to roam between WLANs (with same `WLAN.ssid`, regardless of variables) of different sites of same org without reauthentication (disable random_mac for seamless roaming)
        /// </summary>
        [Input("crossSite")]
        public Input<bool>? CrossSite { get; set; }

        /// <summary>
        /// Whether email (access code verification) is enabled as a login method
        /// </summary>
        [Input("emailEnabled")]
        public Input<bool>? EmailEnabled { get; set; }

        /// <summary>
        /// Whether guest portal is enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// How long to remain authorized, in minutes
        /// </summary>
        [Input("expire")]
        public Input<int>? Expire { get; set; }

        /// <summary>
        /// Required if `wlan_portal_auth`==`external`. External portal URL (e.g. https://host/url) where we can append our query parameters to
        /// </summary>
        [Input("externalPortalUrl")]
        public Input<string>? ExternalPortalUrl { get; set; }

        /// <summary>
        /// Required if `facebook_enabled`==`true`. Facebook OAuth2 app id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("facebookClientId")]
        public Input<string>? FacebookClientId { get; set; }

        /// <summary>
        /// Required if `facebook_enabled`==`true`. Facebook OAuth2 app secret. If facebook_client_id was provided, provide a corresponding value. Else leave blank.
        /// </summary>
        [Input("facebookClientSecret")]
        public Input<string>? FacebookClientSecret { get; set; }

        [Input("facebookEmailDomains")]
        private InputList<string>? _facebookEmailDomains;

        /// <summary>
        /// Optional if `facebook_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> FacebookEmailDomains
        {
            get => _facebookEmailDomains ?? (_facebookEmailDomains = new InputList<string>());
            set => _facebookEmailDomains = value;
        }

        /// <summary>
        /// Whether facebook is enabled as a login method
        /// </summary>
        [Input("facebookEnabled")]
        public Input<bool>? FacebookEnabled { get; set; }

        /// <summary>
        /// Optional if `facebook_enabled`==`true`. Interval for which guest remains authorized using facebook auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("facebookExpire")]
        public Input<int>? FacebookExpire { get; set; }

        /// <summary>
        /// Whether to forward the user to another URL after authorized
        /// </summary>
        [Input("forward")]
        public Input<bool>? Forward { get; set; }

        /// <summary>
        /// URL to forward the user to
        /// </summary>
        [Input("forwardUrl")]
        public Input<string>? ForwardUrl { get; set; }

        /// <summary>
        /// Google OAuth2 app id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("googleClientId")]
        public Input<string>? GoogleClientId { get; set; }

        /// <summary>
        /// Optional if `google_enabled`==`true`. Google OAuth2 app secret. If google_client_id was provided, provide a corresponding value. Else leave blank.
        /// </summary>
        [Input("googleClientSecret")]
        public Input<string>? GoogleClientSecret { get; set; }

        [Input("googleEmailDomains")]
        private InputList<string>? _googleEmailDomains;

        /// <summary>
        /// Optional if `google_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> GoogleEmailDomains
        {
            get => _googleEmailDomains ?? (_googleEmailDomains = new InputList<string>());
            set => _googleEmailDomains = value;
        }

        /// <summary>
        /// Whether Google is enabled as login method
        /// </summary>
        [Input("googleEnabled")]
        public Input<bool>? GoogleEnabled { get; set; }

        /// <summary>
        /// Optional if `google_enabled`==`true`. Interval for which guest remains authorized using Google Auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("googleExpire")]
        public Input<int>? GoogleExpire { get; set; }

        [Input("gupshupPassword")]
        private Input<string>? _gupshupPassword;

        /// <summary>
        /// Required if `sms_provider`==`gupshup`
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
        /// Required if `sms_provider`==`gupshup`
        /// </summary>
        [Input("gupshupUserid")]
        public Input<string>? GupshupUserid { get; set; }

        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Microsoft 365 OAuth2 client id. This is optional. If not provided, it will use a default one.
        /// </summary>
        [Input("microsoftClientId")]
        public Input<string>? MicrosoftClientId { get; set; }

        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Microsoft 365 OAuth2 client secret. If microsoft_client_id was provided, provide a corresponding value. Else leave blank.
        /// </summary>
        [Input("microsoftClientSecret")]
        public Input<string>? MicrosoftClientSecret { get; set; }

        [Input("microsoftEmailDomains")]
        private InputList<string>? _microsoftEmailDomains;

        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public InputList<string> MicrosoftEmailDomains
        {
            get => _microsoftEmailDomains ?? (_microsoftEmailDomains = new InputList<string>());
            set => _microsoftEmailDomains = value;
        }

        /// <summary>
        /// Whether microsoft 365 is enabled as a login method
        /// </summary>
        [Input("microsoftEnabled")]
        public Input<bool>? MicrosoftEnabled { get; set; }

        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Interval for which guest remains authorized using microsoft auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("microsoftExpire")]
        public Input<int>? MicrosoftExpire { get; set; }

        /// <summary>
        /// Whether password is enabled
        /// </summary>
        [Input("passphraseEnabled")]
        public Input<bool>? PassphraseEnabled { get; set; }

        /// <summary>
        /// Optional if `passphrase_enabled`==`true`. Interval for which guest remains authorized using passphrase auth (in minutes), if not provided, uses `expire`
        /// </summary>
        [Input("passphraseExpire")]
        public Input<int>? PassphraseExpire { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Required if `passphrase_enabled`==`true`.
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
        /// Whether to show list of sponsor emails mentioned in `sponsors` object as a dropdown. If both `sponsor_notify_all` and `predefined_sponsors_enabled` are false, behaviour is acc to `sponsor_email_domains`
        /// </summary>
        [Input("predefinedSponsorsEnabled")]
        public Input<bool>? PredefinedSponsorsEnabled { get; set; }

        /// <summary>
        /// Whether to hide sponsor’s email from list of sponsors
        /// </summary>
        [Input("predefinedSponsorsHideEmail")]
        public Input<bool>? PredefinedSponsorsHideEmail { get; set; }

        [Input("privacy")]
        public Input<bool>? Privacy { get; set; }

        [Input("puzzelPassword")]
        private Input<string>? _puzzelPassword;

        /// <summary>
        /// Required if `sms_provider`==`puzzel`
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
        /// Required if `sms_provider`==`puzzel`
        /// </summary>
        [Input("puzzelServiceId")]
        public Input<string>? PuzzelServiceId { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`puzzel`
        /// </summary>
        [Input("puzzelUsername")]
        public Input<string>? PuzzelUsername { get; set; }

        /// <summary>
        /// Whether sms is enabled as a login method
        /// </summary>
        [Input("smsEnabled")]
        public Input<bool>? SmsEnabled { get; set; }

        /// <summary>
        /// Optional if `sms_enabled`==`true`. Interval for which guest remains authorized using sms auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("smsExpire")]
        public Input<int>? SmsExpire { get; set; }

        /// <summary>
        /// Optional if `sms_enabled`==`true`. SMS Message format
        /// </summary>
        [Input("smsMessageFormat")]
        public Input<string>? SmsMessageFormat { get; set; }

        /// <summary>
        /// Optioanl if `sms_enabled`==`true`. enum: `broadnet`, `clickatell`, `gupshup`, `manual`, `puzzel`, `telstra`, `twilio`
        /// </summary>
        [Input("smsProvider")]
        public Input<string>? SmsProvider { get; set; }

        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. Whether to automatically approve guest and allow sponsor to revoke guest access, needs predefined_sponsors_enabled enabled and sponsor_notify_all disabled
        /// </summary>
        [Input("sponsorAutoApprove")]
        public Input<bool>? SponsorAutoApprove { get; set; }

        [Input("sponsorEmailDomains")]
        private InputList<string>? _sponsorEmailDomains;

        /// <summary>
        /// List of domain allowed for sponsor email. Required if `sponsor_enabled` is `true` and `sponsors` is empty.
        /// </summary>
        public InputList<string> SponsorEmailDomains
        {
            get => _sponsorEmailDomains ?? (_sponsorEmailDomains = new InputList<string>());
            set => _sponsorEmailDomains = value;
        }

        /// <summary>
        /// Whether sponsor is enabled
        /// </summary>
        [Input("sponsorEnabled")]
        public Input<bool>? SponsorEnabled { get; set; }

        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. Interval for which guest remains authorized using sponsor auth (in minutes), if not provided, uses expire`
        /// </summary>
        [Input("sponsorExpire")]
        public Input<int>? SponsorExpire { get; set; }

        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. How long to remain valid sponsored guest request approve/deny link received in email, in minutes. Default is 60 minutes.
        /// </summary>
        [Input("sponsorLinkValidityDuration")]
        public Input<string>? SponsorLinkValidityDuration { get; set; }

        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. whether to notify all sponsors that are mentioned in `sponsors` object. Both `sponsor_notify_all` and `predefined_sponsors_enabled` should be true in order to notify sponsors. If true, email sent to 10 sponsors in no particular order.
        /// </summary>
        [Input("sponsorNotifyAll")]
        public Input<bool>? SponsorNotifyAll { get; set; }

        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. If enabled, guest will get email about sponsor's action (approve/deny)
        /// </summary>
        [Input("sponsorStatusNotify")]
        public Input<bool>? SponsorStatusNotify { get; set; }

        [Input("sponsors")]
        private InputMap<string>? _sponsors;

        /// <summary>
        /// object of allowed sponsors email with name. Required if `sponsor_enabled`
        ///             is `true` and `sponsor_email_domains` is empty.
        /// 
        ///             Property key is the sponsor email, Property value is the sponsor name
        /// </summary>
        public InputMap<string> Sponsors
        {
            get => _sponsors ?? (_sponsors = new InputMap<string>());
            set => _sponsors = value;
        }

        /// <summary>
        /// Optional if `wlan_portal_auth`==`sso`, default role to assign if there’s no match. By default, an assertion is treated as invalid when there’s no role matched
        /// </summary>
        [Input("ssoDefaultRole")]
        public Input<string>? SsoDefaultRole { get; set; }

        /// <summary>
        /// Optional if `wlan_portal_auth`==`sso`
        /// </summary>
        [Input("ssoForcedRole")]
        public Input<string>? SsoForcedRole { get; set; }

        /// <summary>
        /// Required if `wlan_portal_auth`==`sso`. IDP Cert (used to verify the signed response)
        /// </summary>
        [Input("ssoIdpCert")]
        public Input<string>? SsoIdpCert { get; set; }

        /// <summary>
        /// Optioanl if `wlan_portal_auth`==`sso`, Signing algorithm for SAML Assertion. enum: `sha1`, `sha256`, `sha384`, `sha512`
        /// </summary>
        [Input("ssoIdpSignAlgo")]
        public Input<string>? SsoIdpSignAlgo { get; set; }

        /// <summary>
        /// Required if `wlan_portal_auth`==`sso`, IDP Single-Sign-On URL
        /// </summary>
        [Input("ssoIdpSsoUrl")]
        public Input<string>? SsoIdpSsoUrl { get; set; }

        /// <summary>
        /// Required if `wlan_portal_auth`==`sso`, IDP issuer URL
        /// </summary>
        [Input("ssoIssuer")]
        public Input<string>? SsoIssuer { get; set; }

        /// <summary>
        /// Optional if `wlan_portal_auth`==`sso`. enum: `email`, `unspecified`
        /// </summary>
        [Input("ssoNameidFormat")]
        public Input<string>? SsoNameidFormat { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`telstra`, Client ID provided by Telstra
        /// </summary>
        [Input("telstraClientId")]
        public Input<string>? TelstraClientId { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`telstra`, Client secret provided by Telstra
        /// </summary>
        [Input("telstraClientSecret")]
        public Input<string>? TelstraClientSecret { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`twilio`, Auth token account with twilio account
        /// </summary>
        [Input("twilioAuthToken")]
        public Input<string>? TwilioAuthToken { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`twilio`, Twilio phone number associated with the account. See example for accepted format.
        /// </summary>
        [Input("twilioPhoneNumber")]
        public Input<string>? TwilioPhoneNumber { get; set; }

        /// <summary>
        /// Required if `sms_provider`==`twilio`, Account SID provided by Twilio
        /// </summary>
        [Input("twilioSid")]
        public Input<string>? TwilioSid { get; set; }

        public WlanPortalArgs()
        {
        }
        public static new WlanPortalArgs Empty => new WlanPortalArgs();
    }
}
