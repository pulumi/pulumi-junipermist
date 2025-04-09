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
    /// This resource manages Org API Tokens.
    /// 
    /// An Org API token is a unique identifier used by an application to authenticate and access the Mist APIs. These tokens are used to authenticate requests made to the API server and ensure secure access to the API. They are not bound to any specific user and provide access to the organization as a whole.
    /// Organization tokens support different privileges and can only be used for the specific organization they are generated for.
    /// Rate limiting is done on an individual token basis, so if one token reaches its rate limit, it does not impact other tokens.
    /// </summary>
    [JuniperMistResourceType("junipermist:org/apitoken:Apitoken")]
    public partial class Apitoken : global::Pulumi.CustomResource
    {
        /// <summary>
        /// email of the token creator / null if creator is deleted
        /// </summary>
        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// Name of the token
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// List of privileges the token has on the orgs/sites
        /// </summary>
        [Output("privileges")]
        public Output<ImmutableArray<Outputs.ApitokenPrivilege>> Privileges { get; private set; } = null!;

        /// <summary>
        /// List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
        /// </summary>
        [Output("srcIps")]
        public Output<ImmutableArray<string>> SrcIps { get; private set; } = null!;


        /// <summary>
        /// Create a Apitoken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Apitoken(string name, ApitokenArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/apitoken:Apitoken", name, args ?? new ApitokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Apitoken(string name, Input<string> id, ApitokenState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/apitoken:Apitoken", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-junipermist",
                AdditionalSecretOutputs =
                {
                    "key",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Apitoken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Apitoken Get(string name, Input<string> id, ApitokenState? state = null, CustomResourceOptions? options = null)
        {
            return new Apitoken(name, id, state, options);
        }
    }

    public sealed class ApitokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the token
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        [Input("privileges", required: true)]
        private InputList<Inputs.ApitokenPrivilegeArgs>? _privileges;

        /// <summary>
        /// List of privileges the token has on the orgs/sites
        /// </summary>
        public InputList<Inputs.ApitokenPrivilegeArgs> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<Inputs.ApitokenPrivilegeArgs>());
            set => _privileges = value;
        }

        [Input("srcIps")]
        private InputList<string>? _srcIps;

        /// <summary>
        /// List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
        /// </summary>
        public InputList<string> SrcIps
        {
            get => _srcIps ?? (_srcIps = new InputList<string>());
            set => _srcIps = value;
        }

        public ApitokenArgs()
        {
        }
        public static new ApitokenArgs Empty => new ApitokenArgs();
    }

    public sealed class ApitokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// email of the token creator / null if creator is deleted
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        [Input("key")]
        private Input<string>? _key;
        public Input<string>? Key
        {
            get => _key;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _key = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Name of the token
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("privileges")]
        private InputList<Inputs.ApitokenPrivilegeGetArgs>? _privileges;

        /// <summary>
        /// List of privileges the token has on the orgs/sites
        /// </summary>
        public InputList<Inputs.ApitokenPrivilegeGetArgs> Privileges
        {
            get => _privileges ?? (_privileges = new InputList<Inputs.ApitokenPrivilegeGetArgs>());
            set => _privileges = value;
        }

        [Input("srcIps")]
        private InputList<string>? _srcIps;

        /// <summary>
        /// List of allowed IP addresses from where the token can be used from. At most 10 IP addresses can be specified, cannot be changed once the API Token is created.
        /// </summary>
        public InputList<string> SrcIps
        {
            get => _srcIps ?? (_srcIps = new InputList<string>());
            set => _srcIps = value;
        }

        public ApitokenState()
        {
        }
        public static new ApitokenState Empty => new ApitokenState();
    }
}
