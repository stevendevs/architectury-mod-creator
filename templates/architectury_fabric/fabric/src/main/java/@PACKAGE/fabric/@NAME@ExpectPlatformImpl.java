package @PACKAGE@.fabric;

import @PACKAGE@.ExampleExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class @NAME@ExpectPlatformImpl {
    /**
     * This is our actual method to {@link @NAME@ExpectPlatformImpl#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
