// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchPortUsagesStormControl {
    /**
     * @return Whether to disable storm control on broadcast traffic
     * 
     */
    private @Nullable Boolean noBroadcast;
    /**
     * @return Whether to disable storm control on multicast traffic
     * 
     */
    private @Nullable Boolean noMulticast;
    /**
     * @return Whether to disable storm control on registered multicast traffic
     * 
     */
    private @Nullable Boolean noRegisteredMulticast;
    /**
     * @return Whether to disable storm control on unknown unicast traffic
     * 
     */
    private @Nullable Boolean noUnknownUnicast;
    /**
     * @return Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
     * 
     */
    private @Nullable Integer percentage;

    private SwitchPortUsagesStormControl() {}
    /**
     * @return Whether to disable storm control on broadcast traffic
     * 
     */
    public Optional<Boolean> noBroadcast() {
        return Optional.ofNullable(this.noBroadcast);
    }
    /**
     * @return Whether to disable storm control on multicast traffic
     * 
     */
    public Optional<Boolean> noMulticast() {
        return Optional.ofNullable(this.noMulticast);
    }
    /**
     * @return Whether to disable storm control on registered multicast traffic
     * 
     */
    public Optional<Boolean> noRegisteredMulticast() {
        return Optional.ofNullable(this.noRegisteredMulticast);
    }
    /**
     * @return Whether to disable storm control on unknown unicast traffic
     * 
     */
    public Optional<Boolean> noUnknownUnicast() {
        return Optional.ofNullable(this.noUnknownUnicast);
    }
    /**
     * @return Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
     * 
     */
    public Optional<Integer> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchPortUsagesStormControl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean noBroadcast;
        private @Nullable Boolean noMulticast;
        private @Nullable Boolean noRegisteredMulticast;
        private @Nullable Boolean noUnknownUnicast;
        private @Nullable Integer percentage;
        public Builder() {}
        public Builder(SwitchPortUsagesStormControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noBroadcast = defaults.noBroadcast;
    	      this.noMulticast = defaults.noMulticast;
    	      this.noRegisteredMulticast = defaults.noRegisteredMulticast;
    	      this.noUnknownUnicast = defaults.noUnknownUnicast;
    	      this.percentage = defaults.percentage;
        }

        @CustomType.Setter
        public Builder noBroadcast(@Nullable Boolean noBroadcast) {

            this.noBroadcast = noBroadcast;
            return this;
        }
        @CustomType.Setter
        public Builder noMulticast(@Nullable Boolean noMulticast) {

            this.noMulticast = noMulticast;
            return this;
        }
        @CustomType.Setter
        public Builder noRegisteredMulticast(@Nullable Boolean noRegisteredMulticast) {

            this.noRegisteredMulticast = noRegisteredMulticast;
            return this;
        }
        @CustomType.Setter
        public Builder noUnknownUnicast(@Nullable Boolean noUnknownUnicast) {

            this.noUnknownUnicast = noUnknownUnicast;
            return this;
        }
        @CustomType.Setter
        public Builder percentage(@Nullable Integer percentage) {

            this.percentage = percentage;
            return this;
        }
        public SwitchPortUsagesStormControl build() {
            final var _resultValue = new SwitchPortUsagesStormControl();
            _resultValue.noBroadcast = noBroadcast;
            _resultValue.noMulticast = noMulticast;
            _resultValue.noRegisteredMulticast = noRegisteredMulticast;
            _resultValue.noUnknownUnicast = noUnknownUnicast;
            _resultValue.percentage = percentage;
            return _resultValue;
        }
    }
}
