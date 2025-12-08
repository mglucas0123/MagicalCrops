package com.mark719.magicalcrops.blocks;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.*;
import com.mark719.magicalcrops.config.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraftforge.common.util.*;
import net.minecraft.world.*;
import net.minecraftforge.common.*;
import net.minecraft.block.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraft.item.*;

public class BlockMagicalCrops extends BlockBush implements IGrowable
{
    @SideOnly(Side.CLIENT)
    private IIcon[] field_149867_a;
    private static final String __OBFID = "CL_00000222";
    
    public BlockMagicalCrops() {
        this.setTickRandomly(true);
        final float f = 0.5f;
        this.setBlockBounds(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 0.25f, 0.5f + f);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0f);
        this.setStepSound(BlockMagicalCrops.soundTypeGrass);
        this.disableStats();
    }
    
    public void onEntityCollidedWithBlock(final World world, final int x, final int y, final int z, final Entity entity) {
        if (ConfigMain.CROP_DAMAGE) {
            if (entity instanceof EntityLiving || entity instanceof EntityPlayer) {
                final int meta = world.getBlockMetadata(x, y, z);
                if (meta == 7) {
                    entity.attackEntityFrom(DamageSource.magic, 1.0f);
                }
                else if (meta < 7) {
                    entity.attackEntityFrom(DamageSource.magic, 0.5f);
                }
            }
        }
    }
    
    public boolean canBlockStay(final World world, final int x, final int y, final int z) {
        return world.getBlock(x, y - 1, z).canSustainPlant((IBlockAccess)world, x, y - 1, z, ForgeDirection.UP, (IPlantable)this);
    }
    
    public boolean canPlaceBlockOn(final Block p_149854_1_) {
        return p_149854_1_ == Blocks.farmland;
    }
    
    public void updateTick(final World world, final int x, final int y, final int z, final Random random) {
        super.updateTick(world, x, y, z, random);
        if (world.getBlockLightValue(x, y + 1, z) >= 9) {
            int meta = world.getBlockMetadata(x, y, z);
            if (meta < 7) {
                final float f = this.func_149864_n(world, x, y, z);
                if (random.nextInt((int)(25.0f / f) + 1) == 0) {
                    ++meta;
                    world.setBlockMetadataWithNotify(x, y, z, meta, 2);
                }
            }
        }
    }
    
    public void func_149863_m(final World world, final int x, final int y, final int z) {
        int l = world.getBlockMetadata(x, y, z) + MathHelper.getRandomIntegerInRange(world.rand, 2, 5);
        if (l > 7) {
            l = 7;
        }
        world.setBlockMetadataWithNotify(x, y, z, 1, 2);
    }
    
    public float func_149864_n(final World world, final int x, final int y, final int z) {
        float f = 0.1f;
        final Block block = world.getBlock(x, y, z - 1);
        final Block block2 = world.getBlock(x, y, z + 1);
        final Block block3 = world.getBlock(x - 1, y, z);
        final Block block4 = world.getBlock(x + 1, y, z);
        final Block block5 = world.getBlock(x - 1, y, z - 1);
        final Block block6 = world.getBlock(x + 1, y, z - 1);
        final Block block7 = world.getBlock(x + 1, y, z + 1);
        final Block block8 = world.getBlock(x - 1, y, z + 1);
        final boolean flag = block3 == this || block4 == this;
        final boolean flag2 = block == this || block2 == this;
        final boolean flag3 = block5 == this || block6 == this || block7 == this || block8 == this;
        for (int l = x - 1; l <= x + 1; ++l) {
            for (int i1 = z - 1; i1 <= z + 1; ++i1) {
                float f2 = 0.0f;
                if (world.getBlock(l, y - 1, i1).canSustainPlant((IBlockAccess)world, l, y - 1, i1, ForgeDirection.UP, (IPlantable)this)) {
                    f2 = 1.0f;
                    if (world.getBlock(l, y - 1, i1).isFertile(world, l, y - 1, i1)) {
                        f2 = 3.0f;
                    }
                }
                if (l != x || i1 != z) {
                    f2 /= 4.0f;
                }
                f += f2;
            }
        }
        if (flag3 || (flag && flag2)) {
            f /= 2.0f;
        }
        return f;
    }
    
    protected Item func_149866_i() {
        return Items.wheat_seeds;
    }
    
    protected Item func_149865_P() {
        return Items.wheat;
    }
    
    public Item getItemDropped(final int meta, final Random random, final int p_149650_3_) {
        return (meta == 7) ? this.func_149865_P() : this.func_149866_i();
    }
    
    public int quantityDropped(final Random random) {
        return 1;
    }
    
    @SideOnly(Side.CLIENT)
    public Item getItem(final World world, final int x, final int y, final int z) {
        return this.func_149866_i();
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int p_149691_1_, int meta) {
        if (meta < 0 || meta > 7) {
            meta = 7;
        }
        return this.field_149867_a[meta];
    }
    
    public int getRenderType() {
        return 1;
    }
    
    public boolean func_149851_a(final World world, final int x, final int y, final int z, final boolean p_149851_5_) {
        return world.getBlockMetadata(x, y, z) != 7;
    }
    
    public boolean func_149852_a(final World world, final Random random, final int x, final int y, final int z) {
        return true;
    }
    
    public void func_149853_b(final World world, final Random random, final int x, final int y, final int z) {
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final World world, final int x, final int y, final int z, final Random random) {
        super.randomDisplayTick(world, x, y, z, random);
        final int meta = world.getBlockMetadata(x, y, z);
        if (ConfigMain.CROP_EFFECTS) {
            if (random.nextInt(5) == 0 && meta >= 7) {
                world.spawnParticle("instantSpell", (double)(x + random.nextFloat()), (double)(y + 0.6f), (double)(z + random.nextFloat()), 0.0, 0.0, 0.0);
            }
            else if (random.nextInt(5) == 0 && meta <= 6) {
                world.spawnParticle("enchantmenttable", (double)(x + random.nextFloat()), (double)(y + 0.9f), (double)(z + random.nextFloat()), 0.0, 0.0, 0.0);
            }
        }
    }
    
    public ArrayList<ItemStack> getDrops(final World world, final int x, final int y, final int z, final int metadata, final int fortune) {
        final ArrayList<ItemStack> ret = (ArrayList<ItemStack>)super.getDrops(world, x, y, z, metadata, fortune);
        if (metadata >= 7 && !ConfigMain.PLANT_ON_BREAK) {
            for (int i = 0; i < 1 + fortune; ++i) {
                if (world.rand.nextInt(7) <= metadata) {
                    ret.add(new ItemStack(this.func_149866_i(), 1, 0));
                }
            }
        }
        if (metadata >= 7 && ConfigMain.SECOND_SEED_CHANCE > 0) {
            for (int i = 0; i < 1 + fortune; ++i) {
                if (world.rand.nextInt(100) <= Math.max(1, ConfigMain.SECOND_SEED_CHANCE)) {
                    ret.add(new ItemStack(this.func_149866_i(), 1, 0));
                }
            }
        }
        return ret;
    }
}
