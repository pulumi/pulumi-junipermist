// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.ApPortConfigRadiusConfigAcctServer;
import com.pulumi.junipermist.device.outputs.ApPortConfigRadiusConfigAuthServer;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApPortConfigRadiusConfig {
    /**
     * @return How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
     * 
     */
    private @Nullable Integer acctInterimInterval;
    private @Nullable List<ApPortConfigRadiusConfigAcctServer> acctServers;
    private @Nullable List<ApPortConfigRadiusConfigAuthServer> authServers;
    /**
     * @return radius auth session retries
     * 
     */
    private @Nullable Integer authServersRetries;
    /**
     * @return radius auth session timeout
     * 
     */
    private @Nullable Integer authServersTimeout;
    private @Nullable Boolean coaEnabled;
    private @Nullable Integer coaPort;
    /**
     * @return use `network`or `source_ip`, which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
     * 
     */
    private @Nullable String network;
    /**
     * @return use `network`or `source_ip`
     * 
     */
    private @Nullable String sourceIp;

    private ApPortConfigRadiusConfig() {}
    /**
     * @return How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
     * 
     */
    public Optional<Integer> acctInterimInterval() {
        return Optional.ofNullable(this.acctInterimInterval);
    }
    public List<ApPortConfigRadiusConfigAcctServer> acctServers() {
        return this.acctServers == null ? List.of() : this.acctServers;
    }
    public List<ApPortConfigRadiusConfigAuthServer> authServers() {
        return this.authServers == null ? List.of() : this.authServers;
    }
    /**
     * @return radius auth session retries
     * 
     */
    public Optional<Integer> authServersRetries() {
        return Optional.ofNullable(this.authServersRetries);
    }
    /**
     * @return radius auth session timeout
     * 
     */
    public Optional<Integer> authServersTimeout() {
        return Optional.ofNullable(this.authServersTimeout);
    }
    public Optional<Boolean> coaEnabled() {
        return Optional.ofNullable(this.coaEnabled);
    }
    public Optional<Integer> coaPort() {
        return Optional.ofNullable(this.coaPort);
    }
    /**
     * @return use `network`or `source_ip`, which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return use `network`or `source_ip`
     * 
     */
    public Optional<String> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApPortConfigRadiusConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer acctInterimInterval;
        private @Nullable List<ApPortConfigRadiusConfigAcctServer> acctServers;
        private @Nullable List<ApPortConfigRadiusConfigAuthServer> authServers;
        private @Nullable Integer authServersRetries;
        private @Nullable Integer authServersTimeout;
        private @Nullable Boolean coaEnabled;
        private @Nullable Integer coaPort;
        private @Nullable String network;
        private @Nullable String sourceIp;
        public Builder() {}
        public Builder(ApPortConfigRadiusConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acctInterimInterval = defaults.acctInterimInterval;
    	      this.acctServers = defaults.acctServers;
    	      this.authServers = defaults.authServers;
    	      this.authServersRetries = defaults.authServersRetries;
    	      this.authServersTimeout = defaults.authServersTimeout;
    	      this.coaEnabled = defaults.coaEnabled;
    	      this.coaPort = defaults.coaPort;
    	      this.network = defaults.network;
    	      this.sourceIp = defaults.sourceIp;
        }

        @CustomType.Setter
        public Builder acctInterimInterval(@Nullable Integer acctInterimInterval) {

            this.acctInterimInterval = acctInterimInterval;
            return this;
        }
        @CustomType.Setter
        public Builder acctServers(@Nullable List<ApPortConfigRadiusConfigAcctServer> acctServers) {

            this.acctServers = acctServers;
            return this;
        }
        public Builder acctServers(ApPortConfigRadiusConfigAcctServer... acctServers) {
            return acctServers(List.of(acctServers));
        }
        @CustomType.Setter
        public Builder authServers(@Nullable List<ApPortConfigRadiusConfigAuthServer> authServers) {

            this.authServers = authServers;
            return this;
        }
        public Builder authServers(ApPortConfigRadiusConfigAuthServer... authServers) {
            return authServers(List.of(authServers));
        }
        @CustomType.Setter
        public Builder authServersRetries(@Nullable Integer authServersRetries) {

            this.authServersRetries = authServersRetries;
            return this;
        }
        @CustomType.Setter
        public Builder authServersTimeout(@Nullable Integer authServersTimeout) {

            this.authServersTimeout = authServersTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder coaEnabled(@Nullable Boolean coaEnabled) {

            this.coaEnabled = coaEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder coaPort(@Nullable Integer coaPort) {

            this.coaPort = coaPort;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {

            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder sourceIp(@Nullable String sourceIp) {

            this.sourceIp = sourceIp;
            return this;
        }
        public ApPortConfigRadiusConfig build() {
            final var _resultValue = new ApPortConfigRadiusConfig();
            _resultValue.acctInterimInterval = acctInterimInterval;
            _resultValue.acctServers = acctServers;
            _resultValue.authServers = authServers;
            _resultValue.authServersRetries = authServersRetries;
            _resultValue.authServersTimeout = authServersTimeout;
            _resultValue.coaEnabled = coaEnabled;
            _resultValue.coaPort = coaPort;
            _resultValue.network = network;
            _resultValue.sourceIp = sourceIp;
            return _resultValue;
        }
    }
}
