// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.JuniperMist.Org.Inputs
{

    public sealed class IdpprofileOverwriteMatchingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("attackNames")]
        private InputList<string>? _attackNames;
        public InputList<string> AttackNames
        {
            get => _attackNames ?? (_attackNames = new InputList<string>());
            set => _attackNames = value;
        }

        [Input("dstSubnets")]
        private InputList<string>? _dstSubnets;
        public InputList<string> DstSubnets
        {
            get => _dstSubnets ?? (_dstSubnets = new InputList<string>());
            set => _dstSubnets = value;
        }

        [Input("severities")]
        private InputList<string>? _severities;
        public InputList<string> Severities
        {
            get => _severities ?? (_severities = new InputList<string>());
            set => _severities = value;
        }

        public IdpprofileOverwriteMatchingGetArgs()
        {
        }
        public static new IdpprofileOverwriteMatchingGetArgs Empty => new IdpprofileOverwriteMatchingGetArgs();
    }
}