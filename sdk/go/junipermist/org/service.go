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

// This resource manages WAN Assurance Services (Applications).The Services are used in the `servicePolicies` from the Gateway configuration and Gateway templates, or can be used in the Org Service Policies (`orgServicepolicy` resource).
//
// ## Import
//
// ```sh
// $ pulumi import junipermist:org/service:Service Using terraform import, import `mist_org_service` using the `import` command:
// ```
//
// Gateway cluster can be imported by specifying the org_id and the service_id
//
// ```sh
// $ pulumi import junipermist:org/service:Service service_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Service struct {
	pulumi.CustomResourceState

	// if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
	Addresses pulumi.StringArrayOutput `pulumi:"addresses"`
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
	AppCategories pulumi.StringArrayOutput `pulumi:"appCategories"`
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
	AppSubcategories pulumi.StringArrayOutput `pulumi:"appSubcategories"`
	// when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
	// /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
	Apps        pulumi.StringArrayOutput `pulumi:"apps"`
	Description pulumi.StringPtrOutput   `pulumi:"description"`
	Dscp        pulumi.StringPtrOutput   `pulumi:"dscp"`
	// enum: `nonRevertable`, `none`, `revertable`
	FailoverPolicy pulumi.StringOutput `pulumi:"failoverPolicy"`
	// if `type`==`custom`, web filtering
	Hostnames  pulumi.StringArrayOutput `pulumi:"hostnames"`
	MaxJitter  pulumi.StringPtrOutput   `pulumi:"maxJitter"`
	MaxLatency pulumi.StringPtrOutput   `pulumi:"maxLatency"`
	MaxLoss    pulumi.StringPtrOutput   `pulumi:"maxLoss"`
	Name       pulumi.StringOutput      `pulumi:"name"`
	OrgId      pulumi.StringOutput      `pulumi:"orgId"`
	// whether to enable measure SLE
	SleEnabled pulumi.BoolOutput `pulumi:"sleEnabled"`
	// when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
	Specs                         ServiceSpecArrayOutput `pulumi:"specs"`
	SsrRelaxedTcpStateEnforcement pulumi.BoolOutput      `pulumi:"ssrRelaxedTcpStateEnforcement"`
	// when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
	TrafficClass pulumi.StringOutput `pulumi:"trafficClass"`
	// values from `/api/v1/consts/traffic_types`
	TrafficType pulumi.StringOutput `pulumi:"trafficType"`
	// enum: `appCategories`, `apps`, `custom`, `urls`
	Type pulumi.StringOutput `pulumi:"type"`
	// when `type`==`urls`, no need for spec as URL can encode the ports being used
	Urls pulumi.StringArrayOutput `pulumi:"urls"`
}

// NewService registers a new resource with the given unique name, arguments, and options.
func NewService(ctx *pulumi.Context,
	name string, args *ServiceArgs, opts ...pulumi.ResourceOption) (*Service, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrgId == nil {
		return nil, errors.New("invalid value for required argument 'OrgId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Service
	err := ctx.RegisterResource("junipermist:org/service:Service", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetService gets an existing Service resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceState, opts ...pulumi.ResourceOption) (*Service, error) {
	var resource Service
	err := ctx.ReadResource("junipermist:org/service:Service", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Service resources.
type serviceState struct {
	// if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
	Addresses []string `pulumi:"addresses"`
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
	AppCategories []string `pulumi:"appCategories"`
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
	AppSubcategories []string `pulumi:"appSubcategories"`
	// when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
	// /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
	Apps        []string `pulumi:"apps"`
	Description *string  `pulumi:"description"`
	Dscp        *string  `pulumi:"dscp"`
	// enum: `nonRevertable`, `none`, `revertable`
	FailoverPolicy *string `pulumi:"failoverPolicy"`
	// if `type`==`custom`, web filtering
	Hostnames  []string `pulumi:"hostnames"`
	MaxJitter  *string  `pulumi:"maxJitter"`
	MaxLatency *string  `pulumi:"maxLatency"`
	MaxLoss    *string  `pulumi:"maxLoss"`
	Name       *string  `pulumi:"name"`
	OrgId      *string  `pulumi:"orgId"`
	// whether to enable measure SLE
	SleEnabled *bool `pulumi:"sleEnabled"`
	// when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
	Specs                         []ServiceSpec `pulumi:"specs"`
	SsrRelaxedTcpStateEnforcement *bool         `pulumi:"ssrRelaxedTcpStateEnforcement"`
	// when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
	TrafficClass *string `pulumi:"trafficClass"`
	// values from `/api/v1/consts/traffic_types`
	TrafficType *string `pulumi:"trafficType"`
	// enum: `appCategories`, `apps`, `custom`, `urls`
	Type *string `pulumi:"type"`
	// when `type`==`urls`, no need for spec as URL can encode the ports being used
	Urls []string `pulumi:"urls"`
}

type ServiceState struct {
	// if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
	Addresses pulumi.StringArrayInput
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
	AppCategories pulumi.StringArrayInput
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
	AppSubcategories pulumi.StringArrayInput
	// when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
	// /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
	Apps        pulumi.StringArrayInput
	Description pulumi.StringPtrInput
	Dscp        pulumi.StringPtrInput
	// enum: `nonRevertable`, `none`, `revertable`
	FailoverPolicy pulumi.StringPtrInput
	// if `type`==`custom`, web filtering
	Hostnames  pulumi.StringArrayInput
	MaxJitter  pulumi.StringPtrInput
	MaxLatency pulumi.StringPtrInput
	MaxLoss    pulumi.StringPtrInput
	Name       pulumi.StringPtrInput
	OrgId      pulumi.StringPtrInput
	// whether to enable measure SLE
	SleEnabled pulumi.BoolPtrInput
	// when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
	Specs                         ServiceSpecArrayInput
	SsrRelaxedTcpStateEnforcement pulumi.BoolPtrInput
	// when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
	TrafficClass pulumi.StringPtrInput
	// values from `/api/v1/consts/traffic_types`
	TrafficType pulumi.StringPtrInput
	// enum: `appCategories`, `apps`, `custom`, `urls`
	Type pulumi.StringPtrInput
	// when `type`==`urls`, no need for spec as URL can encode the ports being used
	Urls pulumi.StringArrayInput
}

func (ServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceState)(nil)).Elem()
}

type serviceArgs struct {
	// if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
	Addresses []string `pulumi:"addresses"`
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
	AppCategories []string `pulumi:"appCategories"`
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
	AppSubcategories []string `pulumi:"appSubcategories"`
	// when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
	// /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
	Apps        []string `pulumi:"apps"`
	Description *string  `pulumi:"description"`
	Dscp        *string  `pulumi:"dscp"`
	// enum: `nonRevertable`, `none`, `revertable`
	FailoverPolicy *string `pulumi:"failoverPolicy"`
	// if `type`==`custom`, web filtering
	Hostnames  []string `pulumi:"hostnames"`
	MaxJitter  *string  `pulumi:"maxJitter"`
	MaxLatency *string  `pulumi:"maxLatency"`
	MaxLoss    *string  `pulumi:"maxLoss"`
	Name       *string  `pulumi:"name"`
	OrgId      string   `pulumi:"orgId"`
	// whether to enable measure SLE
	SleEnabled *bool `pulumi:"sleEnabled"`
	// when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
	Specs                         []ServiceSpec `pulumi:"specs"`
	SsrRelaxedTcpStateEnforcement *bool         `pulumi:"ssrRelaxedTcpStateEnforcement"`
	// when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
	TrafficClass *string `pulumi:"trafficClass"`
	// values from `/api/v1/consts/traffic_types`
	TrafficType *string `pulumi:"trafficType"`
	// enum: `appCategories`, `apps`, `custom`, `urls`
	Type *string `pulumi:"type"`
	// when `type`==`urls`, no need for spec as URL can encode the ports being used
	Urls []string `pulumi:"urls"`
}

// The set of arguments for constructing a Service resource.
type ServiceArgs struct {
	// if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
	Addresses pulumi.StringArrayInput
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
	AppCategories pulumi.StringArrayInput
	// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
	AppSubcategories pulumi.StringArrayInput
	// when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
	// /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
	Apps        pulumi.StringArrayInput
	Description pulumi.StringPtrInput
	Dscp        pulumi.StringPtrInput
	// enum: `nonRevertable`, `none`, `revertable`
	FailoverPolicy pulumi.StringPtrInput
	// if `type`==`custom`, web filtering
	Hostnames  pulumi.StringArrayInput
	MaxJitter  pulumi.StringPtrInput
	MaxLatency pulumi.StringPtrInput
	MaxLoss    pulumi.StringPtrInput
	Name       pulumi.StringPtrInput
	OrgId      pulumi.StringInput
	// whether to enable measure SLE
	SleEnabled pulumi.BoolPtrInput
	// when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
	Specs                         ServiceSpecArrayInput
	SsrRelaxedTcpStateEnforcement pulumi.BoolPtrInput
	// when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
	TrafficClass pulumi.StringPtrInput
	// values from `/api/v1/consts/traffic_types`
	TrafficType pulumi.StringPtrInput
	// enum: `appCategories`, `apps`, `custom`, `urls`
	Type pulumi.StringPtrInput
	// when `type`==`urls`, no need for spec as URL can encode the ports being used
	Urls pulumi.StringArrayInput
}

func (ServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceArgs)(nil)).Elem()
}

type ServiceInput interface {
	pulumi.Input

	ToServiceOutput() ServiceOutput
	ToServiceOutputWithContext(ctx context.Context) ServiceOutput
}

func (*Service) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (i *Service) ToServiceOutput() ServiceOutput {
	return i.ToServiceOutputWithContext(context.Background())
}

func (i *Service) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceOutput)
}

// ServiceArrayInput is an input type that accepts ServiceArray and ServiceArrayOutput values.
// You can construct a concrete instance of `ServiceArrayInput` via:
//
//	ServiceArray{ ServiceArgs{...} }
type ServiceArrayInput interface {
	pulumi.Input

	ToServiceArrayOutput() ServiceArrayOutput
	ToServiceArrayOutputWithContext(context.Context) ServiceArrayOutput
}

type ServiceArray []ServiceInput

func (ServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
}

func (i ServiceArray) ToServiceArrayOutput() ServiceArrayOutput {
	return i.ToServiceArrayOutputWithContext(context.Background())
}

func (i ServiceArray) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceArrayOutput)
}

// ServiceMapInput is an input type that accepts ServiceMap and ServiceMapOutput values.
// You can construct a concrete instance of `ServiceMapInput` via:
//
//	ServiceMap{ "key": ServiceArgs{...} }
type ServiceMapInput interface {
	pulumi.Input

	ToServiceMapOutput() ServiceMapOutput
	ToServiceMapOutputWithContext(context.Context) ServiceMapOutput
}

type ServiceMap map[string]ServiceInput

func (ServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (i ServiceMap) ToServiceMapOutput() ServiceMapOutput {
	return i.ToServiceMapOutputWithContext(context.Background())
}

func (i ServiceMap) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceMapOutput)
}

type ServiceOutput struct{ *pulumi.OutputState }

func (ServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Service)(nil)).Elem()
}

func (o ServiceOutput) ToServiceOutput() ServiceOutput {
	return o
}

func (o ServiceOutput) ToServiceOutputWithContext(ctx context.Context) ServiceOutput {
	return o
}

// if `type`==`custom`, ip subnets (e.g. 10.0.0.0/8)
func (o ServiceOutput) Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Service) pulumi.StringArrayOutput { return v.Addresses }).(pulumi.StringArrayOutput)
}

// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_categories
func (o ServiceOutput) AppCategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Service) pulumi.StringArrayOutput { return v.AppCategories }).(pulumi.StringArrayOutput)
}

// when `type`==`appCategories`, list of application categories are available through /api/v1/const/app_subcategories
func (o ServiceOutput) AppSubcategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Service) pulumi.StringArrayOutput { return v.AppSubcategories }).(pulumi.StringArrayOutput)
}

// when `type`==`apps`, list of applications are available through: * /api/v1/const/applications *
// /api/v1/const/gateway_applications * /insight/top_app_by-bytes?wired=true
func (o ServiceOutput) Apps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Service) pulumi.StringArrayOutput { return v.Apps }).(pulumi.StringArrayOutput)
}

func (o ServiceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o ServiceOutput) Dscp() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.Dscp }).(pulumi.StringPtrOutput)
}

// enum: `nonRevertable`, `none`, `revertable`
func (o ServiceOutput) FailoverPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.FailoverPolicy }).(pulumi.StringOutput)
}

// if `type`==`custom`, web filtering
func (o ServiceOutput) Hostnames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Service) pulumi.StringArrayOutput { return v.Hostnames }).(pulumi.StringArrayOutput)
}

func (o ServiceOutput) MaxJitter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.MaxJitter }).(pulumi.StringPtrOutput)
}

func (o ServiceOutput) MaxLatency() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.MaxLatency }).(pulumi.StringPtrOutput)
}

func (o ServiceOutput) MaxLoss() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Service) pulumi.StringPtrOutput { return v.MaxLoss }).(pulumi.StringPtrOutput)
}

func (o ServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o ServiceOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// whether to enable measure SLE
func (o ServiceOutput) SleEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolOutput { return v.SleEnabled }).(pulumi.BoolOutput)
}

// when `type`==`custom`, optional, if it doesn't exist, http and https is assumed
func (o ServiceOutput) Specs() ServiceSpecArrayOutput {
	return o.ApplyT(func(v *Service) ServiceSpecArrayOutput { return v.Specs }).(ServiceSpecArrayOutput)
}

func (o ServiceOutput) SsrRelaxedTcpStateEnforcement() pulumi.BoolOutput {
	return o.ApplyT(func(v *Service) pulumi.BoolOutput { return v.SsrRelaxedTcpStateEnforcement }).(pulumi.BoolOutput)
}

// when `trafficType`==`custom`. enum: `bestEffort`, `high`, `low`, `medium`
func (o ServiceOutput) TrafficClass() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.TrafficClass }).(pulumi.StringOutput)
}

// values from `/api/v1/consts/traffic_types`
func (o ServiceOutput) TrafficType() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.TrafficType }).(pulumi.StringOutput)
}

// enum: `appCategories`, `apps`, `custom`, `urls`
func (o ServiceOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Service) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// when `type`==`urls`, no need for spec as URL can encode the ports being used
func (o ServiceOutput) Urls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Service) pulumi.StringArrayOutput { return v.Urls }).(pulumi.StringArrayOutput)
}

type ServiceArrayOutput struct{ *pulumi.OutputState }

func (ServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Service)(nil)).Elem()
}

func (o ServiceArrayOutput) ToServiceArrayOutput() ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) ToServiceArrayOutputWithContext(ctx context.Context) ServiceArrayOutput {
	return o
}

func (o ServiceArrayOutput) Index(i pulumi.IntInput) ServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Service {
		return vs[0].([]*Service)[vs[1].(int)]
	}).(ServiceOutput)
}

type ServiceMapOutput struct{ *pulumi.OutputState }

func (ServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Service)(nil)).Elem()
}

func (o ServiceMapOutput) ToServiceMapOutput() ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) ToServiceMapOutputWithContext(ctx context.Context) ServiceMapOutput {
	return o
}

func (o ServiceMapOutput) MapIndex(k pulumi.StringInput) ServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Service {
		return vs[0].(map[string]*Service)[vs[1].(string)]
	}).(ServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceInput)(nil)).Elem(), &Service{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceArrayInput)(nil)).Elem(), ServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceMapInput)(nil)).Elem(), ServiceMap{})
	pulumi.RegisterOutputType(ServiceOutput{})
	pulumi.RegisterOutputType(ServiceArrayOutput{})
	pulumi.RegisterOutputType(ServiceMapOutput{})
}
