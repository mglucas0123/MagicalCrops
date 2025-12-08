package com.mark719.magicalcrops;

import net.minecraft.creativetab.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.item.*;
import com.mark719.magicalcrops.handlers.*;

public class tabMagical extends CreativeTabs
{
    public tabMagical(final int ID, final String name) {
        super(ID, name);
        this.setBackgroundImageName("magicalcrops.png");
        this.setNoTitle();
    }
    
    public boolean hasSearchBar() {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel() {
        return "Magical Crops";
    }
    
    public Item getTabIconItem() {
        return MItems.InfusionStoneMaster;
    }
}
