package com.mark719.magicalcrops.recipes;

import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;
import net.minecraftforge.oredict.*;
import com.mark719.magicalcrops.handlers.*;
import com.mark719.magicalcrops.config.*;

public class SeedRecipes {

    public static void loadRecipes() {
        int outputAmount = ConfigMain.SEED_OUTPUT;
        ItemStack baseSeed = new ItemStack(MSeeds.MinicioSeeds);
        ItemStack baseSeedWildcard = new ItemStack(MSeeds.MinicioSeeds, 1, OreDictionary.WILDCARD_VALUE);
        ItemStack skeletonSeedStack = new ItemStack(MSeeds.SkeletonSeeds, 1, OreDictionary.WILDCARD_VALUE);
        ItemStack wildcardEnchantedBook = new ItemStack(Items.enchanted_book, 1, OreDictionary.WILDCARD_VALUE);

        // Minicio Seed Recipe
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MSeeds.MinicioSeeds, 1), 
            "XXX", "XYX", "XXX", 
            'X', Essence.MinicioEssence, 
            'Y', Items.wheat_seeds
        ));

        // Seed Recipes - Normal Mode
        registerSeedRecipe(new ItemStack(MSeeds.DyeSeeds, outputAmount), Essence.AccioEssence, "dye", baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.WaterSeeds, outputAmount), Essence.AccioEssence, Items.water_bucket, baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.FireSeeds, outputAmount), Essence.AccioEssence, Items.lava_bucket, baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.EarthSeeds, outputAmount), Essence.AccioEssence, Blocks.dirt, baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.AirSeeds, outputAmount), Essence.AccioEssence, Items.glass_bottle, baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.NatureSeeds, outputAmount), Essence.AccioEssence, "natureMaterial", baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.ExperienceSeeds, outputAmount), Essence.ImperioEssence, wildcardEnchantedBook, baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.ObsidianSeeds, outputAmount), Essence.CrucioEssence, Blocks.obsidian, baseSeed);
        registerSeedRecipe(new ItemStack(MSeeds.NetherSeeds, outputAmount), Essence.CrucioEssence, "netherMaterial", baseSeed);
        
        // Mob Seeds (Use wildcard base seed)
        registerSeedRecipe(new ItemStack(MSeeds.CowSeeds, outputAmount), Essence.CrucioEssence, Items.leather, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.PigSeeds, outputAmount), Essence.CrucioEssence, Items.porkchop, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.ChickenSeeds, outputAmount), Essence.CrucioEssence, Items.egg, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.SheepSeeds, outputAmount), Essence.CrucioEssence, Blocks.wool, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.CreeperSeeds, outputAmount), Essence.ImperioEssence, Items.gunpowder, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.BlazeSeeds, outputAmount), Essence.ImperioEssence, Items.blaze_rod, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.EndermanSeeds, outputAmount), Essence.ImperioEssence, Items.ender_pearl, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.SkeletonSeeds, outputAmount), Essence.ImperioEssence, Items.bone, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.SlimeSeeds, outputAmount), Essence.ImperioEssence, Items.slime_ball, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.SpiderSeeds, outputAmount), Essence.ImperioEssence, Items.spider_eye, baseSeedWildcard);
        registerSeedRecipe(new ItemStack(MSeeds.GhastSeeds, outputAmount), Essence.ImperioEssence, Items.ghast_tear, baseSeedWildcard);
        
        // Wither seeds use Skeleton seeds as base
        registerSeedRecipe(new ItemStack(MSeeds.WitherSeeds, outputAmount), Essence.ZivicioEssence, new ItemStack(Items.skull, 1, 1), skeletonSeedStack);

        // Hard Seed Recipes
        registerHardModeRecipe(new ItemStack(MSeeds.CoalSeeds, outputAmount), Essence.AccioEssence, Items.coal, Blocks.coal_block, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.RedstoneSeeds, outputAmount), Essence.CrucioEssence, Items.redstone, Blocks.redstone_block, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.GlowstoneSeeds, outputAmount), Essence.CrucioEssence, Items.glowstone_dust, Blocks.glowstone, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.IronSeeds, outputAmount), Essence.ImperioEssence, Items.iron_ingot, Blocks.iron_block, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.GoldSeeds, outputAmount), Essence.ImperioEssence, Items.gold_ingot, Blocks.gold_block, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.LapisSeeds, outputAmount), Essence.ImperioEssence, new ItemStack(Items.dye, 1, 4), Blocks.lapis_block, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.QuartzSeeds, outputAmount), Essence.ImperioEssence, Items.quartz, Blocks.quartz_block, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.DiamondSeeds, outputAmount), Essence.ZivicioEssence, Items.diamond, Blocks.diamond_block, baseSeed);
        registerHardModeRecipe(new ItemStack(MSeeds.EmeraldSeeds, outputAmount), Essence.ZivicioEssence, Items.emerald, Blocks.emerald_block, baseSeed);

        // Seed to Essence Recipes
        registerSeedToEssenceRecipe(MSeeds.AirSeeds, Essence.AirEssence);
        registerSeedToEssenceRecipe(MSeeds.CoalSeeds, Essence.CoalEssence);
        registerSeedToEssenceRecipe(MSeeds.DiamondSeeds, Essence.DiamondEssence);
        registerSeedToEssenceRecipe(MSeeds.DyeSeeds, Essence.DyeEssence);
        registerSeedToEssenceRecipe(MSeeds.EarthSeeds, Essence.EarthEssence);
        registerSeedToEssenceRecipe(MSeeds.EmeraldSeeds, Essence.EmeraldEssence);
        registerSeedToEssenceRecipe(MSeeds.ExperienceSeeds, Essence.ExperienceEssence);
        registerSeedToEssenceRecipe(MSeeds.FireSeeds, Essence.FireEssence);
        registerSeedToEssenceRecipe(MSeeds.GlowstoneSeeds, Essence.GlowstoneEssence);
        registerSeedToEssenceRecipe(MSeeds.GoldSeeds, Essence.GoldEssence);
        registerSeedToEssenceRecipe(MSeeds.IronSeeds, Essence.IronEssence);
        registerSeedToEssenceRecipe(MSeeds.LapisSeeds, Essence.LapisEssence);
        registerSeedToEssenceRecipe(MSeeds.NatureSeeds, Essence.NatureEssence);
        registerSeedToEssenceRecipe(MSeeds.NetherSeeds, Essence.NetherEssence);
        registerSeedToEssenceRecipe(MSeeds.ObsidianSeeds, Essence.ObsidianEssence);
        registerSeedToEssenceRecipe(MSeeds.QuartzSeeds, Essence.QuartzEssence);
        registerSeedToEssenceRecipe(MSeeds.RedstoneSeeds, Essence.RedstoneEssence);
        registerSeedToEssenceRecipe(MSeeds.WaterSeeds, Essence.WaterEssence);
        registerSeedToEssenceRecipe(MSeeds.CowSeeds, Essence.CowEssence);
        registerSeedToEssenceRecipe(MSeeds.ChickenSeeds, Essence.ChickenEssence);
        registerSeedToEssenceRecipe(MSeeds.SheepSeeds, Essence.SheepEssence);
        registerSeedToEssenceRecipe(MSeeds.PigSeeds, Essence.PigEssence);
        registerSeedToEssenceRecipe(MSeeds.CreeperSeeds, Essence.CreeperEssence);
        registerSeedToEssenceRecipe(MSeeds.BlazeSeeds, Essence.BlazeEssence);
        registerSeedToEssenceRecipe(MSeeds.EndermanSeeds, Essence.EndermanEssence);
        registerSeedToEssenceRecipe(MSeeds.SkeletonSeeds, Essence.SkeletonEssence);
        registerSeedToEssenceRecipe(MSeeds.SlimeSeeds, Essence.SlimeEssence);
        registerSeedToEssenceRecipe(MSeeds.SpiderSeeds, Essence.SpiderEssence);
        registerSeedToEssenceRecipe(MSeeds.GhastSeeds, Essence.GhastEssence);
        registerSeedToEssenceRecipe(MSeeds.WitherSeeds, Essence.WitherEssence);
    }

    private static void registerSeedRecipe(ItemStack result, Item essence, Object material, ItemStack seed) {
        registerHardModeRecipe(result, essence, material, material, seed);
    }

    private static void registerHardModeRecipe(ItemStack result, Item essence, Object normalMaterial, Object hardMaterial, ItemStack seed) {
        // Basic validation to prevent crashes
        if (result == null || result.getItem() == null || essence == null || seed == null) {
            System.err.println("MagicalCrops: Invalid recipe registration for " + (result != null ? result.getUnlocalizedName() : "null"));
            return;
        }
        
        Object material = ConfigMain.HARD_MODE ? hardMaterial : normalMaterial;
        if (material == null) {
             System.err.println("MagicalCrops: Material is null for " + result.getUnlocalizedName());
             return;
        }

        GameRegistry.addRecipe(new ShapedOreRecipe(result, 
            "YXY", "XZX", "YXY",
            'X', essence,
            'Y', material,
            'Z', seed
        ));
    }

    private static void registerSeedToEssenceRecipe(Item seed, Item essence) {
        GameRegistry.addShapelessRecipe(new ItemStack(essence), new ItemStack(seed, 1, OreDictionary.WILDCARD_VALUE));
    }
}
