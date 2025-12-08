package com.mark719.magicalcrops.seedbags;

import java.util.concurrent.*;
import net.minecraft.world.*;
import net.minecraftforge.common.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.gameevent.*;
import cpw.mods.fml.common.eventhandler.*;
import net.minecraft.util.*;

public class VeinPlanterInstance
{
    private ConcurrentLinkedQueue<Point> plantQueue;
    private World world;
    private ForgeDirection direction;
    private boolean finished;
    private Planter usedPlanter;
    private SeedInventory inventory;
    private EntityPlayer player;
    private Point initialBlock;
    
    public VeinPlanterInstance(final EntityPlayer player, final IInventory inventory, final Planter usedPlanter, final World world, final int x, final int y, final int z, final ForgeDirection direction) {
        this.plantQueue = new ConcurrentLinkedQueue<Point>();
        this.world = world;
        this.direction = direction;
        this.finished = false;
        this.usedPlanter = usedPlanter;
        if (inventory instanceof SeedInventory) {
            this.inventory = (SeedInventory)inventory;
        }
        this.player = player;
        this.initialBlock = new Point(x, y, z);
        FMLCommonHandler.instance().bus().register((Object)this);
    }
    
    @SubscribeEvent
    public void ticker(final TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            this.plantScheduled();
        }
    }
    
    public synchronized void plantField(final int x, final int y, final int z) {
        if (this.world == null || this.usedPlanter == null || this.inventory == null || !(this.usedPlanter instanceof Planter)) {
            this.finished = true;
        }
        if (this.finished) {
            return;
        }
        final byte d = 1;
        for (int dx = -d; dx <= d; ++dx) {
            for (int dy = -d; dy <= d; ++dy) {
                for (int dz = -d; dz <= d; ++dz) {
                    if (dx != 0 || dz != 0) {
                        final Point blockPos = new Point(x + dx, y + dy, z + dz);
                        final int range = 75;
                        if (this.initialBlock.isWithinRange(blockPos, range) || range <= 0) {
                            if (this.player.getFoodStats().getFoodLevel() < 2) {
                                this.player.addChatComponentMessage((IChatComponent)new ChatComponentTranslation("PlanterHelper:TooHungry", new Object[0]));
                                this.finished = true;
                                return;
                            }
                            if (this.usedPlanter.canPlant((IInventory)this.inventory, this.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), this.direction)) {
                                final boolean success = this.usedPlanter.plantSeedInPlace((IInventory)this.inventory, this.world, blockPos.getX(), blockPos.getY(), blockPos.getZ(), this.direction);
                                if (success) {
                                    this.player.addExhaustion(0.02f);
                                    this.plantQueue.add(blockPos);
                                }
                                if (PlantingLogic.getSeedsSlot((IInventory)this.inventory, this.usedPlanter.getFirstSlot((IInventory)this.inventory)) < 0) {
                                    this.finished = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void plantScheduled() {
        for (int speed = 20, i = 0; i < speed; ++i) {
            if (this.plantQueue.isEmpty() || this.finished) {
                return;
            }
            if (this.player.getFoodStats().getFoodLevel() < 2) {
                this.player.addChatComponentMessage((IChatComponent)new ChatComponentTranslation("PlanterHelper:TooHungry", new Object[0]));
                this.finished = true;
                return;
            }
            final Point target = this.plantQueue.remove();
            this.plantField(target.getX(), target.getY(), target.getZ());
        }
    }
}
