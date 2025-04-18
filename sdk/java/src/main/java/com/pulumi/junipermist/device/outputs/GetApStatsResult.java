// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetApStatsDeviceApStat;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApStatsResult {
    private List<GetApStatsDeviceApStat> deviceApStats;
    private @Nullable String duration;
    private @Nullable Integer end;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String mac;
    private String orgId;
    private @Nullable String siteId;
    private @Nullable Integer start;
    private @Nullable String status;

    private GetApStatsResult() {}
    public List<GetApStatsDeviceApStat> deviceApStats() {
        return this.deviceApStats;
    }
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    public String orgId() {
        return this.orgId;
    }
    public Optional<String> siteId() {
        return Optional.ofNullable(this.siteId);
    }
    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApStatsDeviceApStat> deviceApStats;
        private @Nullable String duration;
        private @Nullable Integer end;
        private String id;
        private @Nullable String mac;
        private String orgId;
        private @Nullable String siteId;
        private @Nullable Integer start;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetApStatsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceApStats = defaults.deviceApStats;
    	      this.duration = defaults.duration;
    	      this.end = defaults.end;
    	      this.id = defaults.id;
    	      this.mac = defaults.mac;
    	      this.orgId = defaults.orgId;
    	      this.siteId = defaults.siteId;
    	      this.start = defaults.start;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder deviceApStats(List<GetApStatsDeviceApStat> deviceApStats) {
            if (deviceApStats == null) {
              throw new MissingRequiredPropertyException("GetApStatsResult", "deviceApStats");
            }
            this.deviceApStats = deviceApStats;
            return this;
        }
        public Builder deviceApStats(GetApStatsDeviceApStat... deviceApStats) {
            return deviceApStats(List.of(deviceApStats));
        }
        @CustomType.Setter
        public Builder duration(@Nullable String duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder end(@Nullable Integer end) {

            this.end = end;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApStatsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {

            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetApStatsResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder siteId(@Nullable String siteId) {

            this.siteId = siteId;
            return this;
        }
        @CustomType.Setter
        public Builder start(@Nullable Integer start) {

            this.start = start;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetApStatsResult build() {
            final var _resultValue = new GetApStatsResult();
            _resultValue.deviceApStats = deviceApStats;
            _resultValue.duration = duration;
            _resultValue.end = end;
            _resultValue.id = id;
            _resultValue.mac = mac;
            _resultValue.orgId = orgId;
            _resultValue.siteId = siteId;
            _resultValue.start = start;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
