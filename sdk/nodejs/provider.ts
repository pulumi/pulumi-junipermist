// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the mist package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'junipermist';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === "pulumi:providers:" + Provider.__pulumiType;
    }

    /**
     * For API Token authentication, the Mist API Token.
     */
    public readonly apitoken!: pulumi.Output<string | undefined>;
    /**
     * URL of the Mist Cloud, e.g. `api.mist.com`.
     */
    public readonly host!: pulumi.Output<string>;
    /**
     * For username/password authentication, the Mist Account password.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
     * `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
     * are supported.
     */
    public readonly proxy!: pulumi.Output<string | undefined>;
    /**
     * For username/password authentication, the Mist Account username.
     */
    public readonly username!: pulumi.Output<string | undefined>;

    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            if ((!args || args.host === undefined) && !opts.urn) {
                throw new Error("Missing required property 'host'");
            }
            resourceInputs["apiTimeout"] = pulumi.output(args ? args.apiTimeout : undefined).apply(JSON.stringify);
            resourceInputs["apitoken"] = args?.apitoken ? pulumi.secret(args.apitoken) : undefined;
            resourceInputs["host"] = args ? args.host : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["proxy"] = args ? args.proxy : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apitoken", "password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Provider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
     * results in infinite timeout.
     */
    apiTimeout?: pulumi.Input<number>;
    /**
     * For API Token authentication, the Mist API Token.
     */
    apitoken?: pulumi.Input<string>;
    /**
     * URL of the Mist Cloud, e.g. `api.mist.com`.
     */
    host: pulumi.Input<string>;
    /**
     * For username/password authentication, the Mist Account password.
     */
    password?: pulumi.Input<string>;
    /**
     * Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
     * `[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
     * are supported.
     */
    proxy?: pulumi.Input<string>;
    /**
     * For username/password authentication, the Mist Account username.
     */
    username?: pulumi.Input<string>;
}