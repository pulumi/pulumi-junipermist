// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.SsoRoleArgs;
import com.pulumi.junipermist.org.inputs.SsoRoleState;
import com.pulumi.junipermist.org.outputs.SsoRolePrivilege;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource manages Org SSO Roles for Admin Authantication.
 * 
 * SSO roles refer to the different functions assigned to users within a Single Sign-On (SSO) system.\
 * These roles determine the tasks and actions that users can perform within the SSO system. There are typically predefined roles and custom roles in an SSO system.\
 * Roles in SSO provide a well-defined separation of responsibility and visibility, allowing for granular-level access control on SSO objects.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_org_sso_role` with:
 * 
 * Org PSK can be imported by specifying the org_id and the sso_role_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/ssoRole:SsoRole sso_role_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/ssoRole:SsoRole")
public class SsoRole extends com.pulumi.resources.CustomResource {
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
    @Export(name="privileges", refs={List.class,SsoRolePrivilege.class}, tree="[0,1]")
    private Output<List<SsoRolePrivilege>> privileges;

    public Output<List<SsoRolePrivilege>> privileges() {
        return this.privileges;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SsoRole(java.lang.String name) {
        this(name, SsoRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SsoRole(java.lang.String name, SsoRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SsoRole(java.lang.String name, SsoRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/ssoRole:SsoRole", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SsoRole(java.lang.String name, Output<java.lang.String> id, @Nullable SsoRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/ssoRole:SsoRole", name, state, makeResourceOptions(options, id), false);
    }

    private static SsoRoleArgs makeArgs(SsoRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SsoRoleArgs.Empty : args;
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
    public static SsoRole get(java.lang.String name, Output<java.lang.String> id, @Nullable SsoRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SsoRole(name, id, state, options);
    }
}
