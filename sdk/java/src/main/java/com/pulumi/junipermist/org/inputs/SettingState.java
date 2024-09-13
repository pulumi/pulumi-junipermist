// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.org.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.junipermist.org.inputs.SettingApiPolicyArgs;
import com.pulumi.junipermist.org.inputs.SettingCelonaArgs;
import com.pulumi.junipermist.org.inputs.SettingCloudsharkArgs;
import com.pulumi.junipermist.org.inputs.SettingCradlepointArgs;
import com.pulumi.junipermist.org.inputs.SettingDeviceCertArgs;
import com.pulumi.junipermist.org.inputs.SettingInstallerArgs;
import com.pulumi.junipermist.org.inputs.SettingJcloudArgs;
import com.pulumi.junipermist.org.inputs.SettingJuniperArgs;
import com.pulumi.junipermist.org.inputs.SettingMgmtArgs;
import com.pulumi.junipermist.org.inputs.SettingMistNacArgs;
import com.pulumi.junipermist.org.inputs.SettingMxedgeMgmtArgs;
import com.pulumi.junipermist.org.inputs.SettingPasswordPolicyArgs;
import com.pulumi.junipermist.org.inputs.SettingPcapArgs;
import com.pulumi.junipermist.org.inputs.SettingPortChannelizationArgs;
import com.pulumi.junipermist.org.inputs.SettingSecurityArgs;
import com.pulumi.junipermist.org.inputs.SettingSwitchMgmtArgs;
import com.pulumi.junipermist.org.inputs.SettingSyntheticTestArgs;
import com.pulumi.junipermist.org.inputs.SettingVpnOptionsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SettingState extends com.pulumi.resources.ResourceArgs {

    public static final SettingState Empty = new SettingState();

    /**
     * enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Import(name="apUpdownThreshold")
    private @Nullable Output<Integer> apUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Optional<Output<Integer>> apUpdownThreshold() {
        return Optional.ofNullable(this.apUpdownThreshold);
    }

    @Import(name="apiPolicy")
    private @Nullable Output<SettingApiPolicyArgs> apiPolicy;

    public Optional<Output<SettingApiPolicyArgs>> apiPolicy() {
        return Optional.ofNullable(this.apiPolicy);
    }

    /**
     * list of PEM-encoded ca certs
     * 
     */
    @Import(name="cacerts")
    private @Nullable Output<List<String>> cacerts;

    /**
     * @return list of PEM-encoded ca certs
     * 
     */
    public Optional<Output<List<String>>> cacerts() {
        return Optional.ofNullable(this.cacerts);
    }

    @Import(name="celona")
    private @Nullable Output<SettingCelonaArgs> celona;

    public Optional<Output<SettingCelonaArgs>> celona() {
        return Optional.ofNullable(this.celona);
    }

    @Import(name="cloudshark")
    private @Nullable Output<SettingCloudsharkArgs> cloudshark;

    public Optional<Output<SettingCloudsharkArgs>> cloudshark() {
        return Optional.ofNullable(this.cloudshark);
    }

    @Import(name="cradlepoint")
    private @Nullable Output<SettingCradlepointArgs> cradlepoint;

    public Optional<Output<SettingCradlepointArgs>> cradlepoint() {
        return Optional.ofNullable(this.cradlepoint);
    }

    /**
     * common device cert, optional
     * 
     */
    @Import(name="deviceCert")
    private @Nullable Output<SettingDeviceCertArgs> deviceCert;

    /**
     * @return common device cert, optional
     * 
     */
    public Optional<Output<SettingDeviceCertArgs>> deviceCert() {
        return Optional.ofNullable(this.deviceCert);
    }

    /**
     * enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
     * AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
     * immediate)
     * 
     */
    @Import(name="deviceUpdownThreshold")
    private @Nullable Output<Integer> deviceUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
     * AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
     * immediate)
     * 
     */
    public Optional<Output<Integer>> deviceUpdownThreshold() {
        return Optional.ofNullable(this.deviceUpdownThreshold);
    }

    /**
     * whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
     * 
     */
    @Import(name="disablePcap")
    private @Nullable Output<Boolean> disablePcap;

    /**
     * @return whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
     * 
     */
    public Optional<Output<Boolean>> disablePcap() {
        return Optional.ofNullable(this.disablePcap);
    }

    /**
     * whether to disable remote shell access for an entire org
     * 
     */
    @Import(name="disableRemoteShell")
    private @Nullable Output<Boolean> disableRemoteShell;

    /**
     * @return whether to disable remote shell access for an entire org
     * 
     */
    public Optional<Output<Boolean>> disableRemoteShell() {
        return Optional.ofNullable(this.disableRemoteShell);
    }

    /**
     * enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Import(name="gatewayUpdownThreshold")
    private @Nullable Output<Integer> gatewayUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Optional<Output<Integer>> gatewayUpdownThreshold() {
        return Optional.ofNullable(this.gatewayUpdownThreshold);
    }

    @Import(name="installer")
    private @Nullable Output<SettingInstallerArgs> installer;

    public Optional<Output<SettingInstallerArgs>> installer() {
        return Optional.ofNullable(this.installer);
    }

    @Import(name="jcloud")
    private @Nullable Output<SettingJcloudArgs> jcloud;

    public Optional<Output<SettingJcloudArgs>> jcloud() {
        return Optional.ofNullable(this.jcloud);
    }

    @Import(name="juniper")
    private @Nullable Output<SettingJuniperArgs> juniper;

    public Optional<Output<SettingJuniperArgs>> juniper() {
        return Optional.ofNullable(this.juniper);
    }

    /**
     * management-related properties
     * 
     */
    @Import(name="mgmt")
    private @Nullable Output<SettingMgmtArgs> mgmt;

    /**
     * @return management-related properties
     * 
     */
    public Optional<Output<SettingMgmtArgs>> mgmt() {
        return Optional.ofNullable(this.mgmt);
    }

    @Import(name="mistNac")
    private @Nullable Output<SettingMistNacArgs> mistNac;

    public Optional<Output<SettingMistNacArgs>> mistNac() {
        return Optional.ofNullable(this.mistNac);
    }

    @Import(name="mxedgeFipsEnabled")
    private @Nullable Output<Boolean> mxedgeFipsEnabled;

    public Optional<Output<Boolean>> mxedgeFipsEnabled() {
        return Optional.ofNullable(this.mxedgeFipsEnabled);
    }

    @Import(name="mxedgeMgmt")
    private @Nullable Output<SettingMxedgeMgmtArgs> mxedgeMgmt;

    public Optional<Output<SettingMxedgeMgmtArgs>> mxedgeMgmt() {
        return Optional.ofNullable(this.mxedgeMgmt);
    }

    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * password policy
     * 
     */
    @Import(name="passwordPolicy")
    private @Nullable Output<SettingPasswordPolicyArgs> passwordPolicy;

    /**
     * @return password policy
     * 
     */
    public Optional<Output<SettingPasswordPolicyArgs>> passwordPolicy() {
        return Optional.ofNullable(this.passwordPolicy);
    }

    @Import(name="pcap")
    private @Nullable Output<SettingPcapArgs> pcap;

    public Optional<Output<SettingPcapArgs>> pcap() {
        return Optional.ofNullable(this.pcap);
    }

    @Import(name="portChannelization")
    private @Nullable Output<SettingPortChannelizationArgs> portChannelization;

    public Optional<Output<SettingPortChannelizationArgs>> portChannelization() {
        return Optional.ofNullable(this.portChannelization);
    }

    @Import(name="security")
    private @Nullable Output<SettingSecurityArgs> security;

    public Optional<Output<SettingSecurityArgs>> security() {
        return Optional.ofNullable(this.security);
    }

    @Import(name="switchMgmt")
    private @Nullable Output<SettingSwitchMgmtArgs> switchMgmt;

    public Optional<Output<SettingSwitchMgmtArgs>> switchMgmt() {
        return Optional.ofNullable(this.switchMgmt);
    }

    /**
     * enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    @Import(name="switchUpdownThreshold")
    private @Nullable Output<Integer> switchUpdownThreshold;

    /**
     * @return enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
     * `device_updown_threshold` is ignored.
     * 
     */
    public Optional<Output<Integer>> switchUpdownThreshold() {
        return Optional.ofNullable(this.switchUpdownThreshold);
    }

    @Import(name="syntheticTest")
    private @Nullable Output<SettingSyntheticTestArgs> syntheticTest;

    public Optional<Output<SettingSyntheticTestArgs>> syntheticTest() {
        return Optional.ofNullable(this.syntheticTest);
    }

    /**
     * automatically logout the user when UI session is inactive. `0` means disabled
     * 
     */
    @Import(name="uiIdleTimeout")
    private @Nullable Output<Integer> uiIdleTimeout;

    /**
     * @return automatically logout the user when UI session is inactive. `0` means disabled
     * 
     */
    public Optional<Output<Integer>> uiIdleTimeout() {
        return Optional.ofNullable(this.uiIdleTimeout);
    }

    @Import(name="vpnOptions")
    private @Nullable Output<SettingVpnOptionsArgs> vpnOptions;

    public Optional<Output<SettingVpnOptionsArgs>> vpnOptions() {
        return Optional.ofNullable(this.vpnOptions);
    }

    private SettingState() {}

    private SettingState(SettingState $) {
        this.apUpdownThreshold = $.apUpdownThreshold;
        this.apiPolicy = $.apiPolicy;
        this.cacerts = $.cacerts;
        this.celona = $.celona;
        this.cloudshark = $.cloudshark;
        this.cradlepoint = $.cradlepoint;
        this.deviceCert = $.deviceCert;
        this.deviceUpdownThreshold = $.deviceUpdownThreshold;
        this.disablePcap = $.disablePcap;
        this.disableRemoteShell = $.disableRemoteShell;
        this.gatewayUpdownThreshold = $.gatewayUpdownThreshold;
        this.installer = $.installer;
        this.jcloud = $.jcloud;
        this.juniper = $.juniper;
        this.mgmt = $.mgmt;
        this.mistNac = $.mistNac;
        this.mxedgeFipsEnabled = $.mxedgeFipsEnabled;
        this.mxedgeMgmt = $.mxedgeMgmt;
        this.orgId = $.orgId;
        this.passwordPolicy = $.passwordPolicy;
        this.pcap = $.pcap;
        this.portChannelization = $.portChannelization;
        this.security = $.security;
        this.switchMgmt = $.switchMgmt;
        this.switchUpdownThreshold = $.switchUpdownThreshold;
        this.syntheticTest = $.syntheticTest;
        this.uiIdleTimeout = $.uiIdleTimeout;
        this.vpnOptions = $.vpnOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SettingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SettingState $;

        public Builder() {
            $ = new SettingState();
        }

        public Builder(SettingState defaults) {
            $ = new SettingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apUpdownThreshold enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
         * `device_updown_threshold` is ignored.
         * 
         * @return builder
         * 
         */
        public Builder apUpdownThreshold(@Nullable Output<Integer> apUpdownThreshold) {
            $.apUpdownThreshold = apUpdownThreshold;
            return this;
        }

        /**
         * @param apUpdownThreshold enable threshold-based device down delivery for AP devices only. When configured it takes effect for AP devices and
         * `device_updown_threshold` is ignored.
         * 
         * @return builder
         * 
         */
        public Builder apUpdownThreshold(Integer apUpdownThreshold) {
            return apUpdownThreshold(Output.of(apUpdownThreshold));
        }

        public Builder apiPolicy(@Nullable Output<SettingApiPolicyArgs> apiPolicy) {
            $.apiPolicy = apiPolicy;
            return this;
        }

        public Builder apiPolicy(SettingApiPolicyArgs apiPolicy) {
            return apiPolicy(Output.of(apiPolicy));
        }

        /**
         * @param cacerts list of PEM-encoded ca certs
         * 
         * @return builder
         * 
         */
        public Builder cacerts(@Nullable Output<List<String>> cacerts) {
            $.cacerts = cacerts;
            return this;
        }

        /**
         * @param cacerts list of PEM-encoded ca certs
         * 
         * @return builder
         * 
         */
        public Builder cacerts(List<String> cacerts) {
            return cacerts(Output.of(cacerts));
        }

        /**
         * @param cacerts list of PEM-encoded ca certs
         * 
         * @return builder
         * 
         */
        public Builder cacerts(String... cacerts) {
            return cacerts(List.of(cacerts));
        }

        public Builder celona(@Nullable Output<SettingCelonaArgs> celona) {
            $.celona = celona;
            return this;
        }

        public Builder celona(SettingCelonaArgs celona) {
            return celona(Output.of(celona));
        }

        public Builder cloudshark(@Nullable Output<SettingCloudsharkArgs> cloudshark) {
            $.cloudshark = cloudshark;
            return this;
        }

        public Builder cloudshark(SettingCloudsharkArgs cloudshark) {
            return cloudshark(Output.of(cloudshark));
        }

        public Builder cradlepoint(@Nullable Output<SettingCradlepointArgs> cradlepoint) {
            $.cradlepoint = cradlepoint;
            return this;
        }

        public Builder cradlepoint(SettingCradlepointArgs cradlepoint) {
            return cradlepoint(Output.of(cradlepoint));
        }

        /**
         * @param deviceCert common device cert, optional
         * 
         * @return builder
         * 
         */
        public Builder deviceCert(@Nullable Output<SettingDeviceCertArgs> deviceCert) {
            $.deviceCert = deviceCert;
            return this;
        }

        /**
         * @param deviceCert common device cert, optional
         * 
         * @return builder
         * 
         */
        public Builder deviceCert(SettingDeviceCertArgs deviceCert) {
            return deviceCert(Output.of(deviceCert));
        }

        /**
         * @param deviceUpdownThreshold enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
         * AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
         * immediate)
         * 
         * @return builder
         * 
         */
        public Builder deviceUpdownThreshold(@Nullable Output<Integer> deviceUpdownThreshold) {
            $.deviceUpdownThreshold = deviceUpdownThreshold;
            return this;
        }

        /**
         * @param deviceUpdownThreshold enable threshold-based device down delivery via * device-updowns webhooks topic, * Mist Alert Framework; e.g. send
         * AP/SW/GW down event only if AP/SW/GW Up is not seen within the threshold in minutes; 0 - 240, default is 0 (trigger
         * immediate)
         * 
         * @return builder
         * 
         */
        public Builder deviceUpdownThreshold(Integer deviceUpdownThreshold) {
            return deviceUpdownThreshold(Output.of(deviceUpdownThreshold));
        }

        /**
         * @param disablePcap whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
         * 
         * @return builder
         * 
         */
        public Builder disablePcap(@Nullable Output<Boolean> disablePcap) {
            $.disablePcap = disablePcap;
            return this;
        }

        /**
         * @param disablePcap whether to disallow Mist to analyze pcap files (this is required for marvis pcap)
         * 
         * @return builder
         * 
         */
        public Builder disablePcap(Boolean disablePcap) {
            return disablePcap(Output.of(disablePcap));
        }

        /**
         * @param disableRemoteShell whether to disable remote shell access for an entire org
         * 
         * @return builder
         * 
         */
        public Builder disableRemoteShell(@Nullable Output<Boolean> disableRemoteShell) {
            $.disableRemoteShell = disableRemoteShell;
            return this;
        }

        /**
         * @param disableRemoteShell whether to disable remote shell access for an entire org
         * 
         * @return builder
         * 
         */
        public Builder disableRemoteShell(Boolean disableRemoteShell) {
            return disableRemoteShell(Output.of(disableRemoteShell));
        }

        /**
         * @param gatewayUpdownThreshold enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
         * `device_updown_threshold` is ignored.
         * 
         * @return builder
         * 
         */
        public Builder gatewayUpdownThreshold(@Nullable Output<Integer> gatewayUpdownThreshold) {
            $.gatewayUpdownThreshold = gatewayUpdownThreshold;
            return this;
        }

        /**
         * @param gatewayUpdownThreshold enable threshold-based device down delivery for Gateway devices only. When configured it takes effect for GW devices and
         * `device_updown_threshold` is ignored.
         * 
         * @return builder
         * 
         */
        public Builder gatewayUpdownThreshold(Integer gatewayUpdownThreshold) {
            return gatewayUpdownThreshold(Output.of(gatewayUpdownThreshold));
        }

        public Builder installer(@Nullable Output<SettingInstallerArgs> installer) {
            $.installer = installer;
            return this;
        }

        public Builder installer(SettingInstallerArgs installer) {
            return installer(Output.of(installer));
        }

        public Builder jcloud(@Nullable Output<SettingJcloudArgs> jcloud) {
            $.jcloud = jcloud;
            return this;
        }

        public Builder jcloud(SettingJcloudArgs jcloud) {
            return jcloud(Output.of(jcloud));
        }

        public Builder juniper(@Nullable Output<SettingJuniperArgs> juniper) {
            $.juniper = juniper;
            return this;
        }

        public Builder juniper(SettingJuniperArgs juniper) {
            return juniper(Output.of(juniper));
        }

        /**
         * @param mgmt management-related properties
         * 
         * @return builder
         * 
         */
        public Builder mgmt(@Nullable Output<SettingMgmtArgs> mgmt) {
            $.mgmt = mgmt;
            return this;
        }

        /**
         * @param mgmt management-related properties
         * 
         * @return builder
         * 
         */
        public Builder mgmt(SettingMgmtArgs mgmt) {
            return mgmt(Output.of(mgmt));
        }

        public Builder mistNac(@Nullable Output<SettingMistNacArgs> mistNac) {
            $.mistNac = mistNac;
            return this;
        }

        public Builder mistNac(SettingMistNacArgs mistNac) {
            return mistNac(Output.of(mistNac));
        }

        public Builder mxedgeFipsEnabled(@Nullable Output<Boolean> mxedgeFipsEnabled) {
            $.mxedgeFipsEnabled = mxedgeFipsEnabled;
            return this;
        }

        public Builder mxedgeFipsEnabled(Boolean mxedgeFipsEnabled) {
            return mxedgeFipsEnabled(Output.of(mxedgeFipsEnabled));
        }

        public Builder mxedgeMgmt(@Nullable Output<SettingMxedgeMgmtArgs> mxedgeMgmt) {
            $.mxedgeMgmt = mxedgeMgmt;
            return this;
        }

        public Builder mxedgeMgmt(SettingMxedgeMgmtArgs mxedgeMgmt) {
            return mxedgeMgmt(Output.of(mxedgeMgmt));
        }

        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param passwordPolicy password policy
         * 
         * @return builder
         * 
         */
        public Builder passwordPolicy(@Nullable Output<SettingPasswordPolicyArgs> passwordPolicy) {
            $.passwordPolicy = passwordPolicy;
            return this;
        }

        /**
         * @param passwordPolicy password policy
         * 
         * @return builder
         * 
         */
        public Builder passwordPolicy(SettingPasswordPolicyArgs passwordPolicy) {
            return passwordPolicy(Output.of(passwordPolicy));
        }

        public Builder pcap(@Nullable Output<SettingPcapArgs> pcap) {
            $.pcap = pcap;
            return this;
        }

        public Builder pcap(SettingPcapArgs pcap) {
            return pcap(Output.of(pcap));
        }

        public Builder portChannelization(@Nullable Output<SettingPortChannelizationArgs> portChannelization) {
            $.portChannelization = portChannelization;
            return this;
        }

        public Builder portChannelization(SettingPortChannelizationArgs portChannelization) {
            return portChannelization(Output.of(portChannelization));
        }

        public Builder security(@Nullable Output<SettingSecurityArgs> security) {
            $.security = security;
            return this;
        }

        public Builder security(SettingSecurityArgs security) {
            return security(Output.of(security));
        }

        public Builder switchMgmt(@Nullable Output<SettingSwitchMgmtArgs> switchMgmt) {
            $.switchMgmt = switchMgmt;
            return this;
        }

        public Builder switchMgmt(SettingSwitchMgmtArgs switchMgmt) {
            return switchMgmt(Output.of(switchMgmt));
        }

        /**
         * @param switchUpdownThreshold enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
         * `device_updown_threshold` is ignored.
         * 
         * @return builder
         * 
         */
        public Builder switchUpdownThreshold(@Nullable Output<Integer> switchUpdownThreshold) {
            $.switchUpdownThreshold = switchUpdownThreshold;
            return this;
        }

        /**
         * @param switchUpdownThreshold enable threshold-based device down delivery for Switch devices only. When configured it takes effect for SW devices and
         * `device_updown_threshold` is ignored.
         * 
         * @return builder
         * 
         */
        public Builder switchUpdownThreshold(Integer switchUpdownThreshold) {
            return switchUpdownThreshold(Output.of(switchUpdownThreshold));
        }

        public Builder syntheticTest(@Nullable Output<SettingSyntheticTestArgs> syntheticTest) {
            $.syntheticTest = syntheticTest;
            return this;
        }

        public Builder syntheticTest(SettingSyntheticTestArgs syntheticTest) {
            return syntheticTest(Output.of(syntheticTest));
        }

        /**
         * @param uiIdleTimeout automatically logout the user when UI session is inactive. `0` means disabled
         * 
         * @return builder
         * 
         */
        public Builder uiIdleTimeout(@Nullable Output<Integer> uiIdleTimeout) {
            $.uiIdleTimeout = uiIdleTimeout;
            return this;
        }

        /**
         * @param uiIdleTimeout automatically logout the user when UI session is inactive. `0` means disabled
         * 
         * @return builder
         * 
         */
        public Builder uiIdleTimeout(Integer uiIdleTimeout) {
            return uiIdleTimeout(Output.of(uiIdleTimeout));
        }

        public Builder vpnOptions(@Nullable Output<SettingVpnOptionsArgs> vpnOptions) {
            $.vpnOptions = vpnOptions;
            return this;
        }

        public Builder vpnOptions(SettingVpnOptionsArgs vpnOptions) {
            return vpnOptions(Output.of(vpnOptions));
        }

        public SettingState build() {
            return $;
        }
    }

}
