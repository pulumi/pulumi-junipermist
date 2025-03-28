// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsOverlay;
import com.pulumi.junipermist.org.outputs.GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsUnderlay;
import com.pulumi.junipermist.org.outputs.GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEvpnTopologiesOrgEvpnTopologyEvpnOptions {
    /**
     * @return optional, for dhcp*relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server*id-overrides
     * 
     */
    private String autoLoopbackSubnet;
    /**
     * @return optional, for dhcp*relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server*id-overrides
     * 
     */
    private String autoLoopbackSubnet6;
    /**
     * @return optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    private String autoRouterIdSubnet;
    /**
     * @return optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    private String autoRouterIdSubnet6;
    /**
     * @return optional, for ERB or CLOS, you can either use esilag to upstream routers or to also be the virtual-gateway. When `routed_at` != `core`, whether to do virtual-gateway at core as well
     * 
     */
    private Boolean coreAsBorder;
    private GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsOverlay overlay;
    /**
     * @return only for by Core-Distribution architecture when `evpn_options.routed_at`==`core`. By default, JUNOS uses 00-00-5e-00-01-01 as the virtual-gateway-address&#39;s v4*mac. If enabled, 00-00-5e-00-XX-YY will be used (where XX=vlan*id/256, YY=vlan_id%256)&#39;
     * 
     */
    private Boolean perVlanVgaV4Mac;
    /**
     * @return optional, where virtual-gateway should reside. enum: `core`, `distribution`, `edge`
     * 
     */
    private String routedAt;
    private GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsUnderlay underlay;
    /**
     * @return optional, for EX9200 only to seggregate virtual-switches
     * 
     */
    private Map<String,GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances> vsInstances;

    private GetEvpnTopologiesOrgEvpnTopologyEvpnOptions() {}
    /**
     * @return optional, for dhcp*relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server*id-overrides
     * 
     */
    public String autoLoopbackSubnet() {
        return this.autoLoopbackSubnet;
    }
    /**
     * @return optional, for dhcp*relay, unique loopback IPs are required for ERB or IPClos where we can set option-82 server*id-overrides
     * 
     */
    public String autoLoopbackSubnet6() {
        return this.autoLoopbackSubnet6;
    }
    /**
     * @return optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    public String autoRouterIdSubnet() {
        return this.autoRouterIdSubnet;
    }
    /**
     * @return optional, this generates router_id automatically, if specified, `router_id_prefix` is ignored
     * 
     */
    public String autoRouterIdSubnet6() {
        return this.autoRouterIdSubnet6;
    }
    /**
     * @return optional, for ERB or CLOS, you can either use esilag to upstream routers or to also be the virtual-gateway. When `routed_at` != `core`, whether to do virtual-gateway at core as well
     * 
     */
    public Boolean coreAsBorder() {
        return this.coreAsBorder;
    }
    public GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsOverlay overlay() {
        return this.overlay;
    }
    /**
     * @return only for by Core-Distribution architecture when `evpn_options.routed_at`==`core`. By default, JUNOS uses 00-00-5e-00-01-01 as the virtual-gateway-address&#39;s v4*mac. If enabled, 00-00-5e-00-XX-YY will be used (where XX=vlan*id/256, YY=vlan_id%256)&#39;
     * 
     */
    public Boolean perVlanVgaV4Mac() {
        return this.perVlanVgaV4Mac;
    }
    /**
     * @return optional, where virtual-gateway should reside. enum: `core`, `distribution`, `edge`
     * 
     */
    public String routedAt() {
        return this.routedAt;
    }
    public GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsUnderlay underlay() {
        return this.underlay;
    }
    /**
     * @return optional, for EX9200 only to seggregate virtual-switches
     * 
     */
    public Map<String,GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances> vsInstances() {
        return this.vsInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEvpnTopologiesOrgEvpnTopologyEvpnOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String autoLoopbackSubnet;
        private String autoLoopbackSubnet6;
        private String autoRouterIdSubnet;
        private String autoRouterIdSubnet6;
        private Boolean coreAsBorder;
        private GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsOverlay overlay;
        private Boolean perVlanVgaV4Mac;
        private String routedAt;
        private GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsUnderlay underlay;
        private Map<String,GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances> vsInstances;
        public Builder() {}
        public Builder(GetEvpnTopologiesOrgEvpnTopologyEvpnOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoLoopbackSubnet = defaults.autoLoopbackSubnet;
    	      this.autoLoopbackSubnet6 = defaults.autoLoopbackSubnet6;
    	      this.autoRouterIdSubnet = defaults.autoRouterIdSubnet;
    	      this.autoRouterIdSubnet6 = defaults.autoRouterIdSubnet6;
    	      this.coreAsBorder = defaults.coreAsBorder;
    	      this.overlay = defaults.overlay;
    	      this.perVlanVgaV4Mac = defaults.perVlanVgaV4Mac;
    	      this.routedAt = defaults.routedAt;
    	      this.underlay = defaults.underlay;
    	      this.vsInstances = defaults.vsInstances;
        }

        @CustomType.Setter
        public Builder autoLoopbackSubnet(String autoLoopbackSubnet) {
            if (autoLoopbackSubnet == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "autoLoopbackSubnet");
            }
            this.autoLoopbackSubnet = autoLoopbackSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder autoLoopbackSubnet6(String autoLoopbackSubnet6) {
            if (autoLoopbackSubnet6 == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "autoLoopbackSubnet6");
            }
            this.autoLoopbackSubnet6 = autoLoopbackSubnet6;
            return this;
        }
        @CustomType.Setter
        public Builder autoRouterIdSubnet(String autoRouterIdSubnet) {
            if (autoRouterIdSubnet == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "autoRouterIdSubnet");
            }
            this.autoRouterIdSubnet = autoRouterIdSubnet;
            return this;
        }
        @CustomType.Setter
        public Builder autoRouterIdSubnet6(String autoRouterIdSubnet6) {
            if (autoRouterIdSubnet6 == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "autoRouterIdSubnet6");
            }
            this.autoRouterIdSubnet6 = autoRouterIdSubnet6;
            return this;
        }
        @CustomType.Setter
        public Builder coreAsBorder(Boolean coreAsBorder) {
            if (coreAsBorder == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "coreAsBorder");
            }
            this.coreAsBorder = coreAsBorder;
            return this;
        }
        @CustomType.Setter
        public Builder overlay(GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsOverlay overlay) {
            if (overlay == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "overlay");
            }
            this.overlay = overlay;
            return this;
        }
        @CustomType.Setter
        public Builder perVlanVgaV4Mac(Boolean perVlanVgaV4Mac) {
            if (perVlanVgaV4Mac == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "perVlanVgaV4Mac");
            }
            this.perVlanVgaV4Mac = perVlanVgaV4Mac;
            return this;
        }
        @CustomType.Setter
        public Builder routedAt(String routedAt) {
            if (routedAt == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "routedAt");
            }
            this.routedAt = routedAt;
            return this;
        }
        @CustomType.Setter
        public Builder underlay(GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsUnderlay underlay) {
            if (underlay == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "underlay");
            }
            this.underlay = underlay;
            return this;
        }
        @CustomType.Setter
        public Builder vsInstances(Map<String,GetEvpnTopologiesOrgEvpnTopologyEvpnOptionsVsInstances> vsInstances) {
            if (vsInstances == null) {
              throw new MissingRequiredPropertyException("GetEvpnTopologiesOrgEvpnTopologyEvpnOptions", "vsInstances");
            }
            this.vsInstances = vsInstances;
            return this;
        }
        public GetEvpnTopologiesOrgEvpnTopologyEvpnOptions build() {
            final var _resultValue = new GetEvpnTopologiesOrgEvpnTopologyEvpnOptions();
            _resultValue.autoLoopbackSubnet = autoLoopbackSubnet;
            _resultValue.autoLoopbackSubnet6 = autoLoopbackSubnet6;
            _resultValue.autoRouterIdSubnet = autoRouterIdSubnet;
            _resultValue.autoRouterIdSubnet6 = autoRouterIdSubnet6;
            _resultValue.coreAsBorder = coreAsBorder;
            _resultValue.overlay = overlay;
            _resultValue.perVlanVgaV4Mac = perVlanVgaV4Mac;
            _resultValue.routedAt = routedAt;
            _resultValue.underlay = underlay;
            _resultValue.vsInstances = vsInstances;
            return _resultValue;
        }
    }
}
