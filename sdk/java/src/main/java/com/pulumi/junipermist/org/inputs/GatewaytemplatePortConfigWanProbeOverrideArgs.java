// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplatePortConfigWanProbeOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplatePortConfigWanProbeOverrideArgs Empty = new GatewaytemplatePortConfigWanProbeOverrideArgs();

    @Import(name="ips")
    private @Nullable Output<List<String>> ips;

    public Optional<Output<List<String>>> ips() {
        return Optional.ofNullable(this.ips);
    }

    /**
     * enum: `broadband`, `lte`
     * 
     */
    @Import(name="probeProfile")
    private @Nullable Output<String> probeProfile;

    /**
     * @return enum: `broadband`, `lte`
     * 
     */
    public Optional<Output<String>> probeProfile() {
        return Optional.ofNullable(this.probeProfile);
    }

    private GatewaytemplatePortConfigWanProbeOverrideArgs() {}

    private GatewaytemplatePortConfigWanProbeOverrideArgs(GatewaytemplatePortConfigWanProbeOverrideArgs $) {
        this.ips = $.ips;
        this.probeProfile = $.probeProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplatePortConfigWanProbeOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplatePortConfigWanProbeOverrideArgs $;

        public Builder() {
            $ = new GatewaytemplatePortConfigWanProbeOverrideArgs();
        }

        public Builder(GatewaytemplatePortConfigWanProbeOverrideArgs defaults) {
            $ = new GatewaytemplatePortConfigWanProbeOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder ips(@Nullable Output<List<String>> ips) {
            $.ips = ips;
            return this;
        }

        public Builder ips(List<String> ips) {
            return ips(Output.of(ips));
        }

        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }

        /**
         * @param probeProfile enum: `broadband`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder probeProfile(@Nullable Output<String> probeProfile) {
            $.probeProfile = probeProfile;
            return this;
        }

        /**
         * @param probeProfile enum: `broadband`, `lte`
         * 
         * @return builder
         * 
         */
        public Builder probeProfile(String probeProfile) {
            return probeProfile(Output.of(probeProfile));
        }

        public GatewaytemplatePortConfigWanProbeOverrideArgs build() {
            return $;
        }
    }

}