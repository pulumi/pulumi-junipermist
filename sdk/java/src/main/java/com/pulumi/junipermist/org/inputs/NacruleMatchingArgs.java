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


public final class NacruleMatchingArgs extends com.pulumi.resources.ResourceArgs {

    public static final NacruleMatchingArgs Empty = new NacruleMatchingArgs();

    /**
     * enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `peap-tls`, `psk`
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `peap-tls`, `psk`
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * List of client device families to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed family values
     * 
     */
    @Import(name="families")
    private @Nullable Output<List<String>> families;

    /**
     * @return List of client device families to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed family values
     * 
     */
    public Optional<Output<List<String>>> families() {
        return Optional.ofNullable(this.families);
    }

    /**
     * List of client device models to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed model values
     * 
     */
    @Import(name="mfgs")
    private @Nullable Output<List<String>> mfgs;

    /**
     * @return List of client device models to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed model values
     * 
     */
    public Optional<Output<List<String>>> mfgs() {
        return Optional.ofNullable(this.mfgs);
    }

    /**
     * List of client device manufacturers to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed mfg values
     * 
     */
    @Import(name="models")
    private @Nullable Output<List<String>> models;

    /**
     * @return List of client device manufacturers to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed mfg values
     * 
     */
    public Optional<Output<List<String>>> models() {
        return Optional.ofNullable(this.models);
    }

    @Import(name="nactags")
    private @Nullable Output<List<String>> nactags;

    public Optional<Output<List<String>>> nactags() {
        return Optional.ofNullable(this.nactags);
    }

    /**
     * List of client device os types to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed os_type values
     * 
     */
    @Import(name="osTypes")
    private @Nullable Output<List<String>> osTypes;

    /**
     * @return List of client device os types to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed os_type values
     * 
     */
    public Optional<Output<List<String>>> osTypes() {
        return Optional.ofNullable(this.osTypes);
    }

    @Import(name="portTypes")
    private @Nullable Output<List<String>> portTypes;

    public Optional<Output<List<String>>> portTypes() {
        return Optional.ofNullable(this.portTypes);
    }

    /**
     * List of site ids to match
     * 
     */
    @Import(name="siteIds")
    private @Nullable Output<List<String>> siteIds;

    /**
     * @return List of site ids to match
     * 
     */
    public Optional<Output<List<String>>> siteIds() {
        return Optional.ofNullable(this.siteIds);
    }

    /**
     * List of sitegroup ids to match
     * 
     */
    @Import(name="sitegroupIds")
    private @Nullable Output<List<String>> sitegroupIds;

    /**
     * @return List of sitegroup ids to match
     * 
     */
    public Optional<Output<List<String>>> sitegroupIds() {
        return Optional.ofNullable(this.sitegroupIds);
    }

    /**
     * List of vendors to match
     * 
     */
    @Import(name="vendors")
    private @Nullable Output<List<String>> vendors;

    /**
     * @return List of vendors to match
     * 
     */
    public Optional<Output<List<String>>> vendors() {
        return Optional.ofNullable(this.vendors);
    }

    private NacruleMatchingArgs() {}

    private NacruleMatchingArgs(NacruleMatchingArgs $) {
        this.authType = $.authType;
        this.families = $.families;
        this.mfgs = $.mfgs;
        this.models = $.models;
        this.nactags = $.nactags;
        this.osTypes = $.osTypes;
        this.portTypes = $.portTypes;
        this.siteIds = $.siteIds;
        this.sitegroupIds = $.sitegroupIds;
        this.vendors = $.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NacruleMatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NacruleMatchingArgs $;

        public Builder() {
            $ = new NacruleMatchingArgs();
        }

        public Builder(NacruleMatchingArgs defaults) {
            $ = new NacruleMatchingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `peap-tls`, `psk`
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType enum: `cert`, `device-auth`, `eap-teap`, `eap-tls`, `eap-ttls`, `idp`, `mab`, `peap-tls`, `psk`
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param families List of client device families to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed family values
         * 
         * @return builder
         * 
         */
        public Builder families(@Nullable Output<List<String>> families) {
            $.families = families;
            return this;
        }

        /**
         * @param families List of client device families to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed family values
         * 
         * @return builder
         * 
         */
        public Builder families(List<String> families) {
            return families(Output.of(families));
        }

        /**
         * @param families List of client device families to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed family values
         * 
         * @return builder
         * 
         */
        public Builder families(String... families) {
            return families(List.of(families));
        }

        /**
         * @param mfgs List of client device models to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed model values
         * 
         * @return builder
         * 
         */
        public Builder mfgs(@Nullable Output<List<String>> mfgs) {
            $.mfgs = mfgs;
            return this;
        }

        /**
         * @param mfgs List of client device models to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed model values
         * 
         * @return builder
         * 
         */
        public Builder mfgs(List<String> mfgs) {
            return mfgs(Output.of(mfgs));
        }

        /**
         * @param mfgs List of client device models to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed model values
         * 
         * @return builder
         * 
         */
        public Builder mfgs(String... mfgs) {
            return mfgs(List.of(mfgs));
        }

        /**
         * @param models List of client device manufacturers to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed mfg values
         * 
         * @return builder
         * 
         */
        public Builder models(@Nullable Output<List<String>> models) {
            $.models = models;
            return this;
        }

        /**
         * @param models List of client device manufacturers to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed mfg values
         * 
         * @return builder
         * 
         */
        public Builder models(List<String> models) {
            return models(Output.of(models));
        }

        /**
         * @param models List of client device manufacturers to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed mfg values
         * 
         * @return builder
         * 
         */
        public Builder models(String... models) {
            return models(List.of(models));
        }

        public Builder nactags(@Nullable Output<List<String>> nactags) {
            $.nactags = nactags;
            return this;
        }

        public Builder nactags(List<String> nactags) {
            return nactags(Output.of(nactags));
        }

        public Builder nactags(String... nactags) {
            return nactags(List.of(nactags));
        }

        /**
         * @param osTypes List of client device os types to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed os_type values
         * 
         * @return builder
         * 
         */
        public Builder osTypes(@Nullable Output<List<String>> osTypes) {
            $.osTypes = osTypes;
            return this;
        }

        /**
         * @param osTypes List of client device os types to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed os_type values
         * 
         * @return builder
         * 
         */
        public Builder osTypes(List<String> osTypes) {
            return osTypes(Output.of(osTypes));
        }

        /**
         * @param osTypes List of client device os types to match. Refer to [List Fingerprint Types]]($e/Constants%20Definitions/listFingerprintTypes) for allowed os_type values
         * 
         * @return builder
         * 
         */
        public Builder osTypes(String... osTypes) {
            return osTypes(List.of(osTypes));
        }

        public Builder portTypes(@Nullable Output<List<String>> portTypes) {
            $.portTypes = portTypes;
            return this;
        }

        public Builder portTypes(List<String> portTypes) {
            return portTypes(Output.of(portTypes));
        }

        public Builder portTypes(String... portTypes) {
            return portTypes(List.of(portTypes));
        }

        /**
         * @param siteIds List of site ids to match
         * 
         * @return builder
         * 
         */
        public Builder siteIds(@Nullable Output<List<String>> siteIds) {
            $.siteIds = siteIds;
            return this;
        }

        /**
         * @param siteIds List of site ids to match
         * 
         * @return builder
         * 
         */
        public Builder siteIds(List<String> siteIds) {
            return siteIds(Output.of(siteIds));
        }

        /**
         * @param siteIds List of site ids to match
         * 
         * @return builder
         * 
         */
        public Builder siteIds(String... siteIds) {
            return siteIds(List.of(siteIds));
        }

        /**
         * @param sitegroupIds List of sitegroup ids to match
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(@Nullable Output<List<String>> sitegroupIds) {
            $.sitegroupIds = sitegroupIds;
            return this;
        }

        /**
         * @param sitegroupIds List of sitegroup ids to match
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(List<String> sitegroupIds) {
            return sitegroupIds(Output.of(sitegroupIds));
        }

        /**
         * @param sitegroupIds List of sitegroup ids to match
         * 
         * @return builder
         * 
         */
        public Builder sitegroupIds(String... sitegroupIds) {
            return sitegroupIds(List.of(sitegroupIds));
        }

        /**
         * @param vendors List of vendors to match
         * 
         * @return builder
         * 
         */
        public Builder vendors(@Nullable Output<List<String>> vendors) {
            $.vendors = vendors;
            return this;
        }

        /**
         * @param vendors List of vendors to match
         * 
         * @return builder
         * 
         */
        public Builder vendors(List<String> vendors) {
            return vendors(Output.of(vendors));
        }

        /**
         * @param vendors List of vendors to match
         * 
         * @return builder
         * 
         */
        public Builder vendors(String... vendors) {
            return vendors(List.of(vendors));
        }

        public NacruleMatchingArgs build() {
            return $;
        }
    }

}
