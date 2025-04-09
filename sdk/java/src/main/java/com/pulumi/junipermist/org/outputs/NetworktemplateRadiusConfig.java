// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.NetworktemplateRadiusConfigAcctServer;
import com.pulumi.junipermist.org.outputs.NetworktemplateRadiusConfigAuthServer;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateRadiusConfig {
    private @Nullable Boolean acctImmediateUpdate;
    /**
     * @return How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
     * 
     */
    private @Nullable Integer acctInterimInterval;
    private @Nullable List<NetworktemplateRadiusConfigAcctServer> acctServers;
    /**
     * @return enum: `ordered`, `unordered`
     * 
     */
    private @Nullable String authServerSelection;
    private @Nullable List<NetworktemplateRadiusConfigAuthServer> authServers;
    /**
     * @return Radius auth session retries
     * 
     */
    private @Nullable Integer authServersRetries;
    /**
     * @return Radius auth session timeout
     * 
     */
    private @Nullable Integer authServersTimeout;
    private @Nullable Boolean coaEnabled;
    private @Nullable String coaPort;
    private @Nullable Boolean fastDot1xTimers;
    /**
     * @return Use `network`or `source_ip`. Which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
     * 
     */
    private @Nullable String network;
    /**
     * @return Use `network`or `source_ip`
     * 
     */
    private @Nullable String sourceIp;

    private NetworktemplateRadiusConfig() {}
    public Optional<Boolean> acctImmediateUpdate() {
        return Optional.ofNullable(this.acctImmediateUpdate);
    }
    /**
     * @return How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
     * 
     */
    public Optional<Integer> acctInterimInterval() {
        return Optional.ofNullable(this.acctInterimInterval);
    }
    public List<NetworktemplateRadiusConfigAcctServer> acctServers() {
        return this.acctServers == null ? List.of() : this.acctServers;
    }
    /**
     * @return enum: `ordered`, `unordered`
     * 
     */
    public Optional<String> authServerSelection() {
        return Optional.ofNullable(this.authServerSelection);
    }
    public List<NetworktemplateRadiusConfigAuthServer> authServers() {
        return this.authServers == null ? List.of() : this.authServers;
    }
    /**
     * @return Radius auth session retries
     * 
     */
    public Optional<Integer> authServersRetries() {
        return Optional.ofNullable(this.authServersRetries);
    }
    /**
     * @return Radius auth session timeout
     * 
     */
    public Optional<Integer> authServersTimeout() {
        return Optional.ofNullable(this.authServersTimeout);
    }
    public Optional<Boolean> coaEnabled() {
        return Optional.ofNullable(this.coaEnabled);
    }
    public Optional<String> coaPort() {
        return Optional.ofNullable(this.coaPort);
    }
    public Optional<Boolean> fastDot1xTimers() {
        return Optional.ofNullable(this.fastDot1xTimers);
    }
    /**
     * @return Use `network`or `source_ip`. Which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return Use `network`or `source_ip`
     * 
     */
    public Optional<String> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateRadiusConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean acctImmediateUpdate;
        private @Nullable Integer acctInterimInterval;
        private @Nullable List<NetworktemplateRadiusConfigAcctServer> acctServers;
        private @Nullable String authServerSelection;
        private @Nullable List<NetworktemplateRadiusConfigAuthServer> authServers;
        private @Nullable Integer authServersRetries;
        private @Nullable Integer authServersTimeout;
        private @Nullable Boolean coaEnabled;
        private @Nullable String coaPort;
        private @Nullable Boolean fastDot1xTimers;
        private @Nullable String network;
        private @Nullable String sourceIp;
        public Builder() {}
        public Builder(NetworktemplateRadiusConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acctImmediateUpdate = defaults.acctImmediateUpdate;
    	      this.acctInterimInterval = defaults.acctInterimInterval;
    	      this.acctServers = defaults.acctServers;
    	      this.authServerSelection = defaults.authServerSelection;
    	      this.authServers = defaults.authServers;
    	      this.authServersRetries = defaults.authServersRetries;
    	      this.authServersTimeout = defaults.authServersTimeout;
    	      this.coaEnabled = defaults.coaEnabled;
    	      this.coaPort = defaults.coaPort;
    	      this.fastDot1xTimers = defaults.fastDot1xTimers;
    	      this.network = defaults.network;
    	      this.sourceIp = defaults.sourceIp;
        }

        @CustomType.Setter
        public Builder acctImmediateUpdate(@Nullable Boolean acctImmediateUpdate) {

            this.acctImmediateUpdate = acctImmediateUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder acctInterimInterval(@Nullable Integer acctInterimInterval) {

            this.acctInterimInterval = acctInterimInterval;
            return this;
        }
        @CustomType.Setter
        public Builder acctServers(@Nullable List<NetworktemplateRadiusConfigAcctServer> acctServers) {

            this.acctServers = acctServers;
            return this;
        }
        public Builder acctServers(NetworktemplateRadiusConfigAcctServer... acctServers) {
            return acctServers(List.of(acctServers));
        }
        @CustomType.Setter
        public Builder authServerSelection(@Nullable String authServerSelection) {

            this.authServerSelection = authServerSelection;
            return this;
        }
        @CustomType.Setter
        public Builder authServers(@Nullable List<NetworktemplateRadiusConfigAuthServer> authServers) {

            this.authServers = authServers;
            return this;
        }
        public Builder authServers(NetworktemplateRadiusConfigAuthServer... authServers) {
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
        public Builder coaPort(@Nullable String coaPort) {

            this.coaPort = coaPort;
            return this;
        }
        @CustomType.Setter
        public Builder fastDot1xTimers(@Nullable Boolean fastDot1xTimers) {

            this.fastDot1xTimers = fastDot1xTimers;
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
        public NetworktemplateRadiusConfig build() {
            final var _resultValue = new NetworktemplateRadiusConfig();
            _resultValue.acctImmediateUpdate = acctImmediateUpdate;
            _resultValue.acctInterimInterval = acctInterimInterval;
            _resultValue.acctServers = acctServers;
            _resultValue.authServerSelection = authServerSelection;
            _resultValue.authServers = authServers;
            _resultValue.authServersRetries = authServersRetries;
            _resultValue.authServersTimeout = authServersTimeout;
            _resultValue.coaEnabled = coaEnabled;
            _resultValue.coaPort = coaPort;
            _resultValue.fastDot1xTimers = fastDot1xTimers;
            _resultValue.network = network;
            _resultValue.sourceIp = sourceIp;
            return _resultValue;
        }
    }
}
