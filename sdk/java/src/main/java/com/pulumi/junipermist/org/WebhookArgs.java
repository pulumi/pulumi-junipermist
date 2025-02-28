// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * Whether webhook is enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether webhook is enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    /**
     * @return If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
     * 
     */
    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Name of the webhook
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the webhook
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Required when `oauth2_grant_type`==`client_credentials`
     * 
     */
    @Import(name="oauth2ClientId")
    private @Nullable Output<String> oauth2ClientId;

    /**
     * @return Required when `oauth2_grant_type`==`client_credentials`
     * 
     */
    public Optional<Output<String>> oauth2ClientId() {
        return Optional.ofNullable(this.oauth2ClientId);
    }

    /**
     * Required when `oauth2_grant_type`==`client_credentials`
     * 
     */
    @Import(name="oauth2ClientSecret")
    private @Nullable Output<String> oauth2ClientSecret;

    /**
     * @return Required when `oauth2_grant_type`==`client_credentials`
     * 
     */
    public Optional<Output<String>> oauth2ClientSecret() {
        return Optional.ofNullable(this.oauth2ClientSecret);
    }

    /**
     * required when `type`==`oauth2`. enum: `client_credentials`, `password`
     * 
     */
    @Import(name="oauth2GrantType")
    private @Nullable Output<String> oauth2GrantType;

    /**
     * @return required when `type`==`oauth2`. enum: `client_credentials`, `password`
     * 
     */
    public Optional<Output<String>> oauth2GrantType() {
        return Optional.ofNullable(this.oauth2GrantType);
    }

    /**
     * Required when `oauth2_grant_type`==`password`
     * 
     */
    @Import(name="oauth2Password")
    private @Nullable Output<String> oauth2Password;

    /**
     * @return Required when `oauth2_grant_type`==`password`
     * 
     */
    public Optional<Output<String>> oauth2Password() {
        return Optional.ofNullable(this.oauth2Password);
    }

    /**
     * Required when `type`==`oauth2`, if provided, will be used in the token request
     * 
     */
    @Import(name="oauth2Scopes")
    private @Nullable Output<List<String>> oauth2Scopes;

    /**
     * @return Required when `type`==`oauth2`, if provided, will be used in the token request
     * 
     */
    public Optional<Output<List<String>>> oauth2Scopes() {
        return Optional.ofNullable(this.oauth2Scopes);
    }

    /**
     * Required when `type`==`oauth2`
     * 
     */
    @Import(name="oauth2TokenUrl")
    private @Nullable Output<String> oauth2TokenUrl;

    /**
     * @return Required when `type`==`oauth2`
     * 
     */
    public Optional<Output<String>> oauth2TokenUrl() {
        return Optional.ofNullable(this.oauth2TokenUrl);
    }

    /**
     * Required when `oauth2_grant_type`==`password`
     * 
     */
    @Import(name="oauth2Username")
    private @Nullable Output<String> oauth2Username;

    /**
     * @return Required when `oauth2_grant_type`==`password`
     * 
     */
    public Optional<Output<String>> oauth2Username() {
        return Optional.ofNullable(this.oauth2Username);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Only if `type`=`http-post`
     * 
     */
    @Import(name="secret")
    private @Nullable Output<String> secret;

    /**
     * @return Only if `type`=`http-post`
     * 
     */
    public Optional<Output<String>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * Required if `type`=`splunk`. If splunk_token is not defined for a type Splunk webhook, it will not send, regardless if
     * the webhook receiver is configured to accept it.
     * 
     */
    @Import(name="splunkToken")
    private @Nullable Output<String> splunkToken;

    /**
     * @return Required if `type`=`splunk`. If splunk_token is not defined for a type Splunk webhook, it will not send, regardless if
     * the webhook receiver is configured to accept it.
     * 
     */
    public Optional<Output<String>> splunkToken() {
        return Optional.ofNullable(this.splunkToken);
    }

    /**
     * enum: `alarms`, `audits`, `client-info`, `client-join`, `client-sessions`, `device-updowns`, `device-events`, `mxedge-events`, `nac-accounting`, `nac_events`
     * 
     */
    @Import(name="topics", required=true)
    private Output<List<String>> topics;

    /**
     * @return enum: `alarms`, `audits`, `client-info`, `client-join`, `client-sessions`, `device-updowns`, `device-events`, `mxedge-events`, `nac-accounting`, `nac_events`
     * 
     */
    public Output<List<String>> topics() {
        return this.topics;
    }

    /**
     * enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    /**
     * When url uses HTTPS, whether to verify the certificate
     * 
     */
    @Import(name="verifyCert")
    private @Nullable Output<Boolean> verifyCert;

    /**
     * @return When url uses HTTPS, whether to verify the certificate
     * 
     */
    public Optional<Output<Boolean>> verifyCert() {
        return Optional.ofNullable(this.verifyCert);
    }

    private WebhookArgs() {}

    private WebhookArgs(WebhookArgs $) {
        this.enabled = $.enabled;
        this.headers = $.headers;
        this.name = $.name;
        this.oauth2ClientId = $.oauth2ClientId;
        this.oauth2ClientSecret = $.oauth2ClientSecret;
        this.oauth2GrantType = $.oauth2GrantType;
        this.oauth2Password = $.oauth2Password;
        this.oauth2Scopes = $.oauth2Scopes;
        this.oauth2TokenUrl = $.oauth2TokenUrl;
        this.oauth2Username = $.oauth2Username;
        this.orgId = $.orgId;
        this.secret = $.secret;
        this.splunkToken = $.splunkToken;
        this.topics = $.topics;
        this.type = $.type;
        this.url = $.url;
        this.verifyCert = $.verifyCert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookArgs $;

        public Builder() {
            $ = new WebhookArgs();
        }

        public Builder(WebhookArgs defaults) {
            $ = new WebhookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether webhook is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether webhook is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param headers If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param name Name of the webhook
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the webhook
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oauth2ClientId Required when `oauth2_grant_type`==`client_credentials`
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(@Nullable Output<String> oauth2ClientId) {
            $.oauth2ClientId = oauth2ClientId;
            return this;
        }

        /**
         * @param oauth2ClientId Required when `oauth2_grant_type`==`client_credentials`
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(String oauth2ClientId) {
            return oauth2ClientId(Output.of(oauth2ClientId));
        }

        /**
         * @param oauth2ClientSecret Required when `oauth2_grant_type`==`client_credentials`
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(@Nullable Output<String> oauth2ClientSecret) {
            $.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }

        /**
         * @param oauth2ClientSecret Required when `oauth2_grant_type`==`client_credentials`
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            return oauth2ClientSecret(Output.of(oauth2ClientSecret));
        }

        /**
         * @param oauth2GrantType required when `type`==`oauth2`. enum: `client_credentials`, `password`
         * 
         * @return builder
         * 
         */
        public Builder oauth2GrantType(@Nullable Output<String> oauth2GrantType) {
            $.oauth2GrantType = oauth2GrantType;
            return this;
        }

        /**
         * @param oauth2GrantType required when `type`==`oauth2`. enum: `client_credentials`, `password`
         * 
         * @return builder
         * 
         */
        public Builder oauth2GrantType(String oauth2GrantType) {
            return oauth2GrantType(Output.of(oauth2GrantType));
        }

        /**
         * @param oauth2Password Required when `oauth2_grant_type`==`password`
         * 
         * @return builder
         * 
         */
        public Builder oauth2Password(@Nullable Output<String> oauth2Password) {
            $.oauth2Password = oauth2Password;
            return this;
        }

        /**
         * @param oauth2Password Required when `oauth2_grant_type`==`password`
         * 
         * @return builder
         * 
         */
        public Builder oauth2Password(String oauth2Password) {
            return oauth2Password(Output.of(oauth2Password));
        }

        /**
         * @param oauth2Scopes Required when `type`==`oauth2`, if provided, will be used in the token request
         * 
         * @return builder
         * 
         */
        public Builder oauth2Scopes(@Nullable Output<List<String>> oauth2Scopes) {
            $.oauth2Scopes = oauth2Scopes;
            return this;
        }

        /**
         * @param oauth2Scopes Required when `type`==`oauth2`, if provided, will be used in the token request
         * 
         * @return builder
         * 
         */
        public Builder oauth2Scopes(List<String> oauth2Scopes) {
            return oauth2Scopes(Output.of(oauth2Scopes));
        }

        /**
         * @param oauth2Scopes Required when `type`==`oauth2`, if provided, will be used in the token request
         * 
         * @return builder
         * 
         */
        public Builder oauth2Scopes(String... oauth2Scopes) {
            return oauth2Scopes(List.of(oauth2Scopes));
        }

        /**
         * @param oauth2TokenUrl Required when `type`==`oauth2`
         * 
         * @return builder
         * 
         */
        public Builder oauth2TokenUrl(@Nullable Output<String> oauth2TokenUrl) {
            $.oauth2TokenUrl = oauth2TokenUrl;
            return this;
        }

        /**
         * @param oauth2TokenUrl Required when `type`==`oauth2`
         * 
         * @return builder
         * 
         */
        public Builder oauth2TokenUrl(String oauth2TokenUrl) {
            return oauth2TokenUrl(Output.of(oauth2TokenUrl));
        }

        /**
         * @param oauth2Username Required when `oauth2_grant_type`==`password`
         * 
         * @return builder
         * 
         */
        public Builder oauth2Username(@Nullable Output<String> oauth2Username) {
            $.oauth2Username = oauth2Username;
            return this;
        }

        /**
         * @param oauth2Username Required when `oauth2_grant_type`==`password`
         * 
         * @return builder
         * 
         */
        public Builder oauth2Username(String oauth2Username) {
            return oauth2Username(Output.of(oauth2Username));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param secret Only if `type`=`http-post`
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<String> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Only if `type`=`http-post`
         * 
         * @return builder
         * 
         */
        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param splunkToken Required if `type`=`splunk`. If splunk_token is not defined for a type Splunk webhook, it will not send, regardless if
         * the webhook receiver is configured to accept it.
         * 
         * @return builder
         * 
         */
        public Builder splunkToken(@Nullable Output<String> splunkToken) {
            $.splunkToken = splunkToken;
            return this;
        }

        /**
         * @param splunkToken Required if `type`=`splunk`. If splunk_token is not defined for a type Splunk webhook, it will not send, regardless if
         * the webhook receiver is configured to accept it.
         * 
         * @return builder
         * 
         */
        public Builder splunkToken(String splunkToken) {
            return splunkToken(Output.of(splunkToken));
        }

        /**
         * @param topics enum: `alarms`, `audits`, `client-info`, `client-join`, `client-sessions`, `device-updowns`, `device-events`, `mxedge-events`, `nac-accounting`, `nac_events`
         * 
         * @return builder
         * 
         */
        public Builder topics(Output<List<String>> topics) {
            $.topics = topics;
            return this;
        }

        /**
         * @param topics enum: `alarms`, `audits`, `client-info`, `client-join`, `client-sessions`, `device-updowns`, `device-events`, `mxedge-events`, `nac-accounting`, `nac_events`
         * 
         * @return builder
         * 
         */
        public Builder topics(List<String> topics) {
            return topics(Output.of(topics));
        }

        /**
         * @param topics enum: `alarms`, `audits`, `client-info`, `client-join`, `client-sessions`, `device-updowns`, `device-events`, `mxedge-events`, `nac-accounting`, `nac_events`
         * 
         * @return builder
         * 
         */
        public Builder topics(String... topics) {
            return topics(List.of(topics));
        }

        /**
         * @param type enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param verifyCert When url uses HTTPS, whether to verify the certificate
         * 
         * @return builder
         * 
         */
        public Builder verifyCert(@Nullable Output<Boolean> verifyCert) {
            $.verifyCert = verifyCert;
            return this;
        }

        /**
         * @param verifyCert When url uses HTTPS, whether to verify the certificate
         * 
         * @return builder
         * 
         */
        public Builder verifyCert(Boolean verifyCert) {
            return verifyCert(Output.of(verifyCert));
        }

        public WebhookArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("WebhookArgs", "orgId");
            }
            if ($.topics == null) {
                throw new MissingRequiredPropertyException("WebhookArgs", "topics");
            }
            if ($.url == null) {
                throw new MissingRequiredPropertyException("WebhookArgs", "url");
            }
            return $;
        }
    }

}
