// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.DeviceprofileApArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileApState;
import com.pulumi.junipermist.org.outputs.DeviceprofileApAeroscout;
import com.pulumi.junipermist.org.outputs.DeviceprofileApBleConfig;
import com.pulumi.junipermist.org.outputs.DeviceprofileApEslConfig;
import com.pulumi.junipermist.org.outputs.DeviceprofileApIpConfig;
import com.pulumi.junipermist.org.outputs.DeviceprofileApLed;
import com.pulumi.junipermist.org.outputs.DeviceprofileApMesh;
import com.pulumi.junipermist.org.outputs.DeviceprofileApPwrConfig;
import com.pulumi.junipermist.org.outputs.DeviceprofileApRadioConfig;
import com.pulumi.junipermist.org.outputs.DeviceprofileApUplinkPortConfig;
import com.pulumi.junipermist.org.outputs.DeviceprofileApUsbConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the AP Device Profiles.
 * AP Device profiles for aps are used to specify a configuration that can be applied to a select set of aps from any site in the organization. They allow for efficient application of configurations based on ap groups, wlan groups, RF settings, and sites. Device profiles enable various use cases such as activating ethernet passthrough, applying different rf settings, applying mesh configuration, activating specific features like esl or vble, and more.
 * 
 * The AP Devide Profile can be assigned to a gateway with the `junipermist.org.DeviceprofileAssign` resource.
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
 * import com.pulumi.junipermist.org.DeviceprofileAp;
 * import com.pulumi.junipermist.org.DeviceprofileApArgs;
 * import com.pulumi.junipermist.org.inputs.DeviceprofileApEslConfigArgs;
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
 *         var deviceprofileApOne = new DeviceprofileAp("deviceprofileApOne", DeviceprofileApArgs.builder()
 *             .name("deviceprofile_ap_one")
 *             .orgId(terraformTest.id())
 *             .eslConfig(DeviceprofileApEslConfigArgs.builder()
 *                 .enabled(true)
 *                 .host("1.2.3.4")
 *                 .type("native")
 *                 .build())
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
 * Using `pulumi import`, import `mist_org_deviceprofile_ap` with:
 * 
 * Device Profile can be imported by specifying the org_id and the deviceprofile_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/deviceprofileAp:DeviceprofileAp deviceprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/deviceprofileAp:DeviceprofileAp")
public class DeviceprofileAp extends com.pulumi.resources.CustomResource {
    /**
     * Aeroscout AP settings
     * 
     */
    @Export(name="aeroscout", refs={DeviceprofileApAeroscout.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApAeroscout> aeroscout;

    /**
     * @return Aeroscout AP settings
     * 
     */
    public Output<Optional<DeviceprofileApAeroscout>> aeroscout() {
        return Codegen.optional(this.aeroscout);
    }
    /**
     * BLE AP settings
     * 
     */
    @Export(name="bleConfig", refs={DeviceprofileApBleConfig.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApBleConfig> bleConfig;

    /**
     * @return BLE AP settings
     * 
     */
    public Output<Optional<DeviceprofileApBleConfig>> bleConfig() {
        return Codegen.optional(this.bleConfig);
    }
    /**
     * whether to disable eth1 port
     * 
     */
    @Export(name="disableEth1", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disableEth1;

    /**
     * @return whether to disable eth1 port
     * 
     */
    public Output<Boolean> disableEth1() {
        return this.disableEth1;
    }
    /**
     * whether to disable eth2 port
     * 
     */
    @Export(name="disableEth2", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disableEth2;

    /**
     * @return whether to disable eth2 port
     * 
     */
    public Output<Boolean> disableEth2() {
        return this.disableEth2;
    }
    /**
     * whether to disable eth3 port
     * 
     */
    @Export(name="disableEth3", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disableEth3;

    /**
     * @return whether to disable eth3 port
     * 
     */
    public Output<Boolean> disableEth3() {
        return this.disableEth3;
    }
    /**
     * whether to disable module port
     * 
     */
    @Export(name="disableModule", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disableModule;

    /**
     * @return whether to disable module port
     * 
     */
    public Output<Boolean> disableModule() {
        return this.disableModule;
    }
    @Export(name="eslConfig", refs={DeviceprofileApEslConfig.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApEslConfig> eslConfig;

    public Output<Optional<DeviceprofileApEslConfig>> eslConfig() {
        return Codegen.optional(this.eslConfig);
    }
    /**
     * IP AP settings
     * 
     */
    @Export(name="ipConfig", refs={DeviceprofileApIpConfig.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApIpConfig> ipConfig;

    /**
     * @return IP AP settings
     * 
     */
    public Output<Optional<DeviceprofileApIpConfig>> ipConfig() {
        return Codegen.optional(this.ipConfig);
    }
    /**
     * LED AP settings
     * 
     */
    @Export(name="led", refs={DeviceprofileApLed.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApLed> led;

    /**
     * @return LED AP settings
     * 
     */
    public Output<Optional<DeviceprofileApLed>> led() {
        return Codegen.optional(this.led);
    }
    /**
     * Mesh AP settings
     * 
     */
    @Export(name="mesh", refs={DeviceprofileApMesh.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApMesh> mesh;

    /**
     * @return Mesh AP settings
     * 
     */
    public Output<Optional<DeviceprofileApMesh>> mesh() {
        return Codegen.optional(this.mesh);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="ntpServers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ntpServers;

    public Output<Optional<List<String>>> ntpServers() {
        return Codegen.optional(this.ntpServers);
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     * 
     */
    @Export(name="poePassthrough", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> poePassthrough;

    /**
     * @return whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     * 
     */
    public Output<Boolean> poePassthrough() {
        return this.poePassthrough;
    }
    /**
     * power related configs
     * 
     */
    @Export(name="pwrConfig", refs={DeviceprofileApPwrConfig.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApPwrConfig> pwrConfig;

    /**
     * @return power related configs
     * 
     */
    public Output<Optional<DeviceprofileApPwrConfig>> pwrConfig() {
        return Codegen.optional(this.pwrConfig);
    }
    /**
     * Radio AP settings
     * 
     */
    @Export(name="radioConfig", refs={DeviceprofileApRadioConfig.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApRadioConfig> radioConfig;

    /**
     * @return Radio AP settings
     * 
     */
    public Output<Optional<DeviceprofileApRadioConfig>> radioConfig() {
        return Codegen.optional(this.radioConfig);
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> siteId;

    public Output<Optional<String>> siteId() {
        return Codegen.optional(this.siteId);
    }
    /**
     * Device Type. enum: `ap`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Device Type. enum: `ap`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="uplinkPortConfig", refs={DeviceprofileApUplinkPortConfig.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApUplinkPortConfig> uplinkPortConfig;

    public Output<Optional<DeviceprofileApUplinkPortConfig>> uplinkPortConfig() {
        return Codegen.optional(this.uplinkPortConfig);
    }
    /**
     * USB AP settings
     * Note: if native imagotag is enabled, BLE will be disabled automatically
     * Note: legacy, new config moved to ESL Config.
     * 
     */
    @Export(name="usbConfig", refs={DeviceprofileApUsbConfig.class}, tree="[0]")
    private Output</* @Nullable */ DeviceprofileApUsbConfig> usbConfig;

    /**
     * @return USB AP settings
     * Note: if native imagotag is enabled, BLE will be disabled automatically
     * Note: legacy, new config moved to ESL Config.
     * 
     */
    public Output<Optional<DeviceprofileApUsbConfig>> usbConfig() {
        return Codegen.optional(this.usbConfig);
    }
    /**
     * a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    @Export(name="vars", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> vars;

    /**
     * @return a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    public Output<Optional<Map<String,String>>> vars() {
        return Codegen.optional(this.vars);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeviceprofileAp(java.lang.String name) {
        this(name, DeviceprofileApArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeviceprofileAp(java.lang.String name, DeviceprofileApArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceprofileAp(java.lang.String name, DeviceprofileApArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/deviceprofileAp:DeviceprofileAp", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private DeviceprofileAp(java.lang.String name, Output<java.lang.String> id, @Nullable DeviceprofileApState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/deviceprofileAp:DeviceprofileAp", name, state, makeResourceOptions(options, id), false);
    }

    private static DeviceprofileApArgs makeArgs(DeviceprofileApArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? DeviceprofileApArgs.Empty : args;
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
    public static DeviceprofileAp get(java.lang.String name, Output<java.lang.String> id, @Nullable DeviceprofileApState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeviceprofileAp(name, id, state, options);
    }
}
