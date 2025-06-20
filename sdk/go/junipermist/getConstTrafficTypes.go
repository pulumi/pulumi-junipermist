// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package junipermist

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the of ConstTrafficTypes.
//
// The Traffic Type values can be used to define the `trafficType` attribute in the `org.Service` resource.
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
//			_, err := junipermist.GetConstTrafficTypes(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetConstTrafficTypes(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetConstTrafficTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConstTrafficTypesResult
	err := ctx.Invoke("junipermist:index/getConstTrafficTypes:getConstTrafficTypes", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getConstTrafficTypes.
type GetConstTrafficTypesResult struct {
	ConstTrafficTypes []GetConstTrafficTypesConstTrafficType `pulumi:"constTrafficTypes"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetConstTrafficTypesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetConstTrafficTypesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetConstTrafficTypesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("junipermist:index/getConstTrafficTypes:getConstTrafficTypes", nil, GetConstTrafficTypesResultOutput{}, options).(GetConstTrafficTypesResultOutput), nil
	}).(GetConstTrafficTypesResultOutput)
}

// A collection of values returned by getConstTrafficTypes.
type GetConstTrafficTypesResultOutput struct{ *pulumi.OutputState }

func (GetConstTrafficTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConstTrafficTypesResult)(nil)).Elem()
}

func (o GetConstTrafficTypesResultOutput) ToGetConstTrafficTypesResultOutput() GetConstTrafficTypesResultOutput {
	return o
}

func (o GetConstTrafficTypesResultOutput) ToGetConstTrafficTypesResultOutputWithContext(ctx context.Context) GetConstTrafficTypesResultOutput {
	return o
}

func (o GetConstTrafficTypesResultOutput) ConstTrafficTypes() GetConstTrafficTypesConstTrafficTypeArrayOutput {
	return o.ApplyT(func(v GetConstTrafficTypesResult) []GetConstTrafficTypesConstTrafficType { return v.ConstTrafficTypes }).(GetConstTrafficTypesConstTrafficTypeArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConstTrafficTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConstTrafficTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConstTrafficTypesResultOutput{})
}
