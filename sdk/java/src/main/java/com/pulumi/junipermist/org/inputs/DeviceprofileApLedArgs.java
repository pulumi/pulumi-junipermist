// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileApLedArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileApLedArgs Empty = new DeviceprofileApLedArgs();

    @Import(name="brightness")
    private @Nullable Output<Integer> brightness;

    public Optional<Output<Integer>> brightness() {
        return Optional.ofNullable(this.brightness);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DeviceprofileApLedArgs() {}

    private DeviceprofileApLedArgs(DeviceprofileApLedArgs $) {
        this.brightness = $.brightness;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileApLedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileApLedArgs $;

        public Builder() {
            $ = new DeviceprofileApLedArgs();
        }

        public Builder(DeviceprofileApLedArgs defaults) {
            $ = new DeviceprofileApLedArgs(Objects.requireNonNull(defaults));
        }

        public Builder brightness(@Nullable Output<Integer> brightness) {
            $.brightness = brightness;
            return this;
        }

        public Builder brightness(Integer brightness) {
            return brightness(Output.of(brightness));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public DeviceprofileApLedArgs build() {
            return $;
        }
    }

}