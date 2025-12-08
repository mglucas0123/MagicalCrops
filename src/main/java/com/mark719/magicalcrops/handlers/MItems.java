package com.mark719.magicalcrops.handlers;

import net.minecraft.item.*;
import com.mark719.magicalcrops.seedbags.*;
import com.mark719.magicalcrops.items.*;

public class MItems
{
    public static Item InfusionStoneWeak;
    public static Item InfusionStoneRegular;
    public static Item InfusionStoneStrong;
    public static Item InfusionStoneExtreme;
    public static Item InfusionStoneMaster;
    public static Item MagicalFertilizer;
    public static Item EssenceFertilizer;
    public static Item ExperienceBook;
    public static Item EssenceIngots;
    public static Item SeedBagAccio;
    public static Item SeedBagCrucio;
    public static Item SeedBagImperio;
    public static Item SeedBagZivicio;
    
    static {
        MItems.InfusionStoneWeak = new ItemInfusionStone1Weak().setUnlocalizedName("InfusionStoneWeak");
        MItems.InfusionStoneRegular = new ItemInfusionStone2Regular().setUnlocalizedName("InfusionStoneRegular");
        MItems.InfusionStoneStrong = new ItemInfusionStone3Strong().setUnlocalizedName("InfusionStoneStrong");
        MItems.InfusionStoneExtreme = new ItemInfusionStone4Extreme().setUnlocalizedName("InfusionStoneExtreme");
        MItems.InfusionStoneMaster = new ItemInfusionStone5Master().setUnlocalizedName("InfusionStoneMaster");
        MItems.MagicalFertilizer = new ItemMagicalFertilizer().setUnlocalizedName("MagicalFertilizer");
        MItems.EssenceFertilizer = new ItemEssenceFertilizer().setUnlocalizedName("EssenceFertilizer");
        MItems.ExperienceBook = new ItemExperienceBook().setUnlocalizedName("ExperienceBook");
        MItems.EssenceIngots = new ItemsEssenceIngots().setUnlocalizedName("EssenceIngots");
        MItems.SeedBagAccio = new ItemSeedBagAccio();
        MItems.SeedBagCrucio = new ItemSeedBagCrucio();
        MItems.SeedBagImperio = new ItemSeedBagImperio();
        MItems.SeedBagZivicio = new ItemSeedBagZivicio();
    }
}
