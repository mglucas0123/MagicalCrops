package com.mark719.magicalcrops.recipes;

import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;
import net.minecraftforge.oredict.*;
import net.minecraft.item.crafting.*;
import com.mark719.magicalcrops.handlers.*;
import com.mark719.magicalcrops.blocks.BlockEssenceBlock;
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

        // Minicio Seed Recipe
        GameRegistry.addRecipe(new ItemStack(MSeeds.MinicioSeeds, 1), new Object[] { "XXX", "XYX", "XXX", 'X', SeedRecipes.minicioEssence, 'Y', Items.wheat_seeds });
            
        // Seed Recipes - Normal Mode (Don't have block and item form, or only item form)
        registerSeedRecipe(new ItemStack(MSeeds.DyeSeeds, SeedRecipes.seedOutPut), SeedRecipes.accioEssence, SeedRecipes.allDye, SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.WaterSeeds, SeedRecipes.seedOutPut), SeedRecipes.accioEssence, Items.water_bucket, SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.FireSeeds, SeedRecipes.seedOutPut), SeedRecipes.accioEssence, Items.lava_bucket, SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.EarthSeeds, SeedRecipes.seedOutPut), SeedRecipes.accioEssence, Blocks.dirt, SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.AirSeeds, SeedRecipes.seedOutPut), SeedRecipes.accioEssence, Items.glass_bottle, SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.NatureSeeds, SeedRecipes.seedOutPut), SeedRecipes.accioEssence, "natureMaterial", SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.ExperienceSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, SeedRecipes.enchantedBook, SeedRecipes.minicioSeed);        
        registerSeedRecipe(new ItemStack(MSeeds.ObsidianSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, Blocks.obsidian, SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.NetherSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, "netherMaterial", SeedRecipes.minicioSeed);
        registerSeedRecipe(new ItemStack(MSeeds.CowSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, Items.leather, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.PigSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, Items.porkchop, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.ChickenSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, Items.egg, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.SheepSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, Blocks.wool, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.CreeperSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.gunpowder, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.BlazeSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.blaze_rod, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.EndermanSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.ender_pearl, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.SkeletonSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.bone, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.SlimeSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.slime_ball, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.SpiderSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.spider_eye, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.GhastSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.ghast_tear, SeedRecipes.minicioSeeds);
        registerSeedRecipe(new ItemStack(MSeeds.WitherSeeds, SeedRecipes.seedOutPut), SeedRecipes.zivicioEssence, new ItemStack(Items.skull, 1, 1), SeedRecipes.skeletonSeeds);
        
        // Hard Seed Recipes - Normal and Hard Mode (Have both block and item form, use block form in hard mode)
        registerHardModeRecipe(new ItemStack(MSeeds.CoalSeeds, SeedRecipes.seedOutPut), SeedRecipes.accioEssence, Items.coal, Blocks.coal_block, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.RedstoneSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, Items.redstone, Blocks.redstone_block, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.GlowstoneSeeds, SeedRecipes.seedOutPut), SeedRecipes.crucioEssence, Items.glowstone_dust, Blocks.glowstone, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.IronSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.iron_ingot, Blocks.iron_block, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.GoldSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.gold_ingot, Blocks.gold_block, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.LapisSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, new ItemStack(Items.dye, 1, 4), Blocks.lapis_block, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.QuartzSeeds, SeedRecipes.seedOutPut), SeedRecipes.imperioEssence, Items.quartz, Blocks.quartz_block, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.DiamondSeeds, SeedRecipes.seedOutPut), SeedRecipes.zivicioEssence, Items.diamond, Blocks.diamond_block, SeedRecipes.minicioSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.EmeraldSeeds, SeedRecipes.seedOutPut), SeedRecipes.zivicioEssence, Items.emerald, Blocks.emerald_block, SeedRecipes.minicioSeed);

        // Seed to Essence Recipes - 9 Seeds = 1 Essence
        registerSeedToEssenceRecipe(SeedRecipes.airSeeds, new ItemStack(Essence.AirEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.coalSeeds, new ItemStack(Essence.CoalEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.diamondSeeds, new ItemStack(Essence.DiamondEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.dyeSeeds, new ItemStack(Essence.DyeEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.earthSeeds, new ItemStack(Essence.EarthEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.emeraldSeeds, new ItemStack(Essence.EmeraldEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.experienceSeeds, new ItemStack(Essence.ExperienceEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.fireSeeds, new ItemStack(Essence.FireEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.glowstoneSeeds, new ItemStack(Essence.GlowstoneEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.goldSeeds, new ItemStack(Essence.GoldEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.ironSeeds, new ItemStack(Essence.IronEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.lapisSeeds, new ItemStack(Essence.LapisEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.natureSeeds, new ItemStack(Essence.NatureEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.netherSeeds, new ItemStack(Essence.NetherEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.obsidianSeeds, new ItemStack(Essence.ObsidianEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.quartzSeeds, new ItemStack(Essence.QuartzEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.redstoneSeeds, new ItemStack(Essence.RedstoneEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.waterSeeds, new ItemStack(Essence.WaterEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.cowSeeds, new ItemStack(Essence.CowEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.chickenSeeds, new ItemStack(Essence.ChickenEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.sheepSeeds, new ItemStack(Essence.SheepEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.pigSeeds, new ItemStack(Essence.PigEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.creeperSeeds, new ItemStack(Essence.CreeperEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.blazeSeeds, new ItemStack(Essence.BlazeEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.endermanSeeds, new ItemStack(Essence.EndermanEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.skeletonSeeds, new ItemStack(Essence.SkeletonEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.slimeSeeds, new ItemStack(Essence.SlimeEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.spiderSeeds, new ItemStack(Essence.SpiderEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.ghastSeeds, new ItemStack(Essence.GhastEssence, 1));
        registerSeedToEssenceRecipe(SeedRecipes.witherSeeds, new ItemStack(Essence.WitherEssence, 1));
    }

    private static void registerSeedRecipe(ItemStack result, Item essence, Object material, ItemStack seed) {
        registerHardModeRecipe(result, essence, material, material, seed);
    }

    private static void registerHardModeRecipe(ItemStack result, Item essence, Object normalMaterial, Object hardMaterial, ItemStack seed) {
        Object material = ConfigMain.HARD_MODE ? hardMaterial : normalMaterial;
        GameRegistry.addRecipe(result, new Object[] {
            "YXY", "XZX", "YXY",
            'X', essence,
            'Y', material,
            'Z', seed
        });
    }

    private static void registerSeedToEssenceRecipe(ItemStack seed, ItemStack essence) {
        GameRegistry.addShapelessRecipe(essence, new Object[] { seed });
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
