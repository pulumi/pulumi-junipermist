// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanCiscoCwa {
    /**
     * @return List of hostnames without http(s):// (matched by substring)
     * 
     */
    private @Nullable List<String> allowedHostnames;
    /**
     * @return List of CIDRs
     * 
     */
    private @Nullable List<String> allowedSubnets;
    /**
     * @return List of blocked CIDRs
     * 
     */
    private @Nullable List<String> blockedSubnets;
    private @Nullable Boolean enabled;

    private WlanCiscoCwa() {}
    /**
     * @return List of hostnames without http(s):// (matched by substring)
     * 
     */
    public List<String> allowedHostnames() {
        return this.allowedHostnames == null ? List.of() : this.allowedHostnames;
    }
    /**
     * @return List of CIDRs
     * 
     */
    public List<String> allowedSubnets() {
        return this.allowedSubnets == null ? List.of() : this.allowedSubnets;
    }
    /**
     * @return List of blocked CIDRs
     * 
     */
    public List<String> blockedSubnets() {
        return this.blockedSubnets == null ? List.of() : this.blockedSubnets;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanCiscoCwa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedHostnames;
        private @Nullable List<String> allowedSubnets;
        private @Nullable List<String> blockedSubnets;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(WlanCiscoCwa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHostnames = defaults.allowedHostnames;
    	      this.allowedSubnets = defaults.allowedSubnets;
    	      this.blockedSubnets = defaults.blockedSubnets;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder allowedHostnames(@Nullable List<String> allowedHostnames) {

            this.allowedHostnames = allowedHostnames;
            return this;
        }
        public Builder allowedHostnames(String... allowedHostnames) {
            return allowedHostnames(List.of(allowedHostnames));
        }
        @CustomType.Setter
        public Builder allowedSubnets(@Nullable List<String> allowedSubnets) {

            this.allowedSubnets = allowedSubnets;
            return this;
        }
        public Builder allowedSubnets(String... allowedSubnets) {
            return allowedSubnets(List.of(allowedSubnets));
        }
        @CustomType.Setter
        public Builder blockedSubnets(@Nullable List<String> blockedSubnets) {

            this.blockedSubnets = blockedSubnets;
            return this;
        }
        public Builder blockedSubnets(String... blockedSubnets) {
            return blockedSubnets(List.of(blockedSubnets));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public WlanCiscoCwa build() {
            final var _resultValue = new WlanCiscoCwa();
            _resultValue.allowedHostnames = allowedHostnames;
            _resultValue.allowedSubnets = allowedSubnets;
            _resultValue.blockedSubnets = blockedSubnets;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
