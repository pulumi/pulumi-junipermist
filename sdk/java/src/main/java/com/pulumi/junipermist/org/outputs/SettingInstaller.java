// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SettingInstaller {
    private @Nullable Boolean allowAllDevices;
    private @Nullable Boolean allowAllSites;
    private @Nullable List<String> extraSiteIds;
    private @Nullable Integer gracePeriod;

    private SettingInstaller() {}
    public Optional<Boolean> allowAllDevices() {
        return Optional.ofNullable(this.allowAllDevices);
    }
    public Optional<Boolean> allowAllSites() {
        return Optional.ofNullable(this.allowAllSites);
    }
    public List<String> extraSiteIds() {
        return this.extraSiteIds == null ? List.of() : this.extraSiteIds;
    }
    public Optional<Integer> gracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingInstaller defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowAllDevices;
        private @Nullable Boolean allowAllSites;
        private @Nullable List<String> extraSiteIds;
        private @Nullable Integer gracePeriod;
        public Builder() {}
        public Builder(SettingInstaller defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllDevices = defaults.allowAllDevices;
    	      this.allowAllSites = defaults.allowAllSites;
    	      this.extraSiteIds = defaults.extraSiteIds;
    	      this.gracePeriod = defaults.gracePeriod;
        }

        @CustomType.Setter
        public Builder allowAllDevices(@Nullable Boolean allowAllDevices) {

            this.allowAllDevices = allowAllDevices;
            return this;
        }
        @CustomType.Setter
        public Builder allowAllSites(@Nullable Boolean allowAllSites) {

            this.allowAllSites = allowAllSites;
            return this;
        }
        @CustomType.Setter
        public Builder extraSiteIds(@Nullable List<String> extraSiteIds) {

            this.extraSiteIds = extraSiteIds;
            return this;
        }
        public Builder extraSiteIds(String... extraSiteIds) {
            return extraSiteIds(List.of(extraSiteIds));
        }
        @CustomType.Setter
        public Builder gracePeriod(@Nullable Integer gracePeriod) {

            this.gracePeriod = gracePeriod;
            return this;
        }
        public SettingInstaller build() {
            final var _resultValue = new SettingInstaller();
            _resultValue.allowAllDevices = allowAllDevices;
            _resultValue.allowAllSites = allowAllSites;
            _resultValue.extraSiteIds = extraSiteIds;
            _resultValue.gracePeriod = gracePeriod;
            return _resultValue;
        }
    }
}