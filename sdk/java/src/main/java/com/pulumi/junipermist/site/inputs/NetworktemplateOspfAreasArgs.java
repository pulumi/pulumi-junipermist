// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.site.inputs.NetworktemplateOspfAreasOspfNetworksArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateOspfAreasArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateOspfAreasArgs Empty = new NetworktemplateOspfAreasArgs();

    @Import(name="includeLoopback")
    private @Nullable Output<Boolean> includeLoopback;

    public Optional<Output<Boolean>> includeLoopback() {
        return Optional.ofNullable(this.includeLoopback);
    }

    @Import(name="ospfNetworks", required=true)
    private Output<Map<String,NetworktemplateOspfAreasOspfNetworksArgs>> ospfNetworks;

    public Output<Map<String,NetworktemplateOspfAreasOspfNetworksArgs>> ospfNetworks() {
        return this.ospfNetworks;
    }

    /**
     * OSPF type. enum: `default`, `nssa`, `stub`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return OSPF type. enum: `default`, `nssa`, `stub`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NetworktemplateOspfAreasArgs() {}

    private NetworktemplateOspfAreasArgs(NetworktemplateOspfAreasArgs $) {
        this.includeLoopback = $.includeLoopback;
        this.ospfNetworks = $.ospfNetworks;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateOspfAreasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateOspfAreasArgs $;

        public Builder() {
            $ = new NetworktemplateOspfAreasArgs();
        }

        public Builder(NetworktemplateOspfAreasArgs defaults) {
            $ = new NetworktemplateOspfAreasArgs(Objects.requireNonNull(defaults));
        }

        public Builder includeLoopback(@Nullable Output<Boolean> includeLoopback) {
            $.includeLoopback = includeLoopback;
            return this;
        }

        public Builder includeLoopback(Boolean includeLoopback) {
            return includeLoopback(Output.of(includeLoopback));
        }

        public Builder ospfNetworks(Output<Map<String,NetworktemplateOspfAreasOspfNetworksArgs>> ospfNetworks) {
            $.ospfNetworks = ospfNetworks;
            return this;
        }

        public Builder ospfNetworks(Map<String,NetworktemplateOspfAreasOspfNetworksArgs> ospfNetworks) {
            return ospfNetworks(Output.of(ospfNetworks));
        }

        /**
         * @param type OSPF type. enum: `default`, `nssa`, `stub`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type OSPF type. enum: `default`, `nssa`, `stub`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NetworktemplateOspfAreasArgs build() {
            if ($.ospfNetworks == null) {
                throw new MissingRequiredPropertyException("NetworktemplateOspfAreasArgs", "ospfNetworks");
            }
            return $;
        }
    }

}