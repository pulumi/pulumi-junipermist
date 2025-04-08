// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.outputs.IdpprofileOverwriteMatching;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IdpprofileOverwrite {
    /**
     * @return enum:
     *   * alert (default)
     *   * drop: silently dropping packets
     *   * close: notify client/server to close connection
     * 
     */
    private @Nullable String action;
    private @Nullable IdpprofileOverwriteMatching matching;
    private String name;

    private IdpprofileOverwrite() {}
    /**
     * @return enum:
     *   * alert (default)
     *   * drop: silently dropping packets
     *   * close: notify client/server to close connection
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    public Optional<IdpprofileOverwriteMatching> matching() {
        return Optional.ofNullable(this.matching);
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdpprofileOverwrite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable IdpprofileOverwriteMatching matching;
        private String name;
        public Builder() {}
        public Builder(IdpprofileOverwrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.matching = defaults.matching;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder matching(@Nullable IdpprofileOverwriteMatching matching) {

            this.matching = matching;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("IdpprofileOverwrite", "name");
            }
            this.name = name;
            return this;
        }
        public IdpprofileOverwrite build() {
            final var _resultValue = new IdpprofileOverwrite();
            _resultValue.action = action;
            _resultValue.matching = matching;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
