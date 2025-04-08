// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.AlarmtemplateArgs;
import com.pulumi.junipermist.org.inputs.AlarmtemplateState;
import com.pulumi.junipermist.org.outputs.AlarmtemplateDelivery;
import com.pulumi.junipermist.org.outputs.AlarmtemplateRules;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource manages Alarm Templates.
 * 
 * An Alarm Template is a set of Alarm Rules that could be applied to one or more sites (while each site can only pick one Alarm Template), or to the whole org.
 * 
 * Once created, the Alarm template must be assigned with the `alarmtemplate_id` attribute to one of the following:
 * * the whole org with the `junipermist.org.base` resource
 * * one or multiple sites with the `junipermist.site.base` resource
 * 
 * It is possible to use the `junipermist.getConstAlarms` data source to get a list of the available alarms
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
 * import com.pulumi.junipermist.org.Alarmtemplate;
 * import com.pulumi.junipermist.org.AlarmtemplateArgs;
 * import com.pulumi.junipermist.org.inputs.AlarmtemplateDeliveryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var alarmtemplateOne = new Alarmtemplate("alarmtemplateOne", AlarmtemplateArgs.builder()
 *             .orgId(terraformTest.id())
 *             .name("alarmtemplate_one")
 *             .delivery(AlarmtemplateDeliveryArgs.builder()
 *                 .enabled(true)
 *                 .to_org_admins(true)
 *                 .additional_emails("admin}{@literal @}{@code mycorp.net")
 *                 .build())
 *             .rules(Map.ofEntries(
 *                 Map.entry("health_check_failed", Map.of("enabled", true)),
 *                 Map.entry("insufficient_capacity", Map.of("enabled", true)),
 *                 Map.entry("insufficient_coverage", Map.of("enabled", true)),
 *                 Map.entry("infra_arp_failure", Map.of("enabled", true)),
 *                 Map.entry("arp_failure", Map.of("enabled", true))
 *             ))
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_org_alarmtemplate` with:
 * 
 * Org RF Template can be imported by specifying the org_id and the alarmtemplate_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/alarmtemplate:Alarmtemplate alarmtemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/alarmtemplate:Alarmtemplate")
public class Alarmtemplate extends com.pulumi.resources.CustomResource {
    /**
     * Delivery object to configure the alarm delivery
     * 
     */
    @Export(name="delivery", refs={AlarmtemplateDelivery.class}, tree="[0]")
    private Output<AlarmtemplateDelivery> delivery;

    /**
     * @return Delivery object to configure the alarm delivery
     * 
     */
    public Output<AlarmtemplateDelivery> delivery() {
        return this.delivery;
    }
    /**
     * Some string to name the alarm template
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Some string to name the alarm template
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `junipermist.getConstAlarms` data source).
     * 
     */
    @Export(name="rules", refs={Map.class,String.class,AlarmtemplateRules.class}, tree="[0,1,2]")
    private Output<Map<String,AlarmtemplateRules>> rules;

    /**
     * @return Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `junipermist.getConstAlarms` data source).
     * 
     */
    public Output<Map<String,AlarmtemplateRules>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alarmtemplate(java.lang.String name) {
        this(name, AlarmtemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alarmtemplate(java.lang.String name, AlarmtemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alarmtemplate(java.lang.String name, AlarmtemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/alarmtemplate:Alarmtemplate", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Alarmtemplate(java.lang.String name, Output<java.lang.String> id, @Nullable AlarmtemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/alarmtemplate:Alarmtemplate", name, state, makeResourceOptions(options, id), false);
    }

    private static AlarmtemplateArgs makeArgs(AlarmtemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AlarmtemplateArgs.Empty : args;
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
    public static Alarmtemplate get(java.lang.String name, Output<java.lang.String> id, @Nullable AlarmtemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alarmtemplate(name, id, state, options);
    }
}
