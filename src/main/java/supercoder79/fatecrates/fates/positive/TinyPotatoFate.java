package supercoder79.fatecrates.fates.positive;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import supercoder79.fatecrates.fates.Fate;

public class TinyPotatoFate extends Fate {
    @Override
    public void operate(World world, BlockPos pos) {
        ItemStack stack = new ItemStack(Items.POTATO).setCustomName(new LiteralText("tiny potato"));
        stack.addEnchantment(Enchantments.PROTECTION, 10);
        world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack));
    }
}
