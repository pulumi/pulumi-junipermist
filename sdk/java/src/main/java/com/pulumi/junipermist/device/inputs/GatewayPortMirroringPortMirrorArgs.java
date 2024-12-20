// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayPortMirroringPortMirrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayPortMirroringPortMirrorArgs Empty = new GatewayPortMirroringPortMirrorArgs();

    @Import(name="familyType")
    private @Nullable Output<String> familyType;

    public Optional<Output<String>> familyType() {
        return Optional.ofNullable(this.familyType);
    }

    @Import(name="ingressPortIds")
    private @Nullable Output<List<String>> ingressPortIds;

    public Optional<Output<List<String>>> ingressPortIds() {
        return Optional.ofNullable(this.ingressPortIds);
    }

    @Import(name="outputPortId")
    private @Nullable Output<String> outputPortId;

    public Optional<Output<String>> outputPortId() {
        return Optional.ofNullable(this.outputPortId);
    }

    @Import(name="rate")
    private @Nullable Output<Integer> rate;

    public Optional<Output<Integer>> rate() {
        return Optional.ofNullable(this.rate);
    }

    @Import(name="runLength")
    private @Nullable Output<Integer> runLength;

    public Optional<Output<Integer>> runLength() {
        return Optional.ofNullable(this.runLength);
    }

    private GatewayPortMirroringPortMirrorArgs() {}

    private GatewayPortMirroringPortMirrorArgs(GatewayPortMirroringPortMirrorArgs $) {
        this.familyType = $.familyType;
        this.ingressPortIds = $.ingressPortIds;
        this.outputPortId = $.outputPortId;
        this.rate = $.rate;
        this.runLength = $.runLength;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayPortMirroringPortMirrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayPortMirroringPortMirrorArgs $;

        public Builder() {
            $ = new GatewayPortMirroringPortMirrorArgs();
        }

        public Builder(GatewayPortMirroringPortMirrorArgs defaults) {
            $ = new GatewayPortMirroringPortMirrorArgs(Objects.requireNonNull(defaults));
        }

        public Builder familyType(@Nullable Output<String> familyType) {
            $.familyType = familyType;
            return this;
        }

        public Builder familyType(String familyType) {
            return familyType(Output.of(familyType));
        }

        public Builder ingressPortIds(@Nullable Output<List<String>> ingressPortIds) {
            $.ingressPortIds = ingressPortIds;
            return this;
        }

        public Builder ingressPortIds(List<String> ingressPortIds) {
            return ingressPortIds(Output.of(ingressPortIds));
        }

        public Builder ingressPortIds(String... ingressPortIds) {
            return ingressPortIds(List.of(ingressPortIds));
        }

        public Builder outputPortId(@Nullable Output<String> outputPortId) {
            $.outputPortId = outputPortId;
            return this;
        }

        public Builder outputPortId(String outputPortId) {
            return outputPortId(Output.of(outputPortId));
        }

        public Builder rate(@Nullable Output<Integer> rate) {
            $.rate = rate;
            return this;
        }

        public Builder rate(Integer rate) {
            return rate(Output.of(rate));
        }

        public Builder runLength(@Nullable Output<Integer> runLength) {
            $.runLength = runLength;
            return this;
        }

        public Builder runLength(Integer runLength) {
            return runLength(Output.of(runLength));
        }

        public GatewayPortMirroringPortMirrorArgs build() {
            return $;
        }
    }

}
