// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class SettingJunosShellAccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// enum: `admin`, `viewer`, `none`
        /// </summary>
        [Input("admin")]
        public Input<string>? Admin { get; set; }

        /// <summary>
        /// enum: `admin`, `viewer`, `none`
        /// </summary>
        [Input("helpdesk")]
        public Input<string>? Helpdesk { get; set; }

        /// <summary>
        /// enum: `admin`, `viewer`, `none`
        /// </summary>
        [Input("read")]
        public Input<string>? Read { get; set; }

        /// <summary>
        /// enum: `admin`, `viewer`, `none`
        /// </summary>
        [Input("write")]
        public Input<string>? Write { get; set; }

        public SettingJunosShellAccessGetArgs()
        {
        }
        public static new SettingJunosShellAccessGetArgs Empty => new SettingJunosShellAccessGetArgs();
    }
}
