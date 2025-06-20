// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist
{
    public static class GetConstFingerprints
    {
        /// <summary>
        /// This data source provides the of list of supported Fingerprints.
        /// 
        /// The Fingerprint information can be used within `matching` and `not_matching` attributes of the NAC Rule resource (`junipermist.org.Nacrule`)
        /// 
        /// There are four different types of fingerprints available:* Family
        /// * Model
        /// * Mfg
        /// * OS Type
        /// 
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
        ///     var listOfFingerprints = JuniperMist.GetConstFingerprints.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetConstFingerprintsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConstFingerprintsResult>("junipermist:index/getConstFingerprints:getConstFingerprints", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// This data source provides the of list of supported Fingerprints.
        /// 
        /// The Fingerprint information can be used within `matching` and `not_matching` attributes of the NAC Rule resource (`junipermist.org.Nacrule`)
        /// 
        /// There are four different types of fingerprints available:* Family
        /// * Model
        /// * Mfg
        /// * OS Type
        /// 
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
        ///     var listOfFingerprints = JuniperMist.GetConstFingerprints.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetConstFingerprintsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConstFingerprintsResult>("junipermist:index/getConstFingerprints:getConstFingerprints", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// This data source provides the of list of supported Fingerprints.
        /// 
        /// The Fingerprint information can be used within `matching` and `not_matching` attributes of the NAC Rule resource (`junipermist.org.Nacrule`)
        /// 
        /// There are four different types of fingerprints available:* Family
        /// * Model
        /// * Mfg
        /// * OS Type
        /// 
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
        ///     var listOfFingerprints = JuniperMist.GetConstFingerprints.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetConstFingerprintsResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConstFingerprintsResult>("junipermist:index/getConstFingerprints:getConstFingerprints", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetConstFingerprintsResult
    {
        public readonly ImmutableArray<string> Families;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Mfgs;
        public readonly ImmutableArray<string> Models;
        public readonly ImmutableArray<string> Os;

        [OutputConstructor]
        private GetConstFingerprintsResult(
            ImmutableArray<string> families,

            string id,

            ImmutableArray<string> mfgs,

            ImmutableArray<string> models,

            ImmutableArray<string> os)
        {
            Families = families;
            Id = id;
            Mfgs = mfgs;
            Models = models;
            Os = os;
        }
    }
}
