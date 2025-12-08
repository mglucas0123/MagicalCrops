package com.mark719.magicalcrops.handlers;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import com.mark719.magicalcrops.items.seeds.*;

public class MSeeds
{
    public static Block farmland;
    public static Item AirSeeds;
    public static Item CoalSeeds;
    public static Item DyeSeeds;
    public static Item EarthSeeds;
    public static Item FireSeeds;
    public static Item NatureSeeds;
    public static Item MinicioSeeds;
    public static Item WaterSeeds;
    public static Item RedstoneSeeds;
    public static Item GlowstoneSeeds;
    public static Item ObsidianSeeds;
    public static Item NetherSeeds;
    public static Item IronSeeds;
    public static Item GoldSeeds;
    public static Item LapisSeeds;
    public static Item ExperienceSeeds;
    public static Item QuartzSeeds;
    public static Item DiamondSeeds;
    public static Item EmeraldSeeds;
    public static Item BlazeSeeds;
    public static Item CreeperSeeds;
    public static Item EndermanSeeds;
    public static Item GhastSeeds;
    public static Item SkeletonSeeds;
    public static Item SlimeSeeds;
    public static Item SpiderSeeds;
    public static Item WitherSeeds;
    public static Item ChickenSeeds;
    public static Item CowSeeds;
    public static Item PigSeeds;
    public static Item SheepSeeds;
    
    static {
        MSeeds.farmland = Blocks.farmland;
        MSeeds.AirSeeds = new AirSeeds(MCrops.AirCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_air").setUnlocalizedName("AirSeeds");
        MSeeds.CoalSeeds = new CoalSeeds(MCrops.CoalCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_coal").setUnlocalizedName("CoalSeeds");
        MSeeds.DyeSeeds = new DyeSeeds(MCrops.DyeCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_dye").setUnlocalizedName("DyeSeeds");
        MSeeds.EarthSeeds = new EarthSeeds(MCrops.EarthCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_earth").setUnlocalizedName("EarthSeeds");
        MSeeds.FireSeeds = new FireSeeds(MCrops.FireCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_fire").setUnlocalizedName("FireSeeds");
        MSeeds.NatureSeeds = new NatureSeeds(MCrops.NatureCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_nature").setUnlocalizedName("NatureSeeds");
        MSeeds.MinicioSeeds = new MinicioSeeds(MCrops.MinicioCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_minicio").setUnlocalizedName("MinicioSeeds");
        MSeeds.WaterSeeds = new WaterSeeds(MCrops.WaterCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_water").setUnlocalizedName("WaterSeeds");
        MSeeds.RedstoneSeeds = new RedstoneSeeds(MCrops.RedstoneCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_redstone").setUnlocalizedName("RedstoneSeeds");
        MSeeds.GlowstoneSeeds = new GlowstoneSeeds(MCrops.GlowstoneCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_glowstone").setUnlocalizedName("GlowstoneSeeds");
        MSeeds.ObsidianSeeds = new ObsidianSeeds(MCrops.ObsidianCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_obsidian").setUnlocalizedName("ObsidianSeeds");
        MSeeds.NetherSeeds = new NetherSeeds(MCrops.NetherCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_nether").setUnlocalizedName("NetherSeeds");
        MSeeds.IronSeeds = new IronSeeds(MCrops.IronCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_iron").setUnlocalizedName("IronSeeds");
        MSeeds.GoldSeeds = new GoldSeeds(MCrops.GoldCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_gold").setUnlocalizedName("GoldSeeds");
        MSeeds.LapisSeeds = new LapisSeeds(MCrops.LapisCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_lapis").setUnlocalizedName("LapisSeeds");
        MSeeds.ExperienceSeeds = new ExperienceSeeds(MCrops.ExperienceCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_experience").setUnlocalizedName("ExperienceSeeds");
        MSeeds.QuartzSeeds = new QuartzSeeds(MCrops.QuartzCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_quartz").setUnlocalizedName("QuartzSeeds");
        MSeeds.DiamondSeeds = new DiamondSeeds(MCrops.DiamondCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_diamond").setUnlocalizedName("DiamondSeeds");
        MSeeds.EmeraldSeeds = new EmeraldSeeds(MCrops.EmeraldCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_emerald").setUnlocalizedName("EmeraldSeeds");
        MSeeds.BlazeSeeds = new BlazeSeeds(MCrops.BlazeCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_blaze").setUnlocalizedName("BlazeSeeds");
        MSeeds.CreeperSeeds = new CreeperSeeds(MCrops.CreeperCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_creeper").setUnlocalizedName("CreeperSeeds");
        MSeeds.EndermanSeeds = new EndermanSeeds(MCrops.EndermanCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_ender").setUnlocalizedName("EndermanSeeds");
        MSeeds.GhastSeeds = new GhastSeeds(MCrops.GhastCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_ghast").setUnlocalizedName("GhastSeeds");
        MSeeds.SkeletonSeeds = new SkeletonSeeds(MCrops.SkeletonCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_skeleton").setUnlocalizedName("SkeletonSeeds");
        MSeeds.SlimeSeeds = new SlimeSeeds(MCrops.SlimeCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_slime").setUnlocalizedName("SlimeSeeds");
        MSeeds.SpiderSeeds = new SpiderSeeds(MCrops.SpiderCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_spider").setUnlocalizedName("SpiderSeeds");
        MSeeds.WitherSeeds = new WitherSeeds(MCrops.WitherCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_wither").setUnlocalizedName("WitherSeeds");
        MSeeds.ChickenSeeds = new ChickenSeeds(MCrops.ChickenCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_chicken").setUnlocalizedName("ChickenSeeds");
        MSeeds.CowSeeds = new CowSeeds(MCrops.CowCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_cow").setUnlocalizedName("CowSeeds");
        MSeeds.PigSeeds = new PigSeeds(MCrops.PigCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_pig").setUnlocalizedName("PigSeeds");
        MSeeds.SheepSeeds = new SheepSeeds(MCrops.SheepCrop, MSeeds.farmland).setTextureName("magicalcrops:seeds_sheep").setUnlocalizedName("SheepSeeds");
    }
}
