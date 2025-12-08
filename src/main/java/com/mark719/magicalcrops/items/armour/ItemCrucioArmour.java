package com.mark719.magicalcrops.items.armour;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import java.util.*;
import org.lwjgl.input.*;
import cpw.mods.fml.relauncher.*;

public class ItemCrucioArmour extends ItemArmor
{
    public ItemCrucioArmour(final ItemArmor.ArmorMaterial material, final int armorType, final String name) {
        super(material, 0, armorType);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MagicalCrops.tabMagical);
        if (armorType == 0) {
            this.setTextureName("magicalcrops:armour_crucio_helmet");
        }
        else if (armorType == 1) {
            this.setTextureName("magicalcrops:armour_crucio_chestplate");
        }
        else if (armorType == 2) {
            this.setTextureName("magicalcrops:armour_crucio_leggings");
        }
        else if (armorType == 3) {
            this.setTextureName("magicalcrops:armour_crucio_boots");
        }
    }
    
    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (stack.getItem() == Armour.CrucioArmourHelmet || stack.getItem() == Armour.CrucioArmourChestplate || stack.getItem() == Armour.CrucioArmourBoots) {
            return "magicalcrops:textures/armour/crucio_armour_1.png";
        }
        if (stack.getItem() == Armour.CrucioArmourLeggings) {
            return "magicalcrops:textures/armour/crucio_armour_2.png";
        }
        return null;
    }
    
    public boolean getIsRepairable(final ItemStack par1ItemStack, final ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Essence.CrucioEssence)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for info:");
        if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
            par3List.add(EnumChatFormatting.ITALIC + "- 88% Damage Reduction");
        }
        par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (this.getMaxDamage() - this.getDamage(par1ItemStack)) + "/" + this.getMaxDamage());
    }
}
