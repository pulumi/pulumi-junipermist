// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class WlanPortalTemplatePortalTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessCodeAlternateEmail")]
        public Input<string>? AccessCodeAlternateEmail { get; set; }

        /// <summary>
        /// defines alignment on portal. enum: `center`, `left`, `right`
        /// </summary>
        [Input("alignment")]
        public Input<string>? Alignment { get; set; }

        /// <summary>
        /// label for Amazon auth button
        /// </summary>
        [Input("authButtonAmazon")]
        public Input<string>? AuthButtonAmazon { get; set; }

        /// <summary>
        /// label for Azure auth button
        /// </summary>
        [Input("authButtonAzure")]
        public Input<string>? AuthButtonAzure { get; set; }

        /// <summary>
        /// label for Email auth button
        /// </summary>
        [Input("authButtonEmail")]
        public Input<string>? AuthButtonEmail { get; set; }

        /// <summary>
        /// label for Facebook auth button
        /// </summary>
        [Input("authButtonFacebook")]
        public Input<string>? AuthButtonFacebook { get; set; }

        /// <summary>
        /// label for Google auth button
        /// </summary>
        [Input("authButtonGoogle")]
        public Input<string>? AuthButtonGoogle { get; set; }

        /// <summary>
        /// label for Microsoft auth button
        /// </summary>
        [Input("authButtonMicrosoft")]
        public Input<string>? AuthButtonMicrosoft { get; set; }

        /// <summary>
        /// label for passphrase auth button
        /// </summary>
        [Input("authButtonPassphrase")]
        public Input<string>? AuthButtonPassphrase { get; set; }

        /// <summary>
        /// label for SMS auth button
        /// </summary>
        [Input("authButtonSms")]
        public Input<string>? AuthButtonSms { get; set; }

        /// <summary>
        /// label for Sponsor auth button
        /// </summary>
        [Input("authButtonSponsor")]
        public Input<string>? AuthButtonSponsor { get; set; }

        [Input("authLabel")]
        public Input<string>? AuthLabel { get; set; }

        /// <summary>
        /// label of the link to go back to /logon
        /// </summary>
        [Input("backLink")]
        public Input<string>? BackLink { get; set; }

        /// <summary>
        /// Portal main color
        /// </summary>
        [Input("color")]
        public Input<string>? Color { get; set; }

        [Input("colorDark")]
        public Input<string>? ColorDark { get; set; }

        [Input("colorLight")]
        public Input<string>? ColorLight { get; set; }

        /// <summary>
        /// whether company field is required
        /// </summary>
        [Input("company")]
        public Input<bool>? Company { get; set; }

        /// <summary>
        /// error message when company not provided
        /// </summary>
        [Input("companyError")]
        public Input<string>? CompanyError { get; set; }

        /// <summary>
        /// label of company field
        /// </summary>
        [Input("companyLabel")]
        public Input<string>? CompanyLabel { get; set; }

        /// <summary>
        /// whether email field is required
        /// </summary>
        [Input("email")]
        public Input<bool>? Email { get; set; }

        /// <summary>
        /// error message when a user has valid social login but doesn't match specified email domains.
        /// </summary>
        [Input("emailAccessDomainError")]
        public Input<string>? EmailAccessDomainError { get; set; }

        /// <summary>
        /// Label for cancel confirmation code submission using email auth
        /// </summary>
        [Input("emailCancel")]
        public Input<string>? EmailCancel { get; set; }

        [Input("emailCodeCancel")]
        public Input<string>? EmailCodeCancel { get; set; }

        [Input("emailCodeError")]
        public Input<string>? EmailCodeError { get; set; }

        [Input("emailCodeFieldLabel")]
        public Input<string>? EmailCodeFieldLabel { get; set; }

        [Input("emailCodeMessage")]
        public Input<string>? EmailCodeMessage { get; set; }

        [Input("emailCodeSubmit")]
        public Input<string>? EmailCodeSubmit { get; set; }

        [Input("emailCodeTitle")]
        public Input<string>? EmailCodeTitle { get; set; }

        /// <summary>
        /// error message when email not provided
        /// </summary>
        [Input("emailError")]
        public Input<string>? EmailError { get; set; }

        [Input("emailFieldLabel")]
        public Input<string>? EmailFieldLabel { get; set; }

        /// <summary>
        /// label of email field
        /// </summary>
        [Input("emailLabel")]
        public Input<string>? EmailLabel { get; set; }

        [Input("emailMessage")]
        public Input<string>? EmailMessage { get; set; }

        /// <summary>
        /// Label for confirmation code submit button using email auth
        /// </summary>
        [Input("emailSubmit")]
        public Input<string>? EmailSubmit { get; set; }

        /// <summary>
        /// Title for the Email registration
        /// </summary>
        [Input("emailTitle")]
        public Input<string>? EmailTitle { get; set; }

        /// <summary>
        /// whether to ask field1
        /// </summary>
        [Input("field1")]
        public Input<bool>? Field1 { get; set; }

        /// <summary>
        /// error message when field1 not provided
        /// </summary>
        [Input("field1error")]
        public Input<string>? Field1error { get; set; }

        /// <summary>
        /// label of field1
        /// </summary>
        [Input("field1label")]
        public Input<string>? Field1label { get; set; }

        /// <summary>
        /// whether field1 is required field
        /// </summary>
        [Input("field1required")]
        public Input<bool>? Field1required { get; set; }

        /// <summary>
        /// whether to ask field2
        /// </summary>
        [Input("field2")]
        public Input<bool>? Field2 { get; set; }

        /// <summary>
        /// error message when field2 not provided
        /// </summary>
        [Input("field2error")]
        public Input<string>? Field2error { get; set; }

        /// <summary>
        /// label of field2
        /// </summary>
        [Input("field2label")]
        public Input<string>? Field2label { get; set; }

        /// <summary>
        /// whether field2 is required field
        /// </summary>
        [Input("field2required")]
        public Input<bool>? Field2required { get; set; }

        /// <summary>
        /// whether to ask field3
        /// </summary>
        [Input("field3")]
        public Input<bool>? Field3 { get; set; }

        /// <summary>
        /// error message when field3 not provided
        /// </summary>
        [Input("field3error")]
        public Input<string>? Field3error { get; set; }

        /// <summary>
        /// label of field3
        /// </summary>
        [Input("field3label")]
        public Input<string>? Field3label { get; set; }

        /// <summary>
        /// whether field3 is required field
        /// </summary>
        [Input("field3required")]
        public Input<bool>? Field3required { get; set; }

        /// <summary>
        /// whether to ask field4
        /// </summary>
        [Input("field4")]
        public Input<bool>? Field4 { get; set; }

        /// <summary>
        /// error message when field4 not provided
        /// </summary>
        [Input("field4error")]
        public Input<string>? Field4error { get; set; }

        /// <summary>
        /// label of field4
        /// </summary>
        [Input("field4label")]
        public Input<string>? Field4label { get; set; }

        /// <summary>
        /// whether field4 is required field
        /// </summary>
        [Input("field4required")]
        public Input<bool>? Field4required { get; set; }

        [Input("locales")]
        private InputMap<Inputs.WlanPortalTemplatePortalTemplateLocalesGetArgs>? _locales;

        /// <summary>
        /// Can be used to localize the portal based on the User Agent. Allowed property key values are:
        ///       "ar", "ca-ES", "cs-CZ", "da-DK", "de-DE", "el-GR", "en-GB", "en-US", "es-ES", 
        ///       "fi-FI", "fr-FR", "he-IL", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it-IT", "ja-JP", 
        ///       "ko-KR", "ms-MY", "nb-NO", "nl-NL", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", 
        ///       "sk-SK", "sv-SE", "th-TH", "tr-TR", "uk-UA", "vi-VN", "zh-Hans", "zh-Hant",
        /// </summary>
        public InputMap<Inputs.WlanPortalTemplatePortalTemplateLocalesGetArgs> Locales
        {
            get => _locales ?? (_locales = new InputMap<Inputs.WlanPortalTemplatePortalTemplateLocalesGetArgs>());
            set => _locales = value;
        }

        [Input("message")]
        public Input<string>? Message { get; set; }

        [Input("multiAuth")]
        public Input<bool>? MultiAuth { get; set; }

        /// <summary>
        /// whether name field is required
        /// </summary>
        [Input("name")]
        public Input<bool>? Name { get; set; }

        /// <summary>
        /// error message when name not provided
        /// </summary>
        [Input("nameError")]
        public Input<string>? NameError { get; set; }

        /// <summary>
        /// label of name field
        /// </summary>
        [Input("nameLabel")]
        public Input<string>? NameLabel { get; set; }

        /// <summary>
        /// Default value for the `Do not store` checkbox
        /// </summary>
        [Input("optOutDefault")]
        public Input<bool>? OptOutDefault { get; set; }

        /// <summary>
        /// whether to display Do Not Store My Personal Information
        /// </summary>
        [Input("optout")]
        public Input<bool>? Optout { get; set; }

        /// <summary>
        /// label for Do Not Store My Personal Information
        /// </summary>
        [Input("optoutLabel")]
        public Input<string>? OptoutLabel { get; set; }

        [Input("pageTitle")]
        public Input<string>? PageTitle { get; set; }

        /// <summary>
        /// Label for the Passphrase cancel button
        /// </summary>
        [Input("passphraseCancel")]
        public Input<string>? PassphraseCancel { get; set; }

        /// <summary>
        /// error message when invalid passphrase is provided
        /// </summary>
        [Input("passphraseError")]
        public Input<string>? PassphraseError { get; set; }

        /// <summary>
        /// Passphrase
        /// </summary>
        [Input("passphraseLabel")]
        public Input<string>? PassphraseLabel { get; set; }

        [Input("passphraseMessage")]
        public Input<string>? PassphraseMessage { get; set; }

        /// <summary>
        /// Label for the Passphrase submit button
        /// </summary>
        [Input("passphraseSubmit")]
        public Input<string>? PassphraseSubmit { get; set; }

        /// <summary>
        /// Title for passphrase details page
        /// </summary>
        [Input("passphraseTitle")]
        public Input<string>? PassphraseTitle { get; set; }

        /// <summary>
        /// whether to show \"Powered by Mist\"
        /// </summary>
        [Input("poweredBy")]
        public Input<bool>? PoweredBy { get; set; }

        /// <summary>
        /// wheter to require the Privacy Term acceptance
        /// </summary>
        [Input("privacy")]
        public Input<bool>? Privacy { get; set; }

        /// <summary>
        /// prefix of the label of the link to go to Privacy Policy
        /// </summary>
        [Input("privacyPolicyAcceptLabel")]
        public Input<string>? PrivacyPolicyAcceptLabel { get; set; }

        /// <summary>
        /// error message when Privacy Policy not accepted
        /// </summary>
        [Input("privacyPolicyError")]
        public Input<string>? PrivacyPolicyError { get; set; }

        /// <summary>
        /// label of the link to go to Privacy Policy
        /// </summary>
        [Input("privacyPolicyLink")]
        public Input<string>? PrivacyPolicyLink { get; set; }

        /// <summary>
        /// text of the Privacy Policy
        /// </summary>
        [Input("privacyPolicyText")]
        public Input<string>? PrivacyPolicyText { get; set; }

        /// <summary>
        /// label to denote required field
        /// </summary>
        [Input("requiredFieldLabel")]
        public Input<string>? RequiredFieldLabel { get; set; }

        [Input("responsiveLayout")]
        public Input<bool>? ResponsiveLayout { get; set; }

        /// <summary>
        /// label of the button to /signin
        /// </summary>
        [Input("signInLabel")]
        public Input<string>? SignInLabel { get; set; }

        [Input("smsCarrierDefault")]
        public Input<string>? SmsCarrierDefault { get; set; }

        [Input("smsCarrierError")]
        public Input<string>? SmsCarrierError { get; set; }

        /// <summary>
        /// label for mobile carrier drop-down list
        /// </summary>
        [Input("smsCarrierFieldLabel")]
        public Input<string>? SmsCarrierFieldLabel { get; set; }

        /// <summary>
        /// Label for cancel confirmation code submission
        /// </summary>
        [Input("smsCodeCancel")]
        public Input<string>? SmsCodeCancel { get; set; }

        /// <summary>
        /// error message when confirmation code is invalid
        /// </summary>
        [Input("smsCodeError")]
        public Input<string>? SmsCodeError { get; set; }

        [Input("smsCodeFieldLabel")]
        public Input<string>? SmsCodeFieldLabel { get; set; }

        [Input("smsCodeMessage")]
        public Input<string>? SmsCodeMessage { get; set; }

        /// <summary>
        /// Label for confirmation code submit button
        /// </summary>
        [Input("smsCodeSubmit")]
        public Input<string>? SmsCodeSubmit { get; set; }

        [Input("smsCodeTitle")]
        public Input<string>? SmsCodeTitle { get; set; }

        [Input("smsCountryFieldLabel")]
        public Input<string>? SmsCountryFieldLabel { get; set; }

        [Input("smsCountryFormat")]
        public Input<string>? SmsCountryFormat { get; set; }

        /// <summary>
        /// Label for checkbox to specify that the user has access code
        /// </summary>
        [Input("smsHaveAccessCode")]
        public Input<string>? SmsHaveAccessCode { get; set; }

        [Input("smsIsTwilio")]
        public Input<bool>? SmsIsTwilio { get; set; }

        /// <summary>
        /// format of access code sms message. {{code}} and {{duration}} are place holders and should be retained as is.
        /// </summary>
        [Input("smsMessageFormat")]
        public Input<string>? SmsMessageFormat { get; set; }

        /// <summary>
        /// label for canceling mobile details for SMS auth
        /// </summary>
        [Input("smsNumberCancel")]
        public Input<string>? SmsNumberCancel { get; set; }

        [Input("smsNumberError")]
        public Input<string>? SmsNumberError { get; set; }

        /// <summary>
        /// label for field to provide mobile number
        /// </summary>
        [Input("smsNumberFieldLabel")]
        public Input<string>? SmsNumberFieldLabel { get; set; }

        [Input("smsNumberFormat")]
        public Input<string>? SmsNumberFormat { get; set; }

        [Input("smsNumberMessage")]
        public Input<string>? SmsNumberMessage { get; set; }

        /// <summary>
        /// label for submit button for code generation
        /// </summary>
        [Input("smsNumberSubmit")]
        public Input<string>? SmsNumberSubmit { get; set; }

        /// <summary>
        /// Title for phone number details
        /// </summary>
        [Input("smsNumberTitle")]
        public Input<string>? SmsNumberTitle { get; set; }

        [Input("smsUsernameFormat")]
        public Input<string>? SmsUsernameFormat { get; set; }

        /// <summary>
        /// how long confirmation code should be considered valid (in minutes)
        /// </summary>
        [Input("smsValidityDuration")]
        public Input<int>? SmsValidityDuration { get; set; }

        [Input("sponsorBackLink")]
        public Input<string>? SponsorBackLink { get; set; }

        [Input("sponsorCancel")]
        public Input<string>? SponsorCancel { get; set; }

        /// <summary>
        /// label for Sponsor Email
        /// </summary>
        [Input("sponsorEmail")]
        public Input<string>? SponsorEmail { get; set; }

        [Input("sponsorEmailError")]
        public Input<string>? SponsorEmailError { get; set; }

        /// <summary>
        /// html template to replace/override default sponsor email template 
        /// Sponsor Email Template supports following template variables:
        ///   * `approve_url`: Renders URL to approve the request; optionally &amp;minutes=N query param can be appended to change the Authorization period of the guest, where N is a valid integer denoting number of minutes a guest remains authorized
        ///   * `deny_url`: Renders URL to reject the request
        ///   * `guest_email`: Renders Email ID of the guest
        ///   * `guest_name`: Renders Name of the guest
        ///   * `field1`: Renders value of the Custom Field 1
        ///   * `field2`: Renders value of the Custom Field 2
        ///   * `sponsor_link_validity_duration`: Renders validity time of the request (i.e. Approve/Deny URL)
        ///   * `auth_expire_minutes`: Renders Wlan-level configured Guest Authorization Expiration time period (in minutes), If not configured then default (1 day in minutes)
        /// </summary>
        [Input("sponsorEmailTemplate")]
        public Input<string>? SponsorEmailTemplate { get; set; }

        [Input("sponsorInfoApproved")]
        public Input<string>? SponsorInfoApproved { get; set; }

        [Input("sponsorInfoDenied")]
        public Input<string>? SponsorInfoDenied { get; set; }

        [Input("sponsorInfoPending")]
        public Input<string>? SponsorInfoPending { get; set; }

        /// <summary>
        /// label for Sponsor Name
        /// </summary>
        [Input("sponsorName")]
        public Input<string>? SponsorName { get; set; }

        [Input("sponsorNameError")]
        public Input<string>? SponsorNameError { get; set; }

        [Input("sponsorNotePending")]
        public Input<string>? SponsorNotePending { get; set; }

        /// <summary>
        /// submit button label request Wifi Access and notify sponsor about guest request
        /// </summary>
        [Input("sponsorRequestAccess")]
        public Input<string>? SponsorRequestAccess { get; set; }

        /// <summary>
        /// text to display if sponsor approves request
        /// </summary>
        [Input("sponsorStatusApproved")]
        public Input<string>? SponsorStatusApproved { get; set; }

        /// <summary>
        /// text to display when sponsor denies request
        /// </summary>
        [Input("sponsorStatusDenied")]
        public Input<string>? SponsorStatusDenied { get; set; }

        /// <summary>
        /// text to display if request is still pending
        /// </summary>
        [Input("sponsorStatusPending")]
        public Input<string>? SponsorStatusPending { get; set; }

        /// <summary>
        /// submit button label to notify sponsor about guest request
        /// </summary>
        [Input("sponsorSubmit")]
        public Input<string>? SponsorSubmit { get; set; }

        [Input("sponsorsError")]
        public Input<string>? SponsorsError { get; set; }

        [Input("sponsorsFieldLabel")]
        public Input<string>? SponsorsFieldLabel { get; set; }

        [Input("tos")]
        public Input<bool>? Tos { get; set; }

        /// <summary>
        /// prefix of the label of the link to go to tos
        /// </summary>
        [Input("tosAcceptLabel")]
        public Input<string>? TosAcceptLabel { get; set; }

        /// <summary>
        /// error message when tos not accepted
        /// </summary>
        [Input("tosError")]
        public Input<string>? TosError { get; set; }

        /// <summary>
        /// label of the link to go to tos
        /// </summary>
        [Input("tosLink")]
        public Input<string>? TosLink { get; set; }

        /// <summary>
        /// text of the Terms of Service
        /// </summary>
        [Input("tosText")]
        public Input<string>? TosText { get; set; }

        public WlanPortalTemplatePortalTemplateGetArgs()
        {
        }
        public static new WlanPortalTemplatePortalTemplateGetArgs Empty => new WlanPortalTemplatePortalTemplateGetArgs();
    }
}
