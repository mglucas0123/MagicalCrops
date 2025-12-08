package com.mark719.magicalcrops.events;

import net.minecraftforge.event.entity.living.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import com.mark719.magicalcrops.items.armour.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.eventhandler.*;

public class FireProtectionEvent
{
    @SubscribeEvent
    public void onBurnDamage(final LivingAttackEvent event) {
        if (event.entity instanceof EntityPlayer) {
            final EntityPlayer player = (EntityPlayer)event.entity;
            final ItemStack getBoots = player.getCurrentArmor(0);
            final ItemStack getLegs = player.getCurrentArmor(1);
            final ItemStack getChest = player.getCurrentArmor(2);
            final ItemStack getHelm = player.getCurrentArmor(3);
            if ((event.source.equals(DamageSource.lava) || event.source.equals(DamageSource.inFire) || event.source.equals(DamageSource.onFire)) && getBoots != null && getLegs != null && getChest != null && getHelm != null) {
                if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() == Armour.ZivicioArmourChestplateFire && getHelm.getItem() instanceof ItemZivicioArmour) {
                    event.setCanceled(true);
                    player.extinguish();
                }
                else {
                    event.setCanceled(false);
                }
            }
        }
    }
}
