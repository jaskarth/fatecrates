package supercoder79.fatecrates.fates;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.util.collection.WeightedList;
import supercoder79.fatecrates.fates.negative.*;
import supercoder79.fatecrates.fates.neutral.*;
import supercoder79.fatecrates.fates.positive.*;

public class Fates {
    private static final int DEFAULT_WEIGHT = 5; //easy access for changes later

    public static WeightedList<Fate> POSITIVE_FATES = new WeightedList<>();
    public static WeightedList<Fate> NEGATIVE_FATES = new WeightedList<>();

    public static void init() {
        POSITIVE_FATES.add(new IrritaterFate(), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new TinyPotatoFate(), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new SpawnTreeFate(), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.DRAGON_EGG, 1), 1);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.NETHERITE_HOE, 1), 1);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.CAKE, 1), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.ENDER_PEARL, 8), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.DIAMOND, 4), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.EMERALD, 4), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.ANCIENT_DEBRIS, 4), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new SpawnItemWorldFate(Items.NETHER_STAR, 1), 1);
        POSITIVE_FATES.add(new PlaceBlockFate(Blocks.DIAMOND_BLOCK.getDefaultState()), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new PlaceBlockFate(Blocks.EMERALD_BLOCK.getDefaultState()), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new PlaceBlockFate(Blocks.TNT.getDefaultState()), DEFAULT_WEIGHT);
        POSITIVE_FATES.add(new PlaceBlockFate(Blocks.NETHERITE_BLOCK.getDefaultState()), 1);

        //negative
        NEGATIVE_FATES.add(new SpawnItemWorldFate(Items.ROTTEN_FLESH, 1), 3);
        NEGATIVE_FATES.add(new SpawnItemWorldFate(Items.BROWN_MUSHROOM, 1), 3);
        NEGATIVE_FATES.add(new SpawnItemWorldFate(Items.RED_MUSHROOM, 1), 3);
        NEGATIVE_FATES.add(new SpawnItemWorldFate(Items.STICK, 1), 3);
        NEGATIVE_FATES.add(new SpawnEntityFate(EntityType.SPIDER), 4);
        NEGATIVE_FATES.add(new SpawnEntityFate(EntityType.ZOMBIE), 4);
        NEGATIVE_FATES.add(new SpawnEntityFate(EntityType.ENDERMAN), 4);
        NEGATIVE_FATES.add(new SpawnEntityFate(EntityType.SKELETON), 4);
        NEGATIVE_FATES.add(new LightningFate(), 4);
        NEGATIVE_FATES.add(new PlaceBlockFate(Blocks.DIRT.getDefaultState()), DEFAULT_WEIGHT);
        NEGATIVE_FATES.add(new PlaceBlockFate(Blocks.SPONGE.getDefaultState()), DEFAULT_WEIGHT);
        NEGATIVE_FATES.add(new PlaceBlockFate(Blocks.GLASS.getDefaultState()), DEFAULT_WEIGHT);

        //ideas
        //TODO: enchanting table fate
        //TODO: bottles o' enchanting fate
        //TODO: ender dragon/wither fate
        //TODO: tnt falling from sky
        //TODO: charged creeper
        //TODO: floating island in sky
        //TODO: epic potion effects
        //TODO: lava fate
        //TODO: sponge named spongebob
        //TODO: mushroom fate
    }
}
