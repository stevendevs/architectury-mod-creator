package @PACKAGE@.fabric;

import @PACKAGE@.fabriclike.ExampleModFabricLike;
import net.fabricmc.api.ModInitializer;

public class @NAME@Fabric implements ModInitializer {
    @Override
    public void onInitialize() {
        @NAME@FabricLike.init();
    }
}
