// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UpgradeDeviceFwupdateArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpgradeDeviceFwupdateArgs Empty = new UpgradeDeviceFwupdateArgs();

    @Import(name="progress")
    private @Nullable Output<Integer> progress;

    public Optional<Output<Integer>> progress() {
        return Optional.ofNullable(this.progress);
    }

    /**
     * enum: `inprogress`, `failed`, `upgraded`
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return enum: `inprogress`, `failed`, `upgraded`
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="statusId")
    private @Nullable Output<Integer> statusId;

    public Optional<Output<Integer>> statusId() {
        return Optional.ofNullable(this.statusId);
    }

    /**
     * Epoch (seconds)
     * 
     */
    @Import(name="timestamp")
    private @Nullable Output<Double> timestamp;

    /**
     * @return Epoch (seconds)
     * 
     */
    public Optional<Output<Double>> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }

    @Import(name="willRetry")
    private @Nullable Output<Boolean> willRetry;

    public Optional<Output<Boolean>> willRetry() {
        return Optional.ofNullable(this.willRetry);
    }

    private UpgradeDeviceFwupdateArgs() {}

    private UpgradeDeviceFwupdateArgs(UpgradeDeviceFwupdateArgs $) {
        this.progress = $.progress;
        this.status = $.status;
        this.statusId = $.statusId;
        this.timestamp = $.timestamp;
        this.willRetry = $.willRetry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpgradeDeviceFwupdateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeDeviceFwupdateArgs $;

        public Builder() {
            $ = new UpgradeDeviceFwupdateArgs();
        }

        public Builder(UpgradeDeviceFwupdateArgs defaults) {
            $ = new UpgradeDeviceFwupdateArgs(Objects.requireNonNull(defaults));
        }

        public Builder progress(@Nullable Output<Integer> progress) {
            $.progress = progress;
            return this;
        }

        public Builder progress(Integer progress) {
            return progress(Output.of(progress));
        }

        /**
         * @param status enum: `inprogress`, `failed`, `upgraded`
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status enum: `inprogress`, `failed`, `upgraded`
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder statusId(@Nullable Output<Integer> statusId) {
            $.statusId = statusId;
            return this;
        }

        public Builder statusId(Integer statusId) {
            return statusId(Output.of(statusId));
        }

        /**
         * @param timestamp Epoch (seconds)
         * 
         * @return builder
         * 
         */
        public Builder timestamp(@Nullable Output<Double> timestamp) {
            $.timestamp = timestamp;
            return this;
        }

        /**
         * @param timestamp Epoch (seconds)
         * 
         * @return builder
         * 
         */
        public Builder timestamp(Double timestamp) {
            return timestamp(Output.of(timestamp));
        }

        public Builder willRetry(@Nullable Output<Boolean> willRetry) {
            $.willRetry = willRetry;
            return this;
        }

        public Builder willRetry(Boolean willRetry) {
            return willRetry(Output.of(willRetry));
        }

        public UpgradeDeviceFwupdateArgs build() {
            return $;
        }
    }

}
