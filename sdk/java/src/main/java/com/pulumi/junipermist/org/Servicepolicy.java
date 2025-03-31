// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.ServicepolicyArgs;
import com.pulumi.junipermist.org.inputs.ServicepolicyState;
import com.pulumi.junipermist.org.outputs.ServicepolicyAamw;
import com.pulumi.junipermist.org.outputs.ServicepolicyAntivirus;
import com.pulumi.junipermist.org.outputs.ServicepolicyAppqoe;
import com.pulumi.junipermist.org.outputs.ServicepolicyEwf;
import com.pulumi.junipermist.org.outputs.ServicepolicyIdp;
import com.pulumi.junipermist.org.outputs.ServicepolicySslProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages WAN Assurance Service Policies (Application Policies).
 * 
 * The Service Policies can be used in the `service_policies` object by referencing the Service Policy ID as the `servicepolicy_id` in:
 * * the Gateway configuration (`mist_device_gateway.service_policies`)
 * * the Gateway Templates (`mist_org_gatewaytemplate.service_policies`)
 * * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies`)
 *   They can be used to manage common policies between multiples configurations
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.junipermist.org.Servicepolicy;
 * import com.pulumi.junipermist.org.ServicepolicyArgs;
 * import com.pulumi.junipermist.org.inputs.ServicepolicyIdpArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var servicepolicyOne = new Servicepolicy("servicepolicyOne", ServicepolicyArgs.builder()
 *             .orgId(terraformTest.id())
 *             .tenants("guest")
 *             .services("guest-internet")
 *             .action("allow")
 *             .idp(ServicepolicyIdpArgs.builder()
 *                 .enabled(true)
 *                 .profile("standard")
 *                 .alert_only(true)
 *                 .build())
 *             .name("Guest-IDP")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_org_servicepolicy` with:
 * 
 * Org Service Policy can be imported by specifying the org_id and the servicepolicy_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/servicepolicy:Servicepolicy servicepolicy_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/servicepolicy:Servicepolicy")
public class Servicepolicy extends com.pulumi.resources.CustomResource {
    /**
     * For SRX Only
     * 
     */
    @Export(name="aamw", refs={ServicepolicyAamw.class}, tree="[0]")
    private Output</* @Nullable */ ServicepolicyAamw> aamw;

    /**
     * @return For SRX Only
     * 
     */
    public Output<Optional<ServicepolicyAamw>> aamw() {
        return Codegen.optional(this.aamw);
    }
    /**
     * enum: `allow`, `deny`
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return enum: `allow`, `deny`
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * For SRX-only
     * 
     */
    @Export(name="antivirus", refs={ServicepolicyAntivirus.class}, tree="[0]")
    private Output</* @Nullable */ ServicepolicyAntivirus> antivirus;

    /**
     * @return For SRX-only
     * 
     */
    public Output<Optional<ServicepolicyAntivirus>> antivirus() {
        return Codegen.optional(this.antivirus);
    }
    /**
     * For SRX Only
     * 
     */
    @Export(name="appqoe", refs={ServicepolicyAppqoe.class}, tree="[0]")
    private Output</* @Nullable */ ServicepolicyAppqoe> appqoe;

    /**
     * @return For SRX Only
     * 
     */
    public Output<Optional<ServicepolicyAppqoe>> appqoe() {
        return Codegen.optional(this.appqoe);
    }
    @Export(name="ewfs", refs={List.class,ServicepolicyEwf.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServicepolicyEwf>> ewfs;

    public Output<Optional<List<ServicepolicyEwf>>> ewfs() {
        return Codegen.optional(this.ewfs);
    }
    @Export(name="idp", refs={ServicepolicyIdp.class}, tree="[0]")
    private Output</* @Nullable */ ServicepolicyIdp> idp;

    public Output<Optional<ServicepolicyIdp>> idp() {
        return Codegen.optional(this.idp);
    }
    /**
     * access within the same VRF
     * 
     */
    @Export(name="localRouting", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> localRouting;

    /**
     * @return access within the same VRF
     * 
     */
    public Output<Optional<Boolean>> localRouting() {
        return Codegen.optional(this.localRouting);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * By default, we derive all paths available and use them, optionally, you can customize by using `path_preference`
     * 
     */
    @Export(name="pathPreference", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pathPreference;

    /**
     * @return By default, we derive all paths available and use them, optionally, you can customize by using `path_preference`
     * 
     */
    public Output<Optional<String>> pathPreference() {
        return Codegen.optional(this.pathPreference);
    }
    @Export(name="services", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> services;

    public Output<Optional<List<String>>> services() {
        return Codegen.optional(this.services);
    }
    /**
     * For SRX-only
     * 
     */
    @Export(name="sslProxy", refs={ServicepolicySslProxy.class}, tree="[0]")
    private Output</* @Nullable */ ServicepolicySslProxy> sslProxy;

    /**
     * @return For SRX-only
     * 
     */
    public Output<Optional<ServicepolicySslProxy>> sslProxy() {
        return Codegen.optional(this.sslProxy);
    }
    @Export(name="tenants", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tenants;

    public Output<Optional<List<String>>> tenants() {
        return Codegen.optional(this.tenants);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Servicepolicy(java.lang.String name) {
        this(name, ServicepolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Servicepolicy(java.lang.String name, ServicepolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Servicepolicy(java.lang.String name, ServicepolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/servicepolicy:Servicepolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Servicepolicy(java.lang.String name, Output<java.lang.String> id, @Nullable ServicepolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/servicepolicy:Servicepolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static ServicepolicyArgs makeArgs(ServicepolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServicepolicyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-junipermist")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Servicepolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable ServicepolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Servicepolicy(name, id, state, options);
    }
}
