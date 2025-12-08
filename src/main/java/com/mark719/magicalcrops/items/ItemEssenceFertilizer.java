package com.mark719.magicalcrops.items;

import cpw.mods.fml.relauncher.*;
import com.mark719.magicalcrops.*;
import net.minecraft.util.*;
import net.minecraft.creativetab.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.init.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.client.renderer.texture.*;

public class ItemEssenceFertilizer extends Item
{
    public static final String[] field_150923_a;
    public static final String[] field_150921_b;
    @SideOnly(Side.CLIENT)
    private IIcon[] field_150920_d;
    private static final String __OBFID = "CL_00000022";
    
    public ItemEssenceFertilizer() {
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
        return super.getUnlocalizedName() + "." + ItemEssenceFertilizer.field_150923_a[i];
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(final Item p_150895_1_, final CreativeTabs p_150895_2_, final List p_150895_3_) {
        for (int i = 0; i < 4; ++i) {
            p_150895_3_.add(new ItemStack(p_150895_1_, 1, i));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(final ItemStack par2) {
        switch (par2.getItemDamage()) {
            case 0: {
                return EnumRarity.common;
            }
            case 1: {
                return EnumRarity.uncommon;
            }
            case 2: {
                return EnumRarity.rare;
            }
            case 3: {
                return EnumRarity.epic;
            }
            default: {
                return EnumRarity.rare;
            }
        }
    }
    
    public boolean onItemUse(final ItemStack p_77648_1_, final EntityPlayer p_77648_2_, final World p_77648_3_, final int p_77648_4_, final int p_77648_5_, final int p_77648_6_, final int p_77648_7_, final float p_77648_8_, final float p_77648_9_, final float p_77648_10_) {
        switch (p_77648_1_.getItemDamage()) {
            case 0: {
                if (p_77648_7_ != 1) {
                    return false;
                }
                if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) || p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) != Blocks.farmland) {
                    return false;
                }
                if (!p_77648_3_.isRemote) {
                    p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandAccio, 0, 1);
                    --p_77648_1_.stackSize;
                    return true;
                }
            }
            case 1: {
                if (p_77648_7_ != 1) {
                    return false;
                }
                if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) || p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) != Blocks.farmland) {
                    return false;
                }
                if (!p_77648_3_.isRemote) {
                    p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandCrucio, 0, 1);
                    --p_77648_1_.stackSize;
                    return true;
                }
            }
            case 2: {
                if (p_77648_7_ != 1) {
                    return false;
                }
                if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) || p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) != Blocks.farmland) {
                    return false;
                }
                if (!p_77648_3_.isRemote) {
                    p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandImperio, 0, 1);
                    --p_77648_1_.stackSize;
                    return true;
                }
            }
            case 3: {
                if (p_77648_7_ != 1) {
                    return false;
                }
                if (!p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) || p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) != Blocks.farmland) {
                    return false;
                }
                if (!p_77648_3_.isRemote) {
                    p_77648_3_.setBlock(p_77648_4_, p_77648_5_, p_77648_6_, MBlocks.FarmlandZivicio, 0, 1);
                    --p_77648_1_.stackSize;
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister par1IconRegister) {
        this.field_150920_d = new IIcon[ItemEssenceFertilizer.field_150921_b.length];
        for (int i = 0; i < ItemEssenceFertilizer.field_150921_b.length; ++i) {
            this.field_150920_d[i] = par1IconRegister.registerIcon("magicalcrops:" + ItemEssenceFertilizer.field_150921_b[i]);
        }
    }
    
    static {
        field_150923_a = new String[] { "accio", "crucio", "imperio", "zivicio" };
        field_150921_b = new String[] { "fertilizer_accio", "fertilizer_crucio", "fertilizer_imperio", "fertilizer_zivicio" };
    }
}
