package com.mark719.magicalcrops.events;

import java.util.*;
import net.minecraftforge.event.entity.living.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.item.*;
import com.mark719.magicalcrops.config.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.boss.*;
import cpw.mods.fml.common.eventhandler.*;

public class MobDropEvent
{
    public static Random random;
    public static int dropped;
    
    @SubscribeEvent
    public void essenceMobDrops(final LivingDropsEvent event) {
        final double posX = event.entityLiving.posX;
        final double posY = event.entityLiving.posY;
        final double posZ = event.entityLiving.posZ;
        final ItemStack minicioEssence = new ItemStack(Essence.MinicioEssence, 1);
        final ItemStack dragonZivicioEssence = new ItemStack(Essence.ZivicioEssence, ConfigMain.DRGAON_ESS_DROP_AMOUNT);
        final ItemStack witherZivicioEssence = new ItemStack(Essence.ZivicioEssence, ConfigMain.WITHER_ESS_DROP_AMOUNT);
        MobDropEvent.random = new Random();
        MobDropEvent.dropped = MobDropEvent.random.nextInt(100);
        if (event.entityLiving instanceof EntityDragon & ConfigMain.DRAGON_ESS_DROP) {
            event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, dragonZivicioEssence));
        }
        if ((event.entityLiving instanceof EntityAnimal & ConfigMain.PASSIVE_ESS_DROP) && MobDropEvent.dropped < ConfigMain.PASSIVE_DROP_CHANCE) {
            event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, minicioEssence));
        }
        if ((event.entityLiving instanceof EntityMob & ConfigMain.HOSTILE_ESS_DROP) && MobDropEvent.dropped < ConfigMain.HOSTILE_DROP_CHANCE) {
            event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, minicioEssence));
        }
        if (event.entityLiving instanceof EntityWither & ConfigMain.WITHER_ESS_DROP) {
            event.drops.add(new EntityItem(event.entityLiving.worldObj, posX, posY, posZ, witherZivicioEssence));
        }
    }
}
