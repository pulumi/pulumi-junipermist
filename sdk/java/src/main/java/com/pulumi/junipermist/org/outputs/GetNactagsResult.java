// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.GetNactagsOrgNactag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNactagsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String match;
    private @Nullable String name;
    private String orgId;
    private List<GetNactagsOrgNactag> orgNactags;
    private @Nullable String type;

    private GetNactagsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String orgId() {
        return this.orgId;
    }
    public List<GetNactagsOrgNactag> orgNactags() {
        return this.orgNactags;
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNactagsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String match;
        private @Nullable String name;
        private String orgId;
        private List<GetNactagsOrgNactag> orgNactags;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetNactagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.orgNactags = defaults.orgNactags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNactagsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder match(@Nullable String match) {

            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetNactagsResult", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder orgNactags(List<GetNactagsOrgNactag> orgNactags) {
            if (orgNactags == null) {
              throw new MissingRequiredPropertyException("GetNactagsResult", "orgNactags");
            }
            this.orgNactags = orgNactags;
            return this;
        }
        public Builder orgNactags(GetNactagsOrgNactag... orgNactags) {
            return orgNactags(List.of(orgNactags));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public GetNactagsResult build() {
            final var _resultValue = new GetNactagsResult();
            _resultValue.id = id;
            _resultValue.match = match;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.orgNactags = orgNactags;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
