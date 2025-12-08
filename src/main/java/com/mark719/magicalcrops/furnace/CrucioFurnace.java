package com.mark719.magicalcrops.furnace;

import cpw.mods.fml.relauncher.*;
import java.util.*;
import net.minecraft.block.material.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import com.mark719.magicalcrops.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.tileentity.*;
import net.minecraft.entity.item.*;
import net.minecraft.nbt.*;
import net.minecraft.entity.*;

public class CrucioFurnace extends BlockContainer
{
    @SideOnly(Side.CLIENT)
    private IIcon field_149935_N;
    @SideOnly(Side.CLIENT)
    private IIcon field_149936_O;
    private static boolean isBurning;
    private final boolean isBurning2;
    private final Random random;
    
    public CrucioFurnace(final boolean isActive) {
        super(Material.rock);
        this.random = new Random();
        this.isBurning2 = isActive;
        this.setHardness(3.0f);
        this.setResistance(2000.0f);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int p_149691_1_, final int p_149691_2_) {
        if (p_149691_2_ == 0 && p_149691_1_ == 3) {
            return this.field_149936_O;
        }
        return (p_149691_1_ == 1) ? this.field_149935_N : ((p_149691_1_ == 0) ? this.field_149935_N : ((p_149691_1_ != p_149691_2_) ? this.blockIcon : this.field_149936_O));
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon("magicalcrops:furnacecrucio_side");
        this.field_149936_O = p_149651_1_.registerIcon(this.isBurning2 ? "magicalcrops:furnacecrucio_front_on" : "magicalcrops:furnacecrucio_front_off");
        this.field_149935_N = p_149651_1_.registerIcon("magicalcrops:furnacecrucio_top");
    }
    
    public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        player.openGui((Object)MagicalCrops.instance, 2, world, x, y, z);
        return true;
    }
    
    public Item getItemDropped(final int par1, final Random random, final int par3) {
        return Item.getItemFromBlock(MBlocks.CrucioFurnace);
    }
    
    public Item getItem(final World world, final int par2, final int par3, final int par4) {
        return Item.getItemFromBlock(MBlocks.CrucioFurnace);
    }
    
    public TileEntity createNewTileEntity(final World world, final int par2) {
        return new TileEntityCrucioFurnace();
    }
    
    public void onBlockAdded(final World p_149726_1_, final int p_149726_2_, final int p_149726_3_, final int p_149726_4_) {
        super.onBlockAdded(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
        this.func_149930_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
    }
    
    private void func_149930_e(final World p_149930_1_, final int p_149930_2_, final int p_149930_3_, final int p_149930_4_) {
        if (!p_149930_1_.isRemote) {
            final Block block = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ - 1);
            final Block block2 = p_149930_1_.getBlock(p_149930_2_, p_149930_3_, p_149930_4_ + 1);
            final Block block3 = p_149930_1_.getBlock(p_149930_2_ - 1, p_149930_3_, p_149930_4_);
            final Block block4 = p_149930_1_.getBlock(p_149930_2_ + 1, p_149930_3_, p_149930_4_);
            byte b0 = 3;
            if (block.func_149730_j() && !block2.func_149730_j()) {
                b0 = 3;
            }
            if (block2.func_149730_j() && !block.func_149730_j()) {
                b0 = 2;
            }
            if (block3.func_149730_j() && !block4.func_149730_j()) {
                b0 = 5;
            }
            if (block4.func_149730_j() && !block3.func_149730_j()) {
                b0 = 4;
            }
            p_149930_1_.setBlockMetadataWithNotify(p_149930_2_, p_149930_3_, p_149930_4_, (int)b0, 2);
        }
    }
    
    public void onBlockPlacedBy(final World p_149689_1_, final int p_149689_2_, final int p_149689_3_, final int p_149689_4_, final EntityLivingBase p_149689_5_, final ItemStack p_149689_6_) {
        final int l = MathHelper.floor_double(p_149689_5_.rotationYaw * 4.0f / 360.0f + 0.5) & 0x3;
        if (l == 0) {
            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 2, 2);
        }
        if (l == 1) {
            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 5, 2);
        }
        if (l == 2) {
            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 3, 2);
        }
        if (l == 3) {
            p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 4, 2);
        }
        if (p_149689_6_.hasDisplayName()) {
            ((TileEntityFurnace)p_149689_1_.getTileEntity(p_149689_2_, p_149689_3_, p_149689_4_)).func_145951_a(p_149689_6_.getDisplayName());
        }
    }
    
    public static void updateBlockState(final boolean p_149931_0_, final World p_149931_1_, final int p_149931_2_, final int p_149931_3_, final int p_149931_4_) {
        final int l = p_149931_1_.getBlockMetadata(p_149931_2_, p_149931_3_, p_149931_4_);
        final TileEntity tileentity = p_149931_1_.getTileEntity(p_149931_2_, p_149931_3_, p_149931_4_);
        CrucioFurnace.isBurning = true;
        if (p_149931_0_) {
            p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.CrucioFurnaceActive);
        }
        else {
            p_149931_1_.setBlock(p_149931_2_, p_149931_3_, p_149931_4_, MBlocks.CrucioFurnace);
        }
        CrucioFurnace.isBurning = false;
        p_149931_1_.setBlockMetadataWithNotify(p_149931_2_, p_149931_3_, p_149931_4_, l, 2);
        if (tileentity != null) {
            tileentity.validate();
            p_149931_1_.setTileEntity(p_149931_2_, p_149931_3_, p_149931_4_, tileentity);
        }
    }
    
    public void breakBlock(final World world, final int x, final int y, final int z, final Block block, final int meta) {
        if (!CrucioFurnace.isBurning) {
            final TileEntityCrucioFurnace tileentityCrucioFurnace = (TileEntityCrucioFurnace)world.getTileEntity(x, y, z);
            if (tileentityCrucioFurnace != null) {
                for (int i = 0; i < tileentityCrucioFurnace.getSizeInventory(); ++i) {
                    final ItemStack itemstack = tileentityCrucioFurnace.getStackInSlot(i);
                    if (itemstack != null) {
                        final float f = this.random.nextFloat() * 0.6f + 0.1f;
                        final float f2 = this.random.nextFloat() * 0.6f + 0.1f;
                        final float f3 = this.random.nextFloat() * 0.6f + 0.1f;
                        while (itemstack.stackSize > 0) {
                            int j = this.random.nextInt(21) + 10;
                            if (j > itemstack.stackSize) {
                                j = itemstack.stackSize;
                            }
                            final ItemStack itemStack = itemstack;
                            itemStack.stackSize -= j;
                            final EntityItem entityitem = new EntityItem(world, (double)(x + f), (double)(y + f2), (double)(z + f3), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));
                            if (itemstack.hasTagCompound()) {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }
                            final float f4 = 0.025f;
                            entityitem.motionX = (float)this.random.nextGaussian() * f4;
                            entityitem.motionY = (float)this.random.nextGaussian() * f4 + 0.1f;
                            entityitem.motionZ = (float)this.random.nextGaussian() * f4;
                            world.spawnEntityInWorld((Entity)entityitem);
                        }
                    }
                }
                world.func_147453_f(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, meta);
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final World p_149734_1_, final int p_149734_2_, final int p_149734_3_, final int p_149734_4_, final Random p_149734_5_) {
        if (this.isBurning2) {
            final int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
            final float f = p_149734_2_ + 0.5f;
            final float f2 = p_149734_3_ + 0.0f + p_149734_5_.nextFloat() * 6.0f / 16.0f;
            final float f3 = p_149734_4_ + 0.5f;
            final float f4 = 0.52f;
            final float f5 = p_149734_5_.nextFloat() * 0.6f - 0.3f;
            if (l == 4) {
                p_149734_1_.spawnParticle("smoke", (double)(f - f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
                p_149734_1_.spawnParticle("flame", (double)(f - f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
            }
            else if (l == 5) {
                p_149734_1_.spawnParticle("smoke", (double)(f + f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
                p_149734_1_.spawnParticle("flame", (double)(f + f4), (double)f2, (double)(f3 + f5), 0.0, 0.0, 0.0);
            }
            else if (l == 2) {
                p_149734_1_.spawnParticle("smoke", (double)(f + f5), (double)f2, (double)(f3 - f4), 0.0, 0.0, 0.0);
                p_149734_1_.spawnParticle("flame", (double)(f + f5), (double)f2, (double)(f3 - f4), 0.0, 0.0, 0.0);
            }
            else if (l == 3) {
                p_149734_1_.spawnParticle("smoke", (double)(f + f5), (double)f2, (double)(f3 + f4), 0.0, 0.0, 0.0);
                p_149734_1_.spawnParticle("flame", (double)(f + f5), (double)f2, (double)(f3 + f4), 0.0, 0.0, 0.0);
            }
        }
    }
}
