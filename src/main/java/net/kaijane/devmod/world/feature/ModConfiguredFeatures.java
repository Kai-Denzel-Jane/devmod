package net.kaijane.devmod.world.feature;

import net.kaijane.devmod.DevMod;
import net.kaijane.devmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_YELLORIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.YELLORIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> YELLORIUM_ORE =
            ConfiguredFeatures.register("yellorium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_YELLORIUM_ORE, 4));

    public static void registerConfiguredFeatures() {
        DevMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + DevMod.MOD_ID);
    }

}
