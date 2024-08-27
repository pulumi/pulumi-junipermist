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
    /// This resource manages WAN Assurance Idp Profiles.An IDP Profile is a configuration setting that defines the behavior and actions of an intrusion detection and prevention (IDP) system.It specifies how the idp system should detect and respond to potential security threats or attacks on a network.The profile includes rules and policies that determine which types of traffic or attacks should be monitored,what actions should be taken when a threat is detected, and any exceptions or exclusions for specific destinations or attack types.
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/idpprofile:Idpprofile Using terraform import, import `mist_org_idpprofile` using the `import` command:
    /// ```
    /// 
    /// Gateway cluster can be imported by specifying the org_id and the idpprofile_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:org/idpprofile:Idpprofile idpprofile_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// 
    /// In Terraform v1.5.0 and later, use an import block to import `mist_org_idpprofile` with `id={org_id}.{idpprofile_id}`:
    /// 
    /// tf
    /// 
    /// import {
    /// 
    ///   to = mist_org_idpprofile.idpprofile_one
    /// 
    ///   id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"
    /// 
    /// }
    /// </summary>
    [JuniperMistResourceType("junipermist:org/idpprofile:Idpprofile")]
    public partial class Idpprofile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        [Output("baseProfile")]
        public Output<string> BaseProfile { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        [Output("overwrites")]
        public Output<ImmutableArray<Outputs.IdpprofileOverwrite>> Overwrites { get; private set; } = null!;


        /// <summary>
        /// Create a Idpprofile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Idpprofile(string name, IdpprofileArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/idpprofile:Idpprofile", name, args ?? new IdpprofileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Idpprofile(string name, Input<string> id, IdpprofileState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/idpprofile:Idpprofile", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Idpprofile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Idpprofile Get(string name, Input<string> id, IdpprofileState? state = null, CustomResourceOptions? options = null)
        {
            return new Idpprofile(name, id, state, options);
        }
    }

    public sealed class IdpprofileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        [Input("baseProfile", required: true)]
        public Input<string> BaseProfile { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("overwrites")]
        private InputList<Inputs.IdpprofileOverwriteArgs>? _overwrites;
        public InputList<Inputs.IdpprofileOverwriteArgs> Overwrites
        {
            get => _overwrites ?? (_overwrites = new InputList<Inputs.IdpprofileOverwriteArgs>());
            set => _overwrites = value;
        }

        public IdpprofileArgs()
        {
        }
        public static new IdpprofileArgs Empty => new IdpprofileArgs();
    }

    public sealed class IdpprofileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `critical`, `standard`, `strict`
        /// </summary>
        [Input("baseProfile")]
        public Input<string>? BaseProfile { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("overwrites")]
        private InputList<Inputs.IdpprofileOverwriteGetArgs>? _overwrites;
        public InputList<Inputs.IdpprofileOverwriteGetArgs> Overwrites
        {
            get => _overwrites ?? (_overwrites = new InputList<Inputs.IdpprofileOverwriteGetArgs>());
            set => _overwrites = value;
        }

        public IdpprofileState()
        {
        }
        public static new IdpprofileState Empty => new IdpprofileState();
    }
}
