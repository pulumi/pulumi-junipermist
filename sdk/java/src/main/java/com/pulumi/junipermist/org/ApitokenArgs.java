// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.inputs.ApitokenPrivilegeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApitokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApitokenArgs Empty = new ApitokenArgs();

    /**
     * Name of the token
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the token
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * List of privileges the token has on the orgs/sites
     * 
     */
    @Import(name="privileges", required=true)
    private Output<List<ApitokenPrivilegeArgs>> privileges;

    /**
     * @return List of privileges the token has on the orgs/sites
     * 
     */
    public Output<List<ApitokenPrivilegeArgs>> privileges() {
        return this.privileges;
    }

    /**
     * List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
     * 
     */
    @Import(name="srcIps")
    private @Nullable Output<List<String>> srcIps;

    /**
     * @return List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
     * 
     */
    public Optional<Output<List<String>>> srcIps() {
        return Optional.ofNullable(this.srcIps);
    }

    private ApitokenArgs() {}

    private ApitokenArgs(ApitokenArgs $) {
        this.name = $.name;
        this.orgId = $.orgId;
        this.privileges = $.privileges;
        this.srcIps = $.srcIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApitokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApitokenArgs $;

        public Builder() {
            $ = new ApitokenArgs();
        }

        public Builder(ApitokenArgs defaults) {
            $ = new ApitokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the token
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the token
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param privileges List of privileges the token has on the orgs/sites
         * 
         * @return builder
         * 
         */
        public Builder privileges(Output<List<ApitokenPrivilegeArgs>> privileges) {
            $.privileges = privileges;
            return this;
        }

        /**
         * @param privileges List of privileges the token has on the orgs/sites
         * 
         * @return builder
         * 
         */
        public Builder privileges(List<ApitokenPrivilegeArgs> privileges) {
            return privileges(Output.of(privileges));
        }

        /**
         * @param privileges List of privileges the token has on the orgs/sites
         * 
         * @return builder
         * 
         */
        public Builder privileges(ApitokenPrivilegeArgs... privileges) {
            return privileges(List.of(privileges));
        }

        /**
         * @param srcIps List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
         * 
         * @return builder
         * 
         */
        public Builder srcIps(@Nullable Output<List<String>> srcIps) {
            $.srcIps = srcIps;
            return this;
        }

        /**
         * @param srcIps List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
         * 
         * @return builder
         * 
         */
        public Builder srcIps(List<String> srcIps) {
            return srcIps(Output.of(srcIps));
        }

        /**
         * @param srcIps List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
         * 
         * @return builder
         * 
         */
        public Builder srcIps(String... srcIps) {
            return srcIps(List.of(srcIps));
        }

        public ApitokenArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("ApitokenArgs", "orgId");
            }
            if ($.privileges == null) {
                throw new MissingRequiredPropertyException("ApitokenArgs", "privileges");
            }
            return $;
        }
    }

}
