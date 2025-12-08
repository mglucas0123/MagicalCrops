package com.mark719.magicalcrops;

import java.io.*;
import net.minecraft.creativetab.*;
import com.mark719.magicalcrops.config.*;
import cpw.mods.fml.common.event.*;
import com.mark719.magicalcrops.handlers.*;
import com.mark719.magicalcrops.register.*;
import com.mark719.magicalcrops.recipes.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.*;
import com.mark719.magicalcrops.worldgen.*;
import net.minecraftforge.common.*;
import com.mark719.magicalcrops.events.*;

@Mod(modid = "magicalcrops", name = "Magical Crops Reforged", version = "1.0.0", dependencies = "after:appliedenergistics2;after:Mekanism")
public class MagicalCrops
{
    @Mod.Instance("magicalcrops")
    public static MagicalCrops instance;
    public static File CONFIG_DIR;
    @SidedProxy(clientSide = "com.mark719.magicalcrops.ClientProxy", serverSide = "com.mark719.magicalcrops.CommonProxy")
    public static CommonProxy serverProxy;
    public static CreativeTabs tabMagical;
    
    @Mod.EventHandler
    public static void preInit(final FMLPreInitializationEvent event) {
        MagicalCrops.CONFIG_DIR = new File(event.getModConfigurationDirectory(), "MagicalCrops");
        if (!MagicalCrops.CONFIG_DIR.exists()) {
            MagicalCrops.CONFIG_DIR.mkdirs();
        }
        ConfigMain.init(new File(MagicalCrops.CONFIG_DIR, "MagicalCropsMain.cfg"));
        ConfigCrafting.init(new File(MagicalCrops.CONFIG_DIR, "Crafting.cfg"));
        ConfigDisable.init(new File(MagicalCrops.CONFIG_DIR, "CropDisableConfig.cfg"));
        MagicalCrops.serverProxy.registerTileEntities();
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
        ItemRegister.registerItem();
        BlockRegister.registerBlock();
        ModCompat.loadCompat();
        OreDictionaryRegister.oreRegister();
        ItemRecipes.loadRecipes();
        BlockRecipes.loadRecipes();
        SeedRecipes.loadRecipes();
        ResourceRecipes.loadRecipes();
        if (ConfigMain.ENCHANT_CRAFT) {
            EnchantmentRecipes.loadRecipes();
        }
        GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssence(), 0);
        GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssenceNether(), 0);
        GameRegistry.registerWorldGenerator((IWorldGenerator)new WorldGenEssenceEnd(), 0);
        if (ConfigMain.PLANT_ON_BREAK) {
            MinecraftForge.EVENT_BUS.register((Object)new CropPlantOnBreak());
        }
        if (ConfigMain.EXTRA_PICKAXE) {
            MinecraftForge.EVENT_BUS.register((Object)new MinicioOreBreak());
        }
        if (ConfigMain.EXTRA_HOE) {
            MinecraftForge.EVENT_BUS.register((Object)new MinicioCropBreak());
        }
        if (ConfigMain.MOB_ESS_DROP) {
            MinecraftForge.EVENT_BUS.register((Object)new MobDropEvent());
        }
        MinecraftForge.EVENT_BUS.register((Object)new FireProtectionEvent());
        MagicalCrops.serverProxy.registerNetworkStuff();
    }
    
    static {
        MagicalCrops.tabMagical = new tabMagical(CreativeTabs.getNextID(), "magicalcrops");
    }
}
