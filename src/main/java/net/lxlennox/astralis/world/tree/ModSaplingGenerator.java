package net.lxlennox.astralis.world.tree;

import net.lxlennox.astralis.Astralis;
import net.lxlennox.astralis.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerator {
        public static final SaplingGenerator TESTTREE = new SaplingGenerator(Astralis.MOD_ID + ":testtree",
                Optional.empty(), Optional.of(ModConfiguredFeatures.TEST_TREE_KEY),
                Optional.empty());
}
