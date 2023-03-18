package @PACKAGE@.fabric;

import @PACKAGE@.ExampleExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class @NAME@ExpectPlatformImpl {
    /**
     * This is our actual method to {@link @NAME@ExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
