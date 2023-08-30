package net.kaijane.devmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kaijane.devmod.DevMod;
import net.kaijane.devmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // General Blocks
    public static final Block YELLORIUM_BLOCK = registerBlock("yellorium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.YELLORIUM);

    // Ores
    public static final Block YELLORIUM_ORE = registerBlock("yellorium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.YELLORIUM);

    public static final Block DEEPSLATE_YELLORIUM_ORE = registerBlock("deepslate_yellorium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.YELLORIUM);

    public static final Block ACTIVATED_YELLORIUM_ORE = registerBlock("activated_yellorium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.YELLORIUM);

    // Registers and Logging
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(DevMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(DevMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        DevMod.LOGGER.debug("Registering ModBlocks for " + DevMod.MOD_ID);
    }

}
