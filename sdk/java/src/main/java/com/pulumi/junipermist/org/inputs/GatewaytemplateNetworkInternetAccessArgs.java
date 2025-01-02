// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.GatewaytemplateNetworkInternetAccessDestinationNatArgs;
import com.pulumi.junipermist.org.inputs.GatewaytemplateNetworkInternetAccessStaticNatArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewaytemplateNetworkInternetAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewaytemplateNetworkInternetAccessArgs Empty = new GatewaytemplateNetworkInternetAccessArgs();

    @Import(name="createSimpleServicePolicy")
    private @Nullable Output<Boolean> createSimpleServicePolicy;

    public Optional<Output<Boolean>> createSimpleServicePolicy() {
        return Optional.ofNullable(this.createSimpleServicePolicy);
    }

    /**
     * Property key can be an External IP (i.e. &#34;63.16.0.3&#34;), an External IP:Port (i.e. &#34;63.16.0.3:443&#34;), an External Port (i.e. &#34;:443&#34;), an External CIDR (i.e. &#34;63.16.0.0/30&#34;), an External CIDR:Port (i.e. &#34;63.16.0.0/30:443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;). At least one of the `internal_ip` or `port` must be defined
     * 
     */
    @Import(name="destinationNat")
    private @Nullable Output<Map<String,GatewaytemplateNetworkInternetAccessDestinationNatArgs>> destinationNat;

    /**
     * @return Property key can be an External IP (i.e. &#34;63.16.0.3&#34;), an External IP:Port (i.e. &#34;63.16.0.3:443&#34;), an External Port (i.e. &#34;:443&#34;), an External CIDR (i.e. &#34;63.16.0.0/30&#34;), an External CIDR:Port (i.e. &#34;63.16.0.0/30:443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;). At least one of the `internal_ip` or `port` must be defined
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateNetworkInternetAccessDestinationNatArgs>>> destinationNat() {
        return Optional.ofNullable(this.destinationNat);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    @Import(name="restricted")
    private @Nullable Output<Boolean> restricted;

    /**
     * @return by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    public Optional<Output<Boolean>> restricted() {
        return Optional.ofNullable(this.restricted);
    }

    /**
     * Property key may be an External IP Address (i.e. &#34;63.16.0.3&#34;), a CIDR (i.e. &#34;63.16.0.12/20&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="staticNat")
    private @Nullable Output<Map<String,GatewaytemplateNetworkInternetAccessStaticNatArgs>> staticNat;

    /**
     * @return Property key may be an External IP Address (i.e. &#34;63.16.0.3&#34;), a CIDR (i.e. &#34;63.16.0.12/20&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<Output<Map<String,GatewaytemplateNetworkInternetAccessStaticNatArgs>>> staticNat() {
        return Optional.ofNullable(this.staticNat);
    }

    private GatewaytemplateNetworkInternetAccessArgs() {}

    private GatewaytemplateNetworkInternetAccessArgs(GatewaytemplateNetworkInternetAccessArgs $) {
        this.createSimpleServicePolicy = $.createSimpleServicePolicy;
        this.destinationNat = $.destinationNat;
        this.enabled = $.enabled;
        this.restricted = $.restricted;
        this.staticNat = $.staticNat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewaytemplateNetworkInternetAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewaytemplateNetworkInternetAccessArgs $;

        public Builder() {
            $ = new GatewaytemplateNetworkInternetAccessArgs();
        }

        public Builder(GatewaytemplateNetworkInternetAccessArgs defaults) {
            $ = new GatewaytemplateNetworkInternetAccessArgs(Objects.requireNonNull(defaults));
        }

        public Builder createSimpleServicePolicy(@Nullable Output<Boolean> createSimpleServicePolicy) {
            $.createSimpleServicePolicy = createSimpleServicePolicy;
            return this;
        }

        public Builder createSimpleServicePolicy(Boolean createSimpleServicePolicy) {
            return createSimpleServicePolicy(Output.of(createSimpleServicePolicy));
        }

        /**
         * @param destinationNat Property key can be an External IP (i.e. &#34;63.16.0.3&#34;), an External IP:Port (i.e. &#34;63.16.0.3:443&#34;), an External Port (i.e. &#34;:443&#34;), an External CIDR (i.e. &#34;63.16.0.0/30&#34;), an External CIDR:Port (i.e. &#34;63.16.0.0/30:443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;). At least one of the `internal_ip` or `port` must be defined
         * 
         * @return builder
         * 
         */
        public Builder destinationNat(@Nullable Output<Map<String,GatewaytemplateNetworkInternetAccessDestinationNatArgs>> destinationNat) {
            $.destinationNat = destinationNat;
            return this;
        }

        /**
         * @param destinationNat Property key can be an External IP (i.e. &#34;63.16.0.3&#34;), an External IP:Port (i.e. &#34;63.16.0.3:443&#34;), an External Port (i.e. &#34;:443&#34;), an External CIDR (i.e. &#34;63.16.0.0/30&#34;), an External CIDR:Port (i.e. &#34;63.16.0.0/30:443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;). At least one of the `internal_ip` or `port` must be defined
         * 
         * @return builder
         * 
         */
        public Builder destinationNat(Map<String,GatewaytemplateNetworkInternetAccessDestinationNatArgs> destinationNat) {
            return destinationNat(Output.of(destinationNat));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param restricted by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
         * 
         * @return builder
         * 
         */
        public Builder restricted(@Nullable Output<Boolean> restricted) {
            $.restricted = restricted;
            return this;
        }

        /**
         * @param restricted by default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
         * 
         * @return builder
         * 
         */
        public Builder restricted(Boolean restricted) {
            return restricted(Output.of(restricted));
        }

        /**
         * @param staticNat Property key may be an External IP Address (i.e. &#34;63.16.0.3&#34;), a CIDR (i.e. &#34;63.16.0.12/20&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder staticNat(@Nullable Output<Map<String,GatewaytemplateNetworkInternetAccessStaticNatArgs>> staticNat) {
            $.staticNat = staticNat;
            return this;
        }

        /**
         * @param staticNat Property key may be an External IP Address (i.e. &#34;63.16.0.3&#34;), a CIDR (i.e. &#34;63.16.0.12/20&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder staticNat(Map<String,GatewaytemplateNetworkInternetAccessStaticNatArgs> staticNat) {
            return staticNat(Output.of(staticNat));
        }

        public GatewaytemplateNetworkInternetAccessArgs build() {
            return $;
        }
    }

}
