// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.junipermist.device;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.junipermist.Utilities;
import com.pulumi.junipermist.device.inputs.GetApStatsArgs;
import com.pulumi.junipermist.device.inputs.GetApStatsPlainArgs;
import com.pulumi.junipermist.device.inputs.GetGatewayStatsArgs;
import com.pulumi.junipermist.device.inputs.GetGatewayStatsPlainArgs;
import com.pulumi.junipermist.device.inputs.GetSwitchStatsArgs;
import com.pulumi.junipermist.device.inputs.GetSwitchStatsPlainArgs;
import com.pulumi.junipermist.device.inputs.GetVersionsArgs;
import com.pulumi.junipermist.device.inputs.GetVersionsPlainArgs;
import com.pulumi.junipermist.device.outputs.GetApStatsResult;
import com.pulumi.junipermist.device.outputs.GetGatewayStatsResult;
import com.pulumi.junipermist.device.outputs.GetSwitchStatsResult;
import com.pulumi.junipermist.device.outputs.GetVersionsResult;
import java.util.concurrent.CompletableFuture;

public final class DeviceFunctions {
    /**
     * This data source provides the list of Wireless Access Points with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetApStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var apStats = DeviceFunctions.getApStats(GetApStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("5c5b35000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApStatsResult> getApStats(GetApStatsArgs args) {
        return getApStats(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Wireless Access Points with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetApStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var apStats = DeviceFunctions.getApStats(GetApStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("5c5b35000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApStatsResult> getApStatsPlain(GetApStatsPlainArgs args) {
        return getApStatsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Wireless Access Points with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetApStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var apStats = DeviceFunctions.getApStats(GetApStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("5c5b35000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetApStatsResult> getApStats(GetApStatsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("junipermist:device/getApStats:getApStats", TypeShape.of(GetApStatsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Wireless Access Points with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetApStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var apStats = DeviceFunctions.getApStats(GetApStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("5c5b35000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetApStatsResult> getApStatsPlain(GetApStatsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("junipermist:device/getApStats:getApStats", TypeShape.of(GetApStatsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Gateways with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetGatewayStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var gatewayStats = DeviceFunctions.getGatewayStats(GetGatewayStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("e8a245000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGatewayStatsResult> getGatewayStats(GetGatewayStatsArgs args) {
        return getGatewayStats(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Gateways with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetGatewayStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var gatewayStats = DeviceFunctions.getGatewayStats(GetGatewayStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("e8a245000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetGatewayStatsResult> getGatewayStatsPlain(GetGatewayStatsPlainArgs args) {
        return getGatewayStatsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Gateways with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetGatewayStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var gatewayStats = DeviceFunctions.getGatewayStats(GetGatewayStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("e8a245000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetGatewayStatsResult> getGatewayStats(GetGatewayStatsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("junipermist:device/getGatewayStats:getGatewayStats", TypeShape.of(GetGatewayStatsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Gateways with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetGatewayStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var gatewayStats = DeviceFunctions.getGatewayStats(GetGatewayStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("e8a245000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetGatewayStatsResult> getGatewayStatsPlain(GetGatewayStatsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("junipermist:device/getGatewayStats:getGatewayStats", TypeShape.of(GetGatewayStatsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Switches with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetSwitchStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var switchStats = DeviceFunctions.getSwitchStats(GetSwitchStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("485a0d000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .evpnUnused(true)
     *             .evpntopoId("92984e2f-94db-4cd8-9763-9cf83fbd079e")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSwitchStatsResult> getSwitchStats(GetSwitchStatsArgs args) {
        return getSwitchStats(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Switches with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetSwitchStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var switchStats = DeviceFunctions.getSwitchStats(GetSwitchStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("485a0d000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .evpnUnused(true)
     *             .evpntopoId("92984e2f-94db-4cd8-9763-9cf83fbd079e")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSwitchStatsResult> getSwitchStatsPlain(GetSwitchStatsPlainArgs args) {
        return getSwitchStatsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Switches with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetSwitchStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var switchStats = DeviceFunctions.getSwitchStats(GetSwitchStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("485a0d000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .evpnUnused(true)
     *             .evpntopoId("92984e2f-94db-4cd8-9763-9cf83fbd079e")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetSwitchStatsResult> getSwitchStats(GetSwitchStatsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("junipermist:device/getSwitchStats:getSwitchStats", TypeShape.of(GetSwitchStatsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Switches with their statistics.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetSwitchStatsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var switchStats = DeviceFunctions.getSwitchStats(GetSwitchStatsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .mac("485a0d000000")
     *             .siteId("4a422ae5-7ca0-4599-87a3-8e49aa63685f")
     *             .status("connected")
     *             .evpnUnused(true)
     *             .evpntopoId("92984e2f-94db-4cd8-9763-9cf83fbd079e")
     *             .duration("1d")
     *             .start(1736031600)
     *             .end(1736175934)
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetSwitchStatsResult> getSwitchStatsPlain(GetSwitchStatsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("junipermist:device/getSwitchStats:getSwitchStats", TypeShape.of(GetSwitchStatsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of available Firmware Versions.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetVersionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ap24Versions = DeviceFunctions.getVersions(GetVersionsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .type("ap")
     *             .model("AP24")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetVersionsResult> getVersions(GetVersionsArgs args) {
        return getVersions(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of available Firmware Versions.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetVersionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ap24Versions = DeviceFunctions.getVersions(GetVersionsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .type("ap")
     *             .model("AP24")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetVersionsResult> getVersionsPlain(GetVersionsPlainArgs args) {
        return getVersionsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of available Firmware Versions.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetVersionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ap24Versions = DeviceFunctions.getVersions(GetVersionsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .type("ap")
     *             .model("AP24")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetVersionsResult> getVersions(GetVersionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("junipermist:device/getVersions:getVersions", TypeShape.of(GetVersionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of available Firmware Versions.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.junipermist.device.DeviceFunctions;
     * import com.pulumi.junipermist.device.inputs.GetVersionsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var ap24Versions = DeviceFunctions.getVersions(GetVersionsArgs.builder()
     *             .orgId("15fca2ac-b1a6-47cc-9953-cc6906281550")
     *             .type("ap")
     *             .model("AP24")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetVersionsResult> getVersionsPlain(GetVersionsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("junipermist:device/getVersions:getVersions", TypeShape.of(GetVersionsResult.class), args, Utilities.withVersion(options));
    }
}
