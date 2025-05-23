// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApStatsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApStatsArgs Empty = new GetApStatsArgs();

    @Import(name="duration")
    private @Nullable Output<String> duration;

    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="end")
    private @Nullable Output<Integer> end;

    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    @Import(name="mac")
    private @Nullable Output<String> mac;

    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    @Import(name="start")
    private @Nullable Output<Integer> start;

    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetApStatsArgs() {}

    private GetApStatsArgs(GetApStatsArgs $) {
        this.duration = $.duration;
        this.end = $.end;
        this.mac = $.mac;
        this.orgId = $.orgId;
        this.siteId = $.siteId;
        this.start = $.start;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApStatsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApStatsArgs $;

        public Builder() {
            $ = new GetApStatsArgs();
        }

        public Builder(GetApStatsArgs defaults) {
            $ = new GetApStatsArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetApStatsArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetApStatsArgs", "orgId");
            }
            return $;
        }
    }

}
