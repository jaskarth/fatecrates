package supercoder79.fatecrates.blocks;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FateCratesBlocks {
    public static Block GOLD_FATE_CRATE;

    public static void init() {
        GOLD_FATE_CRATE = Registry.register(Registry.BLOCK, new Identifier("fatecrates", "gold_fate_crate"), new GoldFateCrate(FabricBlockSettings.of(Material.STONE, MaterialColor.YELLOW).strength(0.25f, 1.f).build()));
        Registry.register(Registry.ITEM, new Identifier("fatecrates", "gold_fate_crate"), new BlockItem(GOLD_FATE_CRATE, new Item.Settings().group(ItemGroup.MISC)));
    }
}
