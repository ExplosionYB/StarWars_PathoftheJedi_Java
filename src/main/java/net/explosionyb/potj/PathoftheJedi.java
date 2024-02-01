package net.explosionyb.potj;

import net.explosionyb.potj.block.ModBlocks;
import net.explosionyb.potj.item.ModItems;
import net.explosionyb.potj.item.ModItemsGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PathoftheJedi implements ModInitializer {
	public static final String MOD_ID = "assets/potj";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlock();
	}
}