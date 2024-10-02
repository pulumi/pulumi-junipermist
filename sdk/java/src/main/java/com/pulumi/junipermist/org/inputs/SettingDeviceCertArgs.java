// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class SettingDeviceCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final SettingDeviceCertArgs Empty = new SettingDeviceCertArgs();

    @Import(name="cert", required=true)
    private Output<String> cert;

    public Output<String> cert() {
        return this.cert;
    }

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    private SettingDeviceCertArgs() {}

    private SettingDeviceCertArgs(SettingDeviceCertArgs $) {
        this.cert = $.cert;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingDeviceCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingDeviceCertArgs $;

        public Builder() {
            $ = new SettingDeviceCertArgs();
        }

        public Builder(SettingDeviceCertArgs defaults) {
            $ = new SettingDeviceCertArgs(Objects.requireNonNull(defaults));
        }

        public Builder cert(Output<String> cert) {
            $.cert = cert;
            return this;
        }

        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public SettingDeviceCertArgs build() {
            if ($.cert == null) {
                throw new MissingRequiredPropertyException("SettingDeviceCertArgs", "cert");
            }
            if ($.key == null) {
                throw new MissingRequiredPropertyException("SettingDeviceCertArgs", "key");
            }
            return $;
        }
    }

}