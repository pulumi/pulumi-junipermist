// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.device.inputs.ApAeroscoutArgs;
import com.pulumi.junipermist.device.inputs.ApBleConfigArgs;
import com.pulumi.junipermist.device.inputs.ApCentrakArgs;
import com.pulumi.junipermist.device.inputs.ApClientBridgeArgs;
import com.pulumi.junipermist.device.inputs.ApEslConfigArgs;
import com.pulumi.junipermist.device.inputs.ApIpConfigArgs;
import com.pulumi.junipermist.device.inputs.ApLedArgs;
import com.pulumi.junipermist.device.inputs.ApMeshArgs;
import com.pulumi.junipermist.device.inputs.ApPwrConfigArgs;
import com.pulumi.junipermist.device.inputs.ApRadioConfigArgs;
import com.pulumi.junipermist.device.inputs.ApUplinkPortConfigArgs;
import com.pulumi.junipermist.device.inputs.ApUsbConfigArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApState extends com.pulumi.resources.ResourceArgs {

    public static final ApState Empty = new ApState();

    /**
     * Aeroscout AP settings
     * 
     */
    @Import(name="aeroscout")
    private @Nullable Output<ApAeroscoutArgs> aeroscout;

    /**
     * @return Aeroscout AP settings
     * 
     */
    public Optional<Output<ApAeroscoutArgs>> aeroscout() {
        return Optional.ofNullable(this.aeroscout);
    }

    /**
     * BLE AP settings
     * 
     */
    @Import(name="bleConfig")
    private @Nullable Output<ApBleConfigArgs> bleConfig;

    /**
     * @return BLE AP settings
     * 
     */
    public Optional<Output<ApBleConfigArgs>> bleConfig() {
        return Optional.ofNullable(this.bleConfig);
    }

    @Import(name="centrak")
    private @Nullable Output<ApCentrakArgs> centrak;

    public Optional<Output<ApCentrakArgs>> centrak() {
        return Optional.ofNullable(this.centrak);
    }

    @Import(name="clientBridge")
    private @Nullable Output<ApClientBridgeArgs> clientBridge;

    public Optional<Output<ApClientBridgeArgs>> clientBridge() {
        return Optional.ofNullable(this.clientBridge);
    }

    @Import(name="deviceId")
    private @Nullable Output<String> deviceId;

    public Optional<Output<String>> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * whether to disable eth1 port
     * 
     */
    @Import(name="disableEth1")
    private @Nullable Output<Boolean> disableEth1;

    /**
     * @return whether to disable eth1 port
     * 
     */
    public Optional<Output<Boolean>> disableEth1() {
        return Optional.ofNullable(this.disableEth1);
    }

    /**
     * whether to disable eth2 port
     * 
     */
    @Import(name="disableEth2")
    private @Nullable Output<Boolean> disableEth2;

    /**
     * @return whether to disable eth2 port
     * 
     */
    public Optional<Output<Boolean>> disableEth2() {
        return Optional.ofNullable(this.disableEth2);
    }

    /**
     * whether to disable eth3 port
     * 
     */
    @Import(name="disableEth3")
    private @Nullable Output<Boolean> disableEth3;

    /**
     * @return whether to disable eth3 port
     * 
     */
    public Optional<Output<Boolean>> disableEth3() {
        return Optional.ofNullable(this.disableEth3);
    }

    /**
     * whether to disable module port
     * 
     */
    @Import(name="disableModule")
    private @Nullable Output<Boolean> disableModule;

    /**
     * @return whether to disable module port
     * 
     */
    public Optional<Output<Boolean>> disableModule() {
        return Optional.ofNullable(this.disableModule);
    }

    @Import(name="eslConfig")
    private @Nullable Output<ApEslConfigArgs> eslConfig;

    public Optional<Output<ApEslConfigArgs>> eslConfig() {
        return Optional.ofNullable(this.eslConfig);
    }

    /**
     * height, in meters, optional
     * 
     */
    @Import(name="height")
    private @Nullable Output<Double> height;

    /**
     * @return height, in meters, optional
     * 
     */
    public Optional<Output<Double>> height() {
        return Optional.ofNullable(this.height);
    }

    @Import(name="image1Url")
    private @Nullable Output<String> image1Url;

    public Optional<Output<String>> image1Url() {
        return Optional.ofNullable(this.image1Url);
    }

    @Import(name="image2Url")
    private @Nullable Output<String> image2Url;

    public Optional<Output<String>> image2Url() {
        return Optional.ofNullable(this.image2Url);
    }

    @Import(name="image3Url")
    private @Nullable Output<String> image3Url;

    public Optional<Output<String>> image3Url() {
        return Optional.ofNullable(this.image3Url);
    }

    /**
     * IP AP settings
     * 
     */
    @Import(name="ipConfig")
    private @Nullable Output<ApIpConfigArgs> ipConfig;

    /**
     * @return IP AP settings
     * 
     */
    public Optional<Output<ApIpConfigArgs>> ipConfig() {
        return Optional.ofNullable(this.ipConfig);
    }

    /**
     * LED AP settings
     * 
     */
    @Import(name="led")
    private @Nullable Output<ApLedArgs> led;

    /**
     * @return LED AP settings
     * 
     */
    public Optional<Output<ApLedArgs>> led() {
        return Optional.ofNullable(this.led);
    }

    /**
     * whether this map is considered locked down
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return whether this map is considered locked down
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * device MAC address
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return device MAC address
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    /**
     * map where the device belongs to
     * 
     */
    @Import(name="mapId")
    private @Nullable Output<String> mapId;

    /**
     * @return map where the device belongs to
     * 
     */
    public Optional<Output<String>> mapId() {
        return Optional.ofNullable(this.mapId);
    }

    /**
     * Mesh AP settings
     * 
     */
    @Import(name="mesh")
    private @Nullable Output<ApMeshArgs> mesh;

    /**
     * @return Mesh AP settings
     * 
     */
    public Optional<Output<ApMeshArgs>> mesh() {
        return Optional.ofNullable(this.mesh);
    }

    /**
     * device Model
     * 
     */
    @Import(name="model")
    private @Nullable Output<String> model;

    /**
     * @return device Model
     * 
     */
    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * any notes about this AP
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return any notes about this AP
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    @Import(name="ntpServers")
    private @Nullable Output<List<String>> ntpServers;

    public Optional<Output<List<String>>> ntpServers() {
        return Optional.ofNullable(this.ntpServers);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * orientation, 0-359, in degrees, up is 0, right is 90.
     * 
     */
    @Import(name="orientation")
    private @Nullable Output<Integer> orientation;

    /**
     * @return orientation, 0-359, in degrees, up is 0, right is 90.
     * 
     */
    public Optional<Output<Integer>> orientation() {
        return Optional.ofNullable(this.orientation);
    }

    /**
     * whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     * 
     */
    @Import(name="poePassthrough")
    private @Nullable Output<Boolean> poePassthrough;

    /**
     * @return whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
     * 
     */
    public Optional<Output<Boolean>> poePassthrough() {
        return Optional.ofNullable(this.poePassthrough);
    }

    /**
     * power related configs
     * 
     */
    @Import(name="pwrConfig")
    private @Nullable Output<ApPwrConfigArgs> pwrConfig;

    /**
     * @return power related configs
     * 
     */
    public Optional<Output<ApPwrConfigArgs>> pwrConfig() {
        return Optional.ofNullable(this.pwrConfig);
    }

    /**
     * Radio AP settings
     * 
     */
    @Import(name="radioConfig")
    private @Nullable Output<ApRadioConfigArgs> radioConfig;

    /**
     * @return Radio AP settings
     * 
     */
    public Optional<Output<ApRadioConfigArgs>> radioConfig() {
        return Optional.ofNullable(this.radioConfig);
    }

    /**
     * device Serial
     * 
     */
    @Import(name="serial")
    private @Nullable Output<String> serial;

    /**
     * @return device Serial
     * 
     */
    public Optional<Output<String>> serial() {
        return Optional.ofNullable(this.serial);
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * Device Type. enum: `ap`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Device Type. enum: `ap`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="uplinkPortConfig")
    private @Nullable Output<ApUplinkPortConfigArgs> uplinkPortConfig;

    public Optional<Output<ApUplinkPortConfigArgs>> uplinkPortConfig() {
        return Optional.ofNullable(this.uplinkPortConfig);
    }

    /**
     * USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
     * to ESL Config.
     * 
     */
    @Import(name="usbConfig")
    private @Nullable Output<ApUsbConfigArgs> usbConfig;

    /**
     * @return USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
     * to ESL Config.
     * 
     */
    public Optional<Output<ApUsbConfigArgs>> usbConfig() {
        return Optional.ofNullable(this.usbConfig);
    }

    /**
     * a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    @Import(name="vars")
    private @Nullable Output<Map<String,String>> vars;

    /**
     * @return a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
     * 
     */
    public Optional<Output<Map<String,String>>> vars() {
        return Optional.ofNullable(this.vars);
    }

    /**
     * x in pixel
     * 
     */
    @Import(name="x")
    private @Nullable Output<Double> x;

    /**
     * @return x in pixel
     * 
     */
    public Optional<Output<Double>> x() {
        return Optional.ofNullable(this.x);
    }

    /**
     * y in pixel
     * 
     */
    @Import(name="y")
    private @Nullable Output<Double> y;

    /**
     * @return y in pixel
     * 
     */
    public Optional<Output<Double>> y() {
        return Optional.ofNullable(this.y);
    }

    private ApState() {}

    private ApState(ApState $) {
        this.aeroscout = $.aeroscout;
        this.bleConfig = $.bleConfig;
        this.centrak = $.centrak;
        this.clientBridge = $.clientBridge;
        this.deviceId = $.deviceId;
        this.disableEth1 = $.disableEth1;
        this.disableEth2 = $.disableEth2;
        this.disableEth3 = $.disableEth3;
        this.disableModule = $.disableModule;
        this.eslConfig = $.eslConfig;
        this.height = $.height;
        this.image1Url = $.image1Url;
        this.image2Url = $.image2Url;
        this.image3Url = $.image3Url;
        this.ipConfig = $.ipConfig;
        this.led = $.led;
        this.locked = $.locked;
        this.mac = $.mac;
        this.mapId = $.mapId;
        this.mesh = $.mesh;
        this.model = $.model;
        this.name = $.name;
        this.notes = $.notes;
        this.ntpServers = $.ntpServers;
        this.orgId = $.orgId;
        this.orientation = $.orientation;
        this.poePassthrough = $.poePassthrough;
        this.pwrConfig = $.pwrConfig;
        this.radioConfig = $.radioConfig;
        this.serial = $.serial;
        this.siteId = $.siteId;
        this.type = $.type;
        this.uplinkPortConfig = $.uplinkPortConfig;
        this.usbConfig = $.usbConfig;
        this.vars = $.vars;
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApState $;

        public Builder() {
            $ = new ApState();
        }

        public Builder(ApState defaults) {
            $ = new ApState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aeroscout Aeroscout AP settings
         * 
         * @return builder
         * 
         */
        public Builder aeroscout(@Nullable Output<ApAeroscoutArgs> aeroscout) {
            $.aeroscout = aeroscout;
            return this;
        }

        /**
         * @param aeroscout Aeroscout AP settings
         * 
         * @return builder
         * 
         */
        public Builder aeroscout(ApAeroscoutArgs aeroscout) {
            return aeroscout(Output.of(aeroscout));
        }

        /**
         * @param bleConfig BLE AP settings
         * 
         * @return builder
         * 
         */
        public Builder bleConfig(@Nullable Output<ApBleConfigArgs> bleConfig) {
            $.bleConfig = bleConfig;
            return this;
        }

        /**
         * @param bleConfig BLE AP settings
         * 
         * @return builder
         * 
         */
        public Builder bleConfig(ApBleConfigArgs bleConfig) {
            return bleConfig(Output.of(bleConfig));
        }

        public Builder centrak(@Nullable Output<ApCentrakArgs> centrak) {
            $.centrak = centrak;
            return this;
        }

        public Builder centrak(ApCentrakArgs centrak) {
            return centrak(Output.of(centrak));
        }

        public Builder clientBridge(@Nullable Output<ApClientBridgeArgs> clientBridge) {
            $.clientBridge = clientBridge;
            return this;
        }

        public Builder clientBridge(ApClientBridgeArgs clientBridge) {
            return clientBridge(Output.of(clientBridge));
        }

        public Builder deviceId(@Nullable Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        /**
         * @param disableEth1 whether to disable eth1 port
         * 
         * @return builder
         * 
         */
        public Builder disableEth1(@Nullable Output<Boolean> disableEth1) {
            $.disableEth1 = disableEth1;
            return this;
        }

        /**
         * @param disableEth1 whether to disable eth1 port
         * 
         * @return builder
         * 
         */
        public Builder disableEth1(Boolean disableEth1) {
            return disableEth1(Output.of(disableEth1));
        }

        /**
         * @param disableEth2 whether to disable eth2 port
         * 
         * @return builder
         * 
         */
        public Builder disableEth2(@Nullable Output<Boolean> disableEth2) {
            $.disableEth2 = disableEth2;
            return this;
        }

        /**
         * @param disableEth2 whether to disable eth2 port
         * 
         * @return builder
         * 
         */
        public Builder disableEth2(Boolean disableEth2) {
            return disableEth2(Output.of(disableEth2));
        }

        /**
         * @param disableEth3 whether to disable eth3 port
         * 
         * @return builder
         * 
         */
        public Builder disableEth3(@Nullable Output<Boolean> disableEth3) {
            $.disableEth3 = disableEth3;
            return this;
        }

        /**
         * @param disableEth3 whether to disable eth3 port
         * 
         * @return builder
         * 
         */
        public Builder disableEth3(Boolean disableEth3) {
            return disableEth3(Output.of(disableEth3));
        }

        /**
         * @param disableModule whether to disable module port
         * 
         * @return builder
         * 
         */
        public Builder disableModule(@Nullable Output<Boolean> disableModule) {
            $.disableModule = disableModule;
            return this;
        }

        /**
         * @param disableModule whether to disable module port
         * 
         * @return builder
         * 
         */
        public Builder disableModule(Boolean disableModule) {
            return disableModule(Output.of(disableModule));
        }

        public Builder eslConfig(@Nullable Output<ApEslConfigArgs> eslConfig) {
            $.eslConfig = eslConfig;
            return this;
        }

        public Builder eslConfig(ApEslConfigArgs eslConfig) {
            return eslConfig(Output.of(eslConfig));
        }

        /**
         * @param height height, in meters, optional
         * 
         * @return builder
         * 
         */
        public Builder height(@Nullable Output<Double> height) {
            $.height = height;
            return this;
        }

        /**
         * @param height height, in meters, optional
         * 
         * @return builder
         * 
         */
        public Builder height(Double height) {
            return height(Output.of(height));
        }

        public Builder image1Url(@Nullable Output<String> image1Url) {
            $.image1Url = image1Url;
            return this;
        }

        public Builder image1Url(String image1Url) {
            return image1Url(Output.of(image1Url));
        }

        public Builder image2Url(@Nullable Output<String> image2Url) {
            $.image2Url = image2Url;
            return this;
        }

        public Builder image2Url(String image2Url) {
            return image2Url(Output.of(image2Url));
        }

        public Builder image3Url(@Nullable Output<String> image3Url) {
            $.image3Url = image3Url;
            return this;
        }

        public Builder image3Url(String image3Url) {
            return image3Url(Output.of(image3Url));
        }

        /**
         * @param ipConfig IP AP settings
         * 
         * @return builder
         * 
         */
        public Builder ipConfig(@Nullable Output<ApIpConfigArgs> ipConfig) {
            $.ipConfig = ipConfig;
            return this;
        }

        /**
         * @param ipConfig IP AP settings
         * 
         * @return builder
         * 
         */
        public Builder ipConfig(ApIpConfigArgs ipConfig) {
            return ipConfig(Output.of(ipConfig));
        }

        /**
         * @param led LED AP settings
         * 
         * @return builder
         * 
         */
        public Builder led(@Nullable Output<ApLedArgs> led) {
            $.led = led;
            return this;
        }

        /**
         * @param led LED AP settings
         * 
         * @return builder
         * 
         */
        public Builder led(ApLedArgs led) {
            return led(Output.of(led));
        }

        /**
         * @param locked whether this map is considered locked down
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked whether this map is considered locked down
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        /**
         * @param mac device MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac device MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        /**
         * @param mapId map where the device belongs to
         * 
         * @return builder
         * 
         */
        public Builder mapId(@Nullable Output<String> mapId) {
            $.mapId = mapId;
            return this;
        }

        /**
         * @param mapId map where the device belongs to
         * 
         * @return builder
         * 
         */
        public Builder mapId(String mapId) {
            return mapId(Output.of(mapId));
        }

        /**
         * @param mesh Mesh AP settings
         * 
         * @return builder
         * 
         */
        public Builder mesh(@Nullable Output<ApMeshArgs> mesh) {
            $.mesh = mesh;
            return this;
        }

        /**
         * @param mesh Mesh AP settings
         * 
         * @return builder
         * 
         */
        public Builder mesh(ApMeshArgs mesh) {
            return mesh(Output.of(mesh));
        }

        /**
         * @param model device Model
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model device Model
         * 
         * @return builder
         * 
         */
        public Builder model(String model) {
            return model(Output.of(model));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notes any notes about this AP
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes any notes about this AP
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        public Builder ntpServers(@Nullable Output<List<String>> ntpServers) {
            $.ntpServers = ntpServers;
            return this;
        }

        public Builder ntpServers(List<String> ntpServers) {
            return ntpServers(Output.of(ntpServers));
        }

        public Builder ntpServers(String... ntpServers) {
            return ntpServers(List.of(ntpServers));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param orientation orientation, 0-359, in degrees, up is 0, right is 90.
         * 
         * @return builder
         * 
         */
        public Builder orientation(@Nullable Output<Integer> orientation) {
            $.orientation = orientation;
            return this;
        }

        /**
         * @param orientation orientation, 0-359, in degrees, up is 0, right is 90.
         * 
         * @return builder
         * 
         */
        public Builder orientation(Integer orientation) {
            return orientation(Output.of(orientation));
        }

        /**
         * @param poePassthrough whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
         * 
         * @return builder
         * 
         */
        public Builder poePassthrough(@Nullable Output<Boolean> poePassthrough) {
            $.poePassthrough = poePassthrough;
            return this;
        }

        /**
         * @param poePassthrough whether to enable power out through module port (for APH) or eth1 (for APL/BT11)
         * 
         * @return builder
         * 
         */
        public Builder poePassthrough(Boolean poePassthrough) {
            return poePassthrough(Output.of(poePassthrough));
        }

        /**
         * @param pwrConfig power related configs
         * 
         * @return builder
         * 
         */
        public Builder pwrConfig(@Nullable Output<ApPwrConfigArgs> pwrConfig) {
            $.pwrConfig = pwrConfig;
            return this;
        }

        /**
         * @param pwrConfig power related configs
         * 
         * @return builder
         * 
         */
        public Builder pwrConfig(ApPwrConfigArgs pwrConfig) {
            return pwrConfig(Output.of(pwrConfig));
        }

        /**
         * @param radioConfig Radio AP settings
         * 
         * @return builder
         * 
         */
        public Builder radioConfig(@Nullable Output<ApRadioConfigArgs> radioConfig) {
            $.radioConfig = radioConfig;
            return this;
        }

        /**
         * @param radioConfig Radio AP settings
         * 
         * @return builder
         * 
         */
        public Builder radioConfig(ApRadioConfigArgs radioConfig) {
            return radioConfig(Output.of(radioConfig));
        }

        /**
         * @param serial device Serial
         * 
         * @return builder
         * 
         */
        public Builder serial(@Nullable Output<String> serial) {
            $.serial = serial;
            return this;
        }

        /**
         * @param serial device Serial
         * 
         * @return builder
         * 
         */
        public Builder serial(String serial) {
            return serial(Output.of(serial));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param type Device Type. enum: `ap`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Device Type. enum: `ap`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder uplinkPortConfig(@Nullable Output<ApUplinkPortConfigArgs> uplinkPortConfig) {
            $.uplinkPortConfig = uplinkPortConfig;
            return this;
        }

        public Builder uplinkPortConfig(ApUplinkPortConfigArgs uplinkPortConfig) {
            return uplinkPortConfig(Output.of(uplinkPortConfig));
        }

        /**
         * @param usbConfig USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
         * to ESL Config.
         * 
         * @return builder
         * 
         */
        public Builder usbConfig(@Nullable Output<ApUsbConfigArgs> usbConfig) {
            $.usbConfig = usbConfig;
            return this;
        }

        /**
         * @param usbConfig USB AP settings Note: if native imagotag is enabled, BLE will be disabled automatically Note: legacy, new config moved
         * to ESL Config.
         * 
         * @return builder
         * 
         */
        public Builder usbConfig(ApUsbConfigArgs usbConfig) {
            return usbConfig(Output.of(usbConfig));
        }

        /**
         * @param vars a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
         * 
         * @return builder
         * 
         */
        public Builder vars(@Nullable Output<Map<String,String>> vars) {
            $.vars = vars;
            return this;
        }

        /**
         * @param vars a dictionary of name-&gt;value, the vars can then be used in Wlans. This can overwrite those from Site Vars
         * 
         * @return builder
         * 
         */
        public Builder vars(Map<String,String> vars) {
            return vars(Output.of(vars));
        }

        /**
         * @param x x in pixel
         * 
         * @return builder
         * 
         */
        public Builder x(@Nullable Output<Double> x) {
            $.x = x;
            return this;
        }

        /**
         * @param x x in pixel
         * 
         * @return builder
         * 
         */
        public Builder x(Double x) {
            return x(Output.of(x));
        }

        /**
         * @param y y in pixel
         * 
         * @return builder
         * 
         */
        public Builder y(@Nullable Output<Double> y) {
            $.y = y;
            return this;
        }

        /**
         * @param y y in pixel
         * 
         * @return builder
         * 
         */
        public Builder y(Double y) {
            return y(Output.of(y));
        }

        public ApState build() {
            return $;
        }
    }

}
