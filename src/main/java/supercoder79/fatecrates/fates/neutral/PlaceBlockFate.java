package supercoder79.fatecrates.fates.neutral;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fate;

public class PlaceBlockFate extends Fate {
    private final BlockState state;

    public PlaceBlockFate(BlockState state) {
        this.state = state;
    }

    @Override
    public void operate(World world, BlockPos pos) {
        world.setBlockState(pos, state);
    }
}
