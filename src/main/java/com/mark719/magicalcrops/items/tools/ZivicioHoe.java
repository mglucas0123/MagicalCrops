package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import java.util.*;
import com.mark719.magicalcrops.config.*;
import org.lwjgl.input.*;
import cpw.mods.fml.relauncher.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.eventhandler.*;
import net.minecraft.world.*;
import net.minecraft.init.*;

public class ZivicioHoe extends ItemHoe
{
    public ZivicioHoe(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLivingBase, final EntityLivingBase par3EntityLivingBase) {
        return true;
    }
    
    public boolean onBlockDestroyed(final ItemStack p_150894_1_, final World p_150894_2_, final Block p_150894_3_, final int p_150894_4_, final int p_150894_5_, final int p_150894_6_, final EntityLivingBase p_150894_7_) {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        if (ConfigMain.EXTRA_HOE) {
            par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
            if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
                par3List.add(EnumChatFormatting.ITALIC + "- 8 Extra essence from Minicio Crops");
            }
        }
        par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "Unbreakable");
        par3List.add(EnumChatFormatting.GREEN + "Gem Socket:");
        par3List.add(EnumChatFormatting.ITALIC + "- Empty");
        par3List.add("");
        par3List.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
    }
    
    public boolean onItemUse(final ItemStack p_77648_1_, final EntityPlayer p_77648_2_, final World p_77648_3_, final int p_77648_4_, final int p_77648_5_, final int p_77648_6_, final int p_77648_7_, final float p_77648_8_, final float p_77648_9_, final float p_77648_10_) {
        if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_)) {
            return false;
        }
        final UseHoeEvent event = new UseHoeEvent(p_77648_2_, p_77648_1_, p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_);
        if (MinecraftForge.EVENT_BUS.post((Event)event)) {
            return false;
        }
        if (event.getResult() == Event.Result.ALLOW) {
            p_77648_1_.damageItem(0, (EntityLivingBase)p_77648_2_);
            return true;
        }
        final Block block = p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_);
        if (p_77648_7_ == 0 || !p_77648_3_.getBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_).isAir((IBlockAccess)p_77648_3_, p_77648_4_, p_77648_5_ + 1, p_77648_6_) || (block != Blocks.grass && block != Blocks.dirt)) {
            return false;
        }
        final Block block2 = Blocks.farmland;
        p_77648_3_.playSoundEffect((double)(p_77648_4_ + 0.5f), (double)(p_77648_5_ + 0.5f), (double)(p_77648_6_ + 0.5f), block2.stepSound.getStepResourcePath(), (block2.stepSound.getVolume() + 1.0f) / 2.0f, block2.stepSound.getPitch() * 0.8f);
        if (p_77648_3_.isRemote) {
            return true;
        }
        p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, block2);
        p_77648_1_.damageItem(0, (EntityLivingBase)p_77648_2_);
        return true;
    }
}
