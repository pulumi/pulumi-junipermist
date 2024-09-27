// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.AlarmtemplateRulesDeliveryArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmtemplateRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlarmtemplateRulesArgs Empty = new AlarmtemplateRulesArgs();

    /**
     * Delivery object to configure the alarm delivery
     * 
     */
    @Import(name="delivery")
    private @Nullable Output<AlarmtemplateRulesDeliveryArgs> delivery;

    /**
     * @return Delivery object to configure the alarm delivery
     * 
     */
    public Optional<Output<AlarmtemplateRulesDeliveryArgs>> delivery() {
        return Optional.ofNullable(this.delivery);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private AlarmtemplateRulesArgs() {}

    private AlarmtemplateRulesArgs(AlarmtemplateRulesArgs $) {
        this.delivery = $.delivery;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmtemplateRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmtemplateRulesArgs $;

        public Builder() {
            $ = new AlarmtemplateRulesArgs();
        }

        public Builder(AlarmtemplateRulesArgs defaults) {
            $ = new AlarmtemplateRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delivery Delivery object to configure the alarm delivery
         * 
         * @return builder
         * 
         */
        public Builder delivery(@Nullable Output<AlarmtemplateRulesDeliveryArgs> delivery) {
            $.delivery = delivery;
            return this;
        }

        /**
         * @param delivery Delivery object to configure the alarm delivery
         * 
         * @return builder
         * 
         */
        public Builder delivery(AlarmtemplateRulesDeliveryArgs delivery) {
            return delivery(Output.of(delivery));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public AlarmtemplateRulesArgs build() {
            return $;
        }
    }

}