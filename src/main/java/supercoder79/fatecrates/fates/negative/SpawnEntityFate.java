package supercoder79.fatecrates.fates.negative;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fate;

public class SpawnEntityFate extends Fate {
    private final EntityType<?> type;

    public SpawnEntityFate(EntityType<?> type) {
        this.type = type;
    }

    @Override
    public void operate(World world, BlockPos pos) {
        world.setTimeOfDay(14500);
        for (int i = 0; i < 16; i++) {
            Entity e = type.create(world);
            double x = pos.getX() + ((world.getRandom().nextDouble() - 0.5)*10);
            double z = pos.getZ() + ((world.getRandom().nextDouble() - 0.5)*10);
            e.refreshPositionAndAngles(x + 0.5D, world.getTopY(Heightmap.Type.MOTION_BLOCKING, (int)x, (int) z), z + 0.5D, 0.0F, 0.0F);
            world.spawnEntity(e);
        }
    }
}
