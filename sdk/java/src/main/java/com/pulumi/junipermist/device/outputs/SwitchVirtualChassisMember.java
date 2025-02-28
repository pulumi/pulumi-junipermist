// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SwitchVirtualChassisMember {
    /**
     * @return fpc0, same as the mac of device_id
     * 
     */
    private String mac;
    private Integer memberId;
    /**
     * @return Both vc_role master and backup will be matched to routing-engine role in Junos preprovisioned VC config. enum: `backup`, `linecard`, `master`
     * 
     */
    private String vcRole;

    private SwitchVirtualChassisMember() {}
    /**
     * @return fpc0, same as the mac of device_id
     * 
     */
    public String mac() {
        return this.mac;
    }
    public Integer memberId() {
        return this.memberId;
    }
    /**
     * @return Both vc_role master and backup will be matched to routing-engine role in Junos preprovisioned VC config. enum: `backup`, `linecard`, `master`
     * 
     */
    public String vcRole() {
        return this.vcRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchVirtualChassisMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mac;
        private Integer memberId;
        private String vcRole;
        public Builder() {}
        public Builder(SwitchVirtualChassisMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mac = defaults.mac;
    	      this.memberId = defaults.memberId;
    	      this.vcRole = defaults.vcRole;
        }

        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("SwitchVirtualChassisMember", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder memberId(Integer memberId) {
            if (memberId == null) {
              throw new MissingRequiredPropertyException("SwitchVirtualChassisMember", "memberId");
            }
            this.memberId = memberId;
            return this;
        }
        @CustomType.Setter
        public Builder vcRole(String vcRole) {
            if (vcRole == null) {
              throw new MissingRequiredPropertyException("SwitchVirtualChassisMember", "vcRole");
            }
            this.vcRole = vcRole;
            return this;
        }
        public SwitchVirtualChassisMember build() {
            final var _resultValue = new SwitchVirtualChassisMember();
            _resultValue.mac = mac;
            _resultValue.memberId = memberId;
            _resultValue.vcRole = vcRole;
            return _resultValue;
        }
    }
}
