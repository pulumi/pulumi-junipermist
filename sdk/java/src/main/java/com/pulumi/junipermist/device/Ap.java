// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.device.ApArgs;
import com.pulumi.junipermist.device.inputs.ApState;
import com.pulumi.junipermist.device.outputs.ApAeroscout;
import com.pulumi.junipermist.device.outputs.ApBleConfig;
import com.pulumi.junipermist.device.outputs.ApCentrak;
import com.pulumi.junipermist.device.outputs.ApClientBridge;
import com.pulumi.junipermist.device.outputs.ApEslConfig;
import com.pulumi.junipermist.device.outputs.ApIpConfig;
import com.pulumi.junipermist.device.outputs.ApLed;
import com.pulumi.junipermist.device.outputs.ApMesh;
import com.pulumi.junipermist.device.outputs.ApPwrConfig;
import com.pulumi.junipermist.device.outputs.ApRadioConfig;
import com.pulumi.junipermist.device.outputs.ApUplinkPortConfig;
import com.pulumi.junipermist.device.outputs.ApUsbConfig;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Wireless Access Point configuration.It can be used to define specific configuration at the device level or to override AP Device Profile (`junipermist.org.DeviceprofileAp`).
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
 * import com.pulumi.junipermist.device.Ap;
 * import com.pulumi.junipermist.device.ApArgs;
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
 *         var apOne = new Ap("apOne", ApArgs.builder()
 *             .name("test_ap")
 *             .deviceId(inventory.devices()[0].id())
 *             .siteId(inventory.devices()[0].siteId())
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
 * ```sh
 * $ pulumi import junipermist:device/ap:Ap Using terraform import, import `mist_device_ap` using the `import` command:
 * ```
 * 
 * Gateway cluster can be imported by specifying the site_id and the device_id
 * 
 * ```sh
 * $ pulumi import junipermist:device/ap:Ap ap_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:device/ap:Ap")
public class Ap extends com.pulumi.resources.CustomResource {
    /**
     * Aeroscout AP settings
     * 
     */
    @Export(name="aeroscout", refs={ApAeroscout.class}, tree="[0]")
    private Output</* @Nullable */ ApAeroscout> aeroscout;

    /**
     * @return Aeroscout AP settings
     * 
     */
    public Output<Optional<ApAeroscout>> aeroscout() {
        return Codegen.optional(this.aeroscout);
    }
    /**
     * BLE AP settings
     * 
     */
    @Export(name="bleConfig", refs={ApBleConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApBleConfig> bleConfig;

    /**
     * @return BLE AP settings
     * 
     */
    public Output<Optional<ApBleConfig>> bleConfig() {
        return Codegen.optional(this.bleConfig);
    }
    @Export(name="centrak", refs={ApCentrak.class}, tree="[0]")
    private Output</* @Nullable */ ApCentrak> centrak;

    public Output<Optional<ApCentrak>> centrak() {
        return Codegen.optional(this.centrak);
    }
    @Export(name="clientBridge", refs={ApClientBridge.class}, tree="[0]")
    private Output</* @Nullable */ ApClientBridge> clientBridge;

    public Output<Optional<ApClientBridge>> clientBridge() {
        return Codegen.optional(this.clientBridge);
    }
    @Export(name="deviceId", refs={String.class}, tree="[0]")
    private Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }
    @Export(name="deviceprofileId", refs={String.class}, tree="[0]")
    private Output<String> deviceprofileId;

    public Output<String> deviceprofileId() {
        return this.deviceprofileId;
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
    @Export(name="eslConfig", refs={ApEslConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApEslConfig> eslConfig;

    public Output<Optional<ApEslConfig>> eslConfig() {
        return Codegen.optional(this.eslConfig);
    }
    /**
     * height, in meters, optional
     * 
     */
    @Export(name="height", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> height;

    /**
     * @return height, in meters, optional
     * 
     */
    public Output<Optional<Double>> height() {
        return Codegen.optional(this.height);
    }
    @Export(name="image1Url", refs={String.class}, tree="[0]")
    private Output<String> image1Url;

    public Output<String> image1Url() {
        return this.image1Url;
    }
    @Export(name="image2Url", refs={String.class}, tree="[0]")
    private Output<String> image2Url;

    public Output<String> image2Url() {
        return this.image2Url;
    }
    @Export(name="image3Url", refs={String.class}, tree="[0]")
    private Output<String> image3Url;

    public Output<String> image3Url() {
        return this.image3Url;
    }
    /**
     * IP AP settings
     * 
     */
    @Export(name="ipConfig", refs={ApIpConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApIpConfig> ipConfig;

    /**
     * @return IP AP settings
     * 
     */
    public Output<Optional<ApIpConfig>> ipConfig() {
        return Codegen.optional(this.ipConfig);
    }
    /**
     * LED AP settings
     * 
     */
    @Export(name="led", refs={ApLed.class}, tree="[0]")
    private Output</* @Nullable */ ApLed> led;

    /**
     * @return LED AP settings
     * 
     */
    public Output<Optional<ApLed>> led() {
        return Codegen.optional(this.led);
    }
    /**
     * whether this map is considered locked down
     * 
     */
    @Export(name="locked", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> locked;

    /**
     * @return whether this map is considered locked down
     * 
     */
    public Output<Optional<Boolean>> locked() {
        return Codegen.optional(this.locked);
    }
    /**
     * device MAC address
     * 
     */
    @Export(name="mac", refs={String.class}, tree="[0]")
    private Output<String> mac;

    /**
     * @return device MAC address
     * 
     */
    public Output<String> mac() {
        return this.mac;
    }
    /**
     * map where the device belongs to
     * 
     */
    @Export(name="mapId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mapId;

    /**
     * @return map where the device belongs to
     * 
     */
    public Output<Optional<String>> mapId() {
        return Codegen.optional(this.mapId);
    }
    /**
     * Mesh AP settings
     * 
     */
    @Export(name="mesh", refs={ApMesh.class}, tree="[0]")
    private Output</* @Nullable */ ApMesh> mesh;

    /**
     * @return Mesh AP settings
     * 
     */
    public Output<Optional<ApMesh>> mesh() {
        return Codegen.optional(this.mesh);
    }
    /**
     * device Model
     * 
     */
    @Export(name="model", refs={String.class}, tree="[0]")
    private Output<String> model;

    /**
     * @return device Model
     * 
     */
    public Output<String> model() {
        return this.model;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * any notes about this AP
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> notes;

    /**
     * @return any notes about this AP
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
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
     * orientation, 0-359, in degrees, up is 0, right is 90.
     * 
     */
    @Export(name="orientation", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> orientation;

    /**
     * @return orientation, 0-359, in degrees, up is 0, right is 90.
     * 
     */
    public Output<Optional<Integer>> orientation() {
        return Codegen.optional(this.orientation);
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
    @Export(name="pwrConfig", refs={ApPwrConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApPwrConfig> pwrConfig;

    /**
     * @return power related configs
     * 
     */
    public Output<Optional<ApPwrConfig>> pwrConfig() {
        return Codegen.optional(this.pwrConfig);
    }
    /**
     * Radio AP settings
     * 
     */
    @Export(name="radioConfig", refs={ApRadioConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApRadioConfig> radioConfig;

    /**
     * @return Radio AP settings
     * 
     */
    public Output<Optional<ApRadioConfig>> radioConfig() {
        return Codegen.optional(this.radioConfig);
    }
    /**
     * device Serial
     * 
     */
    @Export(name="serial", refs={String.class}, tree="[0]")
    private Output<String> serial;

    /**
     * @return device Serial
     * 
     */
    public Output<String> serial() {
        return this.serial;
    }
    @Export(name="siteId", refs={String.class}, tree="[0]")
    private Output<String> siteId;

    public Output<String> siteId() {
        return this.siteId;
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
    @Export(name="uplinkPortConfig", refs={ApUplinkPortConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApUplinkPortConfig> uplinkPortConfig;

    public Output<Optional<ApUplinkPortConfig>> uplinkPortConfig() {
        return Codegen.optional(this.uplinkPortConfig);
    }
    /**
     * USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
     * to ESL Config.
     * 
     */
    @Export(name="usbConfig", refs={ApUsbConfig.class}, tree="[0]")
    private Output</* @Nullable */ ApUsbConfig> usbConfig;

    /**
     * @return USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
     * to ESL Config.
     * 
     */
    public Output<Optional<ApUsbConfig>> usbConfig() {
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
     * x in pixel
     * 
     */
    @Export(name="x", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> x;

    /**
     * @return x in pixel
     * 
     */
    public Output<Optional<Double>> x() {
        return Codegen.optional(this.x);
    }
    /**
     * y in pixel
     * 
     */
    @Export(name="y", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> y;

    /**
     * @return y in pixel
     * 
     */
    public Output<Optional<Double>> y() {
        return Codegen.optional(this.y);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ap(java.lang.String name) {
        this(name, ApArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ap(java.lang.String name, ApArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ap(java.lang.String name, ApArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/ap:Ap", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Ap(java.lang.String name, Output<java.lang.String> id, @Nullable ApState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:device/ap:Ap", name, state, makeResourceOptions(options, id), false);
    }

    private static ApArgs makeArgs(ApArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ApArgs.Empty : args;
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
    public static Ap get(java.lang.String name, Output<java.lang.String> id, @Nullable ApState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ap(name, id, state, options);
    }
}
