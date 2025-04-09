// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSwitchStatsDeviceSwitchStatCpuStat {
    /**
     * @return Percentage of CPU time that is idle
     * 
     */
    private Double idle;
    /**
     * @return Percentage of CPU time being used by interrupts
     * 
     */
    private Double interrupt;
    /**
     * @return Load averages for the last 1, 5, and 15 minutes
     * 
     */
    private List<Double> loadAvgs;
    /**
     * @return Percentage of CPU time being used by system processes
     * 
     */
    private Double system;
    /**
     * @return Percentage of CPU time being used by user processes
     * 
     */
    private Double user;

    private GetSwitchStatsDeviceSwitchStatCpuStat() {}
    /**
     * @return Percentage of CPU time that is idle
     * 
     */
    public Double idle() {
        return this.idle;
    }
    /**
     * @return Percentage of CPU time being used by interrupts
     * 
     */
    public Double interrupt() {
        return this.interrupt;
    }
    /**
     * @return Load averages for the last 1, 5, and 15 minutes
     * 
     */
    public List<Double> loadAvgs() {
        return this.loadAvgs;
    }
    /**
     * @return Percentage of CPU time being used by system processes
     * 
     */
    public Double system() {
        return this.system;
    }
    /**
     * @return Percentage of CPU time being used by user processes
     * 
     */
    public Double user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSwitchStatsDeviceSwitchStatCpuStat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double idle;
        private Double interrupt;
        private List<Double> loadAvgs;
        private Double system;
        private Double user;
        public Builder() {}
        public Builder(GetSwitchStatsDeviceSwitchStatCpuStat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.interrupt = defaults.interrupt;
    	      this.loadAvgs = defaults.loadAvgs;
    	      this.system = defaults.system;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder idle(Double idle) {
            if (idle == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatCpuStat", "idle");
            }
            this.idle = idle;
            return this;
        }
        @CustomType.Setter
        public Builder interrupt(Double interrupt) {
            if (interrupt == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatCpuStat", "interrupt");
            }
            this.interrupt = interrupt;
            return this;
        }
        @CustomType.Setter
        public Builder loadAvgs(List<Double> loadAvgs) {
            if (loadAvgs == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatCpuStat", "loadAvgs");
            }
            this.loadAvgs = loadAvgs;
            return this;
        }
        public Builder loadAvgs(Double... loadAvgs) {
            return loadAvgs(List.of(loadAvgs));
        }
        @CustomType.Setter
        public Builder system(Double system) {
            if (system == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatCpuStat", "system");
            }
            this.system = system;
            return this;
        }
        @CustomType.Setter
        public Builder user(Double user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetSwitchStatsDeviceSwitchStatCpuStat", "user");
            }
            this.user = user;
            return this;
        }
        public GetSwitchStatsDeviceSwitchStatCpuStat build() {
            final var _resultValue = new GetSwitchStatsDeviceSwitchStatCpuStat();
            _resultValue.idle = idle;
            _resultValue.interrupt = interrupt;
            _resultValue.loadAvgs = loadAvgs;
            _resultValue.system = system;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
