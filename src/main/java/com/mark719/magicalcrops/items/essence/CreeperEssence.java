package com.mark719.magicalcrops.items.essence;

import net.minecraft.item.*;
import com.mark719.magicalcrops.*;

public class CreeperEssence extends Item
{
    public CreeperEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:cropessence_creeper");
    }
}
