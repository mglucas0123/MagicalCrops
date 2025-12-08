package com.mark719.magicalcrops.recipes;

import net.minecraft.block.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;
import com.mark719.magicalcrops.handlers.*;

public class BlockRecipes
{
    static Item minicioEssence;
    static Item accioEssence;
    static Item crucioEssence;
    static Item imperioEssence;
    static Item zivicioEssence;
    static Block accioFurnace;
    static Block crucioFurnace;
    static Block imperioFurnace;
    static Block zivicioFurnace;
    static Block ultimateFurnace;
    static Block essenceStone;
    static ItemStack zivicioBlock;
    static ItemStack black;
    static ItemStack brown;
    static ItemStack green;
    static ItemStack orange;
    static ItemStack yellow;
    static ItemStack blue;
    static ItemStack purple;
    static ItemStack red;
    
    public static void loadRecipes() {
        GameRegistry.addRecipe(new ItemStack(MBlocks.AccioFurnace, 1), new Object[] { " X ", "XYX", " X ", 'X', BlockRecipes.accioEssence, 'Y', Blocks.furnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.CrucioFurnace, 1), new Object[] { " X ", "XYX", " X ", 'X', BlockRecipes.crucioEssence, 'Y', BlockRecipes.accioFurnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.ImperioFurnace, 1), new Object[] { " X ", "XYX", " X ", 'X', BlockRecipes.imperioEssence, 'Y', BlockRecipes.crucioFurnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.ZivicioFurnace, 1), new Object[] { " X ", "XYX", " X ", 'X', BlockRecipes.zivicioEssence, 'Y', BlockRecipes.imperioFurnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.UltimateFurnace, 1), new Object[] { " X ", "XYX", " X ", 'X', BlockRecipes.zivicioBlock, 'Y', BlockRecipes.zivicioFurnace });
        GameRegistry.addRecipe(new ItemStack(MBlocks.CropBooster, 1), new Object[] { "YXY", "XZX", "YXY", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 0), 'Y', Blocks.stone, 'Z', Items.diamond });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 0), new Object[] { "XXX", "XXX", "XXX", 'X', BlockRecipes.minicioEssence });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 1), new Object[] { "XXX", "XXX", "XXX", 'X', BlockRecipes.accioEssence });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 2), new Object[] { "XXX", "XXX", "XXX", 'X', BlockRecipes.crucioEssence });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 3), new Object[] { "XXX", "XXX", "XXX", 'X', BlockRecipes.imperioEssence });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 4), new Object[] { "XXX", "XXX", "XXX", 'X', BlockRecipes.zivicioEssence });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStorage, 1, 5), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(MBlocks.EssenceStorage, 1, 4) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceStone, 8), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.minicioEssence, 'X', Blocks.cobblestone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.black, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 1), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.brown, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 2), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.green, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 3), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.orange, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 4), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.yellow, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 5), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.blue, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 6), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.purple, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBlock, 8, 7), new Object[] { "XXX", "XYX", "XXX", 'Y', BlockRecipes.red, 'X', BlockRecipes.essenceStone });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 0), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 1), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 1) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 2), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 2) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 3), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 3) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 4), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 4) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 5), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 5) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 6), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 6) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick, 4, 7), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 7) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 0), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 1), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 1) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 2), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 2) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 3), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 3) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 4), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 4) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 5), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 5) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 6), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 6) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceSquare, 8, 7), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(MBlocks.EssenceBlock, 1, 7) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 0), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 1), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 1) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 2), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 2) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 3), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 3) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 4), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 4) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 5), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 5) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 6), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 6) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceBrick2, 4, 7), new Object[] { "XX", "XX", 'X', new ItemStack(MBlocks.EssenceBrick, 1, 7) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 0), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 1), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 1) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 2), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 2) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 3), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 3) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 4), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 4) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 5), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 5) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 6), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 6) });
        GameRegistry.addRecipe(new ItemStack(MBlocks.EssenceLamp, 8, 7), new Object[] { "XXX", "XYX", "XXX", 'Y', Blocks.glowstone, 'X', new ItemStack(MBlocks.EssenceBlock, 1, 7) });
    }
    
    static {
        BlockRecipes.minicioEssence = Essence.MinicioEssence;
        BlockRecipes.accioEssence = Essence.AccioEssence;
        BlockRecipes.crucioEssence = Essence.CrucioEssence;
        BlockRecipes.imperioEssence = Essence.ImperioEssence;
        BlockRecipes.zivicioEssence = Essence.ZivicioEssence;
        BlockRecipes.accioFurnace = MBlocks.AccioFurnace;
        BlockRecipes.crucioFurnace = MBlocks.CrucioFurnace;
        BlockRecipes.imperioFurnace = MBlocks.ImperioFurnace;
        BlockRecipes.zivicioFurnace = MBlocks.ZivicioFurnace;
        BlockRecipes.ultimateFurnace = MBlocks.UltimateFurnace;
        BlockRecipes.essenceStone = MBlocks.EssenceStone;
        BlockRecipes.zivicioBlock = new ItemStack(MBlocks.EssenceStorage, 1, 4);
        BlockRecipes.black = new ItemStack(Items.dye, 1, 0);
        BlockRecipes.brown = new ItemStack(Items.dye, 1, 3);
        BlockRecipes.green = new ItemStack(Items.dye, 1, 2);
        BlockRecipes.orange = new ItemStack(Items.dye, 1, 14);
        BlockRecipes.yellow = new ItemStack(Items.dye, 1, 11);
        BlockRecipes.blue = new ItemStack(Items.dye, 1, 4);
        BlockRecipes.purple = new ItemStack(Items.dye, 1, 5);
        BlockRecipes.red = new ItemStack(Items.dye, 1, 1);
    }
}
