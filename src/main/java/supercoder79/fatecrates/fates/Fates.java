package supercoder79.fatecrates.fates;

import net.minecraft.util.collection.WeightedList;
import supercoder79.fatecrates.fates.positive.IrritaterFate;

public class Fates {
    private static final int DEFAULT_WEIGHT = 5; //easy access for changes later

    public static WeightedList<Fate> POSITIVE_FATES = new WeightedList<>();

    public static void init() {
        POSITIVE_FATES.add(new IrritaterFate(), DEFAULT_WEIGHT);
    }
}
