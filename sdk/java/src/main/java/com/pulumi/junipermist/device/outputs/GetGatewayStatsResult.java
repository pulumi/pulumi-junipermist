// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStat;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGatewayStatsResult {
    private List<GetGatewayStatsDeviceGatewayStat> deviceGatewayStats;
    /**
     * @return Duration like 7d, 2w
     * 
     */
    private @Nullable String duration;
    /**
     * @return End datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
    private @Nullable Integer end;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String mac;
    private String orgId;
    private @Nullable String siteId;
    /**
     * @return Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    private @Nullable Integer start;
    /**
     * @return enum: `all`, `connected`, `disconnected`
     * 
     */
    private @Nullable String status;

    private GetGatewayStatsResult() {}
    public List<GetGatewayStatsDeviceGatewayStat> deviceGatewayStats() {
        return this.deviceGatewayStats;
    }
    /**
     * @return Duration like 7d, 2w
     * 
     */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * @return End datetime, can be epoch or relative time like -1d, -2h; now if not specified
     * 
     */
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
    /**
     * @return Start datetime, can be epoch or relative time like -1d, -1w; -1d if not specified
     * 
     */
    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }
    /**
     * @return enum: `all`, `connected`, `disconnected`
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGatewayStatsDeviceGatewayStat> deviceGatewayStats;
        private @Nullable String duration;
        private @Nullable Integer end;
        private String id;
        private @Nullable String mac;
        private String orgId;
        private @Nullable String siteId;
        private @Nullable Integer start;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetGatewayStatsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceGatewayStats = defaults.deviceGatewayStats;
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
        public Builder deviceGatewayStats(List<GetGatewayStatsDeviceGatewayStat> deviceGatewayStats) {
            if (deviceGatewayStats == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsResult", "deviceGatewayStats");
            }
            this.deviceGatewayStats = deviceGatewayStats;
            return this;
        }
        public Builder deviceGatewayStats(GetGatewayStatsDeviceGatewayStat... deviceGatewayStats) {
            return deviceGatewayStats(List.of(deviceGatewayStats));
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
              throw new MissingRequiredPropertyException("GetGatewayStatsResult", "id");
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
              throw new MissingRequiredPropertyException("GetGatewayStatsResult", "orgId");
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
        public GetGatewayStatsResult build() {
            final var _resultValue = new GetGatewayStatsResult();
            _resultValue.deviceGatewayStats = deviceGatewayStats;
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
