package net.lxlennox.astralis;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;

import net.lxlennox.astralis.block.ModBlocks;
import net.lxlennox.astralis.item.ModItems;
import net.lxlennox.astralis.world.gen.ModWorldGeneration;
import net.minecraft.block.Blocks;

import net.minecraft.fluid.Fluids;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Astralis implements ModInitializer {
	public static final String MOD_ID = "astralis";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModWorldGeneration.generateModWorldGen();


		CustomPortalBuilder.beginPortal()
				.frameBlock(Blocks.CRYING_OBSIDIAN)
				.lightWithFluid(Fluids.LAVA)
				.destDimID(Identifier.of(Astralis.MOD_ID,"astralisdim"))
				.tintColor(0xc76efa)
				.registerPortal();
	}
}