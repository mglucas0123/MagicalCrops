package com.mark719.magicalcrops.items.essence;

import net.minecraft.item.*;
import com.mark719.magicalcrops.*;

public class WaterEssence extends Item
{
    public WaterEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:cropessence_water");
    }
}
