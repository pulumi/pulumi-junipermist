// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanPortalImageState extends com.pulumi.resources.ResourceArgs {

    public static final WlanPortalImageState Empty = new WlanPortalImageState();

    /**
     * path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
     * 
     */
    @Import(name="file")
    private @Nullable Output<String> file;

    /**
     * @return path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
     * 
     */
    public Optional<Output<String>> file() {
        return Optional.ofNullable(this.file);
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * Site WLAN ID
     * 
     */
    @Import(name="wlanId")
    private @Nullable Output<String> wlanId;

    /**
     * @return Site WLAN ID
     * 
     */
    public Optional<Output<String>> wlanId() {
        return Optional.ofNullable(this.wlanId);
    }

    private WlanPortalImageState() {}

    private WlanPortalImageState(WlanPortalImageState $) {
        this.file = $.file;
        this.siteId = $.siteId;
        this.wlanId = $.wlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanPortalImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanPortalImageState $;

        public Builder() {
            $ = new WlanPortalImageState();
        }

        public Builder(WlanPortalImageState defaults) {
            $ = new WlanPortalImageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param file path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<String> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file path to the background image file. File must be a `jpeg`, `jpg` or `png` image`
         * 
         * @return builder
         * 
         */
        public Builder file(String file) {
            return file(Output.of(file));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param wlanId Site WLAN ID
         * 
         * @return builder
         * 
         */
        public Builder wlanId(@Nullable Output<String> wlanId) {
            $.wlanId = wlanId;
            return this;
        }

        /**
         * @param wlanId Site WLAN ID
         * 
         * @return builder
         * 
         */
        public Builder wlanId(String wlanId) {
            return wlanId(Output.of(wlanId));
        }

        public WlanPortalImageState build() {
            return $;
        }
    }

}
