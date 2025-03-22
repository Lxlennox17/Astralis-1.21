package net.lxlennox.astralis.block;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;

public class ModBlockColors {

    public static void registerBlockColors() {
        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) ->
                        world != null && pos != null ?
                                BiomeColors.getGrassColor(world, pos) :
                                0x55FF55, // Default color if no world/pos is available
                ModBlocks.STELLAR_GRASS
        );
    }
}

