package net.lxlennox.astralis.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lxlennox.astralis.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);

    }

    @Override
    public void generate() {

     addDrop(ModBlocks.STELLAR_DIRT);
addDropWithSilkTouch(ModBlocks.STELLAR_GRASS,ModBlocks.STELLAR_DIRT);






    }
}
