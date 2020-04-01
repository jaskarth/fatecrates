package supercoder79.fatecrates.fates.negative;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fate;

public class SpiderFate extends Fate {
    @Override
    public void operate(World world, BlockPos pos) {
        for (int i = 0; i < 16; i++) {
            Entity e = EntityType.SPIDER.create(world);
            double x = pos.getX() + ((world.getRandom().nextDouble() - 0.5)*10);
            double z = pos.getZ() + ((world.getRandom().nextDouble() - 0.5)*10);
            e.setPos(x, world.getTopY(Heightmap.Type.MOTION_BLOCKING, (int)x, (int) z), z);
            world.spawnEntity(e);
        }
    }
}
