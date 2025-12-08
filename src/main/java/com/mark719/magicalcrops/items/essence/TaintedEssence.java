package com.mark719.magicalcrops.items.essence;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class TaintedEssence extends Item
{
    public TaintedEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:tainted_essence");
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.DARK_GRAY + super.getItemStackDisplayName(stack);
    }
}
