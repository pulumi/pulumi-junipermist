// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceprofileGatewayRoutingPoliciesTermActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceprofileGatewayRoutingPoliciesTermActionArgs Empty = new DeviceprofileGatewayRoutingPoliciesTermActionArgs();

    @Import(name="accept")
    private @Nullable Output<Boolean> accept;

    public Optional<Output<Boolean>> accept() {
        return Optional.ofNullable(this.accept);
    }

    @Import(name="addCommunities")
    private @Nullable Output<List<String>> addCommunities;

    public Optional<Output<List<String>>> addCommunities() {
        return Optional.ofNullable(this.addCommunities);
    }

    /**
     * For SSR, hub decides how VRF routes are leaked on spoke
     * 
     */
    @Import(name="addTargetVrfs")
    private @Nullable Output<List<String>> addTargetVrfs;

    /**
     * @return For SSR, hub decides how VRF routes are leaked on spoke
     * 
     */
    public Optional<Output<List<String>>> addTargetVrfs() {
        return Optional.ofNullable(this.addTargetVrfs);
    }

    /**
     * When used as export policy, optional
     * 
     */
    @Import(name="communities")
    private @Nullable Output<List<String>> communities;

    /**
     * @return When used as export policy, optional
     * 
     */
    public Optional<Output<List<String>>> communities() {
        return Optional.ofNullable(this.communities);
    }

    /**
     * When used as export policy, optional. To exclude certain AS
     * 
     */
    @Import(name="excludeAsPaths")
    private @Nullable Output<List<String>> excludeAsPaths;

    /**
     * @return When used as export policy, optional. To exclude certain AS
     * 
     */
    public Optional<Output<List<String>>> excludeAsPaths() {
        return Optional.ofNullable(this.excludeAsPaths);
    }

    @Import(name="excludeCommunities")
    private @Nullable Output<List<String>> excludeCommunities;

    public Optional<Output<List<String>>> excludeCommunities() {
        return Optional.ofNullable(this.excludeCommunities);
    }

    /**
     * When used as export policy, optional
     * 
     */
    @Import(name="exportCommunities")
    private @Nullable Output<List<String>> exportCommunities;

    /**
     * @return When used as export policy, optional
     * 
     */
    public Optional<Output<List<String>>> exportCommunities() {
        return Optional.ofNullable(this.exportCommunities);
    }

    /**
     * Optional, for an import policy, local_preference can be changed
     * 
     */
    @Import(name="localPreference")
    private @Nullable Output<String> localPreference;

    /**
     * @return Optional, for an import policy, local_preference can be changed
     * 
     */
    public Optional<Output<String>> localPreference() {
        return Optional.ofNullable(this.localPreference);
    }

    /**
     * When used as export policy, optional. By default, the local AS will be prepended, to change it
     * 
     */
    @Import(name="prependAsPaths")
    private @Nullable Output<List<String>> prependAsPaths;

    /**
     * @return When used as export policy, optional. By default, the local AS will be prepended, to change it
     * 
     */
    public Optional<Output<List<String>>> prependAsPaths() {
        return Optional.ofNullable(this.prependAsPaths);
    }

    private DeviceprofileGatewayRoutingPoliciesTermActionArgs() {}

    private DeviceprofileGatewayRoutingPoliciesTermActionArgs(DeviceprofileGatewayRoutingPoliciesTermActionArgs $) {
        this.accept = $.accept;
        this.addCommunities = $.addCommunities;
        this.addTargetVrfs = $.addTargetVrfs;
        this.communities = $.communities;
        this.excludeAsPaths = $.excludeAsPaths;
        this.excludeCommunities = $.excludeCommunities;
        this.exportCommunities = $.exportCommunities;
        this.localPreference = $.localPreference;
        this.prependAsPaths = $.prependAsPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceprofileGatewayRoutingPoliciesTermActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceprofileGatewayRoutingPoliciesTermActionArgs $;

        public Builder() {
            $ = new DeviceprofileGatewayRoutingPoliciesTermActionArgs();
        }

        public Builder(DeviceprofileGatewayRoutingPoliciesTermActionArgs defaults) {
            $ = new DeviceprofileGatewayRoutingPoliciesTermActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder accept(@Nullable Output<Boolean> accept) {
            $.accept = accept;
            return this;
        }

        public Builder accept(Boolean accept) {
            return accept(Output.of(accept));
        }

        public Builder addCommunities(@Nullable Output<List<String>> addCommunities) {
            $.addCommunities = addCommunities;
            return this;
        }

        public Builder addCommunities(List<String> addCommunities) {
            return addCommunities(Output.of(addCommunities));
        }

        public Builder addCommunities(String... addCommunities) {
            return addCommunities(List.of(addCommunities));
        }

        /**
         * @param addTargetVrfs For SSR, hub decides how VRF routes are leaked on spoke
         * 
         * @return builder
         * 
         */
        public Builder addTargetVrfs(@Nullable Output<List<String>> addTargetVrfs) {
            $.addTargetVrfs = addTargetVrfs;
            return this;
        }

        /**
         * @param addTargetVrfs For SSR, hub decides how VRF routes are leaked on spoke
         * 
         * @return builder
         * 
         */
        public Builder addTargetVrfs(List<String> addTargetVrfs) {
            return addTargetVrfs(Output.of(addTargetVrfs));
        }

        /**
         * @param addTargetVrfs For SSR, hub decides how VRF routes are leaked on spoke
         * 
         * @return builder
         * 
         */
        public Builder addTargetVrfs(String... addTargetVrfs) {
            return addTargetVrfs(List.of(addTargetVrfs));
        }

        /**
         * @param communities When used as export policy, optional
         * 
         * @return builder
         * 
         */
        public Builder communities(@Nullable Output<List<String>> communities) {
            $.communities = communities;
            return this;
        }

        /**
         * @param communities When used as export policy, optional
         * 
         * @return builder
         * 
         */
        public Builder communities(List<String> communities) {
            return communities(Output.of(communities));
        }

        /**
         * @param communities When used as export policy, optional
         * 
         * @return builder
         * 
         */
        public Builder communities(String... communities) {
            return communities(List.of(communities));
        }

        /**
         * @param excludeAsPaths When used as export policy, optional. To exclude certain AS
         * 
         * @return builder
         * 
         */
        public Builder excludeAsPaths(@Nullable Output<List<String>> excludeAsPaths) {
            $.excludeAsPaths = excludeAsPaths;
            return this;
        }

        /**
         * @param excludeAsPaths When used as export policy, optional. To exclude certain AS
         * 
         * @return builder
         * 
         */
        public Builder excludeAsPaths(List<String> excludeAsPaths) {
            return excludeAsPaths(Output.of(excludeAsPaths));
        }

        /**
         * @param excludeAsPaths When used as export policy, optional. To exclude certain AS
         * 
         * @return builder
         * 
         */
        public Builder excludeAsPaths(String... excludeAsPaths) {
            return excludeAsPaths(List.of(excludeAsPaths));
        }

        public Builder excludeCommunities(@Nullable Output<List<String>> excludeCommunities) {
            $.excludeCommunities = excludeCommunities;
            return this;
        }

        public Builder excludeCommunities(List<String> excludeCommunities) {
            return excludeCommunities(Output.of(excludeCommunities));
        }

        public Builder excludeCommunities(String... excludeCommunities) {
            return excludeCommunities(List.of(excludeCommunities));
        }

        /**
         * @param exportCommunities When used as export policy, optional
         * 
         * @return builder
         * 
         */
        public Builder exportCommunities(@Nullable Output<List<String>> exportCommunities) {
            $.exportCommunities = exportCommunities;
            return this;
        }

        /**
         * @param exportCommunities When used as export policy, optional
         * 
         * @return builder
         * 
         */
        public Builder exportCommunities(List<String> exportCommunities) {
            return exportCommunities(Output.of(exportCommunities));
        }

        /**
         * @param exportCommunities When used as export policy, optional
         * 
         * @return builder
         * 
         */
        public Builder exportCommunities(String... exportCommunities) {
            return exportCommunities(List.of(exportCommunities));
        }

        /**
         * @param localPreference Optional, for an import policy, local_preference can be changed
         * 
         * @return builder
         * 
         */
        public Builder localPreference(@Nullable Output<String> localPreference) {
            $.localPreference = localPreference;
            return this;
        }

        /**
         * @param localPreference Optional, for an import policy, local_preference can be changed
         * 
         * @return builder
         * 
         */
        public Builder localPreference(String localPreference) {
            return localPreference(Output.of(localPreference));
        }

        /**
         * @param prependAsPaths When used as export policy, optional. By default, the local AS will be prepended, to change it
         * 
         * @return builder
         * 
         */
        public Builder prependAsPaths(@Nullable Output<List<String>> prependAsPaths) {
            $.prependAsPaths = prependAsPaths;
            return this;
        }

        /**
         * @param prependAsPaths When used as export policy, optional. By default, the local AS will be prepended, to change it
         * 
         * @return builder
         * 
         */
        public Builder prependAsPaths(List<String> prependAsPaths) {
            return prependAsPaths(Output.of(prependAsPaths));
        }

        /**
         * @param prependAsPaths When used as export policy, optional. By default, the local AS will be prepended, to change it
         * 
         * @return builder
         * 
         */
        public Builder prependAsPaths(String... prependAsPaths) {
            return prependAsPaths(List.of(prependAsPaths));
        }

        public DeviceprofileGatewayRoutingPoliciesTermActionArgs build() {
            return $;
        }
    }

}
