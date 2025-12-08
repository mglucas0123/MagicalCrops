package com.mark719.magicalcrops.handlers;

import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import com.mark719.magicalcrops.items.tools.*;

public class Tools
{
    public static Item.ToolMaterial AccioMaterial;
    public static Item.ToolMaterial CrucioMaterial;
    public static Item.ToolMaterial ImperioMaterial;
    public static Item.ToolMaterial ZivicioMaterial;
    public static Item AccioPickaxe;
    public static Item AccioSword;
    public static Item AccioAxe;
    public static Item AccioShovel;
    public static Item AccioHoe;
    public static Item CrucioPickaxe;
    public static Item CrucioSword;
    public static Item CrucioAxe;
    public static Item CrucioShovel;
    public static Item CrucioHoe;
    public static Item ImperioPickaxe;
    public static Item ImperioSword;
    public static Item ImperioAxe;
    public static Item ImperioShovel;
    public static Item ImperioHoe;
    public static Item ZivicioPickaxe;
    public static Item ZivicioSword;
    public static Item ZivicioAxe;
    public static Item ZivicioShovel;
    public static Item ZivicioHoe;
    
    static {
        Tools.AccioMaterial = EnumHelper.addToolMaterial("AccioMaterial", 3, 1900, 8.0f, 4.0f, 20);
        Tools.CrucioMaterial = EnumHelper.addToolMaterial("CrucioMaterial", 3, 2400, 9.0f, 6.0f, 25);
        Tools.ImperioMaterial = EnumHelper.addToolMaterial("ImperioMaterial", 4, 4000, 10.0f, 8.0f, 35);
        Tools.ZivicioMaterial = EnumHelper.addToolMaterial("ZivicioMaterial", 4, 8500, 15.0f, 10.0f, 50);
        Tools.AccioPickaxe = new AccioPickaxe(0, Tools.AccioMaterial).setUnlocalizedName("AccioPickaxe").setTextureName("magicalcrops:tools_accio_pickaxe");
        Tools.AccioSword = new AccioSword(0, Tools.AccioMaterial).setUnlocalizedName("AccioSword").setTextureName("magicalcrops:tools_accio_sword");
        Tools.AccioAxe = new AccioAxe(0, Tools.AccioMaterial).setUnlocalizedName("AccioAxe").setTextureName("magicalcrops:tools_accio_axe");
        Tools.AccioShovel = new AccioShovel(0, Tools.AccioMaterial).setUnlocalizedName("AccioShovel").setTextureName("magicalcrops:tools_accio_spade");
        Tools.AccioHoe = new AccioHoe(0, Tools.AccioMaterial).setUnlocalizedName("AccioHoe").setTextureName("magicalcrops:tools_accio_hoe");
        Tools.CrucioPickaxe = new CrucioPickaxe(0, Tools.CrucioMaterial).setUnlocalizedName("CrucioPickaxe").setTextureName("magicalcrops:tools_crucio_pickaxe");
        Tools.CrucioSword = new CrucioSword(0, Tools.CrucioMaterial).setUnlocalizedName("CrucioSword").setTextureName("magicalcrops:tools_crucio_sword");
        Tools.CrucioAxe = new CrucioAxe(0, Tools.CrucioMaterial).setUnlocalizedName("CrucioAxe").setTextureName("magicalcrops:tools_crucio_axe");
        Tools.CrucioShovel = new CrucioShovel(0, Tools.CrucioMaterial).setUnlocalizedName("CrucioShovel").setTextureName("magicalcrops:tools_crucio_spade");
        Tools.CrucioHoe = new CrucioHoe(0, Tools.CrucioMaterial).setUnlocalizedName("CrucioHoe").setTextureName("magicalcrops:tools_crucio_hoe");
        Tools.ImperioPickaxe = new ImperioPickaxe(0, Tools.ImperioMaterial).setUnlocalizedName("ImperioPickaxe").setTextureName("magicalcrops:tools_imperio_pickaxe");
        Tools.ImperioSword = new ImperioSword(0, Tools.ImperioMaterial).setUnlocalizedName("ImperioSword").setTextureName("magicalcrops:tools_imperio_sword");
        Tools.ImperioAxe = new ImperioAxe(0, Tools.ImperioMaterial).setUnlocalizedName("ImperioAxe").setTextureName("magicalcrops:tools_imperio_axe");
        Tools.ImperioShovel = new ImperioShovel(0, Tools.ImperioMaterial).setUnlocalizedName("ImperioShovel").setTextureName("magicalcrops:tools_imperio_spade");
        Tools.ImperioHoe = new ImperioHoe(0, Tools.ImperioMaterial).setUnlocalizedName("ImperioHoe").setTextureName("magicalcrops:tools_imperio_hoe");
        Tools.ZivicioPickaxe = new ZivicioPickaxe(0, Tools.ZivicioMaterial).setUnlocalizedName("ZivicioPickaxe").setTextureName("magicalcrops:tools_zivicio_pickaxe");
        Tools.ZivicioSword = new ZivicioSword(0, Tools.ZivicioMaterial).setUnlocalizedName("ZivicioSword").setTextureName("magicalcrops:tools_zivicio_sword");
        Tools.ZivicioAxe = new ZivicioAxe(0, Tools.ZivicioMaterial).setUnlocalizedName("ZivicioAxe").setTextureName("magicalcrops:tools_zivicio_axe");
        Tools.ZivicioShovel = new ZivicioShovel(0, Tools.ZivicioMaterial).setUnlocalizedName("ZivicioShovel").setTextureName("magicalcrops:tools_zivicio_spade");
        Tools.ZivicioHoe = new ZivicioHoe(0, Tools.ZivicioMaterial).setUnlocalizedName("ZivicioHoe").setTextureName("magicalcrops:tools_zivicio_hoe");
    }
}
