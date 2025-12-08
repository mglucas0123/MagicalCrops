package com.mark719.magicalcrops.register;

import net.minecraft.item.*;
import net.minecraftforge.oredict.*;
import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.init.*;
import net.minecraft.block.*;

public class OreDictionaryRegister
{
    public static void oreRegister() {
        OreDictionary.registerOre("oreMinicio", new ItemStack(MBlocks.MinicioOre));
        if (ConfigDisable.AIR) {
            OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.AirEssence));
        }
        if (ConfigDisable.COAL) {
            OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.CoalEssence));
        }
        if (ConfigDisable.DYE) {
            OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.DyeEssence));
        }
        if (ConfigDisable.EARTH) {
            OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.EarthEssence));
        }
        if (ConfigDisable.FIRE) {
            OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.FireEssence));
        }
        if (ConfigDisable.NATURE) {
            OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.NatureEssence));
        }
        if (ConfigDisable.WATER) {
            OreDictionary.registerOre("accioMaterial", new ItemStack(Essence.WaterEssence));
        }
        if (ConfigDisable.REDSTONE) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.RedstoneEssence));
        }
        if (ConfigDisable.GLOWSTONE) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.GlowstoneEssence));
        }
        if (ConfigDisable.OBSIDIAN) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.ObsidianEssence));
        }
        if (ConfigDisable.NETHER) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.NetherEssence));
        }
        if (ConfigDisable.COW) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.CowEssence));
        }
        if (ConfigDisable.PIG) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.PigEssence));
        }
        if (ConfigDisable.CHICKEN) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.ChickenEssence));
        }
        if (ConfigDisable.SHEEP) {
            OreDictionary.registerOre("crucioMaterial", new ItemStack(Essence.SheepEssence));
        }
        if (ConfigDisable.IRON) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.IronEssence));
        }
        if (ConfigDisable.GOLD) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.GoldEssence));
        }
        if (ConfigDisable.LAPIS) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.LapisEssence));
        }
        if (ConfigDisable.EXPERIENCE) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.ExperienceEssence));
        }
        if (ConfigDisable.QUARTZ) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.QuartzEssence));
        }
        if (ConfigDisable.CREEPER) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.CreeperEssence));
        }
        if (ConfigDisable.SKELETON) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.SkeletonEssence));
        }
        if (ConfigDisable.GHAST) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.GhastEssence));
        }
        if (ConfigDisable.SPIDER) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.SpiderEssence));
        }
        if (ConfigDisable.SLIME) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.SlimeEssence));
        }
        if (ConfigDisable.ENDERMAN) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.EndermanEssence));
        }
        if (ConfigDisable.BLAZE) {
            OreDictionary.registerOre("imperioMaterial", new ItemStack(Essence.BlazeEssence));
        }
        if (ConfigDisable.DIAMOND) {
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(Essence.DiamondEssence));
        }
        if (ConfigDisable.EMERALD) {
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(Essence.EmeraldEssence));
        }
        if (ConfigDisable.WITHER) {
            OreDictionary.registerOre("zivicioMaterial", new ItemStack(Essence.WitherEssence));
        }
        OreDictionary.registerOre("MainInfusionMaterial", new ItemStack(Items.diamond));
        OreDictionary.registerOre("MainInfusionMaterial", new ItemStack(Items.emerald));
        OreDictionary.registerOre("MainInfusionMaterial", new ItemStack(Blocks.gold_block));
        OreDictionary.registerOre("netherMaterial", new ItemStack(Blocks.nether_brick));
        OreDictionary.registerOre("netherMaterial", new ItemStack(Blocks.netherrack));
        OreDictionary.registerOre("netherMaterial", new ItemStack(Blocks.soul_sand));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.vine));
        OreDictionary.registerOre("natureMaterial", new ItemStack((Block)Blocks.red_flower));
        OreDictionary.registerOre("natureMaterial", new ItemStack((Block)Blocks.yellow_flower));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.cactus));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.pumpkin));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Blocks.waterlily));
        OreDictionary.registerOre("natureMaterial", new ItemStack((Block)Blocks.deadbush));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Items.reeds));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Items.carrot));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Items.potato));
        OreDictionary.registerOre("natureMaterial", new ItemStack(Items.wheat));
    }
}
