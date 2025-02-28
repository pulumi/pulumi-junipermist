// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages NAC Tags (Auth Policy Labels).
    /// 
    /// The NAC Tags can be used in the NAC Rules to define the matching criterias or the returned RADIUS Attributes
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using JuniperMist = Pulumi.JuniperMist;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var tagOne = new JuniperMist.Org.Nactag("tag_one", new()
    ///     {
    ///         Name = "tag_one",
    ///         Type = "match",
    ///         Match = "client_mac",
    ///         OrgId = terraformTest.Id,
    ///         Values = new[]
    ///         {
    ///             "5c5b35*",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_nactag` with:
    /// 
    /// NAC Tag can be imported by specifying the org_id and the nactag_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/nactag:Nactag nactag_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/nactag:Nactag")]
    public partial class Nactag : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Can be set to true to allow the override by usermac result
        /// </summary>
        [Output("allowUsermacOverride")]
        public Output<bool> AllowUsermacOverride { get; private set; } = null!;

        /// <summary>
        /// If `type`==`egress_vlan_names`, list of egress vlans to return
        /// </summary>
        [Output("egressVlanNames")]
        public Output<ImmutableArray<string>> EgressVlanNames { get; private set; } = null!;

        /// <summary>
        /// If `type`==`gbp_tag`
        /// </summary>
        [Output("gbpTag")]
        public Output<int?> GbpTag { get; private set; } = null!;

        /// <summary>
        /// if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`,
        /// `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`,
        /// `usermac_label`
        /// </summary>
        [Output("match")]
        public Output<string?> Match { get; private set; } = null!;

        /// <summary>
        /// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
        /// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
        /// set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
        /// </summary>
        [Output("matchAll")]
        public Output<bool> MatchAll { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field "radius_attrs". It is
        /// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
        /// that it is allowed to have more than one radius_attrs in the result of a given rule.
        /// </summary>
        [Output("radiusAttrs")]
        public Output<ImmutableArray<string>> RadiusAttrs { get; private set; } = null!;

        /// <summary>
        /// If `type`==`radius_group`
        /// </summary>
        [Output("radiusGroup")]
        public Output<string?> RadiusGroup { get; private set; } = null!;

        /// <summary>
        /// If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
        /// "radius_vendor_attrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
        /// not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
        /// </summary>
        [Output("radiusVendorAttrs")]
        public Output<ImmutableArray<string>> RadiusVendorAttrs { get; private set; } = null!;

        /// <summary>
        /// If `type`==`session_timeout, in seconds
        /// </summary>
        [Output("sessionTimeout")]
        public Output<int?> SessionTimeout { get; private set; } = null!;

        /// <summary>
        /// enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
        /// `username_attr`, `vlan`
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// enum: `automatic`, `cn`, `dns`, `email`, `upn`
        /// </summary>
        [Output("usernameAttr")]
        public Output<string?> UsernameAttr { get; private set; } = null!;

        /// <summary>
        /// If `type`==`match`
        /// </summary>
        [Output("values")]
        public Output<ImmutableArray<string>> Values { get; private set; } = null!;

        /// <summary>
        /// If `type`==`vlan`
        /// </summary>
        [Output("vlan")]
        public Output<string?> Vlan { get; private set; } = null!;


        /// <summary>
        /// Create a Nactag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Nactag(string name, NactagArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/nactag:Nactag", name, args ?? new NactagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Nactag(string name, Input<string> id, NactagState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/nactag:Nactag", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Nactag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Nactag Get(string name, Input<string> id, NactagState? state = null, CustomResourceOptions? options = null)
        {
            return new Nactag(name, id, state, options);
        }
    }

    public sealed class NactagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can be set to true to allow the override by usermac result
        /// </summary>
        [Input("allowUsermacOverride")]
        public Input<bool>? AllowUsermacOverride { get; set; }

        [Input("egressVlanNames")]
        private InputList<string>? _egressVlanNames;

        /// <summary>
        /// If `type`==`egress_vlan_names`, list of egress vlans to return
        /// </summary>
        public InputList<string> EgressVlanNames
        {
            get => _egressVlanNames ?? (_egressVlanNames = new InputList<string>());
            set => _egressVlanNames = value;
        }

        /// <summary>
        /// If `type`==`gbp_tag`
        /// </summary>
        [Input("gbpTag")]
        public Input<int>? GbpTag { get; set; }

        /// <summary>
        /// if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`,
        /// `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`,
        /// `usermac_label`
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
        /// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
        /// set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
        /// </summary>
        [Input("matchAll")]
        public Input<bool>? MatchAll { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("radiusAttrs")]
        private InputList<string>? _radiusAttrs;

        /// <summary>
        /// If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field "radius_attrs". It is
        /// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
        /// that it is allowed to have more than one radius_attrs in the result of a given rule.
        /// </summary>
        public InputList<string> RadiusAttrs
        {
            get => _radiusAttrs ?? (_radiusAttrs = new InputList<string>());
            set => _radiusAttrs = value;
        }

        /// <summary>
        /// If `type`==`radius_group`
        /// </summary>
        [Input("radiusGroup")]
        public Input<string>? RadiusGroup { get; set; }

        [Input("radiusVendorAttrs")]
        private InputList<string>? _radiusVendorAttrs;

        /// <summary>
        /// If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
        /// "radius_vendor_attrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
        /// not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
        /// </summary>
        public InputList<string> RadiusVendorAttrs
        {
            get => _radiusVendorAttrs ?? (_radiusVendorAttrs = new InputList<string>());
            set => _radiusVendorAttrs = value;
        }

        /// <summary>
        /// If `type`==`session_timeout, in seconds
        /// </summary>
        [Input("sessionTimeout")]
        public Input<int>? SessionTimeout { get; set; }

        /// <summary>
        /// enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
        /// `username_attr`, `vlan`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// enum: `automatic`, `cn`, `dns`, `email`, `upn`
        /// </summary>
        [Input("usernameAttr")]
        public Input<string>? UsernameAttr { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// If `type`==`match`
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        /// <summary>
        /// If `type`==`vlan`
        /// </summary>
        [Input("vlan")]
        public Input<string>? Vlan { get; set; }

        public NactagArgs()
        {
        }
        public static new NactagArgs Empty => new NactagArgs();
    }

    public sealed class NactagState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Can be set to true to allow the override by usermac result
        /// </summary>
        [Input("allowUsermacOverride")]
        public Input<bool>? AllowUsermacOverride { get; set; }

        [Input("egressVlanNames")]
        private InputList<string>? _egressVlanNames;

        /// <summary>
        /// If `type`==`egress_vlan_names`, list of egress vlans to return
        /// </summary>
        public InputList<string> EgressVlanNames
        {
            get => _egressVlanNames ?? (_egressVlanNames = new InputList<string>());
            set => _egressVlanNames = value;
        }

        /// <summary>
        /// If `type`==`gbp_tag`
        /// </summary>
        [Input("gbpTag")]
        public Input<int>? GbpTag { get; set; }

        /// <summary>
        /// if `type`==`match`. enum: `cert_cn`, `cert_issuer`, `cert_san`, `cert_serial`, `cert_sub`, `cert_template`,
        /// `client_mac`, `idp_role`, `ingress_vlan`, `mdm_status`, `nas_ip`, `radius_group`, `realm`, `ssid`, `user_name`,
        /// `usermac_label`
        /// </summary>
        [Input("match")]
        public Input<string>? Match { get; set; }

        /// <summary>
        /// This field is applicable only when `type`==`match` * `false`: means it is sufficient to match any of the values (i.e.,
        /// match-any behavior) * `true`: means all values should be matched (i.e., match-all behavior) Currently it makes sense to
        /// set this field to `true` only if the `match`==`idp_role` or `match`==`usermac_label`
        /// </summary>
        [Input("matchAll")]
        public Input<bool>? MatchAll { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("radiusAttrs")]
        private InputList<string>? _radiusAttrs;

        /// <summary>
        /// If `type`==`radius_attrs`, user can specify a list of one or more standard attributes in the field "radius_attrs". It is
        /// the responsibility of the user to provide a syntactically correct string, otherwise it may not work as expected. Note
        /// that it is allowed to have more than one radius_attrs in the result of a given rule.
        /// </summary>
        public InputList<string> RadiusAttrs
        {
            get => _radiusAttrs ?? (_radiusAttrs = new InputList<string>());
            set => _radiusAttrs = value;
        }

        /// <summary>
        /// If `type`==`radius_group`
        /// </summary>
        [Input("radiusGroup")]
        public Input<string>? RadiusGroup { get; set; }

        [Input("radiusVendorAttrs")]
        private InputList<string>? _radiusVendorAttrs;

        /// <summary>
        /// If `type`==`radius_vendor_attrs`, user can specify a list of one or more vendor-specific attributes in the field
        /// "radius_vendor_attrs". It is the responsibility of the user to provide a syntactically correct string, otherwise it may
        /// not work as expected. Note that it is allowed to have more than one radius_vendor_attrs in the result of a given rule.
        /// </summary>
        public InputList<string> RadiusVendorAttrs
        {
            get => _radiusVendorAttrs ?? (_radiusVendorAttrs = new InputList<string>());
            set => _radiusVendorAttrs = value;
        }

        /// <summary>
        /// If `type`==`session_timeout, in seconds
        /// </summary>
        [Input("sessionTimeout")]
        public Input<int>? SessionTimeout { get; set; }

        /// <summary>
        /// enum: `egress_vlan_names`, `gbp_tag`, `match`, `radius_attrs`, `radius_group`, `radius_vendor_attrs`, `session_timeout`,
        /// `username_attr`, `vlan`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// enum: `automatic`, `cn`, `dns`, `email`, `upn`
        /// </summary>
        [Input("usernameAttr")]
        public Input<string>? UsernameAttr { get; set; }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// If `type`==`match`
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        /// <summary>
        /// If `type`==`vlan`
        /// </summary>
        [Input("vlan")]
        public Input<string>? Vlan { get; set; }

        public NactagState()
        {
        }
        public static new NactagState Empty => new NactagState();
    }
}
