package com.mark719.magicalcrops.furnace;

import net.minecraft.inventory.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;

public class ContainerUltimateFurnace extends Container
{
    private TileEntityUltimateFurnace tileUltimateFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    
    public ContainerUltimateFurnace(final InventoryPlayer player, final TileEntityUltimateFurnace tileEntityUltimateFurnace) {
        this.tileUltimateFurnace = tileEntityUltimateFurnace;
        this.addSlotToContainer(new Slot((IInventory)tileEntityUltimateFurnace, 0, 56, 17));
        this.addSlotToContainer(new Slot((IInventory)tileEntityUltimateFurnace, 1, 56, 53));
        this.addSlotToContainer((Slot)new SlotFurnace(player.player, (IInventory)tileEntityUltimateFurnace, 2, 116, 35));
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
        craft.sendProgressBarUpdate((Container)this, 0, this.tileUltimateFurnace.furnaceCookTime);
        craft.sendProgressBarUpdate((Container)this, 1, this.tileUltimateFurnace.furnaceBurnTime);
        craft.sendProgressBarUpdate((Container)this, 2, this.tileUltimateFurnace.currentBurnTime);
    }
    
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        for (int i = 0; i < this.crafters.size(); ++i) {
            final ICrafting craft = (ICrafting) this.crafters.get(i);
            if (this.lastCookTime != this.tileUltimateFurnace.furnaceCookTime) {
                craft.sendProgressBarUpdate((Container)this, 0, this.tileUltimateFurnace.furnaceCookTime);
            }
            if (this.lastBurnTime != this.tileUltimateFurnace.furnaceBurnTime) {
                craft.sendProgressBarUpdate((Container)this, 1, this.tileUltimateFurnace.furnaceBurnTime);
            }
            if (this.lastItemBurnTime != this.tileUltimateFurnace.currentBurnTime) {
                craft.sendProgressBarUpdate((Container)this, 2, this.tileUltimateFurnace.currentBurnTime);
            }
        }
        this.lastBurnTime = this.tileUltimateFurnace.furnaceBurnTime;
        this.lastCookTime = this.tileUltimateFurnace.furnaceCookTime;
        this.lastItemBurnTime = this.tileUltimateFurnace.currentBurnTime;
    }
    
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(final int par1, final int par2) {
        if (par1 == 0) {
            this.tileUltimateFurnace.furnaceCookTime = par2;
        }
        if (par1 == 1) {
            this.tileUltimateFurnace.furnaceBurnTime = par2;
        }
        if (par1 == 2) {
            this.tileUltimateFurnace.currentBurnTime = par2;
        }
    }
    
    public boolean canInteractWith(final EntityPlayer player) {
        return this.tileUltimateFurnace.isUseableByPlayer(player);
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
                else if (TileEntityUltimateFurnace.isItemFuel(itemstack2)) {
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
