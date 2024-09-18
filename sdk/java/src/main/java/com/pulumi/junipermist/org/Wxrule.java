// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.WxruleArgs;
import com.pulumi.junipermist.org.inputs.WxruleState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Org WxRules (WxLAN policies).A WxLAN policy is a set of rules and settings that can be applied to devices in a network to determine how they are treated. it provides support for access policies, network segmentation, role-based policies, micro-segmentation, and least privilege. WxLAN policies are used to allow or deny specific users from accessing specific resources in a wireless network.
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
 * import com.pulumi.junipermist.org.Wxrule;
 * import com.pulumi.junipermist.org.WxruleArgs;
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
 *         var wxruleOne = new Wxrule("wxruleOne", WxruleArgs.builder()
 *             .orgId(terraformTest.id())
 *             .templateId(wlantempalteOne.id())
 *             .srcWxtags(wxtagOne.id())
 *             .enabled(true)
 *             .action("allow")
 *             .dstDenyWxtags(wxtagTwo.id())
 *             .order(1)
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
 * Using `pulumi import`, import `mist_org_wxrule` with:
 * 
 * Org WxRule can be imported by specifying the org_id and the wxrule_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/wxrule:Wxrule wxrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/wxrule:Wxrule")
public class Wxrule extends com.pulumi.resources.CustomResource {
    /**
     * type of action, allow / block. enum: `allow`, `block`
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return type of action, allow / block. enum: `allow`, `block`
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    @Export(name="applyTags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> applyTags;

    public Output<Optional<List<String>>> applyTags() {
        return Codegen.optional(this.applyTags);
    }
    /**
     * blocked apps (always blocking, ignoring action), the key of Get Application List
     * 
     */
    @Export(name="blockedApps", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> blockedApps;

    /**
     * @return blocked apps (always blocking, ignoring action), the key of Get Application List
     * 
     */
    public Output<Optional<List<String>>> blockedApps() {
        return Codegen.optional(this.blockedApps);
    }
    /**
     * tag list to indicate these tags are allowed access
     * 
     */
    @Export(name="dstAllowWxtags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dstAllowWxtags;

    /**
     * @return tag list to indicate these tags are allowed access
     * 
     */
    public Output<List<String>> dstAllowWxtags() {
        return this.dstAllowWxtags;
    }
    /**
     * tag list to indicate these tags are blocked access
     * 
     */
    @Export(name="dstDenyWxtags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dstDenyWxtags;

    /**
     * @return tag list to indicate these tags are blocked access
     * 
     */
    public Output<List<String>> dstDenyWxtags() {
        return this.dstDenyWxtags;
    }
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * the order how rules would be looked up, &gt; 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
     * 
     */
    @Export(name="order", refs={Integer.class}, tree="[0]")
    private Output<Integer> order;

    /**
     * @return the order how rules would be looked up, &gt; 0 and bigger order got matched first, -1 means LAST, uniqueness not checked
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * tag list to determine if this rule would match
     * 
     */
    @Export(name="srcWxtags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> srcWxtags;

    /**
     * @return tag list to determine if this rule would match
     * 
     */
    public Output<List<String>> srcWxtags() {
        return this.srcWxtags;
    }
    /**
     * Only for Org Level WxRule
     * 
     */
    @Export(name="templateId", refs={String.class}, tree="[0]")
    private Output<String> templateId;

    /**
     * @return Only for Org Level WxRule
     * 
     */
    public Output<String> templateId() {
        return this.templateId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Wxrule(java.lang.String name) {
        this(name, WxruleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Wxrule(java.lang.String name, WxruleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Wxrule(java.lang.String name, WxruleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wxrule:Wxrule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Wxrule(java.lang.String name, Output<java.lang.String> id, @Nullable WxruleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wxrule:Wxrule", name, state, makeResourceOptions(options, id), false);
    }

    private static WxruleArgs makeArgs(WxruleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WxruleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Wxrule get(java.lang.String name, Output<java.lang.String> id, @Nullable WxruleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Wxrule(name, id, state, options);
    }
}
