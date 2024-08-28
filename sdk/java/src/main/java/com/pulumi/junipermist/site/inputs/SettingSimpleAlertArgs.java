// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.SettingSimpleAlertArpFailureArgs;
import com.pulumi.junipermist.site.inputs.SettingSimpleAlertDhcpFailureArgs;
import com.pulumi.junipermist.site.inputs.SettingSimpleAlertDnsFailureArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingSimpleAlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingSimpleAlertArgs Empty = new SettingSimpleAlertArgs();

    @Import(name="arpFailure")
    private @Nullable Output<SettingSimpleAlertArpFailureArgs> arpFailure;

    public Optional<Output<SettingSimpleAlertArpFailureArgs>> arpFailure() {
        return Optional.ofNullable(this.arpFailure);
    }

    @Import(name="dhcpFailure")
    private @Nullable Output<SettingSimpleAlertDhcpFailureArgs> dhcpFailure;

    public Optional<Output<SettingSimpleAlertDhcpFailureArgs>> dhcpFailure() {
        return Optional.ofNullable(this.dhcpFailure);
    }

    @Import(name="dnsFailure")
    private @Nullable Output<SettingSimpleAlertDnsFailureArgs> dnsFailure;

    public Optional<Output<SettingSimpleAlertDnsFailureArgs>> dnsFailure() {
        return Optional.ofNullable(this.dnsFailure);
    }

    private SettingSimpleAlertArgs() {}

    private SettingSimpleAlertArgs(SettingSimpleAlertArgs $) {
        this.arpFailure = $.arpFailure;
        this.dhcpFailure = $.dhcpFailure;
        this.dnsFailure = $.dnsFailure;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingSimpleAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingSimpleAlertArgs $;

        public Builder() {
            $ = new SettingSimpleAlertArgs();
        }

        public Builder(SettingSimpleAlertArgs defaults) {
            $ = new SettingSimpleAlertArgs(Objects.requireNonNull(defaults));
        }

        public Builder arpFailure(@Nullable Output<SettingSimpleAlertArpFailureArgs> arpFailure) {
            $.arpFailure = arpFailure;
            return this;
        }

        public Builder arpFailure(SettingSimpleAlertArpFailureArgs arpFailure) {
            return arpFailure(Output.of(arpFailure));
        }

        public Builder dhcpFailure(@Nullable Output<SettingSimpleAlertDhcpFailureArgs> dhcpFailure) {
            $.dhcpFailure = dhcpFailure;
            return this;
        }

        public Builder dhcpFailure(SettingSimpleAlertDhcpFailureArgs dhcpFailure) {
            return dhcpFailure(Output.of(dhcpFailure));
        }

        public Builder dnsFailure(@Nullable Output<SettingSimpleAlertDnsFailureArgs> dnsFailure) {
            $.dnsFailure = dnsFailure;
            return this;
        }

        public Builder dnsFailure(SettingSimpleAlertDnsFailureArgs dnsFailure) {
            return dnsFailure(Output.of(dnsFailure));
        }

        public SettingSimpleAlertArgs build() {
            return $;
        }
    }

}