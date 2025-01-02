// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayPortConfigTrafficShapingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayPortConfigTrafficShapingArgs Empty = new DeviceprofileGatewayPortConfigTrafficShapingArgs();

    /**
     * percentages for differet class of traffic: high / medium / low / best-effort. Sum must be equal to 100
     * 
     */
    @Import(name="classPercentages")
    private @Nullable Output<List<Integer>> classPercentages;

    /**
     * @return percentages for differet class of traffic: high / medium / low / best-effort. Sum must be equal to 100
     * 
     */
    public Optional<Output<List<Integer>>> classPercentages() {
        return Optional.ofNullable(this.classPercentages);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Interface Transmit Cap in kbps
     * 
     */
    @Import(name="maxTxKbps")
    private @Nullable Output<Integer> maxTxKbps;

    /**
     * @return Interface Transmit Cap in kbps
     * 
     */
    public Optional<Output<Integer>> maxTxKbps() {
        return Optional.ofNullable(this.maxTxKbps);
    }

    private DeviceprofileGatewayPortConfigTrafficShapingArgs() {}

    private DeviceprofileGatewayPortConfigTrafficShapingArgs(DeviceprofileGatewayPortConfigTrafficShapingArgs $) {
        this.classPercentages = $.classPercentages;
        this.enabled = $.enabled;
        this.maxTxKbps = $.maxTxKbps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayPortConfigTrafficShapingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayPortConfigTrafficShapingArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayPortConfigTrafficShapingArgs();
        }

        public Builder(DeviceprofileGatewayPortConfigTrafficShapingArgs defaults) {
            $ = new DeviceprofileGatewayPortConfigTrafficShapingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classPercentages percentages for differet class of traffic: high / medium / low / best-effort. Sum must be equal to 100
         * 
         * @return builder
         * 
         */
        public Builder classPercentages(@Nullable Output<List<Integer>> classPercentages) {
            $.classPercentages = classPercentages;
            return this;
        }

        /**
         * @param classPercentages percentages for differet class of traffic: high / medium / low / best-effort. Sum must be equal to 100
         * 
         * @return builder
         * 
         */
        public Builder classPercentages(List<Integer> classPercentages) {
            return classPercentages(Output.of(classPercentages));
        }

        /**
         * @param classPercentages percentages for differet class of traffic: high / medium / low / best-effort. Sum must be equal to 100
         * 
         * @return builder
         * 
         */
        public Builder classPercentages(Integer... classPercentages) {
            return classPercentages(List.of(classPercentages));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param maxTxKbps Interface Transmit Cap in kbps
         * 
         * @return builder
         * 
         */
        public Builder maxTxKbps(@Nullable Output<Integer> maxTxKbps) {
            $.maxTxKbps = maxTxKbps;
            return this;
        }

        /**
         * @param maxTxKbps Interface Transmit Cap in kbps
         * 
         * @return builder
         * 
         */
        public Builder maxTxKbps(Integer maxTxKbps) {
            return maxTxKbps(Output.of(maxTxKbps));
        }

        public DeviceprofileGatewayPortConfigTrafficShapingArgs build() {
            return $;
        }
    }

}
