// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.inputs.EvpnTopologyEvpnOptionsArgs;
import com.pulumi.junipermist.org.inputs.EvpnTopologySwitchesArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EvpnTopologyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EvpnTopologyArgs Empty = new EvpnTopologyArgs();

    /**
     * EVPN Options
     * 
     */
    @Import(name="evpnOptions")
    private @Nullable Output<EvpnTopologyEvpnOptionsArgs> evpnOptions;

    /**
     * @return EVPN Options
     * 
     */
    public Optional<Output<EvpnTopologyEvpnOptionsArgs>> evpnOptions() {
        return Optional.ofNullable(this.evpnOptions);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Property key is the pod number
     * 
     */
    @Import(name="podNames")
    private @Nullable Output<Map<String,String>> podNames;

    /**
     * @return Property key is the pod number
     * 
     */
    public Optional<Output<Map<String,String>>> podNames() {
        return Optional.ofNullable(this.podNames);
    }

    /**
     * Property key can be the switch MAC Address
     * 
     */
    @Import(name="switches", required=true)
    private Output<Map<String,EvpnTopologySwitchesArgs>> switches;

    /**
     * @return Property key can be the switch MAC Address
     * 
     */
    public Output<Map<String,EvpnTopologySwitchesArgs>> switches() {
        return this.switches;
    }

    private EvpnTopologyArgs() {}

    private EvpnTopologyArgs(EvpnTopologyArgs $) {
        this.evpnOptions = $.evpnOptions;
        this.name = $.name;
        this.orgId = $.orgId;
        this.podNames = $.podNames;
        this.switches = $.switches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EvpnTopologyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EvpnTopologyArgs $;

        public Builder() {
            $ = new EvpnTopologyArgs();
        }

        public Builder(EvpnTopologyArgs defaults) {
            $ = new EvpnTopologyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param evpnOptions EVPN Options
         * 
         * @return builder
         * 
         */
        public Builder evpnOptions(@Nullable Output<EvpnTopologyEvpnOptionsArgs> evpnOptions) {
            $.evpnOptions = evpnOptions;
            return this;
        }

        /**
         * @param evpnOptions EVPN Options
         * 
         * @return builder
         * 
         */
        public Builder evpnOptions(EvpnTopologyEvpnOptionsArgs evpnOptions) {
            return evpnOptions(Output.of(evpnOptions));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param podNames Property key is the pod number
         * 
         * @return builder
         * 
         */
        public Builder podNames(@Nullable Output<Map<String,String>> podNames) {
            $.podNames = podNames;
            return this;
        }

        /**
         * @param podNames Property key is the pod number
         * 
         * @return builder
         * 
         */
        public Builder podNames(Map<String,String> podNames) {
            return podNames(Output.of(podNames));
        }

        /**
         * @param switches Property key can be the switch MAC Address
         * 
         * @return builder
         * 
         */
        public Builder switches(Output<Map<String,EvpnTopologySwitchesArgs>> switches) {
            $.switches = switches;
            return this;
        }

        /**
         * @param switches Property key can be the switch MAC Address
         * 
         * @return builder
         * 
         */
        public Builder switches(Map<String,EvpnTopologySwitchesArgs> switches) {
            return switches(Output.of(switches));
        }

        public EvpnTopologyArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("EvpnTopologyArgs", "orgId");
            }
            if ($.switches == null) {
                throw new MissingRequiredPropertyException("EvpnTopologyArgs", "switches");
            }
            return $;
        }
    }

}
