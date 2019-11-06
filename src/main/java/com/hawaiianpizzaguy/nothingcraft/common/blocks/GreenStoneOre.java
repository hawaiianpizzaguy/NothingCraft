package com.hawaiianpizzaguy.nothingcraft.common.blocks;

import com.hawaiianpizzaguy.nothingcraft.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GreenStoneOre extends Block {

    public GreenStoneOre() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.0f)
                .harvestLevel(3)
        );
        setRegistryName(Names.Blocks.greenstoneore);
    }

}
