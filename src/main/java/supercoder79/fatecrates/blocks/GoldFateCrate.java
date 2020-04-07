package supercoder79.fatecrates.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fate;
import supercoder79.fatecrates.fates.Fates;

public class GoldFateCrate extends Block {
    public GoldFateCrate(Settings settings) {
        super(settings);
    }

    @Override
    public void onBroken(IWorld world, BlockPos pos, BlockState state) {
        Fate fate;
        if (world.getRandom().nextInt(2) == 0) {
            fate = Fates.NEGATIVE_FATES.pickRandom(world.getRandom());
        } else {
            fate = Fates.POSITIVE_FATES.pickRandom(world.getRandom());
        }

        if (!world.isClient()) {
            fate.operate((World) world, pos);
        } else {
            fate.operateOnClient((World) world, pos);
        }

        super.onBroken(world, pos, state);
    }
}
