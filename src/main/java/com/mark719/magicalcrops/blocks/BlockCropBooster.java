package com.mark719.magicalcrops.blocks;

import com.mark719.magicalcrops.help.*;
import net.minecraft.block.material.*;
import com.mark719.magicalcrops.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.block.*;
import net.minecraftforge.common.*;

public class BlockCropBooster extends Block
{
    private CropRandom prng;
    private StemRandom s_prng;
    
    public BlockCropBooster() {
        super(Material.ground);
        this.prng = new CropRandom();
        this.s_prng = new StemRandom();
        this.setTickRandomly(true);
        this.setHardness(1.0f);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setBlockTextureName("magicalcrops:booster_block");
    }
    
    public void updateTick(final World world, final int x, final int y, final int z, final Random prng) {
        final Block block_above = world.getBlock(x, y + 1, z);
        if (!world.blockExists(x, y + 1, z)) {
            return;
        }
        if (block_above instanceof BlockCropBooster) {
            block_above.updateTick(world, x, y + 1, z, prng);
            return;
        }
        if (!world.blockExists(x, y + 2, z)) {
            return;
        }
        final Block plant_block = world.getBlock(x, y + 2, z);
        if (plant_block instanceof BlockStem) {
            if (world.getBlockMetadata(x, y + 2, z) >= 7) {
                plant_block.updateTick(world, x, y + 2, z, (Random)this.s_prng);
            }
            else {
                plant_block.updateTick(world, x, y + 2, z, (Random)this.prng);
            }
        }
        else if (plant_block instanceof BlockReed || plant_block instanceof BlockCactus) {
            for (int l = 1; world.blockExists(x, y + 1 + l, z) && l < 3; ++l) {
                world.getBlock(x, y + 1 + l, z).updateTick(world, x, y + 1 + l, z, (Random)this.prng);
            }
        }
        else if (plant_block instanceof IPlantable || plant_block instanceof BlockMagicalCrops) {
            plant_block.updateTick(world, x, y + 2, z, (Random)this.prng);
        }
    }
}
