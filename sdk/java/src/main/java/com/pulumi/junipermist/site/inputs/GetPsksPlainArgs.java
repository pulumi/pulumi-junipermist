// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPsksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPsksPlainArgs Empty = new GetPsksPlainArgs();

    @Import(name="limit")
    private @Nullable Integer limit;

    public Optional<Integer> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="page")
    private @Nullable Integer page;

    public Optional<Integer> page() {
        return Optional.ofNullable(this.page);
    }

    @Import(name="role")
    private @Nullable String role;

    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="siteId", required=true)
    private String siteId;

    public String siteId() {
        return this.siteId;
    }

    @Import(name="ssid")
    private @Nullable String ssid;

    public Optional<String> ssid() {
        return Optional.ofNullable(this.ssid);
    }

    private GetPsksPlainArgs() {}

    private GetPsksPlainArgs(GetPsksPlainArgs $) {
        this.limit = $.limit;
        this.name = $.name;
        this.page = $.page;
        this.role = $.role;
        this.siteId = $.siteId;
        this.ssid = $.ssid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPsksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPsksPlainArgs $;

        public Builder() {
            $ = new GetPsksPlainArgs();
        }

        public Builder(GetPsksPlainArgs defaults) {
            $ = new GetPsksPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder limit(@Nullable Integer limit) {
            $.limit = limit;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder page(@Nullable Integer page) {
            $.page = page;
            return this;
        }

        public Builder role(@Nullable String role) {
            $.role = role;
            return this;
        }

        public Builder siteId(String siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder ssid(@Nullable String ssid) {
            $.ssid = ssid;
            return this;
        }

        public GetPsksPlainArgs build() {
            if ($.siteId == null) {
                throw new MissingRequiredPropertyException("GetPsksPlainArgs", "siteId");
            }
            return $;
        }
    }

}
