// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingPasswordPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the policy is enabled
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// password expiry in days
        /// </summary>
        [Input("expiryInDays")]
        public Input<int>? ExpiryInDays { get; set; }

        /// <summary>
        /// Required password length
        /// </summary>
        [Input("minLength")]
        public Input<int>? MinLength { get; set; }

        /// <summary>
        /// Whether to require special character
        /// </summary>
        [Input("requiresSpecialChar")]
        public Input<bool>? RequiresSpecialChar { get; set; }

        /// <summary>
        /// Whether to require two-factor auth
        /// </summary>
        [Input("requiresTwoFactorAuth")]
        public Input<bool>? RequiresTwoFactorAuth { get; set; }

        public SettingPasswordPolicyArgs()
        {
        }
        public static new SettingPasswordPolicyArgs Empty => new SettingPasswordPolicyArgs();
    }
}
