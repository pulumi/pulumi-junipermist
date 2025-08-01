// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package junipermist

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the of ConstCountries.
//
// This information can be used to define the Country in the RF templates (`org.Rftemplate`)
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
//			_, err := junipermist.GetConstCountries(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetConstCountries(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetConstCountriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConstCountriesResult
	err := ctx.Invoke("junipermist:index/getConstCountries:getConstCountries", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getConstCountries.
type GetConstCountriesResult struct {
	ConstCountries []GetConstCountriesConstCountry `pulumi:"constCountries"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetConstCountriesOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetConstCountriesResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetConstCountriesResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("junipermist:index/getConstCountries:getConstCountries", nil, GetConstCountriesResultOutput{}, options).(GetConstCountriesResultOutput), nil
	}).(GetConstCountriesResultOutput)
}

// A collection of values returned by getConstCountries.
type GetConstCountriesResultOutput struct{ *pulumi.OutputState }

func (GetConstCountriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConstCountriesResult)(nil)).Elem()
}

func (o GetConstCountriesResultOutput) ToGetConstCountriesResultOutput() GetConstCountriesResultOutput {
	return o
}

func (o GetConstCountriesResultOutput) ToGetConstCountriesResultOutputWithContext(ctx context.Context) GetConstCountriesResultOutput {
	return o
}

func (o GetConstCountriesResultOutput) ConstCountries() GetConstCountriesConstCountryArrayOutput {
	return o.ApplyT(func(v GetConstCountriesResult) []GetConstCountriesConstCountry { return v.ConstCountries }).(GetConstCountriesConstCountryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConstCountriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConstCountriesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConstCountriesResultOutput{})
}
