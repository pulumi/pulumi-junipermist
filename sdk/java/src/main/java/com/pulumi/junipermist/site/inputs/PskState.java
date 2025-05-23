// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.site.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PskState extends com.pulumi.resources.ResourceArgs {

    public static final PskState Empty = new PskState();

    /**
     * email to send psk expiring notifications to
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return email to send psk expiring notifications to
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<Integer> expireTime;

    /**
     * @return Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
     * 
     */
    public Optional<Output<Integer>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    /**
     * Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
     * 
     */
    @Import(name="expiryNotificationTime")
    private @Nullable Output<Integer> expiryNotificationTime;

    /**
     * @return Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
     * 
     */
    public Optional<Output<Integer>> expiryNotificationTime() {
        return Optional.ofNullable(this.expiryNotificationTime);
    }

    /**
     * If `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
     * 
     */
    @Import(name="mac")
    private @Nullable Output<String> mac;

    /**
     * @return If `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
     * 
     */
    public Optional<Output<String>> mac() {
        return Optional.ofNullable(this.mac);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="note")
    private @Nullable Output<String> note;

    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
    }

    /**
     * If set to true, reminder notification will be sent when psk is about to expire
     * 
     */
    @Import(name="notifyExpiry")
    private @Nullable Output<Boolean> notifyExpiry;

    /**
     * @return If set to true, reminder notification will be sent when psk is about to expire
     * 
     */
    public Optional<Output<Boolean>> notifyExpiry() {
        return Optional.ofNullable(this.notifyExpiry);
    }

    /**
     * If set to true, notification will be sent when psk is created or edited
     * 
     */
    @Import(name="notifyOnCreateOrEdit")
    private @Nullable Output<Boolean> notifyOnCreateOrEdit;

    /**
     * @return If set to true, notification will be sent when psk is created or edited
     * 
     */
    public Optional<Output<Boolean>> notifyOnCreateOrEdit() {
        return Optional.ofNullable(this.notifyOnCreateOrEdit);
    }

    /**
     * previous passphrase of the PSK if it has been rotated
     * 
     */
    @Import(name="oldPassphrase")
    private @Nullable Output<String> oldPassphrase;

    /**
     * @return previous passphrase of the PSK if it has been rotated
     * 
     */
    public Optional<Output<String>> oldPassphrase() {
        return Optional.ofNullable(this.oldPassphrase);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * passphrase of the PSK (8-63 character or 64 in hex)
     * 
     */
    @Import(name="passphrase")
    private @Nullable Output<String> passphrase;

    /**
     * @return passphrase of the PSK (8-63 character or 64 in hex)
     * 
     */
    public Optional<Output<String>> passphrase() {
        return Optional.ofNullable(this.passphrase);
    }

    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * SSID this PSK should be applicable to
     * 
     */
    @Import(name="ssid")
    private @Nullable Output<String> ssid;

    /**
     * @return SSID this PSK should be applicable to
     * 
     */
    public Optional<Output<String>> ssid() {
        return Optional.ofNullable(this.ssid);
    }

    /**
     * enum: `multi`, `single`
     * 
     */
    @Import(name="usage")
    private @Nullable Output<String> usage;

    /**
     * @return enum: `multi`, `single`
     * 
     */
    public Optional<Output<String>> usage() {
        return Optional.ofNullable(this.usage);
    }

    @Import(name="vlanId")
    private @Nullable Output<String> vlanId;

    public Optional<Output<String>> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private PskState() {}

    private PskState(PskState $) {
        this.email = $.email;
        this.expireTime = $.expireTime;
        this.expiryNotificationTime = $.expiryNotificationTime;
        this.mac = $.mac;
        this.name = $.name;
        this.note = $.note;
        this.notifyExpiry = $.notifyExpiry;
        this.notifyOnCreateOrEdit = $.notifyOnCreateOrEdit;
        this.oldPassphrase = $.oldPassphrase;
        this.orgId = $.orgId;
        this.passphrase = $.passphrase;
        this.role = $.role;
        this.siteId = $.siteId;
        this.ssid = $.ssid;
        this.usage = $.usage;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PskState $;

        public Builder() {
            $ = new PskState();
        }

        public Builder(PskState defaults) {
            $ = new PskState(Objects.requireNonNull(defaults));
        }

        /**
         * @param email email to send psk expiring notifications to
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email email to send psk expiring notifications to
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param expireTime Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<Integer> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
         * 
         * @return builder
         * 
         */
        public Builder expireTime(Integer expireTime) {
            return expireTime(Output.of(expireTime));
        }

        /**
         * @param expiryNotificationTime Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
         * 
         * @return builder
         * 
         */
        public Builder expiryNotificationTime(@Nullable Output<Integer> expiryNotificationTime) {
            $.expiryNotificationTime = expiryNotificationTime;
            return this;
        }

        /**
         * @param expiryNotificationTime Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
         * 
         * @return builder
         * 
         */
        public Builder expiryNotificationTime(Integer expiryNotificationTime) {
            return expiryNotificationTime(Output.of(expiryNotificationTime));
        }

        /**
         * @param mac If `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
         * 
         * @return builder
         * 
         */
        public Builder mac(@Nullable Output<String> mac) {
            $.mac = mac;
            return this;
        }

        /**
         * @param mac If `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
         * 
         * @return builder
         * 
         */
        public Builder mac(String mac) {
            return mac(Output.of(mac));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        public Builder note(String note) {
            return note(Output.of(note));
        }

        /**
         * @param notifyExpiry If set to true, reminder notification will be sent when psk is about to expire
         * 
         * @return builder
         * 
         */
        public Builder notifyExpiry(@Nullable Output<Boolean> notifyExpiry) {
            $.notifyExpiry = notifyExpiry;
            return this;
        }

        /**
         * @param notifyExpiry If set to true, reminder notification will be sent when psk is about to expire
         * 
         * @return builder
         * 
         */
        public Builder notifyExpiry(Boolean notifyExpiry) {
            return notifyExpiry(Output.of(notifyExpiry));
        }

        /**
         * @param notifyOnCreateOrEdit If set to true, notification will be sent when psk is created or edited
         * 
         * @return builder
         * 
         */
        public Builder notifyOnCreateOrEdit(@Nullable Output<Boolean> notifyOnCreateOrEdit) {
            $.notifyOnCreateOrEdit = notifyOnCreateOrEdit;
            return this;
        }

        /**
         * @param notifyOnCreateOrEdit If set to true, notification will be sent when psk is created or edited
         * 
         * @return builder
         * 
         */
        public Builder notifyOnCreateOrEdit(Boolean notifyOnCreateOrEdit) {
            return notifyOnCreateOrEdit(Output.of(notifyOnCreateOrEdit));
        }

        /**
         * @param oldPassphrase previous passphrase of the PSK if it has been rotated
         * 
         * @return builder
         * 
         */
        public Builder oldPassphrase(@Nullable Output<String> oldPassphrase) {
            $.oldPassphrase = oldPassphrase;
            return this;
        }

        /**
         * @param oldPassphrase previous passphrase of the PSK if it has been rotated
         * 
         * @return builder
         * 
         */
        public Builder oldPassphrase(String oldPassphrase) {
            return oldPassphrase(Output.of(oldPassphrase));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param passphrase passphrase of the PSK (8-63 character or 64 in hex)
         * 
         * @return builder
         * 
         */
        public Builder passphrase(@Nullable Output<String> passphrase) {
            $.passphrase = passphrase;
            return this;
        }

        /**
         * @param passphrase passphrase of the PSK (8-63 character or 64 in hex)
         * 
         * @return builder
         * 
         */
        public Builder passphrase(String passphrase) {
            return passphrase(Output.of(passphrase));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param ssid SSID this PSK should be applicable to
         * 
         * @return builder
         * 
         */
        public Builder ssid(@Nullable Output<String> ssid) {
            $.ssid = ssid;
            return this;
        }

        /**
         * @param ssid SSID this PSK should be applicable to
         * 
         * @return builder
         * 
         */
        public Builder ssid(String ssid) {
            return ssid(Output.of(ssid));
        }

        /**
         * @param usage enum: `multi`, `single`
         * 
         * @return builder
         * 
         */
        public Builder usage(@Nullable Output<String> usage) {
            $.usage = usage;
            return this;
        }

        /**
         * @param usage enum: `multi`, `single`
         * 
         * @return builder
         * 
         */
        public Builder usage(String usage) {
            return usage(Output.of(usage));
        }

        public Builder vlanId(@Nullable Output<String> vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public Builder vlanId(String vlanId) {
            return vlanId(Output.of(vlanId));
        }

        public PskState build() {
            return $;
        }
    }

}
