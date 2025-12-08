package com.mark719.magicalcrops.items.armour;

import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import java.util.*;
import org.lwjgl.input.*;
import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.handlers.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.world.*;
import net.minecraft.potion.*;

public class ItemZivicioArmour extends ItemArmor
{
    public ItemZivicioArmour(final ItemArmor.ArmorMaterial material, final int armorType, final String name) {
        super(material, 0, armorType);
        this.setUnlocalizedName(name);
        this.setCreativeTab(MagicalCrops.tabMagical);
        if (armorType == 0) {
            this.setTextureName("magicalcrops:armour_zivicio_helmet");
        }
        else if (armorType == 1) {
            this.setTextureName("magicalcrops:armour_zivicio_chestplate");
        }
        else if (armorType == 2) {
            this.setTextureName("magicalcrops:armour_zivicio_leggings");
        }
        else if (armorType == 3) {
            this.setTextureName("magicalcrops:armour_zivicio_boots");
        }
    }
    
    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (this.armorType == 0 || this.armorType == 1 || this.armorType == 3) {
            return "magicalcrops:textures/armour/zivicio_armour_1.png";
        }
        if (this.armorType == 2) {
            return "magicalcrops:textures/armour/zivicio_armour_2.png";
        }
        return null;
    }
    
    public boolean getIsRepairable(final ItemStack par1ItemStack, final ItemStack par2ItemStack) {
        return par2ItemStack.isItemEqual(new ItemStack(Essence.ZivicioEssence)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        par3List.add(EnumChatFormatting.WHITE + "Hold " + EnumChatFormatting.YELLOW + "SHIFT" + EnumChatFormatting.WHITE + " for info:");
        if (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
            par3List.add(EnumChatFormatting.ITALIC + "- 96% Damage Reduction");
        }
        par3List.add(EnumChatFormatting.WHITE + "Durability: " + EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "" + (this.getMaxDamage() - this.getDamage(par1ItemStack)) + "/" + this.getMaxDamage());
        par3List.add(EnumChatFormatting.GREEN + "Gem Socket:");
        if (par1ItemStack.getItem() == Armour.ZivicioArmourHelmet || par1ItemStack.getItem() == Armour.ZivicioArmourChestplate || par1ItemStack.getItem() == Armour.ZivicioArmourLeggings || par1ItemStack.getItem() == Armour.ZivicioArmourBoots) {
            par3List.add(EnumChatFormatting.ITALIC + "- Empty");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourHelmetFeed) {
            par3List.add(EnumChatFormatting.ITALIC + "- Saturation");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourHelmetNight) {
            par3List.add(EnumChatFormatting.ITALIC + "- Night Vision");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourHelmetWater) {
            par3List.add(EnumChatFormatting.ITALIC + "- Water Breathing");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourChestplateFire) {
            par3List.add(EnumChatFormatting.ITALIC + "- Fire Protection");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourChestplateWither) {
            par3List.add(EnumChatFormatting.ITALIC + "- Wither Protection");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourChestplatePoison) {
            par3List.add(EnumChatFormatting.ITALIC + "- Poison Protection");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourLeggingsWeak) {
            par3List.add(EnumChatFormatting.ITALIC + "- Weakness Protection");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourLeggingsConfusion) {
            par3List.add(EnumChatFormatting.ITALIC + "- Confusion Protection");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourLeggingsBlind) {
            par3List.add(EnumChatFormatting.ITALIC + "- Blindness Protection");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourBootsSpeed) {
            par3List.add(EnumChatFormatting.ITALIC + "- Speed Increase");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourBootsStep) {
            par3List.add(EnumChatFormatting.ITALIC + "- Step Assist");
        }
        if (par1ItemStack.getItem() == Armour.ZivicioArmourBootsJump) {
            par3List.add(EnumChatFormatting.ITALIC + "- Jump Boost");
        }
    }
    
    public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
        final ItemStack getBoots = player.getCurrentArmor(0);
        final ItemStack getLegs = player.getCurrentArmor(1);
        final ItemStack getChest = player.getCurrentArmor(2);
        final ItemStack getHelm = player.getCurrentArmor(3);
        if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() == Armour.ZivicioArmourHelmetFeed && player.getFoodStats().getFoodLevel() <= 19 && player.getFoodStats().getFoodLevel() != 20) {
                player.getFoodStats().addStats(1, 1.0f);
            }
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() == Armour.ZivicioArmourHelmetWater && player.isInWater()) {
                player.setAir(300);
            }
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() == Armour.ZivicioArmourHelmetNight) {
                player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0, true));
            }
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() == Armour.ZivicioArmourChestplateWither && getHelm.getItem() instanceof ItemZivicioArmour && player.isPotionActive(Potion.wither.id)) {
                player.removePotionEffect(Potion.wither.id);
            }
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() == Armour.ZivicioArmourChestplatePoison && getHelm.getItem() instanceof ItemZivicioArmour && player.isPotionActive(Potion.poison.id)) {
                player.removePotionEffect(Potion.poison.id);
            }
            if (getBoots.getItem() == Armour.ZivicioArmourBootsSpeed && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour) {
                if (!player.isInWater() && !player.capabilities.isFlying) {
                    player.moveEntityWithHeading(player.moveStrafing * 0.4f, player.moveForward * 0.4f);
                }
                else if (!player.isInWater() && player.isAirBorne) {
                    player.moveEntityWithHeading(player.moveStrafing * 0.1f, player.moveForward * 0.1f);
                }
            }
            if (getBoots.getItem() == Armour.ZivicioArmourBootsJump && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour) {
                if (player.isSneaking()) {
                    return;
                }
                player.addPotionEffect(new PotionEffect(Potion.jump.id, 15, 2, true));
            }
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() == Armour.ZivicioArmourLeggingsBlind && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour && player.isPotionActive(Potion.blindness.id)) {
                player.removePotionEffect(Potion.blindness.id);
            }
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() == Armour.ZivicioArmourLeggingsWeak && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour && player.isPotionActive(Potion.weakness.id)) {
                player.removePotionEffect(Potion.weakness.id);
            }
            if (getBoots.getItem() instanceof ItemZivicioArmour && getLegs.getItem() == Armour.ZivicioArmourLeggingsConfusion && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour && player.isPotionActive(Potion.confusion.id)) {
                player.removePotionEffect(Potion.confusion.id);
            }
        }
        if (getBoots != null && getLegs != null && getChest != null && getHelm != null) {
            if (getBoots.getItem() == Armour.ZivicioArmourBootsStep && getLegs.getItem() instanceof ItemZivicioArmour && getChest.getItem() instanceof ItemZivicioArmour && getHelm.getItem() instanceof ItemZivicioArmour) {
                player.stepHeight = 1.0f;
            }
        }
        else {
            player.stepHeight = 0.5f;
        }
    }
}
