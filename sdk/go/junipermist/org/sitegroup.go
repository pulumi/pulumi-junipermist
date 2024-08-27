// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package org

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource managed the Org Site Groups (sitegroups).A site group is a feature that allows users to group multiple sites together based on regions, functions, or other parameters for efficient management of devices. Sites can exist in multiple groups simultaneously, and site groups can be used to ensure consistent settings, manage administrator access, and apply specific templates to groups of sites.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/org"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := org.NewSitegroup(ctx, "sitegroup_one", &org.SitegroupArgs{
//				OrgId: pulumi.Any(terraformTest.Id),
//				Name:  pulumi.String("sitegroup_one"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
// $ pulumi import junipermist:org/sitegroup:Sitegroup Using terraform import, import `mist_org_sitegroup` using the `import` command:
// ```
//
// Gateway cluster can be imported by specifying the org_id and the sitegroup_id
//
// ```sh
// $ pulumi import junipermist:org/sitegroup:Sitegroup sitegroup_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
//
// In Terraform v1.5.0 and later, use an import block to import `mist_org_sitegroup` with `id={org_id}.{sitegroup_id}`:
//
// tf
//
// import {
//
//	to = mist_org_sitegroup.sitegroup_one
//
//	id = "17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309"
//
// }
type Sitegroup struct {
	pulumi.CustomResourceState

	Name  pulumi.StringOutput `pulumi:"name"`
	OrgId pulumi.StringOutput `pulumi:"orgId"`
}

// NewSitegroup registers a new resource with the given unique name, arguments, and options.
func NewSitegroup(ctx *pulumi.Context,
	name string, args *SitegroupArgs, opts ...pulumi.ResourceOption) (*Sitegroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Sitegroup
	err := ctx.RegisterResource("junipermist:org/sitegroup:Sitegroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSitegroup gets an existing Sitegroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSitegroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SitegroupState, opts ...pulumi.ResourceOption) (*Sitegroup, error) {
	var resource Sitegroup
	err := ctx.ReadResource("junipermist:org/sitegroup:Sitegroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Sitegroup resources.
type sitegroupState struct {
	Name  *string `pulumi:"name"`
	OrgId *string `pulumi:"orgId"`
}

type SitegroupState struct {
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringPtrInput
}

func (SitegroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*sitegroupState)(nil)).Elem()
}

type sitegroupArgs struct {
	Name  *string `pulumi:"name"`
	OrgId string  `pulumi:"orgId"`
}

// The set of arguments for constructing a Sitegroup resource.
type SitegroupArgs struct {
	Name  pulumi.StringPtrInput
	OrgId pulumi.StringInput
}

func (SitegroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sitegroupArgs)(nil)).Elem()
}

type SitegroupInput interface {
	pulumi.Input

	ToSitegroupOutput() SitegroupOutput
	ToSitegroupOutputWithContext(ctx context.Context) SitegroupOutput
}

func (*Sitegroup) ElementType() reflect.Type {
	return reflect.TypeOf((**Sitegroup)(nil)).Elem()
}

func (i *Sitegroup) ToSitegroupOutput() SitegroupOutput {
	return i.ToSitegroupOutputWithContext(context.Background())
}

func (i *Sitegroup) ToSitegroupOutputWithContext(ctx context.Context) SitegroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SitegroupOutput)
}

// SitegroupArrayInput is an input type that accepts SitegroupArray and SitegroupArrayOutput values.
// You can construct a concrete instance of `SitegroupArrayInput` via:
//
//	SitegroupArray{ SitegroupArgs{...} }
type SitegroupArrayInput interface {
	pulumi.Input

	ToSitegroupArrayOutput() SitegroupArrayOutput
	ToSitegroupArrayOutputWithContext(context.Context) SitegroupArrayOutput
}

type SitegroupArray []SitegroupInput

func (SitegroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sitegroup)(nil)).Elem()
}

func (i SitegroupArray) ToSitegroupArrayOutput() SitegroupArrayOutput {
	return i.ToSitegroupArrayOutputWithContext(context.Background())
}

func (i SitegroupArray) ToSitegroupArrayOutputWithContext(ctx context.Context) SitegroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SitegroupArrayOutput)
}

// SitegroupMapInput is an input type that accepts SitegroupMap and SitegroupMapOutput values.
// You can construct a concrete instance of `SitegroupMapInput` via:
//
//	SitegroupMap{ "key": SitegroupArgs{...} }
type SitegroupMapInput interface {
	pulumi.Input

	ToSitegroupMapOutput() SitegroupMapOutput
	ToSitegroupMapOutputWithContext(context.Context) SitegroupMapOutput
}

type SitegroupMap map[string]SitegroupInput

func (SitegroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sitegroup)(nil)).Elem()
}

func (i SitegroupMap) ToSitegroupMapOutput() SitegroupMapOutput {
	return i.ToSitegroupMapOutputWithContext(context.Background())
}

func (i SitegroupMap) ToSitegroupMapOutputWithContext(ctx context.Context) SitegroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SitegroupMapOutput)
}

type SitegroupOutput struct{ *pulumi.OutputState }

func (SitegroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Sitegroup)(nil)).Elem()
}

func (o SitegroupOutput) ToSitegroupOutput() SitegroupOutput {
	return o
}

func (o SitegroupOutput) ToSitegroupOutputWithContext(ctx context.Context) SitegroupOutput {
	return o
}

func (o SitegroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Sitegroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SitegroupOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Sitegroup) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

type SitegroupArrayOutput struct{ *pulumi.OutputState }

func (SitegroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Sitegroup)(nil)).Elem()
}

func (o SitegroupArrayOutput) ToSitegroupArrayOutput() SitegroupArrayOutput {
	return o
}

func (o SitegroupArrayOutput) ToSitegroupArrayOutputWithContext(ctx context.Context) SitegroupArrayOutput {
	return o
}

func (o SitegroupArrayOutput) Index(i pulumi.IntInput) SitegroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Sitegroup {
		return vs[0].([]*Sitegroup)[vs[1].(int)]
	}).(SitegroupOutput)
}

type SitegroupMapOutput struct{ *pulumi.OutputState }

func (SitegroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Sitegroup)(nil)).Elem()
}

func (o SitegroupMapOutput) ToSitegroupMapOutput() SitegroupMapOutput {
	return o
}

func (o SitegroupMapOutput) ToSitegroupMapOutputWithContext(ctx context.Context) SitegroupMapOutput {
	return o
}

func (o SitegroupMapOutput) MapIndex(k pulumi.StringInput) SitegroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Sitegroup {
		return vs[0].(map[string]*Sitegroup)[vs[1].(string)]
	}).(SitegroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SitegroupInput)(nil)).Elem(), &Sitegroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*SitegroupArrayInput)(nil)).Elem(), SitegroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SitegroupMapInput)(nil)).Elem(), SitegroupMap{})
	pulumi.RegisterOutputType(SitegroupOutput{})
	pulumi.RegisterOutputType(SitegroupArrayOutput{})
	pulumi.RegisterOutputType(SitegroupMapOutput{})
}
