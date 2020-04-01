package supercoder79.fatecrates;

import net.fabricmc.api.ModInitializer;
import supercoder79.fatecrates.blocks.FateCratesBlocks;

public class FateCrates implements ModInitializer {
	@Override
	public void onInitialize() {
		FateCratesBlocks.init();
	}
}
