package com.mark719.magicalcrops.items.essence;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class MinicioEssence extends Item
{
    public MinicioEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:MagicEssence_Minicio");
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
    }
}
