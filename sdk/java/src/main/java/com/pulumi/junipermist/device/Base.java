// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.device.BaseArgs;
import com.pulumi.junipermist.device.inputs.BaseState;
import com.pulumi.junipermist.device.outputs.BaseLatlng;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Site basic information.
 * 
 * This resource can be used to assign templates to a site, or to change basic information (e.g. Site Address)
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
 * import com.pulumi.junipermist.site.base;
 * import com.pulumi.junipermist.site.baseArgs;
 * import com.pulumi.junipermist.site.inputs.BaseLatlngArgs;
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
 *         var juniperFrance = new Base("juniperFrance", BaseArgs.builder()
 *             .orgId(terraformTest.id())
 *             .name("JNP-FR-PAR")
 *             .countryCode("FR")
 *             .timezone("Europe/Paris")
 *             .address("41 Rue de Villiers, 92100 Neuilly sur Seine, France")
 *             .notes("Created with Terraform, Updated with Terraform")
 *             .latlng(BaseLatlngArgs.builder()
 *                 .lat(48.899268)
 *                 .lng(2.214447)
 *                 .build())
 *             .sitegroupIds(            
 *                 testGroup.id(),
 *                 testGroup2.id())
 *             .networktemplateId(networktemplateOne.id())
 *             .rftemplateId(rftemplateOne.id())
 *             .gatewaytemplateId(gatewaytemplateOne.id())
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
 * Using `pulumi import`, import `mist_site` with:
 * 
 * Site can be imported by specifying the site_id
 * 
 * ```sh
 * $ pulumi import junipermist:device/base:base site_one d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 * @deprecated
 * junipermist.device/base.base has been deprecated in favor of junipermist.site/base.base
 * 
 */
@Deprecated /* junipermist.device/base.base has been deprecated in favor of junipermist.site/base.base */
@ResourceType(type="junipermist:device/base:base")
public class Base extends com.pulumi.resources.CustomResource {
    /**
     * full address of the site
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return full address of the site
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
     * 
     */
    @Export(name="alarmtemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alarmtemplateId;

    /**
     * @return Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
     * 
     */
    public Output<Optional<String>> alarmtemplateId() {
        return Codegen.optional(this.alarmtemplateId);
    }
    /**
     * AP Template ID, used by APs
     * 
     */
    @Export(name="aptemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aptemplateId;

    /**
     * @return AP Template ID, used by APs
     * 
     */
    public Output<Optional<String>> aptemplateId() {
        return Codegen.optional(this.aptemplateId);
    }
    /**
     * Country code for the site (for AP config generation), in two-character
     * 
     */
    @Export(name="countryCode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> countryCode;

    /**
     * @return Country code for the site (for AP config generation), in two-character
     * 
     */
    public Output<Optional<String>> countryCode() {
        return Codegen.optional(this.countryCode);
    }
    /**
     * Gateway Template ID, used by gateways
     * 
     */
    @Export(name="gatewaytemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> gatewaytemplateId;

    /**
     * @return Gateway Template ID, used by gateways
     * 
     */
    public Output<Optional<String>> gatewaytemplateId() {
        return Codegen.optional(this.gatewaytemplateId);
    }
    @Export(name="latlng", refs={BaseLatlng.class}, tree="[0]")
    private Output</* @Nullable */ BaseLatlng> latlng;

    public Output<Optional<BaseLatlng>> latlng() {
        return Codegen.optional(this.latlng);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Network Template ID, this takes precedence over Site Settings
     * 
     */
    @Export(name="networktemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> networktemplateId;

    /**
     * @return Network Template ID, this takes precedence over Site Settings
     * 
     */
    public Output<Optional<String>> networktemplateId() {
        return Codegen.optional(this.networktemplateId);
    }
    /**
     * Optional, any notes about the site
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output<String> notes;

    /**
     * @return Optional, any notes about the site
     * 
     */
    public Output<String> notes() {
        return this.notes;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * RF Template ID, this takes precedence over Site Settings
     * 
     */
    @Export(name="rftemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rftemplateId;

    /**
     * @return RF Template ID, this takes precedence over Site Settings
     * 
     */
    public Output<Optional<String>> rftemplateId() {
        return Codegen.optional(this.rftemplateId);
    }
    /**
     * SecPolicy ID
     * 
     */
    @Export(name="secpolicyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secpolicyId;

    /**
     * @return SecPolicy ID
     * 
     */
    public Output<Optional<String>> secpolicyId() {
        return Codegen.optional(this.secpolicyId);
    }
    /**
     * Sitegroups this site belongs to
     * 
     */
    @Export(name="sitegroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sitegroupIds;

    /**
     * @return Sitegroups this site belongs to
     * 
     */
    public Output<List<String>> sitegroupIds() {
        return this.sitegroupIds;
    }
    /**
     * Site Template ID
     * 
     */
    @Export(name="sitetemplateId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sitetemplateId;

    /**
     * @return Site Template ID
     * 
     */
    public Output<Optional<String>> sitetemplateId() {
        return Codegen.optional(this.sitetemplateId);
    }
    /**
     * Timezone the site is at
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output<String> timezone;

    /**
     * @return Timezone the site is at
     * 
     */
    public Output<String> timezone() {
        return this.timezone;
    }
    @Export(name="tzoffset", refs={Integer.class}, tree="[0]")
    private Output<Integer> tzoffset;

    public Output<Integer> tzoffset() {
        return this.tzoffset;
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
    public Base(java.lang.String name, BaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Base(java.lang.String name, BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/base:base", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Base(java.lang.String name, Output<java.lang.String> id, @Nullable BaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/base:base", name, state, makeResourceOptions(options, id), false);
    }

    private static BaseArgs makeArgs(BaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
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
