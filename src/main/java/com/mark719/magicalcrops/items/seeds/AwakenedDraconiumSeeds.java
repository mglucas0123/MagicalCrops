package com.mark719.magicalcrops.items.seeds;

import net.minecraft.block.*;
import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import cpw.mods.fml.relauncher.*;

public class AwakenedDraconiumSeeds extends ItemSeeds
{
    public AwakenedDraconiumSeeds(final Block crop, final Block farmland) {
        super(crop, farmland);
        this.maxStackSize = 64;
        this.setCreativeTab(MagicalCrops.tabMagical);
    }

}
