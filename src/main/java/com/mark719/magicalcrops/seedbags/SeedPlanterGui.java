package com.mark719.magicalcrops.seedbags;

import net.minecraft.client.gui.inventory.*;
import net.minecraft.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.client.resources.*;
import org.lwjgl.opengl.*;

public class SeedPlanterGui extends GuiContainer
{
    private static final ResourceLocation background;
    private int rows;
    InventoryPlayer playerInventory;
    SeedInventory seedInventory;
    
    public SeedPlanterGui(final InventoryPlayer playerInv, final SeedInventory itemInv) {
        super((Container)new SeedContainer(playerInv, itemInv));
        this.playerInventory = playerInv;
        this.seedInventory = itemInv;
        final int i = 222;
        final int j = i - 108;
        this.rows = itemInv.getSizeInventory() / 9;
        this.ySize = j + this.rows * 18;
    }
    
    protected void drawGuiContainerForegroundLayer(final int par1, final int par2) {
        this.fontRendererObj.drawString(this.seedInventory.hasCustomInventoryName() ? this.seedInventory.getInventoryName() : I18n.format(this.seedInventory.getInventoryName(), new Object[0]), 8, 6, 4210752);
        this.fontRendererObj.drawString(this.playerInventory.hasCustomInventoryName() ? this.playerInventory.getInventoryName() : I18n.format(this.playerInventory.getInventoryName(), new Object[0]), 8, this.ySize - 94, 4210752);
    }
    
    protected void drawGuiContainerBackgroundLayer(final float par1, final int par2, final int par3) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(SeedPlanterGui.background);
        final int i = (this.width - this.xSize) / 2;
        final int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.rows * 18 + 17);
        this.drawTexturedModalRect(i, j + this.rows * 18 + 17, 0, 126, this.xSize, 96);
    }
    
    static {
        background = new ResourceLocation("textures/gui/container/generic_54.png");
    }
}
