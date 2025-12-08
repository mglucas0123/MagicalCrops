package com.mark719.magicalcrops.recipes;

import net.minecraft.item.*;
import net.minecraftforge.oredict.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.item.crafting.*;
import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.init.*;

public class ItemRecipes
{
    static int meta;
    static Item minicioEssence;
    static Item accioEssence;
    static Item crucioEssence;
    static Item imperioEssence;
    static Item zivicioEssence;
    static ItemStack infusionWeak;
    static ItemStack infusionRegular;
    static ItemStack infusionStrong;
    static ItemStack infusionExtreme;
    static ItemStack infusionMaster;
    static ItemStack allWool;
    static ItemStack accioIngot;
    static ItemStack crucioIngot;
    static ItemStack imperioIngot;
    static ItemStack zivicioIngot;
    
    public static void loadRecipes() {
        GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneWeak, new Object[] {"XXX", "XYX", "XXX", 'X', ItemRecipes.minicioEssence, 'Y', "MainInfusionMaterial" }));
        GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneRegular, new Object[] {"XXX", "XYX", "XXX", 'Y', ItemRecipes.infusionWeak, 'X', "accioMaterial" }));
        GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneStrong, new Object[] {"XXX", "XYX", "XXX", 'Y', ItemRecipes.infusionRegular, 'X', "crucioMaterial"}));
        GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(MItems.InfusionStoneExtreme, new Object[] {"XXX", "XYX", "XXX", 'Y', ItemRecipes.infusionStrong, 'X', "imperioMaterial" }));
        GameRegistry.addRecipe(new ShapedOreRecipe(MItems.InfusionStoneMaster, new Object[] {"XXX", "XYX", "XXX", 'Y', ItemRecipes.infusionExtreme, 'X', "zivicioMaterial" }));
        GameRegistry.addRecipe(new ItemStack(Essence.AccioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.minicioEssence, 'Z', ItemRecipes.infusionWeak });
        GameRegistry.addRecipe(new ItemStack(Essence.CrucioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.accioEssence, 'Z', ItemRecipes.infusionRegular });
        GameRegistry.addRecipe(new ItemStack(Essence.ImperioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.crucioEssence, 'Z', ItemRecipes.infusionStrong });
        GameRegistry.addRecipe(new ItemStack(Essence.ZivicioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.imperioEssence, 'Z', ItemRecipes.infusionExtreme });
        GameRegistry.addRecipe(new ItemStack(Essence.AccioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.minicioEssence, 'Z', ItemRecipes.infusionMaster });
        GameRegistry.addRecipe(new ItemStack(Essence.CrucioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.accioEssence, 'Z', ItemRecipes.infusionMaster });
        GameRegistry.addRecipe(new ItemStack(Essence.ImperioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.crucioEssence, 'Z', ItemRecipes.infusionMaster });
        GameRegistry.addRecipe(new ItemStack(Essence.ZivicioEssence, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.imperioEssence, 'Z', ItemRecipes.infusionMaster });
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.MinicioEssence, 4), new Object[] { ItemRecipes.accioEssence });
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.AccioEssence, 4), new Object[] { ItemRecipes.crucioEssence });
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.CrucioEssence, 4), new Object[] { ItemRecipes.imperioEssence });
        GameRegistry.addShapelessRecipe(new ItemStack(Essence.ImperioEssence, 4), new Object[] { ItemRecipes.zivicioEssence });
        GameRegistry.addRecipe(new ItemStack(MItems.MagicalFertilizer, 4), new Object[] { "YXY", "XZX", "YXY", 'X', ItemRecipes.minicioEssence, 'Y', new ItemStack(Items.dye, 1, 15), 'Z', Items.diamond });
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagAccio, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.accioEssence, 'Z', Items.leather });
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagCrucio, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.crucioEssence, 'Z', new ItemStack(MItems.SeedBagAccio, 1) });
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagImperio, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.imperioEssence, 'Z', new ItemStack(MItems.SeedBagCrucio, 1) });
        GameRegistry.addRecipe(new ItemStack(MItems.SeedBagZivicio, 1), new Object[] { " X ", "XZX", " X ", 'X', ItemRecipes.zivicioEssence, 'Z', new ItemStack(MItems.SeedBagImperio, 1) });
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 0), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', ItemRecipes.accioEssence, 'Y', Items.gold_nugget });
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 1), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', ItemRecipes.crucioEssence, 'Y', Items.gold_nugget });
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 2), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', ItemRecipes.imperioEssence, 'Y', Items.gold_nugget });
        GameRegistry.addRecipe(new ItemStack(MItems.EssenceIngots, ConfigMain.ESSENCE_INGOTS, 3), new Object[] { "YXY", "XZX", "YXY", 'X', Items.iron_ingot, 'Z', ItemRecipes.zivicioEssence, 'Y', Items.gold_nugget });
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourHelmet, 1), new Object[] { "XXX", "XYX", 'X', ItemRecipes.accioIngot, 'Y', Items.diamond_helmet });
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourChestplate, 1), new Object[] { "XYX", "XXX", "XXX", 'X', ItemRecipes.accioIngot, 'Y', Items.diamond_chestplate });
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourLeggings, 1), new Object[] { "XXX", "XYX", "X X", 'X', ItemRecipes.accioIngot, 'Y', Items.diamond_leggings });
        GameRegistry.addRecipe(new ItemStack(Armour.AccioArmourBoots, 1), new Object[] { "X X", "XYX", 'X', ItemRecipes.accioIngot, 'Y', Items.diamond_boots });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.accioEssence, 'Y', Items.diamond_axe });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.accioEssence, 'Y', Items.diamond_hoe });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.accioEssence, 'Y', Items.diamond_pickaxe });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.accioEssence, 'Y', Items.diamond_shovel });
        GameRegistry.addRecipe(new ItemStack(Tools.AccioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.accioEssence, 'Y', Items.diamond_sword });
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourHelmet, 1), new Object[] { "XXX", "X X", 'X', ItemRecipes.crucioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', ItemRecipes.crucioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", 'X', ItemRecipes.crucioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.CrucioArmourBoots, 1), new Object[] { "X X", "X X", 'X', ItemRecipes.crucioIngot });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.crucioEssence, 'Y', new ItemStack(Tools.AccioAxe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.crucioEssence, 'Y', new ItemStack(Tools.AccioHoe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.crucioEssence, 'Y', new ItemStack(Tools.AccioPickaxe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.crucioEssence, 'Y', new ItemStack(Tools.AccioShovel, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.CrucioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.crucioEssence, 'Y', new ItemStack(Tools.AccioSword, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourHelmet, 1), new Object[] { "XXX", "X X", 'X', ItemRecipes.imperioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', ItemRecipes.imperioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", 'X', ItemRecipes.imperioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ImperioArmourBoots, 1), new Object[] { "X X", "X X", 'X', ItemRecipes.imperioIngot });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.imperioEssence, 'Y', new ItemStack(Tools.CrucioAxe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.imperioEssence, 'Y', new ItemStack(Tools.CrucioHoe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.imperioEssence, 'Y', new ItemStack(Tools.CrucioPickaxe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.imperioEssence, 'Y', new ItemStack(Tools.CrucioShovel, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ImperioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.imperioEssence, 'Y', new ItemStack(Tools.CrucioSword, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourHelmet, 1), new Object[] { "XXX", "X X", 'X', ItemRecipes.zivicioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourChestplate, 1), new Object[] { "X X", "XXX", "XXX", 'X', ItemRecipes.zivicioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourLeggings, 1), new Object[] { "XXX", "X X", "X X", 'X', ItemRecipes.zivicioIngot });
        GameRegistry.addRecipe(new ItemStack(Armour.ZivicioArmourBoots, 1), new Object[] { "X X", "X X", 'X', ItemRecipes.zivicioIngot });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioAxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.zivicioEssence, 'Y', new ItemStack(Tools.ImperioAxe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioHoe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.zivicioEssence, 'Y', new ItemStack(Tools.ImperioHoe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioPickaxe, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.zivicioEssence, 'Y', new ItemStack(Tools.ImperioPickaxe, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioShovel, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.zivicioEssence, 'Y', new ItemStack(Tools.ImperioShovel, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(Tools.ZivicioSword, 1), new Object[] { " X ", "XYX", " X ", 'X', ItemRecipes.zivicioEssence, 'Y', new ItemStack(Tools.ImperioSword, 1, ItemRecipes.meta) });
        GameRegistry.addRecipe(new ItemStack(ItemRecipes.minicioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(ItemRecipes.accioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 1) });
        GameRegistry.addRecipe(new ItemStack(ItemRecipes.crucioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 2) });
        GameRegistry.addRecipe(new ItemStack(ItemRecipes.imperioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 3) });
        GameRegistry.addRecipe(new ItemStack(ItemRecipes.zivicioEssence, 9), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 4) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 9, 4), new Object[] { "X", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 5) });
    }
    
    static {
        ItemRecipes.meta = 32767;
        ItemRecipes.minicioEssence = Essence.MinicioEssence;
        ItemRecipes.accioEssence = Essence.AccioEssence;
        ItemRecipes.crucioEssence = Essence.CrucioEssence;
        ItemRecipes.imperioEssence = Essence.ImperioEssence;
        ItemRecipes.zivicioEssence = Essence.ZivicioEssence;
        ItemRecipes.infusionWeak = new ItemStack(MItems.InfusionStoneWeak, 1, 32767);
        ItemRecipes.infusionRegular = new ItemStack(MItems.InfusionStoneRegular, 1, 32767);
        ItemRecipes.infusionStrong = new ItemStack(MItems.InfusionStoneStrong, 1, 32767);
        ItemRecipes.infusionExtreme = new ItemStack(MItems.InfusionStoneExtreme, 1, 32767);
        ItemRecipes.infusionMaster = new ItemStack(MItems.InfusionStoneMaster, 1, 32767);
        ItemRecipes.allWool = new ItemStack(Blocks.wool, 1, 32767);
        ItemRecipes.accioIngot = new ItemStack(MItems.EssenceIngots, 1, 0);
        ItemRecipes.crucioIngot = new ItemStack(MItems.EssenceIngots, 1, 1);
        ItemRecipes.imperioIngot = new ItemStack(MItems.EssenceIngots, 1, 2);
        ItemRecipes.zivicioIngot = new ItemStack(MItems.EssenceIngots, 1, 3);
    }
}
