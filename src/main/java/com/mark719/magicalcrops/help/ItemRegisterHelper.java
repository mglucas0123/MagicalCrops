package com.mark719.magicalcrops.help;

import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;

public class ItemRegisterHelper
{
    public static void registerItem(final Item item) {
        GameRegistry.registerItem(item, "magicalcrops_" + item.getUnlocalizedName().substring(5));
    }
}
