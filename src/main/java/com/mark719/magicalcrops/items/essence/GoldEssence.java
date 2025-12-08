package com.mark719.magicalcrops.items.essence;

import net.minecraft.item.*;
import com.mark719.magicalcrops.*;

public class GoldEssence extends Item
{
    public GoldEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:cropessence_gold");
    }
}
