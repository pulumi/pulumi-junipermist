// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.WlanPortalImageArgs;
import com.pulumi.junipermist.org.inputs.WlanPortalImageState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource is used to upload a WLAN Captive Web Portal background image.The WLAN object contains all the required configuration to broadcast an SSID (Authentication, VLAN, ...)
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="junipermist:org/wlanPortalImage:WlanPortalImage")
public class WlanPortalImage extends com.pulumi.resources.CustomResource {
    /**
     * path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
     * 
     */
    @Export(name="file", refs={String.class}, tree="[0]")
    private Output<String> file;

    /**
     * @return path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
     * 
     */
    public Output<String> file() {
        return this.file;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
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
    public WlanPortalImage(java.lang.String name) {
        this(name, WlanPortalImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WlanPortalImage(java.lang.String name, WlanPortalImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WlanPortalImage(java.lang.String name, WlanPortalImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wlanPortalImage:WlanPortalImage", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WlanPortalImage(java.lang.String name, Output<java.lang.String> id, @Nullable WlanPortalImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/wlanPortalImage:WlanPortalImage", name, state, makeResourceOptions(options, id), false);
    }

    private static WlanPortalImageArgs makeArgs(WlanPortalImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WlanPortalImageArgs.Empty : args;
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
    public static WlanPortalImage get(java.lang.String name, Output<java.lang.String> id, @Nullable WlanPortalImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WlanPortalImage(name, id, state, options);
    }
}
