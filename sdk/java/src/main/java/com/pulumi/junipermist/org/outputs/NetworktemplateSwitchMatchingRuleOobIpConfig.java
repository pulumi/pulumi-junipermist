// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSwitchMatchingRuleOobIpConfig {
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    private @Nullable String type;
    /**
     * @return f supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    private @Nullable Boolean useMgmtVrf;
    /**
     * @return for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
     * 
     */
    private @Nullable Boolean useMgmtVrfForHostOut;

    private NetworktemplateSwitchMatchingRuleOobIpConfig() {}
    /**
     * @return enum: `dhcp`, `static`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return f supported on the platform. If enabled, DNS will be using this routing-instance, too
     * 
     */
    public Optional<Boolean> useMgmtVrf() {
        return Optional.ofNullable(this.useMgmtVrf);
    }
    /**
     * @return for host-out traffic (NTP/TACPLUS/RADIUS/SYSLOG/SNMP), if alternative source network/ip is desired
     * 
     */
    public Optional<Boolean> useMgmtVrfForHostOut() {
        return Optional.ofNullable(this.useMgmtVrfForHostOut);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSwitchMatchingRuleOobIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        private @Nullable Boolean useMgmtVrf;
        private @Nullable Boolean useMgmtVrfForHostOut;
        public Builder() {}
        public Builder(NetworktemplateSwitchMatchingRuleOobIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.useMgmtVrf = defaults.useMgmtVrf;
    	      this.useMgmtVrfForHostOut = defaults.useMgmtVrfForHostOut;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder useMgmtVrf(@Nullable Boolean useMgmtVrf) {

            this.useMgmtVrf = useMgmtVrf;
            return this;
        }
        @CustomType.Setter
        public Builder useMgmtVrfForHostOut(@Nullable Boolean useMgmtVrfForHostOut) {

            this.useMgmtVrfForHostOut = useMgmtVrfForHostOut;
            return this;
        }
        public NetworktemplateSwitchMatchingRuleOobIpConfig build() {
            final var _resultValue = new NetworktemplateSwitchMatchingRuleOobIpConfig();
            _resultValue.type = type;
            _resultValue.useMgmtVrf = useMgmtVrf;
            _resultValue.useMgmtVrfForHostOut = useMgmtVrfForHostOut;
            return _resultValue;
        }
    }
}
