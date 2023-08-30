package net.kaijane.devmod.world.feature;

import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.kaijane.devmod.DevMod;
import net.kaijane.devmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    // Overworld Ores
    public static final List<OreFeatureConfig.Target> OVERWORLD_YELLORIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.YELLORIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_YELLORIUM_ORE.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> YELLORIUM_ORE =
            ConfiguredFeatures.register("yellorium_ore", Feature.SCATTERED_ORE, new OreFeatureConfig(OVERWORLD_YELLORIUM_ORES, 2));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> DEEPSLATE_YELLORIUM_ORE =
            ConfiguredFeatures.register("deepslate_yellorium_ore", Feature.SCATTERED_ORE, new OreFeatureConfig(OVERWORLD_YELLORIUM_ORES, 3));

    // End Ores
    public static final List<OreFeatureConfig.Target> END_YELLORIUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ACTIVATED_YELLORIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ACTIVATED_YELLORIUM_ORE =
            ConfiguredFeatures.register("activated_yellorium_ore", Feature.SCATTERED_ORE, new OreFeatureConfig(END_YELLORIUM_ORES, 2));

    // Registers and Logging
    public static void registerConfiguredFeatures() {
        DevMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + DevMod.MOD_ID);
    }

}
