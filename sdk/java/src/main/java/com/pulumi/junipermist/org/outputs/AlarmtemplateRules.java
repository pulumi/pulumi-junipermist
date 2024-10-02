// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.AlarmtemplateRulesDelivery;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmtemplateRules {
    /**
     * @return Delivery object to configure the alarm delivery
     * 
     */
    private @Nullable AlarmtemplateRulesDelivery delivery;
    private @Nullable Boolean enabled;

    private AlarmtemplateRules() {}
    /**
     * @return Delivery object to configure the alarm delivery
     * 
     */
    public Optional<AlarmtemplateRulesDelivery> delivery() {
        return Optional.ofNullable(this.delivery);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmtemplateRules defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AlarmtemplateRulesDelivery delivery;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(AlarmtemplateRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delivery = defaults.delivery;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder delivery(@Nullable AlarmtemplateRulesDelivery delivery) {

            this.delivery = delivery;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public AlarmtemplateRules build() {
            final var _resultValue = new AlarmtemplateRules();
            _resultValue.delivery = delivery;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}