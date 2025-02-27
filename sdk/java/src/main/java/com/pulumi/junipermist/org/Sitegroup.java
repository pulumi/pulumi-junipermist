// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.SitegroupArgs;
import com.pulumi.junipermist.org.inputs.SitegroupState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource managed the Org Site Groups (sitegroups).
 * 
 * A site group is a feature that allows admins to group multiple sites together based on regions, functions, or other parameters for efficient management of devices.\
 * Sites can exist in multiple groups simultaneously, and site groups can be used to ensure consistent settings, manage administrator access, and apply specific templates to groups of sites.
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
 * import com.pulumi.junipermist.org.Sitegroup;
 * import com.pulumi.junipermist.org.SitegroupArgs;
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
 *         var sitegroupOne = new Sitegroup("sitegroupOne", SitegroupArgs.builder()
 *             .orgId(terraformTest.id())
 *             .name("sitegroup_one")
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
 * Using `pulumi import`, import `mist_org_sitegroup` with:
 * 
 * Org Site Group can be imported by specifying the org_id and the sitegroup_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/sitegroup:Sitegroup sitegroup_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/sitegroup:Sitegroup")
public class Sitegroup extends com.pulumi.resources.CustomResource {
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Sitegroup(java.lang.String name) {
        this(name, SitegroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Sitegroup(java.lang.String name, SitegroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Sitegroup(java.lang.String name, SitegroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/sitegroup:Sitegroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Sitegroup(java.lang.String name, Output<java.lang.String> id, @Nullable SitegroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/sitegroup:Sitegroup", name, state, makeResourceOptions(options, id), false);
    }

    private static SitegroupArgs makeArgs(SitegroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SitegroupArgs.Empty : args;
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
    public static Sitegroup get(java.lang.String name, Output<java.lang.String> id, @Nullable SitegroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Sitegroup(name, id, state, options);
    }
}
