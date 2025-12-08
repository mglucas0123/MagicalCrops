package com.mark719.magicalcrops.seedbags;

import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.common.*;
import net.minecraft.nbt.*;

public class SeedInventory implements IInventory
{
    private ItemStack[] inventoryItems;
    private ItemStack currentItem;
    private int size;
    
    public SeedInventory(final ItemStack current) {
        this.currentItem = current;
        assert this.currentItem != null;
        assert this.currentItem.getItem() instanceof Planter;
        final int itemNumSlots = ((Planter)this.currentItem.getItem()).getInvSlots();
        if (itemNumSlots > 0) {
            this.inventoryItems = new ItemStack[itemNumSlots];
            this.size = itemNumSlots;
        }
        else {
            this.inventoryItems = new ItemStack[0];
            this.size = 0;
        }
        if (!this.currentItem.hasTagCompound()) {
            this.currentItem.setTagCompound(new NBTTagCompound());
        }
        this.loadFromNBT(this.currentItem.getTagCompound());
    }
    
    public int getSizeInventory() {
        return this.size;
    }
    
    public ItemStack getStackInSlot(final int i) {
        if (i >= this.getSizeInventory()) {
            throw new IndexOutOfBoundsException();
        }
        return this.inventoryItems[i];
    }
    
    public ItemStack decrStackSize(final int index, final int amount) {
        if (this.inventoryItems[index] == null) {
            return null;
        }
        ItemStack output;
        if (this.inventoryItems[index].stackSize <= amount) {
            output = this.inventoryItems[index];
            this.inventoryItems[index] = null;
        }
        else {
            output = this.inventoryItems[index].splitStack(amount);
            if (this.inventoryItems[index].stackSize == 0) {
                this.inventoryItems[index] = null;
            }
        }
        this.markDirty();
        return output;
    }
    
    public ItemStack getStackInSlotOnClosing(final int slotNum) {
        if (this.inventoryItems[slotNum] != null) {
            final ItemStack stack = this.inventoryItems[slotNum];
            this.setInventorySlotContents(slotNum, null);
            return stack;
        }
        return null;
    }
    
    public void setInventorySlotContents(final int num, final ItemStack itemStack) {
        this.inventoryItems[num] = itemStack;
        if (itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
            itemStack.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }
    
    public String getInventoryName() {
        return "Seed Bag";
    }
    
    public boolean hasCustomInventoryName() {
        return false;
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public void markDirty() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) != null && this.getStackInSlot(i).stackSize == 0) {
                this.setInventorySlotContents(i, null);
            }
        }
        this.saveToNBT(this.currentItem.getTagCompound());
    }
    
    public boolean isUseableByPlayer(final EntityPlayer entityPlayer) {
        return true;
    }
    
    public void openInventory() {
    }
    
    public void closeInventory() {
    }
    
    public boolean isItemValidForSlot(final int i, final ItemStack itemStack) {
        return itemStack != null && itemStack.getItem() != null && itemStack.getItem() instanceof IPlantable;
    }
    
    public void loadFromNBT(final NBTTagCompound tagCompound) {
        final int NBT_TAGLIST = 10;
        final NBTTagList tagList = tagCompound.getTagList("ItemsPlanterHelper", 10);
        for (int i = 0; i < tagList.tagCount(); ++i) {
            final NBTTagCompound itemTag = tagList.getCompoundTagAt(i);
            final int slot = itemTag.getInteger("SlotPlanterHelper");
            if (slot >= 0 && slot < this.getSizeInventory()) {
                this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(itemTag));
            }
        }
    }
    
    public void saveToNBT(final NBTTagCompound newCompound) {
        final NBTTagList list = new NBTTagList();
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            final ItemStack stack = this.inventoryItems[i];
            if (stack != null) {
                final NBTTagCompound itemTag = new NBTTagCompound();
                itemTag.setInteger("SlotPlanterHelper", i);
                stack.writeToNBT(itemTag);
                list.appendTag((NBTBase)itemTag);
            }
        }
        newCompound.setTag("ItemsPlanterHelper", (NBTBase)list);
    }
}
