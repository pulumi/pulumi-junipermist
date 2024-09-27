// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device
{
    /// <summary>
    /// This resource is used to upload a Device picture.
    /// This resource can be used to add a picture to a Wireless Access point, a Switch or a Gateway. A Maximum of 3 pictures can be uploaded.
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
    ///     var deviceImageOne = new JuniperMist.Device.Image("device_image_one", new()
    ///     {
    ///         DeviceId = inventory.Devices[1].Id,
    ///         SiteId = inventory.Devices[1].SiteId,
    ///         File = "/Users/johndoe/Documents/image.jpg",
    ///         ImageNumber = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:device/image:Image")]
    public partial class Image : global::Pulumi.CustomResource
    {
        [Output("deviceId")]
        public Output<string> DeviceId { get; private set; } = null!;

        /// <summary>
        /// path to the device image file to upload. File must be a `jpeg`, `jpg` or `png` image`
        /// </summary>
        [Output("file")]
        public Output<string> File { get; private set; } = null!;

        [Output("imageNumber")]
        public Output<int> ImageNumber { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;


        /// <summary>
        /// Create a Image resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Image(string name, ImageArgs args, CustomResourceOptions? options = null)
            : base("junipermist:device/image:Image", name, args ?? new ImageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Image(string name, Input<string> id, ImageState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:device/image:Image", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Image resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Image Get(string name, Input<string> id, ImageState? state = null, CustomResourceOptions? options = null)
        {
            return new Image(name, id, state, options);
        }
    }

    public sealed class ImageArgs : global::Pulumi.ResourceArgs
    {
        [Input("deviceId", required: true)]
        public Input<string> DeviceId { get; set; } = null!;

        /// <summary>
        /// path to the device image file to upload. File must be a `jpeg`, `jpg` or `png` image`
        /// </summary>
        [Input("file", required: true)]
        public Input<string> File { get; set; } = null!;

        [Input("imageNumber", required: true)]
        public Input<int> ImageNumber { get; set; } = null!;

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        public ImageArgs()
        {
        }
        public static new ImageArgs Empty => new ImageArgs();
    }

    public sealed class ImageState : global::Pulumi.ResourceArgs
    {
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// path to the device image file to upload. File must be a `jpeg`, `jpg` or `png` image`
        /// </summary>
        [Input("file")]
        public Input<string>? File { get; set; }

        [Input("imageNumber")]
        public Input<int>? ImageNumber { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        public ImageState()
        {
        }
        public static new ImageState Empty => new ImageState();
    }
}
