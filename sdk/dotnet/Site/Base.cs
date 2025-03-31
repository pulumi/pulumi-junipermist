// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site
{
    /// <summary>
    /// This resource manages the Site basic information.
    /// 
    /// This resource can be used to assign templates to a site, or to change basic information (e.g. Site Address)
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
    ///     var juniperFrance = new JuniperMist.Site.Base("juniper_france", new()
    ///     {
    ///         OrgId = terraformTest.Id,
    ///         Name = "JNP-FR-PAR",
    ///         CountryCode = "FR",
    ///         Timezone = "Europe/Paris",
    ///         Address = "41 Rue de Villiers, 92100 Neuilly sur Seine, France",
    ///         Notes = "Created with Terraform, Updated with Terraform",
    ///         Latlng = new JuniperMist.Site.Inputs.BaseLatlngArgs
    ///         {
    ///             Lat = 48.899268,
    ///             Lng = 2.214447,
    ///         },
    ///         SitegroupIds = new[]
    ///         {
    ///             testGroup.Id,
    ///             testGroup2.Id,
    ///         },
    ///         NetworktemplateId = networktemplateOne.Id,
    ///         RftemplateId = rftemplateOne.Id,
    ///         GatewaytemplateId = gatewaytemplateOne.Id,
    ///         AlarmtemplateId = alarmtemplateOne.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_site` with:
    /// 
    /// Site can be imported by specifying the site_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:site/base:base site_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:site/base:base")]
    public partial class Base : global::Pulumi.CustomResource
    {
        /// <summary>
        /// full address of the site
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        /// </summary>
        [Output("alarmtemplateId")]
        public Output<string?> AlarmtemplateId { get; private set; } = null!;

        /// <summary>
        /// AP Template ID, used by APs
        /// </summary>
        [Output("aptemplateId")]
        public Output<string?> AptemplateId { get; private set; } = null!;

        /// <summary>
        /// Country code for the site (for AP config generation), in two-character
        /// </summary>
        [Output("countryCode")]
        public Output<string?> CountryCode { get; private set; } = null!;

        /// <summary>
        /// Gateway Template ID, used by gateways
        /// </summary>
        [Output("gatewaytemplateId")]
        public Output<string?> GatewaytemplateId { get; private set; } = null!;

        [Output("latlng")]
        public Output<Outputs.BaseLatlng?> Latlng { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Network Template ID, this takes precedence over Site Settings
        /// </summary>
        [Output("networktemplateId")]
        public Output<string?> NetworktemplateId { get; private set; } = null!;

        /// <summary>
        /// Optional, any notes about the site
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// RF Template ID, this takes precedence over Site Settings
        /// </summary>
        [Output("rftemplateId")]
        public Output<string?> RftemplateId { get; private set; } = null!;

        /// <summary>
        /// SecPolicy ID
        /// </summary>
        [Output("secpolicyId")]
        public Output<string?> SecpolicyId { get; private set; } = null!;

        /// <summary>
        /// Sitegroups this site belongs to
        /// </summary>
        [Output("sitegroupIds")]
        public Output<ImmutableArray<string>> SitegroupIds { get; private set; } = null!;

        /// <summary>
        /// Site Template ID
        /// </summary>
        [Output("sitetemplateId")]
        public Output<string?> SitetemplateId { get; private set; } = null!;

        /// <summary>
        /// Timezone the site is at
        /// </summary>
        [Output("timezone")]
        public Output<string> Timezone { get; private set; } = null!;

        [Output("tzoffset")]
        public Output<int> Tzoffset { get; private set; } = null!;


        /// <summary>
        /// Create a Base resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Base(string name, BaseArgs args, CustomResourceOptions? options = null)
            : base("junipermist:site/base:base", name, args ?? new BaseArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Base(string name, Input<string> id, BaseState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:site/base:base", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "junipermist:device/base:base" },
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Base resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Base Get(string name, Input<string> id, BaseState? state = null, CustomResourceOptions? options = null)
        {
            return new Base(name, id, state, options);
        }
    }

    public sealed class BaseArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// full address of the site
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        /// </summary>
        [Input("alarmtemplateId")]
        public Input<string>? AlarmtemplateId { get; set; }

        /// <summary>
        /// AP Template ID, used by APs
        /// </summary>
        [Input("aptemplateId")]
        public Input<string>? AptemplateId { get; set; }

        /// <summary>
        /// Country code for the site (for AP config generation), in two-character
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        /// <summary>
        /// Gateway Template ID, used by gateways
        /// </summary>
        [Input("gatewaytemplateId")]
        public Input<string>? GatewaytemplateId { get; set; }

        [Input("latlng")]
        public Input<Inputs.BaseLatlngArgs>? Latlng { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network Template ID, this takes precedence over Site Settings
        /// </summary>
        [Input("networktemplateId")]
        public Input<string>? NetworktemplateId { get; set; }

        /// <summary>
        /// Optional, any notes about the site
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// RF Template ID, this takes precedence over Site Settings
        /// </summary>
        [Input("rftemplateId")]
        public Input<string>? RftemplateId { get; set; }

        /// <summary>
        /// SecPolicy ID
        /// </summary>
        [Input("secpolicyId")]
        public Input<string>? SecpolicyId { get; set; }

        [Input("sitegroupIds")]
        private InputList<string>? _sitegroupIds;

        /// <summary>
        /// Sitegroups this site belongs to
        /// </summary>
        public InputList<string> SitegroupIds
        {
            get => _sitegroupIds ?? (_sitegroupIds = new InputList<string>());
            set => _sitegroupIds = value;
        }

        /// <summary>
        /// Site Template ID
        /// </summary>
        [Input("sitetemplateId")]
        public Input<string>? SitetemplateId { get; set; }

        /// <summary>
        /// Timezone the site is at
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        public BaseArgs()
        {
        }
        public static new BaseArgs Empty => new BaseArgs();
    }

    public sealed class BaseState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// full address of the site
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// Alarm Template ID, this takes precedence over the Org-level alarmtemplate_id
        /// </summary>
        [Input("alarmtemplateId")]
        public Input<string>? AlarmtemplateId { get; set; }

        /// <summary>
        /// AP Template ID, used by APs
        /// </summary>
        [Input("aptemplateId")]
        public Input<string>? AptemplateId { get; set; }

        /// <summary>
        /// Country code for the site (for AP config generation), in two-character
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        /// <summary>
        /// Gateway Template ID, used by gateways
        /// </summary>
        [Input("gatewaytemplateId")]
        public Input<string>? GatewaytemplateId { get; set; }

        [Input("latlng")]
        public Input<Inputs.BaseLatlngGetArgs>? Latlng { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Network Template ID, this takes precedence over Site Settings
        /// </summary>
        [Input("networktemplateId")]
        public Input<string>? NetworktemplateId { get; set; }

        /// <summary>
        /// Optional, any notes about the site
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// RF Template ID, this takes precedence over Site Settings
        /// </summary>
        [Input("rftemplateId")]
        public Input<string>? RftemplateId { get; set; }

        /// <summary>
        /// SecPolicy ID
        /// </summary>
        [Input("secpolicyId")]
        public Input<string>? SecpolicyId { get; set; }

        [Input("sitegroupIds")]
        private InputList<string>? _sitegroupIds;

        /// <summary>
        /// Sitegroups this site belongs to
        /// </summary>
        public InputList<string> SitegroupIds
        {
            get => _sitegroupIds ?? (_sitegroupIds = new InputList<string>());
            set => _sitegroupIds = value;
        }

        /// <summary>
        /// Site Template ID
        /// </summary>
        [Input("sitetemplateId")]
        public Input<string>? SitetemplateId { get; set; }

        /// <summary>
        /// Timezone the site is at
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("tzoffset")]
        public Input<int>? Tzoffset { get; set; }

        public BaseState()
        {
        }
        public static new BaseState Empty => new BaseState();
    }
}
