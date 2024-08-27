// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { BaseArgs, BaseState } from "./base";
export type Base = import("./base").Base;
export const Base: typeof import("./base").Base = null as any;
utilities.lazyLoad(exports, ["Base"], () => require("./base"));

export { GetPsksArgs, GetPsksResult, GetPsksOutputArgs } from "./getPsks";
export const getPsks: typeof import("./getPsks").getPsks = null as any;
export const getPsksOutput: typeof import("./getPsks").getPsksOutput = null as any;
utilities.lazyLoad(exports, ["getPsks","getPsksOutput"], () => require("./getPsks"));

export { GetWebhooksArgs, GetWebhooksResult, GetWebhooksOutputArgs } from "./getWebhooks";
export const getWebhooks: typeof import("./getWebhooks").getWebhooks = null as any;
export const getWebhooksOutput: typeof import("./getWebhooks").getWebhooksOutput = null as any;
utilities.lazyLoad(exports, ["getWebhooks","getWebhooksOutput"], () => require("./getWebhooks"));

export { NetworktemplateArgs, NetworktemplateState } from "./networktemplate";
export type Networktemplate = import("./networktemplate").Networktemplate;
export const Networktemplate: typeof import("./networktemplate").Networktemplate = null as any;
utilities.lazyLoad(exports, ["Networktemplate"], () => require("./networktemplate"));

export { PskArgs, PskState } from "./psk";
export type Psk = import("./psk").Psk;
export const Psk: typeof import("./psk").Psk = null as any;
utilities.lazyLoad(exports, ["Psk"], () => require("./psk"));

export { SettingArgs, SettingState } from "./setting";
export type Setting = import("./setting").Setting;
export const Setting: typeof import("./setting").Setting = null as any;
utilities.lazyLoad(exports, ["Setting"], () => require("./setting"));

export { WebhookArgs, WebhookState } from "./webhook";
export type Webhook = import("./webhook").Webhook;
export const Webhook: typeof import("./webhook").Webhook = null as any;
utilities.lazyLoad(exports, ["Webhook"], () => require("./webhook"));

export { WlanArgs, WlanState } from "./wlan";
export type Wlan = import("./wlan").Wlan;
export const Wlan: typeof import("./wlan").Wlan = null as any;
utilities.lazyLoad(exports, ["Wlan"], () => require("./wlan"));

export { WxruleArgs, WxruleState } from "./wxrule";
export type Wxrule = import("./wxrule").Wxrule;
export const Wxrule: typeof import("./wxrule").Wxrule = null as any;
utilities.lazyLoad(exports, ["Wxrule"], () => require("./wxrule"));

export { WxtagArgs, WxtagState } from "./wxtag";
export type Wxtag = import("./wxtag").Wxtag;
export const Wxtag: typeof import("./wxtag").Wxtag = null as any;
utilities.lazyLoad(exports, ["Wxtag"], () => require("./wxtag"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "junipermist:site/base:base":
                return new Base(name, <any>undefined, { urn })
            case "junipermist:site/networktemplate:Networktemplate":
                return new Networktemplate(name, <any>undefined, { urn })
            case "junipermist:site/psk:Psk":
                return new Psk(name, <any>undefined, { urn })
            case "junipermist:site/setting:Setting":
                return new Setting(name, <any>undefined, { urn })
            case "junipermist:site/webhook:Webhook":
                return new Webhook(name, <any>undefined, { urn })
            case "junipermist:site/wlan:Wlan":
                return new Wlan(name, <any>undefined, { urn })
            case "junipermist:site/wxrule:Wxrule":
                return new Wxrule(name, <any>undefined, { urn })
            case "junipermist:site/wxtag:Wxtag":
                return new Wxtag(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("junipermist", "site/base", _module)
pulumi.runtime.registerResourceModule("junipermist", "site/networktemplate", _module)
pulumi.runtime.registerResourceModule("junipermist", "site/psk", _module)
pulumi.runtime.registerResourceModule("junipermist", "site/setting", _module)
pulumi.runtime.registerResourceModule("junipermist", "site/webhook", _module)
pulumi.runtime.registerResourceModule("junipermist", "site/wlan", _module)
pulumi.runtime.registerResourceModule("junipermist", "site/wxrule", _module)
pulumi.runtime.registerResourceModule("junipermist", "site/wxtag", _module)
