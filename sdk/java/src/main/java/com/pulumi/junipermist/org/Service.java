// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.ServiceArgs;
import com.pulumi.junipermist.org.inputs.ServiceState;
import com.pulumi.junipermist.org.outputs.ServiceSpec;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages WAN Assurance Services (Applications).
 * 
 * A Service is used to define a Custom Application that can be used in the `service_policies`. These Services can be referenced by their name in
 * * the Service Policies (`mist_org_servicepolicy.services`)
 * * the Gateway configuration (`mist_device_gateway.service_policies.services`)
 * * the Gateway Templates (`mist_org_gatewaytemplate.service_policies.services`)
 * * the HUB Profiles (`mist_org_deviceprofile_gateway.service_policies.services`)
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_org_service` with:
 * 
 * Org Service can be imported by specifying the org_id and the service_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/service:Service service_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
 * ```
 * 
 */
@ResourceType(type="junipermist:org/service:Service")
public class Service extends com.pulumi.resources.CustomResource {
    /**
     * If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
     * 
     */
    @Export(name="addresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> addresses;

    /**
     * @return If `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
     * 
     */
    public Output<List<String>> addresses() {
        return this.addresses;
    }
    /**
     * When `type`==`app_categories`, list of application categories are available through List App Category Definitions
     * 
     */
    @Export(name="appCategories", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> appCategories;

    /**
     * @return When `type`==`app_categories`, list of application categories are available through List App Category Definitions
     * 
     */
    public Output<List<String>> appCategories() {
        return this.appCategories;
    }
    /**
     * When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
     * 
     */
    @Export(name="appSubcategories", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> appSubcategories;

    /**
     * @return When `type`==`app_categories`, list of application categories are available through List App Sub Category Definitions
     * 
     */
    public Output<List<String>> appSubcategories() {
        return this.appSubcategories;
    }
    /**
     * When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
     * /insight/top_app_by-bytes?wired=true
     * 
     */
    @Export(name="apps", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> apps;

    /**
     * @return When `type`==`apps`, list of applications are available through: * List Applications * List Gateway Applications *
     * /insight/top_app_by-bytes?wired=true
     * 
     */
    public Output<List<String>> apps() {
        return this.apps;
    }
    /**
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Export(name="clientLimitDown", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> clientLimitDown;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Output<Optional<Integer>> clientLimitDown() {
        return Codegen.optional(this.clientLimitDown);
    }
    /**
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Export(name="clientLimitUp", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> clientLimitUp;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Output<Optional<Integer>> clientLimitUp() {
        return Codegen.optional(this.clientLimitUp);
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="dscp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dscp;

    public Output<Optional<String>> dscp() {
        return Codegen.optional(this.dscp);
    }
    /**
     * enum: `non_revertible`, `none`, `revertible`
     * 
     */
    @Export(name="failoverPolicy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> failoverPolicy;

    /**
     * @return enum: `non_revertible`, `none`, `revertible`
     * 
     */
    public Output<Optional<String>> failoverPolicy() {
        return Codegen.optional(this.failoverPolicy);
    }
    /**
     * If `type`==`custom`, web filtering
     * 
     */
    @Export(name="hostnames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hostnames;

    /**
     * @return If `type`==`custom`, web filtering
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }
    @Export(name="maxJitter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> maxJitter;

    public Output<Optional<String>> maxJitter() {
        return Codegen.optional(this.maxJitter);
    }
    @Export(name="maxLatency", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> maxLatency;

    public Output<Optional<String>> maxLatency() {
        return Codegen.optional(this.maxLatency);
    }
    @Export(name="maxLoss", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> maxLoss;

    public Output<Optional<String>> maxLoss() {
        return Codegen.optional(this.maxLoss);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Export(name="serviceLimitDown", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> serviceLimitDown;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Output<Optional<Integer>> serviceLimitDown() {
        return Codegen.optional(this.serviceLimitDown);
    }
    /**
     * 0 means unlimited, value from 0 to 107374182
     * 
     */
    @Export(name="serviceLimitUp", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> serviceLimitUp;

    /**
     * @return 0 means unlimited, value from 0 to 107374182
     * 
     */
    public Output<Optional<Integer>> serviceLimitUp() {
        return Codegen.optional(this.serviceLimitUp);
    }
    /**
     * Whether to enable measure SLE
     * 
     */
    @Export(name="sleEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sleEnabled;

    /**
     * @return Whether to enable measure SLE
     * 
     */
    public Output<Optional<Boolean>> sleEnabled() {
        return Codegen.optional(this.sleEnabled);
    }
    /**
     * When `type`==`custom`, optional, if it doesn&#39;t exist, http and https is assumed
     * 
     */
    @Export(name="specs", refs={List.class,ServiceSpec.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ServiceSpec>> specs;

    /**
     * @return When `type`==`custom`, optional, if it doesn&#39;t exist, http and https is assumed
     * 
     */
    public Output<Optional<List<ServiceSpec>>> specs() {
        return Codegen.optional(this.specs);
    }
    @Export(name="ssrRelaxedTcpStateEnforcement", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ssrRelaxedTcpStateEnforcement;

    public Output<Optional<Boolean>> ssrRelaxedTcpStateEnforcement() {
        return Codegen.optional(this.ssrRelaxedTcpStateEnforcement);
    }
    /**
     * when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
     * 
     */
    @Export(name="trafficClass", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> trafficClass;

    /**
     * @return when `traffic_type`==`custom`. enum: `best_effort`, `high`, `low`, `medium`
     * 
     */
    public Output<Optional<String>> trafficClass() {
        return Codegen.optional(this.trafficClass);
    }
    /**
     * values from List Traffic Types
     * 
     */
    @Export(name="trafficType", refs={String.class}, tree="[0]")
    private Output<String> trafficType;

    /**
     * @return values from List Traffic Types
     * 
     */
    public Output<String> trafficType() {
        return this.trafficType;
    }
    /**
     * enum: `app_categories`, `apps`, `custom`, `urls`
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return enum: `app_categories`, `apps`, `custom`, `urls`
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * When `type`==`urls`, no need for spec as URL can encode the ports being used
     * 
     */
    @Export(name="urls", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> urls;

    /**
     * @return When `type`==`urls`, no need for spec as URL can encode the ports being used
     * 
     */
    public Output<List<String>> urls() {
        return this.urls;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(java.lang.String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(java.lang.String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(java.lang.String name, ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/service:Service", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Service(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/service:Service", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceArgs makeArgs(ServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-junipermist")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Service get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, state, options);
    }
}
