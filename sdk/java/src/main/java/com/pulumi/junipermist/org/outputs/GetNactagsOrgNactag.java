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
public final class GetNactagsOrgNactag {
    /**
     * @return Can be set to true to allow the override by usermac result
     * 
     */
    private Boolean allowUsermacOverride;
    /**
     * @return When the object has been created, in epoch
     * 
     */
    private Double createdTime;
    /**
     * @return If `type`==`egress_vlan_names`, list of egress vlans to return
     * 
     */
    private List<String> egressVlanNames;
    /**
     * @return If `type`==`gbp_tag`
     * 
     */
    private Integer gbpTag;
    /**
     * @return Unique ID of the object instance in the Mist Organnization
     * 
     */
    private String id;
    /**
     * @return if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`, `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`, `usermac_label`
     * 
     */
    private String match;
    /**
     * @return This field is applicable only when `type`==`match`
     *   * `false`: means it is sufficient to match any of the values (i.e., match-any behavior)
     *   * `true`: means all values should be matched (i.e., match-all behavior)
     * 
     * Currently it makes sense to set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
     * 
     */
    private Boolean matchAll;
    /**
     * @return When the object has been modified for the last time, in epoch
     * 
     */
    private Double modifiedTime;
    private String name;
    private String orgId;
    /**
     * @return If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;.
     * It is the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected.
     * Note that it is allowed to have more than one radius_attrs in the result of a given rule.
     * 
     */
    private List<String> radiusAttrs;
    /**
     * @return If `type`==`radius_group`
     * 
     */
    private String radiusGroup;
    /**
     * @return If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field &#34;radius_vendor_attrs&#34;.
     * It is the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected.
     * Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
     * 
     */
    private List<String> radiusVendorAttrs;
    /**
     * @return If `type`==`session_timeout, in seconds
     * 
     */
    private Integer sessionTimeout;
    /**
     * @return enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`, `username_attr`, `vlan`
     * 
     */
    private String type;
    /**
     * @return enum: `automatic`, `cn`, `dns`, `email`, `upn`
     * 
     */
    private String usernameAttr;
    /**
     * @return If `type`==`match`
     * 
     */
    private List<String> values;
    /**
     * @return If `type`==`vlan`
     * 
     */
    private String vlan;

    private GetNactagsOrgNactag() {}
    /**
     * @return Can be set to true to allow the override by usermac result
     * 
     */
    public Boolean allowUsermacOverride() {
        return this.allowUsermacOverride;
    }
    /**
     * @return When the object has been created, in epoch
     * 
     */
    public Double createdTime() {
        return this.createdTime;
    }
    /**
     * @return If `type`==`egress_vlan_names`, list of egress vlans to return
     * 
     */
    public List<String> egressVlanNames() {
        return this.egressVlanNames;
    }
    /**
     * @return If `type`==`gbp_tag`
     * 
     */
    public Integer gbpTag() {
        return this.gbpTag;
    }
    /**
     * @return Unique ID of the object instance in the Mist Organnization
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`, `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`, `usermac_label`
     * 
     */
    public String match() {
        return this.match;
    }
    /**
     * @return This field is applicable only when `type`==`match`
     *   * `false`: means it is sufficient to match any of the values (i.e., match-any behavior)
     *   * `true`: means all values should be matched (i.e., match-all behavior)
     * 
     * Currently it makes sense to set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
     * 
     */
    public Boolean matchAll() {
        return this.matchAll;
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
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;.
     * It is the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected.
     * Note that it is allowed to have more than one radius_attrs in the result of a given rule.
     * 
     */
    public List<String> radiusAttrs() {
        return this.radiusAttrs;
    }
    /**
     * @return If `type`==`radius_group`
     * 
     */
    public String radiusGroup() {
        return this.radiusGroup;
    }
    /**
     * @return If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field &#34;radius_vendor_attrs&#34;.
     * It is the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected.
     * Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
     * 
     */
    public List<String> radiusVendorAttrs() {
        return this.radiusVendorAttrs;
    }
    /**
     * @return If `type`==`session_timeout, in seconds
     * 
     */
    public Integer sessionTimeout() {
        return this.sessionTimeout;
    }
    /**
     * @return enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`, `username_attr`, `vlan`
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return enum: `automatic`, `cn`, `dns`, `email`, `upn`
     * 
     */
    public String usernameAttr() {
        return this.usernameAttr;
    }
    /**
     * @return If `type`==`match`
     * 
     */
    public List<String> values() {
        return this.values;
    }
    /**
     * @return If `type`==`vlan`
     * 
     */
    public String vlan() {
        return this.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNactagsOrgNactag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowUsermacOverride;
        private Double createdTime;
        private List<String> egressVlanNames;
        private Integer gbpTag;
        private String id;
        private String match;
        private Boolean matchAll;
        private Double modifiedTime;
        private String name;
        private String orgId;
        private List<String> radiusAttrs;
        private String radiusGroup;
        private List<String> radiusVendorAttrs;
        private Integer sessionTimeout;
        private String type;
        private String usernameAttr;
        private List<String> values;
        private String vlan;
        public Builder() {}
        public Builder(GetNactagsOrgNactag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowUsermacOverride = defaults.allowUsermacOverride;
    	      this.createdTime = defaults.createdTime;
    	      this.egressVlanNames = defaults.egressVlanNames;
    	      this.gbpTag = defaults.gbpTag;
    	      this.id = defaults.id;
    	      this.match = defaults.match;
    	      this.matchAll = defaults.matchAll;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.radiusAttrs = defaults.radiusAttrs;
    	      this.radiusGroup = defaults.radiusGroup;
    	      this.radiusVendorAttrs = defaults.radiusVendorAttrs;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.type = defaults.type;
    	      this.usernameAttr = defaults.usernameAttr;
    	      this.values = defaults.values;
    	      this.vlan = defaults.vlan;
        }

        @CustomType.Setter
        public Builder allowUsermacOverride(Boolean allowUsermacOverride) {
            if (allowUsermacOverride == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "allowUsermacOverride");
            }
            this.allowUsermacOverride = allowUsermacOverride;
            return this;
        }
        @CustomType.Setter
        public Builder createdTime(Double createdTime) {
            if (createdTime == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "createdTime");
            }
            this.createdTime = createdTime;
            return this;
        }
        @CustomType.Setter
        public Builder egressVlanNames(List<String> egressVlanNames) {
            if (egressVlanNames == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "egressVlanNames");
            }
            this.egressVlanNames = egressVlanNames;
            return this;
        }
        public Builder egressVlanNames(String... egressVlanNames) {
            return egressVlanNames(List.of(egressVlanNames));
        }
        @CustomType.Setter
        public Builder gbpTag(Integer gbpTag) {
            if (gbpTag == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "gbpTag");
            }
            this.gbpTag = gbpTag;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder match(String match) {
            if (match == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "match");
            }
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder matchAll(Boolean matchAll) {
            if (matchAll == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "matchAll");
            }
            this.matchAll = matchAll;
            return this;
        }
        @CustomType.Setter
        public Builder modifiedTime(Double modifiedTime) {
            if (modifiedTime == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "modifiedTime");
            }
            this.modifiedTime = modifiedTime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            if (orgId == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "orgId");
            }
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder radiusAttrs(List<String> radiusAttrs) {
            if (radiusAttrs == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "radiusAttrs");
            }
            this.radiusAttrs = radiusAttrs;
            return this;
        }
        public Builder radiusAttrs(String... radiusAttrs) {
            return radiusAttrs(List.of(radiusAttrs));
        }
        @CustomType.Setter
        public Builder radiusGroup(String radiusGroup) {
            if (radiusGroup == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "radiusGroup");
            }
            this.radiusGroup = radiusGroup;
            return this;
        }
        @CustomType.Setter
        public Builder radiusVendorAttrs(List<String> radiusVendorAttrs) {
            if (radiusVendorAttrs == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "radiusVendorAttrs");
            }
            this.radiusVendorAttrs = radiusVendorAttrs;
            return this;
        }
        public Builder radiusVendorAttrs(String... radiusVendorAttrs) {
            return radiusVendorAttrs(List.of(radiusVendorAttrs));
        }
        @CustomType.Setter
        public Builder sessionTimeout(Integer sessionTimeout) {
            if (sessionTimeout == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "sessionTimeout");
            }
            this.sessionTimeout = sessionTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder usernameAttr(String usernameAttr) {
            if (usernameAttr == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "usernameAttr");
            }
            this.usernameAttr = usernameAttr;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        @CustomType.Setter
        public Builder vlan(String vlan) {
            if (vlan == null) {
              throw new MissingRequiredPropertyException("GetNactagsOrgNactag", "vlan");
            }
            this.vlan = vlan;
            return this;
        }
        public GetNactagsOrgNactag build() {
            final var _resultValue = new GetNactagsOrgNactag();
            _resultValue.allowUsermacOverride = allowUsermacOverride;
            _resultValue.createdTime = createdTime;
            _resultValue.egressVlanNames = egressVlanNames;
            _resultValue.gbpTag = gbpTag;
            _resultValue.id = id;
            _resultValue.match = match;
            _resultValue.matchAll = matchAll;
            _resultValue.modifiedTime = modifiedTime;
            _resultValue.name = name;
            _resultValue.orgId = orgId;
            _resultValue.radiusAttrs = radiusAttrs;
            _resultValue.radiusGroup = radiusGroup;
            _resultValue.radiusVendorAttrs = radiusVendorAttrs;
            _resultValue.sessionTimeout = sessionTimeout;
            _resultValue.type = type;
            _resultValue.usernameAttr = usernameAttr;
            _resultValue.values = values;
            _resultValue.vlan = vlan;
            return _resultValue;
        }
    }
}
