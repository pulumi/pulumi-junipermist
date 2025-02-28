// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.site.inputs.WlanPortalTemplatePortalTemplateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanPortalTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final WlanPortalTemplateState Empty = new WlanPortalTemplateState();

    /**
     * Portal template wlan settings
     * 
     */
    @Import(name="portalTemplate")
    private @Nullable Output<WlanPortalTemplatePortalTemplateArgs> portalTemplate;

    /**
     * @return Portal template wlan settings
     * 
     */
    public Optional<Output<WlanPortalTemplatePortalTemplateArgs>> portalTemplate() {
        return Optional.ofNullable(this.portalTemplate);
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

    private WlanPortalTemplateState() {}

    private WlanPortalTemplateState(WlanPortalTemplateState $) {
        this.portalTemplate = $.portalTemplate;
        this.siteId = $.siteId;
        this.wlanId = $.wlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanPortalTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanPortalTemplateState $;

        public Builder() {
            $ = new WlanPortalTemplateState();
        }

        public Builder(WlanPortalTemplateState defaults) {
            $ = new WlanPortalTemplateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param portalTemplate Portal template wlan settings
         * 
         * @return builder
         * 
         */
        public Builder portalTemplate(@Nullable Output<WlanPortalTemplatePortalTemplateArgs> portalTemplate) {
            $.portalTemplate = portalTemplate;
            return this;
        }

        /**
         * @param portalTemplate Portal template wlan settings
         * 
         * @return builder
         * 
         */
        public Builder portalTemplate(WlanPortalTemplatePortalTemplateArgs portalTemplate) {
            return portalTemplate(Output.of(portalTemplate));
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

        public WlanPortalTemplateState build() {
            return $;
        }
    }

}
