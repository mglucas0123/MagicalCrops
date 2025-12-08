package com.mark719.magicalcrops.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import com.mark719.magicalcrops.*;
import net.minecraft.entity.*;
import net.minecraft.world.*;

public class BlockWitherProof extends Block
{
    public BlockWitherProof() {
        super(Material.rock);
        this.setBlockTextureName("magicalcrops:wither_block");
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setStepSound(BlockWitherProof.soundTypePiston);
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
}
