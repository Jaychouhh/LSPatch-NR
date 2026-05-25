package org.lsposed.lspatch.share;

public class PatchConfig {

    public final boolean useManager;
    public final boolean debuggable;
    public final boolean overrideVersionCode;
    public final boolean noRedirect;
    public final String appComponentFactory;
    public final LSPConfig lspConfig;

    public PatchConfig(
            boolean useManager,
            boolean debuggable,
            boolean overrideVersionCode,
            boolean noRedirect,
            String appComponentFactory
    ) {
        this.useManager = useManager;
        this.debuggable = debuggable;
        this.overrideVersionCode = overrideVersionCode;
        this.noRedirect = noRedirect;
        this.appComponentFactory = appComponentFactory;
        this.lspConfig = LSPConfig.instance;
    }
}
