// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchOspfAreasNetworksArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchOspfAreasNetworksArgs Empty = new SwitchOspfAreasNetworksArgs();

    /**
     * Required if `auth_type`==`md5`. Property key is the key number
     * 
     */
    @Import(name="authKeys")
    private @Nullable Output<Map<String,String>> authKeys;

    /**
     * @return Required if `auth_type`==`md5`. Property key is the key number
     * 
     */
    public Optional<Output<Map<String,String>>> authKeys() {
        return Optional.ofNullable(this.authKeys);
    }

    /**
     * Required if `auth_type`==`password`, the password, max length is 8
     * 
     */
    @Import(name="authPassword")
    private @Nullable Output<String> authPassword;

    /**
     * @return Required if `auth_type`==`password`, the password, max length is 8
     * 
     */
    public Optional<Output<String>> authPassword() {
        return Optional.ofNullable(this.authPassword);
    }

    /**
     * auth type. enum: `md5`, `none`, `password`
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return auth type. enum: `md5`, `none`, `password`
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    @Import(name="bfdMinimumInterval")
    private @Nullable Output<Integer> bfdMinimumInterval;

    public Optional<Output<Integer>> bfdMinimumInterval() {
        return Optional.ofNullable(this.bfdMinimumInterval);
    }

    @Import(name="deadInterval")
    private @Nullable Output<Integer> deadInterval;

    public Optional<Output<Integer>> deadInterval() {
        return Optional.ofNullable(this.deadInterval);
    }

    @Import(name="exportPolicy")
    private @Nullable Output<String> exportPolicy;

    public Optional<Output<String>> exportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }

    @Import(name="helloInterval")
    private @Nullable Output<Integer> helloInterval;

    public Optional<Output<Integer>> helloInterval() {
        return Optional.ofNullable(this.helloInterval);
    }

    @Import(name="importPolicy")
    private @Nullable Output<String> importPolicy;

    public Optional<Output<String>> importPolicy() {
        return Optional.ofNullable(this.importPolicy);
    }

    /**
     * interface type (nbma = non-broadcast multi-access). enum: `broadcast`, `nbma`, `p2mp`, `p2p`
     * 
     */
    @Import(name="interfaceType")
    private @Nullable Output<String> interfaceType;

    /**
     * @return interface type (nbma = non-broadcast multi-access). enum: `broadcast`, `nbma`, `p2mp`, `p2p`
     * 
     */
    public Optional<Output<String>> interfaceType() {
        return Optional.ofNullable(this.interfaceType);
    }

    @Import(name="metric")
    private @Nullable Output<Integer> metric;

    public Optional<Output<Integer>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * By default, we&#39;ll re-advertise all learned OSPF routes toward overlay
     * 
     */
    @Import(name="noReadvertiseToOverlay")
    private @Nullable Output<Boolean> noReadvertiseToOverlay;

    /**
     * @return By default, we&#39;ll re-advertise all learned OSPF routes toward overlay
     * 
     */
    public Optional<Output<Boolean>> noReadvertiseToOverlay() {
        return Optional.ofNullable(this.noReadvertiseToOverlay);
    }

    /**
     * Whether to send OSPF-Hello
     * 
     */
    @Import(name="passive")
    private @Nullable Output<Boolean> passive;

    /**
     * @return Whether to send OSPF-Hello
     * 
     */
    public Optional<Output<Boolean>> passive() {
        return Optional.ofNullable(this.passive);
    }

    private SwitchOspfAreasNetworksArgs() {}

    private SwitchOspfAreasNetworksArgs(SwitchOspfAreasNetworksArgs $) {
        this.authKeys = $.authKeys;
        this.authPassword = $.authPassword;
        this.authType = $.authType;
        this.bfdMinimumInterval = $.bfdMinimumInterval;
        this.deadInterval = $.deadInterval;
        this.exportPolicy = $.exportPolicy;
        this.helloInterval = $.helloInterval;
        this.importPolicy = $.importPolicy;
        this.interfaceType = $.interfaceType;
        this.metric = $.metric;
        this.noReadvertiseToOverlay = $.noReadvertiseToOverlay;
        this.passive = $.passive;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchOspfAreasNetworksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchOspfAreasNetworksArgs $;

        public Builder() {
            $ = new SwitchOspfAreasNetworksArgs();
        }

        public Builder(SwitchOspfAreasNetworksArgs defaults) {
            $ = new SwitchOspfAreasNetworksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authKeys Required if `auth_type`==`md5`. Property key is the key number
         * 
         * @return builder
         * 
         */
        public Builder authKeys(@Nullable Output<Map<String,String>> authKeys) {
            $.authKeys = authKeys;
            return this;
        }

        /**
         * @param authKeys Required if `auth_type`==`md5`. Property key is the key number
         * 
         * @return builder
         * 
         */
        public Builder authKeys(Map<String,String> authKeys) {
            return authKeys(Output.of(authKeys));
        }

        /**
         * @param authPassword Required if `auth_type`==`password`, the password, max length is 8
         * 
         * @return builder
         * 
         */
        public Builder authPassword(@Nullable Output<String> authPassword) {
            $.authPassword = authPassword;
            return this;
        }

        /**
         * @param authPassword Required if `auth_type`==`password`, the password, max length is 8
         * 
         * @return builder
         * 
         */
        public Builder authPassword(String authPassword) {
            return authPassword(Output.of(authPassword));
        }

        /**
         * @param authType auth type. enum: `md5`, `none`, `password`
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType auth type. enum: `md5`, `none`, `password`
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        public Builder bfdMinimumInterval(@Nullable Output<Integer> bfdMinimumInterval) {
            $.bfdMinimumInterval = bfdMinimumInterval;
            return this;
        }

        public Builder bfdMinimumInterval(Integer bfdMinimumInterval) {
            return bfdMinimumInterval(Output.of(bfdMinimumInterval));
        }

        public Builder deadInterval(@Nullable Output<Integer> deadInterval) {
            $.deadInterval = deadInterval;
            return this;
        }

        public Builder deadInterval(Integer deadInterval) {
            return deadInterval(Output.of(deadInterval));
        }

        public Builder exportPolicy(@Nullable Output<String> exportPolicy) {
            $.exportPolicy = exportPolicy;
            return this;
        }

        public Builder exportPolicy(String exportPolicy) {
            return exportPolicy(Output.of(exportPolicy));
        }

        public Builder helloInterval(@Nullable Output<Integer> helloInterval) {
            $.helloInterval = helloInterval;
            return this;
        }

        public Builder helloInterval(Integer helloInterval) {
            return helloInterval(Output.of(helloInterval));
        }

        public Builder importPolicy(@Nullable Output<String> importPolicy) {
            $.importPolicy = importPolicy;
            return this;
        }

        public Builder importPolicy(String importPolicy) {
            return importPolicy(Output.of(importPolicy));
        }

        /**
         * @param interfaceType interface type (nbma = non-broadcast multi-access). enum: `broadcast`, `nbma`, `p2mp`, `p2p`
         * 
         * @return builder
         * 
         */
        public Builder interfaceType(@Nullable Output<String> interfaceType) {
            $.interfaceType = interfaceType;
            return this;
        }

        /**
         * @param interfaceType interface type (nbma = non-broadcast multi-access). enum: `broadcast`, `nbma`, `p2mp`, `p2p`
         * 
         * @return builder
         * 
         */
        public Builder interfaceType(String interfaceType) {
            return interfaceType(Output.of(interfaceType));
        }

        public Builder metric(@Nullable Output<Integer> metric) {
            $.metric = metric;
            return this;
        }

        public Builder metric(Integer metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param noReadvertiseToOverlay By default, we&#39;ll re-advertise all learned OSPF routes toward overlay
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToOverlay(@Nullable Output<Boolean> noReadvertiseToOverlay) {
            $.noReadvertiseToOverlay = noReadvertiseToOverlay;
            return this;
        }

        /**
         * @param noReadvertiseToOverlay By default, we&#39;ll re-advertise all learned OSPF routes toward overlay
         * 
         * @return builder
         * 
         */
        public Builder noReadvertiseToOverlay(Boolean noReadvertiseToOverlay) {
            return noReadvertiseToOverlay(Output.of(noReadvertiseToOverlay));
        }

        /**
         * @param passive Whether to send OSPF-Hello
         * 
         * @return builder
         * 
         */
        public Builder passive(@Nullable Output<Boolean> passive) {
            $.passive = passive;
            return this;
        }

        /**
         * @param passive Whether to send OSPF-Hello
         * 
         * @return builder
         * 
         */
        public Builder passive(Boolean passive) {
            return passive(Output.of(passive));
        }

        public SwitchOspfAreasNetworksArgs build() {
            return $;
        }
    }

}
