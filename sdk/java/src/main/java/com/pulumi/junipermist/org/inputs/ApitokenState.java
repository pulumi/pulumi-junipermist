// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.ApitokenPrivilegeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApitokenState extends com.pulumi.resources.ResourceArgs {

    public static final ApitokenState Empty = new ApitokenState();

    /**
     * email of the token creator / null if creator is deleted
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return email of the token creator / null if creator is deleted
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * name of the token
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name of the token
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * list of privileges the token has on the orgs/sites
     * 
     */
    @Import(name="privileges")
    private @Nullable Output<List<ApitokenPrivilegeArgs>> privileges;

    /**
     * @return list of privileges the token has on the orgs/sites
     * 
     */
    public Optional<Output<List<ApitokenPrivilegeArgs>>> privileges() {
        return Optional.ofNullable(this.privileges);
    }

    /**
     * list of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
     * 
     */
    @Import(name="srcIps")
    private @Nullable Output<List<String>> srcIps;

    /**
     * @return list of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
     * 
     */
    public Optional<Output<List<String>>> srcIps() {
        return Optional.ofNullable(this.srcIps);
    }

    private ApitokenState() {}

    private ApitokenState(ApitokenState $) {
        this.createdBy = $.createdBy;
        this.key = $.key;
        this.name = $.name;
        this.orgId = $.orgId;
        this.privileges = $.privileges;
        this.srcIps = $.srcIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApitokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApitokenState $;

        public Builder() {
            $ = new ApitokenState();
        }

        public Builder(ApitokenState defaults) {
            $ = new ApitokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdBy email of the token creator / null if creator is deleted
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy email of the token creator / null if creator is deleted
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name name of the token
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name of the token
         * 
         * @return builder
         * 
         */
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
         * @param privileges list of privileges the token has on the orgs/sites
         * 
         * @return builder
         * 
         */
        public Builder privileges(@Nullable Output<List<ApitokenPrivilegeArgs>> privileges) {
            $.privileges = privileges;
            return this;
        }

        /**
         * @param privileges list of privileges the token has on the orgs/sites
         * 
         * @return builder
         * 
         */
        public Builder privileges(List<ApitokenPrivilegeArgs> privileges) {
            return privileges(Output.of(privileges));
        }

        /**
         * @param privileges list of privileges the token has on the orgs/sites
         * 
         * @return builder
         * 
         */
        public Builder privileges(ApitokenPrivilegeArgs... privileges) {
            return privileges(List.of(privileges));
        }

        /**
         * @param srcIps list of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
         * 
         * @return builder
         * 
         */
        public Builder srcIps(@Nullable Output<List<String>> srcIps) {
            $.srcIps = srcIps;
            return this;
        }

        /**
         * @param srcIps list of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
         * 
         * @return builder
         * 
         */
        public Builder srcIps(List<String> srcIps) {
            return srcIps(Output.of(srcIps));
        }

        /**
         * @param srcIps list of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
         * 
         * @return builder
         * 
         */
        public Builder srcIps(String... srcIps) {
            return srcIps(List.of(srcIps));
        }

        public ApitokenState build() {
            return $;
        }
    }

}