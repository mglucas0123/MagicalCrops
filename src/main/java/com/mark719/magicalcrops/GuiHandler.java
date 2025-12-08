package com.mark719.magicalcrops;

import cpw.mods.fml.common.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.tileentity.*;
import net.minecraft.item.*;
import com.mark719.magicalcrops.seedbags.*;
import com.mark719.magicalcrops.furnace.*;

public class GuiHandler implements IGuiHandler
{
    public GuiHandler() {
        NetworkRegistry.INSTANCE.registerGuiHandler((Object)MagicalCrops.instance, (IGuiHandler)this);
    }
    
    public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        if (ID == 0) {
            final TileEntity tileEntity = world.getTileEntity(x, y, z);
            if (player == null || player.getCurrentEquippedItem() == null || player.getCurrentEquippedItem().getItem() == null) {
                return null;
            }
            final Item currentItem = player.getCurrentEquippedItem().getItem();
            if (!(currentItem instanceof Planter)) {
                return null;
            }
            if (currentItem instanceof ItemSeedBagAccio || currentItem instanceof ItemSeedBagCrucio || currentItem instanceof ItemSeedBagImperio || currentItem instanceof ItemSeedBagZivicio) {
                return new SeedContainer(player.inventory, new SeedInventory(player.getHeldItem()));
            }
        }
        if (ID == 1) {
            final TileEntityAccioFurnace tileEntityAccioFurnace = (TileEntityAccioFurnace)world.getTileEntity(x, y, z);
            return new ContainerAccioFurnace(player.inventory, tileEntityAccioFurnace);
        }
        if (ID == 2) {
            final TileEntityCrucioFurnace tileEntityCrucioFurnace = (TileEntityCrucioFurnace)world.getTileEntity(x, y, z);
            return new ContainerCrucioFurnace(player.inventory, tileEntityCrucioFurnace);
        }
        if (ID == 3) {
            final TileEntityImperioFurnace tileEntityImperioFurnace = (TileEntityImperioFurnace)world.getTileEntity(x, y, z);
            return new ContainerImperioFurnace(player.inventory, tileEntityImperioFurnace);
        }
        if (ID == 4) {
            final TileEntityZivicioFurnace tileEntityZivicioFurnace = (TileEntityZivicioFurnace)world.getTileEntity(x, y, z);
            return new ContainerZivicioFurnace(player.inventory, tileEntityZivicioFurnace);
        }
        if (ID == 5) {
            final TileEntityUltimateFurnace tileEntityUltimateFurnace = (TileEntityUltimateFurnace)world.getTileEntity(x, y, z);
            return new ContainerUltimateFurnace(player.inventory, tileEntityUltimateFurnace);
        }
        return null;
    }
    
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        if (ID == 0) {
            final TileEntity tileEntity = world.getTileEntity(x, y, z);
            if (player == null || player.getCurrentEquippedItem() == null || player.getCurrentEquippedItem().getItem() == null) {
                return null;
            }
            final Item currentItem = player.getCurrentEquippedItem().getItem();
            if (!(currentItem instanceof Planter)) {
                return null;
            }
            if (currentItem instanceof ItemSeedBagAccio || currentItem instanceof ItemSeedBagCrucio || currentItem instanceof ItemSeedBagImperio || currentItem instanceof ItemSeedBagZivicio) {
                return new SeedPlanterGui(player.inventory, new SeedInventory(player.getHeldItem()));
            }
        }
        if (ID == 1) {
            final TileEntityAccioFurnace tileEntityAccioFurnace = (TileEntityAccioFurnace)world.getTileEntity(x, y, z);
            return new GuiAccioFurnace(player.inventory, tileEntityAccioFurnace);
        }
        if (ID == 2) {
            final TileEntityCrucioFurnace tileEntityCrucioFurnace = (TileEntityCrucioFurnace)world.getTileEntity(x, y, z);
            return new GuiCrucioFurnace(player.inventory, tileEntityCrucioFurnace);
        }
        if (ID == 3) {
            final TileEntityImperioFurnace tileEntityImperioFurnace = (TileEntityImperioFurnace)world.getTileEntity(x, y, z);
            return new GuiImperioFurnace(player.inventory, tileEntityImperioFurnace);
        }
        if (ID == 4) {
            final TileEntityZivicioFurnace tileEntityZivicioFurnace = (TileEntityZivicioFurnace)world.getTileEntity(x, y, z);
            return new GuiZivicioFurnace(player.inventory, tileEntityZivicioFurnace);
        }
        if (ID == 5) {
            final TileEntityUltimateFurnace tileEntityUltimateFurnace = (TileEntityUltimateFurnace)world.getTileEntity(x, y, z);
            return new GuiUltimateFurnace(player.inventory, tileEntityUltimateFurnace);
        }
        return null;
    }
}
