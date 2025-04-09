// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NacEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final NacEndpointArgs Empty = new NacEndpointArgs();

    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Only non-local-admin MAC is accepted
     * 
     */
    @Import(name="mac", required=true)
    private Output<String> mac;

    /**
     * @return Only non-local-admin MAC is accepted
     * 
     */
    public Output<String> mac() {
        return this.mac;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="notes")
    private @Nullable Output<String> notes;

    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    @Import(name="radiusGroup")
    private @Nullable Output<String> radiusGroup;

    public Optional<Output<String>> radiusGroup() {
        return Optional.ofNullable(this.radiusGroup);
    }

    @Import(name="vlan")
    private @Nullable Output<String> vlan;

    public Optional<Output<String>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    private NacEndpointArgs() {}

    private NacEndpointArgs(NacEndpointArgs $) {
        this.labels = $.labels;
        this.mac = $.mac;
        this.name = $.name;
        this.notes = $.notes;
        this.orgId = $.orgId;
        this.radiusGroup = $.radiusGroup;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NacEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NacEndpointArgs $;

        public Builder() {
            $ = new NacEndpointArgs();
        }

        public Builder(NacEndpointArgs defaults) {
            $ = new NacEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param mac Only non-local-admin MAC is accepted
         * 
         * @return builder
         * 
         */
        public Builder mac(Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac Only non-local-admin MAC is accepted
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder radiusGroup(@Nullable Output<String> radiusGroup) {
            $.radiusGroup = radiusGroup;
            return this;
        }

        public Builder radiusGroup(String radiusGroup) {
            return radiusGroup(Output.of(radiusGroup));
        }

        public Builder vlan(@Nullable Output<String> vlan) {
            $.vlan = vlan;
            return this;
        }

        public Builder vlan(String vlan) {
            return vlan(Output.of(vlan));
        }

        public NacEndpointArgs build() {
            if ($.mac == null) {
                throw new MissingRequiredPropertyException("NacEndpointArgs", "mac");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("NacEndpointArgs", "orgId");
            }
            return $;
        }
    }

}
