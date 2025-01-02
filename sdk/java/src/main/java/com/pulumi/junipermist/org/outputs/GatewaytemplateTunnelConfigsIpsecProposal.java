// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GatewaytemplateTunnelConfigsIpsecProposal {
    /**
     * @return enum: `md5`, `sha1`, `sha2`
     * 
     */
    private @Nullable String authAlgo;
    /**
     * @return Only if `provider`==`custom-ipsec`. enum:
     *   * 1
     *   * 2 (1024-bit)
     *   * 5
     *   * 14 (default, 2048-bit)
     *   * 15 (3072-bit)
     *   * 16 (4096-bit)
     *   * 19 (256-bit ECP)
     *   * 20 (384-bit ECP)
     *   * 21 (521-bit ECP)
     *   * 24 (2048-bit ECP)
     * 
     */
    private @Nullable String dhGroup;
    /**
     * @return enum: `3des`, `aes128`, `aes256`, `aes_gcm128`, `aes_gcm256`
     * 
     */
    private @Nullable String encAlgo;

    private GatewaytemplateTunnelConfigsIpsecProposal() {}
    /**
     * @return enum: `md5`, `sha1`, `sha2`
     * 
     */
    public Optional<String> authAlgo() {
        return Optional.ofNullable(this.authAlgo);
    }
    /**
     * @return Only if `provider`==`custom-ipsec`. enum:
     *   * 1
     *   * 2 (1024-bit)
     *   * 5
     *   * 14 (default, 2048-bit)
     *   * 15 (3072-bit)
     *   * 16 (4096-bit)
     *   * 19 (256-bit ECP)
     *   * 20 (384-bit ECP)
     *   * 21 (521-bit ECP)
     *   * 24 (2048-bit ECP)
     * 
     */
    public Optional<String> dhGroup() {
        return Optional.ofNullable(this.dhGroup);
    }
    /**
     * @return enum: `3des`, `aes128`, `aes256`, `aes_gcm128`, `aes_gcm256`
     * 
     */
    public Optional<String> encAlgo() {
        return Optional.ofNullable(this.encAlgo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewaytemplateTunnelConfigsIpsecProposal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authAlgo;
        private @Nullable String dhGroup;
        private @Nullable String encAlgo;
        public Builder() {}
        public Builder(GatewaytemplateTunnelConfigsIpsecProposal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authAlgo = defaults.authAlgo;
    	      this.dhGroup = defaults.dhGroup;
    	      this.encAlgo = defaults.encAlgo;
        }

        @CustomType.Setter
        public Builder authAlgo(@Nullable String authAlgo) {

            this.authAlgo = authAlgo;
            return this;
        }
        @CustomType.Setter
        public Builder dhGroup(@Nullable String dhGroup) {

            this.dhGroup = dhGroup;
            return this;
        }
        @CustomType.Setter
        public Builder encAlgo(@Nullable String encAlgo) {

            this.encAlgo = encAlgo;
            return this;
        }
        public GatewaytemplateTunnelConfigsIpsecProposal build() {
            final var _resultValue = new GatewaytemplateTunnelConfigsIpsecProposal();
            _resultValue.authAlgo = authAlgo;
            _resultValue.dhGroup = dhGroup;
            _resultValue.encAlgo = encAlgo;
            return _resultValue;
        }
    }
}
