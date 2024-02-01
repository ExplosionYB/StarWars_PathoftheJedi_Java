package net.explosionyb.potj.item;

import net.explosionyb.potj.PathoftheJedi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
        public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PathoftheJedi.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PathoftheJedi.LOGGER.info("Registering Mod Items for " + PathoftheJedi.MOD_ID);
    }
}
