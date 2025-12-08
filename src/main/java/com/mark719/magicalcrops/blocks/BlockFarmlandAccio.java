package com.mark719.magicalcrops.blocks;

import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import java.util.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.block.*;
import net.minecraft.entity.*;
import net.minecraftforge.common.*;
import net.minecraftforge.common.util.*;
import net.minecraft.world.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;

public class BlockFarmlandAccio extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon field_149824_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_149823_b;
    private static final String __OBFID = "CL_00000241";
    
    public BlockFarmlandAccio() {
        super(Material.ground);
        this.setTickRandomly(true);
        this.setBlockTextureName("magicalcrops:farmland_");
        this.setBlockName("AccioFarmland");
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.setLightOpacity(255);
        this.setHardness(0.6f);
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World p_149668_1_, final int p_149668_2_, final int p_149668_3_, final int p_149668_4_) {
        return AxisAlignedBB.getBoundingBox((double)(p_149668_2_ + 0), (double)(p_149668_3_ + 0), (double)(p_149668_4_ + 0), (double)(p_149668_2_ + 1), (double)(p_149668_3_ + 1), (double)(p_149668_4_ + 1));
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int p_149691_1_, final int p_149691_2_) {
        return (p_149691_1_ == 1) ? ((p_149691_2_ > 0) ? this.field_149824_a : this.field_149823_b) : Blocks.dirt.getBlockTextureFromSide(p_149691_1_);
    }
    
    public void updateTick(final World world, final int x, final int y, final int z, final Random random) {
        if (!this.func_149821_m(world, x, y, z) && !world.canLightningStrikeAt(x, y + 1, z)) {
            final int l = world.getBlockMetadata(x, y, z);
            if (l > 0) {
                world.setBlockMetadataWithNotify(x, y, z, l - 1, 2);
            }
        }
        else {
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
        }
        final boolean cropCheck1 = world.getBlock(x + 1, y + 1, z) == MCrops.MinicioCrop && world.getBlock(x - 1, y + 1, z) == MCrops.MinicioCrop;
        final boolean cropCheck2 = world.getBlock(x, y + 1, z + 1) == MCrops.MinicioCrop && world.getBlock(x, y + 1, z - 1) == MCrops.MinicioCrop;
        final boolean cropCheckFinal = cropCheck1 && cropCheck2;
        final int rand = random.nextInt(99);
        if (cropCheckFinal && rand <= 4 && rand >= 0) {
            if (world.getBlock(x, y + 1, z) == Blocks.coal_block) {
                world.setBlock(x, y + 1, z, MCrops.CoalCrop, 0, 2);
            }
            if (world.getBlock(x, y + 1, z) instanceof BlockFlower) {
                world.setBlock(x, y + 1, z, MCrops.DyeCrop, 0, 2);
            }
            world.setBlock(x, y, z, Blocks.farmland, 0, 2);
            world.setBlock(x + 1, y + 1, z, Blocks.air, 0, 2);
            world.setBlock(x - 1, y + 1, z, Blocks.air, 0, 2);
            world.setBlock(x, y + 1, z + 1, Blocks.air, 0, 2);
            world.setBlock(x, y + 1, z - 1, Blocks.air, 0, 2);
        }
    }
    
    public void onFallenUpon(final World p_149746_1_, final int p_149746_2_, final int p_149746_3_, final int p_149746_4_, final Entity p_149746_5_, final float p_149746_6_) {
    }
    
    private boolean func_149822_e(final World p_149822_1_, final int p_149822_2_, final int p_149822_3_, final int p_149822_4_) {
        final byte b0 = 0;
        for (int l = p_149822_2_ - b0; l <= p_149822_2_ + b0; ++l) {
            for (int i1 = p_149822_4_ - b0; i1 <= p_149822_4_ + b0; ++i1) {
                final Block block = p_149822_1_.getBlock(l, p_149822_3_ + 1, i1);
                if (block instanceof IPlantable && this.canSustainPlant((IBlockAccess)p_149822_1_, p_149822_2_, p_149822_3_, p_149822_4_, ForgeDirection.UP, (IPlantable)block)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean func_149821_m(final World p_149821_1_, final int p_149821_2_, final int p_149821_3_, final int p_149821_4_) {
        for (int l = p_149821_2_ - 4; l <= p_149821_2_ + 4; ++l) {
            for (int i1 = p_149821_3_; i1 <= p_149821_3_ + 1; ++i1) {
                for (int j1 = p_149821_4_ - 4; j1 <= p_149821_4_ + 4; ++j1) {
                    if (p_149821_1_.getBlock(l, i1, j1).getMaterial() == Material.water) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean canSustainPlant(final IBlockAccess world, final int x, final int y, final int z, final ForgeDirection direction, final IPlantable plantable) {
        return true;
    }
    
    public void onNeighborBlockChange(final World p_149695_1_, final int p_149695_2_, final int p_149695_3_, final int p_149695_4_, final Block p_149695_5_) {
    }
    
    public Item getItemDropped(final int p_149650_1_, final Random p_149650_2_, final int p_149650_3_) {
        return Blocks.dirt.getItemDropped(0, p_149650_2_, p_149650_3_);
    }
    
    @SideOnly(Side.CLIENT)
    public Item getItem(final World p_149694_1_, final int p_149694_2_, final int p_149694_3_, final int p_149694_4_) {
        return Item.getItemFromBlock(Blocks.dirt);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister p_149651_1_) {
        this.field_149824_a = p_149651_1_.registerIcon(this.getTextureName() + "wet_accio");
        this.field_149823_b = p_149651_1_.registerIcon(this.getTextureName() + "dry_accio");
    }
}
