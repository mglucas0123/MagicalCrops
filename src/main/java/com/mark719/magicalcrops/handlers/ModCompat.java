package com.mark719.magicalcrops.handlers;

import net.minecraft.item.*;
import net.minecraft.block.*;
import com.mark719.magicalcrops.help.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.item.crafting.*;
import net.minecraftforge.oredict.*;
import com.mark719.magicalcrops.items.essence.*;
import com.mark719.magicalcrops.blocks.crops.*;
import com.mark719.magicalcrops.items.seeds.*;
import com.mark719.magicalcrops.config.*;
import net.minecraft.init.*;

public class ModCompat
{
    static int seedOutPut;
    static Item minicioEssence;
    static Item accioEssence;
    static Item crucioEssence;
    static Item imperioEssence;
    static Item zivicioEssence;
    static ItemStack minicioSeeds;
    public static Block farmland;
    public static Item AluminiumEssence;
    public static Item ArditeEssence;
    public static Item CobaltEssence;
    public static Item CopperEssence;
    public static Item CertusQuartzEssence;
    public static Item LeadEssence;
    public static Item NickelEssence;
    public static Item OsmiumEssence;
    public static Item PeridotEssence;
    public static Item RubyEssence;
    public static Item SapphireEssence;
    public static Item PlatinumEssence;
    public static Item RubberEssence;
    public static Item SilverEssence;
    public static Item TinEssence;
    public static Item SulfurEssence;
    public static Item YelloriteEssence;
    public static Item AlumiteEssence;
    public static Item BlizzEssence;
    public static Item BronzeEssence;
    public static Item ElectrumEssence;
    public static Item EnderiumEssence;
    public static Item FluixEssence;
    public static Item InvarEssence;
    public static Item LumiumEssence;
    public static Item ManasteelEssence;
    public static Item ManyullynEssence;
    public static Item SaltpeterEssence;
    public static Item SignalumEssence;
    public static Item SteelEssence;
    public static Item TerrasteelEssence;
    public static Block AluminiumCrop;
    public static Block ArditeCrop;
    public static Block CobaltCrop;
    public static Block CopperCrop;
    public static Block CertusQuartzCrop;
    public static Block LeadCrop;
    public static Block NickelCrop;
    public static Block OsmiumCrop;
    public static Block PeridotCrop;
    public static Block RubyCrop;
    public static Block SapphireCrop;
    public static Block PlatinumCrop;
    public static Block RubberCrop;
    public static Block SilverCrop;
    public static Block TinCrop;
    public static Block SulfurCrop;
    public static Block YelloriteCrop;
    public static Block AlumiteCrop;
    public static Block BlizzCrop;
    public static Block BronzeCrop;
    public static Block ElectrumCrop;
    public static Block EnderiumCrop;
    public static Block FluixCrop;
    public static Block InvarCrop;
    public static Block LumiumCrop;
    public static Block ManasteelCrop;
    public static Block ManyullynCrop;
    public static Block SaltpeterCrop;
    public static Block SignalumCrop;
    public static Block SteelCrop;
    public static Block TerrasteelCrop;
    public static Item AluminiumSeeds;
    public static Item ArditeSeeds;
    public static Item CobaltSeeds;
    public static Item CopperSeeds;
    public static Item CertusQuartzSeeds;
    public static Item LeadSeeds;
    public static Item NickelSeeds;
    public static Item OsmiumSeeds;
    public static Item PeridotSeeds;
    public static Item RubySeeds;
    public static Item SapphireSeeds;
    public static Item PlatinumSeeds;
    public static Item RubberSeeds;
    public static Item SilverSeeds;
    public static Item TinSeeds;
    public static Item SulfurSeeds;
    public static Item YelloriteSeeds;
    public static Item AlumiteSeeds;
    public static Item BlizzSeeds;
    public static Item BronzeSeeds;
    public static Item ElectrumSeeds;
    public static Item EnderiumSeeds;
    public static Item FluixSeeds;
    public static Item InvarSeeds;
    public static Item LumiumSeeds;
    public static Item ManasteelSeeds;
    public static Item ManyullynSeeds;
    public static Item SaltpeterSeeds;
    public static Item SignalumSeeds;
    public static Item SteelSeeds;
    public static Item TerrasteelSeeds;
    public static Item AwakenedDraconiumSeeds;
    public static Item AwakenedDraconiumEssence;
    public static Block AwakenedDraconiumCrop;
    
    public static void loadCompat() {
        if (ConfigDisable.ALUMINIUM && OreCheck.getModOre("oreAluminium") != null && OreCheck.getModOre("ingotAluminium") != null) {
            ModCompat.AluminiumEssence = new AluminiumEssence().setUnlocalizedName("AluminiumEssence");
            ModCompat.AluminiumCrop = new AluminiumCrop().setBlockName("AluminiumCrop");
            ModCompat.AluminiumSeeds = new AluminiumSeeds(ModCompat.AluminiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("AluminiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.AluminiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.AluminiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.AluminiumSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotAluminium");
            Object craftingMaterial = "ingotAluminium";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockAluminium";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.AluminiumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreAluminium");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutAluminium, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.AluminiumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.AluminiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.AluminiumSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.AluminiumEssence));
        }
        if (ConfigDisable.ARDITE && OreCheck.getModOre("oreArdite") != null && OreCheck.getModOre("ingotArdite") != null) {
            ModCompat.ArditeEssence = new ArditeEssence().setUnlocalizedName("ArditeEssence");
            ModCompat.ArditeCrop = new ArditeCrop().setBlockName("ArditeCrop");
            ModCompat.ArditeSeeds = new ArditeSeeds(ModCompat.ArditeCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ArditeSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ArditeEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ArditeCrop);
            ItemRegisterHelper.registerItem(ModCompat.ArditeSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotArdite");
            Object craftingMaterial = "ingotArdite";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockArdite";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ArditeSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreArdite");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutArdite, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ArditeEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ArditeEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ArditeSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.ArditeEssence));
        }
        if (ConfigDisable.COBALT && OreCheck.getModOre("oreCobalt") != null && OreCheck.getModOre("ingotCobalt") != null) {
            ModCompat.CobaltEssence = new CobaltEssence().setUnlocalizedName("CobaltEssence");
            ModCompat.CobaltCrop = new CobaltCrop().setBlockName("CobaltCrop");
            ModCompat.CobaltSeeds = new CobaltSeeds(ModCompat.CobaltCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("CobaltSeeds");
            ItemRegisterHelper.registerItem(ModCompat.CobaltEssence);
            BlockRegisterHelper.registerBlock(ModCompat.CobaltCrop);
            ItemRegisterHelper.registerItem(ModCompat.CobaltSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotCobalt");
            Object craftingMaterial = "ingotCobalt";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockCobalt";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.CobaltSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.zivicioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreCobalt");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutCobalt, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.CobaltEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.CobaltEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.CobaltSeeds }));
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(ModCompat.CobaltEssence));
        }
        if (ConfigDisable.COPPER && OreCheck.getModOre("oreCopper") != null && OreCheck.getModOre("ingotCopper") != null) {
            ModCompat.CopperEssence = new CopperEssence().setUnlocalizedName("CopperEssence");
            ModCompat.CopperCrop = new CopperCrop().setBlockName("CopperCrop");
            ModCompat.CopperSeeds = new CopperSeeds(ModCompat.CopperCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("CopperSeeds");
            ItemRegisterHelper.registerItem(ModCompat.CopperEssence);
            BlockRegisterHelper.registerBlock(ModCompat.CopperCrop);
            ItemRegisterHelper.registerItem(ModCompat.CopperSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotCopper");
            Object craftingMaterial = "ingotCopper";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockCopper";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.CopperSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreCopper");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutCopper, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.CopperEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.CopperEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.CopperSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.CopperEssence));
        }
        if (ConfigDisable.CERTUSQUARTZ && OreCheck.getModOre("oreCertusQuartz") != null && OreCheck.getModOre("crystalCertusQuartz") != null) {
            ModCompat.CertusQuartzEssence = new CertusQuartzEssence().setUnlocalizedName("CertusQuartzEssence");
            ModCompat.CertusQuartzCrop = new CertusQuartzCrop().setBlockName("CertusQuartzCrop");
            ModCompat.CertusQuartzSeeds = new CertusQuartzSeeds(ModCompat.CertusQuartzCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("CertusQuartzSeeds");
            ItemRegisterHelper.registerItem(ModCompat.CertusQuartzEssence);
            BlockRegisterHelper.registerBlock(ModCompat.CertusQuartzCrop);
            ItemRegisterHelper.registerItem(ModCompat.CertusQuartzSeeds);
            final ItemStack modIngot = OreCheck.getModOre("crystalCertusQuartz");
            Object craftingMaterial = "crystalCertusQuartz";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockCertusQuartz";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.CertusQuartzSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreCertusQuartz");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutCertusQuartz, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.CertusQuartzEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.CertusQuartzEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.CertusQuartzSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.CertusQuartzEssence));
        }
        if (ConfigDisable.LEAD && OreCheck.getModOre("oreLead") != null && OreCheck.getModOre("ingotLead") != null) {
            ModCompat.LeadEssence = new LeadEssence().setUnlocalizedName("LeadEssence");
            ModCompat.LeadCrop = new LeadCrop().setBlockName("LeadCrop");
            ModCompat.LeadSeeds = new LeadSeeds(ModCompat.LeadCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("LeadSeeds");
            ItemRegisterHelper.registerItem(ModCompat.LeadEssence);
            BlockRegisterHelper.registerBlock(ModCompat.LeadCrop);
            ItemRegisterHelper.registerItem(ModCompat.LeadSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotLead");
            Object craftingMaterial = "ingotLead";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockLead";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.LeadSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreLead");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutLead, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.LeadEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.LeadEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.LeadSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.LeadEssence));
        }
        if (ConfigDisable.NICKEL && OreCheck.getModOre("oreNickel") != null && OreCheck.getModOre("ingotNickel") != null) {
            ModCompat.NickelEssence = new NickelEssence().setUnlocalizedName("NickelEssence");
            ModCompat.NickelCrop = new NickelCrop().setBlockName("NickelCrop");
            ModCompat.NickelSeeds = new NickelSeeds(ModCompat.NickelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("NickelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.NickelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.NickelCrop);
            ItemRegisterHelper.registerItem(ModCompat.NickelSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotNickel");
            Object craftingMaterial = "ingotNickel";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockNickel";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.NickelSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreNickel");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutNickel, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.NickelEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.NickelEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.NickelSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.NickelEssence));
        }
        if (ConfigDisable.OSMIUM && OreCheck.getModOre("oreOsmium") != null && OreCheck.getModOre("ingotOsmium") != null) {
            ModCompat.OsmiumEssence = new OsmiumEssence().setUnlocalizedName("OsmiumEssence");
            ModCompat.OsmiumCrop = new OsmiumCrop().setBlockName("OsmiumCrop");
            ModCompat.OsmiumSeeds = new OsmiumSeeds(ModCompat.OsmiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("OsmiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.OsmiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.OsmiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.OsmiumSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotOsmium");
            Object craftingMaterial = "ingotOsmium";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockOsmium";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.OsmiumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreOsmium");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutOsmium, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.OsmiumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.OsmiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.OsmiumSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.OsmiumEssence));
        }
        if (ConfigDisable.PERIDOT && OreCheck.getModOre("gemPeridot") != null) {
            ModCompat.PeridotEssence = new PeridotEssence().setUnlocalizedName("PeridotEssence");
            ModCompat.PeridotCrop = new PeridotCrop().setBlockName("PeridotCrop");
            ModCompat.PeridotSeeds = new PeridotSeeds(ModCompat.PeridotCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("PeridotSeeds");
            ItemRegisterHelper.registerItem(ModCompat.PeridotEssence);
            BlockRegisterHelper.registerBlock(ModCompat.PeridotCrop);
            ItemRegisterHelper.registerItem(ModCompat.PeridotSeeds);
            final ItemStack modIngot = OreCheck.getModOre("gemPeridot");
            Object craftingMaterial = "gemPeridot";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockPeridot";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.PeridotSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutPeridot, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.PeridotEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.PeridotEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.PeridotSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.PeridotEssence));
        }
        if (ConfigDisable.RUBY && OreCheck.getModOre("gemRuby") != null) {
            ModCompat.RubyEssence = new RubyEssence().setUnlocalizedName("RubyEssence");
            ModCompat.RubyCrop = new RubyCrop().setBlockName("RubyCrop");
            ModCompat.RubySeeds = new RubySeeds(ModCompat.RubyCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("RubySeeds");
            ItemRegisterHelper.registerItem(ModCompat.RubyEssence);
            BlockRegisterHelper.registerBlock(ModCompat.RubyCrop);
            ItemRegisterHelper.registerItem(ModCompat.RubySeeds);
            final ItemStack modIngot = OreCheck.getModOre("gemRuby");
            Object craftingMaterial = "gemRuby";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockRuby";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.RubySeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutRuby, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.RubyEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.RubyEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.RubySeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.RubyEssence));
        }
        if (ConfigDisable.SAPPHIRE && OreCheck.getModOre("gemSapphire") != null) {
            ModCompat.SapphireEssence = new SapphireEssence().setUnlocalizedName("SapphireEssence");
            ModCompat.SapphireCrop = new SapphireCrop().setBlockName("SapphireCrop");
            ModCompat.SapphireSeeds = new SapphireSeeds(ModCompat.SapphireCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SapphireSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SapphireEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SapphireCrop);
            ItemRegisterHelper.registerItem(ModCompat.SapphireSeeds);
            final ItemStack modIngot = OreCheck.getModOre("gemSapphire");
            Object craftingMaterial = "gemSapphire";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockSapphire";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SapphireSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutSapphire, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SapphireEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SapphireEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SapphireSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.SapphireEssence));
        }
        if (ConfigDisable.PLATINUM && OreCheck.getModOre("ingotPlatinum") != null) {
            ModCompat.PlatinumEssence = new PlatinumEssence().setUnlocalizedName("PlatinumEssence");
            ModCompat.PlatinumCrop = new PlatinumCrop().setBlockName("PlatinumCrop");
            ModCompat.PlatinumSeeds = new PlatinumSeeds(ModCompat.PlatinumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("PlatinumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.PlatinumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.PlatinumCrop);
            ItemRegisterHelper.registerItem(ModCompat.PlatinumSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotPlatinum");
            Object craftingMaterial = "ingotPlatinum";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockPlatinum";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.PlatinumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.zivicioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutPlatinum, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.PlatinumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.PlatinumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.PlatinumSeeds }));
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(ModCompat.PlatinumEssence));
        }
        if (ConfigDisable.RUBBER && OreCheck.getModOre("itemRawRubber") != null) {
            ModCompat.RubberEssence = new RubberEssence().setUnlocalizedName("RubberEssence");
            ModCompat.RubberCrop = new RubberCrop().setBlockName("RubberCrop");
            ModCompat.RubberSeeds = new RubberSeeds(ModCompat.RubberCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("RubberSeeds");
            ItemRegisterHelper.registerItem(ModCompat.RubberEssence);
            BlockRegisterHelper.registerBlock(ModCompat.RubberCrop);
            ItemRegisterHelper.registerItem(ModCompat.RubberSeeds);
            final ItemStack modIngot = OreCheck.getModOre("itemRawRubber");
            Object craftingMaterial = "itemRawRubber";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockRubber";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.RubberSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.accioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutRubber, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.RubberEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.RubberEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.RubberSeeds }));
            OreDictionary.registerOre("accioMaterial", new ItemStack(ModCompat.RubberEssence));
        }
        if (ConfigDisable.SILVER && OreCheck.getModOre("oreSilver") != null && OreCheck.getModOre("ingotSilver") != null) {
            ModCompat.SilverEssence = new SilverEssence().setUnlocalizedName("SilverEssence");
            ModCompat.SilverCrop = new SilverCrop().setBlockName("SilverCrop");
            ModCompat.SilverSeeds = new SilverSeeds(ModCompat.SilverCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SilverSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SilverEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SilverCrop);
            ItemRegisterHelper.registerItem(ModCompat.SilverSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotSilver");
            Object craftingMaterial = "ingotSilver";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockSilver";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SilverSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreSilver");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutSilver, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SilverEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SilverEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SilverSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.SilverEssence));
        }
        if (ConfigDisable.TIN && OreCheck.getModOre("oreTin") != null && OreCheck.getModOre("ingotTin") != null) {
            ModCompat.TinEssence = new TinEssence().setUnlocalizedName("TinEssence");
            ModCompat.TinCrop = new TinCrop().setBlockName("TinCrop");
            ModCompat.TinSeeds = new TinSeeds(ModCompat.TinCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("TinSeeds");
            ItemRegisterHelper.registerItem(ModCompat.TinEssence);
            BlockRegisterHelper.registerBlock(ModCompat.TinCrop);
            ItemRegisterHelper.registerItem(ModCompat.TinSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotTin");
            Object craftingMaterial = "ingotTin";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockTin";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.TinSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreTin");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutTin, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.TinEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.TinEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.TinSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.TinEssence));
        }
        if (ConfigDisable.SULFUR && OreCheck.getModOre("dustSulfur") != null) {
            ModCompat.SulfurEssence = new SulfurEssence().setUnlocalizedName("SulfurEssence");
            ModCompat.SulfurCrop = new SulfurCrop().setBlockName("SulfurCrop");
            ModCompat.SulfurSeeds = new SulfurSeeds(ModCompat.SulfurCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SulfurSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SulfurEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SulfurCrop);
            ItemRegisterHelper.registerItem(ModCompat.SulfurSeeds);
            final ItemStack modIngot = OreCheck.getModOre("dustSulfur");
            Object craftingMaterial = "dustSulfur";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockSulfur";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SulfurSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutSulfur, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SulfurEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SulfurEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SulfurSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.SulfurEssence));
        }
        if (ConfigDisable.YELLORITE && OreCheck.getModOre("oreYellorite") != null && OreCheck.getModOre("ingotYellorium") != null) {
            ModCompat.YelloriteEssence = new YelloriteEssence().setUnlocalizedName("YelloriteEssence");
            ModCompat.YelloriteCrop = new YelloriteCrop().setBlockName("YelloriteCrop");
            ModCompat.YelloriteSeeds = new YelloriteSeeds(ModCompat.YelloriteCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("YelloriteSeeds");
            ItemRegisterHelper.registerItem(ModCompat.YelloriteEssence);
            BlockRegisterHelper.registerBlock(ModCompat.YelloriteCrop);
            ItemRegisterHelper.registerItem(ModCompat.YelloriteSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotYellorium");
            Object craftingMaterial = "ingotYellorium";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockYellorium";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.YelloriteSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            final ItemStack modOre = OreCheck.getModOre("oreYellorite");
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modOre.getItem(), ConfigCrafting.outPutYellorite, modOre.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.YelloriteEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.YelloriteEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.YelloriteSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.YelloriteEssence));
        }
        if (ConfigDisable.ALUMITE && OreCheck.getModOre("ingotAlumite") != null) {
            ModCompat.AlumiteEssence = new AlumiteEssence().setUnlocalizedName("AlumiteEssence");
            ModCompat.AlumiteCrop = new AlumiteCrop().setBlockName("AlumiteCrop");
            ModCompat.AlumiteSeeds = new AlumiteSeeds(ModCompat.AlumiteCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("AlumiteSeeds");
            ItemRegisterHelper.registerItem(ModCompat.AlumiteEssence);
            BlockRegisterHelper.registerBlock(ModCompat.AlumiteCrop);
            ItemRegisterHelper.registerItem(ModCompat.AlumiteSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotAlumite");
            Object craftingMaterial = "ingotAlumite";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockAlumite";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.AlumiteSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutAlumite, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.AlumiteEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.AlumiteEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.AlumiteSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.AlumiteEssence));
        }
        if (ConfigDisable.BLIZZ && OreCheck.getModOre("rodBlizz") != null) {
            ModCompat.BlizzEssence = new BlizzEssence().setUnlocalizedName("BlizzEssence");
            ModCompat.BlizzCrop = new BlizzCrop().setBlockName("BlizzCrop");
            ModCompat.BlizzSeeds = new BlizzSeeds(ModCompat.BlizzCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("BlizzSeeds");
            ItemRegisterHelper.registerItem(ModCompat.BlizzEssence);
            BlockRegisterHelper.registerBlock(ModCompat.BlizzCrop);
            ItemRegisterHelper.registerItem(ModCompat.BlizzSeeds);
            final ItemStack modIngot = OreCheck.getModOre("rodBlizz");
            Object craftingMaterial = "rodBlizz";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockBlizz";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.BlizzSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutBlizz, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.BlizzEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.BlizzEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.BlizzSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.BlizzEssence));
        }
        if (ConfigDisable.BRONZE && OreCheck.getModOre("ingotBronze") != null) {
            ModCompat.BronzeEssence = new BronzeEssence().setUnlocalizedName("BronzeEssence");
            ModCompat.BronzeCrop = new BronzeCrop().setBlockName("BronzeCrop");
            ModCompat.BronzeSeeds = new BronzeSeeds(ModCompat.BronzeCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("BronzeSeeds");
            ItemRegisterHelper.registerItem(ModCompat.BronzeEssence);
            BlockRegisterHelper.registerBlock(ModCompat.BronzeCrop);
            ItemRegisterHelper.registerItem(ModCompat.BronzeSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotBronze");
            Object craftingMaterial = "ingotBronze";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockBronze";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.BronzeSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutBronze, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.BronzeEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.BronzeEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.BronzeSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.BronzeEssence));
        }
        if (ConfigDisable.ELECTRUM && OreCheck.getModOre("ingotElectrum") != null) {
            ModCompat.ElectrumEssence = new ElectrumEssence().setUnlocalizedName("ElectrumEssence");
            ModCompat.ElectrumCrop = new ElectrumCrop().setBlockName("ElectrumCrop");
            ModCompat.ElectrumSeeds = new ElectrumSeeds(ModCompat.ElectrumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ElectrumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ElectrumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ElectrumCrop);
            ItemRegisterHelper.registerItem(ModCompat.ElectrumSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotElectrum");
            Object craftingMaterial = "ingotElectrum";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockElectrum";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ElectrumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutElectrum, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ElectrumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ElectrumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ElectrumSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.ElectrumEssence));
        }
        if (ConfigDisable.ENDERIUM && OreCheck.getModOre("ingotEnderium") != null) {
            ModCompat.EnderiumEssence = new EnderiumEssence().setUnlocalizedName("EnderiumEssence");
            ModCompat.EnderiumCrop = new EnderiumCrop().setBlockName("EnderiumCrop");
            ModCompat.EnderiumSeeds = new EnderiumSeeds(ModCompat.EnderiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("EnderiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.EnderiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.EnderiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.EnderiumSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotEnderium");
            Object craftingMaterial = "ingotEnderium";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockEnderium";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.EnderiumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.zivicioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutEnderium, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.EnderiumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.EnderiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.EnderiumSeeds }));
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(ModCompat.EnderiumEssence));
        }
        if (ConfigDisable.FLUIX && OreCheck.getModOre("crystalFluix") != null) {
            ModCompat.FluixEssence = new FluixEssence().setUnlocalizedName("FluixEssence");
            ModCompat.FluixCrop = new FluixCrop().setBlockName("FluixCrop");
            ModCompat.FluixSeeds = new FluixSeeds(ModCompat.FluixCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("FluixSeeds");
            ItemRegisterHelper.registerItem(ModCompat.FluixEssence);
            BlockRegisterHelper.registerBlock(ModCompat.FluixCrop);
            ItemRegisterHelper.registerItem(ModCompat.FluixSeeds);
            final ItemStack modIngot = OreCheck.getModOre("crystalFluix");
            Object craftingMaterial = "crystalFluix";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockFluix";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.FluixSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutFluix, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.FluixEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.FluixEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.FluixSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.FluixEssence));
        }
        if (ConfigDisable.INVAR && OreCheck.getModOre("ingotInvar") != null) {
            ModCompat.InvarEssence = new InvarEssence().setUnlocalizedName("InvarEssence");
            ModCompat.InvarCrop = new InvarCrop().setBlockName("InvarCrop");
            ModCompat.InvarSeeds = new InvarSeeds(ModCompat.InvarCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("InvarSeeds");
            ItemRegisterHelper.registerItem(ModCompat.InvarEssence);
            BlockRegisterHelper.registerBlock(ModCompat.InvarCrop);
            ItemRegisterHelper.registerItem(ModCompat.InvarSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotInvar");
            Object craftingMaterial = "ingotInvar";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockInvar";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.InvarSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutInvar, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.InvarEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.InvarEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.InvarSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.InvarEssence));
        }
        if (ConfigDisable.LUMIUM && OreCheck.getModOre("ingotLumium") != null) {
            ModCompat.LumiumEssence = new LumiumEssence().setUnlocalizedName("LumiumEssence");
            ModCompat.LumiumCrop = new LumiumCrop().setBlockName("LumiumCrop");
            ModCompat.LumiumSeeds = new LumiumSeeds(ModCompat.LumiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("LumiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.LumiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.LumiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.LumiumSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotLumium");
            Object craftingMaterial = "ingotLumium";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockLumium";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.LumiumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutLumium, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.LumiumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.LumiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.LumiumSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.LumiumEssence));
        }
        if (ConfigDisable.MANASTEEL && OreCheck.getModOre("ingotManasteel") != null) {
            ModCompat.ManasteelEssence = new ManasteelEssence().setUnlocalizedName("ManasteelEssence");
            ModCompat.ManasteelCrop = new ManasteelCrop().setBlockName("ManasteelCrop");
            ModCompat.ManasteelSeeds = new ManasteelSeeds(ModCompat.ManasteelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ManasteelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ManasteelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ManasteelCrop);
            ItemRegisterHelper.registerItem(ModCompat.ManasteelSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotManasteel");
            Object craftingMaterial = "ingotManasteel";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockManasteel";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ManasteelSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutManasteel, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ManasteelEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ManasteelEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ManasteelSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.ManasteelEssence));
        }
        if (ConfigDisable.MANYULLYN && OreCheck.getModOre("ingotManyullyn") != null) {
            ModCompat.ManyullynEssence = new ManyullynEssence().setUnlocalizedName("ManyullynEssence");
            ModCompat.ManyullynCrop = new ManyullynCrop().setBlockName("ManyullynCrop");
            ModCompat.ManyullynSeeds = new ManyullynSeeds(ModCompat.ManyullynCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ManyullynSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ManyullynEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ManyullynCrop);
            ItemRegisterHelper.registerItem(ModCompat.ManyullynSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotManyullyn");
            Object craftingMaterial = "ingotManyullyn";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockManyullyn";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ManyullynSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.zivicioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutManyullyn, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ManyullynEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.ManyullynEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.ManyullynSeeds }));
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(ModCompat.ManyullynEssence));
        }
        if (ConfigDisable.SALTPETER && OreCheck.getModOre("dustSaltpeter") != null) {
            ModCompat.SaltpeterEssence = new SaltpeterEssence().setUnlocalizedName("SaltpeterEssence");
            ModCompat.SaltpeterCrop = new SaltpeterCrop().setBlockName("SaltpeterCrop");
            ModCompat.SaltpeterSeeds = new SaltpeterSeeds(ModCompat.SaltpeterCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SaltpeterSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SaltpeterEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SaltpeterCrop);
            ItemRegisterHelper.registerItem(ModCompat.SaltpeterSeeds);
            final ItemStack modIngot = OreCheck.getModOre("dustSaltpeter");
            Object craftingMaterial = "dustSaltpeter";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockSaltpeter";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SaltpeterSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.crucioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutSaltpeter, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SaltpeterEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SaltpeterEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SaltpeterSeeds }));
            OreDictionary.registerOre("crucioMaterial", new ItemStack(ModCompat.SaltpeterEssence));
        }
        if (ConfigDisable.SIGNALUM && OreCheck.getModOre("ingotSignalum") != null) {
            ModCompat.SignalumEssence = new SignalumEssence().setUnlocalizedName("SignalumEssence");
            ModCompat.SignalumCrop = new SignalumCrop().setBlockName("SignalumCrop");
            ModCompat.SignalumSeeds = new SignalumSeeds(ModCompat.SignalumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SignalumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SignalumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SignalumCrop);
            ItemRegisterHelper.registerItem(ModCompat.SignalumSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotSignalum");
            Object craftingMaterial = "ingotSignalum";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockSignalum";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SignalumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutSignalum, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SignalumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SignalumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SignalumSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.SignalumEssence));
        }
        if (ConfigDisable.STEEL && OreCheck.getModOre("ingotSteel") != null) {
            ModCompat.SteelEssence = new SteelEssence().setUnlocalizedName("SteelEssence");
            ModCompat.SteelCrop = new SteelCrop().setBlockName("SteelCrop");
            ModCompat.SteelSeeds = new SteelSeeds(ModCompat.SteelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SteelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SteelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SteelCrop);
            ItemRegisterHelper.registerItem(ModCompat.SteelSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotSteel");
            Object craftingMaterial = "ingotSteel";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockSteel";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SteelSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.imperioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutSteel, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SteelEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.SteelEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.SteelSeeds }));
            OreDictionary.registerOre("imperioMaterial", new ItemStack(ModCompat.SteelEssence));
        }
        if (ConfigDisable.TERRASTEEL && OreCheck.getModOre("ingotTerrasteel") != null) {
            ModCompat.TerrasteelEssence = new TerrasteelEssence().setUnlocalizedName("TerrasteelEssence");
            ModCompat.TerrasteelCrop = new TerrasteelCrop().setBlockName("TerrasteelCrop");
            ModCompat.TerrasteelSeeds = new TerrasteelSeeds(ModCompat.TerrasteelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("TerrasteelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.TerrasteelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.TerrasteelCrop);
            ItemRegisterHelper.registerItem(ModCompat.TerrasteelSeeds);
            final ItemStack modIngot = OreCheck.getModOre("ingotTerrasteel");
            Object craftingMaterial = "ingotTerrasteel";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockTerrasteel";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.TerrasteelSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.zivicioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutTerrasteel, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.TerrasteelEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.TerrasteelEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.TerrasteelSeeds }));
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(ModCompat.TerrasteelEssence));
        }
        if (ConfigDisable.AWAKENED_DRACONIUM && OreCheck.getModOre("ingotDraconiumAwakened") != null) {
            ModCompat.AwakenedDraconiumEssence = new AwakenedDraconiumEssence().setUnlocalizedName("AwakenedDraconiumEssence");
            ModCompat.AwakenedDraconiumCrop = new AwakenedDraconiumCrop().setBlockName("AwakenedDraconiumCrop");
            ModCompat.AwakenedDraconiumSeeds = new AwakenedDraconiumSeeds(ModCompat.AwakenedDraconiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_awakeneddraconium").setUnlocalizedName("AwakenedDraconiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.AwakenedDraconiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.AwakenedDraconiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.AwakenedDraconiumSeeds);
            
            final ItemStack modIngot = OreCheck.getModOre("ingotDraconiumAwakened");
            Object craftingMaterial = "ingotDraconiumAwakened";
            if (ConfigMain.HARD_MODE) {
                craftingMaterial = "blockDraconiumAwakened";
            }
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.AwakenedDraconiumSeeds, ModCompat.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', ModCompat.zivicioEssence, 'Y', craftingMaterial, 'Z', ModCompat.minicioSeeds }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(modIngot.getItem(), ConfigCrafting.outPutAwakenedDraconium, modIngot.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.AwakenedDraconiumEssence }));
            GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(ModCompat.AwakenedDraconiumEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', ModCompat.AwakenedDraconiumSeeds }));
            OreDictionary.registerOre("awakenedDraconiumMaterial", new ItemStack(ModCompat.AwakenedDraconiumEssence));
        }
    }
    
    static {
        ModCompat.seedOutPut = ConfigMain.SEED_OUTPUT;
        ModCompat.minicioEssence = Essence.MinicioEssence;
        ModCompat.accioEssence = Essence.AccioEssence;
        ModCompat.crucioEssence = Essence.CrucioEssence;
        ModCompat.imperioEssence = Essence.ImperioEssence;
        ModCompat.zivicioEssence = Essence.ZivicioEssence;
        ModCompat.minicioSeeds = new ItemStack(MSeeds.MinicioSeeds, 1, 32767);
        ModCompat.farmland = Blocks.farmland;
    }
}
