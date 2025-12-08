package com.mark719.magicalcrops.events;

import net.minecraftforge.event.world.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.eventhandler.*;

public class MinicioOreBreak
{
    @SubscribeEvent
    public void onOreBreak(final BlockEvent.HarvestDropsEvent event) {
        if (event.harvester != null && event.block == MBlocks.MinicioOre && event.harvester.getCurrentEquippedItem() != null) {
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.AccioPickaxe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 2));
            }
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.CrucioPickaxe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 4));
            }
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.ImperioPickaxe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 8));
            }
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.ZivicioPickaxe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 16));
            }
        }
    }
}
