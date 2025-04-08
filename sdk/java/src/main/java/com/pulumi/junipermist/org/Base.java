// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.BaseArgs;
import com.pulumi.junipermist.org.inputs.BaseState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Mist Organization.
 * 
 * An organization usually represents a customer - which has inventories, licenses. An Organization can contain multiple sites. A site usually represents a deployment at the same location (a campus, an office).
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
 * import com.pulumi.junipermist.org.base;
 * import com.pulumi.junipermist.org.BaseArgs;
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
 *         var orgOne = new Base("orgOne", BaseArgs.builder()
 *             .name("Org One")
 *             .alarmtemplateId(alarmtemplateOne.id())
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
 * Using `pulumi import`, import `mist_org` with:
 * 
 * Organization can be imported by specifying the org_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/base:base org_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
 * ```
 * 
 */
@ResourceType(type="junipermist:org/base:base")
public class Base extends com.pulumi.resources.CustomResource {
    @Export(name="alarmtemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alarmtemplateId;

    public Output<Optional<String>> alarmtemplateId() {
        return Codegen.optional(this.alarmtemplateId);
    }
    @Export(name="allowMist", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allowMist;

    public Output<Boolean> allowMist() {
        return this.allowMist;
    }
    @Export(name="mspId", refs={String.class}, tree="[0]")
    private Output<String> mspId;

    public Output<String> mspId() {
        return this.mspId;
    }
    /**
     * logo uploaded by the MSP with advanced tier, only present if provided
     * 
     */
    @Export(name="mspLogoUrl", refs={String.class}, tree="[0]")
    private Output<String> mspLogoUrl;

    /**
     * @return logo uploaded by the MSP with advanced tier, only present if provided
     * 
     */
    public Output<String> mspLogoUrl() {
        return this.mspLogoUrl;
    }
    /**
     * Name of the msp the org belongs to
     * 
     */
    @Export(name="mspName", refs={String.class}, tree="[0]")
    private Output<String> mspName;

    /**
     * @return Name of the msp the org belongs to
     * 
     */
    public Output<String> mspName() {
        return this.mspName;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="orggroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> orggroupIds;

    public Output<List<String>> orggroupIds() {
        return this.orggroupIds;
    }
    @Export(name="sessionExpiry", refs={Integer.class}, tree="[0]")
    private Output<Integer> sessionExpiry;

    public Output<Integer> sessionExpiry() {
        return this.sessionExpiry;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Base(java.lang.String name) {
        this(name, BaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Base(java.lang.String name, @Nullable BaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Base(java.lang.String name, @Nullable BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/base:base", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Base(java.lang.String name, Output<java.lang.String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/base:base", name, state, makeResourceOptions(options, id), false);
    }

    private static BaseArgs makeArgs(@Nullable BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BaseArgs.Empty : args;
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
    public static Base get(java.lang.String name, Output<java.lang.String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Base(name, id, state, options);
    }
}
