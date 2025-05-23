// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNactagsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNactagsArgs Empty = new GetNactagsArgs();

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GetNactagsArgs() {}

    private GetNactagsArgs(GetNactagsArgs $) {
        this.match = $.match;
        this.name = $.name;
        this.orgId = $.orgId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNactagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNactagsArgs $;

        public Builder() {
            $ = new GetNactagsArgs();
        }

        public Builder(GetNactagsArgs defaults) {
            $ = new GetNactagsArgs(Objects.requireNonNull(defaults));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetNactagsArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetNactagsArgs", "orgId");
            }
            return $;
        }
    }

}
