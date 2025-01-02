// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInternetAccessDestinationNat {
    /**
     * @return The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private @Nullable String internalIp;
    private @Nullable String name;
    /**
     * @return The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private @Nullable String port;
    /**
     * @return SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    private @Nullable String wanName;

    private NetworkInternetAccessDestinationNat() {}
    /**
     * @return The Destination NAT destination IP Address. Must be an IP (i.e. &#34;192.168.70.30&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<String> internalIp() {
        return Optional.ofNullable(this.internalIp);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Destination NAT destination IP Address. Must be a Port (i.e. &#34;443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return SRX Only. If not set, we configure the nat policies against all WAN ports for simplicity
     * 
     */
    public Optional<String> wanName() {
        return Optional.ofNullable(this.wanName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInternetAccessDestinationNat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String internalIp;
        private @Nullable String name;
        private @Nullable String port;
        private @Nullable String wanName;
        public Builder() {}
        public Builder(NetworkInternetAccessDestinationNat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIp = defaults.internalIp;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.wanName = defaults.wanName;
        }

        @CustomType.Setter
        public Builder internalIp(@Nullable String internalIp) {

            this.internalIp = internalIp;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable String port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder wanName(@Nullable String wanName) {

            this.wanName = wanName;
            return this;
        }
        public NetworkInternetAccessDestinationNat build() {
            final var _resultValue = new NetworkInternetAccessDestinationNat();
            _resultValue.internalIp = internalIp;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.wanName = wanName;
            return _resultValue;
        }
    }
}
