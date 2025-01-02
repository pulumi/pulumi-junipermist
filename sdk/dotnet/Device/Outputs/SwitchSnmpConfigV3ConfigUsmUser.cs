// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Device.Outputs
{

    [OutputType]
    public sealed class SwitchSnmpConfigV3ConfigUsmUser
    {
        /// <summary>
        /// Not required if `authentication_type`==`authentication_none`. Include alphabetic, numeric, and special characters, but it cannot include control characters.
        /// </summary>
        public readonly string? AuthenticationPassword;
        /// <summary>
        /// sha224, sha256, sha384, sha512 are supported in 21.1 and newer release. enum: `authentication_md5`, `authentication_none`, `authentication_sha`, `authentication_sha224`, `authentication_sha256`, `authentication_sha384`, `authentication_sha512`
        /// </summary>
        public readonly string? AuthenticationType;
        /// <summary>
        /// Not required if `encryption_type`==`privacy-none`. Include alphabetic, numeric, and special characters, but it cannot include control characters
        /// </summary>
        public readonly string? EncryptionPassword;
        /// <summary>
        /// enum: `privacy-3des`, `privacy-aes128`, `privacy-des`, `privacy-none`
        /// </summary>
        public readonly string? EncryptionType;
        public readonly string? Name;

        [OutputConstructor]
        private SwitchSnmpConfigV3ConfigUsmUser(
            string? authenticationPassword,

            string? authenticationType,

            string? encryptionPassword,

            string? encryptionType,

            string? name)
        {
            AuthenticationPassword = authenticationPassword;
            AuthenticationType = authenticationType;
            EncryptionPassword = encryptionPassword;
            EncryptionType = encryptionType;
            Name = name;
        }
    }
}
