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

// This resource manages WAN Assurance Service Policies (Application Policiess).The Service Policies are used in the `servicepolicyPolicies` from the Gateway configuration and Gateway templates.They can be used to manage common policies betweeen multiples configurations
//
// ## Import
//
// Using `pulumi import`, import `mist_org_servicepolicy` with:
//
// Org Service Policy can be imported by specifying the org_id and the servicepolicy_id
//
// ```sh
// $ pulumi import junipermist:org/servicepolicy:Servicepolicy servicepolicy_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Servicepolicy struct {
	pulumi.CustomResourceState

	// enum: `allow`, `deny`
	Action pulumi.StringOutput `pulumi:"action"`
	// For SRX Only
	Appqoe ServicepolicyAppqoePtrOutput `pulumi:"appqoe"`
	Ewfs   ServicepolicyEwfArrayOutput  `pulumi:"ewfs"`
	Idp    ServicepolicyIdpPtrOutput    `pulumi:"idp"`
	// access within the same VRF
	LocalRouting pulumi.BoolOutput   `pulumi:"localRouting"`
	Name         pulumi.StringOutput `pulumi:"name"`
	OrgId        pulumi.StringOutput `pulumi:"orgId"`
	// by default, we derive all paths available and use them
	// optionally, you can customize by using `pathPreference`
	PathPreference pulumi.StringPtrOutput   `pulumi:"pathPreference"`
	Services       pulumi.StringArrayOutput `pulumi:"services"`
	Tenants        pulumi.StringArrayOutput `pulumi:"tenants"`
}

// NewServicepolicy registers a new resource with the given unique name, arguments, and options.
func NewServicepolicy(ctx *pulumi.Context,
	name string, args *ServicepolicyArgs, opts ...pulumi.ResourceOption) (*Servicepolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Servicepolicy
	err := ctx.RegisterResource("junipermist:org/servicepolicy:Servicepolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServicepolicy gets an existing Servicepolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServicepolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServicepolicyState, opts ...pulumi.ResourceOption) (*Servicepolicy, error) {
	var resource Servicepolicy
	err := ctx.ReadResource("junipermist:org/servicepolicy:Servicepolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Servicepolicy resources.
type servicepolicyState struct {
	// enum: `allow`, `deny`
	Action *string `pulumi:"action"`
	// For SRX Only
	Appqoe *ServicepolicyAppqoe `pulumi:"appqoe"`
	Ewfs   []ServicepolicyEwf   `pulumi:"ewfs"`
	Idp    *ServicepolicyIdp    `pulumi:"idp"`
	// access within the same VRF
	LocalRouting *bool   `pulumi:"localRouting"`
	Name         *string `pulumi:"name"`
	OrgId        *string `pulumi:"orgId"`
	// by default, we derive all paths available and use them
	// optionally, you can customize by using `pathPreference`
	PathPreference *string  `pulumi:"pathPreference"`
	Services       []string `pulumi:"services"`
	Tenants        []string `pulumi:"tenants"`
}

type ServicepolicyState struct {
	// enum: `allow`, `deny`
	Action pulumi.StringPtrInput
	// For SRX Only
	Appqoe ServicepolicyAppqoePtrInput
	Ewfs   ServicepolicyEwfArrayInput
	Idp    ServicepolicyIdpPtrInput
	// access within the same VRF
	LocalRouting pulumi.BoolPtrInput
	Name         pulumi.StringPtrInput
	OrgId        pulumi.StringPtrInput
	// by default, we derive all paths available and use them
	// optionally, you can customize by using `pathPreference`
	PathPreference pulumi.StringPtrInput
	Services       pulumi.StringArrayInput
	Tenants        pulumi.StringArrayInput
}

func (ServicepolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*servicepolicyState)(nil)).Elem()
}

type servicepolicyArgs struct {
	// enum: `allow`, `deny`
	Action *string `pulumi:"action"`
	// For SRX Only
	Appqoe *ServicepolicyAppqoe `pulumi:"appqoe"`
	Ewfs   []ServicepolicyEwf   `pulumi:"ewfs"`
	Idp    *ServicepolicyIdp    `pulumi:"idp"`
	// access within the same VRF
	LocalRouting *bool   `pulumi:"localRouting"`
	Name         *string `pulumi:"name"`
	OrgId        string  `pulumi:"orgId"`
	// by default, we derive all paths available and use them
	// optionally, you can customize by using `pathPreference`
	PathPreference *string  `pulumi:"pathPreference"`
	Services       []string `pulumi:"services"`
	Tenants        []string `pulumi:"tenants"`
}

// The set of arguments for constructing a Servicepolicy resource.
type ServicepolicyArgs struct {
	// enum: `allow`, `deny`
	Action pulumi.StringPtrInput
	// For SRX Only
	Appqoe ServicepolicyAppqoePtrInput
	Ewfs   ServicepolicyEwfArrayInput
	Idp    ServicepolicyIdpPtrInput
	// access within the same VRF
	LocalRouting pulumi.BoolPtrInput
	Name         pulumi.StringPtrInput
	OrgId        pulumi.StringInput
	// by default, we derive all paths available and use them
	// optionally, you can customize by using `pathPreference`
	PathPreference pulumi.StringPtrInput
	Services       pulumi.StringArrayInput
	Tenants        pulumi.StringArrayInput
}

func (ServicepolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*servicepolicyArgs)(nil)).Elem()
}

type ServicepolicyInput interface {
	pulumi.Input

	ToServicepolicyOutput() ServicepolicyOutput
	ToServicepolicyOutputWithContext(ctx context.Context) ServicepolicyOutput
}

func (*Servicepolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**Servicepolicy)(nil)).Elem()
}

func (i *Servicepolicy) ToServicepolicyOutput() ServicepolicyOutput {
	return i.ToServicepolicyOutputWithContext(context.Background())
}

func (i *Servicepolicy) ToServicepolicyOutputWithContext(ctx context.Context) ServicepolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicepolicyOutput)
}

// ServicepolicyArrayInput is an input type that accepts ServicepolicyArray and ServicepolicyArrayOutput values.
// You can construct a concrete instance of `ServicepolicyArrayInput` via:
//
//	ServicepolicyArray{ ServicepolicyArgs{...} }
type ServicepolicyArrayInput interface {
	pulumi.Input

	ToServicepolicyArrayOutput() ServicepolicyArrayOutput
	ToServicepolicyArrayOutputWithContext(context.Context) ServicepolicyArrayOutput
}

type ServicepolicyArray []ServicepolicyInput

func (ServicepolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Servicepolicy)(nil)).Elem()
}

func (i ServicepolicyArray) ToServicepolicyArrayOutput() ServicepolicyArrayOutput {
	return i.ToServicepolicyArrayOutputWithContext(context.Background())
}

func (i ServicepolicyArray) ToServicepolicyArrayOutputWithContext(ctx context.Context) ServicepolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicepolicyArrayOutput)
}

// ServicepolicyMapInput is an input type that accepts ServicepolicyMap and ServicepolicyMapOutput values.
// You can construct a concrete instance of `ServicepolicyMapInput` via:
//
//	ServicepolicyMap{ "key": ServicepolicyArgs{...} }
type ServicepolicyMapInput interface {
	pulumi.Input

	ToServicepolicyMapOutput() ServicepolicyMapOutput
	ToServicepolicyMapOutputWithContext(context.Context) ServicepolicyMapOutput
}

type ServicepolicyMap map[string]ServicepolicyInput

func (ServicepolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Servicepolicy)(nil)).Elem()
}

func (i ServicepolicyMap) ToServicepolicyMapOutput() ServicepolicyMapOutput {
	return i.ToServicepolicyMapOutputWithContext(context.Background())
}

func (i ServicepolicyMap) ToServicepolicyMapOutputWithContext(ctx context.Context) ServicepolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicepolicyMapOutput)
}

type ServicepolicyOutput struct{ *pulumi.OutputState }

func (ServicepolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Servicepolicy)(nil)).Elem()
}

func (o ServicepolicyOutput) ToServicepolicyOutput() ServicepolicyOutput {
	return o
}

func (o ServicepolicyOutput) ToServicepolicyOutputWithContext(ctx context.Context) ServicepolicyOutput {
	return o
}

// enum: `allow`, `deny`
func (o ServicepolicyOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *Servicepolicy) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// For SRX Only
func (o ServicepolicyOutput) Appqoe() ServicepolicyAppqoePtrOutput {
	return o.ApplyT(func(v *Servicepolicy) ServicepolicyAppqoePtrOutput { return v.Appqoe }).(ServicepolicyAppqoePtrOutput)
}

func (o ServicepolicyOutput) Ewfs() ServicepolicyEwfArrayOutput {
	return o.ApplyT(func(v *Servicepolicy) ServicepolicyEwfArrayOutput { return v.Ewfs }).(ServicepolicyEwfArrayOutput)
}

func (o ServicepolicyOutput) Idp() ServicepolicyIdpPtrOutput {
	return o.ApplyT(func(v *Servicepolicy) ServicepolicyIdpPtrOutput { return v.Idp }).(ServicepolicyIdpPtrOutput)
}

// access within the same VRF
func (o ServicepolicyOutput) LocalRouting() pulumi.BoolOutput {
	return o.ApplyT(func(v *Servicepolicy) pulumi.BoolOutput { return v.LocalRouting }).(pulumi.BoolOutput)
}

func (o ServicepolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Servicepolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ServicepolicyOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Servicepolicy) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// by default, we derive all paths available and use them
// optionally, you can customize by using `pathPreference`
func (o ServicepolicyOutput) PathPreference() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Servicepolicy) pulumi.StringPtrOutput { return v.PathPreference }).(pulumi.StringPtrOutput)
}

func (o ServicepolicyOutput) Services() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Servicepolicy) pulumi.StringArrayOutput { return v.Services }).(pulumi.StringArrayOutput)
}

func (o ServicepolicyOutput) Tenants() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Servicepolicy) pulumi.StringArrayOutput { return v.Tenants }).(pulumi.StringArrayOutput)
}

type ServicepolicyArrayOutput struct{ *pulumi.OutputState }

func (ServicepolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Servicepolicy)(nil)).Elem()
}

func (o ServicepolicyArrayOutput) ToServicepolicyArrayOutput() ServicepolicyArrayOutput {
	return o
}

func (o ServicepolicyArrayOutput) ToServicepolicyArrayOutputWithContext(ctx context.Context) ServicepolicyArrayOutput {
	return o
}

func (o ServicepolicyArrayOutput) Index(i pulumi.IntInput) ServicepolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Servicepolicy {
		return vs[0].([]*Servicepolicy)[vs[1].(int)]
	}).(ServicepolicyOutput)
}

type ServicepolicyMapOutput struct{ *pulumi.OutputState }

func (ServicepolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Servicepolicy)(nil)).Elem()
}

func (o ServicepolicyMapOutput) ToServicepolicyMapOutput() ServicepolicyMapOutput {
	return o
}

func (o ServicepolicyMapOutput) ToServicepolicyMapOutputWithContext(ctx context.Context) ServicepolicyMapOutput {
	return o
}

func (o ServicepolicyMapOutput) MapIndex(k pulumi.StringInput) ServicepolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Servicepolicy {
		return vs[0].(map[string]*Servicepolicy)[vs[1].(string)]
	}).(ServicepolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServicepolicyInput)(nil)).Elem(), &Servicepolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicepolicyArrayInput)(nil)).Elem(), ServicepolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicepolicyMapInput)(nil)).Elem(), ServicepolicyMap{})
	pulumi.RegisterOutputType(ServicepolicyOutput{})
	pulumi.RegisterOutputType(ServicepolicyArrayOutput{})
	pulumi.RegisterOutputType(ServicepolicyMapOutput{})
}
