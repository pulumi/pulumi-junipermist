// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingSsrArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingSsrArgs Empty = new SettingSsrArgs();

    /**
     * List of Conductor IP Addresses or Hosts to be used by the SSR Devices
     * 
     */
    @Import(name="conductorHosts")
    private @Nullable Output<List<String>> conductorHosts;

    /**
     * @return List of Conductor IP Addresses or Hosts to be used by the SSR Devices
     * 
     */
    public Optional<Output<List<String>>> conductorHosts() {
        return Optional.ofNullable(this.conductorHosts);
    }

    /**
     * Token to be used by the SSR Devices to connect to the Conductor
     * 
     */
    @Import(name="conductorToken")
    private @Nullable Output<String> conductorToken;

    /**
     * @return Token to be used by the SSR Devices to connect to the Conductor
     * 
     */
    public Optional<Output<String>> conductorToken() {
        return Optional.ofNullable(this.conductorToken);
    }

    /**
     * Disable stats collection on SSR devices
     * 
     */
    @Import(name="disableStats")
    private @Nullable Output<Boolean> disableStats;

    /**
     * @return Disable stats collection on SSR devices
     * 
     */
    public Optional<Output<Boolean>> disableStats() {
        return Optional.ofNullable(this.disableStats);
    }

    private SettingSsrArgs() {}

    private SettingSsrArgs(SettingSsrArgs $) {
        this.conductorHosts = $.conductorHosts;
        this.conductorToken = $.conductorToken;
        this.disableStats = $.disableStats;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingSsrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingSsrArgs $;

        public Builder() {
            $ = new SettingSsrArgs();
        }

        public Builder(SettingSsrArgs defaults) {
            $ = new SettingSsrArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conductorHosts List of Conductor IP Addresses or Hosts to be used by the SSR Devices
         * 
         * @return builder
         * 
         */
        public Builder conductorHosts(@Nullable Output<List<String>> conductorHosts) {
            $.conductorHosts = conductorHosts;
            return this;
        }

        /**
         * @param conductorHosts List of Conductor IP Addresses or Hosts to be used by the SSR Devices
         * 
         * @return builder
         * 
         */
        public Builder conductorHosts(List<String> conductorHosts) {
            return conductorHosts(Output.of(conductorHosts));
        }

        /**
         * @param conductorHosts List of Conductor IP Addresses or Hosts to be used by the SSR Devices
         * 
         * @return builder
         * 
         */
        public Builder conductorHosts(String... conductorHosts) {
            return conductorHosts(List.of(conductorHosts));
        }

        /**
         * @param conductorToken Token to be used by the SSR Devices to connect to the Conductor
         * 
         * @return builder
         * 
         */
        public Builder conductorToken(@Nullable Output<String> conductorToken) {
            $.conductorToken = conductorToken;
            return this;
        }

        /**
         * @param conductorToken Token to be used by the SSR Devices to connect to the Conductor
         * 
         * @return builder
         * 
         */
        public Builder conductorToken(String conductorToken) {
            return conductorToken(Output.of(conductorToken));
        }

        /**
         * @param disableStats Disable stats collection on SSR devices
         * 
         * @return builder
         * 
         */
        public Builder disableStats(@Nullable Output<Boolean> disableStats) {
            $.disableStats = disableStats;
            return this;
        }

        /**
         * @param disableStats Disable stats collection on SSR devices
         * 
         * @return builder
         * 
         */
        public Builder disableStats(Boolean disableStats) {
            return disableStats(Output.of(disableStats));
        }

        public SettingSsrArgs build() {
            return $;
        }
    }

}
