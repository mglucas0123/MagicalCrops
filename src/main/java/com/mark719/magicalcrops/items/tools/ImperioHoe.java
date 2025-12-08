package com.mark719.magicalcrops.items.tools;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import java.util.*;
import com.mark719.magicalcrops.config.*;
import org.lwjgl.input.*;
import cpw.mods.fml.relauncher.*;

public class ImperioHoe extends ItemHoe
{
    public ImperioHoe(final int par1, final Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        if (ConfigMain.EXTRA_HOE) {
            par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for tool bonus:");
            if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
                par3List.add(EnumChatFormatting.ITALIC + "- 4 Extra essence from Minicio Crops");
            }
        }
        par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (this.getMaxDamage() - this.getDamage(par1ItemStack)) + "/" + this.getMaxDamage());
        par3List.add("");
        par3List.add(EnumChatFormatting.BLUE + "+1 Attack Damage");
    }
}
