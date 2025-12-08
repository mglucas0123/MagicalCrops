package com.mark719.magicalcrops.events;

import net.minecraftforge.event.world.*;
import net.minecraft.entity.player.*;
import com.mark719.magicalcrops.blocks.*;
import cpw.mods.fml.common.eventhandler.*;

public class CropPlantOnBreak
{
    @SubscribeEvent
    public void onCropPlantBreak(final BlockEvent.HarvestDropsEvent event) {
        if (event.harvester != null && event.harvester instanceof EntityPlayer && event.block instanceof BlockMagicalCrops && event.blockMetadata == 7) {
            event.world.setBlock(event.x, event.y, event.z, event.block, 1, 2);
        }
    }
}
