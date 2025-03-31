// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NactagState extends com.pulumi.resources.ResourceArgs {

    public static final NactagState Empty = new NactagState();

    /**
     * Can be set to true to allow the override by usermac result
     * 
     */
    @Import(name="allowUsermacOverride")
    private @Nullable Output<Boolean> allowUsermacOverride;

    /**
     * @return Can be set to true to allow the override by usermac result
     * 
     */
    public Optional<Output<Boolean>> allowUsermacOverride() {
        return Optional.ofNullable(this.allowUsermacOverride);
    }

    /**
     * If `type`==`egress_vlan_names`, list of egress vlans to return
     * 
     */
    @Import(name="egressVlanNames")
    private @Nullable Output<List<String>> egressVlanNames;

    /**
     * @return If `type`==`egress_vlan_names`, list of egress vlans to return
     * 
     */
    public Optional<Output<List<String>>> egressVlanNames() {
        return Optional.ofNullable(this.egressVlanNames);
    }

    @Import(name="gbpTag")
    private @Nullable Output<String> gbpTag;

    public Optional<Output<String>> gbpTag() {
        return Optional.ofNullable(this.gbpTag);
    }

    /**
     * if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`,
     * `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`,
     * `usermac_label`
     * 
     */
    @Import(name="match")
    private @Nullable Output<String> match;

    /**
     * @return if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`,
     * `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`,
     * `usermac_label`
     * 
     */
    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
     * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
     * set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
     * 
     */
    @Import(name="matchAll")
    private @Nullable Output<Boolean> matchAll;

    /**
     * @return This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
     * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
     * set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
     * 
     */
    public Optional<Output<Boolean>> matchAll() {
        return Optional.ofNullable(this.matchAll);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;. It is
     * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
     * that it is allowed to have more than one radius_attrs in the result of a given rule.
     * 
     */
    @Import(name="radiusAttrs")
    private @Nullable Output<List<String>> radiusAttrs;

    /**
     * @return If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;. It is
     * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
     * that it is allowed to have more than one radius_attrs in the result of a given rule.
     * 
     */
    public Optional<Output<List<String>>> radiusAttrs() {
        return Optional.ofNullable(this.radiusAttrs);
    }

    /**
     * If `type`==`radius_group`
     * 
     */
    @Import(name="radiusGroup")
    private @Nullable Output<String> radiusGroup;

    /**
     * @return If `type`==`radius_group`
     * 
     */
    public Optional<Output<String>> radiusGroup() {
        return Optional.ofNullable(this.radiusGroup);
    }

    /**
     * If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
     * &#34;radius_vendor_attrs&#34;. It is the responsibility of the user to provide a syntactically correct string, otherwise it may
     * not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
     * 
     */
    @Import(name="radiusVendorAttrs")
    private @Nullable Output<List<String>> radiusVendorAttrs;

    /**
     * @return If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
     * &#34;radius_vendor_attrs&#34;. It is the responsibility of the user to provide a syntactically correct string, otherwise it may
     * not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
     * 
     */
    public Optional<Output<List<String>>> radiusVendorAttrs() {
        return Optional.ofNullable(this.radiusVendorAttrs);
    }

    /**
     * If `type`==`session_timeout, in seconds
     * 
     */
    @Import(name="sessionTimeout")
    private @Nullable Output<Integer> sessionTimeout;

    /**
     * @return If `type`==`session_timeout, in seconds
     * 
     */
    public Optional<Output<Integer>> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }

    /**
     * enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
     * `username_attr`, `vlan`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
     * `username_attr`, `vlan`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * enum: `automatic`, `cn`, `dns`, `email`, `upn`
     * 
     */
    @Import(name="usernameAttr")
    private @Nullable Output<String> usernameAttr;

    /**
     * @return enum: `automatic`, `cn`, `dns`, `email`, `upn`
     * 
     */
    public Optional<Output<String>> usernameAttr() {
        return Optional.ofNullable(this.usernameAttr);
    }

    /**
     * If `type`==`match`
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return If `type`==`match`
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    /**
     * If `type`==`vlan`
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<String> vlan;

    /**
     * @return If `type`==`vlan`
     * 
     */
    public Optional<Output<String>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    private NactagState() {}

    private NactagState(NactagState $) {
        this.allowUsermacOverride = $.allowUsermacOverride;
        this.egressVlanNames = $.egressVlanNames;
        this.gbpTag = $.gbpTag;
        this.match = $.match;
        this.matchAll = $.matchAll;
        this.name = $.name;
        this.orgId = $.orgId;
        this.radiusAttrs = $.radiusAttrs;
        this.radiusGroup = $.radiusGroup;
        this.radiusVendorAttrs = $.radiusVendorAttrs;
        this.sessionTimeout = $.sessionTimeout;
        this.type = $.type;
        this.usernameAttr = $.usernameAttr;
        this.values = $.values;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NactagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NactagState $;

        public Builder() {
            $ = new NactagState();
        }

        public Builder(NactagState defaults) {
            $ = new NactagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowUsermacOverride Can be set to true to allow the override by usermac result
         * 
         * @return builder
         * 
         */
        public Builder allowUsermacOverride(@Nullable Output<Boolean> allowUsermacOverride) {
            $.allowUsermacOverride = allowUsermacOverride;
            return this;
        }

        /**
         * @param allowUsermacOverride Can be set to true to allow the override by usermac result
         * 
         * @return builder
         * 
         */
        public Builder allowUsermacOverride(Boolean allowUsermacOverride) {
            return allowUsermacOverride(Output.of(allowUsermacOverride));
        }

        /**
         * @param egressVlanNames If `type`==`egress_vlan_names`, list of egress vlans to return
         * 
         * @return builder
         * 
         */
        public Builder egressVlanNames(@Nullable Output<List<String>> egressVlanNames) {
            $.egressVlanNames = egressVlanNames;
            return this;
        }

        /**
         * @param egressVlanNames If `type`==`egress_vlan_names`, list of egress vlans to return
         * 
         * @return builder
         * 
         */
        public Builder egressVlanNames(List<String> egressVlanNames) {
            return egressVlanNames(Output.of(egressVlanNames));
        }

        /**
         * @param egressVlanNames If `type`==`egress_vlan_names`, list of egress vlans to return
         * 
         * @return builder
         * 
         */
        public Builder egressVlanNames(String... egressVlanNames) {
            return egressVlanNames(List.of(egressVlanNames));
        }

        public Builder gbpTag(@Nullable Output<String> gbpTag) {
            $.gbpTag = gbpTag;
            return this;
        }

        public Builder gbpTag(String gbpTag) {
            return gbpTag(Output.of(gbpTag));
        }

        /**
         * @param match if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`,
         * `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`,
         * `usermac_label`
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`,
         * `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`,
         * `usermac_label`
         * 
         * @return builder
         * 
         */
        public Builder match(String match) {
            return match(Output.of(match));
        }

        /**
         * @param matchAll This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
         * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
         * set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
         * 
         * @return builder
         * 
         */
        public Builder matchAll(@Nullable Output<Boolean> matchAll) {
            $.matchAll = matchAll;
            return this;
        }

        /**
         * @param matchAll This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
         * match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
         * set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
         * 
         * @return builder
         * 
         */
        public Builder matchAll(Boolean matchAll) {
            return matchAll(Output.of(matchAll));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param radiusAttrs If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;. It is
         * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
         * that it is allowed to have more than one radius_attrs in the result of a given rule.
         * 
         * @return builder
         * 
         */
        public Builder radiusAttrs(@Nullable Output<List<String>> radiusAttrs) {
            $.radiusAttrs = radiusAttrs;
            return this;
        }

        /**
         * @param radiusAttrs If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;. It is
         * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
         * that it is allowed to have more than one radius_attrs in the result of a given rule.
         * 
         * @return builder
         * 
         */
        public Builder radiusAttrs(List<String> radiusAttrs) {
            return radiusAttrs(Output.of(radiusAttrs));
        }

        /**
         * @param radiusAttrs If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field &#34;radius_attrs&#34;. It is
         * the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
         * that it is allowed to have more than one radius_attrs in the result of a given rule.
         * 
         * @return builder
         * 
         */
        public Builder radiusAttrs(String... radiusAttrs) {
            return radiusAttrs(List.of(radiusAttrs));
        }

        /**
         * @param radiusGroup If `type`==`radius_group`
         * 
         * @return builder
         * 
         */
        public Builder radiusGroup(@Nullable Output<String> radiusGroup) {
            $.radiusGroup = radiusGroup;
            return this;
        }

        /**
         * @param radiusGroup If `type`==`radius_group`
         * 
         * @return builder
         * 
         */
        public Builder radiusGroup(String radiusGroup) {
            return radiusGroup(Output.of(radiusGroup));
        }

        /**
         * @param radiusVendorAttrs If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
         * &#34;radius_vendor_attrs&#34;. It is the responsibility of the user to provide a syntactically correct string, otherwise it may
         * not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
         * 
         * @return builder
         * 
         */
        public Builder radiusVendorAttrs(@Nullable Output<List<String>> radiusVendorAttrs) {
            $.radiusVendorAttrs = radiusVendorAttrs;
            return this;
        }

        /**
         * @param radiusVendorAttrs If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
         * &#34;radius_vendor_attrs&#34;. It is the responsibility of the user to provide a syntactically correct string, otherwise it may
         * not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
         * 
         * @return builder
         * 
         */
        public Builder radiusVendorAttrs(List<String> radiusVendorAttrs) {
            return radiusVendorAttrs(Output.of(radiusVendorAttrs));
        }

        /**
         * @param radiusVendorAttrs If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
         * &#34;radius_vendor_attrs&#34;. It is the responsibility of the user to provide a syntactically correct string, otherwise it may
         * not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
         * 
         * @return builder
         * 
         */
        public Builder radiusVendorAttrs(String... radiusVendorAttrs) {
            return radiusVendorAttrs(List.of(radiusVendorAttrs));
        }

        /**
         * @param sessionTimeout If `type`==`session_timeout, in seconds
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            $.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * @param sessionTimeout If `type`==`session_timeout, in seconds
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            return sessionTimeout(Output.of(sessionTimeout));
        }

        /**
         * @param type enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
         * `username_attr`, `vlan`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
         * `username_attr`, `vlan`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param usernameAttr enum: `automatic`, `cn`, `dns`, `email`, `upn`
         * 
         * @return builder
         * 
         */
        public Builder usernameAttr(@Nullable Output<String> usernameAttr) {
            $.usernameAttr = usernameAttr;
            return this;
        }

        /**
         * @param usernameAttr enum: `automatic`, `cn`, `dns`, `email`, `upn`
         * 
         * @return builder
         * 
         */
        public Builder usernameAttr(String usernameAttr) {
            return usernameAttr(Output.of(usernameAttr));
        }

        /**
         * @param values If `type`==`match`
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values If `type`==`match`
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values If `type`==`match`
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        /**
         * @param vlan If `type`==`vlan`
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<String> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan If `type`==`vlan`
         * 
         * @return builder
         * 
         */
        public Builder vlan(String vlan) {
            return vlan(Output.of(vlan));
        }

        public NactagState build() {
            return $;
        }
    }

}
