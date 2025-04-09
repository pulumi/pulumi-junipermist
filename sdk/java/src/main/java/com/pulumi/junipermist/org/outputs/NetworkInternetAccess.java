// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.junipermist.org.outputs.NetworkInternetAccessDestinationNat;
import com.pulumi.junipermist.org.outputs.NetworkInternetAccessStaticNat;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInternetAccess {
    private @Nullable Boolean createSimpleServicePolicy;
    /**
     * @return Property key can be an External IP (i.e. &#34;63.16.0.3&#34;), an External IP:Port (i.e. &#34;63.16.0.3:443&#34;), an External Port (i.e. &#34;:443&#34;), an External CIDR (i.e. &#34;63.16.0.0/30&#34;), an External CIDR:Port (i.e. &#34;63.16.0.0/30:443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;). At least one of the `internal_ip` or `port` must be defined
     * 
     */
    private @Nullable Map<String,NetworkInternetAccessDestinationNat> destinationNat;
    private @Nullable Boolean enabled;
    /**
     * @return By default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    private @Nullable Boolean restricted;
    /**
     * @return Property key may be an External IP Address (i.e. &#34;63.16.0.3&#34;), a CIDR (i.e. &#34;63.16.0.12/20&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    private @Nullable Map<String,NetworkInternetAccessStaticNat> staticNat;

    private NetworkInternetAccess() {}
    public Optional<Boolean> createSimpleServicePolicy() {
        return Optional.ofNullable(this.createSimpleServicePolicy);
    }
    /**
     * @return Property key can be an External IP (i.e. &#34;63.16.0.3&#34;), an External IP:Port (i.e. &#34;63.16.0.3:443&#34;), an External Port (i.e. &#34;:443&#34;), an External CIDR (i.e. &#34;63.16.0.0/30&#34;), an External CIDR:Port (i.e. &#34;63.16.0.0/30:443&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;). At least one of the `internal_ip` or `port` must be defined
     * 
     */
    public Map<String,NetworkInternetAccessDestinationNat> destinationNat() {
        return this.destinationNat == null ? Map.of() : this.destinationNat;
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return By default, all access is allowed, to only allow certain traffic, make `restricted`=`true` and define service_policies
     * 
     */
    public Optional<Boolean> restricted() {
        return Optional.ofNullable(this.restricted);
    }
    /**
     * @return Property key may be an External IP Address (i.e. &#34;63.16.0.3&#34;), a CIDR (i.e. &#34;63.16.0.12/20&#34;) or a Variable (i.e. &#34;{{myvar}}&#34;)
     * 
     */
    public Map<String,NetworkInternetAccessStaticNat> staticNat() {
        return this.staticNat == null ? Map.of() : this.staticNat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInternetAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean createSimpleServicePolicy;
        private @Nullable Map<String,NetworkInternetAccessDestinationNat> destinationNat;
        private @Nullable Boolean enabled;
        private @Nullable Boolean restricted;
        private @Nullable Map<String,NetworkInternetAccessStaticNat> staticNat;
        public Builder() {}
        public Builder(NetworkInternetAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createSimpleServicePolicy = defaults.createSimpleServicePolicy;
    	      this.destinationNat = defaults.destinationNat;
    	      this.enabled = defaults.enabled;
    	      this.restricted = defaults.restricted;
    	      this.staticNat = defaults.staticNat;
        }

        @CustomType.Setter
        public Builder createSimpleServicePolicy(@Nullable Boolean createSimpleServicePolicy) {

            this.createSimpleServicePolicy = createSimpleServicePolicy;
            return this;
        }
        @CustomType.Setter
        public Builder destinationNat(@Nullable Map<String,NetworkInternetAccessDestinationNat> destinationNat) {

            this.destinationNat = destinationNat;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder restricted(@Nullable Boolean restricted) {

            this.restricted = restricted;
            return this;
        }
        @CustomType.Setter
        public Builder staticNat(@Nullable Map<String,NetworkInternetAccessStaticNat> staticNat) {

            this.staticNat = staticNat;
            return this;
        }
        public NetworkInternetAccess build() {
            final var _resultValue = new NetworkInternetAccess();
            _resultValue.createSimpleServicePolicy = createSimpleServicePolicy;
            _resultValue.destinationNat = destinationNat;
            _resultValue.enabled = enabled;
            _resultValue.restricted = restricted;
            _resultValue.staticNat = staticNat;
            return _resultValue;
        }
    }
}
