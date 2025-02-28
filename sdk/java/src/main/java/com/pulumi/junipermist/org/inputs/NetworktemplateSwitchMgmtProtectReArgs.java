// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.NetworktemplateSwitchMgmtProtectReCustomArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSwitchMgmtProtectReArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSwitchMgmtProtectReArgs Empty = new NetworktemplateSwitchMgmtProtectReArgs();

    /**
     * optionally, services we&#39;ll allow. enum: `icmp`, `ssh`
     * 
     */
    @Import(name="allowedServices")
    private @Nullable Output<List<String>> allowedServices;

    /**
     * @return optionally, services we&#39;ll allow. enum: `icmp`, `ssh`
     * 
     */
    public Optional<Output<List<String>>> allowedServices() {
        return Optional.ofNullable(this.allowedServices);
    }

    @Import(name="customs")
    private @Nullable Output<List<NetworktemplateSwitchMgmtProtectReCustomArgs>> customs;

    public Optional<Output<List<NetworktemplateSwitchMgmtProtectReCustomArgs>>> customs() {
        return Optional.ofNullable(this.customs);
    }

    /**
     * When enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default
     *      if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return When enabled, all traffic that is not essential to our operation will be dropped
     * e.g. ntp / dns / traffic to mist will be allowed by default
     *      if dhcpd is enabled, we&#39;ll make sure it works
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * host/subnets we&#39;ll allow traffic to/from
     * 
     */
    @Import(name="trustedHosts")
    private @Nullable Output<List<String>> trustedHosts;

    /**
     * @return host/subnets we&#39;ll allow traffic to/from
     * 
     */
    public Optional<Output<List<String>>> trustedHosts() {
        return Optional.ofNullable(this.trustedHosts);
    }

    private NetworktemplateSwitchMgmtProtectReArgs() {}

    private NetworktemplateSwitchMgmtProtectReArgs(NetworktemplateSwitchMgmtProtectReArgs $) {
        this.allowedServices = $.allowedServices;
        this.customs = $.customs;
        this.enabled = $.enabled;
        this.trustedHosts = $.trustedHosts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSwitchMgmtProtectReArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSwitchMgmtProtectReArgs $;

        public Builder() {
            $ = new NetworktemplateSwitchMgmtProtectReArgs();
        }

        public Builder(NetworktemplateSwitchMgmtProtectReArgs defaults) {
            $ = new NetworktemplateSwitchMgmtProtectReArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedServices optionally, services we&#39;ll allow. enum: `icmp`, `ssh`
         * 
         * @return builder
         * 
         */
        public Builder allowedServices(@Nullable Output<List<String>> allowedServices) {
            $.allowedServices = allowedServices;
            return this;
        }

        /**
         * @param allowedServices optionally, services we&#39;ll allow. enum: `icmp`, `ssh`
         * 
         * @return builder
         * 
         */
        public Builder allowedServices(List<String> allowedServices) {
            return allowedServices(Output.of(allowedServices));
        }

        /**
         * @param allowedServices optionally, services we&#39;ll allow. enum: `icmp`, `ssh`
         * 
         * @return builder
         * 
         */
        public Builder allowedServices(String... allowedServices) {
            return allowedServices(List.of(allowedServices));
        }

        public Builder customs(@Nullable Output<List<NetworktemplateSwitchMgmtProtectReCustomArgs>> customs) {
            $.customs = customs;
            return this;
        }

        public Builder customs(List<NetworktemplateSwitchMgmtProtectReCustomArgs> customs) {
            return customs(Output.of(customs));
        }

        public Builder customs(NetworktemplateSwitchMgmtProtectReCustomArgs... customs) {
            return customs(List.of(customs));
        }

        /**
         * @param enabled When enabled, all traffic that is not essential to our operation will be dropped
         * e.g. ntp / dns / traffic to mist will be allowed by default
         *      if dhcpd is enabled, we&#39;ll make sure it works
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled When enabled, all traffic that is not essential to our operation will be dropped
         * e.g. ntp / dns / traffic to mist will be allowed by default
         *      if dhcpd is enabled, we&#39;ll make sure it works
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param trustedHosts host/subnets we&#39;ll allow traffic to/from
         * 
         * @return builder
         * 
         */
        public Builder trustedHosts(@Nullable Output<List<String>> trustedHosts) {
            $.trustedHosts = trustedHosts;
            return this;
        }

        /**
         * @param trustedHosts host/subnets we&#39;ll allow traffic to/from
         * 
         * @return builder
         * 
         */
        public Builder trustedHosts(List<String> trustedHosts) {
            return trustedHosts(Output.of(trustedHosts));
        }

        /**
         * @param trustedHosts host/subnets we&#39;ll allow traffic to/from
         * 
         * @return builder
         * 
         */
        public Builder trustedHosts(String... trustedHosts) {
            return trustedHosts(List.of(trustedHosts));
        }

        public NetworktemplateSwitchMgmtProtectReArgs build() {
            return $;
        }
    }

}
