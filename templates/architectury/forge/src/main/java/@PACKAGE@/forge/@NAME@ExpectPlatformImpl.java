package @PACKAGE@.forge;

import @PACKAGE@.ExampleExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class @NAME@ExpectPlatformImpl {
    /**
     * This is our actual method to {@link @NAME@ExpectPlatformImpl#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
