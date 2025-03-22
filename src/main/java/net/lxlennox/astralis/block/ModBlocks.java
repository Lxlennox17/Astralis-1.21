package net.lxlennox.astralis.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lxlennox.astralis.Astralis;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block STELLAR_GRASS = registerBlock("stellar_grass.json",
            new GrassBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block STELLAR_DIRT = registerBlock("stellar_dirt",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Astralis.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Astralis.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Astralis.LOGGER.info("Registering Mod Blocks for " + Astralis.MOD_ID);


    }
}
