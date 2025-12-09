package com.mark719.magicalcrops.recipes;

import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;
import net.minecraftforge.oredict.*;
import net.minecraft.item.crafting.*;
import com.mark719.magicalcrops.handlers.*;
import com.mark719.magicalcrops.config.*;

public class SeedRecipes
{
    static int seedOutPut;
    static Item minicioEssence;
    static Item accioEssence;
    static Item crucioEssence;
    static Item imperioEssence;
    static Item zivicioEssence;
    static ItemStack allDye;
    static ItemStack minicioSeed;
    static ItemStack enchantedBook;
    static ItemStack airSeeds;
    static ItemStack coalSeeds;
    static ItemStack diamondSeeds;
    static ItemStack dyeSeeds;
    static ItemStack earthSeeds;
    static ItemStack emeraldSeeds;
    static ItemStack experienceSeeds;
    static ItemStack fireSeeds;
    static ItemStack glowstoneSeeds;
    static ItemStack goldSeeds;
    static ItemStack ironSeeds;
    static ItemStack lapisSeeds;
    static ItemStack minicioSeeds;
    static ItemStack natureSeeds;
    static ItemStack netherSeeds;
    static ItemStack obsidianSeeds;
    static ItemStack quartzSeeds;
    static ItemStack redstoneSeeds;
    static ItemStack waterSeeds;
    static ItemStack cowSeeds;
    static ItemStack chickenSeeds;
    static ItemStack sheepSeeds;
    static ItemStack pigSeeds;
    static ItemStack creeperSeeds;
    static ItemStack blazeSeeds;
    static ItemStack ghastSeeds;
    static ItemStack skeletonSeeds;
    static ItemStack slimeSeeds;
    static ItemStack spiderSeeds;
    static ItemStack witherSeeds;
    static ItemStack endermanSeeds;
    
    public static void loadRecipes() {
        GameRegistry.addRecipe(new ItemStack(MSeeds.MinicioSeeds, 1), new Object[] { "XXX", "XYX", "XXX", 'X', SeedRecipes.minicioEssence, 'Y', Items.wheat_seeds });
        
        Object coalMaterial = Items.coal;
        if (ConfigMain.HARD_MODE) {
            coalMaterial = Blocks.coal_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.CoalSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.accioEssence, 'Y', coalMaterial, 'Z', SeedRecipes.minicioSeed });
        
        GameRegistry.addRecipe(new ItemStack(MSeeds.DyeSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.accioEssence, 'Y', SeedRecipes.allDye, 'Z', SeedRecipes.minicioSeed });
        GameRegistry.addRecipe(new ItemStack(MSeeds.WaterSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.accioEssence, 'Y', Items.water_bucket, 'Z', SeedRecipes.minicioSeed });
        GameRegistry.addRecipe(new ItemStack(MSeeds.FireSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.accioEssence, 'Y', Items.lava_bucket, 'Z', SeedRecipes.minicioSeed });
        GameRegistry.addRecipe(new ItemStack(MSeeds.EarthSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.accioEssence, 'Y', Blocks.dirt, 'Z', SeedRecipes.minicioSeed });
        GameRegistry.addRecipe(new ItemStack(MSeeds.AirSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.accioEssence, 'Y', Items.glass_bottle, 'Z', SeedRecipes.minicioSeed });
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MSeeds.NatureSeeds, SeedRecipes.seedOutPut), new Object[] {"YXY", "XZX", "YXY", 'X', SeedRecipes.accioEssence, 'Y', "natureMaterial", 'Z', SeedRecipes.minicioSeed}));
        
        Object redstoneMaterial = Items.redstone;
        if (ConfigMain.HARD_MODE) {
            redstoneMaterial = Blocks.redstone_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.RedstoneSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', redstoneMaterial, 'Z', SeedRecipes.minicioSeed });
        
        Object glowstoneMaterial = Items.glowstone_dust;
        if (ConfigMain.HARD_MODE) {
            glowstoneMaterial = Blocks.glowstone;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.GlowstoneSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', glowstoneMaterial, 'Z', SeedRecipes.minicioSeed });
        
        GameRegistry.addRecipe(new ItemStack(MSeeds.ObsidianSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', Blocks.obsidian, 'Z', SeedRecipes.minicioSeed });
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MSeeds.NetherSeeds, SeedRecipes.seedOutPut), new Object[] {"YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', "netherMaterial", 'Z', SeedRecipes.minicioSeed}));
        
        Object ironMaterial = Items.iron_ingot;
        if (ConfigMain.HARD_MODE) {
            ironMaterial = Blocks.iron_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.IronSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', ironMaterial, 'Z', SeedRecipes.minicioSeed });
        
        Object goldMaterial = Items.gold_ingot;
        if (ConfigMain.HARD_MODE) {
            goldMaterial = Blocks.gold_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.GoldSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', goldMaterial, 'Z', SeedRecipes.minicioSeed });
        
        Object lapisMaterial = new ItemStack(Items.dye, 1, 4);
        if (ConfigMain.HARD_MODE) {
            lapisMaterial = Blocks.lapis_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.LapisSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', lapisMaterial, 'Z', SeedRecipes.minicioSeed });
        
        GameRegistry.addRecipe(new ItemStack(MSeeds.ExperienceSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Z', SeedRecipes.minicioSeed, 'Y', SeedRecipes.enchantedBook });
        
        Object quartzMaterial = Items.quartz;
        if (ConfigMain.HARD_MODE) {
            quartzMaterial = Blocks.quartz_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.QuartzSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', quartzMaterial, 'Z', SeedRecipes.minicioSeed });
        
        Object diamondMaterial = Items.diamond;
        if (ConfigMain.HARD_MODE) {
            diamondMaterial = Blocks.diamond_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.DiamondSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.zivicioEssence, 'Y', diamondMaterial, 'Z', SeedRecipes.minicioSeed });
        
        Object emeraldMaterial = Items.emerald;
        if (ConfigMain.HARD_MODE) {
            emeraldMaterial = Blocks.emerald_block;
        }
        GameRegistry.addRecipe(new ItemStack(MSeeds.EmeraldSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.zivicioEssence, 'Y', emeraldMaterial, 'Z', SeedRecipes.minicioSeed });
        GameRegistry.addRecipe(new ItemStack(MSeeds.CowSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', Items.leather, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.PigSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', Items.porkchop, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.ChickenSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', Items.egg, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.SheepSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.crucioEssence, 'Y', Blocks.wool, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.CreeperSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', Items.gunpowder, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.BlazeSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', Items.blaze_rod, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.EndermanSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', Items.ender_pearl, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.SkeletonSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', Items.bone, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.SlimeSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', Items.slime_ball, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.SpiderSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', Items.spider_eye, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.GhastSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.imperioEssence, 'Y', Items.ghast_tear, 'Z', SeedRecipes.minicioSeeds });
        GameRegistry.addRecipe(new ItemStack(MSeeds.WitherSeeds, SeedRecipes.seedOutPut), new Object[] { "YXY", "XZX", "YXY", 'X', SeedRecipes.zivicioEssence, 'Y', new ItemStack(Items.skull, 1, 1), 'Z', SeedRecipes.skeletonSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.AirEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.airSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.CoalEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.coalSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.DiamondEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.diamondSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.DyeEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.dyeSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.EarthEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.earthSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.EmeraldEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.emeraldSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.ExperienceEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.experienceSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.FireEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.fireSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.GlowstoneEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.glowstoneSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.GoldEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.goldSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.IronEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.ironSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.LapisEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.lapisSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.NatureEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.natureSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.NetherEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.netherSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.ObsidianEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.obsidianSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.QuartzEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.quartzSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.RedstoneEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.redstoneSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.WaterEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.waterSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.CowEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.cowSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.ChickenEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.chickenSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.SheepEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.sheepSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.PigEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.pigSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.CreeperEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.creeperSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.BlazeEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.blazeSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.EndermanEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.endermanSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.SkeletonEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.skeletonSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.SlimeEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.slimeSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.SpiderEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.spiderSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.GhastEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.ghastSeeds });
        GameRegistry.addRecipe(new ItemStack(Essence.WitherEssence, 1), new Object[] { "XXX", "XXX", "XXX", 'X', SeedRecipes.witherSeeds });
    }
    
    static {
        SeedRecipes.seedOutPut = ConfigMain.SEED_OUTPUT;
        SeedRecipes.minicioEssence = Essence.MinicioEssence;
        SeedRecipes.accioEssence = Essence.AccioEssence;
        SeedRecipes.crucioEssence = Essence.CrucioEssence;
        SeedRecipes.imperioEssence = Essence.ImperioEssence;
        SeedRecipes.zivicioEssence = Essence.ZivicioEssence;
        SeedRecipes.allDye = new ItemStack(Items.dye, 1, 32767);
        SeedRecipes.minicioSeed = new ItemStack(MSeeds.MinicioSeeds);
        SeedRecipes.enchantedBook = new ItemStack((Item)Items.enchanted_book, 1, 32767);
        SeedRecipes.airSeeds = new ItemStack(MSeeds.AirSeeds, 1, 32767);
        SeedRecipes.coalSeeds = new ItemStack(MSeeds.CoalSeeds, 1, 32767);
        SeedRecipes.diamondSeeds = new ItemStack(MSeeds.DiamondSeeds, 1, 32767);
        SeedRecipes.dyeSeeds = new ItemStack(MSeeds.DyeSeeds, 1, 32767);
        SeedRecipes.earthSeeds = new ItemStack(MSeeds.EarthSeeds, 1, 32767);
        SeedRecipes.emeraldSeeds = new ItemStack(MSeeds.EmeraldSeeds, 1, 32767);
        SeedRecipes.experienceSeeds = new ItemStack(MSeeds.ExperienceSeeds, 1, 32767);
        SeedRecipes.fireSeeds = new ItemStack(MSeeds.FireSeeds, 1, 32767);
        SeedRecipes.glowstoneSeeds = new ItemStack(MSeeds.GlowstoneSeeds, 1, 32767);
        SeedRecipes.goldSeeds = new ItemStack(MSeeds.GoldSeeds, 1, 32767);
        SeedRecipes.ironSeeds = new ItemStack(MSeeds.IronSeeds, 1, 32767);
        SeedRecipes.lapisSeeds = new ItemStack(MSeeds.LapisSeeds, 1, 32767);
        SeedRecipes.minicioSeeds = new ItemStack(MSeeds.MinicioSeeds, 1, 32767);
        SeedRecipes.natureSeeds = new ItemStack(MSeeds.NatureSeeds, 1, 32767);
        SeedRecipes.netherSeeds = new ItemStack(MSeeds.NetherSeeds, 1, 32767);
        SeedRecipes.obsidianSeeds = new ItemStack(MSeeds.ObsidianSeeds, 1, 32767);
        SeedRecipes.quartzSeeds = new ItemStack(MSeeds.QuartzSeeds, 1, 32767);
        SeedRecipes.redstoneSeeds = new ItemStack(MSeeds.RedstoneSeeds, 1, 32767);
        SeedRecipes.waterSeeds = new ItemStack(MSeeds.WaterSeeds, 1, 32767);
        SeedRecipes.cowSeeds = new ItemStack(MSeeds.CowSeeds, 1, 32767);
        SeedRecipes.chickenSeeds = new ItemStack(MSeeds.ChickenSeeds, 1, 32767);
        SeedRecipes.sheepSeeds = new ItemStack(MSeeds.SheepSeeds, 1, 32767);
        SeedRecipes.pigSeeds = new ItemStack(MSeeds.PigSeeds, 1, 32767);
        SeedRecipes.creeperSeeds = new ItemStack(MSeeds.CreeperSeeds, 1, 32767);
        SeedRecipes.blazeSeeds = new ItemStack(MSeeds.BlazeSeeds, 1, 32767);
        SeedRecipes.ghastSeeds = new ItemStack(MSeeds.GhastSeeds, 1, 32767);
        SeedRecipes.skeletonSeeds = new ItemStack(MSeeds.SkeletonSeeds, 1, 32767);
        SeedRecipes.slimeSeeds = new ItemStack(MSeeds.SlimeSeeds, 1, 32767);
        SeedRecipes.spiderSeeds = new ItemStack(MSeeds.SpiderSeeds, 1, 32767);
        SeedRecipes.witherSeeds = new ItemStack(MSeeds.WitherSeeds, 1, 32767);
        SeedRecipes.endermanSeeds = new ItemStack(MSeeds.EndermanSeeds, 1, 32767);
    }
}
