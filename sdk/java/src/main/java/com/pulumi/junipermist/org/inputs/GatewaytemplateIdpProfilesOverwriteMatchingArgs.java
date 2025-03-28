// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateIdpProfilesOverwriteMatchingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateIdpProfilesOverwriteMatchingArgs Empty = new GatewaytemplateIdpProfilesOverwriteMatchingArgs();

    @Import(name="attackNames")
    private @Nullable Output<List<String>> attackNames;

    public Optional<Output<List<String>>> attackNames() {
        return Optional.ofNullable(this.attackNames);
    }

    @Import(name="dstSubnets")
    private @Nullable Output<List<String>> dstSubnets;

    public Optional<Output<List<String>>> dstSubnets() {
        return Optional.ofNullable(this.dstSubnets);
    }

    @Import(name="severities")
    private @Nullable Output<List<String>> severities;

    public Optional<Output<List<String>>> severities() {
        return Optional.ofNullable(this.severities);
    }

    private GatewaytemplateIdpProfilesOverwriteMatchingArgs() {}

    private GatewaytemplateIdpProfilesOverwriteMatchingArgs(GatewaytemplateIdpProfilesOverwriteMatchingArgs $) {
        this.attackNames = $.attackNames;
        this.dstSubnets = $.dstSubnets;
        this.severities = $.severities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateIdpProfilesOverwriteMatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateIdpProfilesOverwriteMatchingArgs $;

        public Builder() {
            $ = new GatewaytemplateIdpProfilesOverwriteMatchingArgs();
        }

        public Builder(GatewaytemplateIdpProfilesOverwriteMatchingArgs defaults) {
            $ = new GatewaytemplateIdpProfilesOverwriteMatchingArgs(Objects.requireNonNull(defaults));
        }

        public Builder attackNames(@Nullable Output<List<String>> attackNames) {
            $.attackNames = attackNames;
            return this;
        }

        public Builder attackNames(List<String> attackNames) {
            return attackNames(Output.of(attackNames));
        }

        public Builder attackNames(String... attackNames) {
            return attackNames(List.of(attackNames));
        }

        public Builder dstSubnets(@Nullable Output<List<String>> dstSubnets) {
            $.dstSubnets = dstSubnets;
            return this;
        }

        public Builder dstSubnets(List<String> dstSubnets) {
            return dstSubnets(Output.of(dstSubnets));
        }

        public Builder dstSubnets(String... dstSubnets) {
            return dstSubnets(List.of(dstSubnets));
        }

        public Builder severities(@Nullable Output<List<String>> severities) {
            $.severities = severities;
            return this;
        }

        public Builder severities(List<String> severities) {
            return severities(Output.of(severities));
        }

        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }

        public GatewaytemplateIdpProfilesOverwriteMatchingArgs build() {
            return $;
        }
    }

}
