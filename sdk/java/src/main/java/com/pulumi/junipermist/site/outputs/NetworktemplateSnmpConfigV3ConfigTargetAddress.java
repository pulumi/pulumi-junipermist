// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV3ConfigTargetAddress {
    private String address;
    private String addressMask;
    private @Nullable String port;
    /**
     * @return Refer to notify tag, can be multiple with blank
     * 
     */
    private @Nullable String tagList;
    private String targetAddressName;
    /**
     * @return Refer to notify target parameters name
     * 
     */
    private @Nullable String targetParameters;

    private NetworktemplateSnmpConfigV3ConfigTargetAddress() {}
    public String address() {
        return this.address;
    }
    public String addressMask() {
        return this.addressMask;
    }
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return Refer to notify tag, can be multiple with blank
     * 
     */
    public Optional<String> tagList() {
        return Optional.ofNullable(this.tagList);
    }
    public String targetAddressName() {
        return this.targetAddressName;
    }
    /**
     * @return Refer to notify target parameters name
     * 
     */
    public Optional<String> targetParameters() {
        return Optional.ofNullable(this.targetParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV3ConfigTargetAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String addressMask;
        private @Nullable String port;
        private @Nullable String tagList;
        private String targetAddressName;
        private @Nullable String targetParameters;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV3ConfigTargetAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressMask = defaults.addressMask;
    	      this.port = defaults.port;
    	      this.tagList = defaults.tagList;
    	      this.targetAddressName = defaults.targetAddressName;
    	      this.targetParameters = defaults.targetParameters;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("NetworktemplateSnmpConfigV3ConfigTargetAddress", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder addressMask(String addressMask) {
            if (addressMask == null) {
              throw new MissingRequiredPropertyException("NetworktemplateSnmpConfigV3ConfigTargetAddress", "addressMask");
            }
            this.addressMask = addressMask;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder tagList(@Nullable String tagList) {

            this.tagList = tagList;
            return this;
        }
        @CustomType.Setter
        public Builder targetAddressName(String targetAddressName) {
            if (targetAddressName == null) {
              throw new MissingRequiredPropertyException("NetworktemplateSnmpConfigV3ConfigTargetAddress", "targetAddressName");
            }
            this.targetAddressName = targetAddressName;
            return this;
        }
        @CustomType.Setter
        public Builder targetParameters(@Nullable String targetParameters) {

            this.targetParameters = targetParameters;
            return this;
        }
        public NetworktemplateSnmpConfigV3ConfigTargetAddress build() {
            final var _resultValue = new NetworktemplateSnmpConfigV3ConfigTargetAddress();
            _resultValue.address = address;
            _resultValue.addressMask = addressMask;
            _resultValue.port = port;
            _resultValue.tagList = tagList;
            _resultValue.targetAddressName = targetAddressName;
            _resultValue.targetParameters = targetParameters;
            return _resultValue;
        }
    }
}
