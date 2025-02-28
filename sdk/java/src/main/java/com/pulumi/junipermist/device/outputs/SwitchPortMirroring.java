// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchPortMirroring {
    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    private @Nullable List<String> inputNetworksIngresses;
    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    private @Nullable List<String> inputPortIdsEgresses;
    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    private @Nullable List<String> inputPortIdsIngresses;
    /**
     * @return Exaclty one of the `output_port_id` or `output_network` should be provided
     * 
     */
    private @Nullable String outputNetwork;
    /**
     * @return Exaclty one of the `output_port_id` or `output_network` should be provided
     * 
     */
    private @Nullable String outputPortId;

    private SwitchPortMirroring() {}
    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    public List<String> inputNetworksIngresses() {
        return this.inputNetworksIngresses == null ? List.of() : this.inputNetworksIngresses;
    }
    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    public List<String> inputPortIdsEgresses() {
        return this.inputPortIdsEgresses == null ? List.of() : this.inputPortIdsEgresses;
    }
    /**
     * @return At least one of the `input_port_ids_ingress`, `input_port_ids_egress` or ` input_networks_ingress  ` should be specified
     * 
     */
    public List<String> inputPortIdsIngresses() {
        return this.inputPortIdsIngresses == null ? List.of() : this.inputPortIdsIngresses;
    }
    /**
     * @return Exaclty one of the `output_port_id` or `output_network` should be provided
     * 
     */
    public Optional<String> outputNetwork() {
        return Optional.ofNullable(this.outputNetwork);
    }
    /**
     * @return Exaclty one of the `output_port_id` or `output_network` should be provided
     * 
     */
    public Optional<String> outputPortId() {
        return Optional.ofNullable(this.outputPortId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchPortMirroring defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> inputNetworksIngresses;
        private @Nullable List<String> inputPortIdsEgresses;
        private @Nullable List<String> inputPortIdsIngresses;
        private @Nullable String outputNetwork;
        private @Nullable String outputPortId;
        public Builder() {}
        public Builder(SwitchPortMirroring defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputNetworksIngresses = defaults.inputNetworksIngresses;
    	      this.inputPortIdsEgresses = defaults.inputPortIdsEgresses;
    	      this.inputPortIdsIngresses = defaults.inputPortIdsIngresses;
    	      this.outputNetwork = defaults.outputNetwork;
    	      this.outputPortId = defaults.outputPortId;
        }

        @CustomType.Setter
        public Builder inputNetworksIngresses(@Nullable List<String> inputNetworksIngresses) {

            this.inputNetworksIngresses = inputNetworksIngresses;
            return this;
        }
        public Builder inputNetworksIngresses(String... inputNetworksIngresses) {
            return inputNetworksIngresses(List.of(inputNetworksIngresses));
        }
        @CustomType.Setter
        public Builder inputPortIdsEgresses(@Nullable List<String> inputPortIdsEgresses) {

            this.inputPortIdsEgresses = inputPortIdsEgresses;
            return this;
        }
        public Builder inputPortIdsEgresses(String... inputPortIdsEgresses) {
            return inputPortIdsEgresses(List.of(inputPortIdsEgresses));
        }
        @CustomType.Setter
        public Builder inputPortIdsIngresses(@Nullable List<String> inputPortIdsIngresses) {

            this.inputPortIdsIngresses = inputPortIdsIngresses;
            return this;
        }
        public Builder inputPortIdsIngresses(String... inputPortIdsIngresses) {
            return inputPortIdsIngresses(List.of(inputPortIdsIngresses));
        }
        @CustomType.Setter
        public Builder outputNetwork(@Nullable String outputNetwork) {

            this.outputNetwork = outputNetwork;
            return this;
        }
        @CustomType.Setter
        public Builder outputPortId(@Nullable String outputPortId) {

            this.outputPortId = outputPortId;
            return this;
        }
        public SwitchPortMirroring build() {
            final var _resultValue = new SwitchPortMirroring();
            _resultValue.inputNetworksIngresses = inputNetworksIngresses;
            _resultValue.inputPortIdsEgresses = inputPortIdsEgresses;
            _resultValue.inputPortIdsIngresses = inputPortIdsIngresses;
            _resultValue.outputNetwork = outputNetwork;
            _resultValue.outputPortId = outputPortId;
            return _resultValue;
        }
    }
}
