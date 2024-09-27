// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package junipermist

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This datasource provides the list of sites in a Mist Organization.
// A site represents a project, a deployment. A site contains a set of Maps, Wlans, Policies, Zones, ...
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
//			_, err := junipermist.GetSites(ctx, &junipermist.GetSitesArgs{
//				OrgId: "15fca2ac-b1a6-47cc-9953-cc6906281550",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSites(ctx *pulumi.Context, args *GetSitesArgs, opts ...pulumi.InvokeOption) (*GetSitesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSitesResult
	err := ctx.Invoke("junipermist:index/getSites:getSites", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSites.
type GetSitesArgs struct {
	OrgId string `pulumi:"orgId"`
}

// A collection of values returned by getSites.
type GetSitesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id    string         `pulumi:"id"`
	OrgId string         `pulumi:"orgId"`
	Sites []GetSitesSite `pulumi:"sites"`
}

func GetSitesOutput(ctx *pulumi.Context, args GetSitesOutputArgs, opts ...pulumi.InvokeOption) GetSitesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSitesResultOutput, error) {
			args := v.(GetSitesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetSitesResult
			secret, err := ctx.InvokePackageRaw("junipermist:index/getSites:getSites", args, &rv, "", opts...)
			if err != nil {
				return GetSitesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetSitesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetSitesResultOutput), nil
			}
			return output, nil
		}).(GetSitesResultOutput)
}

// A collection of arguments for invoking getSites.
type GetSitesOutputArgs struct {
	OrgId pulumi.StringInput `pulumi:"orgId"`
}

func (GetSitesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSitesArgs)(nil)).Elem()
}

// A collection of values returned by getSites.
type GetSitesResultOutput struct{ *pulumi.OutputState }

func (GetSitesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSitesResult)(nil)).Elem()
}

func (o GetSitesResultOutput) ToGetSitesResultOutput() GetSitesResultOutput {
	return o
}

func (o GetSitesResultOutput) ToGetSitesResultOutputWithContext(ctx context.Context) GetSitesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetSitesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSitesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSitesResultOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSitesResult) string { return v.OrgId }).(pulumi.StringOutput)
}

func (o GetSitesResultOutput) Sites() GetSitesSiteArrayOutput {
	return o.ApplyT(func(v GetSitesResult) []GetSitesSite { return v.Sites }).(GetSitesSiteArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSitesResultOutput{})
}
