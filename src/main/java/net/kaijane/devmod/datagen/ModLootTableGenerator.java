package net.kaijane.devmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.kaijane.devmod.DevMod;
import net.kaijane.devmod.block.ModBlocks;
import net.kaijane.devmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModLootTableGenerator extends SimpleFabricLootTableProvider {
    public ModLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(DevMod.MOD_ID, "blocks/yellorium_block"),
                BlockLootTableGenerator.drops(ModBlocks.YELLORIUM_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(DevMod.MOD_ID, "blocks/yellorium_ore"),
                BlockLootTableGenerator.oreDrops(ModBlocks.YELLORIUM_ORE, ModItems.YELLORIUM));

        identifierBuilderBiConsumer.accept(new Identifier(DevMod.MOD_ID, "blocks/activated_yellorium_ore"),
                BlockLootTableGenerator.oreDrops(ModBlocks.ACTIVATED_YELLORIUM_ORE, ModItems.ACTIVATED_YELLORIUM_INGOT));
    }
}
