// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("notifies")]
        private InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyGetArgs>? _notifies;
        public InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyGetArgs> Notifies
        {
            get => _notifies ?? (_notifies = new InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyGetArgs>());
            set => _notifies = value;
        }

        [Input("notifyFilters")]
        private InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyFilterGetArgs>? _notifyFilters;
        public InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyFilterGetArgs> NotifyFilters
        {
            get => _notifyFilters ?? (_notifyFilters = new InputList<Inputs.NetworktemplateSnmpConfigV3ConfigNotifyFilterGetArgs>());
            set => _notifyFilters = value;
        }

        [Input("targetAddresses")]
        private InputList<Inputs.NetworktemplateSnmpConfigV3ConfigTargetAddressGetArgs>? _targetAddresses;
        public InputList<Inputs.NetworktemplateSnmpConfigV3ConfigTargetAddressGetArgs> TargetAddresses
        {
            get => _targetAddresses ?? (_targetAddresses = new InputList<Inputs.NetworktemplateSnmpConfigV3ConfigTargetAddressGetArgs>());
            set => _targetAddresses = value;
        }

        [Input("targetParameters")]
        private InputList<Inputs.NetworktemplateSnmpConfigV3ConfigTargetParameterGetArgs>? _targetParameters;
        public InputList<Inputs.NetworktemplateSnmpConfigV3ConfigTargetParameterGetArgs> TargetParameters
        {
            get => _targetParameters ?? (_targetParameters = new InputList<Inputs.NetworktemplateSnmpConfigV3ConfigTargetParameterGetArgs>());
            set => _targetParameters = value;
        }

        [Input("usms")]
        private InputList<Inputs.NetworktemplateSnmpConfigV3ConfigUsmGetArgs>? _usms;
        public InputList<Inputs.NetworktemplateSnmpConfigV3ConfigUsmGetArgs> Usms
        {
            get => _usms ?? (_usms = new InputList<Inputs.NetworktemplateSnmpConfigV3ConfigUsmGetArgs>());
            set => _usms = value;
        }

        [Input("vacm")]
        public Input<Inputs.NetworktemplateSnmpConfigV3ConfigVacmGetArgs>? Vacm { get; set; }

        public NetworktemplateSnmpConfigV3ConfigGetArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigGetArgs Empty => new NetworktemplateSnmpConfigV3ConfigGetArgs();
    }
}
