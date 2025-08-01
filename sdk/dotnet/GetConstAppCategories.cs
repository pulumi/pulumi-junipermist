// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist
{
    public static class GetConstAppCategories
    {
        /// <summary>
        /// This data source provides the of ConstAppCategories.
        /// 
        /// This information can be used as `app_categories` in the `junipermist.org.Service` resource
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
        ///     var listOfAppCategories = JuniperMist.GetConstAppCategories.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetConstAppCategoriesResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConstAppCategoriesResult>("junipermist:index/getConstAppCategories:getConstAppCategories", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// This data source provides the of ConstAppCategories.
        /// 
        /// This information can be used as `app_categories` in the `junipermist.org.Service` resource
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
        ///     var listOfAppCategories = JuniperMist.GetConstAppCategories.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetConstAppCategoriesResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConstAppCategoriesResult>("junipermist:index/getConstAppCategories:getConstAppCategories", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// This data source provides the of ConstAppCategories.
        /// 
        /// This information can be used as `app_categories` in the `junipermist.org.Service` resource
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
        ///     var listOfAppCategories = JuniperMist.GetConstAppCategories.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetConstAppCategoriesResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConstAppCategoriesResult>("junipermist:index/getConstAppCategories:getConstAppCategories", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetConstAppCategoriesResult
    {
        public readonly ImmutableArray<Outputs.GetConstAppCategoriesConstAppCategoryResult> ConstAppCategories;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetConstAppCategoriesResult(
            ImmutableArray<Outputs.GetConstAppCategoriesConstAppCategoryResult> constAppCategories,

            string id)
        {
            ConstAppCategories = constAppCategories;
            Id = id;
        }
    }
}
