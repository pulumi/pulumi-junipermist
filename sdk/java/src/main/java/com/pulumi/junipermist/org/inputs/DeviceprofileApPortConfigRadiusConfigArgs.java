// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.DeviceprofileApPortConfigRadiusConfigAcctServerArgs;
import com.pulumi.junipermist.org.inputs.DeviceprofileApPortConfigRadiusConfigAuthServerArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileApPortConfigRadiusConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileApPortConfigRadiusConfigArgs Empty = new DeviceprofileApPortConfigRadiusConfigArgs();

    /**
     * How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
     * 
     */
    @Import(name="acctInterimInterval")
    private @Nullable Output<Integer> acctInterimInterval;

    /**
     * @return How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
     * 
     */
    public Optional<Output<Integer>> acctInterimInterval() {
        return Optional.ofNullable(this.acctInterimInterval);
    }

    @Import(name="acctServers")
    private @Nullable Output<List<DeviceprofileApPortConfigRadiusConfigAcctServerArgs>> acctServers;

    public Optional<Output<List<DeviceprofileApPortConfigRadiusConfigAcctServerArgs>>> acctServers() {
        return Optional.ofNullable(this.acctServers);
    }

    @Import(name="authServers")
    private @Nullable Output<List<DeviceprofileApPortConfigRadiusConfigAuthServerArgs>> authServers;

    public Optional<Output<List<DeviceprofileApPortConfigRadiusConfigAuthServerArgs>>> authServers() {
        return Optional.ofNullable(this.authServers);
    }

    /**
     * radius auth session retries
     * 
     */
    @Import(name="authServersRetries")
    private @Nullable Output<Integer> authServersRetries;

    /**
     * @return radius auth session retries
     * 
     */
    public Optional<Output<Integer>> authServersRetries() {
        return Optional.ofNullable(this.authServersRetries);
    }

    /**
     * radius auth session timeout
     * 
     */
    @Import(name="authServersTimeout")
    private @Nullable Output<Integer> authServersTimeout;

    /**
     * @return radius auth session timeout
     * 
     */
    public Optional<Output<Integer>> authServersTimeout() {
        return Optional.ofNullable(this.authServersTimeout);
    }

    @Import(name="coaEnabled")
    private @Nullable Output<Boolean> coaEnabled;

    public Optional<Output<Boolean>> coaEnabled() {
        return Optional.ofNullable(this.coaEnabled);
    }

    @Import(name="coaPort")
    private @Nullable Output<Integer> coaPort;

    public Optional<Output<Integer>> coaPort() {
        return Optional.ofNullable(this.coaPort);
    }

    /**
     * use `network`or `source_ip`, which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
     * 
     */
    @Import(name="network")
    private @Nullable Output<String> network;

    /**
     * @return use `network`or `source_ip`, which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
     * 
     */
    public Optional<Output<String>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * use `network`or `source_ip`
     * 
     */
    @Import(name="sourceIp")
    private @Nullable Output<String> sourceIp;

    /**
     * @return use `network`or `source_ip`
     * 
     */
    public Optional<Output<String>> sourceIp() {
        return Optional.ofNullable(this.sourceIp);
    }

    private DeviceprofileApPortConfigRadiusConfigArgs() {}

    private DeviceprofileApPortConfigRadiusConfigArgs(DeviceprofileApPortConfigRadiusConfigArgs $) {
        this.acctInterimInterval = $.acctInterimInterval;
        this.acctServers = $.acctServers;
        this.authServers = $.authServers;
        this.authServersRetries = $.authServersRetries;
        this.authServersTimeout = $.authServersTimeout;
        this.coaEnabled = $.coaEnabled;
        this.coaPort = $.coaPort;
        this.network = $.network;
        this.sourceIp = $.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileApPortConfigRadiusConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileApPortConfigRadiusConfigArgs $;

        public Builder() {
            $ = new DeviceprofileApPortConfigRadiusConfigArgs();
        }

        public Builder(DeviceprofileApPortConfigRadiusConfigArgs defaults) {
            $ = new DeviceprofileApPortConfigRadiusConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acctInterimInterval How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
         * 
         * @return builder
         * 
         */
        public Builder acctInterimInterval(@Nullable Output<Integer> acctInterimInterval) {
            $.acctInterimInterval = acctInterimInterval;
            return this;
        }

        /**
         * @param acctInterimInterval How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
         * 
         * @return builder
         * 
         */
        public Builder acctInterimInterval(Integer acctInterimInterval) {
            return acctInterimInterval(Output.of(acctInterimInterval));
        }

        public Builder acctServers(@Nullable Output<List<DeviceprofileApPortConfigRadiusConfigAcctServerArgs>> acctServers) {
            $.acctServers = acctServers;
            return this;
        }

        public Builder acctServers(List<DeviceprofileApPortConfigRadiusConfigAcctServerArgs> acctServers) {
            return acctServers(Output.of(acctServers));
        }

        public Builder acctServers(DeviceprofileApPortConfigRadiusConfigAcctServerArgs... acctServers) {
            return acctServers(List.of(acctServers));
        }

        public Builder authServers(@Nullable Output<List<DeviceprofileApPortConfigRadiusConfigAuthServerArgs>> authServers) {
            $.authServers = authServers;
            return this;
        }

        public Builder authServers(List<DeviceprofileApPortConfigRadiusConfigAuthServerArgs> authServers) {
            return authServers(Output.of(authServers));
        }

        public Builder authServers(DeviceprofileApPortConfigRadiusConfigAuthServerArgs... authServers) {
            return authServers(List.of(authServers));
        }

        /**
         * @param authServersRetries radius auth session retries
         * 
         * @return builder
         * 
         */
        public Builder authServersRetries(@Nullable Output<Integer> authServersRetries) {
            $.authServersRetries = authServersRetries;
            return this;
        }

        /**
         * @param authServersRetries radius auth session retries
         * 
         * @return builder
         * 
         */
        public Builder authServersRetries(Integer authServersRetries) {
            return authServersRetries(Output.of(authServersRetries));
        }

        /**
         * @param authServersTimeout radius auth session timeout
         * 
         * @return builder
         * 
         */
        public Builder authServersTimeout(@Nullable Output<Integer> authServersTimeout) {
            $.authServersTimeout = authServersTimeout;
            return this;
        }

        /**
         * @param authServersTimeout radius auth session timeout
         * 
         * @return builder
         * 
         */
        public Builder authServersTimeout(Integer authServersTimeout) {
            return authServersTimeout(Output.of(authServersTimeout));
        }

        public Builder coaEnabled(@Nullable Output<Boolean> coaEnabled) {
            $.coaEnabled = coaEnabled;
            return this;
        }

        public Builder coaEnabled(Boolean coaEnabled) {
            return coaEnabled(Output.of(coaEnabled));
        }

        public Builder coaPort(@Nullable Output<Integer> coaPort) {
            $.coaPort = coaPort;
            return this;
        }

        public Builder coaPort(Integer coaPort) {
            return coaPort(Output.of(coaPort));
        }

        /**
         * @param network use `network`or `source_ip`, which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network use `network`or `source_ip`, which network the RADIUS server resides, if there&#39;s static IP for this network, we&#39;d use it as source-ip
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param sourceIp use `network`or `source_ip`
         * 
         * @return builder
         * 
         */
        public Builder sourceIp(@Nullable Output<String> sourceIp) {
            $.sourceIp = sourceIp;
            return this;
        }

        /**
         * @param sourceIp use `network`or `source_ip`
         * 
         * @return builder
         * 
         */
        public Builder sourceIp(String sourceIp) {
            return sourceIp(Output.of(sourceIp));
        }

        public DeviceprofileApPortConfigRadiusConfigArgs build() {
            return $;
        }
    }

}
