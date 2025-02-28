// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceprofileApUsbConfig {
    /**
     * @return Only if `type`==`imagotag`
     * 
     */
    private @Nullable String cacert;
    /**
     * @return Only if `type`==`imagotag`, channel selection, not needed by default, required for manual channel override only
     * 
     */
    private @Nullable Integer channel;
    /**
     * @return Whether to enable any usb config
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Only if `type`==`imagotag`
     * 
     */
    private @Nullable String host;
    /**
     * @return Only if `type`==`imagotag`
     * 
     */
    private @Nullable Integer port;
    /**
     * @return usb config type. enum: `hanshow`, `imagotag`, `solum`
     * 
     */
    private @Nullable String type;
    /**
     * @return Only if `type`==`imagotag`, whether to turn on SSL verification
     * 
     */
    private @Nullable Boolean verifyCert;
    /**
     * @return Only if `type`==`solum` or `type`==`hanshow`
     * 
     */
    private @Nullable Integer vlanId;

    private DeviceprofileApUsbConfig() {}
    /**
     * @return Only if `type`==`imagotag`
     * 
     */
    public Optional<String> cacert() {
        return Optional.ofNullable(this.cacert);
    }
    /**
     * @return Only if `type`==`imagotag`, channel selection, not needed by default, required for manual channel override only
     * 
     */
    public Optional<Integer> channel() {
        return Optional.ofNullable(this.channel);
    }
    /**
     * @return Whether to enable any usb config
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Only if `type`==`imagotag`
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return Only if `type`==`imagotag`
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return usb config type. enum: `hanshow`, `imagotag`, `solum`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Only if `type`==`imagotag`, whether to turn on SSL verification
     * 
     */
    public Optional<Boolean> verifyCert() {
        return Optional.ofNullable(this.verifyCert);
    }
    /**
     * @return Only if `type`==`solum` or `type`==`hanshow`
     * 
     */
    public Optional<Integer> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceprofileApUsbConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cacert;
        private @Nullable Integer channel;
        private @Nullable Boolean enabled;
        private @Nullable String host;
        private @Nullable Integer port;
        private @Nullable String type;
        private @Nullable Boolean verifyCert;
        private @Nullable Integer vlanId;
        public Builder() {}
        public Builder(DeviceprofileApUsbConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacert = defaults.cacert;
    	      this.channel = defaults.channel;
    	      this.enabled = defaults.enabled;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.type = defaults.type;
    	      this.verifyCert = defaults.verifyCert;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder cacert(@Nullable String cacert) {

            this.cacert = cacert;
            return this;
        }
        @CustomType.Setter
        public Builder channel(@Nullable Integer channel) {

            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {

            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder verifyCert(@Nullable Boolean verifyCert) {

            this.verifyCert = verifyCert;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable Integer vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        public DeviceprofileApUsbConfig build() {
            final var _resultValue = new DeviceprofileApUsbConfig();
            _resultValue.cacert = cacert;
            _resultValue.channel = channel;
            _resultValue.enabled = enabled;
            _resultValue.host = host;
            _resultValue.port = port;
            _resultValue.type = type;
            _resultValue.verifyCert = verifyCert;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
