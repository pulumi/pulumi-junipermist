// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.ServiceSpecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceState extends com.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
     * 
     */
    @Import(name="addresses")
    private @Nullable Output<List<String>> addresses;

    /**
     * @return If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
     * 
     */
    public Optional<Output<List<String>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    /**
     * When `type`==`app_categories`, list of application categories are available through List App Category Definitions
     * 
     */
    @Import(name="appCategories")
    private @Nullable Output<List<String>> appCategories;

    /**
     * @return When `type`==`app_categories`, list of application categories are available through List App Category Definitions
     * 
     */
    public Optional<Output<List<String>>> appCategories() {
        return Optional.ofNullable(this.appCategories);
    }

    /**
     * When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
     * 
     */
    @Import(name="appSubcategories")
    private @Nullable Output<List<String>> appSubcategories;

    /**
     * @return When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
     * 
     */
    public Optional<Output<List<String>>> appSubcategories() {
        return Optional.ofNullable(this.appSubcategories);
    }

    /**
     * When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
     * /insight/top_app_by-bytes?wired=true
     * 
     */
    @Import(name="apps")
    private @Nullable Output<List<String>> apps;

    /**
     * @return When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
     * /insight/top_app_by-bytes?wired=true
     * 
     */
    public Optional<Output<List<String>>> apps() {
        return Optional.ofNullable(this.apps);
    }

    /**
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Import(name="clientLimitDown")
    private @Nullable Output<Integer> clientLimitDown;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Optional<Output<Integer>> clientLimitDown() {
        return Optional.ofNullable(this.clientLimitDown);
    }

    /**
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Import(name="clientLimitUp")
    private @Nullable Output<Integer> clientLimitUp;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Optional<Output<Integer>> clientLimitUp() {
        return Optional.ofNullable(this.clientLimitUp);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="dscp")
    private @Nullable Output<String> dscp;

    public Optional<Output<String>> dscp() {
        return Optional.ofNullable(this.dscp);
    }

    /**
     * enum: `non_revertible`, `none`, `revertible`
     * 
     */
    @Import(name="failoverPolicy")
    private @Nullable Output<String> failoverPolicy;

    /**
     * @return enum: `non_revertible`, `none`, `revertible`
     * 
     */
    public Optional<Output<String>> failoverPolicy() {
        return Optional.ofNullable(this.failoverPolicy);
    }

    /**
     * If `type`==`custom`, web filtering
     * 
     */
    @Import(name="hostnames")
    private @Nullable Output<List<String>> hostnames;

    /**
     * @return If `type`==`custom`, web filtering
     * 
     */
    public Optional<Output<List<String>>> hostnames() {
        return Optional.ofNullable(this.hostnames);
    }

    @Import(name="maxJitter")
    private @Nullable Output<String> maxJitter;

    public Optional<Output<String>> maxJitter() {
        return Optional.ofNullable(this.maxJitter);
    }

    @Import(name="maxLatency")
    private @Nullable Output<String> maxLatency;

    public Optional<Output<String>> maxLatency() {
        return Optional.ofNullable(this.maxLatency);
    }

    @Import(name="maxLoss")
    private @Nullable Output<String> maxLoss;

    public Optional<Output<String>> maxLoss() {
        return Optional.ofNullable(this.maxLoss);
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
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Import(name="serviceLimitDown")
    private @Nullable Output<Integer> serviceLimitDown;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Optional<Output<Integer>> serviceLimitDown() {
        return Optional.ofNullable(this.serviceLimitDown);
    }

    /**
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Import(name="serviceLimitUp")
    private @Nullable Output<Integer> serviceLimitUp;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Optional<Output<Integer>> serviceLimitUp() {
        return Optional.ofNullable(this.serviceLimitUp);
    }

    /**
     * Whether to enable measure SLE
     * 
     */
    @Import(name="sleEnabled")
    private @Nullable Output<Boolean> sleEnabled;

    /**
     * @return Whether to enable measure SLE
     * 
     */
    public Optional<Output<Boolean>> sleEnabled() {
        return Optional.ofNullable(this.sleEnabled);
    }

    /**
     * When `type`==`custom`, optional, if it doesn&#39;t exist, http and https is assumed
     * 
     */
    @Import(name="specs")
    private @Nullable Output<List<ServiceSpecArgs>> specs;

    /**
     * @return When `type`==`custom`, optional, if it doesn&#39;t exist, http and https is assumed
     * 
     */
    public Optional<Output<List<ServiceSpecArgs>>> specs() {
        return Optional.ofNullable(this.specs);
    }

    @Import(name="ssrRelaxedTcpStateEnforcement")
    private @Nullable Output<Boolean> ssrRelaxedTcpStateEnforcement;

    public Optional<Output<Boolean>> ssrRelaxedTcpStateEnforcement() {
        return Optional.ofNullable(this.ssrRelaxedTcpStateEnforcement);
    }

    /**
     * when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
     * 
     */
    @Import(name="trafficClass")
    private @Nullable Output<String> trafficClass;

    /**
     * @return when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
     * 
     */
    public Optional<Output<String>> trafficClass() {
        return Optional.ofNullable(this.trafficClass);
    }

    /**
     * values from List Traffic Types
     * 
     */
    @Import(name="trafficType")
    private @Nullable Output<String> trafficType;

    /**
     * @return values from List Traffic Types
     * 
     */
    public Optional<Output<String>> trafficType() {
        return Optional.ofNullable(this.trafficType);
    }

    /**
     * enum: `app_categories`, `apps`, `custom`, `urls`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `app_categories`, `apps`, `custom`, `urls`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * When `type`==`urls`, no need for spec as URL can encode the ports being used
     * 
     */
    @Import(name="urls")
    private @Nullable Output<List<String>> urls;

    /**
     * @return When `type`==`urls`, no need for spec as URL can encode the ports being used
     * 
     */
    public Optional<Output<List<String>>> urls() {
        return Optional.ofNullable(this.urls);
    }

    private ServiceState() {}

    private ServiceState(ServiceState $) {
        this.addresses = $.addresses;
        this.appCategories = $.appCategories;
        this.appSubcategories = $.appSubcategories;
        this.apps = $.apps;
        this.clientLimitDown = $.clientLimitDown;
        this.clientLimitUp = $.clientLimitUp;
        this.description = $.description;
        this.dscp = $.dscp;
        this.failoverPolicy = $.failoverPolicy;
        this.hostnames = $.hostnames;
        this.maxJitter = $.maxJitter;
        this.maxLatency = $.maxLatency;
        this.maxLoss = $.maxLoss;
        this.name = $.name;
        this.orgId = $.orgId;
        this.serviceLimitDown = $.serviceLimitDown;
        this.serviceLimitUp = $.serviceLimitUp;
        this.sleEnabled = $.sleEnabled;
        this.specs = $.specs;
        this.ssrRelaxedTcpStateEnforcement = $.ssrRelaxedTcpStateEnforcement;
        this.trafficClass = $.trafficClass;
        this.trafficType = $.trafficType;
        this.type = $.type;
        this.urls = $.urls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceState $;

        public Builder() {
            $ = new ServiceState();
        }

        public Builder(ServiceState defaults) {
            $ = new ServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable Output<List<String>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<String> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
         * 
         * @return builder
         * 
         */
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param appCategories When `type`==`app_categories`, list of application categories are available through List App Category Definitions
         * 
         * @return builder
         * 
         */
        public Builder appCategories(@Nullable Output<List<String>> appCategories) {
            $.appCategories = appCategories;
            return this;
        }

        /**
         * @param appCategories When `type`==`app_categories`, list of application categories are available through List App Category Definitions
         * 
         * @return builder
         * 
         */
        public Builder appCategories(List<String> appCategories) {
            return appCategories(Output.of(appCategories));
        }

        /**
         * @param appCategories When `type`==`app_categories`, list of application categories are available through List App Category Definitions
         * 
         * @return builder
         * 
         */
        public Builder appCategories(String... appCategories) {
            return appCategories(List.of(appCategories));
        }

        /**
         * @param appSubcategories When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
         * 
         * @return builder
         * 
         */
        public Builder appSubcategories(@Nullable Output<List<String>> appSubcategories) {
            $.appSubcategories = appSubcategories;
            return this;
        }

        /**
         * @param appSubcategories When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
         * 
         * @return builder
         * 
         */
        public Builder appSubcategories(List<String> appSubcategories) {
            return appSubcategories(Output.of(appSubcategories));
        }

        /**
         * @param appSubcategories When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
         * 
         * @return builder
         * 
         */
        public Builder appSubcategories(String... appSubcategories) {
            return appSubcategories(List.of(appSubcategories));
        }

        /**
         * @param apps When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
         * /insight/top_app_by-bytes?wired=true
         * 
         * @return builder
         * 
         */
        public Builder apps(@Nullable Output<List<String>> apps) {
            $.apps = apps;
            return this;
        }

        /**
         * @param apps When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
         * /insight/top_app_by-bytes?wired=true
         * 
         * @return builder
         * 
         */
        public Builder apps(List<String> apps) {
            return apps(Output.of(apps));
        }

        /**
         * @param apps When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
         * /insight/top_app_by-bytes?wired=true
         * 
         * @return builder
         * 
         */
        public Builder apps(String... apps) {
            return apps(List.of(apps));
        }

        /**
         * @param clientLimitDown 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder clientLimitDown(@Nullable Output<Integer> clientLimitDown) {
            $.clientLimitDown = clientLimitDown;
            return this;
        }

        /**
         * @param clientLimitDown 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder clientLimitDown(Integer clientLimitDown) {
            return clientLimitDown(Output.of(clientLimitDown));
        }

        /**
         * @param clientLimitUp 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder clientLimitUp(@Nullable Output<Integer> clientLimitUp) {
            $.clientLimitUp = clientLimitUp;
            return this;
        }

        /**
         * @param clientLimitUp 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder clientLimitUp(Integer clientLimitUp) {
            return clientLimitUp(Output.of(clientLimitUp));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder dscp(@Nullable Output<String> dscp) {
            $.dscp = dscp;
            return this;
        }

        public Builder dscp(String dscp) {
            return dscp(Output.of(dscp));
        }

        /**
         * @param failoverPolicy enum: `non_revertible`, `none`, `revertible`
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(@Nullable Output<String> failoverPolicy) {
            $.failoverPolicy = failoverPolicy;
            return this;
        }

        /**
         * @param failoverPolicy enum: `non_revertible`, `none`, `revertible`
         * 
         * @return builder
         * 
         */
        public Builder failoverPolicy(String failoverPolicy) {
            return failoverPolicy(Output.of(failoverPolicy));
        }

        /**
         * @param hostnames If `type`==`custom`, web filtering
         * 
         * @return builder
         * 
         */
        public Builder hostnames(@Nullable Output<List<String>> hostnames) {
            $.hostnames = hostnames;
            return this;
        }

        /**
         * @param hostnames If `type`==`custom`, web filtering
         * 
         * @return builder
         * 
         */
        public Builder hostnames(List<String> hostnames) {
            return hostnames(Output.of(hostnames));
        }

        /**
         * @param hostnames If `type`==`custom`, web filtering
         * 
         * @return builder
         * 
         */
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }

        public Builder maxJitter(@Nullable Output<String> maxJitter) {
            $.maxJitter = maxJitter;
            return this;
        }

        public Builder maxJitter(String maxJitter) {
            return maxJitter(Output.of(maxJitter));
        }

        public Builder maxLatency(@Nullable Output<String> maxLatency) {
            $.maxLatency = maxLatency;
            return this;
        }

        public Builder maxLatency(String maxLatency) {
            return maxLatency(Output.of(maxLatency));
        }

        public Builder maxLoss(@Nullable Output<String> maxLoss) {
            $.maxLoss = maxLoss;
            return this;
        }

        public Builder maxLoss(String maxLoss) {
            return maxLoss(Output.of(maxLoss));
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
         * @param serviceLimitDown 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder serviceLimitDown(@Nullable Output<Integer> serviceLimitDown) {
            $.serviceLimitDown = serviceLimitDown;
            return this;
        }

        /**
         * @param serviceLimitDown 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder serviceLimitDown(Integer serviceLimitDown) {
            return serviceLimitDown(Output.of(serviceLimitDown));
        }

        /**
         * @param serviceLimitUp 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder serviceLimitUp(@Nullable Output<Integer> serviceLimitUp) {
            $.serviceLimitUp = serviceLimitUp;
            return this;
        }

        /**
         * @param serviceLimitUp 0 means unlimited, value from 0 to 107374182
         * 
         * @return builder
         * 
         */
        public Builder serviceLimitUp(Integer serviceLimitUp) {
            return serviceLimitUp(Output.of(serviceLimitUp));
        }

        /**
         * @param sleEnabled Whether to enable measure SLE
         * 
         * @return builder
         * 
         */
        public Builder sleEnabled(@Nullable Output<Boolean> sleEnabled) {
            $.sleEnabled = sleEnabled;
            return this;
        }

        /**
         * @param sleEnabled Whether to enable measure SLE
         * 
         * @return builder
         * 
         */
        public Builder sleEnabled(Boolean sleEnabled) {
            return sleEnabled(Output.of(sleEnabled));
        }

        /**
         * @param specs When `type`==`custom`, optional, if it doesn&#39;t exist, http and https is assumed
         * 
         * @return builder
         * 
         */
        public Builder specs(@Nullable Output<List<ServiceSpecArgs>> specs) {
            $.specs = specs;
            return this;
        }

        /**
         * @param specs When `type`==`custom`, optional, if it doesn&#39;t exist, http and https is assumed
         * 
         * @return builder
         * 
         */
        public Builder specs(List<ServiceSpecArgs> specs) {
            return specs(Output.of(specs));
        }

        /**
         * @param specs When `type`==`custom`, optional, if it doesn&#39;t exist, http and https is assumed
         * 
         * @return builder
         * 
         */
        public Builder specs(ServiceSpecArgs... specs) {
            return specs(List.of(specs));
        }

        public Builder ssrRelaxedTcpStateEnforcement(@Nullable Output<Boolean> ssrRelaxedTcpStateEnforcement) {
            $.ssrRelaxedTcpStateEnforcement = ssrRelaxedTcpStateEnforcement;
            return this;
        }

        public Builder ssrRelaxedTcpStateEnforcement(Boolean ssrRelaxedTcpStateEnforcement) {
            return ssrRelaxedTcpStateEnforcement(Output.of(ssrRelaxedTcpStateEnforcement));
        }

        /**
         * @param trafficClass when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
         * 
         * @return builder
         * 
         */
        public Builder trafficClass(@Nullable Output<String> trafficClass) {
            $.trafficClass = trafficClass;
            return this;
        }

        /**
         * @param trafficClass when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
         * 
         * @return builder
         * 
         */
        public Builder trafficClass(String trafficClass) {
            return trafficClass(Output.of(trafficClass));
        }

        /**
         * @param trafficType values from List Traffic Types
         * 
         * @return builder
         * 
         */
        public Builder trafficType(@Nullable Output<String> trafficType) {
            $.trafficType = trafficType;
            return this;
        }

        /**
         * @param trafficType values from List Traffic Types
         * 
         * @return builder
         * 
         */
        public Builder trafficType(String trafficType) {
            return trafficType(Output.of(trafficType));
        }

        /**
         * @param type enum: `app_categories`, `apps`, `custom`, `urls`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `app_categories`, `apps`, `custom`, `urls`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param urls When `type`==`urls`, no need for spec as URL can encode the ports being used
         * 
         * @return builder
         * 
         */
        public Builder urls(@Nullable Output<List<String>> urls) {
            $.urls = urls;
            return this;
        }

        /**
         * @param urls When `type`==`urls`, no need for spec as URL can encode the ports being used
         * 
         * @return builder
         * 
         */
        public Builder urls(List<String> urls) {
            return urls(Output.of(urls));
        }

        /**
         * @param urls When `type`==`urls`, no need for spec as URL can encode the ports being used
         * 
         * @return builder
         * 
         */
        public Builder urls(String... urls) {
            return urls(List.of(urls));
        }

        public ServiceState build() {
            return $;
        }
    }

}
