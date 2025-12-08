package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraftforge.common.util.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.eventhandler.*;
import com.mark719.magicalcrops.blocks.*;
import net.minecraft.util.*;
import net.minecraft.block.*;

public class ItemMagicalFertilizer extends Item
{
    public ItemMagicalFertilizer() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:MagicalFertilizer");
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final World par3World, final int par4, final int par5, final int par6, final int par7, final float par8, final float par9, final float par10) {
        final int I1 = par3World.getBlockMetadata(par4, par5, par6);
        if (I1 < 7) {
            if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
                return false;
            }
            if (applyBonemeal(par1ItemStack, par3World, par4, par5, par6, par2EntityPlayer)) {
                if (!par3World.isRemote) {
                    par3World.playAuxSFX(2005, par4, par5, par6, 0);
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean func_96604_a(final ItemStack par0ItemStack, final WorldServer par1World, final int par2, final int par3, final int par4) {
        return applyBonemeal(par0ItemStack, (World)par1World, par2, par3, par4, (EntityPlayer)FakePlayerFactory.getMinecraft(par1World));
    }
    
    public static boolean applyBonemeal(final ItemStack par0ItemStack, final World par1World, final int par2, final int par3, final int par4, final EntityPlayer player) {
        final Block block = par1World.getBlock(par2, par3, par4);
        final BonemealEvent event = new BonemealEvent(player, par1World, block, par2, par3, par4);
        if (MinecraftForge.EVENT_BUS.post((Event)event)) {
            return false;
        }
        if (event.getResult() == Event.Result.ALLOW) {
            if (!par1World.isRemote) {
                --par0ItemStack.stackSize;
            }
            return true;
        }
        if (block instanceof BlockMagicalCrops) {
            if (!par1World.isRemote) {
                int I = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 7, 7);
                if (I > 7) {
                    I = 7;
                }
                par1World.setBlockMetadataWithNotify(par2, par3, par4, I, 2);
                --par0ItemStack.stackSize;
            }
            return true;
        }
        return false;
    }
}
