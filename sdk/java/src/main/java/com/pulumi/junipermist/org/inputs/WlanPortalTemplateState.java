// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.WlanPortalTemplatePortalTemplateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WlanPortalTemplateState extends com.pulumi.resources.ResourceArgs {

    public static final WlanPortalTemplateState Empty = new WlanPortalTemplateState();

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

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

    /**
     * Org WLAN ID
     * 
     */
    @Import(name="wlanId")
    private @Nullable Output<String> wlanId;

    /**
     * @return Org WLAN ID
     * 
     */
    public Optional<Output<String>> wlanId() {
        return Optional.ofNullable(this.wlanId);
    }

    private WlanPortalTemplateState() {}

    private WlanPortalTemplateState(WlanPortalTemplateState $) {
        this.orgId = $.orgId;
        this.portalTemplate = $.portalTemplate;
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

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
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

        /**
         * @param wlanId Org WLAN ID
         * 
         * @return builder
         * 
         */
        public Builder wlanId(@Nullable Output<String> wlanId) {
            $.wlanId = wlanId;
            return this;
        }

        /**
         * @param wlanId Org WLAN ID
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
