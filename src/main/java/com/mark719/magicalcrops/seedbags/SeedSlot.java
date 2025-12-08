package com.mark719.magicalcrops.seedbags;

import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraftforge.common.*;

public class SeedSlot extends Slot
{
    public SeedSlot(final IInventory par1IInventory, final int par2, final int par3, final int par4) {
        super(par1IInventory, par2, par3, par4);
    }
    
    public boolean isItemValid(final ItemStack stack) {
        return stack != null && stack.getItem() instanceof IPlantable;
    }
}
