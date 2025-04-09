// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchVrfInstancesExtraRoutes6Args extends com.pulumi.resources.ResourceArgs {

    public static final SwitchVrfInstancesExtraRoutes6Args Empty = new SwitchVrfInstancesExtraRoutes6Args();

    /**
     * Next-hop address
     * 
     */
    @Import(name="via")
    private @Nullable Output<String> via;

    /**
     * @return Next-hop address
     * 
     */
    public Optional<Output<String>> via() {
        return Optional.ofNullable(this.via);
    }

    private SwitchVrfInstancesExtraRoutes6Args() {}

    private SwitchVrfInstancesExtraRoutes6Args(SwitchVrfInstancesExtraRoutes6Args $) {
        this.via = $.via;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchVrfInstancesExtraRoutes6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchVrfInstancesExtraRoutes6Args $;

        public Builder() {
            $ = new SwitchVrfInstancesExtraRoutes6Args();
        }

        public Builder(SwitchVrfInstancesExtraRoutes6Args defaults) {
            $ = new SwitchVrfInstancesExtraRoutes6Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param via Next-hop address
         * 
         * @return builder
         * 
         */
        public Builder via(@Nullable Output<String> via) {
            $.via = via;
            return this;
        }

        /**
         * @param via Next-hop address
         * 
         * @return builder
         * 
         */
        public Builder via(String via) {
            return via(Output.of(via));
        }

        public SwitchVrfInstancesExtraRoutes6Args build() {
            return $;
        }
    }

}
