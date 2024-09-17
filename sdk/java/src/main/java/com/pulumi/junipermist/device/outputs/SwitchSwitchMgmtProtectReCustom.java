// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchSwitchMgmtProtectReCustom {
    /**
     * @return matched dst port, &#34;0&#34; means any. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    private @Nullable String portRange;
    /**
     * @return enum: `any`, `icmp`, `tcp`, `udp`. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    private @Nullable String protocol;
    private List<String> subnets;

    private SwitchSwitchMgmtProtectReCustom() {}
    /**
     * @return matched dst port, &#34;0&#34; means any. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    public Optional<String> portRange() {
        return Optional.ofNullable(this.portRange);
    }
    /**
     * @return enum: `any`, `icmp`, `tcp`, `udp`. Note: For `protocol`==`any` and  `port_range`==`any`, configure `trusted_hosts` instead
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    public List<String> subnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchSwitchMgmtProtectReCustom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String portRange;
        private @Nullable String protocol;
        private List<String> subnets;
        public Builder() {}
        public Builder(SwitchSwitchMgmtProtectReCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portRange = defaults.portRange;
    	      this.protocol = defaults.protocol;
    	      this.subnets = defaults.subnets;
        }

        @CustomType.Setter
        public Builder portRange(@Nullable String portRange) {

            this.portRange = portRange;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder subnets(List<String> subnets) {
            if (subnets == null) {
              throw new MissingRequiredPropertyException("SwitchSwitchMgmtProtectReCustom", "subnets");
            }
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public SwitchSwitchMgmtProtectReCustom build() {
            final var _resultValue = new SwitchSwitchMgmtProtectReCustom();
            _resultValue.portRange = portRange;
            _resultValue.protocol = protocol;
            _resultValue.subnets = subnets;
            return _resultValue;
        }
    }
}
