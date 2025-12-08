package com.mark719.magicalcrops.items;

import cpw.mods.fml.relauncher.*;
import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.creativetab.*;
import java.util.*;
import net.minecraft.client.renderer.texture.*;

public class ItemsEssenceIngots extends Item
{
    public static final String[] field_150923_a;
    public static final String[] field_150921_b;
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150920_d;
    private static final String __OBFID = "CL_00000022";
    
    public ItemsEssenceIngots() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(MagicalCrops.tabMagical);
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        switch (stack.getItemDamage()) {
            case 0: {
                return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
            }
            case 1: {
                return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
            }
            case 2: {
                return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
            }
            case 3: {
                return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
            }
            default: {
                return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(final int par1) {
        final int j = MathHelper.clamp_int(par1, 0, 3);
        return this.field_150920_d[j];
    }
    
    public String getUnlocalizedName(final ItemStack par1ItemStack) {
        final int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 3);
        return super.getUnlocalizedName() + "." + ItemsEssenceIngots.field_150923_a[i];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(final Item p_150895_1_, final CreativeTabs p_150895_2_, final List p_150895_3_) {
        for (int i = 0; i < 4; ++i) {
            p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.field_150920_d = new IIcon[ItemsEssenceIngots.field_150921_b.length];
        for (int i = 0; i < ItemsEssenceIngots.field_150921_b.length; ++i) {
            this.field_150920_d[i] = par1IconRegister.registerIcon("magicalcrops:" + ItemsEssenceIngots.field_150921_b[i]);
        }
    }
    
    static {
        field_150923_a = new String[] { "accio", "crucio", "imperio", "zivicio" };
        field_150921_b = new String[] { "ingot_accio", "ingot_crucio", "ingot_imperio", "ingot_zivicio" };
    }
}
