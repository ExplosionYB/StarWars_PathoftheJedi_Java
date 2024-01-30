package net.explosionyb.potj.block;

import net.explosionyb.potj.PathoftheJedi;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ILUM_ICE = registerBlock("ilum_ice",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).sounds(BlockSoundGroup.GLASS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PathoftheJedi.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PathoftheJedi.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlock() {
        PathoftheJedi.LOGGER.info("Registering ModBlocks for " + PathoftheJedi.MOD_ID);
    }
}
