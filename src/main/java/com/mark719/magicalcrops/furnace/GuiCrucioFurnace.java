package com.mark719.magicalcrops.furnace;

import net.minecraft.client.gui.inventory.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.client.resources.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

@SideOnly(Side.CLIENT)
public class GuiCrucioFurnace extends GuiContainer
{
    private static final ResourceLocation texture;
    private TileEntityCrucioFurnace tileFurnace;
    
    public GuiCrucioFurnace(final InventoryPlayer invPlayer, final TileEntityCrucioFurnace tile) {
        super((Container)new ContainerCrucioFurnace(invPlayer, tile));
        this.tileFurnace = tile;
    }
    
    protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
        final String string = this.tileFurnace.hasCustomInventoryName() ? this.tileFurnace.getInventoryName() : I18n.format(this.tileFurnace.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(string, 138 - this.fontRendererObj.getStringWidth(string), 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 94, 4210752);
    }
    
    protected void drawGuiContainerBackgroundLayer(final float var1, final int var2, final int var3) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().renderEngine.bindTexture(GuiCrucioFurnace.texture);
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        if (this.tileFurnace.isBurning()) {
            final int i1 = this.tileFurnace.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }
        final int i1 = this.tileFurnace.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
    
    static {
        texture = new ResourceLocation("magicalcrops".toLowerCase(), "textures/gui/crucio_furnace_gui.png");
    }
}
