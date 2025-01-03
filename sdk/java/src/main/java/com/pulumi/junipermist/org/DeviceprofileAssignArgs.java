// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeviceprofileAssignArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileAssignArgs Empty = new DeviceprofileAssignArgs();

    @Import(name="deviceprofileId", required=true)
    private Output<String> deviceprofileId;

    public Output<String> deviceprofileId() {
        return this.deviceprofileId;
    }

    @Import(name="macs", required=true)
    private Output<List<String>> macs;

    public Output<List<String>> macs() {
        return this.macs;
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    private DeviceprofileAssignArgs() {}

    private DeviceprofileAssignArgs(DeviceprofileAssignArgs $) {
        this.deviceprofileId = $.deviceprofileId;
        this.macs = $.macs;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileAssignArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileAssignArgs $;

        public Builder() {
            $ = new DeviceprofileAssignArgs();
        }

        public Builder(DeviceprofileAssignArgs defaults) {
            $ = new DeviceprofileAssignArgs(Objects.requireNonNull(defaults));
        }

        public Builder deviceprofileId(Output<String> deviceprofileId) {
            $.deviceprofileId = deviceprofileId;
            return this;
        }

        public Builder deviceprofileId(String deviceprofileId) {
            return deviceprofileId(Output.of(deviceprofileId));
        }

        public Builder macs(Output<List<String>> macs) {
            $.macs = macs;
            return this;
        }

        public Builder macs(List<String> macs) {
            return macs(Output.of(macs));
        }

        public Builder macs(String... macs) {
            return macs(List.of(macs));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public DeviceprofileAssignArgs build() {
            if ($.deviceprofileId == null) {
                throw new MissingRequiredPropertyException("DeviceprofileAssignArgs", "deviceprofileId");
            }
            if ($.macs == null) {
                throw new MissingRequiredPropertyException("DeviceprofileAssignArgs", "macs");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("DeviceprofileAssignArgs", "orgId");
            }
            return $;
        }
    }

}
