// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatError;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatFan;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatPic;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatPoe;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatPsus;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatTemperature;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsDeviceGatewayStatModule2StatVcLink;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGatewayStatsDeviceGatewayStatModule2Stat {
    private String backupVersion;
    private String biosVersion;
    private String cpldVersion;
    /**
     * @return used to report all error states the device node is running into.
     * An error should always have `type` and `since` fields, and could have some other fields specific to that type.
     * 
     */
    private List<GetGatewayStatsDeviceGatewayStatModule2StatError> errors;
    private List<GetGatewayStatsDeviceGatewayStatModule2StatFan> fans;
    private String fpgaVersion;
    private Double lastSeen;
    private String model;
    private String opticsCpldVersion;
    private String pendingVersion;
    private List<GetGatewayStatsDeviceGatewayStatModule2StatPic> pics;
    private GetGatewayStatsDeviceGatewayStatModule2StatPoe poe;
    private String poeVersion;
    private String powerCpldVersion;
    private List<GetGatewayStatsDeviceGatewayStatModule2StatPsus> psuses;
    private String reFpgaVersion;
    private String recoveryVersion;
    private String serial;
    private String status;
    private List<GetGatewayStatsDeviceGatewayStatModule2StatTemperature> temperatures;
    private String tmcFpgaVersion;
    private String ubootVersion;
    private Integer uptime;
    private List<GetGatewayStatsDeviceGatewayStatModule2StatVcLink> vcLinks;
    private String vcMode;
    /**
     * @return master / backup / linecard
     * 
     */
    private String vcRole;
    private String vcState;
    private String version;

    private GetGatewayStatsDeviceGatewayStatModule2Stat() {}
    public String backupVersion() {
        return this.backupVersion;
    }
    public String biosVersion() {
        return this.biosVersion;
    }
    public String cpldVersion() {
        return this.cpldVersion;
    }
    /**
     * @return used to report all error states the device node is running into.
     * An error should always have `type` and `since` fields, and could have some other fields specific to that type.
     * 
     */
    public List<GetGatewayStatsDeviceGatewayStatModule2StatError> errors() {
        return this.errors;
    }
    public List<GetGatewayStatsDeviceGatewayStatModule2StatFan> fans() {
        return this.fans;
    }
    public String fpgaVersion() {
        return this.fpgaVersion;
    }
    public Double lastSeen() {
        return this.lastSeen;
    }
    public String model() {
        return this.model;
    }
    public String opticsCpldVersion() {
        return this.opticsCpldVersion;
    }
    public String pendingVersion() {
        return this.pendingVersion;
    }
    public List<GetGatewayStatsDeviceGatewayStatModule2StatPic> pics() {
        return this.pics;
    }
    public GetGatewayStatsDeviceGatewayStatModule2StatPoe poe() {
        return this.poe;
    }
    public String poeVersion() {
        return this.poeVersion;
    }
    public String powerCpldVersion() {
        return this.powerCpldVersion;
    }
    public List<GetGatewayStatsDeviceGatewayStatModule2StatPsus> psuses() {
        return this.psuses;
    }
    public String reFpgaVersion() {
        return this.reFpgaVersion;
    }
    public String recoveryVersion() {
        return this.recoveryVersion;
    }
    public String serial() {
        return this.serial;
    }
    public String status() {
        return this.status;
    }
    public List<GetGatewayStatsDeviceGatewayStatModule2StatTemperature> temperatures() {
        return this.temperatures;
    }
    public String tmcFpgaVersion() {
        return this.tmcFpgaVersion;
    }
    public String ubootVersion() {
        return this.ubootVersion;
    }
    public Integer uptime() {
        return this.uptime;
    }
    public List<GetGatewayStatsDeviceGatewayStatModule2StatVcLink> vcLinks() {
        return this.vcLinks;
    }
    public String vcMode() {
        return this.vcMode;
    }
    /**
     * @return master / backup / linecard
     * 
     */
    public String vcRole() {
        return this.vcRole;
    }
    public String vcState() {
        return this.vcState;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayStatsDeviceGatewayStatModule2Stat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupVersion;
        private String biosVersion;
        private String cpldVersion;
        private List<GetGatewayStatsDeviceGatewayStatModule2StatError> errors;
        private List<GetGatewayStatsDeviceGatewayStatModule2StatFan> fans;
        private String fpgaVersion;
        private Double lastSeen;
        private String model;
        private String opticsCpldVersion;
        private String pendingVersion;
        private List<GetGatewayStatsDeviceGatewayStatModule2StatPic> pics;
        private GetGatewayStatsDeviceGatewayStatModule2StatPoe poe;
        private String poeVersion;
        private String powerCpldVersion;
        private List<GetGatewayStatsDeviceGatewayStatModule2StatPsus> psuses;
        private String reFpgaVersion;
        private String recoveryVersion;
        private String serial;
        private String status;
        private List<GetGatewayStatsDeviceGatewayStatModule2StatTemperature> temperatures;
        private String tmcFpgaVersion;
        private String ubootVersion;
        private Integer uptime;
        private List<GetGatewayStatsDeviceGatewayStatModule2StatVcLink> vcLinks;
        private String vcMode;
        private String vcRole;
        private String vcState;
        private String version;
        public Builder() {}
        public Builder(GetGatewayStatsDeviceGatewayStatModule2Stat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVersion = defaults.backupVersion;
    	      this.biosVersion = defaults.biosVersion;
    	      this.cpldVersion = defaults.cpldVersion;
    	      this.errors = defaults.errors;
    	      this.fans = defaults.fans;
    	      this.fpgaVersion = defaults.fpgaVersion;
    	      this.lastSeen = defaults.lastSeen;
    	      this.model = defaults.model;
    	      this.opticsCpldVersion = defaults.opticsCpldVersion;
    	      this.pendingVersion = defaults.pendingVersion;
    	      this.pics = defaults.pics;
    	      this.poe = defaults.poe;
    	      this.poeVersion = defaults.poeVersion;
    	      this.powerCpldVersion = defaults.powerCpldVersion;
    	      this.psuses = defaults.psuses;
    	      this.reFpgaVersion = defaults.reFpgaVersion;
    	      this.recoveryVersion = defaults.recoveryVersion;
    	      this.serial = defaults.serial;
    	      this.status = defaults.status;
    	      this.temperatures = defaults.temperatures;
    	      this.tmcFpgaVersion = defaults.tmcFpgaVersion;
    	      this.ubootVersion = defaults.ubootVersion;
    	      this.uptime = defaults.uptime;
    	      this.vcLinks = defaults.vcLinks;
    	      this.vcMode = defaults.vcMode;
    	      this.vcRole = defaults.vcRole;
    	      this.vcState = defaults.vcState;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder backupVersion(String backupVersion) {
            if (backupVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "backupVersion");
            }
            this.backupVersion = backupVersion;
            return this;
        }
        @CustomType.Setter
        public Builder biosVersion(String biosVersion) {
            if (biosVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "biosVersion");
            }
            this.biosVersion = biosVersion;
            return this;
        }
        @CustomType.Setter
        public Builder cpldVersion(String cpldVersion) {
            if (cpldVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "cpldVersion");
            }
            this.cpldVersion = cpldVersion;
            return this;
        }
        @CustomType.Setter
        public Builder errors(List<GetGatewayStatsDeviceGatewayStatModule2StatError> errors) {
            if (errors == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "errors");
            }
            this.errors = errors;
            return this;
        }
        public Builder errors(GetGatewayStatsDeviceGatewayStatModule2StatError... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder fans(List<GetGatewayStatsDeviceGatewayStatModule2StatFan> fans) {
            if (fans == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "fans");
            }
            this.fans = fans;
            return this;
        }
        public Builder fans(GetGatewayStatsDeviceGatewayStatModule2StatFan... fans) {
            return fans(List.of(fans));
        }
        @CustomType.Setter
        public Builder fpgaVersion(String fpgaVersion) {
            if (fpgaVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "fpgaVersion");
            }
            this.fpgaVersion = fpgaVersion;
            return this;
        }
        @CustomType.Setter
        public Builder lastSeen(Double lastSeen) {
            if (lastSeen == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "lastSeen");
            }
            this.lastSeen = lastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder model(String model) {
            if (model == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "model");
            }
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder opticsCpldVersion(String opticsCpldVersion) {
            if (opticsCpldVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "opticsCpldVersion");
            }
            this.opticsCpldVersion = opticsCpldVersion;
            return this;
        }
        @CustomType.Setter
        public Builder pendingVersion(String pendingVersion) {
            if (pendingVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "pendingVersion");
            }
            this.pendingVersion = pendingVersion;
            return this;
        }
        @CustomType.Setter
        public Builder pics(List<GetGatewayStatsDeviceGatewayStatModule2StatPic> pics) {
            if (pics == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "pics");
            }
            this.pics = pics;
            return this;
        }
        public Builder pics(GetGatewayStatsDeviceGatewayStatModule2StatPic... pics) {
            return pics(List.of(pics));
        }
        @CustomType.Setter
        public Builder poe(GetGatewayStatsDeviceGatewayStatModule2StatPoe poe) {
            if (poe == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "poe");
            }
            this.poe = poe;
            return this;
        }
        @CustomType.Setter
        public Builder poeVersion(String poeVersion) {
            if (poeVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "poeVersion");
            }
            this.poeVersion = poeVersion;
            return this;
        }
        @CustomType.Setter
        public Builder powerCpldVersion(String powerCpldVersion) {
            if (powerCpldVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "powerCpldVersion");
            }
            this.powerCpldVersion = powerCpldVersion;
            return this;
        }
        @CustomType.Setter
        public Builder psuses(List<GetGatewayStatsDeviceGatewayStatModule2StatPsus> psuses) {
            if (psuses == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "psuses");
            }
            this.psuses = psuses;
            return this;
        }
        public Builder psuses(GetGatewayStatsDeviceGatewayStatModule2StatPsus... psuses) {
            return psuses(List.of(psuses));
        }
        @CustomType.Setter
        public Builder reFpgaVersion(String reFpgaVersion) {
            if (reFpgaVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "reFpgaVersion");
            }
            this.reFpgaVersion = reFpgaVersion;
            return this;
        }
        @CustomType.Setter
        public Builder recoveryVersion(String recoveryVersion) {
            if (recoveryVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "recoveryVersion");
            }
            this.recoveryVersion = recoveryVersion;
            return this;
        }
        @CustomType.Setter
        public Builder serial(String serial) {
            if (serial == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "serial");
            }
            this.serial = serial;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder temperatures(List<GetGatewayStatsDeviceGatewayStatModule2StatTemperature> temperatures) {
            if (temperatures == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "temperatures");
            }
            this.temperatures = temperatures;
            return this;
        }
        public Builder temperatures(GetGatewayStatsDeviceGatewayStatModule2StatTemperature... temperatures) {
            return temperatures(List.of(temperatures));
        }
        @CustomType.Setter
        public Builder tmcFpgaVersion(String tmcFpgaVersion) {
            if (tmcFpgaVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "tmcFpgaVersion");
            }
            this.tmcFpgaVersion = tmcFpgaVersion;
            return this;
        }
        @CustomType.Setter
        public Builder ubootVersion(String ubootVersion) {
            if (ubootVersion == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "ubootVersion");
            }
            this.ubootVersion = ubootVersion;
            return this;
        }
        @CustomType.Setter
        public Builder uptime(Integer uptime) {
            if (uptime == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "uptime");
            }
            this.uptime = uptime;
            return this;
        }
        @CustomType.Setter
        public Builder vcLinks(List<GetGatewayStatsDeviceGatewayStatModule2StatVcLink> vcLinks) {
            if (vcLinks == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "vcLinks");
            }
            this.vcLinks = vcLinks;
            return this;
        }
        public Builder vcLinks(GetGatewayStatsDeviceGatewayStatModule2StatVcLink... vcLinks) {
            return vcLinks(List.of(vcLinks));
        }
        @CustomType.Setter
        public Builder vcMode(String vcMode) {
            if (vcMode == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "vcMode");
            }
            this.vcMode = vcMode;
            return this;
        }
        @CustomType.Setter
        public Builder vcRole(String vcRole) {
            if (vcRole == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "vcRole");
            }
            this.vcRole = vcRole;
            return this;
        }
        @CustomType.Setter
        public Builder vcState(String vcState) {
            if (vcState == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "vcState");
            }
            this.vcState = vcState;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetGatewayStatsDeviceGatewayStatModule2Stat", "version");
            }
            this.version = version;
            return this;
        }
        public GetGatewayStatsDeviceGatewayStatModule2Stat build() {
            final var _resultValue = new GetGatewayStatsDeviceGatewayStatModule2Stat();
            _resultValue.backupVersion = backupVersion;
            _resultValue.biosVersion = biosVersion;
            _resultValue.cpldVersion = cpldVersion;
            _resultValue.errors = errors;
            _resultValue.fans = fans;
            _resultValue.fpgaVersion = fpgaVersion;
            _resultValue.lastSeen = lastSeen;
            _resultValue.model = model;
            _resultValue.opticsCpldVersion = opticsCpldVersion;
            _resultValue.pendingVersion = pendingVersion;
            _resultValue.pics = pics;
            _resultValue.poe = poe;
            _resultValue.poeVersion = poeVersion;
            _resultValue.powerCpldVersion = powerCpldVersion;
            _resultValue.psuses = psuses;
            _resultValue.reFpgaVersion = reFpgaVersion;
            _resultValue.recoveryVersion = recoveryVersion;
            _resultValue.serial = serial;
            _resultValue.status = status;
            _resultValue.temperatures = temperatures;
            _resultValue.tmcFpgaVersion = tmcFpgaVersion;
            _resultValue.ubootVersion = ubootVersion;
            _resultValue.uptime = uptime;
            _resultValue.vcLinks = vcLinks;
            _resultValue.vcMode = vcMode;
            _resultValue.vcRole = vcRole;
            _resultValue.vcState = vcState;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}