// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package junipermist

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the of ConstAppCategories.
//
// # This information can be used as `appCategories` in the `org.Service` resource
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := junipermist.GetConstAppCategories(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetConstAppCategories(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetConstAppCategoriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConstAppCategoriesResult
	err := ctx.Invoke("junipermist:index/getConstAppCategories:getConstAppCategories", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getConstAppCategories.
type GetConstAppCategoriesResult struct {
	ConstAppCategories []GetConstAppCategoriesConstAppCategory `pulumi:"constAppCategories"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetConstAppCategoriesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetConstAppCategoriesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetConstAppCategoriesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("junipermist:index/getConstAppCategories:getConstAppCategories", nil, GetConstAppCategoriesResultOutput{}, options).(GetConstAppCategoriesResultOutput), nil
	}).(GetConstAppCategoriesResultOutput)
}

// A collection of values returned by getConstAppCategories.
type GetConstAppCategoriesResultOutput struct{ *pulumi.OutputState }

func (GetConstAppCategoriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConstAppCategoriesResult)(nil)).Elem()
}

func (o GetConstAppCategoriesResultOutput) ToGetConstAppCategoriesResultOutput() GetConstAppCategoriesResultOutput {
	return o
}

func (o GetConstAppCategoriesResultOutput) ToGetConstAppCategoriesResultOutputWithContext(ctx context.Context) GetConstAppCategoriesResultOutput {
	return o
}

func (o GetConstAppCategoriesResultOutput) ConstAppCategories() GetConstAppCategoriesConstAppCategoryArrayOutput {
	return o.ApplyT(func(v GetConstAppCategoriesResult) []GetConstAppCategoriesConstAppCategory {
		return v.ConstAppCategories
	}).(GetConstAppCategoriesConstAppCategoryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConstAppCategoriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConstAppCategoriesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConstAppCategoriesResultOutput{})
}
