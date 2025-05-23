// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatL2tpStatSession {
    /**
     * @return Remote sessions id (dynamically unless Tunnel is said to be static)
     * 
     */
    private Integer localSid;
    /**
     * @return WxlanTunnel Remote ID (user-configured)
     * 
     */
    private String remoteId;
    /**
     * @return Remote sessions id (dynamically unless Tunnel is said to be static)
     * 
     */
    private Integer remoteSid;
    /**
     * @return enum: `established`, `established_with_session`, `idle`, `wait-ctrl-conn`, `wait-ctrl-reply`
     * 
     */
    private String state;

    private GetApStatsDeviceApStatL2tpStatSession() {}
    /**
     * @return Remote sessions id (dynamically unless Tunnel is said to be static)
     * 
     */
    public Integer localSid() {
        return this.localSid;
    }
    /**
     * @return WxlanTunnel Remote ID (user-configured)
     * 
     */
    public String remoteId() {
        return this.remoteId;
    }
    /**
     * @return Remote sessions id (dynamically unless Tunnel is said to be static)
     * 
     */
    public Integer remoteSid() {
        return this.remoteSid;
    }
    /**
     * @return enum: `established`, `established_with_session`, `idle`, `wait-ctrl-conn`, `wait-ctrl-reply`
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatL2tpStatSession defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer localSid;
        private String remoteId;
        private Integer remoteSid;
        private String state;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatL2tpStatSession defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSid = defaults.localSid;
    	      this.remoteId = defaults.remoteId;
    	      this.remoteSid = defaults.remoteSid;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder localSid(Integer localSid) {
            if (localSid == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStatSession", "localSid");
            }
            this.localSid = localSid;
            return this;
        }
        @CustomType.Setter
        public Builder remoteId(String remoteId) {
            if (remoteId == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStatSession", "remoteId");
            }
            this.remoteId = remoteId;
            return this;
        }
        @CustomType.Setter
        public Builder remoteSid(Integer remoteSid) {
            if (remoteSid == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStatSession", "remoteSid");
            }
            this.remoteSid = remoteSid;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatL2tpStatSession", "state");
            }
            this.state = state;
            return this;
        }
        public GetApStatsDeviceApStatL2tpStatSession build() {
            final var _resultValue = new GetApStatsDeviceApStatL2tpStatSession();
            _resultValue.localSid = localSid;
            _resultValue.remoteId = remoteId;
            _resultValue.remoteSid = remoteSid;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
