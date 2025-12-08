package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import java.util.*;
import cpw.mods.fml.relauncher.*;

public class ItemInfusionStone3Strong extends Item
{
    int durability;
    
    public ItemInfusionStone3Strong() {
        this.durability = ConfigMain.STRONG_DURABILITY;
        this.maxStackSize = 1;
        this.setMaxDamage(this.durability);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:InfusionStone_T3");
        this.setUnlocalizedName("InfusionStoneStrong");
        this.canRepair = false;
        this.hasSubtypes = true;
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
    }
    
    public boolean doesContainerItemLeaveCraftingGrid(final ItemStack itemstack) {
        return false;
    }
    
    public ItemStack getContainerItem(final ItemStack itemStack) {
        final ItemStack cStack = itemStack.copy();
        if (ConfigMain.INFUSION_DURABILITY) {
            cStack.setItemDamage(cStack.getItemDamage() + 1);
            cStack.stackSize = 1;
        }
        return cStack;
    }
    
    public boolean hasContainerItem(final ItemStack stack) {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add("Crucio -> Imperio");
        if (ConfigMain.INFUSION_DURABILITY) {
            par3List.add("Durability: " + (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage()) + "/" + par1ItemStack.getMaxDamage());
        }
    }
}
