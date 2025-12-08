package com.mark719.magicalcrops.furnace;

import net.minecraft.inventory.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;

public class ContainerZivicioFurnace extends Container
{
    private TileEntityZivicioFurnace tileZivicioFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    
    public ContainerZivicioFurnace(final InventoryPlayer player, final TileEntityZivicioFurnace tileEntityZivicioFurnace) {
        this.tileZivicioFurnace = tileEntityZivicioFurnace;
        this.addSlotToContainer(new Slot((IInventory)tileEntityZivicioFurnace, 0, 56, 17));
        this.addSlotToContainer(new Slot((IInventory)tileEntityZivicioFurnace, 1, 56, 53));
        this.addSlotToContainer((Slot)new SlotFurnace(player.player, (IInventory)tileEntityZivicioFurnace, 2, 116, 35));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot((IInventory)player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot((IInventory)player, i, 8 + i * 18, 142));
        }
    }
    
    public void addCraftingToCrafters(final ICrafting craft) {
        super.addCraftingToCrafters(craft);
        craft.sendProgressBarUpdate((Container)this, 0, this.tileZivicioFurnace.furnaceCookTime);
        craft.sendProgressBarUpdate((Container)this, 1, this.tileZivicioFurnace.furnaceBurnTime);
        craft.sendProgressBarUpdate((Container)this, 2, this.tileZivicioFurnace.currentBurnTime);
    }
    
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for (int i = 0; i < this.crafters.size(); ++i) {
            final ICrafting craft = (ICrafting) this.crafters.get(i);
            if (this.lastCookTime != this.tileZivicioFurnace.furnaceCookTime) {
                craft.sendProgressBarUpdate((Container)this, 0, this.tileZivicioFurnace.furnaceCookTime);
            }
            if (this.lastBurnTime != this.tileZivicioFurnace.furnaceBurnTime) {
                craft.sendProgressBarUpdate((Container)this, 1, this.tileZivicioFurnace.furnaceBurnTime);
            }
            if (this.lastItemBurnTime != this.tileZivicioFurnace.currentBurnTime) {
                craft.sendProgressBarUpdate((Container)this, 2, this.tileZivicioFurnace.currentBurnTime);
            }
        }
        this.lastBurnTime = this.tileZivicioFurnace.furnaceBurnTime;
        this.lastCookTime = this.tileZivicioFurnace.furnaceCookTime;
        this.lastItemBurnTime = this.tileZivicioFurnace.currentBurnTime;
    }
    
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int par1, final int par2) {
        if (par1 == 0) {
            this.tileZivicioFurnace.furnaceCookTime = par2;
        }
        if (par1 == 1) {
            this.tileZivicioFurnace.furnaceBurnTime = par2;
        }
        if (par1 == 2) {
            this.tileZivicioFurnace.currentBurnTime = par2;
        }
    }
    
    public boolean canInteractWith(final EntityPlayer player) {
        return this.tileZivicioFurnace.isUseableByPlayer(player);
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer p_82846_1_, final int p_82846_2_) {
        ItemStack itemstack = null;
        final Slot slot = (Slot) this.inventorySlots.get(p_82846_2_);
        if (slot != null && slot.getHasStack()) {
            final ItemStack itemstack2 = slot.getStack();
            itemstack = itemstack2.copy();
            if (p_82846_2_ == 2) {
                if (!this.mergeItemStack(itemstack2, 3, 39, true)) {
                    return null;
                }
                slot.onSlotChange(itemstack2, itemstack);
            }
            else if (p_82846_2_ != 1 && p_82846_2_ != 0) {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack2) != null) {
                    if (!this.mergeItemStack(itemstack2, 0, 1, false)) {
                        return null;
                    }
                }
                else if (TileEntityZivicioFurnace.isItemFuel(itemstack2)) {
                    if (!this.mergeItemStack(itemstack2, 1, 2, false)) {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 3 && p_82846_2_ < 30) {
                    if (!this.mergeItemStack(itemstack2, 30, 39, false)) {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !this.mergeItemStack(itemstack2, 3, 30, false)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack2, 3, 39, false)) {
                return null;
            }
            if (itemstack2.stackSize == 0) {
                slot.putStack((ItemStack)null);
            }
            else {
                slot.onSlotChanged();
            }
            if (itemstack2.stackSize == itemstack.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(p_82846_1_, itemstack2);
        }
        return itemstack;
    }
}
