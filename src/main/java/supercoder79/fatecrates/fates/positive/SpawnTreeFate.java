package supercoder79.fatecrates.fates.positive;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.BranchedTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import supercoder79.fatecrates.fates.Fate;

import java.util.ArrayList;
import java.util.List;

public class SpawnTreeFate extends Fate {
    private static final List<BranchedTreeFeatureConfig> TREES = new ArrayList<>();

    static {
        TREES.add(DefaultBiomeFeatures.OAK_TREE_CONFIG);
        TREES.add(DefaultBiomeFeatures.JUNGLE_SAPLING_TREE_CONFIG);
        TREES.add(DefaultBiomeFeatures.JUNGLE_TREE_CONFIG);
        TREES.add(DefaultBiomeFeatures.BIRCH_TREE_CONFIG);
        TREES.add(DefaultBiomeFeatures.SPRUCE_TREE_CONFIG);
        TREES.add(DefaultBiomeFeatures.PINE_TREE_CONFIG);
        TREES.add(DefaultBiomeFeatures.ACACIA_TREE_CONFIG);
    }

    @Override
    public void operate(World world, BlockPos pos) {
        Feature.NORMAL_TREE.configure(TREES.get(world.getRandom().nextInt(TREES.size()))).generate(world, null, world.getRandom(), pos);
    }
}
