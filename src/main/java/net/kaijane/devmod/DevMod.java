package net.kaijane.devmod;

import net.fabricmc.api.ModInitializer;
import net.kaijane.devmod.block.ModBlocks;
import net.kaijane.devmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DevMod implements ModInitializer {
	public static final String MOD_ID = "devmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

			ModItems.registerModItems();
			ModBlocks.registerModBlocks();

	}
}
