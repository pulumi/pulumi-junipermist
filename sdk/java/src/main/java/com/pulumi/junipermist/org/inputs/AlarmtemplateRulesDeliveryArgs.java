// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmtemplateRulesDeliveryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlarmtemplateRulesDeliveryArgs Empty = new AlarmtemplateRulesDeliveryArgs();

    /**
     * List of additional email string to deliver the alarms via emails
     * 
     */
    @Import(name="additionalEmails")
    private @Nullable Output<List<String>> additionalEmails;

    /**
     * @return List of additional email string to deliver the alarms via emails
     * 
     */
    public Optional<Output<List<String>>> additionalEmails() {
        return Optional.ofNullable(this.additionalEmails);
    }

    /**
     * Whether to enable the alarm delivery via emails or not
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable the alarm delivery via emails or not
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Whether to deliver the alarms via emails to Org admins or not
     * 
     */
    @Import(name="toOrgAdmins")
    private @Nullable Output<Boolean> toOrgAdmins;

    /**
     * @return Whether to deliver the alarms via emails to Org admins or not
     * 
     */
    public Optional<Output<Boolean>> toOrgAdmins() {
        return Optional.ofNullable(this.toOrgAdmins);
    }

    /**
     * Whether to deliver the alarms via emails to Site admins or not
     * 
     */
    @Import(name="toSiteAdmins")
    private @Nullable Output<Boolean> toSiteAdmins;

    /**
     * @return Whether to deliver the alarms via emails to Site admins or not
     * 
     */
    public Optional<Output<Boolean>> toSiteAdmins() {
        return Optional.ofNullable(this.toSiteAdmins);
    }

    private AlarmtemplateRulesDeliveryArgs() {}

    private AlarmtemplateRulesDeliveryArgs(AlarmtemplateRulesDeliveryArgs $) {
        this.additionalEmails = $.additionalEmails;
        this.enabled = $.enabled;
        this.toOrgAdmins = $.toOrgAdmins;
        this.toSiteAdmins = $.toSiteAdmins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmtemplateRulesDeliveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmtemplateRulesDeliveryArgs $;

        public Builder() {
            $ = new AlarmtemplateRulesDeliveryArgs();
        }

        public Builder(AlarmtemplateRulesDeliveryArgs defaults) {
            $ = new AlarmtemplateRulesDeliveryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalEmails List of additional email string to deliver the alarms via emails
         * 
         * @return builder
         * 
         */
        public Builder additionalEmails(@Nullable Output<List<String>> additionalEmails) {
            $.additionalEmails = additionalEmails;
            return this;
        }

        /**
         * @param additionalEmails List of additional email string to deliver the alarms via emails
         * 
         * @return builder
         * 
         */
        public Builder additionalEmails(List<String> additionalEmails) {
            return additionalEmails(Output.of(additionalEmails));
        }

        /**
         * @param additionalEmails List of additional email string to deliver the alarms via emails
         * 
         * @return builder
         * 
         */
        public Builder additionalEmails(String... additionalEmails) {
            return additionalEmails(List.of(additionalEmails));
        }

        /**
         * @param enabled Whether to enable the alarm delivery via emails or not
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable the alarm delivery via emails or not
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param toOrgAdmins Whether to deliver the alarms via emails to Org admins or not
         * 
         * @return builder
         * 
         */
        public Builder toOrgAdmins(@Nullable Output<Boolean> toOrgAdmins) {
            $.toOrgAdmins = toOrgAdmins;
            return this;
        }

        /**
         * @param toOrgAdmins Whether to deliver the alarms via emails to Org admins or not
         * 
         * @return builder
         * 
         */
        public Builder toOrgAdmins(Boolean toOrgAdmins) {
            return toOrgAdmins(Output.of(toOrgAdmins));
        }

        /**
         * @param toSiteAdmins Whether to deliver the alarms via emails to Site admins or not
         * 
         * @return builder
         * 
         */
        public Builder toSiteAdmins(@Nullable Output<Boolean> toSiteAdmins) {
            $.toSiteAdmins = toSiteAdmins;
            return this;
        }

        /**
         * @param toSiteAdmins Whether to deliver the alarms via emails to Site admins or not
         * 
         * @return builder
         * 
         */
        public Builder toSiteAdmins(Boolean toSiteAdmins) {
            return toSiteAdmins(Output.of(toSiteAdmins));
        }

        public AlarmtemplateRulesDeliveryArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("AlarmtemplateRulesDeliveryArgs", "enabled");
            }
            return $;
        }
    }

}
