package net.lxlennox.astralis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lxlennox.astralis.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STELLAR_DIRT);

        Identifier identifier = TextureMap.getId(ModBlocks.STELLAR_DIRT);
        TextureMap normalTextureMap = new TextureMap()
                .put(TextureKey.BOTTOM, identifier)
                .inherit(TextureKey.BOTTOM, TextureKey.PARTICLE)
                .put(TextureKey.TOP, TextureMap.getSubId(ModBlocks.STELLAR_GRASS, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.STELLAR_GRASS, "_side")); // Normal texture

        TextureMap snowTextureMap = new TextureMap()
                .put(TextureKey.BOTTOM, identifier)
                .inherit(TextureKey.BOTTOM, TextureKey.PARTICLE)
                .put(TextureKey.TOP, TextureMap.getSubId(ModBlocks.STELLAR_GRASS, "_top"))
                .put(TextureKey.SIDE, TextureMap.getSubId(ModBlocks.STELLAR_GRASS, "_snow")); // Snowy texture

// Create state variants
        BlockStateVariant normalVariant = BlockStateVariant.create()
                .put(VariantSettings.MODEL, Models.CUBE_BOTTOM_TOP.upload(ModBlocks.STELLAR_GRASS, "", normalTextureMap, blockStateModelGenerator.modelCollector));

        BlockStateVariant snowVariant = BlockStateVariant.create()
                .put(VariantSettings.MODEL, Models.CUBE_BOTTOM_TOP.upload(ModBlocks.STELLAR_GRASS, "_snow", snowTextureMap, blockStateModelGenerator.modelCollector));

// Register the blockstate with a condition for snowy=true/false
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.STELLAR_GRASS)
                .coordinate(BlockStateVariantMap.create(Properties.SNOWY)
                        .register(false, normalVariant)  // Normal variant
                        .register(true, snowVariant))); // Snowy variant




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


    }
}
