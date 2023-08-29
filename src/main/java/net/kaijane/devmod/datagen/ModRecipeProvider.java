package net.kaijane.devmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kaijane.devmod.item.ModItems;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(ModItems.YELLORIUM_SWORD)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" # ")
                .input('X', ModItems.YELLORIUM)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ModItems.YELLORIUM),
                        RecipeProvider.conditionsFromItem(ModItems.YELLORIUM))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.YELLORIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(ModItems.YELLORIUM_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ModItems.YELLORIUM)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ModItems.YELLORIUM),
                        RecipeProvider.conditionsFromItem(ModItems.YELLORIUM))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.YELLORIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(ModItems.YELLORIUM_AXE)
                .pattern("XX ")
                .pattern("X# ")
                .pattern(" # ")
                .input('X', ModItems.YELLORIUM)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ModItems.YELLORIUM),
                        RecipeProvider.conditionsFromItem(ModItems.YELLORIUM))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.YELLORIUM_AXE)));

        ShapedRecipeJsonBuilder.create(ModItems.YELLORIUM_SHOVEL)
                .pattern(" X ")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ModItems.YELLORIUM)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ModItems.YELLORIUM),
                        RecipeProvider.conditionsFromItem(ModItems.YELLORIUM))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.YELLORIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(ModItems.YELLORIUM_HOE)
                .pattern("XX ")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', ModItems.YELLORIUM)
                .input('#', Items.STICK)
                .criterion(RecipeProvider.hasItem(ModItems.YELLORIUM),
                        RecipeProvider.conditionsFromItem(ModItems.YELLORIUM))
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.YELLORIUM_HOE)));


    }
}
