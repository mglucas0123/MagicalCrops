package com.mark719.magicalcrops.seedbags;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.entity.player.*;
import java.util.*;

public class ItemSeedBagZivicio extends Planter
{
    public ItemSeedBagZivicio() {
        super(36, 9);
        this.setUnlocalizedName("SeedBagZivicio");
        this.setTextureName("MagicalCrops:seedbag_4");
        this.setCreativeTab(MagicalCrops.tabMagical);
    }
    
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(final ItemStack par2) {
        return EnumRarity.epic;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add("Plants seeds 9x9");
    }
}
