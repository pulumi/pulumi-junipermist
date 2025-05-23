// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworktemplateSwitchMatchingRulePortMirroringArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworktemplateSwitchMatchingRulePortMirroringArgs Empty = new NetworktemplateSwitchMatchingRulePortMirroringArgs();

    /**
     * At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    @Import(name="inputNetworksIngresses")
    private @Nullable Output<List<String>> inputNetworksIngresses;

    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    public Optional<Output<List<String>>> inputNetworksIngresses() {
        return Optional.ofNullable(this.inputNetworksIngresses);
    }

    /**
     * At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    @Import(name="inputPortIdsEgresses")
    private @Nullable Output<List<String>> inputPortIdsEgresses;

    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    public Optional<Output<List<String>>> inputPortIdsEgresses() {
        return Optional.ofNullable(this.inputPortIdsEgresses);
    }

    /**
     * At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    @Import(name="inputPortIdsIngresses")
    private @Nullable Output<List<String>> inputPortIdsIngresses;

    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    public Optional<Output<List<String>>> inputPortIdsIngresses() {
        return Optional.ofNullable(this.inputPortIdsIngresses);
    }

    /**
     * Exactly one of the `output_port_id` or `output_network` should be provided
     * 
     */
    @Import(name="outputNetwork")
    private @Nullable Output<String> outputNetwork;

    /**
     * @return Exactly one of the `output_port_id` or `output_network` should be provided
     * 
     */
    public Optional<Output<String>> outputNetwork() {
        return Optional.ofNullable(this.outputNetwork);
    }

    /**
     * Exactly one of the `output_port_id` or `output_network` should be provided
     * 
     */
    @Import(name="outputPortId")
    private @Nullable Output<String> outputPortId;

    /**
     * @return Exactly one of the `output_port_id` or `output_network` should be provided
     * 
     */
    public Optional<Output<String>> outputPortId() {
        return Optional.ofNullable(this.outputPortId);
    }

    private NetworktemplateSwitchMatchingRulePortMirroringArgs() {}

    private NetworktemplateSwitchMatchingRulePortMirroringArgs(NetworktemplateSwitchMatchingRulePortMirroringArgs $) {
        this.inputNetworksIngresses = $.inputNetworksIngresses;
        this.inputPortIdsEgresses = $.inputPortIdsEgresses;
        this.inputPortIdsIngresses = $.inputPortIdsIngresses;
        this.outputNetwork = $.outputNetwork;
        this.outputPortId = $.outputPortId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworktemplateSwitchMatchingRulePortMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworktemplateSwitchMatchingRulePortMirroringArgs $;

        public Builder() {
            $ = new NetworktemplateSwitchMatchingRulePortMirroringArgs();
        }

        public Builder(NetworktemplateSwitchMatchingRulePortMirroringArgs defaults) {
            $ = new NetworktemplateSwitchMatchingRulePortMirroringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputNetworksIngresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputNetworksIngresses(@Nullable Output<List<String>> inputNetworksIngresses) {
            $.inputNetworksIngresses = inputNetworksIngresses;
            return this;
        }

        /**
         * @param inputNetworksIngresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputNetworksIngresses(List<String> inputNetworksIngresses) {
            return inputNetworksIngresses(Output.of(inputNetworksIngresses));
        }

        /**
         * @param inputNetworksIngresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputNetworksIngresses(String... inputNetworksIngresses) {
            return inputNetworksIngresses(List.of(inputNetworksIngresses));
        }

        /**
         * @param inputPortIdsEgresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputPortIdsEgresses(@Nullable Output<List<String>> inputPortIdsEgresses) {
            $.inputPortIdsEgresses = inputPortIdsEgresses;
            return this;
        }

        /**
         * @param inputPortIdsEgresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputPortIdsEgresses(List<String> inputPortIdsEgresses) {
            return inputPortIdsEgresses(Output.of(inputPortIdsEgresses));
        }

        /**
         * @param inputPortIdsEgresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputPortIdsEgresses(String... inputPortIdsEgresses) {
            return inputPortIdsEgresses(List.of(inputPortIdsEgresses));
        }

        /**
         * @param inputPortIdsIngresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputPortIdsIngresses(@Nullable Output<List<String>> inputPortIdsIngresses) {
            $.inputPortIdsIngresses = inputPortIdsIngresses;
            return this;
        }

        /**
         * @param inputPortIdsIngresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputPortIdsIngresses(List<String> inputPortIdsIngresses) {
            return inputPortIdsIngresses(Output.of(inputPortIdsIngresses));
        }

        /**
         * @param inputPortIdsIngresses At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
         * 
         * @return builder
         * 
         */
        public Builder inputPortIdsIngresses(String... inputPortIdsIngresses) {
            return inputPortIdsIngresses(List.of(inputPortIdsIngresses));
        }

        /**
         * @param outputNetwork Exactly one of the `output_port_id` or `output_network` should be provided
         * 
         * @return builder
         * 
         */
        public Builder outputNetwork(@Nullable Output<String> outputNetwork) {
            $.outputNetwork = outputNetwork;
            return this;
        }

        /**
         * @param outputNetwork Exactly one of the `output_port_id` or `output_network` should be provided
         * 
         * @return builder
         * 
         */
        public Builder outputNetwork(String outputNetwork) {
            return outputNetwork(Output.of(outputNetwork));
        }

        /**
         * @param outputPortId Exactly one of the `output_port_id` or `output_network` should be provided
         * 
         * @return builder
         * 
         */
        public Builder outputPortId(@Nullable Output<String> outputPortId) {
            $.outputPortId = outputPortId;
            return this;
        }

        /**
         * @param outputPortId Exactly one of the `output_port_id` or `output_network` should be provided
         * 
         * @return builder
         * 
         */
        public Builder outputPortId(String outputPortId) {
            return outputPortId(Output.of(outputPortId));
        }

        public NetworktemplateSwitchMatchingRulePortMirroringArgs build() {
            return $;
        }
    }

}
