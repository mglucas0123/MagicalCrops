package com.mark719.magicalcrops.items.essence;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class ZivicioEssence extends Item
{
    public ZivicioEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:MagicEssence_Zivicio");
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
    }
}
