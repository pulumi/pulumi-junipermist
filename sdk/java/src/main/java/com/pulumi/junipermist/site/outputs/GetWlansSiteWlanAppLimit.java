// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetWlansSiteWlanAppLimit {
    /**
     * @return Map from app key to bandwidth in kbps.
     * Property key is the app key, defined in Get Application List
     * 
     */
    private Map<String,Integer> apps;
    private Boolean enabled;
    /**
     * @return Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps. Property key is the `wxtag_id`
     * 
     */
    private Map<String,Integer> wxtagIds;

    private GetWlansSiteWlanAppLimit() {}
    /**
     * @return Map from app key to bandwidth in kbps.
     * Property key is the app key, defined in Get Application List
     * 
     */
    public Map<String,Integer> apps() {
        return this.apps;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Map from wxtag_id of Hostname Wxlan Tags to bandwidth in kbps. Property key is the `wxtag_id`
     * 
     */
    public Map<String,Integer> wxtagIds() {
        return this.wxtagIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansSiteWlanAppLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Integer> apps;
        private Boolean enabled;
        private Map<String,Integer> wxtagIds;
        public Builder() {}
        public Builder(GetWlansSiteWlanAppLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apps = defaults.apps;
    	      this.enabled = defaults.enabled;
    	      this.wxtagIds = defaults.wxtagIds;
        }

        @CustomType.Setter
        public Builder apps(Map<String,Integer> apps) {
            if (apps == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanAppLimit", "apps");
            }
            this.apps = apps;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanAppLimit", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder wxtagIds(Map<String,Integer> wxtagIds) {
            if (wxtagIds == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanAppLimit", "wxtagIds");
            }
            this.wxtagIds = wxtagIds;
            return this;
        }
        public GetWlansSiteWlanAppLimit build() {
            final var _resultValue = new GetWlansSiteWlanAppLimit();
            _resultValue.apps = apps;
            _resultValue.enabled = enabled;
            _resultValue.wxtagIds = wxtagIds;
            return _resultValue;
        }
    }
}
