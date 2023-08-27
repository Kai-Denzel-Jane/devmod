package net.kaijane.devmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kaijane.devmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.YELLORIUM_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_HOE, Models.HANDHELD);
    }
}