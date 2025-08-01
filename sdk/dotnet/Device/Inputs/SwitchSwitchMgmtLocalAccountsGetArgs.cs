// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Inputs
{

    public sealed class SwitchSwitchMgmtLocalAccountsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("password")]
        private Input<string>? _password;
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// enum: `admin`, `helpdesk`, `none`, `read`
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public SwitchSwitchMgmtLocalAccountsGetArgs()
        {
        }
        public static new SwitchSwitchMgmtLocalAccountsGetArgs Empty => new SwitchSwitchMgmtLocalAccountsGetArgs();
    }
}
