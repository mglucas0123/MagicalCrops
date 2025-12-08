package com.mark719.magicalcrops.blocks.crops;

import com.mark719.magicalcrops.blocks.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.item.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.client.renderer.texture.*;

public class RubberCrop extends BlockMagicalCrops
{
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    
    public Item func_149866_i() {
        return ModCompat.RubberSeeds;
    }
    
    public Item func_149865_P() {
        return ModCompat.RubberEssence;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister p_149651_1_) {
        this.iconArray = new IIcon[4];
        for (int i = 0; i < this.iconArray.length; ++i) {
            this.iconArray[i] = p_149651_1_.registerIcon("magicalcrops:CropRubber_" + i);
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(final int par1, int par2) {
        if (par2 < 7) {
            if (par2 == 6) {
                par2 = 5;
            }
            return this.iconArray[par2 >> 1];
        }
        return this.iconArray[3];
    }
}
