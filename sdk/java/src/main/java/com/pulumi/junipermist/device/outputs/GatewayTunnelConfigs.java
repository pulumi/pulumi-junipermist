// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsAutoProvision;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsIkeProposal;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsIpsecProposal;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsPrimary;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsProbe;
import com.pulumi.junipermist.device.outputs.GatewayTunnelConfigsSecondary;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewayTunnelConfigs {
    private @Nullable GatewayTunnelConfigsAutoProvision autoProvision;
    /**
     * @return Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    private @Nullable Integer ikeLifetime;
    /**
     * @return Only if `provider`==`custom-ipsec`. enum: `aggressive`, `main`
     * 
     */
    private @Nullable String ikeMode;
    /**
     * @return If `provider`==`custom-ipsec`
     * 
     */
    private @Nullable List<GatewayTunnelConfigsIkeProposal> ikeProposals;
    /**
     * @return Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    private @Nullable Integer ipsecLifetime;
    /**
     * @return Only if  `provider`==`custom-ipsec`
     * 
     */
    private @Nullable List<GatewayTunnelConfigsIpsecProposal> ipsecProposals;
    /**
     * @return Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    private @Nullable String localId;
    /**
     * @return Required if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`. enum: `active-active`, `active-standby`
     * 
     */
    private @Nullable String mode;
    /**
     * @return If `provider`==`custom-ipsec`, networks reachable via this tunnel
     * 
     */
    private @Nullable List<String> networks;
    /**
     * @return Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    private @Nullable GatewayTunnelConfigsPrimary primary;
    /**
     * @return Only if `provider`==`custom-ipsec`
     * 
     */
    private @Nullable GatewayTunnelConfigsProbe probe;
    /**
     * @return Only if `provider`==`custom-ipsec`. enum: `gre`, `ipsec`
     * 
     */
    private @Nullable String protocol;
    /**
     * @return Only if `auto_provision.enabled`==`false`. enum: `custom-ipsec`, `custom-gre`, `jse-ipsec`, `zscaler-gre`, `zscaler-ipsec`
     * 
     */
    private @Nullable String provider;
    /**
     * @return Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    private @Nullable String psk;
    /**
     * @return Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    private @Nullable GatewayTunnelConfigsSecondary secondary;
    /**
     * @return Only if `provider`==`custom-gre` or `provider`==`custom-ipsec`. enum: `1`, `2`
     * 
     */
    private @Nullable String version;

    private GatewayTunnelConfigs() {}
    public Optional<GatewayTunnelConfigsAutoProvision> autoProvision() {
        return Optional.ofNullable(this.autoProvision);
    }
    /**
     * @return Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    public Optional<Integer> ikeLifetime() {
        return Optional.ofNullable(this.ikeLifetime);
    }
    /**
     * @return Only if `provider`==`custom-ipsec`. enum: `aggressive`, `main`
     * 
     */
    public Optional<String> ikeMode() {
        return Optional.ofNullable(this.ikeMode);
    }
    /**
     * @return If `provider`==`custom-ipsec`
     * 
     */
    public List<GatewayTunnelConfigsIkeProposal> ikeProposals() {
        return this.ikeProposals == null ? List.of() : this.ikeProposals;
    }
    /**
     * @return Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    public Optional<Integer> ipsecLifetime() {
        return Optional.ofNullable(this.ipsecLifetime);
    }
    /**
     * @return Only if  `provider`==`custom-ipsec`
     * 
     */
    public List<GatewayTunnelConfigsIpsecProposal> ipsecProposals() {
        return this.ipsecProposals == null ? List.of() : this.ipsecProposals;
    }
    /**
     * @return Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<String> localId() {
        return Optional.ofNullable(this.localId);
    }
    /**
     * @return Required if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`. enum: `active-active`, `active-standby`
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return If `provider`==`custom-ipsec`, networks reachable via this tunnel
     * 
     */
    public List<String> networks() {
        return this.networks == null ? List.of() : this.networks;
    }
    /**
     * @return Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<GatewayTunnelConfigsPrimary> primary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * @return Only if `provider`==`custom-ipsec`
     * 
     */
    public Optional<GatewayTunnelConfigsProbe> probe() {
        return Optional.ofNullable(this.probe);
    }
    /**
     * @return Only if `provider`==`custom-ipsec`. enum: `gre`, `ipsec`
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return Only if `auto_provision.enabled`==`false`. enum: `custom-ipsec`, `custom-gre`, `jse-ipsec`, `zscaler-gre`, `zscaler-ipsec`
     * 
     */
    public Optional<String> provider() {
        return Optional.ofNullable(this.provider);
    }
    /**
     * @return Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<String> psk() {
        return Optional.ofNullable(this.psk);
    }
    /**
     * @return Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<GatewayTunnelConfigsSecondary> secondary() {
        return Optional.ofNullable(this.secondary);
    }
    /**
     * @return Only if `provider`==`custom-gre` or `provider`==`custom-ipsec`. enum: `1`, `2`
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayTunnelConfigs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GatewayTunnelConfigsAutoProvision autoProvision;
        private @Nullable Integer ikeLifetime;
        private @Nullable String ikeMode;
        private @Nullable List<GatewayTunnelConfigsIkeProposal> ikeProposals;
        private @Nullable Integer ipsecLifetime;
        private @Nullable List<GatewayTunnelConfigsIpsecProposal> ipsecProposals;
        private @Nullable String localId;
        private @Nullable String mode;
        private @Nullable List<String> networks;
        private @Nullable GatewayTunnelConfigsPrimary primary;
        private @Nullable GatewayTunnelConfigsProbe probe;
        private @Nullable String protocol;
        private @Nullable String provider;
        private @Nullable String psk;
        private @Nullable GatewayTunnelConfigsSecondary secondary;
        private @Nullable String version;
        public Builder() {}
        public Builder(GatewayTunnelConfigs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvision = defaults.autoProvision;
    	      this.ikeLifetime = defaults.ikeLifetime;
    	      this.ikeMode = defaults.ikeMode;
    	      this.ikeProposals = defaults.ikeProposals;
    	      this.ipsecLifetime = defaults.ipsecLifetime;
    	      this.ipsecProposals = defaults.ipsecProposals;
    	      this.localId = defaults.localId;
    	      this.mode = defaults.mode;
    	      this.networks = defaults.networks;
    	      this.primary = defaults.primary;
    	      this.probe = defaults.probe;
    	      this.protocol = defaults.protocol;
    	      this.provider = defaults.provider;
    	      this.psk = defaults.psk;
    	      this.secondary = defaults.secondary;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder autoProvision(@Nullable GatewayTunnelConfigsAutoProvision autoProvision) {

            this.autoProvision = autoProvision;
            return this;
        }
        @CustomType.Setter
        public Builder ikeLifetime(@Nullable Integer ikeLifetime) {

            this.ikeLifetime = ikeLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder ikeMode(@Nullable String ikeMode) {

            this.ikeMode = ikeMode;
            return this;
        }
        @CustomType.Setter
        public Builder ikeProposals(@Nullable List<GatewayTunnelConfigsIkeProposal> ikeProposals) {

            this.ikeProposals = ikeProposals;
            return this;
        }
        public Builder ikeProposals(GatewayTunnelConfigsIkeProposal... ikeProposals) {
            return ikeProposals(List.of(ikeProposals));
        }
        @CustomType.Setter
        public Builder ipsecLifetime(@Nullable Integer ipsecLifetime) {

            this.ipsecLifetime = ipsecLifetime;
            return this;
        }
        @CustomType.Setter
        public Builder ipsecProposals(@Nullable List<GatewayTunnelConfigsIpsecProposal> ipsecProposals) {

            this.ipsecProposals = ipsecProposals;
            return this;
        }
        public Builder ipsecProposals(GatewayTunnelConfigsIpsecProposal... ipsecProposals) {
            return ipsecProposals(List.of(ipsecProposals));
        }
        @CustomType.Setter
        public Builder localId(@Nullable String localId) {

            this.localId = localId;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable String mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder networks(@Nullable List<String> networks) {

            this.networks = networks;
            return this;
        }
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder primary(@Nullable GatewayTunnelConfigsPrimary primary) {

            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder probe(@Nullable GatewayTunnelConfigsProbe probe) {

            this.probe = probe;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder provider(@Nullable String provider) {

            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder psk(@Nullable String psk) {

            this.psk = psk;
            return this;
        }
        @CustomType.Setter
        public Builder secondary(@Nullable GatewayTunnelConfigsSecondary secondary) {

            this.secondary = secondary;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public GatewayTunnelConfigs build() {
            final var _resultValue = new GatewayTunnelConfigs();
            _resultValue.autoProvision = autoProvision;
            _resultValue.ikeLifetime = ikeLifetime;
            _resultValue.ikeMode = ikeMode;
            _resultValue.ikeProposals = ikeProposals;
            _resultValue.ipsecLifetime = ipsecLifetime;
            _resultValue.ipsecProposals = ipsecProposals;
            _resultValue.localId = localId;
            _resultValue.mode = mode;
            _resultValue.networks = networks;
            _resultValue.primary = primary;
            _resultValue.probe = probe;
            _resultValue.protocol = protocol;
            _resultValue.provider = provider;
            _resultValue.psk = psk;
            _resultValue.secondary = secondary;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
