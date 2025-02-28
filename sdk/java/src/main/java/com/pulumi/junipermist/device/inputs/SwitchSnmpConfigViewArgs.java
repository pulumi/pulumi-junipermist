// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchSnmpConfigViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchSnmpConfigViewArgs Empty = new SwitchSnmpConfigViewArgs();

    /**
     * If the root oid configured is included
     * 
     */
    @Import(name="include")
    private @Nullable Output<Boolean> include;

    /**
     * @return If the root oid configured is included
     * 
     */
    public Optional<Output<Boolean>> include() {
        return Optional.ofNullable(this.include);
    }

    @Import(name="oid")
    private @Nullable Output<String> oid;

    public Optional<Output<String>> oid() {
        return Optional.ofNullable(this.oid);
    }

    @Import(name="viewName")
    private @Nullable Output<String> viewName;

    public Optional<Output<String>> viewName() {
        return Optional.ofNullable(this.viewName);
    }

    private SwitchSnmpConfigViewArgs() {}

    private SwitchSnmpConfigViewArgs(SwitchSnmpConfigViewArgs $) {
        this.include = $.include;
        this.oid = $.oid;
        this.viewName = $.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchSnmpConfigViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchSnmpConfigViewArgs $;

        public Builder() {
            $ = new SwitchSnmpConfigViewArgs();
        }

        public Builder(SwitchSnmpConfigViewArgs defaults) {
            $ = new SwitchSnmpConfigViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param include If the root oid configured is included
         * 
         * @return builder
         * 
         */
        public Builder include(@Nullable Output<Boolean> include) {
            $.include = include;
            return this;
        }

        /**
         * @param include If the root oid configured is included
         * 
         * @return builder
         * 
         */
        public Builder include(Boolean include) {
            return include(Output.of(include));
        }

        public Builder oid(@Nullable Output<String> oid) {
            $.oid = oid;
            return this;
        }

        public Builder oid(String oid) {
            return oid(Output.of(oid));
        }

        public Builder viewName(@Nullable Output<String> viewName) {
            $.viewName = viewName;
            return this;
        }

        public Builder viewName(String viewName) {
            return viewName(Output.of(viewName));
        }

        public SwitchSnmpConfigViewArgs build() {
            return $;
        }
    }

}
