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
    /// This resource manages Alarm Templates.
    /// An Alarm Template is a set of Alarm Rules that could be applied to one or more sites (while each site can only pick one Alarm Template), or to the whole org.
    /// 
    /// Once created, the Alarm template must be assigned with the `alarmtemplate_id` attribute to one of the following
    /// 	* the whole org with the `junipermist.org.base` resource
    /// 	* one or multiple sites with the `junipermist.site.base` resource
    /// 
    /// It is possible to use the `junipermist.getConstAlarms` data source to get a list of the available alarms
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_org_alarmtemplate` with:
    /// 
    /// Org RF Template can be imported by specifying the org_id and the alarmtemplate_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/alarmtemplate:Alarmtemplate alarmtemplate_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/alarmtemplate:Alarmtemplate")]
    public partial class Alarmtemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Delivery object to configure the alarm delivery
        /// </summary>
        [Output("delivery")]
        public Output<Outputs.AlarmtemplateDelivery> Delivery { get; private set; } = null!;

        /// <summary>
        /// Some string to name the alarm template
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `junipermist.getConstAlarms` data source).
        /// </summary>
        [Output("rules")]
        public Output<ImmutableDictionary<string, Outputs.AlarmtemplateRules>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a Alarmtemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Alarmtemplate(string name, AlarmtemplateArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/alarmtemplate:Alarmtemplate", name, args ?? new AlarmtemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Alarmtemplate(string name, Input<string> id, AlarmtemplateState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/alarmtemplate:Alarmtemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Alarmtemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Alarmtemplate Get(string name, Input<string> id, AlarmtemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new Alarmtemplate(name, id, state, options);
        }
    }

    public sealed class AlarmtemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Delivery object to configure the alarm delivery
        /// </summary>
        [Input("delivery", required: true)]
        public Input<Inputs.AlarmtemplateDeliveryArgs> Delivery { get; set; } = null!;

        /// <summary>
        /// Some string to name the alarm template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("rules", required: true)]
        private InputMap<Inputs.AlarmtemplateRulesArgs>? _rules;

        /// <summary>
        /// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `junipermist.getConstAlarms` data source).
        /// </summary>
        public InputMap<Inputs.AlarmtemplateRulesArgs> Rules
        {
            get => _rules ?? (_rules = new InputMap<Inputs.AlarmtemplateRulesArgs>());
            set => _rules = value;
        }

        public AlarmtemplateArgs()
        {
        }
        public static new AlarmtemplateArgs Empty => new AlarmtemplateArgs();
    }

    public sealed class AlarmtemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Delivery object to configure the alarm delivery
        /// </summary>
        [Input("delivery")]
        public Input<Inputs.AlarmtemplateDeliveryGetArgs>? Delivery { get; set; }

        /// <summary>
        /// Some string to name the alarm template
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("rules")]
        private InputMap<Inputs.AlarmtemplateRulesGetArgs>? _rules;

        /// <summary>
        /// Alarm Rules object to configure the individual alarm keys/types. Property key is the alarm name (list available with the `junipermist.getConstAlarms` data source).
        /// </summary>
        public InputMap<Inputs.AlarmtemplateRulesGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputMap<Inputs.AlarmtemplateRulesGetArgs>());
            set => _rules = value;
        }

        public AlarmtemplateState()
        {
        }
        public static new AlarmtemplateState Empty => new AlarmtemplateState();
    }
}
