package com.mark719.magicalcrops.items.essence;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class CrucioEssence extends Item
{
    public CrucioEssence() {
        this.setMaxStackSize(64);
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setTextureName("magicalcrops:MagicEssence_Crucio");
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
    }
}
