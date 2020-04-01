package supercoder79.fatecrates.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fates;

public class GoldFateCrate extends Block {
    public GoldFateCrate(Settings settings) {
        super(settings);
    }

    @Override
    public void onBroken(IWorld world, BlockPos pos, BlockState state) {
        if (!world.isClient()) {
            Fates.POSITIVE_FATES.pickRandom(world.getRandom()).operate((World) world, pos);
        }

        super.onBroken(world, pos, state);
    }
}
