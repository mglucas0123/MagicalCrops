package com.mark719.magicalcrops.handlers;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import com.mark719.magicalcrops.items.armour.*;

public class Armour
{
    public static ItemArmor.ArmorMaterial AccioArmour;
    public static ItemArmor.ArmorMaterial CrucioArmour;
    public static ItemArmor.ArmorMaterial ImperioArmour;
    public static ItemArmor.ArmorMaterial ZivicioArmour;
    public static Item AccioArmourHelmet;
    public static Item AccioArmourChestplate;
    public static Item AccioArmourLeggings;
    public static Item AccioArmourBoots;
    public static Item CrucioArmourHelmet;
    public static Item CrucioArmourChestplate;
    public static Item CrucioArmourLeggings;
    public static Item CrucioArmourBoots;
    public static Item ImperioArmourHelmet;
    public static Item ImperioArmourChestplate;
    public static Item ImperioArmourLeggings;
    public static Item ImperioArmourBoots;
    public static Item ZivicioArmourHelmet;
    public static Item ZivicioArmourChestplate;
    public static Item ZivicioArmourLeggings;
    public static Item ZivicioArmourBoots;
    public static Item ZivicioArmourHelmetFeed;
    public static Item ZivicioArmourHelmetNight;
    public static Item ZivicioArmourHelmetWater;
    public static Item ZivicioArmourChestplateFire;
    public static Item ZivicioArmourChestplateWither;
    public static Item ZivicioArmourChestplatePoison;
    public static Item ZivicioArmourLeggingsBlind;
    public static Item ZivicioArmourLeggingsWeak;
    public static Item ZivicioArmourLeggingsConfusion;
    public static Item ZivicioArmourBootsStep;
    public static Item ZivicioArmourBootsSpeed;
    public static Item ZivicioArmourBootsJump;
    
    static {
        Armour.AccioArmour = EnumHelper.addArmorMaterial("AccioArmour", 40, new int[] { 3, 8, 7, 3 }, 15);
        Armour.CrucioArmour = EnumHelper.addArmorMaterial("CrucioArmour", 80, new int[] { 4, 8, 7, 3 }, 20);
        Armour.ImperioArmour = EnumHelper.addArmorMaterial("ImperioArmour", 160, new int[] { 4, 8, 7, 4 }, 25);
        Armour.ZivicioArmour = EnumHelper.addArmorMaterial("ZivicioArmour", 320, new int[] { 4, 9, 8, 3 }, 30);
        Armour.AccioArmourHelmet = (Item)new ItemAccioArmour(Armour.AccioArmour, 0, "AccioArmourHelmet");
        Armour.AccioArmourChestplate = (Item)new ItemAccioArmour(Armour.AccioArmour, 1, "AccioArmourChestplate");
        Armour.AccioArmourLeggings = (Item)new ItemAccioArmour(Armour.AccioArmour, 2, "AccioArmourLeggings");
        Armour.AccioArmourBoots = (Item)new ItemAccioArmour(Armour.AccioArmour, 3, "AccioArmourBoots");
        Armour.CrucioArmourHelmet = (Item)new ItemCrucioArmour(Armour.CrucioArmour, 0, "CrucioArmourHelmet");
        Armour.CrucioArmourChestplate = (Item)new ItemCrucioArmour(Armour.CrucioArmour, 1, "CrucioArmourChestplate");
        Armour.CrucioArmourLeggings = (Item)new ItemCrucioArmour(Armour.CrucioArmour, 2, "CrucioArmourLeggings");
        Armour.CrucioArmourBoots = (Item)new ItemCrucioArmour(Armour.CrucioArmour, 3, "CrucioArmourBoots");
        Armour.ImperioArmourHelmet = (Item)new ItemImperioArmour(Armour.ImperioArmour, 0, "ImperioArmourHelmet");
        Armour.ImperioArmourChestplate = (Item)new ItemImperioArmour(Armour.ImperioArmour, 1, "ImperioArmourChestplate");
        Armour.ImperioArmourLeggings = (Item)new ItemImperioArmour(Armour.ImperioArmour, 2, "ImperioArmourLeggings");
        Armour.ImperioArmourBoots = (Item)new ItemImperioArmour(Armour.ImperioArmour, 3, "ImperioArmourBoots");
        Armour.ZivicioArmourHelmet = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 0, "ZivicioArmourHelmet");
        Armour.ZivicioArmourChestplate = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 1, "ZivicioArmourChestplate");
        Armour.ZivicioArmourLeggings = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 2, "ZivicioArmourLeggings");
        Armour.ZivicioArmourBoots = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 3, "ZivicioArmourBoots");
        Armour.ZivicioArmourHelmetFeed = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 0, "ZivicioArmourHelmetFeed");
        Armour.ZivicioArmourHelmetNight = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 0, "ZivicioArmourHelmetNight");
        Armour.ZivicioArmourHelmetWater = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 0, "ZivicioArmourHelmetWater");
        Armour.ZivicioArmourChestplateFire = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 1, "ZivicioArmourChestplateFire");
        Armour.ZivicioArmourChestplateWither = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 1, "ZivicioArmourChestplateWither");
        Armour.ZivicioArmourChestplatePoison = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 1, "ZivicioArmourChestplatePoison");
        Armour.ZivicioArmourLeggingsBlind = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 2, "ZivicioArmourLeggingsBlind");
        Armour.ZivicioArmourLeggingsWeak = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 2, "ZivicioArmourLeggingsWeak");
        Armour.ZivicioArmourLeggingsConfusion = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 2, "ZivicioArmourLeggingsConfusion");
        Armour.ZivicioArmourBootsStep = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 3, "ZivicioArmourBootsStep");
        Armour.ZivicioArmourBootsSpeed = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 3, "ZivicioArmourBootsSpeed");
        Armour.ZivicioArmourBootsJump = (Item)new ItemZivicioArmour(Armour.ZivicioArmour, 3, "ZivicioArmourBootsJump");
    }
}
