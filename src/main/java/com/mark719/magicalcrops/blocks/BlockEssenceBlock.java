package com.mark719.magicalcrops.blocks;

import net.minecraft.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import com.mark719.magicalcrops.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.creativetab.*;
import java.util.*;
import com.mark719.magicalcrops.handlers.*;
import net.minecraft.item.*;

public class BlockEssenceBlock extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon[] texture;
    public static String textureName;
    protected IIcon[] icon;
    
    public BlockEssenceBlock(final Material par3Material) {
        super(par3Material);
        this.icon = new IIcon[8];
        this.setCreativeTab(MagicalCrops.tabMagical);
        this.setHardness(2.0f);
        this.setResistance(10.0f);
        this.setLightLevel(1.0f);
    }
    
    public void registerBlockIcons(final IIconRegister par1IconRegister) {
        this.icon[0] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_coal");
        this.icon[1] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_earth");
        this.icon[2] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_emerald");
        this.icon[3] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_fire");
        this.icon[4] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_gold");
        this.icon[5] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_lapis");
        this.icon[6] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_obsidian");
        this.icon[7] = par1IconRegister.registerIcon(BlockEssenceBlock.textureName + "block_essence_block_redstone");
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
        for (int var4 = 0; var4 < 8; ++var4) {
            par3List.add(new ItemStack(MBlocks.EssenceBlock, 1, var4));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int side, final int meta) {
        return this.icon[meta];
    }
    
    public int damageDropped(final int meta) {
        return meta;
    }
    
    static {
        BlockEssenceBlock.textureName = "magicalcrops:";
    }
}
