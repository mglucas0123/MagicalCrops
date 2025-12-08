package com.mark719.magicalcrops.register;

import com.mark719.magicalcrops.help.*;
import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.handlers.*;

public class ItemRegister
{
    public static void registerItem() {
        ItemRegisterHelper.registerItem(MItems.InfusionStoneWeak);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneRegular);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneStrong);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneExtreme);
        ItemRegisterHelper.registerItem(MItems.InfusionStoneMaster);
        if (ConfigDisable.AIR) {
            ItemRegisterHelper.registerItem(MSeeds.AirSeeds);
        }
        if (ConfigDisable.COAL) {
            ItemRegisterHelper.registerItem(MSeeds.CoalSeeds);
        }
        if (ConfigDisable.DYE) {
            ItemRegisterHelper.registerItem(MSeeds.DyeSeeds);
        }
        if (ConfigDisable.EARTH) {
            ItemRegisterHelper.registerItem(MSeeds.EarthSeeds);
        }
        if (ConfigDisable.FIRE) {
            ItemRegisterHelper.registerItem(MSeeds.FireSeeds);
        }
        if (ConfigDisable.MINICIO) {
            ItemRegisterHelper.registerItem(MSeeds.MinicioSeeds);
        }
        if (ConfigDisable.NATURE) {
            ItemRegisterHelper.registerItem(MSeeds.NatureSeeds);
        }
        if (ConfigDisable.WATER) {
            ItemRegisterHelper.registerItem(MSeeds.WaterSeeds);
        }
        if (ConfigDisable.REDSTONE) {
            ItemRegisterHelper.registerItem(MSeeds.RedstoneSeeds);
        }
        if (ConfigDisable.GLOWSTONE) {
            ItemRegisterHelper.registerItem(MSeeds.GlowstoneSeeds);
        }
        if (ConfigDisable.OBSIDIAN) {
            ItemRegisterHelper.registerItem(MSeeds.ObsidianSeeds);
        }
        if (ConfigDisable.NETHER) {
            ItemRegisterHelper.registerItem(MSeeds.NetherSeeds);
        }
        if (ConfigDisable.IRON) {
            ItemRegisterHelper.registerItem(MSeeds.IronSeeds);
        }
        if (ConfigDisable.GOLD) {
            ItemRegisterHelper.registerItem(MSeeds.GoldSeeds);
        }
        if (ConfigDisable.LAPIS) {
            ItemRegisterHelper.registerItem(MSeeds.LapisSeeds);
        }
        if (ConfigDisable.EXPERIENCE) {
            ItemRegisterHelper.registerItem(MSeeds.ExperienceSeeds);
        }
        if (ConfigDisable.QUARTZ) {
            ItemRegisterHelper.registerItem(MSeeds.QuartzSeeds);
        }
        if (ConfigDisable.DIAMOND) {
            ItemRegisterHelper.registerItem(MSeeds.DiamondSeeds);
        }
        if (ConfigDisable.EMERALD) {
            ItemRegisterHelper.registerItem(MSeeds.EmeraldSeeds);
        }
        if (ConfigDisable.BLAZE) {
            ItemRegisterHelper.registerItem(MSeeds.BlazeSeeds);
        }
        if (ConfigDisable.CREEPER) {
            ItemRegisterHelper.registerItem(MSeeds.CreeperSeeds);
        }
        if (ConfigDisable.ENDERMAN) {
            ItemRegisterHelper.registerItem(MSeeds.EndermanSeeds);
        }
        if (ConfigDisable.GHAST) {
            ItemRegisterHelper.registerItem(MSeeds.GhastSeeds);
        }
        if (ConfigDisable.SKELETON) {
            ItemRegisterHelper.registerItem(MSeeds.SkeletonSeeds);
        }
        if (ConfigDisable.SLIME) {
            ItemRegisterHelper.registerItem(MSeeds.SlimeSeeds);
        }
        if (ConfigDisable.SPIDER) {
            ItemRegisterHelper.registerItem(MSeeds.SpiderSeeds);
        }
        if (ConfigDisable.WITHER) {
            ItemRegisterHelper.registerItem(MSeeds.WitherSeeds);
        }
        if (ConfigDisable.CHICKEN) {
            ItemRegisterHelper.registerItem(MSeeds.ChickenSeeds);
        }
        if (ConfigDisable.COW) {
            ItemRegisterHelper.registerItem(MSeeds.CowSeeds);
        }
        if (ConfigDisable.PIG) {
            ItemRegisterHelper.registerItem(MSeeds.PigSeeds);
        }
        if (ConfigDisable.SHEEP) {
            ItemRegisterHelper.registerItem(MSeeds.SheepSeeds);
        }
        ItemRegisterHelper.registerItem(MItems.MagicalFertilizer);
        ItemRegisterHelper.registerItem(MItems.EssenceFertilizer);
        ItemRegisterHelper.registerItem(MItems.EssenceIngots);
        if (ConfigMain.ENCHANT_CRAFT) {
            ItemRegisterHelper.registerItem(MItems.ExperienceBook);
        }
        ItemRegisterHelper.registerItem(Essence.MinicioEssence);
        ItemRegisterHelper.registerItem(Essence.AccioEssence);
        ItemRegisterHelper.registerItem(Essence.CrucioEssence);
        ItemRegisterHelper.registerItem(Essence.ImperioEssence);
        ItemRegisterHelper.registerItem(Essence.ZivicioEssence);
        ItemRegisterHelper.registerItem(Essence.TaintedEssence);
        if (ConfigDisable.AIR) {
            ItemRegisterHelper.registerItem(Essence.AirEssence);
        }
        if (ConfigDisable.COAL) {
            ItemRegisterHelper.registerItem(Essence.CoalEssence);
        }
        if (ConfigDisable.DYE) {
            ItemRegisterHelper.registerItem(Essence.DyeEssence);
        }
        if (ConfigDisable.EARTH) {
            ItemRegisterHelper.registerItem(Essence.EarthEssence);
        }
        if (ConfigDisable.FIRE) {
            ItemRegisterHelper.registerItem(Essence.FireEssence);
        }
        if (ConfigDisable.NATURE) {
            ItemRegisterHelper.registerItem(Essence.NatureEssence);
        }
        if (ConfigDisable.WATER) {
            ItemRegisterHelper.registerItem(Essence.WaterEssence);
        }
        if (ConfigDisable.REDSTONE) {
            ItemRegisterHelper.registerItem(Essence.RedstoneEssence);
        }
        if (ConfigDisable.GLOWSTONE) {
            ItemRegisterHelper.registerItem(Essence.GlowstoneEssence);
        }
        if (ConfigDisable.OBSIDIAN) {
            ItemRegisterHelper.registerItem(Essence.ObsidianEssence);
        }
        if (ConfigDisable.NETHER) {
            ItemRegisterHelper.registerItem(Essence.NetherEssence);
        }
        if (ConfigDisable.IRON) {
            ItemRegisterHelper.registerItem(Essence.IronEssence);
        }
        if (ConfigDisable.GOLD) {
            ItemRegisterHelper.registerItem(Essence.GoldEssence);
        }
        if (ConfigDisable.LAPIS) {
            ItemRegisterHelper.registerItem(Essence.LapisEssence);
        }
        if (ConfigDisable.EXPERIENCE) {
            ItemRegisterHelper.registerItem(Essence.ExperienceEssence);
        }
        if (ConfigDisable.QUARTZ) {
            ItemRegisterHelper.registerItem(Essence.QuartzEssence);
        }
        if (ConfigDisable.DIAMOND) {
            ItemRegisterHelper.registerItem(Essence.DiamondEssence);
        }
        if (ConfigDisable.EMERALD) {
            ItemRegisterHelper.registerItem(Essence.EmeraldEssence);
        }
        if (ConfigDisable.BLAZE) {
            ItemRegisterHelper.registerItem(Essence.BlazeEssence);
        }
        if (ConfigDisable.CREEPER) {
            ItemRegisterHelper.registerItem(Essence.CreeperEssence);
        }
        if (ConfigDisable.ENDERMAN) {
            ItemRegisterHelper.registerItem(Essence.EndermanEssence);
        }
        if (ConfigDisable.GHAST) {
            ItemRegisterHelper.registerItem(Essence.GhastEssence);
        }
        if (ConfigDisable.SKELETON) {
            ItemRegisterHelper.registerItem(Essence.SkeletonEssence);
        }
        if (ConfigDisable.SLIME) {
            ItemRegisterHelper.registerItem(Essence.SlimeEssence);
        }
        if (ConfigDisable.SPIDER) {
            ItemRegisterHelper.registerItem(Essence.SpiderEssence);
        }
        if (ConfigDisable.WITHER) {
            ItemRegisterHelper.registerItem(Essence.WitherEssence);
        }
        if (ConfigDisable.CHICKEN) {
            ItemRegisterHelper.registerItem(Essence.ChickenEssence);
        }
        if (ConfigDisable.COW) {
            ItemRegisterHelper.registerItem(Essence.CowEssence);
        }
        if (ConfigDisable.PIG) {
            ItemRegisterHelper.registerItem(Essence.PigEssence);
        }
        if (ConfigDisable.SHEEP) {
            ItemRegisterHelper.registerItem(Essence.SheepEssence);
        }
        ItemRegisterHelper.registerItem(Armour.AccioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.AccioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.AccioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.AccioArmourBoots);
        ItemRegisterHelper.registerItem(Armour.CrucioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.CrucioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.CrucioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.CrucioArmourBoots);
        ItemRegisterHelper.registerItem(Armour.ImperioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.ImperioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.ImperioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.ImperioArmourBoots);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmet);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplate);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggings);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBoots);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetFeed);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetNight);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourHelmetWater);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplateFire);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplateWither);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourChestplatePoison);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsBlind);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsWeak);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourLeggingsConfusion);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsStep);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsSpeed);
        ItemRegisterHelper.registerItem(Armour.ZivicioArmourBootsJump);
        ItemRegisterHelper.registerItem(Tools.AccioPickaxe);
        ItemRegisterHelper.registerItem(Tools.AccioSword);
        ItemRegisterHelper.registerItem(Tools.AccioAxe);
        ItemRegisterHelper.registerItem(Tools.AccioShovel);
        ItemRegisterHelper.registerItem(Tools.AccioHoe);
        ItemRegisterHelper.registerItem(Tools.CrucioPickaxe);
        ItemRegisterHelper.registerItem(Tools.CrucioSword);
        ItemRegisterHelper.registerItem(Tools.CrucioAxe);
        ItemRegisterHelper.registerItem(Tools.CrucioShovel);
        ItemRegisterHelper.registerItem(Tools.CrucioHoe);
        ItemRegisterHelper.registerItem(Tools.ImperioPickaxe);
        ItemRegisterHelper.registerItem(Tools.ImperioSword);
        ItemRegisterHelper.registerItem(Tools.ImperioAxe);
        ItemRegisterHelper.registerItem(Tools.ImperioShovel);
        ItemRegisterHelper.registerItem(Tools.ImperioHoe);
        ItemRegisterHelper.registerItem(Tools.ZivicioPickaxe);
        ItemRegisterHelper.registerItem(Tools.ZivicioSword);
        ItemRegisterHelper.registerItem(Tools.ZivicioAxe);
        ItemRegisterHelper.registerItem(Tools.ZivicioShovel);
        ItemRegisterHelper.registerItem(Tools.ZivicioHoe);
        ItemRegisterHelper.registerItem(MItems.SeedBagAccio);
        ItemRegisterHelper.registerItem(MItems.SeedBagCrucio);
        ItemRegisterHelper.registerItem(MItems.SeedBagImperio);
        ItemRegisterHelper.registerItem(MItems.SeedBagZivicio);
    }
}
