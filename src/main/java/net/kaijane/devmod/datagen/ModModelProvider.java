package net.kaijane.devmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.kaijane.devmod.block.ModBlocks;
import net.kaijane.devmod.item.ModItems;
import net.minecraft.client.render.block.BlockModels;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLORIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLORIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ACTIVATED_YELLORIUM_ORE);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.YELLORIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ACTIVATED_YELLORIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.YELLORIUM_SWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_AXE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.YELLORIUM_BOW, Models.GENERATED);

        itemModelGenerator.register(ModItems.YELLORIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLORIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLORIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLORIUM_BOOTS, Models.GENERATED);
    }
}