// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package junipermist

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Webhook Topics.
//
// This information can be used to configure webhooks at the Org level (`org.Webhook` resource) or at the Site level (`site.Webhook` resource).
//
// > Only the Webhook topics with `forOrg`==`  true ` are supported at the Org level.
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
//			_, err := junipermist.GetConstWebhooks(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetConstWebhooks(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetConstWebhooksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetConstWebhooksResult
	err := ctx.Invoke("junipermist:index/getConstWebhooks:getConstWebhooks", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getConstWebhooks.
type GetConstWebhooksResult struct {
	ConstWebhooks []GetConstWebhooksConstWebhook `pulumi:"constWebhooks"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetConstWebhooksOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetConstWebhooksResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetConstWebhooksResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("junipermist:index/getConstWebhooks:getConstWebhooks", nil, GetConstWebhooksResultOutput{}, options).(GetConstWebhooksResultOutput), nil
	}).(GetConstWebhooksResultOutput)
}

// A collection of values returned by getConstWebhooks.
type GetConstWebhooksResultOutput struct{ *pulumi.OutputState }

func (GetConstWebhooksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetConstWebhooksResult)(nil)).Elem()
}

func (o GetConstWebhooksResultOutput) ToGetConstWebhooksResultOutput() GetConstWebhooksResultOutput {
	return o
}

func (o GetConstWebhooksResultOutput) ToGetConstWebhooksResultOutputWithContext(ctx context.Context) GetConstWebhooksResultOutput {
	return o
}

func (o GetConstWebhooksResultOutput) ConstWebhooks() GetConstWebhooksConstWebhookArrayOutput {
	return o.ApplyT(func(v GetConstWebhooksResult) []GetConstWebhooksConstWebhook { return v.ConstWebhooks }).(GetConstWebhooksConstWebhookArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetConstWebhooksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetConstWebhooksResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetConstWebhooksResultOutput{})
}
