// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWlansSiteWlanHotspot20 {
    private List<String> domainNames;
    /**
     * @return Whether to enable hotspot 2.0 config
     * 
     */
    private Boolean enabled;
    private List<String> naiRealms;
    /**
     * @return List of operators to support
     * 
     */
    private List<String> operators;
    private List<String> rcois;
    /**
     * @return Venue name, default is site name
     * 
     */
    private String venueName;

    private GetWlansSiteWlanHotspot20() {}
    public List<String> domainNames() {
        return this.domainNames;
    }
    /**
     * @return Whether to enable hotspot 2.0 config
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    public List<String> naiRealms() {
        return this.naiRealms;
    }
    /**
     * @return List of operators to support
     * 
     */
    public List<String> operators() {
        return this.operators;
    }
    public List<String> rcois() {
        return this.rcois;
    }
    /**
     * @return Venue name, default is site name
     * 
     */
    public String venueName() {
        return this.venueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWlansSiteWlanHotspot20 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> domainNames;
        private Boolean enabled;
        private List<String> naiRealms;
        private List<String> operators;
        private List<String> rcois;
        private String venueName;
        public Builder() {}
        public Builder(GetWlansSiteWlanHotspot20 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNames = defaults.domainNames;
    	      this.enabled = defaults.enabled;
    	      this.naiRealms = defaults.naiRealms;
    	      this.operators = defaults.operators;
    	      this.rcois = defaults.rcois;
    	      this.venueName = defaults.venueName;
        }

        @CustomType.Setter
        public Builder domainNames(List<String> domainNames) {
            if (domainNames == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanHotspot20", "domainNames");
            }
            this.domainNames = domainNames;
            return this;
        }
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanHotspot20", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder naiRealms(List<String> naiRealms) {
            if (naiRealms == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanHotspot20", "naiRealms");
            }
            this.naiRealms = naiRealms;
            return this;
        }
        public Builder naiRealms(String... naiRealms) {
            return naiRealms(List.of(naiRealms));
        }
        @CustomType.Setter
        public Builder operators(List<String> operators) {
            if (operators == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanHotspot20", "operators");
            }
            this.operators = operators;
            return this;
        }
        public Builder operators(String... operators) {
            return operators(List.of(operators));
        }
        @CustomType.Setter
        public Builder rcois(List<String> rcois) {
            if (rcois == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanHotspot20", "rcois");
            }
            this.rcois = rcois;
            return this;
        }
        public Builder rcois(String... rcois) {
            return rcois(List.of(rcois));
        }
        @CustomType.Setter
        public Builder venueName(String venueName) {
            if (venueName == null) {
              throw new MissingRequiredPropertyException("GetWlansSiteWlanHotspot20", "venueName");
            }
            this.venueName = venueName;
            return this;
        }
        public GetWlansSiteWlanHotspot20 build() {
            final var _resultValue = new GetWlansSiteWlanHotspot20();
            _resultValue.domainNames = domainNames;
            _resultValue.enabled = enabled;
            _resultValue.naiRealms = naiRealms;
            _resultValue.operators = operators;
            _resultValue.rcois = rcois;
            _resultValue.venueName = venueName;
            return _resultValue;
        }
    }
}
