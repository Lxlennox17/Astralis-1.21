package net.lxlennox.astralis.world.tree;

import com.mojang.serialization.MapCodec;
import net.lxlennox.astralis.Astralis;
import net.lxlennox.astralis.world.tree.custom.TestTreeFoliagePlacer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> TEST_FOLIAGE_PLACER = registerFoliagePlacer("test_foliage_placer", TestTreeFoliagePlacer.CODEC);
    private static <P extends FoliagePlacer> FoliagePlacerType<P> registerFoliagePlacer(String id, MapCodec<P> mapCodec) {
        return Registry.register(Registries.FOLIAGE_PLACER_TYPE, id, new FoliagePlacerType<>(mapCodec));
    }
    public static void register() {
       Astralis.LOGGER.info("Registering the Foliage Placers for " + Astralis.MOD_ID);
    }
}
