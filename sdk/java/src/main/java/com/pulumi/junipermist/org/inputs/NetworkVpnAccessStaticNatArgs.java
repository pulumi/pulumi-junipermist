// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NetworkVpnAccessStaticNatArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkVpnAccessStaticNatArgs Empty = new NetworkVpnAccessStaticNatArgs();

    /**
     * The Static NAT destination IP Address. Must be an IP Address (i.e. &#34;192.168.70.3&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    @Import(name="internalIp", required=true)
    private Output<String> internalIp;

    /**
     * @return The Static NAT destination IP Address. Must be an IP Address (i.e. &#34;192.168.70.3&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Output<String> internalIp() {
        return this.internalIp;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private NetworkVpnAccessStaticNatArgs() {}

    private NetworkVpnAccessStaticNatArgs(NetworkVpnAccessStaticNatArgs $) {
        this.internalIp = $.internalIp;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkVpnAccessStaticNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkVpnAccessStaticNatArgs $;

        public Builder() {
            $ = new NetworkVpnAccessStaticNatArgs();
        }

        public Builder(NetworkVpnAccessStaticNatArgs defaults) {
            $ = new NetworkVpnAccessStaticNatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param internalIp The Static NAT destination IP Address. Must be an IP Address (i.e. &#34;192.168.70.3&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder internalIp(Output<String> internalIp) {
            $.internalIp = internalIp;
            return this;
        }

        /**
         * @param internalIp The Static NAT destination IP Address. Must be an IP Address (i.e. &#34;192.168.70.3&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
         * 
         * @return builder
         * 
         */
        public Builder internalIp(String internalIp) {
            return internalIp(Output.of(internalIp));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NetworkVpnAccessStaticNatArgs build() {
            if ($.internalIp == null) {
                throw new MissingRequiredPropertyException("NetworkVpnAccessStaticNatArgs", "internalIp");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("NetworkVpnAccessStaticNatArgs", "name");
            }
            return $;
        }
    }

}
