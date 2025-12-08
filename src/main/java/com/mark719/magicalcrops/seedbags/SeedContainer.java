package com.mark719.magicalcrops.seedbags;

import net.minecraft.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import org.lwjgl.input.*;
import net.minecraftforge.common.*;

public class SeedContainer extends Container
{
    private SeedInventory inv;
    
    public SeedContainer(final InventoryPlayer player, final SeedInventory inventory) {
        this.inv = inventory;
        final int rows = this.inv.getSizeInventory() / 9;
        final int invHeightPx = (rows - 4) * 18;
        for (int invRow = 0; invRow < rows; ++invRow) {
            for (int invColumn = 0; invColumn < 9; ++invColumn) {
                this.addSlotToContainer((Slot)new SeedSlot((IInventory)inventory, invColumn + invRow * 9, 8 + invColumn * 18, 18 + invRow * 18));
            }
        }
        for (int invRow = 0; invRow < 3; ++invRow) {
            for (int invColumn = 0; invColumn < 9; ++invColumn) {
                this.addSlotToContainer(new Slot((IInventory)player, invColumn + invRow * 9 + 9, 8 + invColumn * 18, 102 + invRow * 18 + invHeightPx + 1));
            }
        }
        for (int invColumn = 0; invColumn < 9; ++invColumn) {
            if (invColumn == player.currentItem) {
                this.addSlotToContainer((Slot)new DisabledSlot((IInventory)player, invColumn, 8 + invColumn * 18, 161 + invHeightPx));
            }
            else {
                this.addSlotToContainer(new Slot((IInventory)player, invColumn, 8 + invColumn * 18, 161 + invHeightPx));
            }
        }
    }
    
    public void onContainerClosed(final EntityPlayer player) {
        this.inv.saveToNBT(player.getCurrentEquippedItem().getTagCompound());
    }
    
    public boolean canInteractWith(final EntityPlayer entityPlayer) {
        return this.inv.isUseableByPlayer(entityPlayer);
    }
    
    public ItemStack slotClick(final int paramInt1, final int paramInt2, final int paramInt3, final EntityPlayer paramEntityPlayer) {
        if (paramInt3 != 4) {
            return super.slotClick(paramInt1, paramInt2, paramInt3, paramEntityPlayer);
        }
        if (!Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54)) {
            return super.slotClick(paramInt1, paramInt2, 0, paramEntityPlayer);
        }
        return this.transferStackInSlot(paramEntityPlayer, paramInt1);
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer player, final int slot) {
        ItemStack stack = null;
        final Slot slotObject = (Slot) this.inventorySlots.get(slot);
        if (slotObject != null && slotObject.getHasStack() && slotObject.getStack().getItem() instanceof IPlantable) {
            final ItemStack stackInSlot = slotObject.getStack();
            stack = stackInSlot.copy();
            if (slot < this.inv.getSizeInventory()) {
                if (!this.mergeItemStack(stackInSlot, this.inv.getSizeInventory() + 1, this.inv.getSizeInventory() + 36, true)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(stackInSlot, 0, this.inv.getSizeInventory(), false)) {
                return null;
            }
            if (stackInSlot.stackSize == 0) {
                slotObject.putStack((ItemStack)null);
            }
            else {
                slotObject.onSlotChanged();
            }
            if (stackInSlot.stackSize == stack.stackSize) {
                return null;
            }
            slotObject.onPickupFromSlot(player, stackInSlot);
        }
        return stack;
    }
}
