// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNacEndpointsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNacEndpointsPlainArgs Empty = new GetNacEndpointsPlainArgs();

    /**
     * Optional, array of strings of labels
     * 
     */
    @Import(name="labels")
    private @Nullable List<String> labels;

    /**
     * @return Optional, array of strings of labels
     * 
     */
    public Optional<List<String>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Partial/full MAC address
     * 
     */
    @Import(name="mac")
    private @Nullable String mac;

    /**
     * @return Partial/full MAC address
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    private GetNacEndpointsPlainArgs() {}

    private GetNacEndpointsPlainArgs(GetNacEndpointsPlainArgs $) {
        this.labels = $.labels;
        this.mac = $.mac;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNacEndpointsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNacEndpointsPlainArgs $;

        public Builder() {
            $ = new GetNacEndpointsPlainArgs();
        }

        public Builder(GetNacEndpointsPlainArgs defaults) {
            $ = new GetNacEndpointsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels Optional, array of strings of labels
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable List<String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional, array of strings of labels
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param mac Partial/full MAC address
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable String mac) {
            $.mac = mac;
            return this;
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetNacEndpointsPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetNacEndpointsPlainArgs", "orgId");
            }
            return $;
        }
    }

}
