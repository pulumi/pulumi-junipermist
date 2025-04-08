// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPsksOrgPsk {
    /**
     * @return sso id for psk created from psk portal
     * 
     */
    private String adminSsoId;
    /**
     * @return When the object has been created, in epoch
     * 
     */
    private Double createdTime;
    /**
     * @return email to send psk expiring notifications to
     * 
     */
    private String email;
    /**
     * @return Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
     * 
     */
    private Integer expireTime;
    /**
     * @return Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
     * 
     */
    private Integer expiryNotificationTime;
    /**
     * @return Unique ID of the object instance in the Mist Organization
     * 
     */
    private String id;
    /**
     * @return If `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
     * 
     */
    private String mac;
    /**
     * @return If `usage`==`macs`, this list contains N number of client mac addresses or mac patterns(1122*) or both. This list is capped at 5000
     * 
     */
    private List<String> macs;
    /**
     * @return For Org PSK Only. Max concurrent users for this PSK key. Default is 0 (unlimited)
     * 
     */
    private Integer maxUsage;
    /**
     * @return When the object has been modified for the last time, in epoch
     * 
     */
    private Double modifiedTime;
    private String name;
    private String note;
    /**
     * @return If set to true, reminder notification will be sent when psk is about to expire
     * 
     */
    private Boolean notifyExpiry;
    /**
     * @return If set to true, notification will be sent when psk is created or edited
     * 
     */
    private Boolean notifyOnCreateOrEdit;
    /**
     * @return previous passphrase of the PSK if it has been rotated
     * 
     */
    private String oldPassphrase;
    private String orgId;
    /**
     * @return passphrase of the PSK (8-63 character or 64 in hex)
     * 
     */
    private String passphrase;
    private String role;
    /**
     * @return SSID this PSK should be applicable to
     * 
     */
    private String ssid;
    /**
     * @return enum: `macs`, `multi`, `single`
     * 
     */
    private String usage;
    private String vlanId;

    private GetPsksOrgPsk() {}
    /**
     * @return sso id for psk created from psk portal
     * 
     */
    public String adminSsoId() {
        return this.adminSsoId;
    }
    /**
     * @return When the object has been created, in epoch
     * 
     */
    public Double createdTime() {
        return this.createdTime;
    }
    /**
     * @return email to send psk expiring notifications to
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
     * 
     */
    public Integer expireTime() {
        return this.expireTime;
    }
    /**
     * @return Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
     * 
     */
    public Integer expiryNotificationTime() {
        return this.expiryNotificationTime;
    }
    /**
     * @return Unique ID of the object instance in the Mist Organization
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
     * 
     */
    public String mac() {
        return this.mac;
    }
    /**
     * @return If `usage`==`macs`, this list contains N number of client mac addresses or mac patterns(1122*) or both. This list is capped at 5000
     * 
     */
    public List<String> macs() {
        return this.macs;
    }
    /**
     * @return For Org PSK Only. Max concurrent users for this PSK key. Default is 0 (unlimited)
     * 
     */
    public Integer maxUsage() {
        return this.maxUsage;
    }
    /**
     * @return When the object has been modified for the last time, in epoch
     * 
     */
    public Double modifiedTime() {
        return this.modifiedTime;
    }
    public String name() {
        return this.name;
    }
    public String note() {
        return this.note;
    }
    /**
     * @return If set to true, reminder notification will be sent when psk is about to expire
     * 
     */
    public Boolean notifyExpiry() {
        return this.notifyExpiry;
    }
    /**
     * @return If set to true, notification will be sent when psk is created or edited
     * 
     */
    public Boolean notifyOnCreateOrEdit() {
        return this.notifyOnCreateOrEdit;
    }
    /**
     * @return previous passphrase of the PSK if it has been rotated
     * 
     */
    public String oldPassphrase() {
        return this.oldPassphrase;
    }
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return passphrase of the PSK (8-63 character or 64 in hex)
     * 
     */
    public String passphrase() {
        return this.passphrase;
    }
    public String role() {
        return this.role;
    }
    /**
     * @return SSID this PSK should be applicable to
     * 
     */
    public String ssid() {
        return this.ssid;
    }
    /**
     * @return enum: `macs`, `multi`, `single`
     * 
     */
    public String usage() {
        return this.usage;
    }
    public String vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPsksOrgPsk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String adminSsoId;
        private Double createdTime;
        private String email;
        private Integer expireTime;
        private Integer expiryNotificationTime;
        private String id;
        private String mac;
        private List<String> macs;
        private Integer maxUsage;
        private Double modifiedTime;
        private String name;
        private String note;
        private Boolean notifyExpiry;
        private Boolean notifyOnCreateOrEdit;
        private String oldPassphrase;
        private String orgId;
        private String passphrase;
        private String role;
        private String ssid;
        private String usage;
        private String vlanId;
        public Builder() {}
        public Builder(GetPsksOrgPsk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminSsoId = defaults.adminSsoId;
    	      this.createdTime = defaults.createdTime;
    	      this.email = defaults.email;
    	      this.expireTime = defaults.expireTime;
    	      this.expiryNotificationTime = defaults.expiryNotificationTime;
    	      this.id = defaults.id;
    	      this.mac = defaults.mac;
    	      this.macs = defaults.macs;
    	      this.maxUsage = defaults.maxUsage;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.note = defaults.note;
    	      this.notifyExpiry = defaults.notifyExpiry;
    	      this.notifyOnCreateOrEdit = defaults.notifyOnCreateOrEdit;
    	      this.oldPassphrase = defaults.oldPassphrase;
    	      this.orgId = defaults.orgId;
    	      this.passphrase = defaults.passphrase;
    	      this.role = defaults.role;
    	      this.ssid = defaults.ssid;
    	      this.usage = defaults.usage;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder adminSsoId(String adminSsoId) {
            if (adminSsoId == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "adminSsoId");
            }
            this.adminSsoId = adminSsoId;
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(Double createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(Integer expireTime) {
            if (expireTime == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "expireTime");
            }
            this.expireTime = expireTime;
            return this;
        }
        @CustomType.Setter
        public Builder expiryNotificationTime(Integer expiryNotificationTime) {
            if (expiryNotificationTime == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "expiryNotificationTime");
            }
            this.expiryNotificationTime = expiryNotificationTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mac(String mac) {
            if (mac == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "mac");
            }
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder macs(List<String> macs) {
            if (macs == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "macs");
            }
            this.macs = macs;
            return this;
        }
        public Builder macs(String... macs) {
            return macs(List.of(macs));
        }
        @CustomType.Setter
        public Builder maxUsage(Integer maxUsage) {
            if (maxUsage == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "maxUsage");
            }
            this.maxUsage = maxUsage;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(Double modifiedTime) {
            if (modifiedTime == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "modifiedTime");
            }
            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder note(String note) {
            if (note == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "note");
            }
            this.note = note;
            return this;
        }
        @CustomType.Setter
        public Builder notifyExpiry(Boolean notifyExpiry) {
            if (notifyExpiry == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "notifyExpiry");
            }
            this.notifyExpiry = notifyExpiry;
            return this;
        }
        @CustomType.Setter
        public Builder notifyOnCreateOrEdit(Boolean notifyOnCreateOrEdit) {
            if (notifyOnCreateOrEdit == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "notifyOnCreateOrEdit");
            }
            this.notifyOnCreateOrEdit = notifyOnCreateOrEdit;
            return this;
        }
        @CustomType.Setter
        public Builder oldPassphrase(String oldPassphrase) {
            if (oldPassphrase == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "oldPassphrase");
            }
            this.oldPassphrase = oldPassphrase;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder passphrase(String passphrase) {
            if (passphrase == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "passphrase");
            }
            this.passphrase = passphrase;
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder ssid(String ssid) {
            if (ssid == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "ssid");
            }
            this.ssid = ssid;
            return this;
        }
        @CustomType.Setter
        public Builder usage(String usage) {
            if (usage == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "usage");
            }
            this.usage = usage;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(String vlanId) {
            if (vlanId == null) {
              throw new MissingRequiredPropertyException("GetPsksOrgPsk", "vlanId");
            }
            this.vlanId = vlanId;
            return this;
        }
        public GetPsksOrgPsk build() {
            final var _resultValue = new GetPsksOrgPsk();
            _resultValue.adminSsoId = adminSsoId;
            _resultValue.createdTime = createdTime;
            _resultValue.email = email;
            _resultValue.expireTime = expireTime;
            _resultValue.expiryNotificationTime = expiryNotificationTime;
            _resultValue.id = id;
            _resultValue.mac = mac;
            _resultValue.macs = macs;
            _resultValue.maxUsage = maxUsage;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.note = note;
            _resultValue.notifyExpiry = notifyExpiry;
            _resultValue.notifyOnCreateOrEdit = notifyOnCreateOrEdit;
            _resultValue.oldPassphrase = oldPassphrase;
            _resultValue.orgId = orgId;
            _resultValue.passphrase = passphrase;
            _resultValue.role = role;
            _resultValue.ssid = ssid;
            _resultValue.usage = usage;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
