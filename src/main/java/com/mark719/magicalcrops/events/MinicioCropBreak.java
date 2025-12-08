package com.mark719.magicalcrops.events;

import net.minecraftforge.event.world.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.eventhandler.*;

public class MinicioCropBreak
{
    @SubscribeEvent
    public void onCropBreak(final BlockEvent.HarvestDropsEvent event) {
        if (event.harvester != null && event.block == MCrops.MinicioCrop && event.blockMetadata == 7 && event.harvester.getCurrentEquippedItem() != null) {
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.AccioHoe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 1));
            }
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.CrucioHoe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 2));
            }
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.ImperioHoe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 4));
            }
            if (event.harvester.getCurrentEquippedItem().getItem() == Tools.ZivicioHoe) {
                event.drops.add(new ItemStack(Essence.MinicioEssence, 8));
            }
        }
    }
}
