// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Outputs
{

    [OutputType]
    public sealed class NetworktemplateSnmpConfigV3ConfigUsmUser
    {
        /// <summary>
        /// Not required if `authentication_type`==`authentication-none`. Include alphabetic, numeric, and special characters, but it cannot include control characters.
        /// </summary>
        public readonly string? AuthenticationPassword;
        /// <summary>
        /// sha224, sha256, sha384, sha512 are supported in 21.1 and newer release. enum: `authentication-md5`, `authentication-none`, `authentication-sha`, `authentication-sha224`, `authentication-sha256`, `authentication-sha384`, `authentication-sha512`
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
        private NetworktemplateSnmpConfigV3ConfigUsmUser(
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
