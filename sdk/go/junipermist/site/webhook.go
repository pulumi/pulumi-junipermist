// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package site

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource manages Site Webhooks.
//
// A Site Webhook is a configuration that allows real-time events and data from a specific site to be pushed to a provided url.\
// It enables the collection of information about various topics such as device events, alarms, audits, client sessions and location updates at the site level.\
// The Webhook can be set up and customized using the Mist API, allowing users to receive and analyze specific data from a particular site.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-junipermist/sdk/go/junipermist/site"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := site.NewWebhook(ctx, "webhook_one", &site.WebhookArgs{
//				SiteId:     pulumi.Any(terraformSite.Id),
//				Name:       pulumi.String("webhook_one"),
//				Type:       pulumi.String("http-post"),
//				Url:        pulumi.String("https://myserver.com:4321/"),
//				VerifyCert: pulumi.Bool(false),
//				Enabled:    pulumi.Bool(true),
//				Topics: pulumi.StringArray{
//					pulumi.String("device-events"),
//					pulumi.String("alarms"),
//					pulumi.String("audits"),
//					pulumi.String("client-join"),
//					pulumi.String("client-info"),
//					pulumi.String("client-sessions"),
//					pulumi.String("device-updowns"),
//					pulumi.String("mxedge-events"),
//					pulumi.String("nac-events"),
//					pulumi.String("nac-accounting"),
//				},
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
// Using `pulumi import`, import `mist_site_webhook` with:
//
// Site Webhook can be imported by specifying the site_id and the webhook_id
//
// ```sh
// $ pulumi import junipermist:site/webhook:Webhook webhook_one 17b46405-3a6d-4715-8bb4-6bb6d06f316a.d3c42998-9012-4859-9743-6b9bee475309
// ```
type Webhook struct {
	pulumi.CustomResourceState

	// whether webhook is enabled
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// if `type`=`http-post`, additional custom HTTP headers to add
	// the headers name and value must be string, total bytes of headers name and value must be less than 1000
	Headers pulumi.StringMapOutput `pulumi:"headers"`
	// name of the webhook
	Name pulumi.StringOutput `pulumi:"name"`
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientId pulumi.StringPtrOutput `pulumi:"oauth2ClientId"`
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientSecret pulumi.StringPtrOutput `pulumi:"oauth2ClientSecret"`
	// required when `type`==`oauth2`. enum: `clientCredentials`, `password`
	Oauth2GrantType pulumi.StringPtrOutput `pulumi:"oauth2GrantType"`
	// required when `oauth2GrantType`==`password`
	Oauth2Password pulumi.StringPtrOutput `pulumi:"oauth2Password"`
	// required when `type`==`oauth2`, if provided, will be used in the token request
	Oauth2Scopes pulumi.StringArrayOutput `pulumi:"oauth2Scopes"`
	// required when `type`==`oauth2`
	Oauth2TokenUrl pulumi.StringPtrOutput `pulumi:"oauth2TokenUrl"`
	// required when `oauth2GrantType`==`password`
	Oauth2Username pulumi.StringPtrOutput `pulumi:"oauth2Username"`
	OrgId          pulumi.StringOutput    `pulumi:"orgId"`
	// only if `type`=`http-post`
	Secret pulumi.StringPtrOutput `pulumi:"secret"`
	SiteId pulumi.StringOutput    `pulumi:"siteId"`
	// required if `type`=`splunk` If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if the
	// webhook receiver is configured to accept it.'
	SplunkToken pulumi.StringPtrOutput `pulumi:"splunkToken"`
	// enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
	Topics pulumi.StringArrayOutput `pulumi:"topics"`
	// enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
	Type pulumi.StringOutput `pulumi:"type"`
	Url  pulumi.StringOutput `pulumi:"url"`
	// when url uses HTTPS, whether to verify the certificate
	VerifyCert pulumi.BoolOutput `pulumi:"verifyCert"`
}

// NewWebhook registers a new resource with the given unique name, arguments, and options.
func NewWebhook(ctx *pulumi.Context,
	name string, args *WebhookArgs, opts ...pulumi.ResourceOption) (*Webhook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SiteId == nil {
		return nil, errors.New("invalid value for required argument 'SiteId'")
	}
	if args.Topics == nil {
		return nil, errors.New("invalid value for required argument 'Topics'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	if args.Oauth2ClientSecret != nil {
		args.Oauth2ClientSecret = pulumi.ToSecret(args.Oauth2ClientSecret).(pulumi.StringPtrInput)
	}
	if args.Oauth2Password != nil {
		args.Oauth2Password = pulumi.ToSecret(args.Oauth2Password).(pulumi.StringPtrInput)
	}
	if args.Secret != nil {
		args.Secret = pulumi.ToSecret(args.Secret).(pulumi.StringPtrInput)
	}
	if args.SplunkToken != nil {
		args.SplunkToken = pulumi.ToSecret(args.SplunkToken).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"oauth2ClientSecret",
		"oauth2Password",
		"secret",
		"splunkToken",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Webhook
	err := ctx.RegisterResource("junipermist:site/webhook:Webhook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebhook gets an existing Webhook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebhook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebhookState, opts ...pulumi.ResourceOption) (*Webhook, error) {
	var resource Webhook
	err := ctx.ReadResource("junipermist:site/webhook:Webhook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Webhook resources.
type webhookState struct {
	// whether webhook is enabled
	Enabled *bool `pulumi:"enabled"`
	// if `type`=`http-post`, additional custom HTTP headers to add
	// the headers name and value must be string, total bytes of headers name and value must be less than 1000
	Headers map[string]string `pulumi:"headers"`
	// name of the webhook
	Name *string `pulumi:"name"`
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientId *string `pulumi:"oauth2ClientId"`
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientSecret *string `pulumi:"oauth2ClientSecret"`
	// required when `type`==`oauth2`. enum: `clientCredentials`, `password`
	Oauth2GrantType *string `pulumi:"oauth2GrantType"`
	// required when `oauth2GrantType`==`password`
	Oauth2Password *string `pulumi:"oauth2Password"`
	// required when `type`==`oauth2`, if provided, will be used in the token request
	Oauth2Scopes []string `pulumi:"oauth2Scopes"`
	// required when `type`==`oauth2`
	Oauth2TokenUrl *string `pulumi:"oauth2TokenUrl"`
	// required when `oauth2GrantType`==`password`
	Oauth2Username *string `pulumi:"oauth2Username"`
	OrgId          *string `pulumi:"orgId"`
	// only if `type`=`http-post`
	Secret *string `pulumi:"secret"`
	SiteId *string `pulumi:"siteId"`
	// required if `type`=`splunk` If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if the
	// webhook receiver is configured to accept it.'
	SplunkToken *string `pulumi:"splunkToken"`
	// enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
	Topics []string `pulumi:"topics"`
	// enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
	Type *string `pulumi:"type"`
	Url  *string `pulumi:"url"`
	// when url uses HTTPS, whether to verify the certificate
	VerifyCert *bool `pulumi:"verifyCert"`
}

type WebhookState struct {
	// whether webhook is enabled
	Enabled pulumi.BoolPtrInput
	// if `type`=`http-post`, additional custom HTTP headers to add
	// the headers name and value must be string, total bytes of headers name and value must be less than 1000
	Headers pulumi.StringMapInput
	// name of the webhook
	Name pulumi.StringPtrInput
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientId pulumi.StringPtrInput
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientSecret pulumi.StringPtrInput
	// required when `type`==`oauth2`. enum: `clientCredentials`, `password`
	Oauth2GrantType pulumi.StringPtrInput
	// required when `oauth2GrantType`==`password`
	Oauth2Password pulumi.StringPtrInput
	// required when `type`==`oauth2`, if provided, will be used in the token request
	Oauth2Scopes pulumi.StringArrayInput
	// required when `type`==`oauth2`
	Oauth2TokenUrl pulumi.StringPtrInput
	// required when `oauth2GrantType`==`password`
	Oauth2Username pulumi.StringPtrInput
	OrgId          pulumi.StringPtrInput
	// only if `type`=`http-post`
	Secret pulumi.StringPtrInput
	SiteId pulumi.StringPtrInput
	// required if `type`=`splunk` If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if the
	// webhook receiver is configured to accept it.'
	SplunkToken pulumi.StringPtrInput
	// enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
	Topics pulumi.StringArrayInput
	// enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
	Type pulumi.StringPtrInput
	Url  pulumi.StringPtrInput
	// when url uses HTTPS, whether to verify the certificate
	VerifyCert pulumi.BoolPtrInput
}

func (WebhookState) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookState)(nil)).Elem()
}

type webhookArgs struct {
	// whether webhook is enabled
	Enabled *bool `pulumi:"enabled"`
	// if `type`=`http-post`, additional custom HTTP headers to add
	// the headers name and value must be string, total bytes of headers name and value must be less than 1000
	Headers map[string]string `pulumi:"headers"`
	// name of the webhook
	Name *string `pulumi:"name"`
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientId *string `pulumi:"oauth2ClientId"`
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientSecret *string `pulumi:"oauth2ClientSecret"`
	// required when `type`==`oauth2`. enum: `clientCredentials`, `password`
	Oauth2GrantType *string `pulumi:"oauth2GrantType"`
	// required when `oauth2GrantType`==`password`
	Oauth2Password *string `pulumi:"oauth2Password"`
	// required when `type`==`oauth2`, if provided, will be used in the token request
	Oauth2Scopes []string `pulumi:"oauth2Scopes"`
	// required when `type`==`oauth2`
	Oauth2TokenUrl *string `pulumi:"oauth2TokenUrl"`
	// required when `oauth2GrantType`==`password`
	Oauth2Username *string `pulumi:"oauth2Username"`
	// only if `type`=`http-post`
	Secret *string `pulumi:"secret"`
	SiteId string  `pulumi:"siteId"`
	// required if `type`=`splunk` If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if the
	// webhook receiver is configured to accept it.'
	SplunkToken *string `pulumi:"splunkToken"`
	// enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
	Topics []string `pulumi:"topics"`
	// enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
	Type *string `pulumi:"type"`
	Url  string  `pulumi:"url"`
	// when url uses HTTPS, whether to verify the certificate
	VerifyCert *bool `pulumi:"verifyCert"`
}

// The set of arguments for constructing a Webhook resource.
type WebhookArgs struct {
	// whether webhook is enabled
	Enabled pulumi.BoolPtrInput
	// if `type`=`http-post`, additional custom HTTP headers to add
	// the headers name and value must be string, total bytes of headers name and value must be less than 1000
	Headers pulumi.StringMapInput
	// name of the webhook
	Name pulumi.StringPtrInput
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientId pulumi.StringPtrInput
	// required when `oauth2GrantType`==`clientCredentials`
	Oauth2ClientSecret pulumi.StringPtrInput
	// required when `type`==`oauth2`. enum: `clientCredentials`, `password`
	Oauth2GrantType pulumi.StringPtrInput
	// required when `oauth2GrantType`==`password`
	Oauth2Password pulumi.StringPtrInput
	// required when `type`==`oauth2`, if provided, will be used in the token request
	Oauth2Scopes pulumi.StringArrayInput
	// required when `type`==`oauth2`
	Oauth2TokenUrl pulumi.StringPtrInput
	// required when `oauth2GrantType`==`password`
	Oauth2Username pulumi.StringPtrInput
	// only if `type`=`http-post`
	Secret pulumi.StringPtrInput
	SiteId pulumi.StringInput
	// required if `type`=`splunk` If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if the
	// webhook receiver is configured to accept it.'
	SplunkToken pulumi.StringPtrInput
	// enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
	Topics pulumi.StringArrayInput
	// enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
	Type pulumi.StringPtrInput
	Url  pulumi.StringInput
	// when url uses HTTPS, whether to verify the certificate
	VerifyCert pulumi.BoolPtrInput
}

func (WebhookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webhookArgs)(nil)).Elem()
}

type WebhookInput interface {
	pulumi.Input

	ToWebhookOutput() WebhookOutput
	ToWebhookOutputWithContext(ctx context.Context) WebhookOutput
}

func (*Webhook) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (i *Webhook) ToWebhookOutput() WebhookOutput {
	return i.ToWebhookOutputWithContext(context.Background())
}

func (i *Webhook) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookOutput)
}

// WebhookArrayInput is an input type that accepts WebhookArray and WebhookArrayOutput values.
// You can construct a concrete instance of `WebhookArrayInput` via:
//
//	WebhookArray{ WebhookArgs{...} }
type WebhookArrayInput interface {
	pulumi.Input

	ToWebhookArrayOutput() WebhookArrayOutput
	ToWebhookArrayOutputWithContext(context.Context) WebhookArrayOutput
}

type WebhookArray []WebhookInput

func (WebhookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (i WebhookArray) ToWebhookArrayOutput() WebhookArrayOutput {
	return i.ToWebhookArrayOutputWithContext(context.Background())
}

func (i WebhookArray) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookArrayOutput)
}

// WebhookMapInput is an input type that accepts WebhookMap and WebhookMapOutput values.
// You can construct a concrete instance of `WebhookMapInput` via:
//
//	WebhookMap{ "key": WebhookArgs{...} }
type WebhookMapInput interface {
	pulumi.Input

	ToWebhookMapOutput() WebhookMapOutput
	ToWebhookMapOutputWithContext(context.Context) WebhookMapOutput
}

type WebhookMap map[string]WebhookInput

func (WebhookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (i WebhookMap) ToWebhookMapOutput() WebhookMapOutput {
	return i.ToWebhookMapOutputWithContext(context.Background())
}

func (i WebhookMap) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebhookMapOutput)
}

type WebhookOutput struct{ *pulumi.OutputState }

func (WebhookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Webhook)(nil)).Elem()
}

func (o WebhookOutput) ToWebhookOutput() WebhookOutput {
	return o
}

func (o WebhookOutput) ToWebhookOutputWithContext(ctx context.Context) WebhookOutput {
	return o
}

// whether webhook is enabled
func (o WebhookOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Webhook) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// if `type`=`http-post`, additional custom HTTP headers to add
// the headers name and value must be string, total bytes of headers name and value must be less than 1000
func (o WebhookOutput) Headers() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringMapOutput { return v.Headers }).(pulumi.StringMapOutput)
}

// name of the webhook
func (o WebhookOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// required when `oauth2GrantType`==`clientCredentials`
func (o WebhookOutput) Oauth2ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.Oauth2ClientId }).(pulumi.StringPtrOutput)
}

// required when `oauth2GrantType`==`clientCredentials`
func (o WebhookOutput) Oauth2ClientSecret() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.Oauth2ClientSecret }).(pulumi.StringPtrOutput)
}

// required when `type`==`oauth2`. enum: `clientCredentials`, `password`
func (o WebhookOutput) Oauth2GrantType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.Oauth2GrantType }).(pulumi.StringPtrOutput)
}

// required when `oauth2GrantType`==`password`
func (o WebhookOutput) Oauth2Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.Oauth2Password }).(pulumi.StringPtrOutput)
}

// required when `type`==`oauth2`, if provided, will be used in the token request
func (o WebhookOutput) Oauth2Scopes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringArrayOutput { return v.Oauth2Scopes }).(pulumi.StringArrayOutput)
}

// required when `type`==`oauth2`
func (o WebhookOutput) Oauth2TokenUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.Oauth2TokenUrl }).(pulumi.StringPtrOutput)
}

// required when `oauth2GrantType`==`password`
func (o WebhookOutput) Oauth2Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.Oauth2Username }).(pulumi.StringPtrOutput)
}

func (o WebhookOutput) OrgId() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.OrgId }).(pulumi.StringOutput)
}

// only if `type`=`http-post`
func (o WebhookOutput) Secret() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.Secret }).(pulumi.StringPtrOutput)
}

func (o WebhookOutput) SiteId() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.SiteId }).(pulumi.StringOutput)
}

// required if `type`=`splunk` If splunkToken is not defined for a type Splunk webhook, it will not send, regardless if the
// webhook receiver is configured to accept it.'
func (o WebhookOutput) SplunkToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringPtrOutput { return v.SplunkToken }).(pulumi.StringPtrOutput)
}

// enum: `alarms`, `asset-raw`, `asset-raw-rssi`, `audits`, `client-info`, `client-join`, `client-latency`, `client-sessions`, `device-updowns`, `device-events`, `discovered-raw-rssi`, `location`, `locationAsset`, `locationCentrak`, `locationClient`, `locationSdk`, `locationUnclient`, `mxedge-events`, `nac-accounting`, `nacEvents`, `occupancy-alerts`, `rssizone`, `sdkclientScanData`, `siteSle`, `vbeacon`, `wifi-conn-raw`, `wifi-unconn-raw`, `zone`
func (o WebhookOutput) Topics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringArrayOutput { return v.Topics }).(pulumi.StringArrayOutput)
}

// enum: `aws-sns`, `google-pubsub`, `http-post`, `oauth2`, `splunk`
func (o WebhookOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

func (o WebhookOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Webhook) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// when url uses HTTPS, whether to verify the certificate
func (o WebhookOutput) VerifyCert() pulumi.BoolOutput {
	return o.ApplyT(func(v *Webhook) pulumi.BoolOutput { return v.VerifyCert }).(pulumi.BoolOutput)
}

type WebhookArrayOutput struct{ *pulumi.OutputState }

func (WebhookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Webhook)(nil)).Elem()
}

func (o WebhookArrayOutput) ToWebhookArrayOutput() WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) ToWebhookArrayOutputWithContext(ctx context.Context) WebhookArrayOutput {
	return o
}

func (o WebhookArrayOutput) Index(i pulumi.IntInput) WebhookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].([]*Webhook)[vs[1].(int)]
	}).(WebhookOutput)
}

type WebhookMapOutput struct{ *pulumi.OutputState }

func (WebhookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Webhook)(nil)).Elem()
}

func (o WebhookMapOutput) ToWebhookMapOutput() WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) ToWebhookMapOutputWithContext(ctx context.Context) WebhookMapOutput {
	return o
}

func (o WebhookMapOutput) MapIndex(k pulumi.StringInput) WebhookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Webhook {
		return vs[0].(map[string]*Webhook)[vs[1].(string)]
	}).(WebhookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookInput)(nil)).Elem(), &Webhook{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookArrayInput)(nil)).Elem(), WebhookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebhookMapInput)(nil)).Elem(), WebhookMap{})
	pulumi.RegisterOutputType(WebhookOutput{})
	pulumi.RegisterOutputType(WebhookArrayOutput{})
	pulumi.RegisterOutputType(WebhookMapOutput{})
}
