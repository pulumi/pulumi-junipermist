// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApStatsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApStatsPlainArgs Empty = new GetApStatsPlainArgs();

    @Import(name="duration")
    private @Nullable String duration;

    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="end")
    private @Nullable Integer end;

    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }

    @Import(name="mac")
    private @Nullable String mac;

    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }

    @Import(name="orgId", required=true)
    private String orgId;

    public String orgId() {
        return this.orgId;
    }

    @Import(name="siteId")
    private @Nullable String siteId;

    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    @Import(name="start")
    private @Nullable Integer start;

    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }

    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetApStatsPlainArgs() {}

    private GetApStatsPlainArgs(GetApStatsPlainArgs $) {
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
    public static Builder builder(GetApStatsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApStatsPlainArgs $;

        public Builder() {
            $ = new GetApStatsPlainArgs();
        }

        public Builder(GetApStatsPlainArgs defaults) {
            $ = new GetApStatsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable String duration) {
            $.duration = duration;
            return this;
        }

        public Builder end(@Nullable Integer end) {
            $.end = end;
            return this;
        }

        public Builder mac(@Nullable String mac) {
            $.mac = mac;
            return this;
        }

        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder siteId(@Nullable String siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder start(@Nullable Integer start) {
            $.start = start;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetApStatsPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetApStatsPlainArgs", "orgId");
            }
            return $;
        }
    }

}
