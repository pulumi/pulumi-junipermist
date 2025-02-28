// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Site.Inputs
{

    public sealed class NetworktemplateSnmpConfigV3ConfigUsmUserGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authenticationPassword")]
        private Input<string>? _authenticationPassword;

        /// <summary>
        /// Not required if `authentication_type`==`authentication-none`. Include alphabetic, numeric, and special characters, but it cannot include control characters.
        /// </summary>
        public Input<string>? AuthenticationPassword
        {
            get => _authenticationPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authenticationPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// sha224, sha256, sha384, sha512 are supported in 21.1 and newer release. enum: `authentication-md5`, `authentication-none`, `authentication-sha`, `authentication-sha224`, `authentication-sha256`, `authentication-sha384`, `authentication-sha512`
        /// </summary>
        [Input("authenticationType")]
        public Input<string>? AuthenticationType { get; set; }

        [Input("encryptionPassword")]
        private Input<string>? _encryptionPassword;

        /// <summary>
        /// Not required if `encryption_type`==`privacy-none`. Include alphabetic, numeric, and special characters, but it cannot include control characters
        /// </summary>
        public Input<string>? EncryptionPassword
        {
            get => _encryptionPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _encryptionPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// enum: `privacy-3des`, `privacy-aes128`, `privacy-des`, `privacy-none`
        /// </summary>
        [Input("encryptionType")]
        public Input<string>? EncryptionType { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public NetworktemplateSnmpConfigV3ConfigUsmUserGetArgs()
        {
        }
        public static new NetworktemplateSnmpConfigV3ConfigUsmUserGetArgs Empty => new NetworktemplateSnmpConfigV3ConfigUsmUserGetArgs();
    }
}
