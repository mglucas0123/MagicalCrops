package com.mark719.magicalcrops;

import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import com.mark719.magicalcrops.furnace.*;

public class CommonProxy
{
    public static void renderStuff() {
    }
    
    public void registerNetworkStuff() {
        NetworkRegistry.INSTANCE.registerGuiHandler((Object)MagicalCrops.instance, (IGuiHandler)new GuiHandler());
    }
    
    public void registerTileEntities() {
        GameRegistry.registerTileEntity((Class)TileEntityAccioFurnace.class, "TileEntityAccioFurnace");
        GameRegistry.registerTileEntity((Class)TileEntityCrucioFurnace.class, "TileEntityCrucioFurnace");
        GameRegistry.registerTileEntity((Class)TileEntityImperioFurnace.class, "TileEntityImperioFurnace");
        GameRegistry.registerTileEntity((Class)TileEntityZivicioFurnace.class, "TileEntityZivicioFurnace");
        GameRegistry.registerTileEntity((Class)TileEntityUltimateFurnace.class, "TileEntityUltimateFurnace");
    }
}
