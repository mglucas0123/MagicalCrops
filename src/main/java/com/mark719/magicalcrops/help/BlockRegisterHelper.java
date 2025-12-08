package com.mark719.magicalcrops.help;

import net.minecraft.block.*;
import cpw.mods.fml.common.registry.*;

public class BlockRegisterHelper
{
    public static void registerBlock(final Block block) {
        GameRegistry.registerBlock(block, "magicalcrops_" + block.getUnlocalizedName().substring(5));
    }
}
