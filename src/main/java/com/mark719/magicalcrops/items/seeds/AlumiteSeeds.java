package com.mark719.magicalcrops.items.seeds;

import net.minecraft.block.*;
import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import cpw.mods.fml.relauncher.*;

public class AlumiteSeeds extends ItemSeeds
{
    public AlumiteSeeds(final Block crop, final Block farmland) {
        super(crop, farmland);
        this.maxStackSize = 64;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return 16043244;
    }
}
