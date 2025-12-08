package com.mark719.magicalcrops.items;

import cpw.mods.fml.relauncher.*;
import com.mark719.magicalcrops.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.creativetab.*;
import java.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.client.renderer.texture.*;

public class ItemExperienceBook extends Item
{
    public static final String[] field_150923_a;
    public static final String[] field_150921_b;
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150920_d;
    private static final String __OBFID = "CL_00000022";
    
    public ItemExperienceBook() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(MagicalCrops.tabMagical);
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        switch (stack.getItemDamage()) {
            case 1: {
                return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
            }
            case 2: {
                return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
            }
            case 3: {
                return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
            }
            case 4: {
                return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
            }
            default: {
                return EnumChatFormatting.WHITE + super.getItemStackDisplayName(stack);
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(final int par1) {
        final int j = MathHelper.clamp_int(par1, 0, 4);
        return this.field_150920_d[j];
    }
    
    public String getUnlocalizedName(final ItemStack par1ItemStack) {
        final int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 4);
        return super.getUnlocalizedName() + "." + ItemExperienceBook.field_150923_a[i];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(final Item p_150895_1_, final CreativeTabs p_150895_2_, final List p_150895_3_) {
        for (int i = 0; i < 5; ++i) {
            p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        switch (par1ItemStack.getItemDamage()) {
            case 0: {
                par3List.add("Level 1");
                break;
            }
            case 1: {
                par3List.add("Level 2");
                break;
            }
            case 2: {
                par3List.add("Level 3");
                break;
            }
            case 3: {
                par3List.add("Level 4");
                break;
            }
            case 4: {
                par3List.add("Level 5");
                break;
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.field_150920_d = new IIcon[ItemExperienceBook.field_150921_b.length];
        for (int i = 0; i < ItemExperienceBook.field_150921_b.length; ++i) {
            this.field_150920_d[i] = par1IconRegister.registerIcon("magicalcrops:" + ItemExperienceBook.field_150921_b[i]);
        }
    }
    
    static {
        field_150923_a = new String[] { "level1", "level2", "level3", "level4", "level5" };
        field_150921_b = new String[] { "experience_book", "experience_book_accio", "experience_book_crucio", "experience_book_imperio", "experience_book_zivicio" };
    }
}
