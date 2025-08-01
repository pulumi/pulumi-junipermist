// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org
{
    /// <summary>
    /// This resource manages the NAC Rules (Auth Policies).
    /// 
    /// A NAC Rule defines a list of criteria (NAC Tag) the network client must match to execute the Rule, an action (Allow/Deny)and a list of RADIUS Attributes (NAC Tags) to return
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_nacrule` with:
    /// 
    /// NAC Rule can be imported by specifying the org_id and the nacrule_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/nacrule:Nacrule nacrule_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/nacrule:Nacrule")]
    public partial class Nacrule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// enum: `allow`, `block`
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// All optional, this goes into Access-Accept
        /// </summary>
        [Output("applyTags")]
        public Output<ImmutableArray<string>> ApplyTags { get; private set; } = null!;

        /// <summary>
        /// Enabled or not
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        [Output("matching")]
        public Output<Outputs.NacruleMatching?> Matching { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("notMatching")]
        public Output<Outputs.NacruleNotMatching?> NotMatching { get; private set; } = null!;

        /// <summary>
        /// Order of the rule, lower value implies higher priority
        /// </summary>
        [Output("order")]
        public Output<int> Order { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;


        /// <summary>
        /// Create a Nacrule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Nacrule(string name, NacruleArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/nacrule:Nacrule", name, args ?? new NacruleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Nacrule(string name, Input<string> id, NacruleState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/nacrule:Nacrule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Nacrule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Nacrule Get(string name, Input<string> id, NacruleState? state = null, CustomResourceOptions? options = null)
        {
            return new Nacrule(name, id, state, options);
        }
    }

    public sealed class NacruleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `allow`, `block`
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        [Input("applyTags")]
        private InputList<string>? _applyTags;

        /// <summary>
        /// All optional, this goes into Access-Accept
        /// </summary>
        public InputList<string> ApplyTags
        {
            get => _applyTags ?? (_applyTags = new InputList<string>());
            set => _applyTags = value;
        }

        /// <summary>
        /// Enabled or not
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("matching")]
        public Input<Inputs.NacruleMatchingArgs>? Matching { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notMatching")]
        public Input<Inputs.NacruleNotMatchingArgs>? NotMatching { get; set; }

        /// <summary>
        /// Order of the rule, lower value implies higher priority
        /// </summary>
        [Input("order", required: true)]
        public Input<int> Order { get; set; } = null!;

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public NacruleArgs()
        {
        }
        public static new NacruleArgs Empty => new NacruleArgs();
    }

    public sealed class NacruleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `allow`, `block`
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("applyTags")]
        private InputList<string>? _applyTags;

        /// <summary>
        /// All optional, this goes into Access-Accept
        /// </summary>
        public InputList<string> ApplyTags
        {
            get => _applyTags ?? (_applyTags = new InputList<string>());
            set => _applyTags = value;
        }

        /// <summary>
        /// Enabled or not
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("matching")]
        public Input<Inputs.NacruleMatchingGetArgs>? Matching { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notMatching")]
        public Input<Inputs.NacruleNotMatchingGetArgs>? NotMatching { get; set; }

        /// <summary>
        /// Order of the rule, lower value implies higher priority
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        public NacruleState()
        {
        }
        public static new NacruleState Empty => new NacruleState();
    }
}
