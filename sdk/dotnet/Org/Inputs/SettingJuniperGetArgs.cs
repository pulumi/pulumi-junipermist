// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingJuniperGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accounts")]
        private InputList<Inputs.SettingJuniperAccountGetArgs>? _accounts;
        public InputList<Inputs.SettingJuniperAccountGetArgs> Accounts
        {
            get => _accounts ?? (_accounts = new InputList<Inputs.SettingJuniperAccountGetArgs>());
            set => _accounts = value;
        }

        public SettingJuniperGetArgs()
        {
        }
        public static new SettingJuniperGetArgs Empty => new SettingJuniperGetArgs();
    }
}