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
    public sealed class GetWebhooksOrgWebhookResult
    {
        /// <summary>
        /// When the object has been created, in epoch
        /// </summary>
        public readonly double CreatedTime;
        /// <summary>
        /// Whether webhook is enabled
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
        /// </summary>
        public readonly ImmutableDictionary<string, string> Headers;
        /// <summary>
        /// Unique ID of the object instance in the Mist Organnization
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// When the object has been modified for the last time, in epoch
        /// </summary>
        public readonly double ModifiedTime;
        /// <summary>
        /// Name of the webhook
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Required when `oauth2_grant_type`==`client_credentials`
        /// </summary>
        public readonly string Oauth2ClientId;
        /// <summary>
        /// Required when `oauth2_grant_type`==`client_credentials`
        /// </summary>
        public readonly string Oauth2ClientSecret;
        /// <summary>
        /// required when `type`==`oauth2`. enum: `client_credentials`, `password`
        /// </summary>
        public readonly string Oauth2GrantType;
        /// <summary>
        /// Required when `oauth2_grant_type`==`password`
        /// </summary>
        public readonly string Oauth2Password;
        /// <summary>
        /// Required when `type`==`oauth2`, if provided, will be used in the token request
        /// </summary>
        public readonly ImmutableArray<string> Oauth2Scopes;
        /// <summary>
        /// Required when `type`==`oauth2`
        /// </summary>
        public readonly string Oauth2TokenUrl;
        /// <summary>
        /// Required when `oauth2_grant_type`==`password`
        /// </summary>
        public readonly string Oauth2Username;
        public readonly string OrgId;
        /// <summary>
        /// Only if `type`=`http-post`
        /// </summary>
        public readonly string Secret;
        /// <summary>
        /// Required if `type`=`splunk`. If splunk_token is not defined for a type Splunk webhook, it will not send, regardless if the webhook receiver is configured to accept it.
        /// </summary>
        public readonly string SplunkToken;
        /// <summary>
        /// List of supported webhook topics available with the API Call List Webhook Topics
        /// </summary>
        public readonly ImmutableArray<string> Topics;
        /// <summary>
        /// enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
        /// </summary>
        public readonly string Type;
        public readonly string Url;
        /// <summary>
        /// When url uses HTTPS, whether to verify the certificate
        /// </summary>
        public readonly bool VerifyCert;

        [OutputConstructor]
        private GetWebhooksOrgWebhookResult(
            double createdTime,

            bool enabled,

            ImmutableDictionary<string, string> headers,

            string id,

            double modifiedTime,

            string name,

            string oauth2ClientId,

            string oauth2ClientSecret,

            string oauth2GrantType,

            string oauth2Password,

            ImmutableArray<string> oauth2Scopes,

            string oauth2TokenUrl,

            string oauth2Username,

            string orgId,

            string secret,

            string splunkToken,

            ImmutableArray<string> topics,

            string type,

            string url,

            bool verifyCert)
        {
            CreatedTime = createdTime;
            Enabled = enabled;
            Headers = headers;
            Id = id;
            ModifiedTime = modifiedTime;
            Name = name;
            Oauth2ClientId = oauth2ClientId;
            Oauth2ClientSecret = oauth2ClientSecret;
            Oauth2GrantType = oauth2GrantType;
            Oauth2Password = oauth2Password;
            Oauth2Scopes = oauth2Scopes;
            Oauth2TokenUrl = oauth2TokenUrl;
            Oauth2Username = oauth2Username;
            OrgId = orgId;
            Secret = secret;
            SplunkToken = splunkToken;
            Topics = topics;
            Type = type;
            Url = url;
            VerifyCert = verifyCert;
        }
    }
}
