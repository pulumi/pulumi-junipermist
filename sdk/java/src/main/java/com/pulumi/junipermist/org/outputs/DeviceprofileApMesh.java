// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileApMesh {
    /**
     * @return whether mesh is enabled on this AP
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return mesh group, base AP(s) will only allow remote AP(s) in the same mesh group to join, 1-9, optional
     * 
     */
    private @Nullable Integer group;
    /**
     * @return enum: `base`, `remote`
     * 
     */
    private @Nullable String role;

    private DeviceprofileApMesh() {}
    /**
     * @return whether mesh is enabled on this AP
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return mesh group, base AP(s) will only allow remote AP(s) in the same mesh group to join, 1-9, optional
     * 
     */
    public Optional<Integer> group() {
        return Optional.ofNullable(this.group);
    }
    /**
     * @return enum: `base`, `remote`
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileApMesh defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer group;
        private @Nullable String role;
        public Builder() {}
        public Builder(DeviceprofileApMesh defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.group = defaults.group;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder group(@Nullable Integer group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {

            this.role = role;
            return this;
        }
        public DeviceprofileApMesh build() {
            final var _resultValue = new DeviceprofileApMesh();
            _resultValue.enabled = enabled;
            _resultValue.group = group;
            _resultValue.role = role;
            return _resultValue;
        }
    }
}