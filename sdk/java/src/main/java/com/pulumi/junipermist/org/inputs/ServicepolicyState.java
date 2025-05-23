// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.ServicepolicyAamwArgs;
import com.pulumi.junipermist.org.inputs.ServicepolicyAntivirusArgs;
import com.pulumi.junipermist.org.inputs.ServicepolicyAppqoeArgs;
import com.pulumi.junipermist.org.inputs.ServicepolicyEwfArgs;
import com.pulumi.junipermist.org.inputs.ServicepolicyIdpArgs;
import com.pulumi.junipermist.org.inputs.ServicepolicySslProxyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicepolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ServicepolicyState Empty = new ServicepolicyState();

    /**
     * For SRX Only
     * 
     */
    @Import(name="aamw")
    private @Nullable Output<ServicepolicyAamwArgs> aamw;

    /**
     * @return For SRX Only
     * 
     */
    public Optional<Output<ServicepolicyAamwArgs>> aamw() {
        return Optional.ofNullable(this.aamw);
    }

    /**
     * enum: `allow`, `deny`
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return enum: `allow`, `deny`
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * For SRX-only
     * 
     */
    @Import(name="antivirus")
    private @Nullable Output<ServicepolicyAntivirusArgs> antivirus;

    /**
     * @return For SRX-only
     * 
     */
    public Optional<Output<ServicepolicyAntivirusArgs>> antivirus() {
        return Optional.ofNullable(this.antivirus);
    }

    /**
     * For SRX Only
     * 
     */
    @Import(name="appqoe")
    private @Nullable Output<ServicepolicyAppqoeArgs> appqoe;

    /**
     * @return For SRX Only
     * 
     */
    public Optional<Output<ServicepolicyAppqoeArgs>> appqoe() {
        return Optional.ofNullable(this.appqoe);
    }

    @Import(name="ewfs")
    private @Nullable Output<List<ServicepolicyEwfArgs>> ewfs;

    public Optional<Output<List<ServicepolicyEwfArgs>>> ewfs() {
        return Optional.ofNullable(this.ewfs);
    }

    @Import(name="idp")
    private @Nullable Output<ServicepolicyIdpArgs> idp;

    public Optional<Output<ServicepolicyIdpArgs>> idp() {
        return Optional.ofNullable(this.idp);
    }

    /**
     * access within the same VRF
     * 
     */
    @Import(name="localRouting")
    private @Nullable Output<Boolean> localRouting;

    /**
     * @return access within the same VRF
     * 
     */
    public Optional<Output<Boolean>> localRouting() {
        return Optional.ofNullable(this.localRouting);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * By default, we derive all paths available and use them, optionally, you can customize by using `path_preference`
     * 
     */
    @Import(name="pathPreference")
    private @Nullable Output<String> pathPreference;

    /**
     * @return By default, we derive all paths available and use them, optionally, you can customize by using `path_preference`
     * 
     */
    public Optional<Output<String>> pathPreference() {
        return Optional.ofNullable(this.pathPreference);
    }

    @Import(name="services")
    private @Nullable Output<List<String>> services;

    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * For SRX-only
     * 
     */
    @Import(name="sslProxy")
    private @Nullable Output<ServicepolicySslProxyArgs> sslProxy;

    /**
     * @return For SRX-only
     * 
     */
    public Optional<Output<ServicepolicySslProxyArgs>> sslProxy() {
        return Optional.ofNullable(this.sslProxy);
    }

    @Import(name="tenants")
    private @Nullable Output<List<String>> tenants;

    public Optional<Output<List<String>>> tenants() {
        return Optional.ofNullable(this.tenants);
    }

    private ServicepolicyState() {}

    private ServicepolicyState(ServicepolicyState $) {
        this.aamw = $.aamw;
        this.action = $.action;
        this.antivirus = $.antivirus;
        this.appqoe = $.appqoe;
        this.ewfs = $.ewfs;
        this.idp = $.idp;
        this.localRouting = $.localRouting;
        this.name = $.name;
        this.orgId = $.orgId;
        this.pathPreference = $.pathPreference;
        this.services = $.services;
        this.sslProxy = $.sslProxy;
        this.tenants = $.tenants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicepolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicepolicyState $;

        public Builder() {
            $ = new ServicepolicyState();
        }

        public Builder(ServicepolicyState defaults) {
            $ = new ServicepolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aamw For SRX Only
         * 
         * @return builder
         * 
         */
        public Builder aamw(@Nullable Output<ServicepolicyAamwArgs> aamw) {
            $.aamw = aamw;
            return this;
        }

        /**
         * @param aamw For SRX Only
         * 
         * @return builder
         * 
         */
        public Builder aamw(ServicepolicyAamwArgs aamw) {
            return aamw(Output.of(aamw));
        }

        /**
         * @param action enum: `allow`, `deny`
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action enum: `allow`, `deny`
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param antivirus For SRX-only
         * 
         * @return builder
         * 
         */
        public Builder antivirus(@Nullable Output<ServicepolicyAntivirusArgs> antivirus) {
            $.antivirus = antivirus;
            return this;
        }

        /**
         * @param antivirus For SRX-only
         * 
         * @return builder
         * 
         */
        public Builder antivirus(ServicepolicyAntivirusArgs antivirus) {
            return antivirus(Output.of(antivirus));
        }

        /**
         * @param appqoe For SRX Only
         * 
         * @return builder
         * 
         */
        public Builder appqoe(@Nullable Output<ServicepolicyAppqoeArgs> appqoe) {
            $.appqoe = appqoe;
            return this;
        }

        /**
         * @param appqoe For SRX Only
         * 
         * @return builder
         * 
         */
        public Builder appqoe(ServicepolicyAppqoeArgs appqoe) {
            return appqoe(Output.of(appqoe));
        }

        public Builder ewfs(@Nullable Output<List<ServicepolicyEwfArgs>> ewfs) {
            $.ewfs = ewfs;
            return this;
        }

        public Builder ewfs(List<ServicepolicyEwfArgs> ewfs) {
            return ewfs(Output.of(ewfs));
        }

        public Builder ewfs(ServicepolicyEwfArgs... ewfs) {
            return ewfs(List.of(ewfs));
        }

        public Builder idp(@Nullable Output<ServicepolicyIdpArgs> idp) {
            $.idp = idp;
            return this;
        }

        public Builder idp(ServicepolicyIdpArgs idp) {
            return idp(Output.of(idp));
        }

        /**
         * @param localRouting access within the same VRF
         * 
         * @return builder
         * 
         */
        public Builder localRouting(@Nullable Output<Boolean> localRouting) {
            $.localRouting = localRouting;
            return this;
        }

        /**
         * @param localRouting access within the same VRF
         * 
         * @return builder
         * 
         */
        public Builder localRouting(Boolean localRouting) {
            return localRouting(Output.of(localRouting));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param pathPreference By default, we derive all paths available and use them, optionally, you can customize by using `path_preference`
         * 
         * @return builder
         * 
         */
        public Builder pathPreference(@Nullable Output<String> pathPreference) {
            $.pathPreference = pathPreference;
            return this;
        }

        /**
         * @param pathPreference By default, we derive all paths available and use them, optionally, you can customize by using `path_preference`
         * 
         * @return builder
         * 
         */
        public Builder pathPreference(String pathPreference) {
            return pathPreference(Output.of(pathPreference));
        }

        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        public Builder services(String... services) {
            return services(List.of(services));
        }

        /**
         * @param sslProxy For SRX-only
         * 
         * @return builder
         * 
         */
        public Builder sslProxy(@Nullable Output<ServicepolicySslProxyArgs> sslProxy) {
            $.sslProxy = sslProxy;
            return this;
        }

        /**
         * @param sslProxy For SRX-only
         * 
         * @return builder
         * 
         */
        public Builder sslProxy(ServicepolicySslProxyArgs sslProxy) {
            return sslProxy(Output.of(sslProxy));
        }

        public Builder tenants(@Nullable Output<List<String>> tenants) {
            $.tenants = tenants;
            return this;
        }

        public Builder tenants(List<String> tenants) {
            return tenants(Output.of(tenants));
        }

        public Builder tenants(String... tenants) {
            return tenants(List.of(tenants));
        }

        public ServicepolicyState build() {
            return $;
        }
    }

}
