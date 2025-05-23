// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WlanAuth {
    /**
     * @return SAE anti-clogging token threshold
     * 
     */
    private @Nullable Integer anticlogThreshold;
    /**
     * @return Whether to trigger EAP reauth when the session ends
     * 
     */
    private @Nullable Boolean eapReauth;
    /**
     * @return Whether to enable MAC Auth, uses the same auth_servers
     * 
     */
    private @Nullable Boolean enableMacAuth;
    /**
     * @return When `type`==`wep`
     * 
     */
    private @Nullable Integer keyIdx;
    /**
     * @return When type=wep, four 10-character or 26-character hex string, null can be used. All keys, if provided, have to be in the same length
     * 
     */
    private @Nullable List<String> keys;
    /**
     * @return When `type`==`psk`, whether to only use multi_psk
     * 
     */
    private @Nullable Boolean multiPskOnly;
    /**
     * @return if `type`==`open`. enum: `disabled`, `enabled` (means transition mode), `required`
     * 
     */
    private @Nullable String owe;
    /**
     * @return When `type`=`psk` or `type`=`eap`, one or more of `wpa1-ccmp`, `wpa1-tkip`, `wpa2-ccmp`, `wpa2-tkip`, `wpa3`
     * 
     */
    private @Nullable List<String> pairwises;
    /**
     * @return When `multi_psk_only`==`true`, whether private wlan is enabled
     * 
     */
    private @Nullable Boolean privateWlan;
    /**
     * @return When `type`==`psk`, 8-64 characters, or 64 hex characters
     * 
     */
    private @Nullable String psk;
    /**
     * @return enum: `eap`, `eap192`, `open`, `psk`, `psk-tkip`, `psk-wpa2-tkip`, `wep`
     * 
     */
    private @Nullable String type;
    /**
     * @return Enable WEP as secondary auth
     * 
     */
    private @Nullable Boolean wepAsSecondaryAuth;

    private WlanAuth() {}
    /**
     * @return SAE anti-clogging token threshold
     * 
     */
    public Optional<Integer> anticlogThreshold() {
        return Optional.ofNullable(this.anticlogThreshold);
    }
    /**
     * @return Whether to trigger EAP reauth when the session ends
     * 
     */
    public Optional<Boolean> eapReauth() {
        return Optional.ofNullable(this.eapReauth);
    }
    /**
     * @return Whether to enable MAC Auth, uses the same auth_servers
     * 
     */
    public Optional<Boolean> enableMacAuth() {
        return Optional.ofNullable(this.enableMacAuth);
    }
    /**
     * @return When `type`==`wep`
     * 
     */
    public Optional<Integer> keyIdx() {
        return Optional.ofNullable(this.keyIdx);
    }
    /**
     * @return When type=wep, four 10-character or 26-character hex string, null can be used. All keys, if provided, have to be in the same length
     * 
     */
    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * @return When `type`==`psk`, whether to only use multi_psk
     * 
     */
    public Optional<Boolean> multiPskOnly() {
        return Optional.ofNullable(this.multiPskOnly);
    }
    /**
     * @return if `type`==`open`. enum: `disabled`, `enabled` (means transition mode), `required`
     * 
     */
    public Optional<String> owe() {
        return Optional.ofNullable(this.owe);
    }
    /**
     * @return When `type`=`psk` or `type`=`eap`, one or more of `wpa1-ccmp`, `wpa1-tkip`, `wpa2-ccmp`, `wpa2-tkip`, `wpa3`
     * 
     */
    public List<String> pairwises() {
        return this.pairwises == null ? List.of() : this.pairwises;
    }
    /**
     * @return When `multi_psk_only`==`true`, whether private wlan is enabled
     * 
     */
    public Optional<Boolean> privateWlan() {
        return Optional.ofNullable(this.privateWlan);
    }
    /**
     * @return When `type`==`psk`, 8-64 characters, or 64 hex characters
     * 
     */
    public Optional<String> psk() {
        return Optional.ofNullable(this.psk);
    }
    /**
     * @return enum: `eap`, `eap192`, `open`, `psk`, `psk-tkip`, `psk-wpa2-tkip`, `wep`
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Enable WEP as secondary auth
     * 
     */
    public Optional<Boolean> wepAsSecondaryAuth() {
        return Optional.ofNullable(this.wepAsSecondaryAuth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WlanAuth defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer anticlogThreshold;
        private @Nullable Boolean eapReauth;
        private @Nullable Boolean enableMacAuth;
        private @Nullable Integer keyIdx;
        private @Nullable List<String> keys;
        private @Nullable Boolean multiPskOnly;
        private @Nullable String owe;
        private @Nullable List<String> pairwises;
        private @Nullable Boolean privateWlan;
        private @Nullable String psk;
        private @Nullable String type;
        private @Nullable Boolean wepAsSecondaryAuth;
        public Builder() {}
        public Builder(WlanAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anticlogThreshold = defaults.anticlogThreshold;
    	      this.eapReauth = defaults.eapReauth;
    	      this.enableMacAuth = defaults.enableMacAuth;
    	      this.keyIdx = defaults.keyIdx;
    	      this.keys = defaults.keys;
    	      this.multiPskOnly = defaults.multiPskOnly;
    	      this.owe = defaults.owe;
    	      this.pairwises = defaults.pairwises;
    	      this.privateWlan = defaults.privateWlan;
    	      this.psk = defaults.psk;
    	      this.type = defaults.type;
    	      this.wepAsSecondaryAuth = defaults.wepAsSecondaryAuth;
        }

        @CustomType.Setter
        public Builder anticlogThreshold(@Nullable Integer anticlogThreshold) {

            this.anticlogThreshold = anticlogThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder eapReauth(@Nullable Boolean eapReauth) {

            this.eapReauth = eapReauth;
            return this;
        }
        @CustomType.Setter
        public Builder enableMacAuth(@Nullable Boolean enableMacAuth) {

            this.enableMacAuth = enableMacAuth;
            return this;
        }
        @CustomType.Setter
        public Builder keyIdx(@Nullable Integer keyIdx) {

            this.keyIdx = keyIdx;
            return this;
        }
        @CustomType.Setter
        public Builder keys(@Nullable List<String> keys) {

            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder multiPskOnly(@Nullable Boolean multiPskOnly) {

            this.multiPskOnly = multiPskOnly;
            return this;
        }
        @CustomType.Setter
        public Builder owe(@Nullable String owe) {

            this.owe = owe;
            return this;
        }
        @CustomType.Setter
        public Builder pairwises(@Nullable List<String> pairwises) {

            this.pairwises = pairwises;
            return this;
        }
        public Builder pairwises(String... pairwises) {
            return pairwises(List.of(pairwises));
        }
        @CustomType.Setter
        public Builder privateWlan(@Nullable Boolean privateWlan) {

            this.privateWlan = privateWlan;
            return this;
        }
        @CustomType.Setter
        public Builder psk(@Nullable String psk) {

            this.psk = psk;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder wepAsSecondaryAuth(@Nullable Boolean wepAsSecondaryAuth) {

            this.wepAsSecondaryAuth = wepAsSecondaryAuth;
            return this;
        }
        public WlanAuth build() {
            final var _resultValue = new WlanAuth();
            _resultValue.anticlogThreshold = anticlogThreshold;
            _resultValue.eapReauth = eapReauth;
            _resultValue.enableMacAuth = enableMacAuth;
            _resultValue.keyIdx = keyIdx;
            _resultValue.keys = keys;
            _resultValue.multiPskOnly = multiPskOnly;
            _resultValue.owe = owe;
            _resultValue.pairwises = pairwises;
            _resultValue.privateWlan = privateWlan;
            _resultValue.psk = psk;
            _resultValue.type = type;
            _resultValue.wepAsSecondaryAuth = wepAsSecondaryAuth;
            return _resultValue;
        }
    }
}
