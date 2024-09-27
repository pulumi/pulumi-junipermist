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
    /// This manages the RF Templates.
    /// The RF Templates can be used to define Wireless Access Points radio configuration, and can be assigned to the sites
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_rftemplate` with:
    /// 
    /// Org RF Template can be imported by specifying the org_id and the rftemplate_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/rftemplate:Rftemplate rftemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/rftemplate:Rftemplate")]
    public partial class Rftemplate : global::Pulumi.CustomResource
    {
        [Output("antGain24")]
        public Output<int> AntGain24 { get; private set; } = null!;

        [Output("antGain5")]
        public Output<int> AntGain5 { get; private set; } = null!;

        [Output("antGain6")]
        public Output<int> AntGain6 { get; private set; } = null!;

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Output("band24")]
        public Output<Outputs.RftemplateBand24?> Band24 { get; private set; } = null!;

        /// <summary>
        /// enum: `24`, `5`, `6`, `auto`
        /// </summary>
        [Output("band24Usage")]
        public Output<string?> Band24Usage { get; private set; } = null!;

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Output("band5")]
        public Output<Outputs.RftemplateBand5?> Band5 { get; private set; } = null!;

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Output("band5On24Radio")]
        public Output<Outputs.RftemplateBand5On24Radio?> Band5On24Radio { get; private set; } = null!;

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Output("band6")]
        public Output<Outputs.RftemplateBand6?> Band6 { get; private set; } = null!;

        /// <summary>
        /// optional, country code to use. If specified, this gets applied to all sites using the RF Template
        /// </summary>
        [Output("countryCode")]
        public Output<string?> CountryCode { get; private set; } = null!;

        /// <summary>
        /// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        /// </summary>
        [Output("modelSpecific")]
        public Output<ImmutableDictionary<string, Outputs.RftemplateModelSpecific>?> ModelSpecific { get; private set; } = null!;

        /// <summary>
        /// The name of the RF template
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// whether scanning radio is enabled
        /// </summary>
        [Output("scanningEnabled")]
        public Output<bool?> ScanningEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a Rftemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Rftemplate(string name, RftemplateArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/rftemplate:Rftemplate", name, args ?? new RftemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Rftemplate(string name, Input<string> id, RftemplateState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/rftemplate:Rftemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Rftemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Rftemplate Get(string name, Input<string> id, RftemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new Rftemplate(name, id, state, options);
        }
    }

    public sealed class RftemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("antGain24")]
        public Input<int>? AntGain24 { get; set; }

        [Input("antGain5")]
        public Input<int>? AntGain5 { get; set; }

        [Input("antGain6")]
        public Input<int>? AntGain6 { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band24")]
        public Input<Inputs.RftemplateBand24Args>? Band24 { get; set; }

        /// <summary>
        /// enum: `24`, `5`, `6`, `auto`
        /// </summary>
        [Input("band24Usage")]
        public Input<string>? Band24Usage { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band5")]
        public Input<Inputs.RftemplateBand5Args>? Band5 { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band5On24Radio")]
        public Input<Inputs.RftemplateBand5On24RadioArgs>? Band5On24Radio { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band6")]
        public Input<Inputs.RftemplateBand6Args>? Band6 { get; set; }

        /// <summary>
        /// optional, country code to use. If specified, this gets applied to all sites using the RF Template
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        [Input("modelSpecific")]
        private InputMap<Inputs.RftemplateModelSpecificArgs>? _modelSpecific;

        /// <summary>
        /// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        /// </summary>
        public InputMap<Inputs.RftemplateModelSpecificArgs> ModelSpecific
        {
            get => _modelSpecific ?? (_modelSpecific = new InputMap<Inputs.RftemplateModelSpecificArgs>());
            set => _modelSpecific = value;
        }

        /// <summary>
        /// The name of the RF template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// whether scanning radio is enabled
        /// </summary>
        [Input("scanningEnabled")]
        public Input<bool>? ScanningEnabled { get; set; }

        public RftemplateArgs()
        {
        }
        public static new RftemplateArgs Empty => new RftemplateArgs();
    }

    public sealed class RftemplateState : global::Pulumi.ResourceArgs
    {
        [Input("antGain24")]
        public Input<int>? AntGain24 { get; set; }

        [Input("antGain5")]
        public Input<int>? AntGain5 { get; set; }

        [Input("antGain6")]
        public Input<int>? AntGain6 { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band24")]
        public Input<Inputs.RftemplateBand24GetArgs>? Band24 { get; set; }

        /// <summary>
        /// enum: `24`, `5`, `6`, `auto`
        /// </summary>
        [Input("band24Usage")]
        public Input<string>? Band24Usage { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band5")]
        public Input<Inputs.RftemplateBand5GetArgs>? Band5 { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band5On24Radio")]
        public Input<Inputs.RftemplateBand5On24RadioGetArgs>? Band5On24Radio { get; set; }

        /// <summary>
        /// Radio Band AP settings
        /// </summary>
        [Input("band6")]
        public Input<Inputs.RftemplateBand6GetArgs>? Band6 { get; set; }

        /// <summary>
        /// optional, country code to use. If specified, this gets applied to all sites using the RF Template
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        [Input("modelSpecific")]
        private InputMap<Inputs.RftemplateModelSpecificGetArgs>? _modelSpecific;

        /// <summary>
        /// overwrites for a specific model. If a band is specified, it will shadow the default. Property key is the model name (e.g. "AP63")
        /// </summary>
        public InputMap<Inputs.RftemplateModelSpecificGetArgs> ModelSpecific
        {
            get => _modelSpecific ?? (_modelSpecific = new InputMap<Inputs.RftemplateModelSpecificGetArgs>());
            set => _modelSpecific = value;
        }

        /// <summary>
        /// The name of the RF template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// whether scanning radio is enabled
        /// </summary>
        [Input("scanningEnabled")]
        public Input<bool>? ScanningEnabled { get; set; }

        public RftemplateState()
        {
        }
        public static new RftemplateState Empty => new RftemplateState();
    }
}
