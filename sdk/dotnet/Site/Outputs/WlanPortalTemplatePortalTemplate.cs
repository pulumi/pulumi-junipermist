// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class WlanPortalTemplatePortalTemplate
    {
        public readonly string? AccessCodeAlternateEmail;
        /// <summary>
        /// defines alignment on portal. enum: `center`, `left`, `right`
        /// </summary>
        public readonly string? Alignment;
        /// <summary>
        /// label for Amazon auth button
        /// </summary>
        public readonly string? AuthButtonAmazon;
        /// <summary>
        /// label for Azure auth button
        /// </summary>
        public readonly string? AuthButtonAzure;
        /// <summary>
        /// label for Email auth button
        /// </summary>
        public readonly string? AuthButtonEmail;
        /// <summary>
        /// label for Facebook auth button
        /// </summary>
        public readonly string? AuthButtonFacebook;
        /// <summary>
        /// label for Google auth button
        /// </summary>
        public readonly string? AuthButtonGoogle;
        /// <summary>
        /// label for Microsoft auth button
        /// </summary>
        public readonly string? AuthButtonMicrosoft;
        /// <summary>
        /// label for passphrase auth button
        /// </summary>
        public readonly string? AuthButtonPassphrase;
        /// <summary>
        /// label for SMS auth button
        /// </summary>
        public readonly string? AuthButtonSms;
        /// <summary>
        /// label for Sponsor auth button
        /// </summary>
        public readonly string? AuthButtonSponsor;
        public readonly string? AuthLabel;
        /// <summary>
        /// label of the link to go back to /logon
        /// </summary>
        public readonly string? BackLink;
        /// <summary>
        /// Portal main color
        /// </summary>
        public readonly string? Color;
        public readonly string? ColorDark;
        public readonly string? ColorLight;
        /// <summary>
        /// whether company field is required
        /// </summary>
        public readonly bool? Company;
        /// <summary>
        /// error message when company not provided
        /// </summary>
        public readonly string? CompanyError;
        /// <summary>
        /// label of company field
        /// </summary>
        public readonly string? CompanyLabel;
        /// <summary>
        /// whether email field is required
        /// </summary>
        public readonly bool? Email;
        /// <summary>
        /// error message when a user has valid social login but doesn't match specified email domains.
        /// </summary>
        public readonly string? EmailAccessDomainError;
        /// <summary>
        /// Label for cancel confirmation code submission using email auth
        /// </summary>
        public readonly string? EmailCancel;
        public readonly string? EmailCodeCancel;
        public readonly string? EmailCodeError;
        public readonly string? EmailCodeFieldLabel;
        public readonly string? EmailCodeMessage;
        public readonly string? EmailCodeSubmit;
        public readonly string? EmailCodeTitle;
        /// <summary>
        /// error message when email not provided
        /// </summary>
        public readonly string? EmailError;
        public readonly string? EmailFieldLabel;
        /// <summary>
        /// label of email field
        /// </summary>
        public readonly string? EmailLabel;
        public readonly string? EmailMessage;
        /// <summary>
        /// Label for confirmation code submit button using email auth
        /// </summary>
        public readonly string? EmailSubmit;
        /// <summary>
        /// Title for the Email registration
        /// </summary>
        public readonly string? EmailTitle;
        /// <summary>
        /// whether to ask field1
        /// </summary>
        public readonly bool? Field1;
        /// <summary>
        /// error message when field1 not provided
        /// </summary>
        public readonly string? Field1error;
        /// <summary>
        /// label of field1
        /// </summary>
        public readonly string? Field1label;
        /// <summary>
        /// whether field1 is required field
        /// </summary>
        public readonly bool? Field1required;
        /// <summary>
        /// whether to ask field2
        /// </summary>
        public readonly bool? Field2;
        /// <summary>
        /// error message when field2 not provided
        /// </summary>
        public readonly string? Field2error;
        /// <summary>
        /// label of field2
        /// </summary>
        public readonly string? Field2label;
        /// <summary>
        /// whether field2 is required field
        /// </summary>
        public readonly bool? Field2required;
        /// <summary>
        /// whether to ask field3
        /// </summary>
        public readonly bool? Field3;
        /// <summary>
        /// error message when field3 not provided
        /// </summary>
        public readonly string? Field3error;
        /// <summary>
        /// label of field3
        /// </summary>
        public readonly string? Field3label;
        /// <summary>
        /// whether field3 is required field
        /// </summary>
        public readonly bool? Field3required;
        /// <summary>
        /// whether to ask field4
        /// </summary>
        public readonly bool? Field4;
        /// <summary>
        /// error message when field4 not provided
        /// </summary>
        public readonly string? Field4error;
        /// <summary>
        /// label of field4
        /// </summary>
        public readonly string? Field4label;
        /// <summary>
        /// whether field4 is required field
        /// </summary>
        public readonly bool? Field4required;
        /// <summary>
        /// Can be used to localize the portal based on the User Agent. Allowed property key values are:
        ///   `ar`, `ca-ES`, `cs-CZ`, `da-DK`, `de-DE`, `el-GR`, `en-GB`, `en-US`, `es-ES`, `fi-FI`, `fr-FR`, 
        ///   `he-IL`, `hi-IN`, `hr-HR`, `hu-HU`, `id-ID`, `it-IT`, `ja-J^`, `ko-KT`, `ms-MY`, `nb-NO`, `nl-NL`, 
        ///   `pl-PL`, `pt-BR`, `pt-PT`, `ro-RO`, `ru-RU`, `sk-SK`, `sv-SE`, `th-TH`, `tr-TR`, `uk-UA`, `vi-VN`, 
        ///   `zh-Hans`, `zh-Hant`
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.WlanPortalTemplatePortalTemplateLocales>? Locales;
        /// <summary>
        /// path to the background image file. File must be a `png` image`
        /// </summary>
        public readonly string? Logo;
        public readonly string? Message;
        public readonly bool? MultiAuth;
        /// <summary>
        /// whether name field is required
        /// </summary>
        public readonly bool? Name;
        /// <summary>
        /// error message when name not provided
        /// </summary>
        public readonly string? NameError;
        /// <summary>
        /// label of name field
        /// </summary>
        public readonly string? NameLabel;
        /// <summary>
        /// Default value for the `Do not store` checkbox
        /// </summary>
        public readonly bool? OptOutDefault;
        /// <summary>
        /// whether to display Do Not Store My Personal Information
        /// </summary>
        public readonly bool? Optout;
        /// <summary>
        /// label for Do Not Store My Personal Information
        /// </summary>
        public readonly string? OptoutLabel;
        public readonly string? PageTitle;
        /// <summary>
        /// Label for the Passphrase cancel button
        /// </summary>
        public readonly string? PassphraseCancel;
        /// <summary>
        /// error message when invalid passphrase is provided
        /// </summary>
        public readonly string? PassphraseError;
        /// <summary>
        /// Passphrase
        /// </summary>
        public readonly string? PassphraseLabel;
        public readonly string? PassphraseMessage;
        /// <summary>
        /// Label for the Passphrase submit button
        /// </summary>
        public readonly string? PassphraseSubmit;
        /// <summary>
        /// Title for passphrase details page
        /// </summary>
        public readonly string? PassphraseTitle;
        /// <summary>
        /// whether to show \"Powered by Mist\"
        /// </summary>
        public readonly bool? PoweredBy;
        /// <summary>
        /// wheter to require the Privacy Term acceptance
        /// </summary>
        public readonly bool? Privacy;
        /// <summary>
        /// prefix of the label of the link to go to Privacy Policy
        /// </summary>
        public readonly string? PrivacyPolicyAcceptLabel;
        /// <summary>
        /// error message when Privacy Policy not accepted
        /// </summary>
        public readonly string? PrivacyPolicyError;
        /// <summary>
        /// label of the link to go to Privacy Policy
        /// </summary>
        public readonly string? PrivacyPolicyLink;
        /// <summary>
        /// text of the Privacy Policy
        /// </summary>
        public readonly string? PrivacyPolicyText;
        /// <summary>
        /// label to denote required field
        /// </summary>
        public readonly string? RequiredFieldLabel;
        public readonly bool? ResponsiveLayout;
        /// <summary>
        /// label of the button to /signin
        /// </summary>
        public readonly string? SignInLabel;
        public readonly string? SmsCarrierDefault;
        public readonly string? SmsCarrierError;
        /// <summary>
        /// label for mobile carrier drop-down list
        /// </summary>
        public readonly string? SmsCarrierFieldLabel;
        /// <summary>
        /// Label for cancel confirmation code submission
        /// </summary>
        public readonly string? SmsCodeCancel;
        /// <summary>
        /// error message when confirmation code is invalid
        /// </summary>
        public readonly string? SmsCodeError;
        public readonly string? SmsCodeFieldLabel;
        public readonly string? SmsCodeMessage;
        /// <summary>
        /// Label for confirmation code submit button
        /// </summary>
        public readonly string? SmsCodeSubmit;
        public readonly string? SmsCodeTitle;
        public readonly string? SmsCountryFieldLabel;
        public readonly string? SmsCountryFormat;
        /// <summary>
        /// Label for checkbox to specify that the user has access code
        /// </summary>
        public readonly string? SmsHaveAccessCode;
        public readonly bool? SmsIsTwilio;
        /// <summary>
        /// format of access code sms message. {{code}} and {{duration}} are place holders and should be retained as is.
        /// </summary>
        public readonly string? SmsMessageFormat;
        /// <summary>
        /// label for canceling mobile details for SMS auth
        /// </summary>
        public readonly string? SmsNumberCancel;
        public readonly string? SmsNumberError;
        /// <summary>
        /// label for field to provide mobile number
        /// </summary>
        public readonly string? SmsNumberFieldLabel;
        public readonly string? SmsNumberFormat;
        public readonly string? SmsNumberMessage;
        /// <summary>
        /// label for submit button for code generation
        /// </summary>
        public readonly string? SmsNumberSubmit;
        /// <summary>
        /// Title for phone number details
        /// </summary>
        public readonly string? SmsNumberTitle;
        public readonly string? SmsUsernameFormat;
        /// <summary>
        /// how long confirmation code should be considered valid (in minutes)
        /// </summary>
        public readonly int? SmsValidityDuration;
        public readonly string? SponsorBackLink;
        public readonly string? SponsorCancel;
        /// <summary>
        /// label for Sponsor Email
        /// </summary>
        public readonly string? SponsorEmail;
        public readonly string? SponsorEmailError;
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
        public readonly string? SponsorEmailTemplate;
        public readonly string? SponsorInfoApproved;
        public readonly string? SponsorInfoDenied;
        public readonly string? SponsorInfoPending;
        /// <summary>
        /// label for Sponsor Name
        /// </summary>
        public readonly string? SponsorName;
        public readonly string? SponsorNameError;
        public readonly string? SponsorNotePending;
        /// <summary>
        /// submit button label request Wifi Access and notify sponsor about guest request
        /// </summary>
        public readonly string? SponsorRequestAccess;
        /// <summary>
        /// text to display if sponsor approves request
        /// </summary>
        public readonly string? SponsorStatusApproved;
        /// <summary>
        /// text to display when sponsor denies request
        /// </summary>
        public readonly string? SponsorStatusDenied;
        /// <summary>
        /// text to display if request is still pending
        /// </summary>
        public readonly string? SponsorStatusPending;
        /// <summary>
        /// submit button label to notify sponsor about guest request
        /// </summary>
        public readonly string? SponsorSubmit;
        public readonly string? SponsorsError;
        public readonly string? SponsorsFieldLabel;
        public readonly bool? Tos;
        /// <summary>
        /// prefix of the label of the link to go to tos
        /// </summary>
        public readonly string? TosAcceptLabel;
        /// <summary>
        /// error message when tos not accepted
        /// </summary>
        public readonly string? TosError;
        /// <summary>
        /// label of the link to go to tos
        /// </summary>
        public readonly string? TosLink;
        /// <summary>
        /// text of the Terms of Service
        /// </summary>
        public readonly string? TosText;

        [OutputConstructor]
        private WlanPortalTemplatePortalTemplate(
            string? accessCodeAlternateEmail,

            string? alignment,

            string? authButtonAmazon,

            string? authButtonAzure,

            string? authButtonEmail,

            string? authButtonFacebook,

            string? authButtonGoogle,

            string? authButtonMicrosoft,

            string? authButtonPassphrase,

            string? authButtonSms,

            string? authButtonSponsor,

            string? authLabel,

            string? backLink,

            string? color,

            string? colorDark,

            string? colorLight,

            bool? company,

            string? companyError,

            string? companyLabel,

            bool? email,

            string? emailAccessDomainError,

            string? emailCancel,

            string? emailCodeCancel,

            string? emailCodeError,

            string? emailCodeFieldLabel,

            string? emailCodeMessage,

            string? emailCodeSubmit,

            string? emailCodeTitle,

            string? emailError,

            string? emailFieldLabel,

            string? emailLabel,

            string? emailMessage,

            string? emailSubmit,

            string? emailTitle,

            bool? field1,

            string? field1error,

            string? field1label,

            bool? field1required,

            bool? field2,

            string? field2error,

            string? field2label,

            bool? field2required,

            bool? field3,

            string? field3error,

            string? field3label,

            bool? field3required,

            bool? field4,

            string? field4error,

            string? field4label,

            bool? field4required,

            ImmutableDictionary<string, Outputs.WlanPortalTemplatePortalTemplateLocales>? locales,

            string? logo,

            string? message,

            bool? multiAuth,

            bool? name,

            string? nameError,

            string? nameLabel,

            bool? optOutDefault,

            bool? optout,

            string? optoutLabel,

            string? pageTitle,

            string? passphraseCancel,

            string? passphraseError,

            string? passphraseLabel,

            string? passphraseMessage,

            string? passphraseSubmit,

            string? passphraseTitle,

            bool? poweredBy,

            bool? privacy,

            string? privacyPolicyAcceptLabel,

            string? privacyPolicyError,

            string? privacyPolicyLink,

            string? privacyPolicyText,

            string? requiredFieldLabel,

            bool? responsiveLayout,

            string? signInLabel,

            string? smsCarrierDefault,

            string? smsCarrierError,

            string? smsCarrierFieldLabel,

            string? smsCodeCancel,

            string? smsCodeError,

            string? smsCodeFieldLabel,

            string? smsCodeMessage,

            string? smsCodeSubmit,

            string? smsCodeTitle,

            string? smsCountryFieldLabel,

            string? smsCountryFormat,

            string? smsHaveAccessCode,

            bool? smsIsTwilio,

            string? smsMessageFormat,

            string? smsNumberCancel,

            string? smsNumberError,

            string? smsNumberFieldLabel,

            string? smsNumberFormat,

            string? smsNumberMessage,

            string? smsNumberSubmit,

            string? smsNumberTitle,

            string? smsUsernameFormat,

            int? smsValidityDuration,

            string? sponsorBackLink,

            string? sponsorCancel,

            string? sponsorEmail,

            string? sponsorEmailError,

            string? sponsorEmailTemplate,

            string? sponsorInfoApproved,

            string? sponsorInfoDenied,

            string? sponsorInfoPending,

            string? sponsorName,

            string? sponsorNameError,

            string? sponsorNotePending,

            string? sponsorRequestAccess,

            string? sponsorStatusApproved,

            string? sponsorStatusDenied,

            string? sponsorStatusPending,

            string? sponsorSubmit,

            string? sponsorsError,

            string? sponsorsFieldLabel,

            bool? tos,

            string? tosAcceptLabel,

            string? tosError,

            string? tosLink,

            string? tosText)
        {
            AccessCodeAlternateEmail = accessCodeAlternateEmail;
            Alignment = alignment;
            AuthButtonAmazon = authButtonAmazon;
            AuthButtonAzure = authButtonAzure;
            AuthButtonEmail = authButtonEmail;
            AuthButtonFacebook = authButtonFacebook;
            AuthButtonGoogle = authButtonGoogle;
            AuthButtonMicrosoft = authButtonMicrosoft;
            AuthButtonPassphrase = authButtonPassphrase;
            AuthButtonSms = authButtonSms;
            AuthButtonSponsor = authButtonSponsor;
            AuthLabel = authLabel;
            BackLink = backLink;
            Color = color;
            ColorDark = colorDark;
            ColorLight = colorLight;
            Company = company;
            CompanyError = companyError;
            CompanyLabel = companyLabel;
            Email = email;
            EmailAccessDomainError = emailAccessDomainError;
            EmailCancel = emailCancel;
            EmailCodeCancel = emailCodeCancel;
            EmailCodeError = emailCodeError;
            EmailCodeFieldLabel = emailCodeFieldLabel;
            EmailCodeMessage = emailCodeMessage;
            EmailCodeSubmit = emailCodeSubmit;
            EmailCodeTitle = emailCodeTitle;
            EmailError = emailError;
            EmailFieldLabel = emailFieldLabel;
            EmailLabel = emailLabel;
            EmailMessage = emailMessage;
            EmailSubmit = emailSubmit;
            EmailTitle = emailTitle;
            Field1 = field1;
            Field1error = field1error;
            Field1label = field1label;
            Field1required = field1required;
            Field2 = field2;
            Field2error = field2error;
            Field2label = field2label;
            Field2required = field2required;
            Field3 = field3;
            Field3error = field3error;
            Field3label = field3label;
            Field3required = field3required;
            Field4 = field4;
            Field4error = field4error;
            Field4label = field4label;
            Field4required = field4required;
            Locales = locales;
            Logo = logo;
            Message = message;
            MultiAuth = multiAuth;
            Name = name;
            NameError = nameError;
            NameLabel = nameLabel;
            OptOutDefault = optOutDefault;
            Optout = optout;
            OptoutLabel = optoutLabel;
            PageTitle = pageTitle;
            PassphraseCancel = passphraseCancel;
            PassphraseError = passphraseError;
            PassphraseLabel = passphraseLabel;
            PassphraseMessage = passphraseMessage;
            PassphraseSubmit = passphraseSubmit;
            PassphraseTitle = passphraseTitle;
            PoweredBy = poweredBy;
            Privacy = privacy;
            PrivacyPolicyAcceptLabel = privacyPolicyAcceptLabel;
            PrivacyPolicyError = privacyPolicyError;
            PrivacyPolicyLink = privacyPolicyLink;
            PrivacyPolicyText = privacyPolicyText;
            RequiredFieldLabel = requiredFieldLabel;
            ResponsiveLayout = responsiveLayout;
            SignInLabel = signInLabel;
            SmsCarrierDefault = smsCarrierDefault;
            SmsCarrierError = smsCarrierError;
            SmsCarrierFieldLabel = smsCarrierFieldLabel;
            SmsCodeCancel = smsCodeCancel;
            SmsCodeError = smsCodeError;
            SmsCodeFieldLabel = smsCodeFieldLabel;
            SmsCodeMessage = smsCodeMessage;
            SmsCodeSubmit = smsCodeSubmit;
            SmsCodeTitle = smsCodeTitle;
            SmsCountryFieldLabel = smsCountryFieldLabel;
            SmsCountryFormat = smsCountryFormat;
            SmsHaveAccessCode = smsHaveAccessCode;
            SmsIsTwilio = smsIsTwilio;
            SmsMessageFormat = smsMessageFormat;
            SmsNumberCancel = smsNumberCancel;
            SmsNumberError = smsNumberError;
            SmsNumberFieldLabel = smsNumberFieldLabel;
            SmsNumberFormat = smsNumberFormat;
            SmsNumberMessage = smsNumberMessage;
            SmsNumberSubmit = smsNumberSubmit;
            SmsNumberTitle = smsNumberTitle;
            SmsUsernameFormat = smsUsernameFormat;
            SmsValidityDuration = smsValidityDuration;
            SponsorBackLink = sponsorBackLink;
            SponsorCancel = sponsorCancel;
            SponsorEmail = sponsorEmail;
            SponsorEmailError = sponsorEmailError;
            SponsorEmailTemplate = sponsorEmailTemplate;
            SponsorInfoApproved = sponsorInfoApproved;
            SponsorInfoDenied = sponsorInfoDenied;
            SponsorInfoPending = sponsorInfoPending;
            SponsorName = sponsorName;
            SponsorNameError = sponsorNameError;
            SponsorNotePending = sponsorNotePending;
            SponsorRequestAccess = sponsorRequestAccess;
            SponsorStatusApproved = sponsorStatusApproved;
            SponsorStatusDenied = sponsorStatusDenied;
            SponsorStatusPending = sponsorStatusPending;
            SponsorSubmit = sponsorSubmit;
            SponsorsError = sponsorsError;
            SponsorsFieldLabel = sponsorsFieldLabel;
            Tos = tos;
            TosAcceptLabel = tosAcceptLabel;
            TosError = tosError;
            TosLink = tosLink;
            TosText = tosText;
        }
    }
}
