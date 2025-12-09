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
    public static Item ChaosShardSeeds;
    public static Item ChaosShardEssence;
    public static Block ChaosShardCrop;
    
    public static void loadCompat() {
        if (ConfigDisable.ALUMINIUM && OreCheck.getModOre("oreAluminium") != null && OreCheck.getModOre("ingotAluminium") != null) {
            ModCompat.AluminiumEssence = new AluminiumEssence().setUnlocalizedName("AluminiumEssence");
            ModCompat.AluminiumCrop = new AluminiumCrop().setBlockName("AluminiumCrop");
            ModCompat.AluminiumSeeds = new AluminiumSeeds(ModCompat.AluminiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("AluminiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.AluminiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.AluminiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.AluminiumSeeds);
            registerCompatRecipes(ModCompat.AluminiumSeeds, ModCompat.AluminiumEssence, ModCompat.crucioEssence, "ingotAluminium", "blockAluminium", OreCheck.getModOre("oreAluminium"), ConfigCrafting.outPutAluminium, "crucioMaterial");
        }
        if (ConfigDisable.ARDITE && OreCheck.getModOre("oreArdite") != null && OreCheck.getModOre("ingotArdite") != null) {
            ModCompat.ArditeEssence = new ArditeEssence().setUnlocalizedName("ArditeEssence");
            ModCompat.ArditeCrop = new ArditeCrop().setBlockName("ArditeCrop");
            ModCompat.ArditeSeeds = new ArditeSeeds(ModCompat.ArditeCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ArditeSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ArditeEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ArditeCrop);
            ItemRegisterHelper.registerItem(ModCompat.ArditeSeeds);
            registerCompatRecipes(ModCompat.ArditeSeeds, ModCompat.ArditeEssence, ModCompat.imperioEssence, "ingotArdite", "blockArdite", OreCheck.getModOre("oreArdite"), ConfigCrafting.outPutArdite, "imperioMaterial");
        }
        if (ConfigDisable.COBALT && OreCheck.getModOre("oreCobalt") != null && OreCheck.getModOre("ingotCobalt") != null) {
            ModCompat.CobaltEssence = new CobaltEssence().setUnlocalizedName("CobaltEssence");
            ModCompat.CobaltCrop = new CobaltCrop().setBlockName("CobaltCrop");
            ModCompat.CobaltSeeds = new CobaltSeeds(ModCompat.CobaltCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("CobaltSeeds");
            ItemRegisterHelper.registerItem(ModCompat.CobaltEssence);
            BlockRegisterHelper.registerBlock(ModCompat.CobaltCrop);
            ItemRegisterHelper.registerItem(ModCompat.CobaltSeeds);
            registerCompatRecipes(ModCompat.CobaltSeeds, ModCompat.CobaltEssence, ModCompat.zivicioEssence, "ingotCobalt", "blockCobalt", OreCheck.getModOre("oreCobalt"), ConfigCrafting.outPutCobalt, "zivicioMaterial");
        }
        if (ConfigDisable.COPPER && OreCheck.getModOre("oreCopper") != null && OreCheck.getModOre("ingotCopper") != null) {
            ModCompat.CopperEssence = new CopperEssence().setUnlocalizedName("CopperEssence");
            ModCompat.CopperCrop = new CopperCrop().setBlockName("CopperCrop");
            ModCompat.CopperSeeds = new CopperSeeds(ModCompat.CopperCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("CopperSeeds");
            ItemRegisterHelper.registerItem(ModCompat.CopperEssence);
            BlockRegisterHelper.registerBlock(ModCompat.CopperCrop);
            ItemRegisterHelper.registerItem(ModCompat.CopperSeeds);
            registerCompatRecipes(ModCompat.CopperSeeds, ModCompat.CopperEssence, ModCompat.crucioEssence, "ingotCopper", "blockCopper", OreCheck.getModOre("oreCopper"), ConfigCrafting.outPutCopper, "crucioMaterial");
        }
        if (ConfigDisable.CERTUSQUARTZ && OreCheck.getModOre("oreCertusQuartz") != null && OreCheck.getModOre("crystalCertusQuartz") != null) {
            ModCompat.CertusQuartzEssence = new CertusQuartzEssence().setUnlocalizedName("CertusQuartzEssence");
            ModCompat.CertusQuartzCrop = new CertusQuartzCrop().setBlockName("CertusQuartzCrop");
            ModCompat.CertusQuartzSeeds = new CertusQuartzSeeds(ModCompat.CertusQuartzCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("CertusQuartzSeeds");
            ItemRegisterHelper.registerItem(ModCompat.CertusQuartzEssence);
            BlockRegisterHelper.registerBlock(ModCompat.CertusQuartzCrop);
            ItemRegisterHelper.registerItem(ModCompat.CertusQuartzSeeds);
            registerCompatRecipes(ModCompat.CertusQuartzSeeds, ModCompat.CertusQuartzEssence, ModCompat.crucioEssence, "crystalCertusQuartz", "blockCertusQuartz", OreCheck.getModOre("oreCertusQuartz"), ConfigCrafting.outPutCertusQuartz, "crucioMaterial");
        }
        if (ConfigDisable.LEAD && OreCheck.getModOre("oreLead") != null && OreCheck.getModOre("ingotLead") != null) {
            ModCompat.LeadEssence = new LeadEssence().setUnlocalizedName("LeadEssence");
            ModCompat.LeadCrop = new LeadCrop().setBlockName("LeadCrop");
            ModCompat.LeadSeeds = new LeadSeeds(ModCompat.LeadCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("LeadSeeds");
            ItemRegisterHelper.registerItem(ModCompat.LeadEssence);
            BlockRegisterHelper.registerBlock(ModCompat.LeadCrop);
            ItemRegisterHelper.registerItem(ModCompat.LeadSeeds);
            registerCompatRecipes(ModCompat.LeadSeeds, ModCompat.LeadEssence, ModCompat.crucioEssence, "ingotLead", "blockLead", OreCheck.getModOre("oreLead"), ConfigCrafting.outPutLead, "crucioMaterial");
        }
        if (ConfigDisable.NICKEL && OreCheck.getModOre("oreNickel") != null && OreCheck.getModOre("ingotNickel") != null) {
            ModCompat.NickelEssence = new NickelEssence().setUnlocalizedName("NickelEssence");
            ModCompat.NickelCrop = new NickelCrop().setBlockName("NickelCrop");
            ModCompat.NickelSeeds = new NickelSeeds(ModCompat.NickelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("NickelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.NickelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.NickelCrop);
            ItemRegisterHelper.registerItem(ModCompat.NickelSeeds);
            registerCompatRecipes(ModCompat.NickelSeeds, ModCompat.NickelEssence, ModCompat.imperioEssence, "ingotNickel", "blockNickel", OreCheck.getModOre("oreNickel"), ConfigCrafting.outPutNickel, "imperioMaterial");
        }
        if (ConfigDisable.OSMIUM && OreCheck.getModOre("oreOsmium") != null && OreCheck.getModOre("ingotOsmium") != null) {
            ModCompat.OsmiumEssence = new OsmiumEssence().setUnlocalizedName("OsmiumEssence");
            ModCompat.OsmiumCrop = new OsmiumCrop().setBlockName("OsmiumCrop");
            ModCompat.OsmiumSeeds = new OsmiumSeeds(ModCompat.OsmiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("OsmiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.OsmiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.OsmiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.OsmiumSeeds);
            registerCompatRecipes(ModCompat.OsmiumSeeds, ModCompat.OsmiumEssence, ModCompat.imperioEssence, "ingotOsmium", "blockOsmium", OreCheck.getModOre("oreOsmium"), ConfigCrafting.outPutOsmium, "imperioMaterial");
        }
        if (ConfigDisable.PERIDOT && OreCheck.getModOre("gemPeridot") != null) {
            ModCompat.PeridotEssence = new PeridotEssence().setUnlocalizedName("PeridotEssence");
            ModCompat.PeridotCrop = new PeridotCrop().setBlockName("PeridotCrop");
            ModCompat.PeridotSeeds = new PeridotSeeds(ModCompat.PeridotCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("PeridotSeeds");
            ItemRegisterHelper.registerItem(ModCompat.PeridotEssence);
            BlockRegisterHelper.registerBlock(ModCompat.PeridotCrop);
            ItemRegisterHelper.registerItem(ModCompat.PeridotSeeds);
            registerCompatRecipes(ModCompat.PeridotSeeds, ModCompat.PeridotEssence, ModCompat.imperioEssence, "gemPeridot", "blockPeridot", OreCheck.getModOre("gemPeridot"), ConfigCrafting.outPutPeridot, "imperioMaterial");
        }
        if (ConfigDisable.RUBY && OreCheck.getModOre("gemRuby") != null) {
            ModCompat.RubyEssence = new RubyEssence().setUnlocalizedName("RubyEssence");
            ModCompat.RubyCrop = new RubyCrop().setBlockName("RubyCrop");
            ModCompat.RubySeeds = new RubySeeds(ModCompat.RubyCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("RubySeeds");
            ItemRegisterHelper.registerItem(ModCompat.RubyEssence);
            BlockRegisterHelper.registerBlock(ModCompat.RubyCrop);
            ItemRegisterHelper.registerItem(ModCompat.RubySeeds);
            registerCompatRecipes(ModCompat.RubySeeds, ModCompat.RubyEssence, ModCompat.imperioEssence, "gemRuby", "blockRuby", OreCheck.getModOre("gemRuby"), ConfigCrafting.outPutRuby, "imperioMaterial");
        }
        if (ConfigDisable.SAPPHIRE && OreCheck.getModOre("gemSapphire") != null) {
            ModCompat.SapphireEssence = new SapphireEssence().setUnlocalizedName("SapphireEssence");
            ModCompat.SapphireCrop = new SapphireCrop().setBlockName("SapphireCrop");
            ModCompat.SapphireSeeds = new SapphireSeeds(ModCompat.SapphireCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SapphireSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SapphireEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SapphireCrop);
            ItemRegisterHelper.registerItem(ModCompat.SapphireSeeds);
            registerCompatRecipes(ModCompat.SapphireSeeds, ModCompat.SapphireEssence, ModCompat.imperioEssence, "gemSapphire", "blockSapphire", OreCheck.getModOre("gemSapphire"), ConfigCrafting.outPutSapphire, "imperioMaterial");
        }
        if (ConfigDisable.PLATINUM && OreCheck.getModOre("ingotPlatinum") != null) {
            ModCompat.PlatinumEssence = new PlatinumEssence().setUnlocalizedName("PlatinumEssence");
            ModCompat.PlatinumCrop = new PlatinumCrop().setBlockName("PlatinumCrop");
            ModCompat.PlatinumSeeds = new PlatinumSeeds(ModCompat.PlatinumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("PlatinumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.PlatinumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.PlatinumCrop);
            ItemRegisterHelper.registerItem(ModCompat.PlatinumSeeds);
            registerCompatRecipes(ModCompat.PlatinumSeeds, ModCompat.PlatinumEssence, ModCompat.zivicioEssence, "ingotPlatinum", "blockPlatinum", OreCheck.getModOre("ingotPlatinum"), ConfigCrafting.outPutPlatinum, "zivicioMaterial");
        }
        if (ConfigDisable.RUBBER && OreCheck.getModOre("itemRawRubber") != null) {
            ModCompat.RubberEssence = new RubberEssence().setUnlocalizedName("RubberEssence");
            ModCompat.RubberCrop = new RubberCrop().setBlockName("RubberCrop");
            ModCompat.RubberSeeds = new RubberSeeds(ModCompat.RubberCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("RubberSeeds");
            ItemRegisterHelper.registerItem(ModCompat.RubberEssence);
            BlockRegisterHelper.registerBlock(ModCompat.RubberCrop);
            ItemRegisterHelper.registerItem(ModCompat.RubberSeeds);
            registerCompatRecipes(ModCompat.RubberSeeds, ModCompat.RubberEssence, ModCompat.accioEssence, "itemRawRubber", "blockRubber", OreCheck.getModOre("itemRawRubber"), ConfigCrafting.outPutRubber, "accioMaterial");
        }
        if (ConfigDisable.SILVER && OreCheck.getModOre("oreSilver") != null && OreCheck.getModOre("ingotSilver") != null) {
            ModCompat.SilverEssence = new SilverEssence().setUnlocalizedName("SilverEssence");
            ModCompat.SilverCrop = new SilverCrop().setBlockName("SilverCrop");
            ModCompat.SilverSeeds = new SilverSeeds(ModCompat.SilverCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SilverSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SilverEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SilverCrop);
            ItemRegisterHelper.registerItem(ModCompat.SilverSeeds);
            registerCompatRecipes(ModCompat.SilverSeeds, ModCompat.SilverEssence, ModCompat.imperioEssence, "ingotSilver", "blockSilver", OreCheck.getModOre("oreSilver"), ConfigCrafting.outPutSilver, "imperioMaterial");
        }
        if (ConfigDisable.TIN && OreCheck.getModOre("oreTin") != null && OreCheck.getModOre("ingotTin") != null) {
            ModCompat.TinEssence = new TinEssence().setUnlocalizedName("TinEssence");
            ModCompat.TinCrop = new TinCrop().setBlockName("TinCrop");
            ModCompat.TinSeeds = new TinSeeds(ModCompat.TinCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("TinSeeds");
            ItemRegisterHelper.registerItem(ModCompat.TinEssence);
            BlockRegisterHelper.registerBlock(ModCompat.TinCrop);
            ItemRegisterHelper.registerItem(ModCompat.TinSeeds);
            registerCompatRecipes(ModCompat.TinSeeds, ModCompat.TinEssence, ModCompat.crucioEssence, "ingotTin", "blockTin", OreCheck.getModOre("oreTin"), ConfigCrafting.outPutTin, "crucioMaterial");
        }
        if (ConfigDisable.SULFUR && OreCheck.getModOre("dustSulfur") != null) {
            ModCompat.SulfurEssence = new SulfurEssence().setUnlocalizedName("SulfurEssence");
            ModCompat.SulfurCrop = new SulfurCrop().setBlockName("SulfurCrop");
            ModCompat.SulfurSeeds = new SulfurSeeds(ModCompat.SulfurCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SulfurSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SulfurEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SulfurCrop);
            ItemRegisterHelper.registerItem(ModCompat.SulfurSeeds);
            registerCompatRecipes(ModCompat.SulfurSeeds, ModCompat.SulfurEssence, ModCompat.crucioEssence, "dustSulfur", "blockSulfur", OreCheck.getModOre("dustSulfur"), ConfigCrafting.outPutSulfur, "crucioMaterial");
        }
        if (ConfigDisable.YELLORITE && OreCheck.getModOre("oreYellorite") != null && OreCheck.getModOre("ingotYellorium") != null) {
            ModCompat.YelloriteEssence = new YelloriteEssence().setUnlocalizedName("YelloriteEssence");
            ModCompat.YelloriteCrop = new YelloriteCrop().setBlockName("YelloriteCrop");
            ModCompat.YelloriteSeeds = new YelloriteSeeds(ModCompat.YelloriteCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("YelloriteSeeds");
            ItemRegisterHelper.registerItem(ModCompat.YelloriteEssence);
            BlockRegisterHelper.registerBlock(ModCompat.YelloriteCrop);
            ItemRegisterHelper.registerItem(ModCompat.YelloriteSeeds);
            registerCompatRecipes(ModCompat.YelloriteSeeds, ModCompat.YelloriteEssence, ModCompat.imperioEssence, "ingotYellorium", "blockYellorium", OreCheck.getModOre("oreYellorite"), ConfigCrafting.outPutYellorite, "imperioMaterial");
        }
        if (ConfigDisable.ALUMITE && OreCheck.getModOre("ingotAlumite") != null) {
            ModCompat.AlumiteEssence = new AlumiteEssence().setUnlocalizedName("AlumiteEssence");
            ModCompat.AlumiteCrop = new AlumiteCrop().setBlockName("AlumiteCrop");
            ModCompat.AlumiteSeeds = new AlumiteSeeds(ModCompat.AlumiteCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("AlumiteSeeds");
            ItemRegisterHelper.registerItem(ModCompat.AlumiteEssence);
            BlockRegisterHelper.registerBlock(ModCompat.AlumiteCrop);
            ItemRegisterHelper.registerItem(ModCompat.AlumiteSeeds);
            registerCompatRecipes(ModCompat.AlumiteSeeds, ModCompat.AlumiteEssence, ModCompat.imperioEssence, "ingotAlumite", "blockAlumite", OreCheck.getModOre("ingotAlumite"), ConfigCrafting.outPutAlumite, "imperioMaterial");
        }
        if (ConfigDisable.BLIZZ && OreCheck.getModOre("rodBlizz") != null) {
            ModCompat.BlizzEssence = new BlizzEssence().setUnlocalizedName("BlizzEssence");
            ModCompat.BlizzCrop = new BlizzCrop().setBlockName("BlizzCrop");
            ModCompat.BlizzSeeds = new BlizzSeeds(ModCompat.BlizzCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("BlizzSeeds");
            ItemRegisterHelper.registerItem(ModCompat.BlizzEssence);
            BlockRegisterHelper.registerBlock(ModCompat.BlizzCrop);
            ItemRegisterHelper.registerItem(ModCompat.BlizzSeeds);
            registerCompatRecipes(ModCompat.BlizzSeeds, ModCompat.BlizzEssence, ModCompat.imperioEssence, "rodBlizz", "blockBlizz", OreCheck.getModOre("rodBlizz"), ConfigCrafting.outPutBlizz, "imperioMaterial");
        }
        if (ConfigDisable.BRONZE && OreCheck.getModOre("ingotBronze") != null) {
            ModCompat.BronzeEssence = new BronzeEssence().setUnlocalizedName("BronzeEssence");
            ModCompat.BronzeCrop = new BronzeCrop().setBlockName("BronzeCrop");
            ModCompat.BronzeSeeds = new BronzeSeeds(ModCompat.BronzeCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("BronzeSeeds");
            ItemRegisterHelper.registerItem(ModCompat.BronzeEssence);
            BlockRegisterHelper.registerBlock(ModCompat.BronzeCrop);
            ItemRegisterHelper.registerItem(ModCompat.BronzeSeeds);
            registerCompatRecipes(ModCompat.BronzeSeeds, ModCompat.BronzeEssence, ModCompat.crucioEssence, "ingotBronze", "blockBronze", OreCheck.getModOre("ingotBronze"), ConfigCrafting.outPutBronze, "crucioMaterial");
        }
        if (ConfigDisable.ELECTRUM && OreCheck.getModOre("ingotElectrum") != null) {
            ModCompat.ElectrumEssence = new ElectrumEssence().setUnlocalizedName("ElectrumEssence");
            ModCompat.ElectrumCrop = new ElectrumCrop().setBlockName("ElectrumCrop");
            ModCompat.ElectrumSeeds = new ElectrumSeeds(ModCompat.ElectrumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ElectrumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ElectrumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ElectrumCrop);
            ItemRegisterHelper.registerItem(ModCompat.ElectrumSeeds);
            registerCompatRecipes(ModCompat.ElectrumSeeds, ModCompat.ElectrumEssence, ModCompat.imperioEssence, "ingotElectrum", "blockElectrum", OreCheck.getModOre("ingotElectrum"), ConfigCrafting.outPutElectrum, "imperioMaterial");
        }
        if (ConfigDisable.ENDERIUM && OreCheck.getModOre("ingotEnderium") != null) {
            ModCompat.EnderiumEssence = new EnderiumEssence().setUnlocalizedName("EnderiumEssence");
            ModCompat.EnderiumCrop = new EnderiumCrop().setBlockName("EnderiumCrop");
            ModCompat.EnderiumSeeds = new EnderiumSeeds(ModCompat.EnderiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("EnderiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.EnderiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.EnderiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.EnderiumSeeds);
            registerCompatRecipes(ModCompat.EnderiumSeeds, ModCompat.EnderiumEssence, ModCompat.zivicioEssence, "ingotEnderium", "blockEnderium", OreCheck.getModOre("ingotEnderium"), ConfigCrafting.outPutEnderium, "zivicioMaterial");
        }
        if (ConfigDisable.FLUIX && OreCheck.getModOre("crystalFluix") != null) {
            ModCompat.FluixEssence = new FluixEssence().setUnlocalizedName("FluixEssence");
            ModCompat.FluixCrop = new FluixCrop().setBlockName("FluixCrop");
            ModCompat.FluixSeeds = new FluixSeeds(ModCompat.FluixCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("FluixSeeds");
            ItemRegisterHelper.registerItem(ModCompat.FluixEssence);
            BlockRegisterHelper.registerBlock(ModCompat.FluixCrop);
            ItemRegisterHelper.registerItem(ModCompat.FluixSeeds);
            registerCompatRecipes(ModCompat.FluixSeeds, ModCompat.FluixEssence, ModCompat.imperioEssence, "crystalFluix", "blockFluix", OreCheck.getModOre("crystalFluix"), ConfigCrafting.outPutFluix, "imperioMaterial");
        }
        if (ConfigDisable.INVAR && OreCheck.getModOre("ingotInvar") != null) {
            ModCompat.InvarEssence = new InvarEssence().setUnlocalizedName("InvarEssence");
            ModCompat.InvarCrop = new InvarCrop().setBlockName("InvarCrop");
            ModCompat.InvarSeeds = new InvarSeeds(ModCompat.InvarCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("InvarSeeds");
            ItemRegisterHelper.registerItem(ModCompat.InvarEssence);
            BlockRegisterHelper.registerBlock(ModCompat.InvarCrop);
            ItemRegisterHelper.registerItem(ModCompat.InvarSeeds);
            registerCompatRecipes(ModCompat.InvarSeeds, ModCompat.InvarEssence, ModCompat.imperioEssence, "ingotInvar", "blockInvar", OreCheck.getModOre("ingotInvar"), ConfigCrafting.outPutInvar, "imperioMaterial");
        }
        if (ConfigDisable.LUMIUM && OreCheck.getModOre("ingotLumium") != null) {
            ModCompat.LumiumEssence = new LumiumEssence().setUnlocalizedName("LumiumEssence");
            ModCompat.LumiumCrop = new LumiumCrop().setBlockName("LumiumCrop");
            ModCompat.LumiumSeeds = new LumiumSeeds(ModCompat.LumiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("LumiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.LumiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.LumiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.LumiumSeeds);
            registerCompatRecipes(ModCompat.LumiumSeeds, ModCompat.LumiumEssence, ModCompat.imperioEssence, "ingotLumium", "blockLumium", OreCheck.getModOre("ingotLumium"), ConfigCrafting.outPutLumium, "imperioMaterial");
        }
        if (ConfigDisable.MANASTEEL && OreCheck.getModOre("ingotManasteel") != null) {
            ModCompat.ManasteelEssence = new ManasteelEssence().setUnlocalizedName("ManasteelEssence");
            ModCompat.ManasteelCrop = new ManasteelCrop().setBlockName("ManasteelCrop");
            ModCompat.ManasteelSeeds = new ManasteelSeeds(ModCompat.ManasteelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("ManasteelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ManasteelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ManasteelCrop);
            ItemRegisterHelper.registerItem(ModCompat.ManasteelSeeds);
            registerCompatRecipes(ModCompat.ManasteelSeeds, ModCompat.ManasteelEssence, ModCompat.crucioEssence, "ingotManasteel", "blockManasteel", OreCheck.getModOre("ingotManasteel"), ConfigCrafting.outPutManasteel, "crucioMaterial");
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
            registerCompatRecipes(ModCompat.SignalumSeeds, ModCompat.SignalumEssence, ModCompat.imperioEssence, "ingotSignalum", "blockSignalum", OreCheck.getModOre("ingotSignalum"), ConfigCrafting.outPutSignalum, "imperioMaterial");
        }
        if (ConfigDisable.STEEL && OreCheck.getModOre("ingotSteel") != null) {
            ModCompat.SteelEssence = new SteelEssence().setUnlocalizedName("SteelEssence");
            ModCompat.SteelCrop = new SteelCrop().setBlockName("SteelCrop");
            ModCompat.SteelSeeds = new SteelSeeds(ModCompat.SteelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("SteelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.SteelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.SteelCrop);
            ItemRegisterHelper.registerItem(ModCompat.SteelSeeds);
            registerCompatRecipes(ModCompat.SteelSeeds, ModCompat.SteelEssence, ModCompat.imperioEssence, "ingotSteel", "blockSteel", OreCheck.getModOre("ingotSteel"), ConfigCrafting.outPutSteel, "imperioMaterial");
        }
        if (ConfigDisable.TERRASTEEL && OreCheck.getModOre("ingotTerrasteel") != null) {
            ModCompat.TerrasteelEssence = new TerrasteelEssence().setUnlocalizedName("TerrasteelEssence");
            ModCompat.TerrasteelCrop = new TerrasteelCrop().setBlockName("TerrasteelCrop");
            ModCompat.TerrasteelSeeds = new TerrasteelSeeds(ModCompat.TerrasteelCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_blank").setUnlocalizedName("TerrasteelSeeds");
            ItemRegisterHelper.registerItem(ModCompat.TerrasteelEssence);
            BlockRegisterHelper.registerBlock(ModCompat.TerrasteelCrop);
            ItemRegisterHelper.registerItem(ModCompat.TerrasteelSeeds);
            registerCompatRecipes(ModCompat.TerrasteelSeeds, ModCompat.TerrasteelEssence, ModCompat.zivicioEssence, "ingotTerrasteel", "blockTerrasteel", OreCheck.getModOre("ingotTerrasteel"), ConfigCrafting.outPutTerrasteel, "zivicioMaterial");
        }

        // Ensure Draconic Evolution items are in OreDict
        registerOreDictIfMissing("DraconicEvolution", "chaosShard", "chaosShard");

        if (ConfigDisable.AWAKENED_DRACONIUM && OreCheck.getModOre("ingotDraconiumAwakened") != null) {
            ModCompat.AwakenedDraconiumEssence = new AwakenedDraconiumEssence().setUnlocalizedName("AwakenedDraconiumEssence");
            ModCompat.AwakenedDraconiumCrop = new AwakenedDraconiumCrop().setBlockName("AwakenedDraconiumCrop");
            ModCompat.AwakenedDraconiumSeeds = new AwakenedDraconiumSeeds(ModCompat.AwakenedDraconiumCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_awakeneddraconium").setUnlocalizedName("AwakenedDraconiumSeeds");
            ItemRegisterHelper.registerItem(ModCompat.AwakenedDraconiumEssence);
            BlockRegisterHelper.registerBlock(ModCompat.AwakenedDraconiumCrop);
            ItemRegisterHelper.registerItem(ModCompat.AwakenedDraconiumSeeds);
            registerCompatRecipes(ModCompat.AwakenedDraconiumSeeds, ModCompat.AwakenedDraconiumEssence, ModCompat.zivicioEssence, "ingotDraconiumAwakened", "blockDraconiumAwakened", OreCheck.getModOre("ingotDraconiumAwakened"), ConfigCrafting.outPutAwakenedDraconium, "awakenedDraconiumMaterial");
        }
        if (ConfigDisable.CHAOS_SHARD && OreCheck.getModOre("chaosShard") != null) {
            ModCompat.ChaosShardEssence = new ChaosShardEssence().setUnlocalizedName("ChaosShardEssence");
            ModCompat.ChaosShardCrop = new ChaosShardCrop().setBlockName("ChaosShardCrop");
            ModCompat.ChaosShardSeeds = new ChaosShardSeeds(ModCompat.ChaosShardCrop, ModCompat.farmland).setTextureName("magicalcrops:seeds_chaosshard").setUnlocalizedName("ChaosShardSeeds");
            ItemRegisterHelper.registerItem(ModCompat.ChaosShardEssence);
            BlockRegisterHelper.registerBlock(ModCompat.ChaosShardCrop);
            ItemRegisterHelper.registerItem(ModCompat.ChaosShardSeeds);
            
            ItemStack chaosFragmentStack = null;
            ItemStack normalChaosFragmentStack = null;
            Item fragmentItem = GameRegistry.findItem("DraconicEvolution", "chaosFragment");
            if (fragmentItem != null) {
                // Tiny Chaos Fragment has metadata 0
                chaosFragmentStack = new ItemStack(fragmentItem, 1, 0);
                // Large Chaos Fragment has metadata 2
                normalChaosFragmentStack = new ItemStack(fragmentItem, 1, 2);
            }
            
            Object normalInput = (normalChaosFragmentStack != null) ? normalChaosFragmentStack : "chaosShard";
            ItemStack resultItem = (chaosFragmentStack != null) ? chaosFragmentStack : OreCheck.getModOre("chaosShard");
            
            registerCompatRecipes(ModCompat.ChaosShardSeeds, ModCompat.ChaosShardEssence, ModCompat.zivicioEssence, normalInput, "chaosShard", resultItem, ConfigCrafting.outPutChaosShard, "chaosShardMaterial");
        }
    }

    // Helper method to register missing OreDict entries
    private static void registerOreDictIfMissing(String modId, String itemName, String oreDictName) {
        if (OreCheck.getModOre(oreDictName) == null) {
            Item item = GameRegistry.findItem(modId, itemName);
            if (item != null) {
                OreDictionary.registerOre(oreDictName, new ItemStack(item));
            }
        }
    }

    // Helper method to register recipes and ore dictionary entries
    private static void registerCompatRecipes(Item seed, Item essence, Item tierEssence, Object normalItem, Object hardItem, ItemStack resultItem, int resultAmount, String oreDictCategory) {
        Object craftingMaterial = ConfigMain.HARD_MODE ? hardItem : normalItem;
        // Register recipe for seeds
        GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(seed, seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', tierEssence, 'Y', craftingMaterial, 'Z', minicioSeeds }));
        // Register recipe for 3x3 essence -> item/ingot/block
        GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(resultItem.getItem(), resultAmount, resultItem.getItemDamage()), new Object[] { "XXX", "XXX", "XXX", 'X', essence }));
        // Register recipe for 3x3 essence -> seeds
        GameRegistry.addRecipe((IRecipe)new ShapedOreRecipe(new ItemStack(essence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', seed }));
        OreDictionary.registerOre(oreDictCategory, new ItemStack(essence));
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
