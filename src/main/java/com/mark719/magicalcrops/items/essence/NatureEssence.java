package com.mark719.magicalcrops.items.essence;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import net.minecraft.block.*;
import java.util.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;

public class NatureEssence extends Item
{
    public NatureEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:cropessence_nature");
    }
    
    public boolean onItemUse(final ItemStack p_77648_1_, final EntityPlayer p_77648_2_, final World p_77648_3_, final int p_77648_4_, final int p_77648_5_, final int p_77648_6_, final int p_77648_7_, final float p_77648_8_, final float p_77648_9_, final float p_77648_10_) {
        if (p_77648_7_ != 1) {
            return false;
        }
        if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) || p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) != Blocks.dirt) {
            return false;
        }
        if (!p_77648_3_.isRemote) {
            p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, (Block)Blocks.grass, 0, 1);
            p_77648_3_.playAuxSFX(2005, p_77648_4_, p_77648_5_ + 1, p_77648_6_, 0);
            --p_77648_1_.stackSize;
            return true;
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add(EnumChatFormatting.YELLOW + "Right Click: " + EnumChatFormatting.WHITE + "Turns dirt into grass");
    }
}
