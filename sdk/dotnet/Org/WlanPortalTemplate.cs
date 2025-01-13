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
    /// This resource is used customize the WLAN Guest Portal.
    /// 
    /// The WLAN Portal Template can be used to define:
    /// * Guest Authentication methods and parameters (access duration, ...)
    /// * Default values of the text fields and labels on the portal
    /// * Values of the text fields and labels based on the User Agent (`locales` property)
    /// 
    /// **Notes:**
    /// * There is no feedback from the API, so there is no possibility to validate the changes. The resource states is directly generated based on the resource plan.* There is no option to delete or revert the changes. Deleting the resource will just remove it from the states. Once removed, it is possible to create a new one. It will replace the previous template
    /// </summary>
    [JuniperMistResourceType("junipermist:org/wlanPortalTemplate:WlanPortalTemplate")]
    public partial class WlanPortalTemplate : global::Pulumi.CustomResource
    {
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// portal template wlan settings
        /// </summary>
        [Output("portalTemplate")]
        public Output<Outputs.WlanPortalTemplatePortalTemplate> PortalTemplate { get; private set; } = null!;

        /// <summary>
        /// Org WLAN ID
        /// </summary>
        [Output("wlanId")]
        public Output<string> WlanId { get; private set; } = null!;


        /// <summary>
        /// Create a WlanPortalTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WlanPortalTemplate(string name, WlanPortalTemplateArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/wlanPortalTemplate:WlanPortalTemplate", name, args ?? new WlanPortalTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WlanPortalTemplate(string name, Input<string> id, WlanPortalTemplateState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/wlanPortalTemplate:WlanPortalTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing WlanPortalTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WlanPortalTemplate Get(string name, Input<string> id, WlanPortalTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new WlanPortalTemplate(name, id, state, options);
        }
    }

    public sealed class WlanPortalTemplateArgs : global::Pulumi.ResourceArgs
    {
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// portal template wlan settings
        /// </summary>
        [Input("portalTemplate", required: true)]
        public Input<Inputs.WlanPortalTemplatePortalTemplateArgs> PortalTemplate { get; set; } = null!;

        /// <summary>
        /// Org WLAN ID
        /// </summary>
        [Input("wlanId", required: true)]
        public Input<string> WlanId { get; set; } = null!;

        public WlanPortalTemplateArgs()
        {
        }
        public static new WlanPortalTemplateArgs Empty => new WlanPortalTemplateArgs();
    }

    public sealed class WlanPortalTemplateState : global::Pulumi.ResourceArgs
    {
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// portal template wlan settings
        /// </summary>
        [Input("portalTemplate")]
        public Input<Inputs.WlanPortalTemplatePortalTemplateGetArgs>? PortalTemplate { get; set; }

        /// <summary>
        /// Org WLAN ID
        /// </summary>
        [Input("wlanId")]
        public Input<string>? WlanId { get; set; }

        public WlanPortalTemplateState()
        {
        }
        public static new WlanPortalTemplateState Empty => new WlanPortalTemplateState();
    }
}
