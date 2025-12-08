package com.mark719.magicalcrops.help;

import net.minecraft.item.*;
import net.minecraftforge.oredict.*;

public class OreCheck
{
    public static ItemStack getModOre(final String oreName) {
        ItemStack modOre = null;
        if (OreDictionary.getOres(oreName).size() > 0) {
            modOre = OreDictionary.getOres(oreName).get(0);
        }
        if (modOre != null) {
            return modOre;
        }
        return null;
    }
}
