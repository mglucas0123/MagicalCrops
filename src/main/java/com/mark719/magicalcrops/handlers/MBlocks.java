package com.mark719.magicalcrops.handlers;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import com.mark719.magicalcrops.blocks.*;
import com.mark719.magicalcrops.*;
import com.mark719.magicalcrops.furnace.*;

public class MBlocks
{
    public static Block MinicioOre;
    public static Block MinicioOreNether;
    public static Block MinicioOreEnd;
    public static Block CropBooster;
    public static Block FarmlandAccio;
    public static Block FarmlandCrucio;
    public static Block FarmlandImperio;
    public static Block FarmlandZivicio;
    public static Block EssenceStone;
    public static Block EssenceStorage;
    public static Block EssenceBlock;
    public static Block EssenceLamp;
    public static Block EssenceBrick;
    public static Block EssenceBrick2;
    public static Block EssenceSquare;
    public static Block WitherProof;
    public static Block WitherProofGlass;
    public static Block AccioFurnace;
    public static Block AccioFurnaceActive;
    public static Block CrucioFurnace;
    public static Block CrucioFurnaceActive;
    public static Block ImperioFurnace;
    public static Block ImperioFurnaceActive;
    public static Block ZivicioFurnace;
    public static Block ZivicioFurnaceActive;
    public static Block UltimateFurnace;
    public static Block UltimateFurnaceActive;
    
    static {
        MBlocks.MinicioOre = new BlockMinicioOre().setBlockName("MinicioOre");
        MBlocks.MinicioOreNether = new BlockMinicioOreNether().setBlockName("MinicioOreNether");
        MBlocks.MinicioOreEnd = new BlockMinicioOreEnd().setBlockName("MinicioOreEnd");
        MBlocks.CropBooster = new BlockCropBooster().setBlockName("CropBooster");
        MBlocks.FarmlandAccio = new BlockFarmlandAccio();
        MBlocks.FarmlandCrucio = new BlockFarmlandCrucio();
        MBlocks.FarmlandImperio = new BlockFarmlandImperio();
        MBlocks.FarmlandZivicio = new BlockFarmlandZivicio();
        MBlocks.EssenceStone = new BlockEssenceStone().setBlockName("EssenceStone");
        MBlocks.EssenceStorage = new BlockEssenceStorage(Material.rock).setBlockName("EssenceStorage");
        MBlocks.EssenceBlock = new BlockEssenceBlock(Material.rock).setBlockName("EssenceBlock");
        MBlocks.EssenceLamp = new BlockEssenceLamp(Material.rock).setBlockName("EssenceLamp");
        MBlocks.EssenceBrick = new BlockEssenceBrick(Material.rock).setBlockName("EssenceBrick");
        MBlocks.EssenceBrick2 = new BlockEssenceBrick2(Material.rock).setBlockName("EssenceBrick2");
        MBlocks.EssenceSquare = new BlockEssenceSquare(Material.rock).setBlockName("EssenceSquare");
        MBlocks.WitherProof = new BlockWitherProof().setBlockName("WitherProof");
        MBlocks.WitherProofGlass = new BlockWitherProofGlass().setBlockName("WitherProofGlass");
        MBlocks.AccioFurnace = new AccioFurnace(false).setBlockName("AccioFurnace").setCreativeTab(MagicalCrops.tabMagical);
        MBlocks.AccioFurnaceActive = new AccioFurnace(true).setBlockName("AccioFurnaceActive");
        MBlocks.CrucioFurnace = new CrucioFurnace(false).setBlockName("CrucioFurnace").setCreativeTab(MagicalCrops.tabMagical);
        MBlocks.CrucioFurnaceActive = new CrucioFurnace(true).setBlockName("CrucioFurnaceActive");
        MBlocks.ImperioFurnace = new ImperioFurnace(false).setBlockName("ImperioFurnace").setCreativeTab(MagicalCrops.tabMagical);
        MBlocks.ImperioFurnaceActive = new ImperioFurnace(true).setBlockName("ImperioFurnaceActive");
        MBlocks.ZivicioFurnace = new ZivicioFurnace(false).setBlockName("ZivicioFurnace").setCreativeTab(MagicalCrops.tabMagical);
        MBlocks.ZivicioFurnaceActive = new ZivicioFurnace(true).setBlockName("ZivicioFurnaceActive");
        MBlocks.UltimateFurnace = new UltimateFurnace(false).setBlockName("UltimateFurnace").setCreativeTab(MagicalCrops.tabMagical);
        MBlocks.UltimateFurnaceActive = new UltimateFurnace(true).setBlockName("UltimateFurnaceActive");
    }
}
