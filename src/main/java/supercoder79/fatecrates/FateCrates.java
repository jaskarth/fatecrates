package supercoder79.fatecrates;

import net.fabricmc.api.ModInitializer;
import supercoder79.fatecrates.blocks.FateCratesBlocks;
import supercoder79.fatecrates.fates.Fates;

public class FateCrates implements ModInitializer {
	@Override
	public void onInitialize() {
		Fates.init();
		FateCratesBlocks.init();
	}
}
