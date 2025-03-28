// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.SwitchVirtualChassisMember;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchVirtualChassis {
    /**
     * @return List of Virtual Chassis members
     * 
     */
    private @Nullable List<SwitchVirtualChassisMember> members;
    /**
     * @return To configure whether the VC is preprovisioned or nonprovisioned
     * 
     */
    private @Nullable Boolean preprovisioned;

    private SwitchVirtualChassis() {}
    /**
     * @return List of Virtual Chassis members
     * 
     */
    public List<SwitchVirtualChassisMember> members() {
        return this.members == null ? List.of() : this.members;
    }
    /**
     * @return To configure whether the VC is preprovisioned or nonprovisioned
     * 
     */
    public Optional<Boolean> preprovisioned() {
        return Optional.ofNullable(this.preprovisioned);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchVirtualChassis defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<SwitchVirtualChassisMember> members;
        private @Nullable Boolean preprovisioned;
        public Builder() {}
        public Builder(SwitchVirtualChassis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.members = defaults.members;
    	      this.preprovisioned = defaults.preprovisioned;
        }

        @CustomType.Setter
        public Builder members(@Nullable List<SwitchVirtualChassisMember> members) {

            this.members = members;
            return this;
        }
        public Builder members(SwitchVirtualChassisMember... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder preprovisioned(@Nullable Boolean preprovisioned) {

            this.preprovisioned = preprovisioned;
            return this;
        }
        public SwitchVirtualChassis build() {
            final var _resultValue = new SwitchVirtualChassis();
            _resultValue.members = members;
            _resultValue.preprovisioned = preprovisioned;
            return _resultValue;
        }
    }
}
