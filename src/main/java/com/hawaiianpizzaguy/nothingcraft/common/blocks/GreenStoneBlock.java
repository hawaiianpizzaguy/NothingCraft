package com.hawaiianpizzaguy.nothingcraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GreenStoneBlock extends Block {

    public GreenStoneBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.0f)
                .lightValue(14)
        );
        setRegistryName("greenstoneblock");
    }

}
