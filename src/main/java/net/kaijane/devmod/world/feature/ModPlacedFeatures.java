package net.kaijane.devmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    // Overworld Ores
    public static final RegistryEntry<PlacedFeature> YELLORIUM_ORE_PLACED = PlacedFeatures.register("yellorium_ore_placed",
            ModConfiguredFeatures.YELLORIUM_ORE, modifiersWithRarity(2,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> DEEPSLATE_YELLORIUM_ORE_PLACED = PlacedFeatures.register("deepslate_yellorium_ore_placed",
            ModConfiguredFeatures.DEEPSLATE_YELLORIUM_ORE, modifiersWithRarity(2,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    // End Ores
    public static final RegistryEntry<PlacedFeature> ACTIVATED_YELLORIUM_ORE_PLACED = PlacedFeatures.register("activated_yellorium_ore_placed",
            ModConfiguredFeatures.ACTIVATED_YELLORIUM_ORE, modifiersWithRarity(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    // Functions

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }


}
