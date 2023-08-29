package net.kaijane.devmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kaijane.devmod.DevMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item YELLORIUM = registerItem("yellorium",
            new Item(new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_SWORD = registerItem("yellorium_sword", new SwordItem(ModToolMaterials.YELLORIUM, 6, -2.4F, new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_PICKAXE = registerItem("yellorium_pickaxe", new PickaxeItem(ModToolMaterials.YELLORIUM, 1, -2.8F, new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_AXE = registerItem("yellorium_axe", new AxeItem(ModToolMaterials.YELLORIUM, 7, -3.0F, new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_SHOVEL = registerItem("yellorium_shovel", new ShovelItem(ModToolMaterials.YELLORIUM, 1.5F, -3.0F, new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_HOE = registerItem("yellorium_hoe", new ModHoeItem((ToolMaterial) ModToolMaterials.YELLORIUM, (int) -3.0F, 0.0F, new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_HELMET = registerItem("yellorium_helmet", new ArmorItem(ModArmorMaterials.YELLORIUM, EquipmentSlot.HEAD,
        new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_CHESTPLATE = registerItem("yellorium_chestplate", new ArmorItem(ModArmorMaterials.YELLORIUM, EquipmentSlot.CHEST,
            new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_LEGGINGS = registerItem("yellorium_leggings", new ArmorItem(ModArmorMaterials.YELLORIUM, EquipmentSlot.LEGS,
            new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item YELLORIUM_BOOTS = registerItem("yellorium_boots", new ArmorItem(ModArmorMaterials.YELLORIUM, EquipmentSlot.FEET,
            new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    public static final Item ACTIVATED_YELLORIUM_INGOt = registerItem("activated_yellorium_ingot", new Item(new FabricItemSettings().group(ModItemGroup.YELLORIUM)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DevMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        DevMod.LOGGER.debug("Registering Mod Items for " + DevMod.MOD_ID);

    }


}
