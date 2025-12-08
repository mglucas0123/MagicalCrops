package com.mark719.magicalcrops.items;

import com.mark719.magicalcrops.*;
import net.minecraft.util.*;
import net.minecraft.item.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.entity.player.*;
import java.util.*;
import com.mark719.magicalcrops.config.*;

public class ItemInfusionStone5Master extends Item
{
    public ItemInfusionStone5Master() {
        this.maxStackSize = 1;
        this.setMaxDamage(0);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:InfusionStone_T5");
        this.setUnlocalizedName("InfusionStoneMaster");
        this.canRepair = false;
        this.hasSubtypes = true;
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.DARK_RED + super.getItemStackDisplayName(stack);
    }
    
    public boolean doesContainerItemLeaveCraftingGrid(final ItemStack itemstack) {
        return false;
    }
    
    public ItemStack getContainerItem(final ItemStack itemStack) {
        final ItemStack cStack = itemStack.copy();
        return cStack;
    }
    
    public boolean hasContainerItem(final ItemStack stack) {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(final ItemStack par2) {
        return EnumRarity.epic;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add("Infuses All");
        if (ConfigMain.INFUSION_DURABILITY) {
            par3List.add("Durability: Infinate");
        }
    }
}
