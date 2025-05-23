// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SwitchSnmpConfigView {
    /**
     * @return If the root oid configured is included
     * 
     */
    private @Nullable Boolean include;
    private @Nullable String oid;
    private @Nullable String viewName;

    private SwitchSnmpConfigView() {}
    /**
     * @return If the root oid configured is included
     * 
     */
    public Optional<Boolean> include() {
        return Optional.ofNullable(this.include);
    }
    public Optional<String> oid() {
        return Optional.ofNullable(this.oid);
    }
    public Optional<String> viewName() {
        return Optional.ofNullable(this.viewName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchSnmpConfigView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean include;
        private @Nullable String oid;
        private @Nullable String viewName;
        public Builder() {}
        public Builder(SwitchSnmpConfigView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.include = defaults.include;
    	      this.oid = defaults.oid;
    	      this.viewName = defaults.viewName;
        }

        @CustomType.Setter
        public Builder include(@Nullable Boolean include) {

            this.include = include;
            return this;
        }
        @CustomType.Setter
        public Builder oid(@Nullable String oid) {

            this.oid = oid;
            return this;
        }
        @CustomType.Setter
        public Builder viewName(@Nullable String viewName) {

            this.viewName = viewName;
            return this;
        }
        public SwitchSnmpConfigView build() {
            final var _resultValue = new SwitchSnmpConfigView();
            _resultValue.include = include;
            _resultValue.oid = oid;
            _resultValue.viewName = viewName;
            return _resultValue;
        }
    }
}
