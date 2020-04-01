package supercoder79.fatecrates.fates;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class Fate {
    public abstract void operate(World world, BlockPos pos);
}
