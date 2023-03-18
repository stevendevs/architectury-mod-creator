package @PACKAGE@;

import dev.architectury.injectables.annotations.ExpectPlatform;
import @ARCHITECTURY_PACKAGE@.platform.Platform;

import java.nio.file.Path;

public class @Name@ExpectPlatform {
    /**
     * We can use {@link Platform#getConfigFolder()} but this is just an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
<<<<<<<< HEAD:templates/architectury/common/src/main/java/@PACKAGE@/@Name@ExpectPlatform.java
     * Expect: @PACKAGE@.@Name@ExpectPlatform#getConfigDirectory()
     * Actual Fabric: @PACKAGE@.fabric.@Name@ExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: @PACKAGE@.forge.@Name@ExpectPlatformImpl#getConfigDirectory()
========
     * Expect: @PACKAGE@.ExampleExpectPlatform#getConfigDirectory()
     * Actual Fabric: @PACKAGE@.fabric.ExampleExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: @PACKAGE@.forge.ExampleExpectPlatformImpl#getConfigDirectory()
>>>>>>>> origin/master:templates/architectury/common/src/main/java/@PACKAGE@/ExampleExpectPlatform.java
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
