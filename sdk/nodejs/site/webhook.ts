// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * This resource manages Site Webhooks.
 *
 * A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.\
 * It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.\
 * The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as junipermist from "@pulumi/juniper-mist";
 *
 * const webhookOne = new junipermist.site.Webhook("webhook_one", {
 *     siteId: terraformSite.id,
 *     name: "webhook_one",
 *     type: "http-post",
 *     url: "https://myserver.com:4321/",
 *     verifyCert: false,
 *     enabled: true,
 *     topics: [
 *         "device-events",
 *         "alarms",
 *         "audits",
 *         "client-join",
 *         "client-info",
 *         "client-sessions",
 *         "device-updowns",
 *         "mxedge-events",
 *         "nac-events",
 *         "nac-accounting",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import `mist_site_webhook` with:
 *
 * Site Webhook can be imported by specifying the site_id and the webhook_id
 *
 * ```sh
 * $ pulumi import junipermist:site/webhook:Webhook webhook_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 */
export class Webhook extends pulumi.CustomResource {
    /**
     * Get an existing Webhook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WebhookState, opts?: pulumi.CustomResourceOptions): Webhook {
        return new Webhook(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'junipermist:site/webhook:Webhook';

    /**
     * Returns true if the given object is an instance of Webhook.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Webhook {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Webhook.__pulumiType;
    }

    /**
     * Whether webhook is enabled
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
     */
    public readonly headers!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Name of the webhook
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Required when `oauth2GrantType`==`clientCredentials`
     */
    public readonly oauth2ClientId!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth2GrantType`==`clientCredentials`
     */
    public readonly oauth2ClientSecret!: pulumi.Output<string | undefined>;
    /**
     * required when `type`==`oauth2`. enum: `clientCredentials`, `password`
     */
    public readonly oauth2GrantType!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth2GrantType`==`password`
     */
    public readonly oauth2Password!: pulumi.Output<string | undefined>;
    /**
     * Required when `type`==`oauth2`, if provided, will be used in the token request
     */
    public readonly oauth2Scopes!: pulumi.Output<string[] | undefined>;
    /**
     * Required when `type`==`oauth2`
     */
    public readonly oauth2TokenUrl!: pulumi.Output<string | undefined>;
    /**
     * Required when `oauth2GrantType`==`password`
     */
    public readonly oauth2Username!: pulumi.Output<string | undefined>;
    public /*out*/ readonly orgId!: pulumi.Output<string>;
    /**
     * Only if `type`=`http-post`
     */
    public readonly secret!: pulumi.Output<string | undefined>;
    /**
     * Some solutions may not be able to parse multiple events from a single message (e.g. IBM Qradar, DSM). When set to
     * `true`, only a single event will be sent per message. this feature is only available on certain topics (see List Webhook
     * Topics)
     */
    public readonly singleEventPerMessage!: pulumi.Output<boolean>;
    public readonly siteId!: pulumi.Output<string>;
    /**
     * Required if `type`=`splunk`. If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if
     * the webhook receiver is configured to accept it.
     */
    public readonly splunkToken!: pulumi.Output<string | undefined>;
    /**
     * enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
     */
    public readonly topics!: pulumi.Output<string[]>;
    /**
     * enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
     */
    public readonly type!: pulumi.Output<string>;
    public readonly url!: pulumi.Output<string>;
    /**
     * When url uses HTTPS, whether to verify the certificate
     */
    public readonly verifyCert!: pulumi.Output<boolean>;

    /**
     * Create a Webhook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WebhookArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WebhookArgs | WebhookState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WebhookState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["headers"] = state ? state.headers : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauth2ClientId"] = state ? state.oauth2ClientId : undefined;
            resourceInputs["oauth2ClientSecret"] = state ? state.oauth2ClientSecret : undefined;
            resourceInputs["oauth2GrantType"] = state ? state.oauth2GrantType : undefined;
            resourceInputs["oauth2Password"] = state ? state.oauth2Password : undefined;
            resourceInputs["oauth2Scopes"] = state ? state.oauth2Scopes : undefined;
            resourceInputs["oauth2TokenUrl"] = state ? state.oauth2TokenUrl : undefined;
            resourceInputs["oauth2Username"] = state ? state.oauth2Username : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["secret"] = state ? state.secret : undefined;
            resourceInputs["singleEventPerMessage"] = state ? state.singleEventPerMessage : undefined;
            resourceInputs["siteId"] = state ? state.siteId : undefined;
            resourceInputs["splunkToken"] = state ? state.splunkToken : undefined;
            resourceInputs["topics"] = state ? state.topics : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["verifyCert"] = state ? state.verifyCert : undefined;
        } else {
            const args = argsOrState as WebhookArgs | undefined;
            if ((!args || args.siteId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'siteId'");
            }
            if ((!args || args.topics === undefined) && !opts.urn) {
                throw new Error("Missing required property 'topics'");
            }
            if ((!args || args.url === undefined) && !opts.urn) {
                throw new Error("Missing required property 'url'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["headers"] = args ? args.headers : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauth2ClientId"] = args ? args.oauth2ClientId : undefined;
            resourceInputs["oauth2ClientSecret"] = args?.oauth2ClientSecret ? pulumi.secret(args.oauth2ClientSecret) : undefined;
            resourceInputs["oauth2GrantType"] = args ? args.oauth2GrantType : undefined;
            resourceInputs["oauth2Password"] = args?.oauth2Password ? pulumi.secret(args.oauth2Password) : undefined;
            resourceInputs["oauth2Scopes"] = args ? args.oauth2Scopes : undefined;
            resourceInputs["oauth2TokenUrl"] = args ? args.oauth2TokenUrl : undefined;
            resourceInputs["oauth2Username"] = args ? args.oauth2Username : undefined;
            resourceInputs["secret"] = args?.secret ? pulumi.secret(args.secret) : undefined;
            resourceInputs["singleEventPerMessage"] = args ? args.singleEventPerMessage : undefined;
            resourceInputs["siteId"] = args ? args.siteId : undefined;
            resourceInputs["splunkToken"] = args?.splunkToken ? pulumi.secret(args.splunkToken) : undefined;
            resourceInputs["topics"] = args ? args.topics : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["verifyCert"] = args ? args.verifyCert : undefined;
            resourceInputs["orgId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["oauth2ClientSecret", "oauth2Password", "secret", "splunkToken"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Webhook.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Webhook resources.
 */
export interface WebhookState {
    /**
     * Whether webhook is enabled
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
     */
    headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the webhook
     */
    name?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`clientCredentials`
     */
    oauth2ClientId?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`clientCredentials`
     */
    oauth2ClientSecret?: pulumi.Input<string>;
    /**
     * required when `type`==`oauth2`. enum: `clientCredentials`, `password`
     */
    oauth2GrantType?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`password`
     */
    oauth2Password?: pulumi.Input<string>;
    /**
     * Required when `type`==`oauth2`, if provided, will be used in the token request
     */
    oauth2Scopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Required when `type`==`oauth2`
     */
    oauth2TokenUrl?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`password`
     */
    oauth2Username?: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    /**
     * Only if `type`=`http-post`
     */
    secret?: pulumi.Input<string>;
    /**
     * Some solutions may not be able to parse multiple events from a single message (e.g. IBM Qradar, DSM). When set to
     * `true`, only a single event will be sent per message. this feature is only available on certain topics (see List Webhook
     * Topics)
     */
    singleEventPerMessage?: pulumi.Input<boolean>;
    siteId?: pulumi.Input<string>;
    /**
     * Required if `type`=`splunk`. If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if
     * the webhook receiver is configured to accept it.
     */
    splunkToken?: pulumi.Input<string>;
    /**
     * enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
     */
    topics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
     */
    type?: pulumi.Input<string>;
    url?: pulumi.Input<string>;
    /**
     * When url uses HTTPS, whether to verify the certificate
     */
    verifyCert?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Webhook resource.
 */
export interface WebhookArgs {
    /**
     * Whether webhook is enabled
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * If `type`=`http-post`, additional custom HTTP headers to add. The headers name and value must be string, total bytes of headers name and value must be less than 1000
     */
    headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Name of the webhook
     */
    name?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`clientCredentials`
     */
    oauth2ClientId?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`clientCredentials`
     */
    oauth2ClientSecret?: pulumi.Input<string>;
    /**
     * required when `type`==`oauth2`. enum: `clientCredentials`, `password`
     */
    oauth2GrantType?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`password`
     */
    oauth2Password?: pulumi.Input<string>;
    /**
     * Required when `type`==`oauth2`, if provided, will be used in the token request
     */
    oauth2Scopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Required when `type`==`oauth2`
     */
    oauth2TokenUrl?: pulumi.Input<string>;
    /**
     * Required when `oauth2GrantType`==`password`
     */
    oauth2Username?: pulumi.Input<string>;
    /**
     * Only if `type`=`http-post`
     */
    secret?: pulumi.Input<string>;
    /**
     * Some solutions may not be able to parse multiple events from a single message (e.g. IBM Qradar, DSM). When set to
     * `true`, only a single event will be sent per message. this feature is only available on certain topics (see List Webhook
     * Topics)
     */
    singleEventPerMessage?: pulumi.Input<boolean>;
    siteId: pulumi.Input<string>;
    /**
     * Required if `type`=`splunk`. If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if
     * the webhook receiver is configured to accept it.
     */
    splunkToken?: pulumi.Input<string>;
    /**
     * enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
     */
    topics: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
     */
    type?: pulumi.Input<string>;
    url: pulumi.Input<string>;
    /**
     * When url uses HTTPS, whether to verify the certificate
     */
    verifyCert?: pulumi.Input<boolean>;
}
