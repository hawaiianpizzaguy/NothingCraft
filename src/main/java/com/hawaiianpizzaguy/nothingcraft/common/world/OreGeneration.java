package com.hawaiianpizzaguy.nothingcraft.common.world;

import com.hawaiianpizzaguy.nothingcraft.common.blocks.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{

    private static final CountRangeConfig greenstone_cfg = new CountRangeConfig(20, 30, 40, 70); // Count, MinHeight, MaxHeightBase, MaxHeight
    private static final int greenstone_veinsize = 10;

    public static void init() {

        for (Biome biome: ForgeRegistries.BIOMES.getValues()) {

            // we have no End or Nether ores, so skip those.
            if (  biome.getCategory() == Biome.Category.THEEND || biome.getCategory() == Biome.Category.NETHER) {

                continue;
            }

            if (1==1) { //OresConfig.enableGreenStoneOre

                biome.addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        Biome.createDecoratedFeature(Feature.ORE,
                                new OreFeatureConfig(
                                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                        ModBlocks.GREENSTONEORE.getDefaultState(),
                                        greenstone_veinsize),
                                Placement.COUNT_RANGE,
                                greenstone_cfg));
            }
        }
    }


}