package com.mark719.magicalcrops.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import com.mark719.magicalcrops.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;
import java.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.*;

public class BlockWitherProofGlass extends BlockGlass
{
    public BlockWitherProofGlass() {
        super(Material.glass, false);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setHardness(2.0f);
        this.setResistance(2000.0f);
    }
    
    public boolean canEntityDestroy(final IBlockAccess world, final int x, final int y, final int z, final Entity entity) {
        return false;
    }
    
    public void onBlockExploded(final World world, final int x, final int y, final int z, final Explosion explosion) {
    }
    
    public boolean canDropFromExplosion(final Explosion p_149659_1_) {
        return false;
    }
    
    public int quantityDropped(final Random p_149745_1_) {
        return 1;
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 1;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon("magicalcrops:wither_glass");
    }
}
