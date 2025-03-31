// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Outputs
{

    [OutputType]
    public sealed class GetWlansSiteWlanResult
    {
        /// <summary>
        /// Enable coa-immediate-update and address-change-immediate-update on the access profile.
        /// </summary>
        public readonly bool AcctImmediateUpdate;
        /// <summary>
        /// How frequently should interim accounting be reported, 60-65535. default is 0 (use one specified in Access-Accept request from RADIUS Server). Very frequent messages can affect the performance of the radius server, 600 and up is recommended when enabled
        /// </summary>
        public readonly int AcctInterimInterval;
        /// <summary>
        /// List of RADIUS accounting servers, optional, order matters where the first one is treated as primary
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWlansSiteWlanAcctServerResult> AcctServers;
        /// <summary>
        /// Airwatch wlan settings
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanAirwatchResult Airwatch;
        /// <summary>
        /// Only applicable when limit_bcast==true, which allows or disallows ipv6 Neighbor Discovery packets to go through
        /// </summary>
        public readonly bool AllowIpv6Ndp;
        /// <summary>
        /// Only applicable when limit_bcast==true, which allows mDNS / Bonjour packets to go through
        /// </summary>
        public readonly bool AllowMdns;
        /// <summary>
        /// Only applicable when `limit_bcast`==`true`, which allows SSDP
        /// </summary>
        public readonly bool AllowSsdp;
        /// <summary>
        /// List of device ids
        /// </summary>
        public readonly ImmutableArray<string> ApIds;
        /// <summary>
        /// Bandwidth limiting for apps (applies to up/down)
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanAppLimitResult AppLimit;
        /// <summary>
        /// APp qos wlan settings
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanAppQosResult AppQos;
        /// <summary>
        /// enum: `aps`, `site`, `wxtags`
        /// </summary>
        public readonly string ApplyTo;
        /// <summary>
        /// Whether to enable smart arp filter
        /// </summary>
        public readonly bool ArpFilter;
        /// <summary>
        /// Authentication wlan settings
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanAuthResult Auth;
        /// <summary>
        /// When ordered, AP will prefer and go back to the first server if possible. enum: `ordered`, `unordered`
        /// </summary>
        public readonly string AuthServerSelection;
        /// <summary>
        /// List of RADIUS authentication servers, at least one is needed if `auth type`==`eap`, order matters where the first one is treated as primary
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWlansSiteWlanAuthServerResult> AuthServers;
        /// <summary>
        /// Optional, up to 48 bytes, will be dynamically generated if not provided. used only for authentication servers
        /// </summary>
        public readonly string AuthServersNasId;
        /// <summary>
        /// Optional, NAS-IP-ADDRESS to use
        /// </summary>
        public readonly string AuthServersNasIp;
        /// <summary>
        /// Radius auth session retries. Following fast timers are set if "fast_dot1x_timers" knob is enabled. ‘retries’  are set to value of auth_servers_retries. ‘max-requests’ is also set when setting auth_servers_retries and is set to default value to 3.
        /// </summary>
        public readonly int AuthServersRetries;
        /// <summary>
        /// Radius auth session timeout. Following fast timers are set if "fast_dot1x_timers" knob is enabled. ‘quite-period’  and ‘transmit-period’ are set to half the value of auth_servers_timeout. ‘supplicant-timeout’ is also set when setting auth_servers_timeout and is set to default value of 10.
        /// </summary>
        public readonly int AuthServersTimeout;
        /// <summary>
        /// Whether to enable band_steering, this works only when band==both
        /// </summary>
        public readonly bool BandSteer;
        /// <summary>
        /// Force dual_band capable client to connect to 5G
        /// </summary>
        public readonly bool BandSteerForceBand5;
        /// <summary>
        /// List of radios that the wlan should apply to.
        /// </summary>
        public readonly ImmutableArray<string> Bands;
        /// <summary>
        /// Whether to block the clients in the blacklist (up to first 256 macs)
        /// </summary>
        public readonly bool BlockBlacklistClients;
        /// <summary>
        /// Bonjour gateway wlan settings
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanBonjourResult Bonjour;
        /// <summary>
        /// Cisco CWA (central web authentication) required RADIUS with COA in order to work. See CWA: https://www.cisco.com/c/en/us/support/docs/security/identity-services-engine/115732-central-web-auth-00.html
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanCiscoCwaResult CiscoCwa;
        /// <summary>
        /// In kbps
        /// </summary>
        public readonly int ClientLimitDown;
        /// <summary>
        /// If downlink limiting per-client is enabled
        /// </summary>
        public readonly bool ClientLimitDownEnabled;
        /// <summary>
        /// In kbps
        /// </summary>
        public readonly int ClientLimitUp;
        /// <summary>
        /// If uplink limiting per-client is enabled
        /// </summary>
        public readonly bool ClientLimitUpEnabled;
        /// <summary>
        /// List of COA (change of authorization) servers, optional
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWlansSiteWlanCoaServerResult> CoaServers;
        /// <summary>
        /// When the object has been created, in epoch
        /// </summary>
        public readonly double CreatedTime;
        /// <summary>
        /// Some old WLAN drivers may not be compatible
        /// </summary>
        public readonly bool Disable11ax;
        /// <summary>
        /// To disable Wi-Fi 7 EHT IEs
        /// </summary>
        public readonly bool Disable11be;
        /// <summary>
        /// To disable ht or vht rates
        /// </summary>
        public readonly bool DisableHtVhtRates;
        /// <summary>
        /// Whether to disable U-APSD
        /// </summary>
        public readonly bool DisableUapsd;
        /// <summary>
        /// Disable sending v2 roam notification messages
        /// </summary>
        public readonly bool DisableV1RoamNotify;
        /// <summary>
        /// Disable sending v2 roam notification messages
        /// </summary>
        public readonly bool DisableV2RoamNotify;
        /// <summary>
        /// When any of the following is true, this WLAN will be disabled
        ///    * cannot get IP
        ///    * cannot obtain default gateway
        ///    * cannot reach default gateway
        /// </summary>
        public readonly bool DisableWhenGatewayUnreachable;
        public readonly bool DisableWhenMxtunnelDown;
        /// <summary>
        /// Whether to disable WMM
        /// </summary>
        public readonly bool DisableWmm;
        /// <summary>
        /// For radius_group-based DNS server (rewrite DNS request depending on the Group RADIUS server returns)
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanDnsServerRewriteResult DnsServerRewrite;
        public readonly int Dtim;
        /// <summary>
        /// For dynamic PSK where we get per_user PSK from Radius. dynamic_psk allows PSK to be selected at runtime depending on context (wlan/site/user/...) thus following configurations are assumed (currently)
        ///   * PSK will come from RADIUS server
        ///   * AP sends client MAC as username and password (i.e. `enable_mac_auth` is assumed)
        ///   * AP sends BSSID:SSID as Caller-Station-ID
        ///   * `auth_servers` is required
        ///   * PSK will come from cloud WLC if source is cloud_psks
        ///   * default_psk will be used if cloud WLC is not available
        ///   * `multi_psk_only` and `psk` is ignored
        ///   * `pairwise` can only be wpa2-ccmp (for now, wpa3 support on the roadmap)
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanDynamicPskResult DynamicPsk;
        /// <summary>
        /// For 802.1x
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanDynamicVlanResult DynamicVlan;
        /// <summary>
        /// Enable AP-AP keycaching via multicast
        /// </summary>
        public readonly bool EnableLocalKeycaching;
        /// <summary>
        /// By default, we'd inspect all DHCP packets and drop those unrelated to the wireless client itself in the case where client is a wireless bridge (DHCP packets for other MACs will need to be forwarded), wireless_bridging can be enabled
        /// </summary>
        public readonly bool EnableWirelessBridging;
        /// <summary>
        /// If the client bridge is doing DHCP on behalf of other devices (L2-NAT), enable dhcp_tracking will cut down DHCP response packets to be forwarded to wireless
        /// </summary>
        public readonly bool EnableWirelessBridgingDhcpTracking;
        /// <summary>
        /// If this wlan is enabled
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// If set to true, sets default fast-timers with values calculated from ‘auth_servers_timeout’ and ‘auth_server_retries’ .
        /// </summary>
        public readonly bool FastDot1xTimers;
        /// <summary>
        /// Whether to hide SSID in beacon
        /// </summary>
        public readonly bool HideSsid;
        /// <summary>
        /// Include hostname inside IE in AP beacons / probe responses
        /// </summary>
        public readonly bool HostnameIe;
        /// <summary>
        /// Hostspot 2.0 wlan settings
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanHotspot20Result Hotspot20;
        /// <summary>
        /// Unique ID of the object instance in the Mist Organization
        /// </summary>
        public readonly string Id;
        public readonly Outputs.GetWlansSiteWlanInjectDhcpOption82Result InjectDhcpOption82;
        /// <summary>
        /// where this WLAN will be connected to. enum: `all`, `eth0`, `eth1`, `eth2`, `eth3`, `mxtunnel`, `site_mxedge`, `wxtunnel`
        /// </summary>
        public readonly string Interface;
        /// <summary>
        /// Whether to stop clients to talk to each other
        /// </summary>
        public readonly bool Isolation;
        /// <summary>
        /// If isolation is enabled, whether to deny clients to talk to L2 on the LAN
        /// </summary>
        public readonly bool L2Isolation;
        /// <summary>
        /// Legacy devices requires the Over-DS (for Fast BSS Transition) bit set (while our chip doesn’t support it). Warning! Enabling this will cause problem for iOS devices.
        /// </summary>
        public readonly bool LegacyOverds;
        /// <summary>
        /// Whether to limit broadcast packets going to wireless (i.e. only allow certain bcast packets to go through)
        /// </summary>
        public readonly bool LimitBcast;
        /// <summary>
        /// Limit probe response base on some heuristic rules
        /// </summary>
        public readonly bool LimitProbeResponse;
        /// <summary>
        /// Max idle time in seconds
        /// </summary>
        public readonly int MaxIdletime;
        /// <summary>
        /// Maximum number of client connected to the SSID. `0` means unlimited
        /// </summary>
        public readonly int MaxNumClients;
        public readonly Outputs.GetWlansSiteWlanMistNacResult MistNac;
        /// <summary>
        /// When the object has been modified for the last time, in epoch
        /// </summary>
        public readonly double ModifiedTime;
        public readonly string MspId;
        /// <summary>
        /// When `interface`=`mxtunnel`, id of the Mist Tunnel
        /// </summary>
        public readonly ImmutableArray<string> MxtunnelIds;
        /// <summary>
        /// When `interface`=`site_mxedge`, name of the mxtunnel that in mxtunnels under Site Setting
        /// </summary>
        public readonly ImmutableArray<string> MxtunnelNames;
        /// <summary>
        /// Whether to only allow client to use DNS that we’ve learned from DHCP response
        /// </summary>
        public readonly bool NoStaticDns;
        /// <summary>
        /// Whether to only allow client that we’ve learned from DHCP exchange to talk
        /// </summary>
        public readonly bool NoStaticIp;
        public readonly string OrgId;
        /// <summary>
        /// Portal wlan settings
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanPortalResult Portal;
        /// <summary>
        /// List of hostnames without http(s):// (matched by substring)
        /// </summary>
        public readonly ImmutableArray<string> PortalAllowedHostnames;
        /// <summary>
        /// List of CIDRs
        /// </summary>
        public readonly ImmutableArray<string> PortalAllowedSubnets;
        /// <summary>
        /// APi secret (auto-generated) that can be used to sign guest authorization requests
        /// </summary>
        public readonly string PortalApiSecret;
        /// <summary>
        /// List of hostnames without http(s):// (matched by substring), this takes precedence over portal_allowed_hostnames
        /// </summary>
        public readonly ImmutableArray<string> PortalDeniedHostnames;
        /// <summary>
        /// Url of portal background image
        /// </summary>
        public readonly string PortalImage;
        public readonly string PortalSsoUrl;
        public readonly Outputs.GetWlansSiteWlanQosResult Qos;
        /// <summary>
        /// RadSec settings
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanRadsecResult Radsec;
        /// <summary>
        /// Property key is the RF band. enum: `24`, `5`, `6`
        /// </summary>
        public readonly ImmutableDictionary<string, Outputs.GetWlansSiteWlanRatesetResult> Rateset;
        /// <summary>
        /// When different mxcluster is on different subnet, we'd want to disconnect clients (so they'll reconnect and get new IPs)
        /// </summary>
        public readonly bool ReconnectClientsWhenRoamingMxcluster;
        /// <summary>
        /// enum: `11r`, `OKC`, `NONE`
        /// </summary>
        public readonly string RoamMode;
        /// <summary>
        /// WLAN operating schedule, default is disabled
        /// </summary>
        public readonly Outputs.GetWlansSiteWlanScheduleResult Schedule;
        public readonly string SiteId;
        /// <summary>
        /// Whether to exclude this WLAN from SLE metrics
        /// </summary>
        public readonly bool SleExcluded;
        /// <summary>
        /// Name of the SSID
        /// </summary>
        public readonly string Ssid;
        /// <summary>
        /// If `auth.type`==`eap` or `auth.type`==`psk`, should only be set for legacy client, such as pre-2004, 802.11b devices
        /// </summary>
        public readonly bool UseEapolV1;
        /// <summary>
        /// If vlan tagging is enabled
        /// </summary>
        public readonly bool VlanEnabled;
        public readonly string VlanId;
        /// <summary>
        /// if `vlan_enabled`==`true` and `vlan_pooling`==`true`. List of VLAN IDs (comma separated) to be used in the VLAN Pool
        /// </summary>
        public readonly ImmutableArray<string> VlanIds;
        /// <summary>
        /// Requires `vlan_enabled`==`true` to be set to `true`. Vlan pooling allows AP to place client on different VLAN using a deterministic algorithm
        /// </summary>
        public readonly bool VlanPooling;
        /// <summary>
        /// In kbps
        /// </summary>
        public readonly int WlanLimitDown;
        /// <summary>
        /// If downlink limiting for whole wlan is enabled
        /// </summary>
        public readonly bool WlanLimitDownEnabled;
        /// <summary>
        /// In kbps
        /// </summary>
        public readonly int WlanLimitUp;
        /// <summary>
        /// If uplink limiting for whole wlan is enabled
        /// </summary>
        public readonly bool WlanLimitUpEnabled;
        /// <summary>
        /// List of wxtag_ids
        /// </summary>
        public readonly ImmutableArray<string> WxtagIds;
        /// <summary>
        /// When `interface`=`wxtunnel`, id of the WXLAN Tunnel
        /// </summary>
        public readonly string WxtunnelId;
        /// <summary>
        /// When `interface`=`wxtunnel`, remote tunnel identifier
        /// </summary>
        public readonly string WxtunnelRemoteId;

        [OutputConstructor]
        private GetWlansSiteWlanResult(
            bool acctImmediateUpdate,

            int acctInterimInterval,

            ImmutableArray<Outputs.GetWlansSiteWlanAcctServerResult> acctServers,

            Outputs.GetWlansSiteWlanAirwatchResult airwatch,

            bool allowIpv6Ndp,

            bool allowMdns,

            bool allowSsdp,

            ImmutableArray<string> apIds,

            Outputs.GetWlansSiteWlanAppLimitResult appLimit,

            Outputs.GetWlansSiteWlanAppQosResult appQos,

            string applyTo,

            bool arpFilter,

            Outputs.GetWlansSiteWlanAuthResult auth,

            string authServerSelection,

            ImmutableArray<Outputs.GetWlansSiteWlanAuthServerResult> authServers,

            string authServersNasId,

            string authServersNasIp,

            int authServersRetries,

            int authServersTimeout,

            bool bandSteer,

            bool bandSteerForceBand5,

            ImmutableArray<string> bands,

            bool blockBlacklistClients,

            Outputs.GetWlansSiteWlanBonjourResult bonjour,

            Outputs.GetWlansSiteWlanCiscoCwaResult ciscoCwa,

            int clientLimitDown,

            bool clientLimitDownEnabled,

            int clientLimitUp,

            bool clientLimitUpEnabled,

            ImmutableArray<Outputs.GetWlansSiteWlanCoaServerResult> coaServers,

            double createdTime,

            bool disable11ax,

            bool disable11be,

            bool disableHtVhtRates,

            bool disableUapsd,

            bool disableV1RoamNotify,

            bool disableV2RoamNotify,

            bool disableWhenGatewayUnreachable,

            bool disableWhenMxtunnelDown,

            bool disableWmm,

            Outputs.GetWlansSiteWlanDnsServerRewriteResult dnsServerRewrite,

            int dtim,

            Outputs.GetWlansSiteWlanDynamicPskResult dynamicPsk,

            Outputs.GetWlansSiteWlanDynamicVlanResult dynamicVlan,

            bool enableLocalKeycaching,

            bool enableWirelessBridging,

            bool enableWirelessBridgingDhcpTracking,

            bool enabled,

            bool fastDot1xTimers,

            bool hideSsid,

            bool hostnameIe,

            Outputs.GetWlansSiteWlanHotspot20Result hotspot20,

            string id,

            Outputs.GetWlansSiteWlanInjectDhcpOption82Result injectDhcpOption82,

            string @interface,

            bool isolation,

            bool l2Isolation,

            bool legacyOverds,

            bool limitBcast,

            bool limitProbeResponse,

            int maxIdletime,

            int maxNumClients,

            Outputs.GetWlansSiteWlanMistNacResult mistNac,

            double modifiedTime,

            string mspId,

            ImmutableArray<string> mxtunnelIds,

            ImmutableArray<string> mxtunnelNames,

            bool noStaticDns,

            bool noStaticIp,

            string orgId,

            Outputs.GetWlansSiteWlanPortalResult portal,

            ImmutableArray<string> portalAllowedHostnames,

            ImmutableArray<string> portalAllowedSubnets,

            string portalApiSecret,

            ImmutableArray<string> portalDeniedHostnames,

            string portalImage,

            string portalSsoUrl,

            Outputs.GetWlansSiteWlanQosResult qos,

            Outputs.GetWlansSiteWlanRadsecResult radsec,

            ImmutableDictionary<string, Outputs.GetWlansSiteWlanRatesetResult> rateset,

            bool reconnectClientsWhenRoamingMxcluster,

            string roamMode,

            Outputs.GetWlansSiteWlanScheduleResult schedule,

            string siteId,

            bool sleExcluded,

            string ssid,

            bool useEapolV1,

            bool vlanEnabled,

            string vlanId,

            ImmutableArray<string> vlanIds,

            bool vlanPooling,

            int wlanLimitDown,

            bool wlanLimitDownEnabled,

            int wlanLimitUp,

            bool wlanLimitUpEnabled,

            ImmutableArray<string> wxtagIds,

            string wxtunnelId,

            string wxtunnelRemoteId)
        {
            AcctImmediateUpdate = acctImmediateUpdate;
            AcctInterimInterval = acctInterimInterval;
            AcctServers = acctServers;
            Airwatch = airwatch;
            AllowIpv6Ndp = allowIpv6Ndp;
            AllowMdns = allowMdns;
            AllowSsdp = allowSsdp;
            ApIds = apIds;
            AppLimit = appLimit;
            AppQos = appQos;
            ApplyTo = applyTo;
            ArpFilter = arpFilter;
            Auth = auth;
            AuthServerSelection = authServerSelection;
            AuthServers = authServers;
            AuthServersNasId = authServersNasId;
            AuthServersNasIp = authServersNasIp;
            AuthServersRetries = authServersRetries;
            AuthServersTimeout = authServersTimeout;
            BandSteer = bandSteer;
            BandSteerForceBand5 = bandSteerForceBand5;
            Bands = bands;
            BlockBlacklistClients = blockBlacklistClients;
            Bonjour = bonjour;
            CiscoCwa = ciscoCwa;
            ClientLimitDown = clientLimitDown;
            ClientLimitDownEnabled = clientLimitDownEnabled;
            ClientLimitUp = clientLimitUp;
            ClientLimitUpEnabled = clientLimitUpEnabled;
            CoaServers = coaServers;
            CreatedTime = createdTime;
            Disable11ax = disable11ax;
            Disable11be = disable11be;
            DisableHtVhtRates = disableHtVhtRates;
            DisableUapsd = disableUapsd;
            DisableV1RoamNotify = disableV1RoamNotify;
            DisableV2RoamNotify = disableV2RoamNotify;
            DisableWhenGatewayUnreachable = disableWhenGatewayUnreachable;
            DisableWhenMxtunnelDown = disableWhenMxtunnelDown;
            DisableWmm = disableWmm;
            DnsServerRewrite = dnsServerRewrite;
            Dtim = dtim;
            DynamicPsk = dynamicPsk;
            DynamicVlan = dynamicVlan;
            EnableLocalKeycaching = enableLocalKeycaching;
            EnableWirelessBridging = enableWirelessBridging;
            EnableWirelessBridgingDhcpTracking = enableWirelessBridgingDhcpTracking;
            Enabled = enabled;
            FastDot1xTimers = fastDot1xTimers;
            HideSsid = hideSsid;
            HostnameIe = hostnameIe;
            Hotspot20 = hotspot20;
            Id = id;
            InjectDhcpOption82 = injectDhcpOption82;
            Interface = @interface;
            Isolation = isolation;
            L2Isolation = l2Isolation;
            LegacyOverds = legacyOverds;
            LimitBcast = limitBcast;
            LimitProbeResponse = limitProbeResponse;
            MaxIdletime = maxIdletime;
            MaxNumClients = maxNumClients;
            MistNac = mistNac;
            ModifiedTime = modifiedTime;
            MspId = mspId;
            MxtunnelIds = mxtunnelIds;
            MxtunnelNames = mxtunnelNames;
            NoStaticDns = noStaticDns;
            NoStaticIp = noStaticIp;
            OrgId = orgId;
            Portal = portal;
            PortalAllowedHostnames = portalAllowedHostnames;
            PortalAllowedSubnets = portalAllowedSubnets;
            PortalApiSecret = portalApiSecret;
            PortalDeniedHostnames = portalDeniedHostnames;
            PortalImage = portalImage;
            PortalSsoUrl = portalSsoUrl;
            Qos = qos;
            Radsec = radsec;
            Rateset = rateset;
            ReconnectClientsWhenRoamingMxcluster = reconnectClientsWhenRoamingMxcluster;
            RoamMode = roamMode;
            Schedule = schedule;
            SiteId = siteId;
            SleExcluded = sleExcluded;
            Ssid = ssid;
            UseEapolV1 = useEapolV1;
            VlanEnabled = vlanEnabled;
            VlanId = vlanId;
            VlanIds = vlanIds;
            VlanPooling = vlanPooling;
            WlanLimitDown = wlanLimitDown;
            WlanLimitDownEnabled = wlanLimitDownEnabled;
            WlanLimitUp = wlanLimitUp;
            WlanLimitUpEnabled = wlanLimitUpEnabled;
            WxtagIds = wxtagIds;
            WxtunnelId = wxtunnelId;
            WxtunnelRemoteId = wxtunnelRemoteId;
        }
    }
}
