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
    public sealed class WlanPortal
    {
        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Whether to allow guest to connect to other Guest WLANs (with different `WLAN.ssid`) of same org without reauthentication (disable random_mac for seamless roaming)
        /// </summary>
        public readonly bool? AllowWlanIdRoam;
        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Amazon OAuth2 client id. This is optional. If not provided, it will use a default one.
        /// </summary>
        public readonly string? AmazonClientId;
        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Amazon OAuth2 client secret. If amazon_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        public readonly string? AmazonClientSecret;
        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> AmazonEmailDomains;
        /// <summary>
        /// Whether amazon is enabled as a login method
        /// </summary>
        public readonly bool? AmazonEnabled;
        /// <summary>
        /// Optional if `amazon_enabled`==`true`. Interval for which guest remains authorized using amazon auth (in minutes), if not provided, uses expire`
        /// </summary>
        public readonly int? AmazonExpire;
        /// <summary>
        /// authentication scheme. enum: `amazon`, `azure`, `email`, `external`, `facebook`, `google`, `microsoft`, `multi`, `none`, `password`, `sponsor`, `sso`
        /// </summary>
        public readonly string? Auth;
        /// <summary>
        /// Required if `azure_enabled`==`true`. Azure active directory app client id
        /// </summary>
        public readonly string? AzureClientId;
        /// <summary>
        /// Required if `azure_enabled`==`true`. Azure active directory app client secret
        /// </summary>
        public readonly string? AzureClientSecret;
        /// <summary>
        /// Whether Azure Active Directory is enabled as a login method
        /// </summary>
        public readonly bool? AzureEnabled;
        /// <summary>
        /// Interval for which guest remains authorized using azure auth (in minutes), if not provided, uses expire`
        /// </summary>
        public readonly int? AzureExpire;
        /// <summary>
        /// Required if `azure_enabled`==`true`. Azure active directory tenant id.
        /// </summary>
        public readonly string? AzureTenantId;
        /// <summary>
        /// Required if `sms_provider`==`broadnet`
        /// </summary>
        public readonly string? BroadnetPassword;
        /// <summary>
        /// Required if `sms_provider`==`broadnet`
        /// </summary>
        public readonly string? BroadnetSid;
        /// <summary>
        /// Required if `sms_provider`==`broadnet`
        /// </summary>
        public readonly string? BroadnetUserId;
        /// <summary>
        /// Whether to bypass the guest portal when cloud not reachable (and apply the default policies)
        /// </summary>
        public readonly bool? BypassWhenCloudDown;
        /// <summary>
        /// Required if `sms_provider`==`clickatell`
        /// </summary>
        public readonly string? ClickatellApiKey;
        /// <summary>
        /// Whether to allow guest to roam between WLANs (with same `WLAN.ssid`, regardless of variables) of different sites of same org without reauthentication (disable random_mac for seamless roaming)
        /// </summary>
        public readonly bool? CrossSite;
        /// <summary>
        /// Whether email (access code verification) is enabled as a login method
        /// </summary>
        public readonly bool? EmailEnabled;
        /// <summary>
        /// Whether guest portal is enabled
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// How long to remain authorized, in minutes
        /// </summary>
        public readonly int? Expire;
        /// <summary>
        /// Required if `wlan_portal_auth`==`external`. External portal URL (e.g. https://host/url) where we can append our query parameters to
        /// </summary>
        public readonly string? ExternalPortalUrl;
        /// <summary>
        /// Required if `facebook_enabled`==`true`. Facebook OAuth2 app id. This is optional. If not provided, it will use a default one.
        /// </summary>
        public readonly string? FacebookClientId;
        /// <summary>
        /// Required if `facebook_enabled`==`true`. Facebook OAuth2 app secret. If facebook_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        public readonly string? FacebookClientSecret;
        /// <summary>
        /// Optional if `facebook_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> FacebookEmailDomains;
        /// <summary>
        /// Whether facebook is enabled as a login method
        /// </summary>
        public readonly bool? FacebookEnabled;
        /// <summary>
        /// Optional if `facebook_enabled`==`true`. Interval for which guest remains authorized using facebook auth (in minutes), if not provided, uses expire`
        /// </summary>
        public readonly int? FacebookExpire;
        /// <summary>
        /// Whether to forward the user to another URL after authorized
        /// </summary>
        public readonly bool? Forward;
        /// <summary>
        /// URL to forward the user to
        /// </summary>
        public readonly string? ForwardUrl;
        /// <summary>
        /// Google OAuth2 app id. This is optional. If not provided, it will use a default one.
        /// </summary>
        public readonly string? GoogleClientId;
        /// <summary>
        /// Optional if `google_enabled`==`true`. Google OAuth2 app secret. If google_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        public readonly string? GoogleClientSecret;
        /// <summary>
        /// Optional if `google_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> GoogleEmailDomains;
        /// <summary>
        /// Whether Google is enabled as login method
        /// </summary>
        public readonly bool? GoogleEnabled;
        /// <summary>
        /// Optional if `google_enabled`==`true`. Interval for which guest remains authorized using Google Auth (in minutes), if not provided, uses expire`
        /// </summary>
        public readonly int? GoogleExpire;
        /// <summary>
        /// Required if `sms_provider`==`gupshup`
        /// </summary>
        public readonly string? GupshupPassword;
        /// <summary>
        /// Required if `sms_provider`==`gupshup`
        /// </summary>
        public readonly string? GupshupUserid;
        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Microsoft 365 OAuth2 client id. This is optional. If not provided, it will use a default one.
        /// </summary>
        public readonly string? MicrosoftClientId;
        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Microsoft 365 OAuth2 client secret. If microsoft_client_id was provided, provide a correspoinding value. Else leave blank.
        /// </summary>
        public readonly string? MicrosoftClientSecret;
        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Matches authenticated user email against provided domains. If null or [], all authenticated emails will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> MicrosoftEmailDomains;
        /// <summary>
        /// Whether microsoft 365 is enabled as a login method
        /// </summary>
        public readonly bool? MicrosoftEnabled;
        /// <summary>
        /// Optional if `microsoft_enabled`==`true`. Interval for which guest remains authorized using microsoft auth (in minutes), if not provided, uses expire`
        /// </summary>
        public readonly int? MicrosoftExpire;
        /// <summary>
        /// Whether password is enabled
        /// </summary>
        public readonly bool? PassphraseEnabled;
        /// <summary>
        /// Optional if `passphrase_enabled`==`true`. Interval for which guest remains authorized using passphrase auth (in minutes), if not provided, uses `expire`
        /// </summary>
        public readonly int? PassphraseExpire;
        /// <summary>
        /// Required if `passphrase_enabled`==`true`.
        /// </summary>
        public readonly string? Password;
        /// <summary>
        /// Whether to show list of sponsor emails mentioned in `sponsors` object as a dropdown. If both `sponsor_notify_all` and `predefined_sponsors_enabled` are false, behaviour is acc to `sponsor_email_domains`
        /// </summary>
        public readonly bool? PredefinedSponsorsEnabled;
        /// <summary>
        /// Whether to hide sponsor’s email from list of sponsors
        /// </summary>
        public readonly bool? PredefinedSponsorsHideEmail;
        public readonly bool? Privacy;
        /// <summary>
        /// Required if `sms_provider`==`puzzel`
        /// </summary>
        public readonly string? PuzzelPassword;
        /// <summary>
        /// Required if `sms_provider`==`puzzel`
        /// </summary>
        public readonly string? PuzzelServiceId;
        /// <summary>
        /// Required if `sms_provider`==`puzzel`
        /// </summary>
        public readonly string? PuzzelUsername;
        /// <summary>
        /// Whether sms is enabled as a login method
        /// </summary>
        public readonly bool? SmsEnabled;
        /// <summary>
        /// Optional if `sms_enabled`==`true`. Interval for which guest remains authorized using sms auth (in minutes), if not provided, uses expire`
        /// </summary>
        public readonly int? SmsExpire;
        /// <summary>
        /// Optional if `sms_enabled`==`true`. SMS Message format
        /// </summary>
        public readonly string? SmsMessageFormat;
        /// <summary>
        /// Optioanl if `sms_enabled`==`true`. enum: `broadnet`, `clickatell`, `gupshup`, `manual`, `puzzel`, `telstra`, `twilio`
        /// </summary>
        public readonly string? SmsProvider;
        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. Whether to automatically approve guest and allow sponsor to revoke guest access, needs predefined_sponsors_enabled enabled and sponsor_notify_all disabled
        /// </summary>
        public readonly bool? SponsorAutoApprove;
        /// <summary>
        /// List of domain allowed for sponsor email. Required if `sponsor_enabled` is `true` and `sponsors` is empty.
        /// </summary>
        public readonly ImmutableArray<string> SponsorEmailDomains;
        /// <summary>
        /// Whether sponsor is enabled
        /// </summary>
        public readonly bool? SponsorEnabled;
        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. Interval for which guest remains authorized using sponsor auth (in minutes), if not provided, uses expire`
        /// </summary>
        public readonly int? SponsorExpire;
        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. How long to remain valid sponsored guest request approve/deny link received in email, in minutes.
        /// </summary>
        public readonly string? SponsorLinkValidityDuration;
        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. whether to notify all sponsors that are mentioned in `sponsors` object. Both `sponsor_notify_all` and `predefined_sponsors_enabled` should be true in order to notify sponsors. If true, email sent to 10 sponsors in no particular order.
        /// </summary>
        public readonly bool? SponsorNotifyAll;
        /// <summary>
        /// Optional if `sponsor_enabled`==`true`. If enabled, guest will get email about sponsor's action (approve/deny)
        /// </summary>
        public readonly bool? SponsorStatusNotify;
        /// <summary>
        /// object of allowed sponsors email with name. Required if `sponsor_enabled`
        ///             is `true` and `sponsor_email_domains` is empty.
        /// 
        ///             Property key is the sponsor email, Property value is the sponsor name
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Sponsors;
        /// <summary>
        /// Optionl if `wlan_portal_auth`==`sso`, default role to assign if there’s no match. By default, an assertion is treated as invalid when there’s no role matched
        /// </summary>
        public readonly string? SsoDefaultRole;
        /// <summary>
        /// Optionl if `wlan_portal_auth`==`sso`
        /// </summary>
        public readonly string? SsoForcedRole;
        /// <summary>
        /// Required if `wlan_portal_auth`==`sso`. IDP Cert (used to verify the signed response)
        /// </summary>
        public readonly string? SsoIdpCert;
        /// <summary>
        /// Optioanl if `wlan_portal_auth`==`sso`, Signing algorithm for SAML Assertion. enum: `sha1`, `sha256`, `sha384`, `sha512`
        /// </summary>
        public readonly string? SsoIdpSignAlgo;
        /// <summary>
        /// Required if `wlan_portal_auth`==`sso`, IDP Single-Sign-On URL
        /// </summary>
        public readonly string? SsoIdpSsoUrl;
        /// <summary>
        /// Required if `wlan_portal_auth`==`sso`, IDP issuer URL
        /// </summary>
        public readonly string? SsoIssuer;
        /// <summary>
        /// Optional if `wlan_portal_auth`==`sso`. enum: `email`, `unspecified`
        /// </summary>
        public readonly string? SsoNameidFormat;
        /// <summary>
        /// Required if `sms_provider`==`telstra`, Client ID provided by Telstra
        /// </summary>
        public readonly string? TelstraClientId;
        /// <summary>
        /// Required if `sms_provider`==`telstra`, Client secret provided by Telstra
        /// </summary>
        public readonly string? TelstraClientSecret;
        /// <summary>
        /// Required if `sms_provider`==`twilio`, Auth token account with twilio account
        /// </summary>
        public readonly string? TwilioAuthToken;
        /// <summary>
        /// Required if `sms_provider`==`twilio`, Twilio phone number associated with the account. See example for accepted format.
        /// </summary>
        public readonly string? TwilioPhoneNumber;
        /// <summary>
        /// Required if `sms_provider`==`twilio`, Account SID provided by Twilio
        /// </summary>
        public readonly string? TwilioSid;

        [OutputConstructor]
        private WlanPortal(
            bool? allowWlanIdRoam,

            string? amazonClientId,

            string? amazonClientSecret,

            ImmutableArray<string> amazonEmailDomains,

            bool? amazonEnabled,

            int? amazonExpire,

            string? auth,

            string? azureClientId,

            string? azureClientSecret,

            bool? azureEnabled,

            int? azureExpire,

            string? azureTenantId,

            string? broadnetPassword,

            string? broadnetSid,

            string? broadnetUserId,

            bool? bypassWhenCloudDown,

            string? clickatellApiKey,

            bool? crossSite,

            bool? emailEnabled,

            bool? enabled,

            int? expire,

            string? externalPortalUrl,

            string? facebookClientId,

            string? facebookClientSecret,

            ImmutableArray<string> facebookEmailDomains,

            bool? facebookEnabled,

            int? facebookExpire,

            bool? forward,

            string? forwardUrl,

            string? googleClientId,

            string? googleClientSecret,

            ImmutableArray<string> googleEmailDomains,

            bool? googleEnabled,

            int? googleExpire,

            string? gupshupPassword,

            string? gupshupUserid,

            string? microsoftClientId,

            string? microsoftClientSecret,

            ImmutableArray<string> microsoftEmailDomains,

            bool? microsoftEnabled,

            int? microsoftExpire,

            bool? passphraseEnabled,

            int? passphraseExpire,

            string? password,

            bool? predefinedSponsorsEnabled,

            bool? predefinedSponsorsHideEmail,

            bool? privacy,

            string? puzzelPassword,

            string? puzzelServiceId,

            string? puzzelUsername,

            bool? smsEnabled,

            int? smsExpire,

            string? smsMessageFormat,

            string? smsProvider,

            bool? sponsorAutoApprove,

            ImmutableArray<string> sponsorEmailDomains,

            bool? sponsorEnabled,

            int? sponsorExpire,

            string? sponsorLinkValidityDuration,

            bool? sponsorNotifyAll,

            bool? sponsorStatusNotify,

            ImmutableDictionary<string, string>? sponsors,

            string? ssoDefaultRole,

            string? ssoForcedRole,

            string? ssoIdpCert,

            string? ssoIdpSignAlgo,

            string? ssoIdpSsoUrl,

            string? ssoIssuer,

            string? ssoNameidFormat,

            string? telstraClientId,

            string? telstraClientSecret,

            string? twilioAuthToken,

            string? twilioPhoneNumber,

            string? twilioSid)
        {
            AllowWlanIdRoam = allowWlanIdRoam;
            AmazonClientId = amazonClientId;
            AmazonClientSecret = amazonClientSecret;
            AmazonEmailDomains = amazonEmailDomains;
            AmazonEnabled = amazonEnabled;
            AmazonExpire = amazonExpire;
            Auth = auth;
            AzureClientId = azureClientId;
            AzureClientSecret = azureClientSecret;
            AzureEnabled = azureEnabled;
            AzureExpire = azureExpire;
            AzureTenantId = azureTenantId;
            BroadnetPassword = broadnetPassword;
            BroadnetSid = broadnetSid;
            BroadnetUserId = broadnetUserId;
            BypassWhenCloudDown = bypassWhenCloudDown;
            ClickatellApiKey = clickatellApiKey;
            CrossSite = crossSite;
            EmailEnabled = emailEnabled;
            Enabled = enabled;
            Expire = expire;
            ExternalPortalUrl = externalPortalUrl;
            FacebookClientId = facebookClientId;
            FacebookClientSecret = facebookClientSecret;
            FacebookEmailDomains = facebookEmailDomains;
            FacebookEnabled = facebookEnabled;
            FacebookExpire = facebookExpire;
            Forward = forward;
            ForwardUrl = forwardUrl;
            GoogleClientId = googleClientId;
            GoogleClientSecret = googleClientSecret;
            GoogleEmailDomains = googleEmailDomains;
            GoogleEnabled = googleEnabled;
            GoogleExpire = googleExpire;
            GupshupPassword = gupshupPassword;
            GupshupUserid = gupshupUserid;
            MicrosoftClientId = microsoftClientId;
            MicrosoftClientSecret = microsoftClientSecret;
            MicrosoftEmailDomains = microsoftEmailDomains;
            MicrosoftEnabled = microsoftEnabled;
            MicrosoftExpire = microsoftExpire;
            PassphraseEnabled = passphraseEnabled;
            PassphraseExpire = passphraseExpire;
            Password = password;
            PredefinedSponsorsEnabled = predefinedSponsorsEnabled;
            PredefinedSponsorsHideEmail = predefinedSponsorsHideEmail;
            Privacy = privacy;
            PuzzelPassword = puzzelPassword;
            PuzzelServiceId = puzzelServiceId;
            PuzzelUsername = puzzelUsername;
            SmsEnabled = smsEnabled;
            SmsExpire = smsExpire;
            SmsMessageFormat = smsMessageFormat;
            SmsProvider = smsProvider;
            SponsorAutoApprove = sponsorAutoApprove;
            SponsorEmailDomains = sponsorEmailDomains;
            SponsorEnabled = sponsorEnabled;
            SponsorExpire = sponsorExpire;
            SponsorLinkValidityDuration = sponsorLinkValidityDuration;
            SponsorNotifyAll = sponsorNotifyAll;
            SponsorStatusNotify = sponsorStatusNotify;
            Sponsors = sponsors;
            SsoDefaultRole = ssoDefaultRole;
            SsoForcedRole = ssoForcedRole;
            SsoIdpCert = ssoIdpCert;
            SsoIdpSignAlgo = ssoIdpSignAlgo;
            SsoIdpSsoUrl = ssoIdpSsoUrl;
            SsoIssuer = ssoIssuer;
            SsoNameidFormat = ssoNameidFormat;
            TelstraClientId = telstraClientId;
            TelstraClientSecret = telstraClientSecret;
            TwilioAuthToken = twilioAuthToken;
            TwilioPhoneNumber = twilioPhoneNumber;
            TwilioSid = twilioSid;
        }
    }
}
