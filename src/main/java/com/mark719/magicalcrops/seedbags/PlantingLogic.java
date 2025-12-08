package com.mark719.magicalcrops.seedbags;

import net.minecraft.inventory.*;
import net.minecraftforge.common.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import net.minecraft.world.*;
import net.minecraft.block.*;

public class PlantingLogic
{
    public static int getSeedsSlot(final IInventory inv, final int initialSlot) {
        if (initialSlot < 0) {
            return -1;
        }
        final ItemStack initialTarget = inv.getStackInSlot(initialSlot);
        if (initialTarget != null && initialTarget.stackSize > 0) {
            return initialSlot;
        }
        int slot = 0;
        while (inv.getStackInSlot(slot) == null || inv.getStackInSlot(slot).getItem() == null || !(inv.getStackInSlot(slot).getItem() instanceof IPlantable) || (inv.getStackInSlot(slot).stackSize <= 0 && slot < inv.getSizeInventory())) {
            if (++slot >= inv.getSizeInventory()) {
                return -1;
            }
        }
        return slot;
    }
    
    public static boolean placeSeed(final IInventory inv, final World world, final int x, final int y, final int z, final int invPos, final ForgeDirection direction) {
        final ItemStack currentItem = inv.getStackInSlot(invPos);
        if (currentItem == null || !(currentItem.getItem() instanceof IPlantable)) {
            return false;
        }
        final IPlantable plantable = (IPlantable)currentItem.getItem();
        final Block targetBlock = world.getBlock(x, y, z);
        if (targetBlock == null || !targetBlock.canSustainPlant((IBlockAccess)world, x, y, z, direction, plantable)) {
            return false;
        }
        if (!world.isAirBlock(x, y + 1, z)) {
            return false;
        }
        final Block plantablePlant = plantable.getPlant((IBlockAccess)world, x, y + 1, z);
        final int plantMeta = plantable.getPlantMetadata((IBlockAccess)world, x, y + 1, z);
        world.setBlock(x, y + 1, z, plantablePlant, plantMeta, 3);
        return true;
    }
    
    public static boolean targetedSuitableFarmland(final World world, final int x, final int y, final int z, final ForgeDirection direction, final IPlantable plantable) {
        final Block block = world.getBlock(x, y, z);
        return block != null && block.canSustainPlant((IBlockAccess)world, x, y, z, direction, plantable);
    }
}
