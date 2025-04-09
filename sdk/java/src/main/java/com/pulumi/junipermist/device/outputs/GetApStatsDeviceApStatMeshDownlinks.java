// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApStatsDeviceApStatMeshDownlinks {
    private String band;
    private Integer channel;
    private Integer idleTime;
    /**
     * @return Last seen timestamp
     * 
     */
    private Double lastSeen;
    private String proto;
    private Integer rssi;
    /**
     * @return Rate of receiving traffic, bits/seconds, last known
     * 
     */
    private Integer rxBps;
    /**
     * @return Amount of traffic received since connection
     * 
     */
    private Integer rxBytes;
    /**
     * @return Amount of packets received since connection
     * 
     */
    private Integer rxPackets;
    /**
     * @return RX Rate, Mbps
     * 
     */
    private Double rxRate;
    /**
     * @return Amount of rx retries
     * 
     */
    private Integer rxRetries;
    private String siteId;
    private Integer snr;
    /**
     * @return Rate of transmitting traffic, bits/seconds, last known
     * 
     */
    private Integer txBps;
    /**
     * @return Amount of traffic sent since connection
     * 
     */
    private Integer txBytes;
    /**
     * @return Amount of packets sent since connection
     * 
     */
    private Integer txPackets;
    /**
     * @return TX Rate, Mbps
     * 
     */
    private Double txRate;
    /**
     * @return Amount of tx retries
     * 
     */
    private Integer txRetries;

    private GetApStatsDeviceApStatMeshDownlinks() {}
    public String band() {
        return this.band;
    }
    public Integer channel() {
        return this.channel;
    }
    public Integer idleTime() {
        return this.idleTime;
    }
    /**
     * @return Last seen timestamp
     * 
     */
    public Double lastSeen() {
        return this.lastSeen;
    }
    public String proto() {
        return this.proto;
    }
    public Integer rssi() {
        return this.rssi;
    }
    /**
     * @return Rate of receiving traffic, bits/seconds, last known
     * 
     */
    public Integer rxBps() {
        return this.rxBps;
    }
    /**
     * @return Amount of traffic received since connection
     * 
     */
    public Integer rxBytes() {
        return this.rxBytes;
    }
    /**
     * @return Amount of packets received since connection
     * 
     */
    public Integer rxPackets() {
        return this.rxPackets;
    }
    /**
     * @return RX Rate, Mbps
     * 
     */
    public Double rxRate() {
        return this.rxRate;
    }
    /**
     * @return Amount of rx retries
     * 
     */
    public Integer rxRetries() {
        return this.rxRetries;
    }
    public String siteId() {
        return this.siteId;
    }
    public Integer snr() {
        return this.snr;
    }
    /**
     * @return Rate of transmitting traffic, bits/seconds, last known
     * 
     */
    public Integer txBps() {
        return this.txBps;
    }
    /**
     * @return Amount of traffic sent since connection
     * 
     */
    public Integer txBytes() {
        return this.txBytes;
    }
    /**
     * @return Amount of packets sent since connection
     * 
     */
    public Integer txPackets() {
        return this.txPackets;
    }
    /**
     * @return TX Rate, Mbps
     * 
     */
    public Double txRate() {
        return this.txRate;
    }
    /**
     * @return Amount of tx retries
     * 
     */
    public Integer txRetries() {
        return this.txRetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApStatsDeviceApStatMeshDownlinks defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String band;
        private Integer channel;
        private Integer idleTime;
        private Double lastSeen;
        private String proto;
        private Integer rssi;
        private Integer rxBps;
        private Integer rxBytes;
        private Integer rxPackets;
        private Double rxRate;
        private Integer rxRetries;
        private String siteId;
        private Integer snr;
        private Integer txBps;
        private Integer txBytes;
        private Integer txPackets;
        private Double txRate;
        private Integer txRetries;
        public Builder() {}
        public Builder(GetApStatsDeviceApStatMeshDownlinks defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.band = defaults.band;
    	      this.channel = defaults.channel;
    	      this.idleTime = defaults.idleTime;
    	      this.lastSeen = defaults.lastSeen;
    	      this.proto = defaults.proto;
    	      this.rssi = defaults.rssi;
    	      this.rxBps = defaults.rxBps;
    	      this.rxBytes = defaults.rxBytes;
    	      this.rxPackets = defaults.rxPackets;
    	      this.rxRate = defaults.rxRate;
    	      this.rxRetries = defaults.rxRetries;
    	      this.siteId = defaults.siteId;
    	      this.snr = defaults.snr;
    	      this.txBps = defaults.txBps;
    	      this.txBytes = defaults.txBytes;
    	      this.txPackets = defaults.txPackets;
    	      this.txRate = defaults.txRate;
    	      this.txRetries = defaults.txRetries;
        }

        @CustomType.Setter
        public Builder band(String band) {
            if (band == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "band");
            }
            this.band = band;
            return this;
        }
        @CustomType.Setter
        public Builder channel(Integer channel) {
            if (channel == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "channel");
            }
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder idleTime(Integer idleTime) {
            if (idleTime == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "idleTime");
            }
            this.idleTime = idleTime;
            return this;
        }
        @CustomType.Setter
        public Builder lastSeen(Double lastSeen) {
            if (lastSeen == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "lastSeen");
            }
            this.lastSeen = lastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder proto(String proto) {
            if (proto == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "proto");
            }
            this.proto = proto;
            return this;
        }
        @CustomType.Setter
        public Builder rssi(Integer rssi) {
            if (rssi == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "rssi");
            }
            this.rssi = rssi;
            return this;
        }
        @CustomType.Setter
        public Builder rxBps(Integer rxBps) {
            if (rxBps == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "rxBps");
            }
            this.rxBps = rxBps;
            return this;
        }
        @CustomType.Setter
        public Builder rxBytes(Integer rxBytes) {
            if (rxBytes == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "rxBytes");
            }
            this.rxBytes = rxBytes;
            return this;
        }
        @CustomType.Setter
        public Builder rxPackets(Integer rxPackets) {
            if (rxPackets == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "rxPackets");
            }
            this.rxPackets = rxPackets;
            return this;
        }
        @CustomType.Setter
        public Builder rxRate(Double rxRate) {
            if (rxRate == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "rxRate");
            }
            this.rxRate = rxRate;
            return this;
        }
        @CustomType.Setter
        public Builder rxRetries(Integer rxRetries) {
            if (rxRetries == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "rxRetries");
            }
            this.rxRetries = rxRetries;
            return this;
        }
        @CustomType.Setter
        public Builder siteId(String siteId) {
            if (siteId == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "siteId");
            }
            this.siteId = siteId;
            return this;
        }
        @CustomType.Setter
        public Builder snr(Integer snr) {
            if (snr == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "snr");
            }
            this.snr = snr;
            return this;
        }
        @CustomType.Setter
        public Builder txBps(Integer txBps) {
            if (txBps == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "txBps");
            }
            this.txBps = txBps;
            return this;
        }
        @CustomType.Setter
        public Builder txBytes(Integer txBytes) {
            if (txBytes == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "txBytes");
            }
            this.txBytes = txBytes;
            return this;
        }
        @CustomType.Setter
        public Builder txPackets(Integer txPackets) {
            if (txPackets == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "txPackets");
            }
            this.txPackets = txPackets;
            return this;
        }
        @CustomType.Setter
        public Builder txRate(Double txRate) {
            if (txRate == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "txRate");
            }
            this.txRate = txRate;
            return this;
        }
        @CustomType.Setter
        public Builder txRetries(Integer txRetries) {
            if (txRetries == null) {
              throw new MissingRequiredPropertyException("GetApStatsDeviceApStatMeshDownlinks", "txRetries");
            }
            this.txRetries = txRetries;
            return this;
        }
        public GetApStatsDeviceApStatMeshDownlinks build() {
            final var _resultValue = new GetApStatsDeviceApStatMeshDownlinks();
            _resultValue.band = band;
            _resultValue.channel = channel;
            _resultValue.idleTime = idleTime;
            _resultValue.lastSeen = lastSeen;
            _resultValue.proto = proto;
            _resultValue.rssi = rssi;
            _resultValue.rxBps = rxBps;
            _resultValue.rxBytes = rxBytes;
            _resultValue.rxPackets = rxPackets;
            _resultValue.rxRate = rxRate;
            _resultValue.rxRetries = rxRetries;
            _resultValue.siteId = siteId;
            _resultValue.snr = snr;
            _resultValue.txBps = txBps;
            _resultValue.txBytes = txBytes;
            _resultValue.txPackets = txPackets;
            _resultValue.txRate = txRate;
            _resultValue.txRetries = txRetries;
            return _resultValue;
        }
    }
}
