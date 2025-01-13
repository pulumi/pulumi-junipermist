// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.org.SettingArgs;
import com.pulumi.junipermist.org.inputs.SettingState;
import com.pulumi.junipermist.org.outputs.SettingApiPolicy;
import com.pulumi.junipermist.org.outputs.SettingCelona;
import com.pulumi.junipermist.org.outputs.SettingCloudshark;
import com.pulumi.junipermist.org.outputs.SettingCradlepoint;
import com.pulumi.junipermist.org.outputs.SettingDeviceCert;
import com.pulumi.junipermist.org.outputs.SettingInstaller;
import com.pulumi.junipermist.org.outputs.SettingJcloud;
import com.pulumi.junipermist.org.outputs.SettingJcloudRa;
import com.pulumi.junipermist.org.outputs.SettingJuniper;
import com.pulumi.junipermist.org.outputs.SettingMgmt;
import com.pulumi.junipermist.org.outputs.SettingMistNac;
import com.pulumi.junipermist.org.outputs.SettingMxedgeMgmt;
import com.pulumi.junipermist.org.outputs.SettingOpticPortConfig;
import com.pulumi.junipermist.org.outputs.SettingPasswordPolicy;
import com.pulumi.junipermist.org.outputs.SettingPcap;
import com.pulumi.junipermist.org.outputs.SettingSecurity;
import com.pulumi.junipermist.org.outputs.SettingSwitchMgmt;
import com.pulumi.junipermist.org.outputs.SettingSyntheticTest;
import com.pulumi.junipermist.org.outputs.SettingVpnOptions;
import com.pulumi.junipermist.org.outputs.SettingWanPma;
import com.pulumi.junipermist.org.outputs.SettingWiredPma;
import com.pulumi.junipermist.org.outputs.SettingWirelessPma;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource manages the Org Settings.
 * 
 * The Org Settings can be used to customize the Org configuration
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `mist_org_setting` with:
 * 
 * Org Setting can be imported by specifying the org_id
 * 
 * ```sh
 * $ pulumi import junipermist:org/setting:Setting setting_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a
 * ```
 * 
 */
@ResourceType(type="junipermist:org/setting:Setting")
public class Setting extends com.pulumi.resources.CustomResource {
    /**
     * enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Export(name="apUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> apUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Output<Integer> apUpdownThreshold() {
        return this.apUpdownThreshold;
    }
    @Export(name="apiPolicy", refs={SettingApiPolicy.class}, tree="[0]")
    private Output</* @Nullable */ SettingApiPolicy> apiPolicy;

    public Output<Optional<SettingApiPolicy>> apiPolicy() {
        return Codegen.optional(this.apiPolicy);
    }
    /**
     * list of PEM-encoded ca certs
     * 
     */
    @Export(name="cacerts", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> cacerts;

    /**
     * @return list of PEM-encoded ca certs
     * 
     */
    public Output<List<String>> cacerts() {
        return this.cacerts;
    }
    @Export(name="celona", refs={SettingCelona.class}, tree="[0]")
    private Output</* @Nullable */ SettingCelona> celona;

    public Output<Optional<SettingCelona>> celona() {
        return Codegen.optional(this.celona);
    }
    @Export(name="cloudshark", refs={SettingCloudshark.class}, tree="[0]")
    private Output</* @Nullable */ SettingCloudshark> cloudshark;

    public Output<Optional<SettingCloudshark>> cloudshark() {
        return Codegen.optional(this.cloudshark);
    }
    @Export(name="cradlepoint", refs={SettingCradlepoint.class}, tree="[0]")
    private Output<SettingCradlepoint> cradlepoint;

    public Output<SettingCradlepoint> cradlepoint() {
        return this.cradlepoint;
    }
    /**
     * common device cert, optional
     * 
     */
    @Export(name="deviceCert", refs={SettingDeviceCert.class}, tree="[0]")
    private Output</* @Nullable */ SettingDeviceCert> deviceCert;

    /**
     * @return common device cert, optional
     * 
     */
    public Output<Optional<SettingDeviceCert>> deviceCert() {
        return Codegen.optional(this.deviceCert);
    }
    /**
     * enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
     * AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
     * immediate)
     * 
     */
    @Export(name="deviceUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> deviceUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
     * AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
     * immediate)
     * 
     */
    public Output<Integer> deviceUpdownThreshold() {
        return this.deviceUpdownThreshold;
    }
    /**
     * whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
     * 
     */
    @Export(name="disablePcap", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disablePcap;

    /**
     * @return whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
     * 
     */
    public Output<Boolean> disablePcap() {
        return this.disablePcap;
    }
    /**
     * whether to disable remote shell access for an entire org
     * 
     */
    @Export(name="disableRemoteShell", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disableRemoteShell;

    /**
     * @return whether to disable remote shell access for an entire org
     * 
     */
    public Output<Boolean> disableRemoteShell() {
        return this.disableRemoteShell;
    }
    /**
     * enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Export(name="gatewayUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> gatewayUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Output<Integer> gatewayUpdownThreshold() {
        return this.gatewayUpdownThreshold;
    }
    @Export(name="installer", refs={SettingInstaller.class}, tree="[0]")
    private Output</* @Nullable */ SettingInstaller> installer;

    public Output<Optional<SettingInstaller>> installer() {
        return Codegen.optional(this.installer);
    }
    @Export(name="jcloud", refs={SettingJcloud.class}, tree="[0]")
    private Output</* @Nullable */ SettingJcloud> jcloud;

    public Output<Optional<SettingJcloud>> jcloud() {
        return Codegen.optional(this.jcloud);
    }
    /**
     * JCloud Routing Assurance connexion
     * 
     */
    @Export(name="jcloudRa", refs={SettingJcloudRa.class}, tree="[0]")
    private Output</* @Nullable */ SettingJcloudRa> jcloudRa;

    /**
     * @return JCloud Routing Assurance connexion
     * 
     */
    public Output<Optional<SettingJcloudRa>> jcloudRa() {
        return Codegen.optional(this.jcloudRa);
    }
    @Export(name="juniper", refs={SettingJuniper.class}, tree="[0]")
    private Output<SettingJuniper> juniper;

    public Output<SettingJuniper> juniper() {
        return this.juniper;
    }
    /**
     * management-related properties
     * 
     */
    @Export(name="mgmt", refs={SettingMgmt.class}, tree="[0]")
    private Output</* @Nullable */ SettingMgmt> mgmt;

    /**
     * @return management-related properties
     * 
     */
    public Output<Optional<SettingMgmt>> mgmt() {
        return Codegen.optional(this.mgmt);
    }
    @Export(name="mistNac", refs={SettingMistNac.class}, tree="[0]")
    private Output</* @Nullable */ SettingMistNac> mistNac;

    public Output<Optional<SettingMistNac>> mistNac() {
        return Codegen.optional(this.mistNac);
    }
    @Export(name="mxedgeFipsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> mxedgeFipsEnabled;

    public Output<Boolean> mxedgeFipsEnabled() {
        return this.mxedgeFipsEnabled;
    }
    @Export(name="mxedgeMgmt", refs={SettingMxedgeMgmt.class}, tree="[0]")
    private Output</* @Nullable */ SettingMxedgeMgmt> mxedgeMgmt;

    public Output<Optional<SettingMxedgeMgmt>> mxedgeMgmt() {
        return Codegen.optional(this.mxedgeMgmt);
    }
    /**
     * Property key is the interface name or range (e.g. `et-0/0/47`, `et-0/0/48-49`)
     * 
     */
    @Export(name="opticPortConfig", refs={Map.class,String.class,SettingOpticPortConfig.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,SettingOpticPortConfig>> opticPortConfig;

    /**
     * @return Property key is the interface name or range (e.g. `et-0/0/47`, `et-0/0/48-49`)
     * 
     */
    public Output<Optional<Map<String,SettingOpticPortConfig>>> opticPortConfig() {
        return Codegen.optional(this.opticPortConfig);
    }
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * password policy
     * 
     */
    @Export(name="passwordPolicy", refs={SettingPasswordPolicy.class}, tree="[0]")
    private Output</* @Nullable */ SettingPasswordPolicy> passwordPolicy;

    /**
     * @return password policy
     * 
     */
    public Output<Optional<SettingPasswordPolicy>> passwordPolicy() {
        return Codegen.optional(this.passwordPolicy);
    }
    @Export(name="pcap", refs={SettingPcap.class}, tree="[0]")
    private Output</* @Nullable */ SettingPcap> pcap;

    public Output<Optional<SettingPcap>> pcap() {
        return Codegen.optional(this.pcap);
    }
    @Export(name="security", refs={SettingSecurity.class}, tree="[0]")
    private Output</* @Nullable */ SettingSecurity> security;

    public Output<Optional<SettingSecurity>> security() {
        return Codegen.optional(this.security);
    }
    @Export(name="switchMgmt", refs={SettingSwitchMgmt.class}, tree="[0]")
    private Output</* @Nullable */ SettingSwitchMgmt> switchMgmt;

    public Output<Optional<SettingSwitchMgmt>> switchMgmt() {
        return Codegen.optional(this.switchMgmt);
    }
    /**
     * enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Export(name="switchUpdownThreshold", refs={Integer.class}, tree="[0]")
    private Output<Integer> switchUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Output<Integer> switchUpdownThreshold() {
        return this.switchUpdownThreshold;
    }
    @Export(name="syntheticTest", refs={SettingSyntheticTest.class}, tree="[0]")
    private Output</* @Nullable */ SettingSyntheticTest> syntheticTest;

    public Output<Optional<SettingSyntheticTest>> syntheticTest() {
        return Codegen.optional(this.syntheticTest);
    }
    /**
     * automatically logout the user when UI session is inactive. `0` means disabled
     * 
     */
    @Export(name="uiIdleTimeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> uiIdleTimeout;

    /**
     * @return automatically logout the user when UI session is inactive. `0` means disabled
     * 
     */
    public Output<Integer> uiIdleTimeout() {
        return this.uiIdleTimeout;
    }
    @Export(name="vpnOptions", refs={SettingVpnOptions.class}, tree="[0]")
    private Output</* @Nullable */ SettingVpnOptions> vpnOptions;

    public Output<Optional<SettingVpnOptions>> vpnOptions() {
        return Codegen.optional(this.vpnOptions);
    }
    @Export(name="wanPma", refs={SettingWanPma.class}, tree="[0]")
    private Output</* @Nullable */ SettingWanPma> wanPma;

    public Output<Optional<SettingWanPma>> wanPma() {
        return Codegen.optional(this.wanPma);
    }
    @Export(name="wiredPma", refs={SettingWiredPma.class}, tree="[0]")
    private Output</* @Nullable */ SettingWiredPma> wiredPma;

    public Output<Optional<SettingWiredPma>> wiredPma() {
        return Codegen.optional(this.wiredPma);
    }
    @Export(name="wirelessPma", refs={SettingWirelessPma.class}, tree="[0]")
    private Output</* @Nullable */ SettingWirelessPma> wirelessPma;

    public Output<Optional<SettingWirelessPma>> wirelessPma() {
        return Codegen.optional(this.wirelessPma);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Setting(java.lang.String name) {
        this(name, SettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Setting(java.lang.String name, SettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Setting(java.lang.String name, SettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/setting:Setting", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Setting(java.lang.String name, Output<java.lang.String> id, @Nullable SettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("junipermist:org/setting:Setting", name, state, makeResourceOptions(options, id), false);
    }

    private static SettingArgs makeArgs(SettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SettingArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Setting get(java.lang.String name, Output<java.lang.String> id, @Nullable SettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Setting(name, id, state, options);
    }
}
