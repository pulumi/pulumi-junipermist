// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GatewayClusterNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayClusterNodeArgs Empty = new GatewayClusterNodeArgs();

    /**
     * Gateway MAC Address. Format is `[0-9a-f]{12}` (e.g &#34;5684dae9ac8b&#34;)
     * 
     */
    @Import(name="mac", required=true)
    private Output<String> mac;

    /**
     * @return Gateway MAC Address. Format is `[0-9a-f]{12}` (e.g &#34;5684dae9ac8b&#34;)
     * 
     */
    public Output<String> mac() {
        return this.mac;
    }

    private GatewayClusterNodeArgs() {}

    private GatewayClusterNodeArgs(GatewayClusterNodeArgs $) {
        this.mac = $.mac;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayClusterNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayClusterNodeArgs $;

        public Builder() {
            $ = new GatewayClusterNodeArgs();
        }

        public Builder(GatewayClusterNodeArgs defaults) {
            $ = new GatewayClusterNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mac Gateway MAC Address. Format is `[0-9a-f]{12}` (e.g &#34;5684dae9ac8b&#34;)
         * 
         * @return builder
         * 
         */
        public Builder mac(Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac Gateway MAC Address. Format is `[0-9a-f]{12}` (e.g &#34;5684dae9ac8b&#34;)
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        public GatewayClusterNodeArgs build() {
            if ($.mac == null) {
                throw new MissingRequiredPropertyException("GatewayClusterNodeArgs", "mac");
            }
            return $;
        }
    }

}
