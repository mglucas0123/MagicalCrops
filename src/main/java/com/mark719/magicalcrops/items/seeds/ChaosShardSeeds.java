package com.mark719.magicalcrops.items.seeds;

import net.minecraft.block.*;
import com.mark719.magicalcrops.*;
import net.minecraft.item.*;

public class ChaosShardSeeds extends ItemSeeds
{
    public ChaosShardSeeds(final Block crop, final Block farmland) {
        super(crop, farmland);
        this.maxStackSize = 64;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

}
