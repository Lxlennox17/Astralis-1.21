package net.lxlennox.astralis.world.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class TestTreeFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<TestTreeFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec((
            nameTreeFoliagePlacerInstance) ->
            fillFoliagePlacerFields(nameTreeFoliagePlacerInstance).and(Codec.intRange(0, 12)
                            .fieldOf("height").forGetter(NameTreeFoliagePlacerInstance ->
                                    NameTreeFoliagePlacerInstance.height))
                    .apply(nameTreeFoliagePlacerInstance, TestTreeFoliagePlacer::new));
    private final int height;
    public TestTreeFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return null;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config,
                            int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
        placeFoliageBlock(world, placer, random, config, treeNode.getCenter().up(2));
        placeFoliageBlock(world, placer, random, config, treeNode.getCenter().north(1).up(1));
        placeFoliageBlock(world, placer, random, config, treeNode.getCenter().south(1).up(1));
        placeFoliageBlock(world, placer, random, config, treeNode.getCenter().west(1).up(1));
        placeFoliageBlock(world, placer, random, config, treeNode.getCenter().east(1).up(1));
        generateSquare(world, placer, random, config, treeNode.getCenter().down(1),
                1, 1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().down(2),
                1, 2, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().down(3),
                2, 3, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().down(4),
                2, 4, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().down(5),
                3, 5, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().down(6),
                3, 6, treeNode.isGiantTrunk());
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
