// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.device.ImageArgs;
import com.pulumi.junipermist.device.inputs.ImageState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource is used to upload a Device picture.
 * 
 * This resource can be used to add a picture to a Wireless Access point, a Switch or a Gateway. A Maximum of 3 pictures can be uploaded.
 * 
 * !&gt; There is no validation on the Image currently uploaded to the Mist Cloud. Defining the same image twice (e.g. `image = 1`) for the same device will override the first image any warning or error.
 * 
 */
@ResourceType(type="junipermist:device/image:Image")
public class Image extends com.pulumi.resources.CustomResource {
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * path to the device image file to upload. File must be a `jpeg`, `jpg` or `png` image`
     * 
     */
    @Export(name="file", refs={String.class}, tree="[0]")
    private Output<String> file;

    /**
     * @return path to the device image file to upload. File must be a `jpeg`, `jpg` or `png` image`
     * 
     */
    public Output<String> file() {
        return this.file;
    }
    @Export(name="imageNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> imageNumber;

    public Output<Integer> imageNumber() {
        return this.imageNumber;
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(java.lang.String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(java.lang.String name, ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(java.lang.String name, ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/image:Image", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Image(java.lang.String name, Output<java.lang.String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/image:Image", name, state, makeResourceOptions(options, id), false);
    }

    private static ImageArgs makeArgs(ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ImageArgs.Empty : args;
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
    public static Image get(java.lang.String name, Output<java.lang.String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}
