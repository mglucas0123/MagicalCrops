package com.mark719.magicalcrops.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import com.mark719.magicalcrops.*;

public class BlockEssenceStone extends Block
{
    public BlockEssenceStone() {
        super(Material.rock);
        this.setBlockTextureName("magicalcrops:essence_stone");
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setStepSound(BlockEssenceStone.soundTypePiston);
        this.setHardness(3.0f);
        this.setResistance(5.0f);
    }
}
