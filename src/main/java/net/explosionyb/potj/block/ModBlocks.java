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
    public static final Block DARK_ILUM_ICE = registerBlock("dark_ilum_ice",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).sounds(BlockSoundGroup.GLASS)));
    public static final Block BRIGHT_ILUM_ICE = registerBlock("bright_ilum_ice",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).sounds(BlockSoundGroup.GLASS)));

    public static final Block ILUM_ICEWALL = registerBlock("ilum_icewall",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BRIGHT_ILUM_ICEWALL = registerBlock("bright_ilum_icewall",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block M_BRIGHT_ILUM_ICEWALL = registerBlock("m_bright_ilum_icewall",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block S_BRIGHT_ILUM_ICEWALL = registerBlock("s_bright_ilum_icewall",
            new Block(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block block;
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
