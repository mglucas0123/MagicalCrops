package com.mark719.magicalcrops.furnace;

import net.minecraft.tileentity.*;
import net.minecraft.inventory.*;
import net.minecraft.nbt.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.item.crafting.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.entity.player.*;

public class TileEntityZivicioFurnace extends TileEntity implements ISidedInventory
{
    private static final int[] slotsTop;
    private static final int[] slotsBottom;
    private static final int[] slotsSides;
    private ItemStack[] furnaceItemStacks;
    public int furnaceBurnTime;
    public int currentBurnTime;
    public int furnaceCookTime;
    private String furnaceName;
    
    public TileEntityZivicioFurnace() {
        this.furnaceItemStacks = new ItemStack[3];
    }
    
    public void furnaceName(final String string) {
        this.furnaceName = string;
    }
    
    public int getSizeInventory() {
        return this.furnaceItemStacks.length;
    }
    
    public ItemStack getStackInSlot(final int slot) {
        return this.furnaceItemStacks[slot];
    }
    
    public ItemStack decrStackSize(final int p_70298_1_, final int p_70298_2_) {
        if (this.furnaceItemStacks[p_70298_1_] == null) {
            return null;
        }
        if (this.furnaceItemStacks[p_70298_1_].stackSize <= p_70298_2_) {
            final ItemStack itemstack = this.furnaceItemStacks[p_70298_1_];
            this.furnaceItemStacks[p_70298_1_] = null;
            return itemstack;
        }
        final ItemStack itemstack = this.furnaceItemStacks[p_70298_1_].splitStack(p_70298_2_);
        if (this.furnaceItemStacks[p_70298_1_].stackSize == 0) {
            this.furnaceItemStacks[p_70298_1_] = null;
        }
        return itemstack;
    }
    
    public ItemStack getStackInSlotOnClosing(final int p_70304_1_) {
        if (this.furnaceItemStacks[p_70304_1_] != null) {
            final ItemStack itemstack = this.furnaceItemStacks[p_70304_1_];
            this.furnaceItemStacks[p_70304_1_] = null;
            return itemstack;
        }
        return null;
    }
    
    public void setInventorySlotContents(final int p_70299_1_, final ItemStack p_70299_2_) {
        this.furnaceItemStacks[p_70299_1_] = p_70299_2_;
        if (p_70299_2_ != null && p_70299_2_.stackSize > this.getInventoryStackLimit()) {
            p_70299_2_.stackSize = this.getInventoryStackLimit();
        }
    }
    
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.furnaceName : "Zivicio Furnace";
    }
    
    public boolean hasCustomInventoryName() {
        return this.furnaceName != null && this.furnaceName.length() > 0;
    }
    
    public void readFromNBT(final NBTTagCompound p_145839_1_) {
        super.readFromNBT(p_145839_1_);
        final NBTTagList nbttaglist = p_145839_1_.getTagList("Items", 10);
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            final byte b0 = nbttagcompound1.getByte("Slot");
            if (b0 >= 0 && b0 < this.furnaceItemStacks.length) {
                this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
        this.furnaceBurnTime = p_145839_1_.getShort("BurnTime");
        this.furnaceCookTime = p_145839_1_.getShort("CookTime");
        this.currentBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
        if (p_145839_1_.hasKey("CustomName", 8)) {
            this.furnaceName = p_145839_1_.getString("CustomName");
        }
    }
    
    public void writeToNBT(final NBTTagCompound p_145841_1_) {
        super.writeToNBT(p_145841_1_);
        p_145841_1_.setShort("BurnTime", (short)this.furnaceBurnTime);
        p_145841_1_.setShort("CookTime", (short)this.furnaceCookTime);
        final NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < this.furnaceItemStacks.length; ++i) {
            if (this.furnaceItemStacks[i] != null) {
                final NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag((NBTBase)nbttagcompound1);
            }
        }
        p_145841_1_.setTag("Items", (NBTBase)nbttaglist);
        if (this.hasCustomInventoryName()) {
            p_145841_1_.setString("CustomName", this.furnaceName);
        }
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(final int par1) {
        return this.furnaceCookTime * par1 / 12;
    }
    
    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(final int p_145955_1_) {
        if (this.currentBurnTime == 0) {
            this.currentBurnTime = 25;
        }
        return this.furnaceBurnTime * p_145955_1_ / this.currentBurnTime;
    }
    
    public boolean isBurning() {
        return this.furnaceBurnTime > 0;
    }
    
    public void updateEntity() {
        final boolean flag = this.furnaceBurnTime > 0;
        boolean flag2 = false;
        if (this.furnaceBurnTime > 0) {
            --this.furnaceBurnTime;
        }
        if (!this.worldObj.isRemote) {
            if (this.furnaceBurnTime != 0 || (this.furnaceItemStacks[1] != null && this.furnaceItemStacks[0] != null)) {
                if (this.furnaceBurnTime == 0 && this.canSmelt()) {
                    final int itemBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);
                    this.furnaceBurnTime = itemBurnTime;
                    this.currentBurnTime = itemBurnTime;
                    if (this.furnaceBurnTime > 0) {
                        flag2 = true;
                        if (this.furnaceItemStacks[1] != null) {
                            final ItemStack itemStack = this.furnaceItemStacks[1];
                            --itemStack.stackSize;
                            if (this.furnaceItemStacks[1].stackSize == 0) {
                                this.furnaceItemStacks[1] = this.furnaceItemStacks[1].getItem().getContainerItem(this.furnaceItemStacks[1]);
                            }
                        }
                    }
                }
                if (this.isBurning() && this.canSmelt()) {
                    ++this.furnaceCookTime;
                    if (this.furnaceCookTime == 12) {
                        this.furnaceCookTime = 0;
                        this.smeltItem();
                        flag2 = true;
                    }
                }
                else {
                    this.furnaceCookTime = 0;
                }
            }
            if (flag != this.furnaceBurnTime > 0) {
                flag2 = true;
                ZivicioFurnace.updateBlockState(this.furnaceBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if (flag2) {
            this.markDirty();
        }
    }
    
    private boolean canSmelt() {
        if (this.furnaceItemStacks[0] == null) {
            return false;
        }
        final ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
        if (itemstack == null) {
            return false;
        }
        if (this.furnaceItemStacks[2] == null) {
            return true;
        }
        if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) {
            return false;
        }
        final int result = this.furnaceItemStacks[2].stackSize + itemstack.stackSize;
        return result <= this.getInventoryStackLimit() && result <= this.furnaceItemStacks[2].getMaxStackSize();
    }
    
    public void smeltItem() {
        if (this.canSmelt()) {
            final ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
            if (this.furnaceItemStacks[2] == null) {
                this.furnaceItemStacks[2] = itemstack.copy();
            }
            else if (this.furnaceItemStacks[2].getItem() == itemstack.getItem()) {
                final ItemStack itemStack = this.furnaceItemStacks[2];
                itemStack.stackSize += itemstack.stackSize;
            }
            final ItemStack itemStack2 = this.furnaceItemStacks[0];
            --itemStack2.stackSize;
            if (this.furnaceItemStacks[0].stackSize <= 0) {
                this.furnaceItemStacks[0] = null;
            }
        }
    }
    
    public static int getItemBurnTime(final ItemStack p_145952_0_) {
        if (p_145952_0_ == null) {
            return 0;
        }
        final Item item = p_145952_0_.getItem();
        if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
            final Block block = Block.getBlockFromItem(item);
            if (block == Blocks.wooden_slab) {
                return 150;
            }
            if (block.getMaterial() == Material.wood) {
                return 300;
            }
            if (block == Blocks.coal_block) {
                return 16000;
            }
        }
        if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) {
            return 200;
        }
        if (item == Items.stick) {
            return 100;
        }
        if (item == Items.coal) {
            return 1600;
        }
        if (item == Items.lava_bucket) {
            return 20000;
        }
        if (item == Item.getItemFromBlock(Blocks.sapling)) {
            return 100;
        }
        if (item == Items.blaze_rod) {
            return 2400;
        }
        return GameRegistry.getFuelValue(p_145952_0_);
    }
    
    public static boolean isItemFuel(final ItemStack p_145954_0_) {
        return getItemBurnTime(p_145954_0_) > 0;
    }
    
    public boolean isUseableByPlayer(final EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && player.getDistanceSq(this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5) <= 64.0;
    }
    
    public void openInventory() {
    }
    
    public void closeInventory() {
    }
    
    public boolean isItemValidForSlot(final int p_94041_1_, final ItemStack p_94041_2_) {
        return p_94041_1_ != 2 && (p_94041_1_ != 1 || isItemFuel(p_94041_2_));
    }
    
    public int[] getAccessibleSlotsFromSide(final int p_94128_1_) {
        return (p_94128_1_ == 0) ? TileEntityZivicioFurnace.slotsBottom : ((p_94128_1_ == 1) ? TileEntityZivicioFurnace.slotsTop : TileEntityZivicioFurnace.slotsSides);
    }
    
    public boolean canInsertItem(final int p_102007_1_, final ItemStack p_102007_2_, final int p_102007_3_) {
        return this.isItemValidForSlot(p_102007_1_, p_102007_2_);
    }
    
    public boolean canExtractItem(final int p_102008_1_, final ItemStack p_102008_2_, final int p_102008_3_) {
        return p_102008_3_ != 0 || p_102008_1_ != 1 || p_102008_2_.getItem() == Items.bucket;
    }
    
    static {
        slotsTop = new int[] { 0 };
        slotsBottom = new int[] { 2, 1 };
        slotsSides = new int[] { 1 };
    }
}
