// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateVrfConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateVrfConfigArgs Empty = new NetworktemplateVrfConfigArgs();

    /**
     * Whether to enable VRF (when supported on the device)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable VRF (when supported on the device)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private NetworktemplateVrfConfigArgs() {}

    private NetworktemplateVrfConfigArgs(NetworktemplateVrfConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateVrfConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateVrfConfigArgs $;

        public Builder() {
            $ = new NetworktemplateVrfConfigArgs();
        }

        public Builder(NetworktemplateVrfConfigArgs defaults) {
            $ = new NetworktemplateVrfConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable VRF (when supported on the device)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable VRF (when supported on the device)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public NetworktemplateVrfConfigArgs build() {
            return $;
        }
    }

}
