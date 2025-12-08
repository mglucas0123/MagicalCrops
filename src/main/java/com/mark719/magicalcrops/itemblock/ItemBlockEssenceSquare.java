package com.mark719.magicalcrops.itemblock;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class ItemBlockEssenceSquare extends ItemBlock
{
    private static final String[] SUBNAMES;
    
    public ItemBlockEssenceSquare(final Block block) {
        super(block);
        this.setHasSubtypes(true);
    }
    
    public String getUnlocalizedName(final ItemStack par1ItemStack) {
        final int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 7);
        return super.getUnlocalizedName() + "." + ItemBlockEssenceSquare.SUBNAMES[i];
    }
    
    public String getItemStackDisplayName(final ItemStack stack) {
        switch (stack.getItemDamage()) {
            case 0: {
                return EnumChatFormatting.DARK_GRAY + super.getItemStackDisplayName(stack);
            }
            case 1: {
                return EnumChatFormatting.WHITE + super.getItemStackDisplayName(stack);
            }
            case 2: {
                return EnumChatFormatting.GREEN + super.getItemStackDisplayName(stack);
            }
            case 3: {
                return EnumChatFormatting.GOLD + super.getItemStackDisplayName(stack);
            }
            case 4: {
                return EnumChatFormatting.YELLOW + super.getItemStackDisplayName(stack);
            }
            case 5: {
                return EnumChatFormatting.AQUA + super.getItemStackDisplayName(stack);
            }
            case 6: {
                return EnumChatFormatting.LIGHT_PURPLE + super.getItemStackDisplayName(stack);
            }
            case 7: {
                return EnumChatFormatting.RED + super.getItemStackDisplayName(stack);
            }
            default: {
                return EnumChatFormatting.GRAY + super.getItemStackDisplayName(stack);
            }
        }
    }
    
    public int getMetadata(final int meta) {
        return meta;
    }
    
    static {
        SUBNAMES = new String[] { "coal", "earth", "emerald", "fire", "gold", "lapis", "obsidian", "redstone" };
    }
}
