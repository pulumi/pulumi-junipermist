// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.WlanPortalTemplateArgs;
import com.pulumi.junipermist.org.inputs.WlanPortalTemplateState;
import com.pulumi.junipermist.org.outputs.WlanPortalTemplatePortalTemplate;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource is used customize the WLAN Guest Portal.
 * 
 * The WLAN Portal Template can be used to define:
 * * Guest Authentication methods and parameters (access duration, ...)
 * * Default values of the text fields and labels on the portal
 * * Values of the text fields and labels based on the User Agent (`locales` property)
 * 
 * **Notes:**
 * * There is no feedback from the API, so there is no possibility to validate the changes. The resource states is directly generated based on the resource plan.* There is no option to delete or revert the changes. Deleting the resource will just remove it from the states. Once removed, it is possible to create a new one. It will replace the previous template
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="junipermist:org/wlanPortalTemplate:WlanPortalTemplate")
public class WlanPortalTemplate extends com.pulumi.resources.CustomResource {
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Portal template wlan settings
     * 
     */
    @Export(name="portalTemplate", refs={WlanPortalTemplatePortalTemplate.class}, tree="[0]")
    private Output<WlanPortalTemplatePortalTemplate> portalTemplate;

    /**
     * @return Portal template wlan settings
     * 
     */
    public Output<WlanPortalTemplatePortalTemplate> portalTemplate() {
        return this.portalTemplate;
    }
    /**
     * Org WLAN ID
     * 
     */
    @Export(name="wlanId", refs={String.class}, tree="[0]")
    private Output<String> wlanId;

    /**
     * @return Org WLAN ID
     * 
     */
    public Output<String> wlanId() {
        return this.wlanId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WlanPortalTemplate(java.lang.String name) {
        this(name, WlanPortalTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WlanPortalTemplate(java.lang.String name, WlanPortalTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WlanPortalTemplate(java.lang.String name, WlanPortalTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wlanPortalTemplate:WlanPortalTemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WlanPortalTemplate(java.lang.String name, Output<java.lang.String> id, @Nullable WlanPortalTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wlanPortalTemplate:WlanPortalTemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static WlanPortalTemplateArgs makeArgs(WlanPortalTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WlanPortalTemplateArgs.Empty : args;
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
    public static WlanPortalTemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable WlanPortalTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WlanPortalTemplate(name, id, state, options);
    }
}
