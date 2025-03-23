package net.lxlennox.astralis.world.dimension;

import net.lxlennox.astralis.Astralis;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
 /*   public static final RegistryKey<DimensionOptions> ASTRALISDIM_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            Identifier.of(Astralis.MOD_ID, "astralisdim"));
    public static final RegistryKey<World> ASTRALISDIM_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD,
            Identifier.of(Astralis.MOD_ID, "astralisdim"));
    public static final RegistryKey<DimensionType> ASTRALIS_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            Identifier.of(Astralis.MOD_ID, "astralisdim_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(ASTRALIS_DIM_TYPE, new DimensionType(
                OptionalLong.of(18000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                -64, // minY
                312, // height
                312, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                DimensionTypes.THE_END_ID, // effectsLocation
                0.8f, // ambientLight
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }*/
}
