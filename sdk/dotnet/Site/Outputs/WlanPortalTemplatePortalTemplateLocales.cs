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
    public sealed class WlanPortalTemplatePortalTemplateLocales
    {
        /// <summary>
        /// Label for Amazon auth button
        /// </summary>
        public readonly string? AuthButtonAmazon;
        /// <summary>
        /// Label for Azure auth button
        /// </summary>
        public readonly string? AuthButtonAzure;
        /// <summary>
        /// Label for Email auth button
        /// </summary>
        public readonly string? AuthButtonEmail;
        /// <summary>
        /// Label for Facebook auth button
        /// </summary>
        public readonly string? AuthButtonFacebook;
        /// <summary>
        /// Label for Google auth button
        /// </summary>
        public readonly string? AuthButtonGoogle;
        /// <summary>
        /// Label for Microsoft auth button
        /// </summary>
        public readonly string? AuthButtonMicrosoft;
        /// <summary>
        /// Label for passphrase auth button
        /// </summary>
        public readonly string? AuthButtonPassphrase;
        /// <summary>
        /// Label for SMS auth button
        /// </summary>
        public readonly string? AuthButtonSms;
        /// <summary>
        /// Label for Sponsor auth button
        /// </summary>
        public readonly string? AuthButtonSponsor;
        public readonly string? AuthLabel;
        /// <summary>
        /// Label of the link to go back to /logon
        /// </summary>
        public readonly string? BackLink;
        /// <summary>
        /// Error message when company not provided
        /// </summary>
        public readonly string? CompanyError;
        /// <summary>
        /// Label of company field
        /// </summary>
        public readonly string? CompanyLabel;
        /// <summary>
        /// Error message when a user has valid social login but doesn't match specified email domains.
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
        /// Error message when email not provided
        /// </summary>
        public readonly string? EmailError;
        public readonly string? EmailFieldLabel;
        /// <summary>
        /// Label of email field
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
        /// Error message when field1 not provided
        /// </summary>
        public readonly string? Field1error;
        /// <summary>
        /// Label of field1
        /// </summary>
        public readonly string? Field1label;
        /// <summary>
        /// Error message when field2 not provided
        /// </summary>
        public readonly string? Field2error;
        /// <summary>
        /// Label of field2
        /// </summary>
        public readonly string? Field2label;
        /// <summary>
        /// Error message when field3 not provided
        /// </summary>
        public readonly string? Field3error;
        /// <summary>
        /// Label of field3
        /// </summary>
        public readonly string? Field3label;
        /// <summary>
        /// Error message when field4 not provided
        /// </summary>
        public readonly string? Field4error;
        /// <summary>
        /// Label of field4
        /// </summary>
        public readonly string? Field4label;
        /// <summary>
        /// label of the link to go to /marketing_policy
        /// </summary>
        public readonly string? MarketingPolicyLink;
        /// <summary>
        /// Whether marketing policy optin is enabled
        /// </summary>
        public readonly bool? MarketingPolicyOptIn;
        /// <summary>
        /// label for marketing optin
        /// </summary>
        public readonly string? MarketingPolicyOptInLabel;
        /// <summary>
        /// marketing policy text
        /// </summary>
        public readonly string? MarketingPolicyOptInText;
        public readonly string? Message;
        /// <summary>
        /// Error message when name not provided
        /// </summary>
        public readonly string? NameError;
        /// <summary>
        /// Label of name field
        /// </summary>
        public readonly string? NameLabel;
        /// <summary>
        /// Label for Do Not Store My Personal Information
        /// </summary>
        public readonly string? OptoutLabel;
        public readonly string? PageTitle;
        /// <summary>
        /// Label for the Passphrase cancel button
        /// </summary>
        public readonly string? PassphraseCancel;
        /// <summary>
        /// Error message when invalid passphrase is provided
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
        /// Prefix of the label of the link to go to Privacy Policy
        /// </summary>
        public readonly string? PrivacyPolicyAcceptLabel;
        /// <summary>
        /// Error message when Privacy Policy not accepted
        /// </summary>
        public readonly string? PrivacyPolicyError;
        /// <summary>
        /// Label of the link to go to Privacy Policy
        /// </summary>
        public readonly string? PrivacyPolicyLink;
        /// <summary>
        /// Text of the Privacy Policy
        /// </summary>
        public readonly string? PrivacyPolicyText;
        /// <summary>
        /// Label to denote required field
        /// </summary>
        public readonly string? RequiredFieldLabel;
        /// <summary>
        /// Label of the button to signin
        /// </summary>
        public readonly string? SignInLabel;
        public readonly string? SmsCarrierDefault;
        public readonly string? SmsCarrierError;
        /// <summary>
        /// Label for mobile carrier drop-down list
        /// </summary>
        public readonly string? SmsCarrierFieldLabel;
        /// <summary>
        /// Label for cancel confirmation code submission
        /// </summary>
        public readonly string? SmsCodeCancel;
        /// <summary>
        /// Error message when confirmation code is invalid
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
        /// <summary>
        /// Format of access code sms message. {{code}} and {{duration}} are placeholders and should be retained as is.
        /// </summary>
        public readonly string? SmsMessageFormat;
        /// <summary>
        /// Label for canceling mobile details for SMS auth
        /// </summary>
        public readonly string? SmsNumberCancel;
        public readonly string? SmsNumberError;
        /// <summary>
        /// Label for field to provide mobile number
        /// </summary>
        public readonly string? SmsNumberFieldLabel;
        public readonly string? SmsNumberFormat;
        public readonly string? SmsNumberMessage;
        /// <summary>
        /// Label for submit button for code generation
        /// </summary>
        public readonly string? SmsNumberSubmit;
        /// <summary>
        /// Title for phone number details
        /// </summary>
        public readonly string? SmsNumberTitle;
        public readonly string? SmsUsernameFormat;
        public readonly string? SponsorBackLink;
        public readonly string? SponsorCancel;
        /// <summary>
        /// Label for Sponsor Email
        /// </summary>
        public readonly string? SponsorEmail;
        public readonly string? SponsorEmailError;
        public readonly string? SponsorInfoApproved;
        public readonly string? SponsorInfoDenied;
        public readonly string? SponsorInfoPending;
        /// <summary>
        /// Label for Sponsor Name
        /// </summary>
        public readonly string? SponsorName;
        public readonly string? SponsorNameError;
        public readonly string? SponsorNotePending;
        /// <summary>
        /// Submit button label request Wifi Access and notify sponsor about guest request
        /// </summary>
        public readonly string? SponsorRequestAccess;
        /// <summary>
        /// Text to display if sponsor approves request
        /// </summary>
        public readonly string? SponsorStatusApproved;
        /// <summary>
        /// Text to display when sponsor denies request
        /// </summary>
        public readonly string? SponsorStatusDenied;
        /// <summary>
        /// Text to display if request is still pending
        /// </summary>
        public readonly string? SponsorStatusPending;
        /// <summary>
        /// Submit button label to notify sponsor about guest request
        /// </summary>
        public readonly string? SponsorSubmit;
        public readonly string? SponsorsError;
        public readonly string? SponsorsFieldLabel;
        /// <summary>
        /// Prefix of the label of the link to go to tos
        /// </summary>
        public readonly string? TosAcceptLabel;
        /// <summary>
        /// Error message when tos not accepted
        /// </summary>
        public readonly string? TosError;
        /// <summary>
        /// Label of the link to go to tos
        /// </summary>
        public readonly string? TosLink;
        /// <summary>
        /// Text of the Terms of Service
        /// </summary>
        public readonly string? TosText;

        [OutputConstructor]
        private WlanPortalTemplatePortalTemplateLocales(
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

            string? companyError,

            string? companyLabel,

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

            string? field1error,

            string? field1label,

            string? field2error,

            string? field2label,

            string? field3error,

            string? field3label,

            string? field4error,

            string? field4label,

            string? marketingPolicyLink,

            bool? marketingPolicyOptIn,

            string? marketingPolicyOptInLabel,

            string? marketingPolicyOptInText,

            string? message,

            string? nameError,

            string? nameLabel,

            string? optoutLabel,

            string? pageTitle,

            string? passphraseCancel,

            string? passphraseError,

            string? passphraseLabel,

            string? passphraseMessage,

            string? passphraseSubmit,

            string? passphraseTitle,

            string? privacyPolicyAcceptLabel,

            string? privacyPolicyError,

            string? privacyPolicyLink,

            string? privacyPolicyText,

            string? requiredFieldLabel,

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

            string? smsMessageFormat,

            string? smsNumberCancel,

            string? smsNumberError,

            string? smsNumberFieldLabel,

            string? smsNumberFormat,

            string? smsNumberMessage,

            string? smsNumberSubmit,

            string? smsNumberTitle,

            string? smsUsernameFormat,

            string? sponsorBackLink,

            string? sponsorCancel,

            string? sponsorEmail,

            string? sponsorEmailError,

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

            string? tosAcceptLabel,

            string? tosError,

            string? tosLink,

            string? tosText)
        {
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
            CompanyError = companyError;
            CompanyLabel = companyLabel;
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
            Field1error = field1error;
            Field1label = field1label;
            Field2error = field2error;
            Field2label = field2label;
            Field3error = field3error;
            Field3label = field3label;
            Field4error = field4error;
            Field4label = field4label;
            MarketingPolicyLink = marketingPolicyLink;
            MarketingPolicyOptIn = marketingPolicyOptIn;
            MarketingPolicyOptInLabel = marketingPolicyOptInLabel;
            MarketingPolicyOptInText = marketingPolicyOptInText;
            Message = message;
            NameError = nameError;
            NameLabel = nameLabel;
            OptoutLabel = optoutLabel;
            PageTitle = pageTitle;
            PassphraseCancel = passphraseCancel;
            PassphraseError = passphraseError;
            PassphraseLabel = passphraseLabel;
            PassphraseMessage = passphraseMessage;
            PassphraseSubmit = passphraseSubmit;
            PassphraseTitle = passphraseTitle;
            PrivacyPolicyAcceptLabel = privacyPolicyAcceptLabel;
            PrivacyPolicyError = privacyPolicyError;
            PrivacyPolicyLink = privacyPolicyLink;
            PrivacyPolicyText = privacyPolicyText;
            RequiredFieldLabel = requiredFieldLabel;
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
            SmsMessageFormat = smsMessageFormat;
            SmsNumberCancel = smsNumberCancel;
            SmsNumberError = smsNumberError;
            SmsNumberFieldLabel = smsNumberFieldLabel;
            SmsNumberFormat = smsNumberFormat;
            SmsNumberMessage = smsNumberMessage;
            SmsNumberSubmit = smsNumberSubmit;
            SmsNumberTitle = smsNumberTitle;
            SmsUsernameFormat = smsUsernameFormat;
            SponsorBackLink = sponsorBackLink;
            SponsorCancel = sponsorCancel;
            SponsorEmail = sponsorEmail;
            SponsorEmailError = sponsorEmailError;
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
            TosAcceptLabel = tosAcceptLabel;
            TosError = tosError;
            TosLink = tosLink;
            TosText = tosText;
        }
    }
}
