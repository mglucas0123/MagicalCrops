package com.mark719.magicalcrops.worldgen;

import cpw.mods.fml.common.*;
import java.util.*;
import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import com.mark719.magicalcrops.config.*;
import com.mark719.magicalcrops.handlers.*;

public class WorldGenEssenceNether implements IWorldGenerator
{
    public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1: {
                this.generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 0: {
                this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
            case 1: {
                this.generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
            }
        }
    }
    
    private void generateSurface(final World world, final Random random, final int i, final int j) {
    }
    
    private void generateEnd(final World world, final Random random, final int i, final int j) {
    }
    
    private void generateNether(final World world, final Random random, final int i, final int j) {
        if (ConfigMain.essOreNether) {
            for (int k = 0; k < 25; ++k) {
                final int chunkX = i + random.nextInt(16);
                final int chunkY = random.nextInt(256);
                final int chunkZ = j + random.nextInt(16);
                new WorldGenMineableNether(MBlocks.MinicioOreNether, ConfigMain.maxVeinSizeNether).generate(world, random, chunkX, chunkY, chunkZ);
            }
        }
    }
}
