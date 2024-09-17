// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.site.outputs.NetworktemplateSwitchMgmtProtectReCustom;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSwitchMgmtProtectRe {
    /**
     * @return optionally, services we&#39;ll allow. enum: `icmp`, `ssh`
     * 
     */
    private @Nullable List<String> allowedServices;
    private @Nullable List<NetworktemplateSwitchMgmtProtectReCustom> customs;
    /**
     * @return when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default
     *      if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return host/subnets we&#39;ll allow traffic to/from
     * 
     */
    private @Nullable List<String> trustedHosts;

    private NetworktemplateSwitchMgmtProtectRe() {}
    /**
     * @return optionally, services we&#39;ll allow. enum: `icmp`, `ssh`
     * 
     */
    public List<String> allowedServices() {
        return this.allowedServices == null ? List.of() : this.allowedServices;
    }
    public List<NetworktemplateSwitchMgmtProtectReCustom> customs() {
        return this.customs == null ? List.of() : this.customs;
    }
    /**
     * @return when enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default
     *      if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return host/subnets we&#39;ll allow traffic to/from
     * 
     */
    public List<String> trustedHosts() {
        return this.trustedHosts == null ? List.of() : this.trustedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSwitchMgmtProtectRe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedServices;
        private @Nullable List<NetworktemplateSwitchMgmtProtectReCustom> customs;
        private @Nullable Boolean enabled;
        private @Nullable List<String> trustedHosts;
        public Builder() {}
        public Builder(NetworktemplateSwitchMgmtProtectRe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.customs = defaults.customs;
    	      this.enabled = defaults.enabled;
    	      this.trustedHosts = defaults.trustedHosts;
        }

        @CustomType.Setter
        public Builder allowedServices(@Nullable List<String> allowedServices) {

            this.allowedServices = allowedServices;
            return this;
        }
        public Builder allowedServices(String... allowedServices) {
            return allowedServices(List.of(allowedServices));
        }
        @CustomType.Setter
        public Builder customs(@Nullable List<NetworktemplateSwitchMgmtProtectReCustom> customs) {

            this.customs = customs;
            return this;
        }
        public Builder customs(NetworktemplateSwitchMgmtProtectReCustom... customs) {
            return customs(List.of(customs));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder trustedHosts(@Nullable List<String> trustedHosts) {

            this.trustedHosts = trustedHosts;
            return this;
        }
        public Builder trustedHosts(String... trustedHosts) {
            return trustedHosts(List.of(trustedHosts));
        }
        public NetworktemplateSwitchMgmtProtectRe build() {
            final var _resultValue = new NetworktemplateSwitchMgmtProtectRe();
            _resultValue.allowedServices = allowedServices;
            _resultValue.customs = customs;
            _resultValue.enabled = enabled;
            _resultValue.trustedHosts = trustedHosts;
            return _resultValue;
        }
    }
}
