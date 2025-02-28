// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchNetworksArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchNetworksArgs Empty = new SwitchNetworksArgs();

    /**
     * Only required for EVPN-VXLAN networks, IPv4 Virtual Gateway
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return Only required for EVPN-VXLAN networks, IPv4 Virtual Gateway
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * Only required for EVPN-VXLAN networks, IPv6 Virtual Gateway
     * 
     */
    @Import(name="gateway6")
    private @Nullable Output<String> gateway6;

    /**
     * @return Only required for EVPN-VXLAN networks, IPv6 Virtual Gateway
     * 
     */
    public Optional<Output<String>> gateway6() {
        return Optional.ofNullable(this.gateway6);
    }

    /**
     * whether to stop clients to talk to each other, default is false (when enabled, a unique isolation_vlan_id is required). NOTE: this features requires uplink device to also a be Juniper device and `inter_switch_link` to be set
     * 
     */
    @Import(name="isolation")
    private @Nullable Output<Boolean> isolation;

    /**
     * @return whether to stop clients to talk to each other, default is false (when enabled, a unique isolation_vlan_id is required). NOTE: this features requires uplink device to also a be Juniper device and `inter_switch_link` to be set
     * 
     */
    public Optional<Output<Boolean>> isolation() {
        return Optional.ofNullable(this.isolation);
    }

    @Import(name="isolationVlanId")
    private @Nullable Output<String> isolationVlanId;

    public Optional<Output<String>> isolationVlanId() {
        return Optional.ofNullable(this.isolationVlanId);
    }

    /**
     * Optional for pure switching, required when L3 / routing features are used
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<String> subnet;

    /**
     * @return Optional for pure switching, required when L3 / routing features are used
     * 
     */
    public Optional<Output<String>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * Optional for pure switching, required when L3 / routing features are used
     * 
     */
    @Import(name="subnet6")
    private @Nullable Output<String> subnet6;

    /**
     * @return Optional for pure switching, required when L3 / routing features are used
     * 
     */
    public Optional<Output<String>> subnet6() {
        return Optional.ofNullable(this.subnet6);
    }

    @Import(name="vlanId", required=true)
    private Output<String> vlanId;

    public Output<String> vlanId() {
        return this.vlanId;
    }

    private SwitchNetworksArgs() {}

    private SwitchNetworksArgs(SwitchNetworksArgs $) {
        this.gateway = $.gateway;
        this.gateway6 = $.gateway6;
        this.isolation = $.isolation;
        this.isolationVlanId = $.isolationVlanId;
        this.subnet = $.subnet;
        this.subnet6 = $.subnet6;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchNetworksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchNetworksArgs $;

        public Builder() {
            $ = new SwitchNetworksArgs();
        }

        public Builder(SwitchNetworksArgs defaults) {
            $ = new SwitchNetworksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gateway Only required for EVPN-VXLAN networks, IPv4 Virtual Gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway Only required for EVPN-VXLAN networks, IPv4 Virtual Gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param gateway6 Only required for EVPN-VXLAN networks, IPv6 Virtual Gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway6(@Nullable Output<String> gateway6) {
            $.gateway6 = gateway6;
            return this;
        }

        /**
         * @param gateway6 Only required for EVPN-VXLAN networks, IPv6 Virtual Gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway6(String gateway6) {
            return gateway6(Output.of(gateway6));
        }

        /**
         * @param isolation whether to stop clients to talk to each other, default is false (when enabled, a unique isolation_vlan_id is required). NOTE: this features requires uplink device to also a be Juniper device and `inter_switch_link` to be set
         * 
         * @return builder
         * 
         */
        public Builder isolation(@Nullable Output<Boolean> isolation) {
            $.isolation = isolation;
            return this;
        }

        /**
         * @param isolation whether to stop clients to talk to each other, default is false (when enabled, a unique isolation_vlan_id is required). NOTE: this features requires uplink device to also a be Juniper device and `inter_switch_link` to be set
         * 
         * @return builder
         * 
         */
        public Builder isolation(Boolean isolation) {
            return isolation(Output.of(isolation));
        }

        public Builder isolationVlanId(@Nullable Output<String> isolationVlanId) {
            $.isolationVlanId = isolationVlanId;
            return this;
        }

        public Builder isolationVlanId(String isolationVlanId) {
            return isolationVlanId(Output.of(isolationVlanId));
        }

        /**
         * @param subnet Optional for pure switching, required when L3 / routing features are used
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<String> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet Optional for pure switching, required when L3 / routing features are used
         * 
         * @return builder
         * 
         */
        public Builder subnet(String subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param subnet6 Optional for pure switching, required when L3 / routing features are used
         * 
         * @return builder
         * 
         */
        public Builder subnet6(@Nullable Output<String> subnet6) {
            $.subnet6 = subnet6;
            return this;
        }

        /**
         * @param subnet6 Optional for pure switching, required when L3 / routing features are used
         * 
         * @return builder
         * 
         */
        public Builder subnet6(String subnet6) {
            return subnet6(Output.of(subnet6));
        }

        public Builder vlanId(Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public SwitchNetworksArgs build() {
            if ($.vlanId == null) {
                throw new MissingRequiredPropertyException("SwitchNetworksArgs", "vlanId");
            }
            return $;
        }
    }

}
