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
    /// This resource is used to assign/unassign a device profile to one or multiple devices.
    /// 
    /// The `junipermist.org.DeviceprofileGateway` resource can be assigned to Gateways, and the `junipermist.org.DeviceprofileAp` resource can be assigned the Wireless Access Points
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
    ///     var deviceprofileAssign = new JuniperMist.Org.DeviceprofileAssign("deviceprofile_assign", new()
    ///     {
    ///         OrgId = terraformTest.Id,
    ///         DeviceprofileId = hubOne.Id,
    ///         Macs = new[]
    ///         {
    ///             "4c9614000000",
    ///             "4c9614000001",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:org/deviceprofileAssign:DeviceprofileAssign")]
    public partial class DeviceprofileAssign : global::Pulumi.CustomResource
    {
        [Output("deviceprofileId")]
        public Output<string> DeviceprofileId { get; private set; } = null!;

        [Output("macs")]
        public Output<ImmutableArray<string>> Macs { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;


        /// <summary>
        /// Create a DeviceprofileAssign resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DeviceprofileAssign(string name, DeviceprofileAssignArgs args, CustomResourceOptions? options = null)
            : base("junipermist:org/deviceprofileAssign:DeviceprofileAssign", name, args ?? new DeviceprofileAssignArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DeviceprofileAssign(string name, Input<string> id, DeviceprofileAssignState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:org/deviceprofileAssign:DeviceprofileAssign", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DeviceprofileAssign resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DeviceprofileAssign Get(string name, Input<string> id, DeviceprofileAssignState? state = null, CustomResourceOptions? options = null)
        {
            return new DeviceprofileAssign(name, id, state, options);
        }
    }

    public sealed class DeviceprofileAssignArgs : global::Pulumi.ResourceArgs
    {
        [Input("deviceprofileId", required: true)]
        public Input<string> DeviceprofileId { get; set; } = null!;

        [Input("macs", required: true)]
        private InputList<string>? _macs;
        public InputList<string> Macs
        {
            get => _macs ?? (_macs = new InputList<string>());
            set => _macs = value;
        }

        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public DeviceprofileAssignArgs()
        {
        }
        public static new DeviceprofileAssignArgs Empty => new DeviceprofileAssignArgs();
    }

    public sealed class DeviceprofileAssignState : global::Pulumi.ResourceArgs
    {
        [Input("deviceprofileId")]
        public Input<string>? DeviceprofileId { get; set; }

        [Input("macs")]
        private InputList<string>? _macs;
        public InputList<string> Macs
        {
            get => _macs ?? (_macs = new InputList<string>());
            set => _macs = value;
        }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        public DeviceprofileAssignState()
        {
        }
        public static new DeviceprofileAssignState Empty => new DeviceprofileAssignState();
    }
}
