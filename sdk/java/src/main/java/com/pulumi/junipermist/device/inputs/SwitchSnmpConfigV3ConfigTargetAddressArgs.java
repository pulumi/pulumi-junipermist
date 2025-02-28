// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwitchSnmpConfigV3ConfigTargetAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchSnmpConfigV3ConfigTargetAddressArgs Empty = new SwitchSnmpConfigV3ConfigTargetAddressArgs();

    @Import(name="address", required=true)
    private Output<String> address;

    public Output<String> address() {
        return this.address;
    }

    @Import(name="addressMask", required=true)
    private Output<String> addressMask;

    public Output<String> addressMask() {
        return this.addressMask;
    }

    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Refer to notify tag, can be multiple with blank
     * 
     */
    @Import(name="tagList")
    private @Nullable Output<String> tagList;

    /**
     * @return Refer to notify tag, can be multiple with blank
     * 
     */
    public Optional<Output<String>> tagList() {
        return Optional.ofNullable(this.tagList);
    }

    @Import(name="targetAddressName", required=true)
    private Output<String> targetAddressName;

    public Output<String> targetAddressName() {
        return this.targetAddressName;
    }

    /**
     * Refer to notify target parameters name
     * 
     */
    @Import(name="targetParameters")
    private @Nullable Output<String> targetParameters;

    /**
     * @return Refer to notify target parameters name
     * 
     */
    public Optional<Output<String>> targetParameters() {
        return Optional.ofNullable(this.targetParameters);
    }

    private SwitchSnmpConfigV3ConfigTargetAddressArgs() {}

    private SwitchSnmpConfigV3ConfigTargetAddressArgs(SwitchSnmpConfigV3ConfigTargetAddressArgs $) {
        this.address = $.address;
        this.addressMask = $.addressMask;
        this.port = $.port;
        this.tagList = $.tagList;
        this.targetAddressName = $.targetAddressName;
        this.targetParameters = $.targetParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchSnmpConfigV3ConfigTargetAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchSnmpConfigV3ConfigTargetAddressArgs $;

        public Builder() {
            $ = new SwitchSnmpConfigV3ConfigTargetAddressArgs();
        }

        public Builder(SwitchSnmpConfigV3ConfigTargetAddressArgs defaults) {
            $ = new SwitchSnmpConfigV3ConfigTargetAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder addressMask(Output<String> addressMask) {
            $.addressMask = addressMask;
            return this;
        }

        public Builder addressMask(String addressMask) {
            return addressMask(Output.of(addressMask));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        /**
         * @param tagList Refer to notify tag, can be multiple with blank
         * 
         * @return builder
         * 
         */
        public Builder tagList(@Nullable Output<String> tagList) {
            $.tagList = tagList;
            return this;
        }

        /**
         * @param tagList Refer to notify tag, can be multiple with blank
         * 
         * @return builder
         * 
         */
        public Builder tagList(String tagList) {
            return tagList(Output.of(tagList));
        }

        public Builder targetAddressName(Output<String> targetAddressName) {
            $.targetAddressName = targetAddressName;
            return this;
        }

        public Builder targetAddressName(String targetAddressName) {
            return targetAddressName(Output.of(targetAddressName));
        }

        /**
         * @param targetParameters Refer to notify target parameters name
         * 
         * @return builder
         * 
         */
        public Builder targetParameters(@Nullable Output<String> targetParameters) {
            $.targetParameters = targetParameters;
            return this;
        }

        /**
         * @param targetParameters Refer to notify target parameters name
         * 
         * @return builder
         * 
         */
        public Builder targetParameters(String targetParameters) {
            return targetParameters(Output.of(targetParameters));
        }

        public SwitchSnmpConfigV3ConfigTargetAddressArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("SwitchSnmpConfigV3ConfigTargetAddressArgs", "address");
            }
            if ($.addressMask == null) {
                throw new MissingRequiredPropertyException("SwitchSnmpConfigV3ConfigTargetAddressArgs", "addressMask");
            }
            if ($.targetAddressName == null) {
                throw new MissingRequiredPropertyException("SwitchSnmpConfigV3ConfigTargetAddressArgs", "targetAddressName");
            }
            return $;
        }
    }

}
