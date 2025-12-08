package com.mark719.magicalcrops.seedbags;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import com.mark719.magicalcrops.*;
import net.minecraftforge.common.util.*;
import net.minecraft.inventory.*;
import net.minecraftforge.common.*;
import net.minecraft.util.*;

public abstract class Planter extends Item
{
    protected boolean hasGui;
    protected int invSlots;
    protected int range;
    
    public Planter(final int guiSlots, final int range) {
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabTools);
        if (guiSlots > 0) {
            this.hasGui = true;
            this.invSlots = guiSlots;
        }
        else {
            this.hasGui = false;
            this.invSlots = -1;
        }
        this.range = range;
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (this.hasGui && par3EntityPlayer.isSneaking()) {
            par3EntityPlayer.openGui((Object)MagicalCrops.instance, 0, par2World, 0, 0, 0);
        }
        return par1ItemStack;
    }
    
    public boolean onItemUse(final ItemStack itemStackUsed, final EntityPlayer player, final World world, final int x, final int y, final int z, final int intDirection, final float par8, final float par9, final float par10) {
        if (this.hasGui && player.isSneaking()) {
            return false;
        }
        final IInventory inventory = this.getInventory(player);
        if (inventory == null) {
            return false;
        }
        if (this.canPlant(inventory, world, x, y, z, ForgeDirection.getOrientation(intDirection))) {
            this.plant(player, inventory, world, x, y, z, this.range, player.rotationYaw);
        }
        return true;
    }
    
    public int getMaxItemUseDuration(final ItemStack itemstack) {
        return 1;
    }
    
    public IInventory getInventory(final EntityPlayer player) {
        if (player.getHeldItem().getItem() == this) {
            return (IInventory)new SeedInventory(player.getHeldItem());
        }
        return null;
    }
    
    public int getFirstSlot(final IInventory inventory) {
        return 0;
    }
    
    public boolean canPlant(final IInventory inv, final World world, final int x, final int y, final int z, final ForgeDirection direction) {
        final int nextSlot = PlantingLogic.getSeedsSlot(inv, this.getFirstSlot(inv));
        if (nextSlot < 0) {
            return false;
        }
        final ItemStack targetItem = inv.getStackInSlot(nextSlot);
        assert targetItem != null;
        assert targetItem.getItem() instanceof IPlantable;
        final IPlantable targetPlantable = (IPlantable)targetItem.getItem();
        return PlantingLogic.targetedSuitableFarmland(world, x, y, z, direction, targetPlantable);
    }
    
    public void plant(final EntityPlayer player, final IInventory inv, final World world, final int startX, final int startY, final int startZ, final int width, final float playerRotation) {
        final int intFacing = MathHelper.floor_double(playerRotation * 4.0f / 360.0f + 0.5) & 0x3;
        final ForgeDirection[] directions = { ForgeDirection.SOUTH, ForgeDirection.WEST, ForgeDirection.NORTH, ForgeDirection.EAST };
        final ForgeDirection direction = directions[intFacing];
        switch (direction) {
            case NORTH: {
                final int startCornerX = startX - (width - 1) / 2;
                int rowZ;
                for (int startCornerZ = rowZ = startZ; rowZ > startCornerZ - width; --rowZ) {
                    for (int columnX = startCornerX; columnX < startCornerX + width; ++columnX) {
                        this.plantSeedInPlace(inv, world, columnX, startY, rowZ, direction);
                    }
                }
                break;
            }
            case EAST: {
                final int startCornerX = startX;
                final int startCornerZ = startZ - (width - 1) / 2;
                for (int rowX = startCornerX; rowX < startCornerX + width; ++rowX) {
                    for (int columnZ = startCornerZ; columnZ < startCornerZ + width; ++columnZ) {
                        this.plantSeedInPlace(inv, world, rowX, startY, columnZ, direction);
                    }
                }
                break;
            }
            case SOUTH: {
                final int startCornerX = startX + (width - 1) / 2;
                int rowZ;
                for (int startCornerZ = rowZ = startZ; rowZ < startCornerZ + width; ++rowZ) {
                    for (int columnX = startCornerX; columnX > startCornerX - width; --columnX) {
                        this.plantSeedInPlace(inv, world, columnX, startY, rowZ, direction);
                    }
                }
                break;
            }
            case WEST: {
                final int startCornerX = startX;
                final int startCornerZ = startZ + (width - 1) / 2;
                for (int rowX = startCornerX; rowX > startCornerX - width; --rowX) {
                    for (int columnZ = startCornerZ; columnZ > startCornerZ - width; --columnZ) {
                        this.plantSeedInPlace(inv, world, rowX, startY, columnZ, direction);
                    }
                }
                break;
            }
        }
    }
    
    public boolean plantSeedInPlace(final IInventory inv, final World world, final int x, final int y, final int z, final ForgeDirection direction) {
        final int slot = PlantingLogic.getSeedsSlot(inv, this.getFirstSlot(inv));
        if (slot < 0) {
            return false;
        }
        final boolean success = PlantingLogic.placeSeed(inv, world, x, y, z, slot, direction);
        if (success) {
            inv.decrStackSize(slot, 1);
        }
        return success;
    }
    
    public int getInvSlots() {
        return this.invSlots;
    }
}
