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
    /// This data source provides the list of Site PSKs.
    /// 
    /// A multi PSK (Pre-Shared Key) is a feature that allows the use of multiple PSKs for securing network connections.\
    /// It provides a simple and comprehensive way to onboard client devices without relying on client mac addresses.\
    /// Each psk has its own key name, which can be used for user-level accountability, key rotation, and visibility in the management platform. It supports the creation, rotation, and auto-expiration of psks, and allows vlan assignment and role assignment for dynamic per-user policies.\
    /// Multi PSKs create virtual broadcast domains and can be used for end-user onboarding via authenticated sso login.
    /// 
    /// Mist supports two methods of Site PSKs lookup:
    /// * local
    /// * radius
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
    ///     var pskOne = new JuniperMist.Site.Psk("psk_one", new()
    ///     {
    ///         SiteId = terraformSite.Id,
    ///         Name = "JNP-FR-PAR",
    ///         Passphrase = "secretone",
    ///         Ssid = wlanOne.Ssid,
    ///         Usage = "multi",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `mist_site_psk` with:
    /// 
    /// Site PSK can be imported by specifying the site_id and the psk_id
    /// 
    /// ```sh
    /// $ pulumi import junipermist:site/psk:Psk psk_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
    /// ```
    /// </summary>
    [JuniperMistResourceType("junipermist:site/psk:Psk")]
    public partial class Psk : global::Pulumi.CustomResource
    {
        /// <summary>
        /// email to send psk expiring notifications to
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;

        /// <summary>
        /// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
        /// </summary>
        [Output("expireTime")]
        public Output<int> ExpireTime { get; private set; } = null!;

        /// <summary>
        /// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
        /// </summary>
        [Output("expiryNotificationTime")]
        public Output<int?> ExpiryNotificationTime { get; private set; } = null!;

        /// <summary>
        /// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
        /// </summary>
        [Output("mac")]
        public Output<string?> Mac { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("note")]
        public Output<string?> Note { get; private set; } = null!;

        /// <summary>
        /// If set to true, reminder notification will be sent when psk is about to expire
        /// </summary>
        [Output("notifyExpiry")]
        public Output<bool> NotifyExpiry { get; private set; } = null!;

        /// <summary>
        /// If set to true, notification will be sent when psk is created or edited
        /// </summary>
        [Output("notifyOnCreateOrEdit")]
        public Output<bool?> NotifyOnCreateOrEdit { get; private set; } = null!;

        /// <summary>
        /// previous passphrase of the PSK if it has been rotated
        /// </summary>
        [Output("oldPassphrase")]
        public Output<string?> OldPassphrase { get; private set; } = null!;

        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// passphrase of the PSK (8-63 character or 64 in hex)
        /// </summary>
        [Output("passphrase")]
        public Output<string> Passphrase { get; private set; } = null!;

        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        [Output("siteId")]
        public Output<string> SiteId { get; private set; } = null!;

        /// <summary>
        /// SSID this PSK should be applicable to
        /// </summary>
        [Output("ssid")]
        public Output<string> Ssid { get; private set; } = null!;

        /// <summary>
        /// enum: `multi`, `single`
        /// </summary>
        [Output("usage")]
        public Output<string> Usage { get; private set; } = null!;

        [Output("vlanId")]
        public Output<string?> VlanId { get; private set; } = null!;


        /// <summary>
        /// Create a Psk resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Psk(string name, PskArgs args, CustomResourceOptions? options = null)
            : base("junipermist:site/psk:Psk", name, args ?? new PskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Psk(string name, Input<string> id, PskState? state = null, CustomResourceOptions? options = null)
            : base("junipermist:site/psk:Psk", name, state, MakeResourceOptions(options, id))
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
                    "oldPassphrase",
                    "passphrase",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Psk resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Psk Get(string name, Input<string> id, PskState? state = null, CustomResourceOptions? options = null)
        {
            return new Psk(name, id, state, options);
        }
    }

    public sealed class PskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// email to send psk expiring notifications to
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
        /// </summary>
        [Input("expireTime")]
        public Input<int>? ExpireTime { get; set; }

        /// <summary>
        /// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
        /// </summary>
        [Input("expiryNotificationTime")]
        public Input<int>? ExpiryNotificationTime { get; set; }

        /// <summary>
        /// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("note")]
        public Input<string>? Note { get; set; }

        /// <summary>
        /// If set to true, reminder notification will be sent when psk is about to expire
        /// </summary>
        [Input("notifyExpiry")]
        public Input<bool>? NotifyExpiry { get; set; }

        /// <summary>
        /// If set to true, notification will be sent when psk is created or edited
        /// </summary>
        [Input("notifyOnCreateOrEdit")]
        public Input<bool>? NotifyOnCreateOrEdit { get; set; }

        [Input("oldPassphrase")]
        private Input<string>? _oldPassphrase;

        /// <summary>
        /// previous passphrase of the PSK if it has been rotated
        /// </summary>
        public Input<string>? OldPassphrase
        {
            get => _oldPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oldPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("passphrase", required: true)]
        private Input<string>? _passphrase;

        /// <summary>
        /// passphrase of the PSK (8-63 character or 64 in hex)
        /// </summary>
        public Input<string>? Passphrase
        {
            get => _passphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _passphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("siteId", required: true)]
        public Input<string> SiteId { get; set; } = null!;

        /// <summary>
        /// SSID this PSK should be applicable to
        /// </summary>
        [Input("ssid", required: true)]
        public Input<string> Ssid { get; set; } = null!;

        /// <summary>
        /// enum: `multi`, `single`
        /// </summary>
        [Input("usage")]
        public Input<string>? Usage { get; set; }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        public PskArgs()
        {
        }
        public static new PskArgs Empty => new PskArgs();
    }

    public sealed class PskState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// email to send psk expiring notifications to
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Expire time for this PSK key (epoch time in seconds). Default `null` (as no expiration)
        /// </summary>
        [Input("expireTime")]
        public Input<int>? ExpireTime { get; set; }

        /// <summary>
        /// Number of days before psk is expired. Used as to when to start sending reminder notification when the psk is about to expire
        /// </summary>
        [Input("expiryNotificationTime")]
        public Input<int>? ExpiryNotificationTime { get; set; }

        /// <summary>
        /// if `usage`==`single`, the mac that this PSK ties to, empty if `auto-binding`
        /// </summary>
        [Input("mac")]
        public Input<string>? Mac { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("note")]
        public Input<string>? Note { get; set; }

        /// <summary>
        /// If set to true, reminder notification will be sent when psk is about to expire
        /// </summary>
        [Input("notifyExpiry")]
        public Input<bool>? NotifyExpiry { get; set; }

        /// <summary>
        /// If set to true, notification will be sent when psk is created or edited
        /// </summary>
        [Input("notifyOnCreateOrEdit")]
        public Input<bool>? NotifyOnCreateOrEdit { get; set; }

        [Input("oldPassphrase")]
        private Input<string>? _oldPassphrase;

        /// <summary>
        /// previous passphrase of the PSK if it has been rotated
        /// </summary>
        public Input<string>? OldPassphrase
        {
            get => _oldPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oldPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("passphrase")]
        private Input<string>? _passphrase;

        /// <summary>
        /// passphrase of the PSK (8-63 character or 64 in hex)
        /// </summary>
        public Input<string>? Passphrase
        {
            get => _passphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _passphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("siteId")]
        public Input<string>? SiteId { get; set; }

        /// <summary>
        /// SSID this PSK should be applicable to
        /// </summary>
        [Input("ssid")]
        public Input<string>? Ssid { get; set; }

        /// <summary>
        /// enum: `multi`, `single`
        /// </summary>
        [Input("usage")]
        public Input<string>? Usage { get; set; }

        [Input("vlanId")]
        public Input<string>? VlanId { get; set; }

        public PskState()
        {
        }
        public static new PskState Empty => new PskState();
    }
}
