// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetWlansOrgWlanRadsecServer;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWlansOrgWlanRadsec {
    private Boolean coaEnabled;
    private Boolean enabled;
    private String idleTimeout;
    /**
     * @return To use Org mxedges when this WLAN does not use mxtunnel, specify their mxcluster_ids. Org mxedge(s) identified by mxcluster_ids
     * 
     */
    private List<String> mxclusterIds;
    /**
     * @return Default is site.mxedge.radsec.proxy_hosts which must be a superset of all `wlans[*].radsec.proxy_hosts`. When `radsec.proxy_hosts` are not used, tunnel peers (org or site mxedges) are used irrespective of `use_site_mxedge`
     * 
     */
    private List<String> proxyHosts;
    /**
     * @return Name of the server to verify (against the cacerts in Org Setting). Only if not Mist Edge.
     * 
     */
    private String serverName;
    /**
     * @return List of RadSec Servers. Only if not Mist Edge.
     * 
     */
    private List<GetWlansOrgWlanRadsecServer> servers;
    /**
     * @return use mxedge(s) as RadSec Proxy
     * 
     */
    private Boolean useMxedge;
    /**
     * @return To use Site mxedges when this WLAN does not use mxtunnel
     * 
     */
    private Boolean useSiteMxedge;

    private GetWlansOrgWlanRadsec() {}
    public Boolean coaEnabled() {
        return this.coaEnabled;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public String idleTimeout() {
        return this.idleTimeout;
    }
    /**
     * @return To use Org mxedges when this WLAN does not use mxtunnel, specify their mxcluster_ids. Org mxedge(s) identified by mxcluster_ids
     * 
     */
    public List<String> mxclusterIds() {
        return this.mxclusterIds;
    }
    /**
     * @return Default is site.mxedge.radsec.proxy_hosts which must be a superset of all `wlans[*].radsec.proxy_hosts`. When `radsec.proxy_hosts` are not used, tunnel peers (org or site mxedges) are used irrespective of `use_site_mxedge`
     * 
     */
    public List<String> proxyHosts() {
        return this.proxyHosts;
    }
    /**
     * @return Name of the server to verify (against the cacerts in Org Setting). Only if not Mist Edge.
     * 
     */
    public String serverName() {
        return this.serverName;
    }
    /**
     * @return List of RadSec Servers. Only if not Mist Edge.
     * 
     */
    public List<GetWlansOrgWlanRadsecServer> servers() {
        return this.servers;
    }
    /**
     * @return use mxedge(s) as RadSec Proxy
     * 
     */
    public Boolean useMxedge() {
        return this.useMxedge;
    }
    /**
     * @return To use Site mxedges when this WLAN does not use mxtunnel
     * 
     */
    public Boolean useSiteMxedge() {
        return this.useSiteMxedge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansOrgWlanRadsec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean coaEnabled;
        private Boolean enabled;
        private String idleTimeout;
        private List<String> mxclusterIds;
        private List<String> proxyHosts;
        private String serverName;
        private List<GetWlansOrgWlanRadsecServer> servers;
        private Boolean useMxedge;
        private Boolean useSiteMxedge;
        public Builder() {}
        public Builder(GetWlansOrgWlanRadsec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coaEnabled = defaults.coaEnabled;
    	      this.enabled = defaults.enabled;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.mxclusterIds = defaults.mxclusterIds;
    	      this.proxyHosts = defaults.proxyHosts;
    	      this.serverName = defaults.serverName;
    	      this.servers = defaults.servers;
    	      this.useMxedge = defaults.useMxedge;
    	      this.useSiteMxedge = defaults.useSiteMxedge;
        }

        @CustomType.Setter
        public Builder coaEnabled(Boolean coaEnabled) {
            if (coaEnabled == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "coaEnabled");
            }
            this.coaEnabled = coaEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder idleTimeout(String idleTimeout) {
            if (idleTimeout == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "idleTimeout");
            }
            this.idleTimeout = idleTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder mxclusterIds(List<String> mxclusterIds) {
            if (mxclusterIds == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "mxclusterIds");
            }
            this.mxclusterIds = mxclusterIds;
            return this;
        }
        public Builder mxclusterIds(String... mxclusterIds) {
            return mxclusterIds(List.of(mxclusterIds));
        }
        @CustomType.Setter
        public Builder proxyHosts(List<String> proxyHosts) {
            if (proxyHosts == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "proxyHosts");
            }
            this.proxyHosts = proxyHosts;
            return this;
        }
        public Builder proxyHosts(String... proxyHosts) {
            return proxyHosts(List.of(proxyHosts));
        }
        @CustomType.Setter
        public Builder serverName(String serverName) {
            if (serverName == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "serverName");
            }
            this.serverName = serverName;
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<GetWlansOrgWlanRadsecServer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(GetWlansOrgWlanRadsecServer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder useMxedge(Boolean useMxedge) {
            if (useMxedge == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "useMxedge");
            }
            this.useMxedge = useMxedge;
            return this;
        }
        @CustomType.Setter
        public Builder useSiteMxedge(Boolean useSiteMxedge) {
            if (useSiteMxedge == null) {
              throw new MissingRequiredPropertyException("GetWlansOrgWlanRadsec", "useSiteMxedge");
            }
            this.useSiteMxedge = useSiteMxedge;
            return this;
        }
        public GetWlansOrgWlanRadsec build() {
            final var _resultValue = new GetWlansOrgWlanRadsec();
            _resultValue.coaEnabled = coaEnabled;
            _resultValue.enabled = enabled;
            _resultValue.idleTimeout = idleTimeout;
            _resultValue.mxclusterIds = mxclusterIds;
            _resultValue.proxyHosts = proxyHosts;
            _resultValue.serverName = serverName;
            _resultValue.servers = servers;
            _resultValue.useMxedge = useMxedge;
            _resultValue.useSiteMxedge = useSiteMxedge;
            return _resultValue;
        }
    }
}
