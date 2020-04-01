package supercoder79.fatecrates.fates;

import net.minecraft.item.Items;
import net.minecraft.util.collection.WeightedList;
import supercoder79.fatecrates.fates.negative.SpiderFate;
import supercoder79.fatecrates.fates.neutral.SpawnItemWorldFate;
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

        //negative
        NEGATIVE_FATES.add(new SpawnItemWorldFate(Items.ROTTEN_FLESH, 1), DEFAULT_WEIGHT);
        NEGATIVE_FATES.add(new SpawnItemWorldFate(Items.STICK, 1), DEFAULT_WEIGHT);
        NEGATIVE_FATES.add(new SpiderFate(), DEFAULT_WEIGHT);

        //ideas
        //TODO: enchanting table fate
        //TODO: bottles o' enchanting fate
        //TODO: ender dragon/wither fate
        //TODO: tnt falling from sky
        //TODO: charged creeper
        //TODO: lightning
        //TODO: zombie siege event
        //TODO: floating island in sky
        //TODO: epic potion effects
        //TODO: lava fate
        //TODO: enderpearls
        //TODO: sponge named spongebob
        //TODO: mushroom fate
        //TODO
    }
}
