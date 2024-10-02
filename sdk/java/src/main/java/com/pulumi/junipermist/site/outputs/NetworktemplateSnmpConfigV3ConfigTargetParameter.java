// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworktemplateSnmpConfigV3ConfigTargetParameter {
    /**
     * @return enum: `v1`, `v2c`, `v3`
     * 
     */
    private @Nullable String messageProcessingModel;
    private @Nullable String name;
    /**
     * @return refer to profile-name in notify_filter
     * 
     */
    private @Nullable String notifyFilter;
    /**
     * @return enum: `authentication`, `none`, `privacy`
     * 
     */
    private @Nullable String securityLevel;
    /**
     * @return enum: `usm`, `v1`, `v2c`
     * 
     */
    private @Nullable String securityModel;
    /**
     * @return refer to security_name in usm
     * 
     */
    private @Nullable String securityName;

    private NetworktemplateSnmpConfigV3ConfigTargetParameter() {}
    /**
     * @return enum: `v1`, `v2c`, `v3`
     * 
     */
    public Optional<String> messageProcessingModel() {
        return Optional.ofNullable(this.messageProcessingModel);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return refer to profile-name in notify_filter
     * 
     */
    public Optional<String> notifyFilter() {
        return Optional.ofNullable(this.notifyFilter);
    }
    /**
     * @return enum: `authentication`, `none`, `privacy`
     * 
     */
    public Optional<String> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    /**
     * @return enum: `usm`, `v1`, `v2c`
     * 
     */
    public Optional<String> securityModel() {
        return Optional.ofNullable(this.securityModel);
    }
    /**
     * @return refer to security_name in usm
     * 
     */
    public Optional<String> securityName() {
        return Optional.ofNullable(this.securityName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworktemplateSnmpConfigV3ConfigTargetParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String messageProcessingModel;
        private @Nullable String name;
        private @Nullable String notifyFilter;
        private @Nullable String securityLevel;
        private @Nullable String securityModel;
        private @Nullable String securityName;
        public Builder() {}
        public Builder(NetworktemplateSnmpConfigV3ConfigTargetParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageProcessingModel = defaults.messageProcessingModel;
    	      this.name = defaults.name;
    	      this.notifyFilter = defaults.notifyFilter;
    	      this.securityLevel = defaults.securityLevel;
    	      this.securityModel = defaults.securityModel;
    	      this.securityName = defaults.securityName;
        }

        @CustomType.Setter
        public Builder messageProcessingModel(@Nullable String messageProcessingModel) {

            this.messageProcessingModel = messageProcessingModel;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notifyFilter(@Nullable String notifyFilter) {

            this.notifyFilter = notifyFilter;
            return this;
        }
        @CustomType.Setter
        public Builder securityLevel(@Nullable String securityLevel) {

            this.securityLevel = securityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder securityModel(@Nullable String securityModel) {

            this.securityModel = securityModel;
            return this;
        }
        @CustomType.Setter
        public Builder securityName(@Nullable String securityName) {

            this.securityName = securityName;
            return this;
        }
        public NetworktemplateSnmpConfigV3ConfigTargetParameter build() {
            final var _resultValue = new NetworktemplateSnmpConfigV3ConfigTargetParameter();
            _resultValue.messageProcessingModel = messageProcessingModel;
            _resultValue.name = name;
            _resultValue.notifyFilter = notifyFilter;
            _resultValue.securityLevel = securityLevel;
            _resultValue.securityModel = securityModel;
            _resultValue.securityName = securityName;
            return _resultValue;
        }
    }
}