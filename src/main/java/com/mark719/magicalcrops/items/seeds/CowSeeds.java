package com.mark719.magicalcrops.items.seeds;

import net.minecraft.item.*;
import net.minecraft.block.*;
import com.mark719.magicalcrops.*;

public class CowSeeds extends ItemSeeds
{
    public CowSeeds(final Block crop, final Block farmland) {
        super(crop, farmland);
        this.maxStackSize = 64;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }
}
