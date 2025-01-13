// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package site

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the list of Site Webhooks.
//
// A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.\
// It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.\
// The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
func GetWebhooks(ctx *pulumi.Context, args *GetWebhooksArgs, opts ...pulumi.InvokeOption) (*GetWebhooksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWebhooksResult
	err := ctx.Invoke("junipermist:site/getWebhooks:getWebhooks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWebhooks.
type GetWebhooksArgs struct {
	SiteId string `pulumi:"siteId"`
}

// A collection of values returned by getWebhooks.
type GetWebhooksResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id           string                   `pulumi:"id"`
	SiteId       string                   `pulumi:"siteId"`
	SiteWebhooks []GetWebhooksSiteWebhook `pulumi:"siteWebhooks"`
}

func GetWebhooksOutput(ctx *pulumi.Context, args GetWebhooksOutputArgs, opts ...pulumi.InvokeOption) GetWebhooksResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetWebhooksResultOutput, error) {
			args := v.(GetWebhooksArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("junipermist:site/getWebhooks:getWebhooks", args, GetWebhooksResultOutput{}, options).(GetWebhooksResultOutput), nil
		}).(GetWebhooksResultOutput)
}

// A collection of arguments for invoking getWebhooks.
type GetWebhooksOutputArgs struct {
	SiteId pulumi.StringInput `pulumi:"siteId"`
}

func (GetWebhooksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWebhooksArgs)(nil)).Elem()
}

// A collection of values returned by getWebhooks.
type GetWebhooksResultOutput struct{ *pulumi.OutputState }

func (GetWebhooksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWebhooksResult)(nil)).Elem()
}

func (o GetWebhooksResultOutput) ToGetWebhooksResultOutput() GetWebhooksResultOutput {
	return o
}

func (o GetWebhooksResultOutput) ToGetWebhooksResultOutputWithContext(ctx context.Context) GetWebhooksResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetWebhooksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWebhooksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetWebhooksResultOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWebhooksResult) string { return v.SiteId }).(pulumi.StringOutput)
}

func (o GetWebhooksResultOutput) SiteWebhooks() GetWebhooksSiteWebhookArrayOutput {
	return o.ApplyT(func(v GetWebhooksResult) []GetWebhooksSiteWebhook { return v.SiteWebhooks }).(GetWebhooksSiteWebhookArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWebhooksResultOutput{})
}
