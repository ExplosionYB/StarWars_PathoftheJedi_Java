package net.explosionyb.potj.item;

import net.explosionyb.potj.PathoftheJedi;
import net.explosionyb.potj.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {
    public static final ItemGroup ILUM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PathoftheJedi.MOD_ID, "ilum"),
            FabricItemGroup.builder().displayName(Text.of("Ilum Blocks"))
                    .icon(() -> new ItemStack(ModBlocks.ILUM_ICE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ILUM_ICE);
                        entries.add(ModBlocks.DARK_ILUM_ICE);
                        entries.add(ModBlocks.BRIGHT_ILUM_ICE);
            }).build());

    public static void registerItemGroups() {
        PathoftheJedi.LOGGER.info("Registering Item Groups for " + PathoftheJedi.MOD_ID);
    }
}
