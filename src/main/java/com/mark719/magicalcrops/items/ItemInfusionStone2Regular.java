package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.entity.player.*;
import java.util.*;

public class ItemInfusionStone2Regular extends Item
{
    int durability;
    
    public ItemInfusionStone2Regular() {
        this.durability = ConfigMain.REGULAR_DURABILITY;
        this.maxStackSize = 1;
        this.setMaxDamage(this.durability);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:InfusionStone_T2");
        this.setUnlocalizedName("InfusionStoneRegular");
        this.canRepair = false;
        this.hasSubtypes = true;
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
    public EnumRarity getRarity(final ItemStack par2) {
        return EnumRarity.uncommon;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add("Accio -> Crucio");
        if (ConfigMain.INFUSION_DURABILITY) {
            par3List.add("Durability: " + (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage()) + "/" + par1ItemStack.getMaxDamage());
        }
    }
}
