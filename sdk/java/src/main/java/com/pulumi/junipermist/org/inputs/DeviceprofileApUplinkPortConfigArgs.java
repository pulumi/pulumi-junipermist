// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileApUplinkPortConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileApUplinkPortConfigArgs Empty = new DeviceprofileApUplinkPortConfigArgs();

    /**
     * Whether to do 802.1x against uplink switch. When enabled, AP cert will be used to do EAP-TLS and the Org&#39;s CA Cert has to be provisioned at the switch
     * 
     */
    @Import(name="dot1x")
    private @Nullable Output<Boolean> dot1x;

    /**
     * @return Whether to do 802.1x against uplink switch. When enabled, AP cert will be used to do EAP-TLS and the Org&#39;s CA Cert has to be provisioned at the switch
     * 
     */
    public Optional<Output<Boolean>> dot1x() {
        return Optional.ofNullable(this.dot1x);
    }

    /**
     * By default, WLANs are disabled when uplink is down. In some scenario, like SiteSurvey, one would want the AP to keep sending beacons.
     * 
     */
    @Import(name="keepWlansUpIfDown")
    private @Nullable Output<Boolean> keepWlansUpIfDown;

    /**
     * @return By default, WLANs are disabled when uplink is down. In some scenario, like SiteSurvey, one would want the AP to keep sending beacons.
     * 
     */
    public Optional<Output<Boolean>> keepWlansUpIfDown() {
        return Optional.ofNullable(this.keepWlansUpIfDown);
    }

    private DeviceprofileApUplinkPortConfigArgs() {}

    private DeviceprofileApUplinkPortConfigArgs(DeviceprofileApUplinkPortConfigArgs $) {
        this.dot1x = $.dot1x;
        this.keepWlansUpIfDown = $.keepWlansUpIfDown;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileApUplinkPortConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileApUplinkPortConfigArgs $;

        public Builder() {
            $ = new DeviceprofileApUplinkPortConfigArgs();
        }

        public Builder(DeviceprofileApUplinkPortConfigArgs defaults) {
            $ = new DeviceprofileApUplinkPortConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dot1x Whether to do 802.1x against uplink switch. When enabled, AP cert will be used to do EAP-TLS and the Org&#39;s CA Cert has to be provisioned at the switch
         * 
         * @return builder
         * 
         */
        public Builder dot1x(@Nullable Output<Boolean> dot1x) {
            $.dot1x = dot1x;
            return this;
        }

        /**
         * @param dot1x Whether to do 802.1x against uplink switch. When enabled, AP cert will be used to do EAP-TLS and the Org&#39;s CA Cert has to be provisioned at the switch
         * 
         * @return builder
         * 
         */
        public Builder dot1x(Boolean dot1x) {
            return dot1x(Output.of(dot1x));
        }

        /**
         * @param keepWlansUpIfDown By default, WLANs are disabled when uplink is down. In some scenario, like SiteSurvey, one would want the AP to keep sending beacons.
         * 
         * @return builder
         * 
         */
        public Builder keepWlansUpIfDown(@Nullable Output<Boolean> keepWlansUpIfDown) {
            $.keepWlansUpIfDown = keepWlansUpIfDown;
            return this;
        }

        /**
         * @param keepWlansUpIfDown By default, WLANs are disabled when uplink is down. In some scenario, like SiteSurvey, one would want the AP to keep sending beacons.
         * 
         * @return builder
         * 
         */
        public Builder keepWlansUpIfDown(Boolean keepWlansUpIfDown) {
            return keepWlansUpIfDown(Output.of(keepWlansUpIfDown));
        }

        public DeviceprofileApUplinkPortConfigArgs build() {
            return $;
        }
    }

}
