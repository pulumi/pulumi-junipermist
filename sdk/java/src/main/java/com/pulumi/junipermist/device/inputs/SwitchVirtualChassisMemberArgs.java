// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchVirtualChassisMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchVirtualChassisMemberArgs Empty = new SwitchVirtualChassisMemberArgs();

    /**
     * fpc0, same as the mac of device_id
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return fpc0, same as the mac of device_id
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    @Import(name="memberId")
    private @Nullable Output<Integer> memberId;

    public Optional<Output<Integer>> memberId() {
        return Optional.ofNullable(this.memberId);
    }

    /**
     * Both vc_role master and backup will be matched to routing-engine role in Junos preprovisioned VC config. enum: `backup`, `linecard`, `master`
     * 
     */
    @Import(name="vcRole")
    private @Nullable Output<String> vcRole;

    /**
     * @return Both vc_role master and backup will be matched to routing-engine role in Junos preprovisioned VC config. enum: `backup`, `linecard`, `master`
     * 
     */
    public Optional<Output<String>> vcRole() {
        return Optional.ofNullable(this.vcRole);
    }

    private SwitchVirtualChassisMemberArgs() {}

    private SwitchVirtualChassisMemberArgs(SwitchVirtualChassisMemberArgs $) {
        this.mac = $.mac;
        this.memberId = $.memberId;
        this.vcRole = $.vcRole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchVirtualChassisMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchVirtualChassisMemberArgs $;

        public Builder() {
            $ = new SwitchVirtualChassisMemberArgs();
        }

        public Builder(SwitchVirtualChassisMemberArgs defaults) {
            $ = new SwitchVirtualChassisMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mac fpc0, same as the mac of device_id
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac fpc0, same as the mac of device_id
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        public Builder memberId(@Nullable Output<Integer> memberId) {
            $.memberId = memberId;
            return this;
        }

        public Builder memberId(Integer memberId) {
            return memberId(Output.of(memberId));
        }

        /**
         * @param vcRole Both vc_role master and backup will be matched to routing-engine role in Junos preprovisioned VC config. enum: `backup`, `linecard`, `master`
         * 
         * @return builder
         * 
         */
        public Builder vcRole(@Nullable Output<String> vcRole) {
            $.vcRole = vcRole;
            return this;
        }

        /**
         * @param vcRole Both vc_role master and backup will be matched to routing-engine role in Junos preprovisioned VC config. enum: `backup`, `linecard`, `master`
         * 
         * @return builder
         * 
         */
        public Builder vcRole(String vcRole) {
            return vcRole(Output.of(vcRole));
        }

        public SwitchVirtualChassisMemberArgs build() {
            return $;
        }
    }

}
