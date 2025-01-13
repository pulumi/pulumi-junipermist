// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.NactagArgs;
import com.pulumi.junipermist.org.inputs.NactagState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages NAC Tags (Auth Policy Labels).
 * 
 * The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
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
 * import com.pulumi.junipermist.org.Nactag;
 * import com.pulumi.junipermist.org.NactagArgs;
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
 *         var tagOne = new Nactag("tagOne", NactagArgs.builder()
 *             .name("tag_one")
 *             .type("match")
 *             .match("client_mac")
 *             .orgId(terraformTest.id())
 *             .values("5c5b35*")
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
 * Using `pulumi import`, import `mist_org_nactag` with:
 * 
 * NAC Tag can be imported by specifying the org_id and the nactag_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/nactag:Nactag nactag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/nactag:Nactag")
public class Nactag extends com.pulumi.resources.CustomResource {
    /**
     * can be set to true to allow the override by usermac result
     * 
     */
    @Export(name="allowUsermacOverride", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> allowUsermacOverride;

    /**
     * @return can be set to true to allow the override by usermac result
     * 
     */
    public Output<Boolean> allowUsermacOverride() {
        return this.allowUsermacOverride;
    }
    /**
     * if `type`==`egress_vlan_names`, list of egress vlans to return
     * 
     */
    @Export(name="egressVlanNames", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> egressVlanNames;

    /**
     * @return if `type`==`egress_vlan_names`, list of egress vlans to return
     * 
     */
    public Output<Optional<List<String>>> egressVlanNames() {
        return Codegen.optional(this.egressVlanNames);
    }
    /**
     * if `type`==`gbp_tag`
     * 
     */
    @Export(name="gbpTag", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> gbpTag;

    /**
     * @return if `type`==`gbp_tag`
     * 
     */
    public Output<Optional<Integer>> gbpTag() {
        return Codegen.optional(this.gbpTag);
    }
    /**
     * if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `client_mac`, `idp_role`,
     * `mdm_status`, `radius_group`, `realm`, `ssid`, `user_name`, `usermac_label`
     * 
     */
    @Export(name="match", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> match;

    /**
     * @return if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `client_mac`, `idp_role`,
     * `mdm_status`, `radius_group`, `realm`, `ssid`, `user_name`, `usermac_label`
     * 
     */
    public Output<Optional<String>> match() {
        return Codegen.optional(this.match);
    }
    /**
     * This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
     * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
     * set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`&#39;
     * 
     */
    @Export(name="matchAll", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> matchAll;

    /**
     * @return This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
     * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
     * set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`&#39;
     * 
     */
    public Output<Boolean> matchAll() {
        return this.matchAll;
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
     * if `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;. It is
     * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
     * that it is allowed to have more than one radius_attrs in the result of a given rule.
     * 
     */
    @Export(name="radiusAttrs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> radiusAttrs;

    /**
     * @return if `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;. It is
     * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
     * that it is allowed to have more than one radius_attrs in the result of a given rule.
     * 
     */
    public Output<Optional<List<String>>> radiusAttrs() {
        return Codegen.optional(this.radiusAttrs);
    }
    /**
     * if `type`==`radius_group`
     * 
     */
    @Export(name="radiusGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> radiusGroup;

    /**
     * @return if `type`==`radius_group`
     * 
     */
    public Output<Optional<String>> radiusGroup() {
        return Codegen.optional(this.radiusGroup);
    }
    /**
     * if `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
     * &#34;radius_vendor_attrs&#34;. It is the responsibility of the user to provide a syntactically correct string, otherwise it may
     * not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
     * 
     */
    @Export(name="radiusVendorAttrs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> radiusVendorAttrs;

    /**
     * @return if `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
     * &#34;radius_vendor_attrs&#34;. It is the responsibility of the user to provide a syntactically correct string, otherwise it may
     * not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
     * 
     */
    public Output<Optional<List<String>>> radiusVendorAttrs() {
        return Codegen.optional(this.radiusVendorAttrs);
    }
    /**
     * if `type`==`session_timeout, in seconds
     * 
     */
    @Export(name="sessionTimeout", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> sessionTimeout;

    /**
     * @return if `type`==`session_timeout, in seconds
     * 
     */
    public Output<Optional<Integer>> sessionTimeout() {
        return Codegen.optional(this.sessionTimeout);
    }
    /**
     * enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
     * `vlan`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
     * `vlan`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * if `type`==`match`
     * 
     */
    @Export(name="values", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> values;

    /**
     * @return if `type`==`match`
     * 
     */
    public Output<Optional<List<String>>> values() {
        return Codegen.optional(this.values);
    }
    /**
     * if `type`==`vlan`
     * 
     */
    @Export(name="vlan", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vlan;

    /**
     * @return if `type`==`vlan`
     * 
     */
    public Output<Optional<String>> vlan() {
        return Codegen.optional(this.vlan);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Nactag(java.lang.String name) {
        this(name, NactagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Nactag(java.lang.String name, NactagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Nactag(java.lang.String name, NactagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/nactag:Nactag", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Nactag(java.lang.String name, Output<java.lang.String> id, @Nullable NactagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/nactag:Nactag", name, state, makeResourceOptions(options, id), false);
    }

    private static NactagArgs makeArgs(NactagArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NactagArgs.Empty : args;
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
    public static Nactag get(java.lang.String name, Output<java.lang.String> id, @Nullable NactagState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Nactag(name, id, state, options);
    }
}
