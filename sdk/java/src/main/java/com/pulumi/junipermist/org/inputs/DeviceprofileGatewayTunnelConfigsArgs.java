// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsAutoProvisionArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsIkeProposalArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsIpsecProposalArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsPrimaryArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsProbeArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileGatewayTunnelConfigsSecondaryArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayTunnelConfigsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayTunnelConfigsArgs Empty = new DeviceprofileGatewayTunnelConfigsArgs();

    /**
     * Auto Provisioning configuration for the tunne. This takes precedence over the `primary` and `secondary` nodes.
     * 
     */
    @Import(name="autoProvision")
    private @Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionArgs> autoProvision;

    /**
     * @return Auto Provisioning configuration for the tunne. This takes precedence over the `primary` and `secondary` nodes.
     * 
     */
    public Optional<Output<DeviceprofileGatewayTunnelConfigsAutoProvisionArgs>> autoProvision() {
        return Optional.ofNullable(this.autoProvision);
    }

    /**
     * Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    @Import(name="ikeLifetime")
    private @Nullable Output<Integer> ikeLifetime;

    /**
     * @return Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    public Optional<Output<Integer>> ikeLifetime() {
        return Optional.ofNullable(this.ikeLifetime);
    }

    /**
     * Only if `provider`==`custom-ipsec`. enum: `aggressive`, `main`
     * 
     */
    @Import(name="ikeMode")
    private @Nullable Output<String> ikeMode;

    /**
     * @return Only if `provider`==`custom-ipsec`. enum: `aggressive`, `main`
     * 
     */
    public Optional<Output<String>> ikeMode() {
        return Optional.ofNullable(this.ikeMode);
    }

    /**
     * If `provider`==`custom-ipsec`
     * 
     */
    @Import(name="ikeProposals")
    private @Nullable Output<List<DeviceprofileGatewayTunnelConfigsIkeProposalArgs>> ikeProposals;

    /**
     * @return If `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<List<DeviceprofileGatewayTunnelConfigsIkeProposalArgs>>> ikeProposals() {
        return Optional.ofNullable(this.ikeProposals);
    }

    /**
     * Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    @Import(name="ipsecLifetime")
    private @Nullable Output<Integer> ipsecLifetime;

    /**
     * @return Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
     * 
     */
    public Optional<Output<Integer>> ipsecLifetime() {
        return Optional.ofNullable(this.ipsecLifetime);
    }

    /**
     * Only if  `provider`==`custom-ipsec`
     * 
     */
    @Import(name="ipsecProposals")
    private @Nullable Output<List<DeviceprofileGatewayTunnelConfigsIpsecProposalArgs>> ipsecProposals;

    /**
     * @return Only if  `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<List<DeviceprofileGatewayTunnelConfigsIpsecProposalArgs>>> ipsecProposals() {
        return Optional.ofNullable(this.ipsecProposals);
    }

    /**
     * Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    @Import(name="localId")
    private @Nullable Output<String> localId;

    /**
     * @return Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<String>> localId() {
        return Optional.ofNullable(this.localId);
    }

    /**
     * Required if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`. enum: `active-active`, `active-standby`
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return Required if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`. enum: `active-active`, `active-standby`
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * If `provider`==`custom-ipsec` or `provider`==`prisma-ipsec`, networks reachable via this tunnel
     * 
     */
    @Import(name="networks")
    private @Nullable Output<List<String>> networks;

    /**
     * @return If `provider`==`custom-ipsec` or `provider`==`prisma-ipsec`, networks reachable via this tunnel
     * 
     */
    public Optional<Output<List<String>>> networks() {
        return Optional.ofNullable(this.networks);
    }

    /**
     * Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    @Import(name="primary")
    private @Nullable Output<DeviceprofileGatewayTunnelConfigsPrimaryArgs> primary;

    /**
     * @return Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<DeviceprofileGatewayTunnelConfigsPrimaryArgs>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * Only if `provider`==`custom-ipsec`
     * 
     */
    @Import(name="probe")
    private @Nullable Output<DeviceprofileGatewayTunnelConfigsProbeArgs> probe;

    /**
     * @return Only if `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<DeviceprofileGatewayTunnelConfigsProbeArgs>> probe() {
        return Optional.ofNullable(this.probe);
    }

    /**
     * Only if `provider`==`custom-ipsec`. enum: `gre`, `ipsec`
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Only if `provider`==`custom-ipsec`. enum: `gre`, `ipsec`
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Only if `auto_provision.enabled`==`false`. enum: `custom-ipsec`, `custom-gre`, `jse-ipsec`, `prisma-ipsec`, `zscaler-gre`, `zscaler-ipsec`
     * 
     */
    @Import(name="provider")
    private @Nullable Output<String> provider;

    /**
     * @return Only if `auto_provision.enabled`==`false`. enum: `custom-ipsec`, `custom-gre`, `jse-ipsec`, `prisma-ipsec`, `zscaler-gre`, `zscaler-ipsec`
     * 
     */
    public Optional<Output<String>> provider() {
        return Optional.ofNullable(this.provider);
    }

    /**
     * Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    @Import(name="psk")
    private @Nullable Output<String> psk;

    /**
     * @return Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<String>> psk() {
        return Optional.ofNullable(this.psk);
    }

    /**
     * Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    @Import(name="secondary")
    private @Nullable Output<DeviceprofileGatewayTunnelConfigsSecondaryArgs> secondary;

    /**
     * @return Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
     * 
     */
    public Optional<Output<DeviceprofileGatewayTunnelConfigsSecondaryArgs>> secondary() {
        return Optional.ofNullable(this.secondary);
    }

    /**
     * Only if `provider`==`custom-gre` or `provider`==`custom-ipsec`. enum: `1`, `2`
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Only if `provider`==`custom-gre` or `provider`==`custom-ipsec`. enum: `1`, `2`
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private DeviceprofileGatewayTunnelConfigsArgs() {}

    private DeviceprofileGatewayTunnelConfigsArgs(DeviceprofileGatewayTunnelConfigsArgs $) {
        this.autoProvision = $.autoProvision;
        this.ikeLifetime = $.ikeLifetime;
        this.ikeMode = $.ikeMode;
        this.ikeProposals = $.ikeProposals;
        this.ipsecLifetime = $.ipsecLifetime;
        this.ipsecProposals = $.ipsecProposals;
        this.localId = $.localId;
        this.mode = $.mode;
        this.networks = $.networks;
        this.primary = $.primary;
        this.probe = $.probe;
        this.protocol = $.protocol;
        this.provider = $.provider;
        this.psk = $.psk;
        this.secondary = $.secondary;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayTunnelConfigsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayTunnelConfigsArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayTunnelConfigsArgs();
        }

        public Builder(DeviceprofileGatewayTunnelConfigsArgs defaults) {
            $ = new DeviceprofileGatewayTunnelConfigsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoProvision Auto Provisioning configuration for the tunne. This takes precedence over the `primary` and `secondary` nodes.
         * 
         * @return builder
         * 
         */
        public Builder autoProvision(@Nullable Output<DeviceprofileGatewayTunnelConfigsAutoProvisionArgs> autoProvision) {
            $.autoProvision = autoProvision;
            return this;
        }

        /**
         * @param autoProvision Auto Provisioning configuration for the tunne. This takes precedence over the `primary` and `secondary` nodes.
         * 
         * @return builder
         * 
         */
        public Builder autoProvision(DeviceprofileGatewayTunnelConfigsAutoProvisionArgs autoProvision) {
            return autoProvision(Output.of(autoProvision));
        }

        /**
         * @param ikeLifetime Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
         * 
         * @return builder
         * 
         */
        public Builder ikeLifetime(@Nullable Output<Integer> ikeLifetime) {
            $.ikeLifetime = ikeLifetime;
            return this;
        }

        /**
         * @param ikeLifetime Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
         * 
         * @return builder
         * 
         */
        public Builder ikeLifetime(Integer ikeLifetime) {
            return ikeLifetime(Output.of(ikeLifetime));
        }

        /**
         * @param ikeMode Only if `provider`==`custom-ipsec`. enum: `aggressive`, `main`
         * 
         * @return builder
         * 
         */
        public Builder ikeMode(@Nullable Output<String> ikeMode) {
            $.ikeMode = ikeMode;
            return this;
        }

        /**
         * @param ikeMode Only if `provider`==`custom-ipsec`. enum: `aggressive`, `main`
         * 
         * @return builder
         * 
         */
        public Builder ikeMode(String ikeMode) {
            return ikeMode(Output.of(ikeMode));
        }

        /**
         * @param ikeProposals If `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder ikeProposals(@Nullable Output<List<DeviceprofileGatewayTunnelConfigsIkeProposalArgs>> ikeProposals) {
            $.ikeProposals = ikeProposals;
            return this;
        }

        /**
         * @param ikeProposals If `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder ikeProposals(List<DeviceprofileGatewayTunnelConfigsIkeProposalArgs> ikeProposals) {
            return ikeProposals(Output.of(ikeProposals));
        }

        /**
         * @param ikeProposals If `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder ikeProposals(DeviceprofileGatewayTunnelConfigsIkeProposalArgs... ikeProposals) {
            return ikeProposals(List.of(ikeProposals));
        }

        /**
         * @param ipsecLifetime Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
         * 
         * @return builder
         * 
         */
        public Builder ipsecLifetime(@Nullable Output<Integer> ipsecLifetime) {
            $.ipsecLifetime = ipsecLifetime;
            return this;
        }

        /**
         * @param ipsecLifetime Only if `provider`==`custom-ipsec`. Must be between 180 and 86400
         * 
         * @return builder
         * 
         */
        public Builder ipsecLifetime(Integer ipsecLifetime) {
            return ipsecLifetime(Output.of(ipsecLifetime));
        }

        /**
         * @param ipsecProposals Only if  `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder ipsecProposals(@Nullable Output<List<DeviceprofileGatewayTunnelConfigsIpsecProposalArgs>> ipsecProposals) {
            $.ipsecProposals = ipsecProposals;
            return this;
        }

        /**
         * @param ipsecProposals Only if  `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder ipsecProposals(List<DeviceprofileGatewayTunnelConfigsIpsecProposalArgs> ipsecProposals) {
            return ipsecProposals(Output.of(ipsecProposals));
        }

        /**
         * @param ipsecProposals Only if  `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder ipsecProposals(DeviceprofileGatewayTunnelConfigsIpsecProposalArgs... ipsecProposals) {
            return ipsecProposals(List.of(ipsecProposals));
        }

        /**
         * @param localId Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder localId(@Nullable Output<String> localId) {
            $.localId = localId;
            return this;
        }

        /**
         * @param localId Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder localId(String localId) {
            return localId(Output.of(localId));
        }

        /**
         * @param mode Required if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`. enum: `active-active`, `active-standby`
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Required if `provider`==`zscaler-gre`, `provider`==`jse-ipsec`. enum: `active-active`, `active-standby`
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param networks If `provider`==`custom-ipsec` or `provider`==`prisma-ipsec`, networks reachable via this tunnel
         * 
         * @return builder
         * 
         */
        public Builder networks(@Nullable Output<List<String>> networks) {
            $.networks = networks;
            return this;
        }

        /**
         * @param networks If `provider`==`custom-ipsec` or `provider`==`prisma-ipsec`, networks reachable via this tunnel
         * 
         * @return builder
         * 
         */
        public Builder networks(List<String> networks) {
            return networks(Output.of(networks));
        }

        /**
         * @param networks If `provider`==`custom-ipsec` or `provider`==`prisma-ipsec`, networks reachable via this tunnel
         * 
         * @return builder
         * 
         */
        public Builder networks(String... networks) {
            return networks(List.of(networks));
        }

        /**
         * @param primary Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<DeviceprofileGatewayTunnelConfigsPrimaryArgs> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder primary(DeviceprofileGatewayTunnelConfigsPrimaryArgs primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param probe Only if `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder probe(@Nullable Output<DeviceprofileGatewayTunnelConfigsProbeArgs> probe) {
            $.probe = probe;
            return this;
        }

        /**
         * @param probe Only if `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder probe(DeviceprofileGatewayTunnelConfigsProbeArgs probe) {
            return probe(Output.of(probe));
        }

        /**
         * @param protocol Only if `provider`==`custom-ipsec`. enum: `gre`, `ipsec`
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Only if `provider`==`custom-ipsec`. enum: `gre`, `ipsec`
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param provider Only if `auto_provision.enabled`==`false`. enum: `custom-ipsec`, `custom-gre`, `jse-ipsec`, `prisma-ipsec`, `zscaler-gre`, `zscaler-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<String> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider Only if `auto_provision.enabled`==`false`. enum: `custom-ipsec`, `custom-gre`, `jse-ipsec`, `prisma-ipsec`, `zscaler-gre`, `zscaler-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Output.of(provider));
        }

        /**
         * @param psk Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder psk(@Nullable Output<String> psk) {
            $.psk = psk;
            return this;
        }

        /**
         * @param psk Required if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder psk(String psk) {
            return psk(Output.of(psk));
        }

        /**
         * @param secondary Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder secondary(@Nullable Output<DeviceprofileGatewayTunnelConfigsSecondaryArgs> secondary) {
            $.secondary = secondary;
            return this;
        }

        /**
         * @param secondary Only if `provider`==`zscaler-ipsec`, `provider`==`jse-ipsec` or `provider`==`custom-ipsec`
         * 
         * @return builder
         * 
         */
        public Builder secondary(DeviceprofileGatewayTunnelConfigsSecondaryArgs secondary) {
            return secondary(Output.of(secondary));
        }

        /**
         * @param version Only if `provider`==`custom-gre` or `provider`==`custom-ipsec`. enum: `1`, `2`
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Only if `provider`==`custom-gre` or `provider`==`custom-ipsec`. enum: `1`, `2`
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DeviceprofileGatewayTunnelConfigsArgs build() {
            return $;
        }
    }

}
