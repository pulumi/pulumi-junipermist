// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplatePortUsagesStormControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplatePortUsagesStormControlArgs Empty = new NetworktemplatePortUsagesStormControlArgs();

    /**
     * Whether to disable storm control on broadcast traffic
     * 
     */
    @Import(name="noBroadcast")
    private @Nullable Output<Boolean> noBroadcast;

    /**
     * @return Whether to disable storm control on broadcast traffic
     * 
     */
    public Optional<Output<Boolean>> noBroadcast() {
        return Optional.ofNullable(this.noBroadcast);
    }

    /**
     * Whether to disable storm control on multicast traffic
     * 
     */
    @Import(name="noMulticast")
    private @Nullable Output<Boolean> noMulticast;

    /**
     * @return Whether to disable storm control on multicast traffic
     * 
     */
    public Optional<Output<Boolean>> noMulticast() {
        return Optional.ofNullable(this.noMulticast);
    }

    /**
     * Whether to disable storm control on registered multicast traffic
     * 
     */
    @Import(name="noRegisteredMulticast")
    private @Nullable Output<Boolean> noRegisteredMulticast;

    /**
     * @return Whether to disable storm control on registered multicast traffic
     * 
     */
    public Optional<Output<Boolean>> noRegisteredMulticast() {
        return Optional.ofNullable(this.noRegisteredMulticast);
    }

    /**
     * Whether to disable storm control on unknown unicast traffic
     * 
     */
    @Import(name="noUnknownUnicast")
    private @Nullable Output<Boolean> noUnknownUnicast;

    /**
     * @return Whether to disable storm control on unknown unicast traffic
     * 
     */
    public Optional<Output<Boolean>> noUnknownUnicast() {
        return Optional.ofNullable(this.noUnknownUnicast);
    }

    /**
     * Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
     * 
     */
    @Import(name="percentage")
    private @Nullable Output<Integer> percentage;

    /**
     * @return Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
     * 
     */
    public Optional<Output<Integer>> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    private NetworktemplatePortUsagesStormControlArgs() {}

    private NetworktemplatePortUsagesStormControlArgs(NetworktemplatePortUsagesStormControlArgs $) {
        this.noBroadcast = $.noBroadcast;
        this.noMulticast = $.noMulticast;
        this.noRegisteredMulticast = $.noRegisteredMulticast;
        this.noUnknownUnicast = $.noUnknownUnicast;
        this.percentage = $.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplatePortUsagesStormControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplatePortUsagesStormControlArgs $;

        public Builder() {
            $ = new NetworktemplatePortUsagesStormControlArgs();
        }

        public Builder(NetworktemplatePortUsagesStormControlArgs defaults) {
            $ = new NetworktemplatePortUsagesStormControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param noBroadcast Whether to disable storm control on broadcast traffic
         * 
         * @return builder
         * 
         */
        public Builder noBroadcast(@Nullable Output<Boolean> noBroadcast) {
            $.noBroadcast = noBroadcast;
            return this;
        }

        /**
         * @param noBroadcast Whether to disable storm control on broadcast traffic
         * 
         * @return builder
         * 
         */
        public Builder noBroadcast(Boolean noBroadcast) {
            return noBroadcast(Output.of(noBroadcast));
        }

        /**
         * @param noMulticast Whether to disable storm control on multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noMulticast(@Nullable Output<Boolean> noMulticast) {
            $.noMulticast = noMulticast;
            return this;
        }

        /**
         * @param noMulticast Whether to disable storm control on multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noMulticast(Boolean noMulticast) {
            return noMulticast(Output.of(noMulticast));
        }

        /**
         * @param noRegisteredMulticast Whether to disable storm control on registered multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noRegisteredMulticast(@Nullable Output<Boolean> noRegisteredMulticast) {
            $.noRegisteredMulticast = noRegisteredMulticast;
            return this;
        }

        /**
         * @param noRegisteredMulticast Whether to disable storm control on registered multicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noRegisteredMulticast(Boolean noRegisteredMulticast) {
            return noRegisteredMulticast(Output.of(noRegisteredMulticast));
        }

        /**
         * @param noUnknownUnicast Whether to disable storm control on unknown unicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noUnknownUnicast(@Nullable Output<Boolean> noUnknownUnicast) {
            $.noUnknownUnicast = noUnknownUnicast;
            return this;
        }

        /**
         * @param noUnknownUnicast Whether to disable storm control on unknown unicast traffic
         * 
         * @return builder
         * 
         */
        public Builder noUnknownUnicast(Boolean noUnknownUnicast) {
            return noUnknownUnicast(Output.of(noUnknownUnicast));
        }

        /**
         * @param percentage Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
         * 
         * @return builder
         * 
         */
        public Builder percentage(@Nullable Output<Integer> percentage) {
            $.percentage = percentage;
            return this;
        }

        /**
         * @param percentage Bandwidth-percentage, configures the storm control level as a percentage of the available bandwidth
         * 
         * @return builder
         * 
         */
        public Builder percentage(Integer percentage) {
            return percentage(Output.of(percentage));
        }

        public NetworktemplatePortUsagesStormControlArgs build() {
            return $;
        }
    }

}
