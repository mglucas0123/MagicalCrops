package com.mark719.magicalcrops.register;

import com.mark719.magicalcrops.help.*;
import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.handlers.*;
import cpw.mods.fml.common.registry.*;
import com.mark719.magicalcrops.itemblock.*;

public class BlockRegister
{
    public static void registerBlock() {
        BlockRegisterHelper.registerBlock(MBlocks.MinicioOre);
        BlockRegisterHelper.registerBlock(MBlocks.MinicioOreNether);
        BlockRegisterHelper.registerBlock(MBlocks.MinicioOreEnd);
        if (ConfigDisable.AIR) {
            BlockRegisterHelper.registerBlock(MCrops.AirCrop);
        }
        if (ConfigDisable.COAL) {
            BlockRegisterHelper.registerBlock(MCrops.CoalCrop);
        }
        if (ConfigDisable.DYE) {
            BlockRegisterHelper.registerBlock(MCrops.DyeCrop);
        }
        if (ConfigDisable.EARTH) {
            BlockRegisterHelper.registerBlock(MCrops.EarthCrop);
        }
        if (ConfigDisable.FIRE) {
            BlockRegisterHelper.registerBlock(MCrops.FireCrop);
        }
        if (ConfigDisable.MINICIO) {
            BlockRegisterHelper.registerBlock(MCrops.MinicioCrop);
        }
        if (ConfigDisable.NATURE) {
            BlockRegisterHelper.registerBlock(MCrops.NatureCrop);
        }
        if (ConfigDisable.WATER) {
            BlockRegisterHelper.registerBlock(MCrops.WaterCrop);
        }
        if (ConfigDisable.REDSTONE) {
            BlockRegisterHelper.registerBlock(MCrops.RedstoneCrop);
        }
        if (ConfigDisable.GLOWSTONE) {
            BlockRegisterHelper.registerBlock(MCrops.GlowstoneCrop);
        }
        if (ConfigDisable.OBSIDIAN) {
            BlockRegisterHelper.registerBlock(MCrops.ObsidianCrop);
        }
        if (ConfigDisable.NETHER) {
            BlockRegisterHelper.registerBlock(MCrops.NetherCrop);
        }
        if (ConfigDisable.IRON) {
            BlockRegisterHelper.registerBlock(MCrops.IronCrop);
        }
        if (ConfigDisable.GOLD) {
            BlockRegisterHelper.registerBlock(MCrops.GoldCrop);
        }
        if (ConfigDisable.LAPIS) {
            BlockRegisterHelper.registerBlock(MCrops.LapisCrop);
        }
        if (ConfigDisable.EXPERIENCE) {
            BlockRegisterHelper.registerBlock(MCrops.ExperienceCrop);
        }
        if (ConfigDisable.QUARTZ) {
            BlockRegisterHelper.registerBlock(MCrops.QuartzCrop);
        }
        if (ConfigDisable.DIAMOND) {
            BlockRegisterHelper.registerBlock(MCrops.DiamondCrop);
        }
        if (ConfigDisable.EMERALD) {
            BlockRegisterHelper.registerBlock(MCrops.EmeraldCrop);
        }
        if (ConfigDisable.BLAZE) {
            BlockRegisterHelper.registerBlock(MCrops.BlazeCrop);
        }
        if (ConfigDisable.CREEPER) {
            BlockRegisterHelper.registerBlock(MCrops.CreeperCrop);
        }
        if (ConfigDisable.ENDERMAN) {
            BlockRegisterHelper.registerBlock(MCrops.EndermanCrop);
        }
        if (ConfigDisable.GHAST) {
            BlockRegisterHelper.registerBlock(MCrops.GhastCrop);
        }
        if (ConfigDisable.SKELETON) {
            BlockRegisterHelper.registerBlock(MCrops.SkeletonCrop);
        }
        if (ConfigDisable.SLIME) {
            BlockRegisterHelper.registerBlock(MCrops.SlimeCrop);
        }
        if (ConfigDisable.SPIDER) {
            BlockRegisterHelper.registerBlock(MCrops.SpiderCrop);
        }
        if (ConfigDisable.WITHER) {
            BlockRegisterHelper.registerBlock(MCrops.WitherCrop);
        }
        if (ConfigDisable.CHICKEN) {
            BlockRegisterHelper.registerBlock(MCrops.ChickenCrop);
        }
        if (ConfigDisable.COW) {
            BlockRegisterHelper.registerBlock(MCrops.CowCrop);
        }
        if (ConfigDisable.PIG) {
            BlockRegisterHelper.registerBlock(MCrops.PigCrop);
        }
        if (ConfigDisable.SHEEP) {
            BlockRegisterHelper.registerBlock(MCrops.SheepCrop);
        }
        BlockRegisterHelper.registerBlock(MBlocks.CropBooster);
        BlockRegisterHelper.registerBlock(MBlocks.EssenceStone);
        BlockRegisterHelper.registerBlock(MBlocks.FarmlandAccio);
        BlockRegisterHelper.registerBlock(MBlocks.FarmlandCrucio);
        BlockRegisterHelper.registerBlock(MBlocks.FarmlandImperio);
        BlockRegisterHelper.registerBlock(MBlocks.FarmlandZivicio);
        BlockRegisterHelper.registerBlock(MBlocks.WitherProof);
        BlockRegisterHelper.registerBlock(MBlocks.WitherProofGlass);
        BlockRegisterHelper.registerBlock(MBlocks.AccioFurnace);
        BlockRegisterHelper.registerBlock(MBlocks.AccioFurnaceActive);
        BlockRegisterHelper.registerBlock(MBlocks.CrucioFurnace);
        BlockRegisterHelper.registerBlock(MBlocks.CrucioFurnaceActive);
        BlockRegisterHelper.registerBlock(MBlocks.ImperioFurnace);
        BlockRegisterHelper.registerBlock(MBlocks.ImperioFurnaceActive);
        BlockRegisterHelper.registerBlock(MBlocks.ZivicioFurnace);
        BlockRegisterHelper.registerBlock(MBlocks.ZivicioFurnaceActive);
        BlockRegisterHelper.registerBlock(MBlocks.UltimateFurnace);
        BlockRegisterHelper.registerBlock(MBlocks.UltimateFurnaceActive);
        GameRegistry.registerBlock(MBlocks.EssenceStorage, ItemBlockEssenceStorage.class, "essence_storage");
        GameRegistry.registerBlock(MBlocks.EssenceBrick, ItemBlockEssenceBrick.class, "essence_brick");
        GameRegistry.registerBlock(MBlocks.EssenceBlock, ItemBlockEssenceBlock.class, "essence_block");
        GameRegistry.registerBlock(MBlocks.EssenceBrick2, ItemBlockEssenceBrick2.class, "essence_brick2");
        GameRegistry.registerBlock(MBlocks.EssenceSquare, ItemBlockEssenceSquare.class, "essence_Square");
        GameRegistry.registerBlock(MBlocks.EssenceLamp, ItemBlockEssenceLamp.class, "essence_lamp");
    }
}
