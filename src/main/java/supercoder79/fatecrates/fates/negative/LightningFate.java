package supercoder79.fatecrates.fates.negative;

import net.minecraft.entity.LightningEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fate;

public class LightningFate extends Fate {
    @Override
    public void operate(World world, BlockPos pos) {
        world.spawnEntity(new LightningEntity(world, pos.getX(), pos.getY(), pos.getZ(), false));
    }
}
