package @PACKAGE@.quilt;

import @PACKAGE@.ExampleMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class @NAME@Quilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        @NAME@.init();
    }
}
