package com.mark719.magicalcrops.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import com.mark719.magicalcrops.*;
import java.util.*;
import net.minecraft.item.*;
import com.mark719.magicalcrops.handlers.*;

public class BlockMinicioOre extends Block
{
    public BlockMinicioOre() {
        super(Material.rock);
        this.setBlockTextureName("magicalcrops:EssenceOre");
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setStepSound(BlockMinicioOre.soundTypePiston);
        this.setHardness(3.0f);
        this.setResistance(5.0f);
        this.setHarvestLevel("pickaxe", 2);
    }
    
    public Item getItemDropped(final int p_149650_1_, final Random p_149650_2_, final int p_149650_3_) {
        return Essence.MinicioEssence;
    }
    
    public int quantityDropped(final Random par1Random) {
        return 4;
    }
    
    protected boolean canSilkHarvest() {
        return true;
    }
}
