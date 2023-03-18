package @PACKAGE@.forge;

import @ARCHITECTURY_PACKAGE@.platform.forge.EventBuses;
import @PACKAGE@.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(@NAME@.MOD_ID)
public class @NAME@Forge {
    public @NAME@Forge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(@NAME@.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        @NAME@.init();
    }
}
