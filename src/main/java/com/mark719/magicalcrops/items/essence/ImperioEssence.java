package com.mark719.magicalcrops.items.essence;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class ImperioEssence extends Item
{
    public ImperioEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:MagicEssence_Imperio");
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
    }
}
