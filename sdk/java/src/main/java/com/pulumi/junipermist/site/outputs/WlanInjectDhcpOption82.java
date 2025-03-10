// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanInjectDhcpOption82 {
    /**
     * @return Information to set in the `circuit_id` field of the DHCP Option 82. It is possible to use static string or the following variables (e.g. `{{SSID}}:{{AP_MAC}}`):
     *   * {{AP_MAC}}
     *   * {{AP_MAC_DASHED}}
     *   * {{AP_MODEL}}
     *   * {{AP_NAME}}
     *   * {{SITE_NAME}}
     *   * {{SSID}}
     * 
     */
    private @Nullable String circuitId;
    /**
     * @return Whether to inject option 82 when forwarding DHCP packets
     * 
     */
    private @Nullable Boolean enabled;

    private WlanInjectDhcpOption82() {}
    /**
     * @return Information to set in the `circuit_id` field of the DHCP Option 82. It is possible to use static string or the following variables (e.g. `{{SSID}}:{{AP_MAC}}`):
     *   * {{AP_MAC}}
     *   * {{AP_MAC_DASHED}}
     *   * {{AP_MODEL}}
     *   * {{AP_NAME}}
     *   * {{SITE_NAME}}
     *   * {{SSID}}
     * 
     */
    public Optional<String> circuitId() {
        return Optional.ofNullable(this.circuitId);
    }
    /**
     * @return Whether to inject option 82 when forwarding DHCP packets
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanInjectDhcpOption82 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String circuitId;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(WlanInjectDhcpOption82 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.circuitId = defaults.circuitId;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder circuitId(@Nullable String circuitId) {

            this.circuitId = circuitId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        public WlanInjectDhcpOption82 build() {
            final var _resultValue = new WlanInjectDhcpOption82();
            _resultValue.circuitId = circuitId;
            _resultValue.enabled = enabled;
            return _resultValue;
        }
    }
}
