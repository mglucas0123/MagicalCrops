package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import net.minecraft.entity.player.*;
import java.util.*;
import com.mark719.magicalcrops.config.*;
import org.lwjgl.input.*;
import cpw.mods.fml.relauncher.*;

public class ZivicioPickaxe extends ItemPickaxe
{
    public ZivicioPickaxe(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
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
        if (ConfigMain.EXTRA_PICKAXE) {
            par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
            if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
                par3List.add(EnumChatFormatting.ITALIC + "- 16 Extra essence from Minicio Ores");
            }
        }
        par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "Unbreakable");
        par3List.add(EnumChatFormatting.GREEN + "Gem Socket:");
        par3List.add(EnumChatFormatting.ITALIC + "- Empty");
    }
}
