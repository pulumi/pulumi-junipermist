// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.junipermist.org.inputs.WlanPortalTemplatePortalTemplateArgs;
import java.lang.String;
import java.util.Objects;


public final class WlanPortalTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final WlanPortalTemplateArgs Empty = new WlanPortalTemplateArgs();

    @Import(name="orgId", required=true)
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * portal template wlan settings
     * 
     */
    @Import(name="portalTemplate", required=true)
    private Output<WlanPortalTemplatePortalTemplateArgs> portalTemplate;

    /**
     * @return portal template wlan settings
     * 
     */
    public Output<WlanPortalTemplatePortalTemplateArgs> portalTemplate() {
        return this.portalTemplate;
    }

    @Import(name="wlanId", required=true)
    private Output<String> wlanId;

    public Output<String> wlanId() {
        return this.wlanId;
    }

    private WlanPortalTemplateArgs() {}

    private WlanPortalTemplateArgs(WlanPortalTemplateArgs $) {
        this.orgId = $.orgId;
        this.portalTemplate = $.portalTemplate;
        this.wlanId = $.wlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WlanPortalTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WlanPortalTemplateArgs $;

        public Builder() {
            $ = new WlanPortalTemplateArgs();
        }

        public Builder(WlanPortalTemplateArgs defaults) {
            $ = new WlanPortalTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param portalTemplate portal template wlan settings
         * 
         * @return builder
         * 
         */
        public Builder portalTemplate(Output<WlanPortalTemplatePortalTemplateArgs> portalTemplate) {
            $.portalTemplate = portalTemplate;
            return this;
        }

        /**
         * @param portalTemplate portal template wlan settings
         * 
         * @return builder
         * 
         */
        public Builder portalTemplate(WlanPortalTemplatePortalTemplateArgs portalTemplate) {
            return portalTemplate(Output.of(portalTemplate));
        }

        public Builder wlanId(Output<String> wlanId) {
            $.wlanId = wlanId;
            return this;
        }

        public Builder wlanId(String wlanId) {
            return wlanId(Output.of(wlanId));
        }

        public WlanPortalTemplateArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("WlanPortalTemplateArgs", "orgId");
            }
            if ($.portalTemplate == null) {
                throw new MissingRequiredPropertyException("WlanPortalTemplateArgs", "portalTemplate");
            }
            if ($.wlanId == null) {
                throw new MissingRequiredPropertyException("WlanPortalTemplateArgs", "wlanId");
            }
            return $;
        }
    }

}
