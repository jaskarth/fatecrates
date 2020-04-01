package supercoder79.fatecrates.fates.neutral;

import net.minecraft.entity.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fate;

public class SpawnItemWorldFate extends Fate {
    private final Item item;
    private final int count;

    public SpawnItemWorldFate(Item item, int count) {
        this.item = item;
        this.count = count;
    }

    @Override
    public void operate(World world, BlockPos pos) {
        ItemStack stack = new ItemStack(item, count);
        world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack));
    }
}
