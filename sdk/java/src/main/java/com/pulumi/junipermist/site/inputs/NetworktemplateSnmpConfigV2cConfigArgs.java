// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSnmpConfigV2cConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSnmpConfigV2cConfigArgs Empty = new NetworktemplateSnmpConfigV2cConfigArgs();

    @Import(name="authorization")
    private @Nullable Output<String> authorization;

    public Optional<Output<String>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * Client_list_name here should refer to client_list above
     * 
     */
    @Import(name="clientListName")
    private @Nullable Output<String> clientListName;

    /**
     * @return Client_list_name here should refer to client_list above
     * 
     */
    public Optional<Output<String>> clientListName() {
        return Optional.ofNullable(this.clientListName);
    }

    @Import(name="communityName")
    private @Nullable Output<String> communityName;

    public Optional<Output<String>> communityName() {
        return Optional.ofNullable(this.communityName);
    }

    /**
     * View name here should be defined in views above
     * 
     */
    @Import(name="view")
    private @Nullable Output<String> view;

    /**
     * @return View name here should be defined in views above
     * 
     */
    public Optional<Output<String>> view() {
        return Optional.ofNullable(this.view);
    }

    private NetworktemplateSnmpConfigV2cConfigArgs() {}

    private NetworktemplateSnmpConfigV2cConfigArgs(NetworktemplateSnmpConfigV2cConfigArgs $) {
        this.authorization = $.authorization;
        this.clientListName = $.clientListName;
        this.communityName = $.communityName;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSnmpConfigV2cConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSnmpConfigV2cConfigArgs $;

        public Builder() {
            $ = new NetworktemplateSnmpConfigV2cConfigArgs();
        }

        public Builder(NetworktemplateSnmpConfigV2cConfigArgs defaults) {
            $ = new NetworktemplateSnmpConfigV2cConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorization(@Nullable Output<String> authorization) {
            $.authorization = authorization;
            return this;
        }

        public Builder authorization(String authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param clientListName Client_list_name here should refer to client_list above
         * 
         * @return builder
         * 
         */
        public Builder clientListName(@Nullable Output<String> clientListName) {
            $.clientListName = clientListName;
            return this;
        }

        /**
         * @param clientListName Client_list_name here should refer to client_list above
         * 
         * @return builder
         * 
         */
        public Builder clientListName(String clientListName) {
            return clientListName(Output.of(clientListName));
        }

        public Builder communityName(@Nullable Output<String> communityName) {
            $.communityName = communityName;
            return this;
        }

        public Builder communityName(String communityName) {
            return communityName(Output.of(communityName));
        }

        /**
         * @param view View name here should be defined in views above
         * 
         * @return builder
         * 
         */
        public Builder view(@Nullable Output<String> view) {
            $.view = view;
            return this;
        }

        /**
         * @param view View name here should be defined in views above
         * 
         * @return builder
         * 
         */
        public Builder view(String view) {
            return view(Output.of(view));
        }

        public NetworktemplateSnmpConfigV2cConfigArgs build() {
            return $;
        }
    }

}
