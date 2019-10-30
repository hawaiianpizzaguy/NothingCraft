package com.hawaiianpizzaguy.nothingcraft.setup;

import com.hawaiianpizzaguy.nothingcraft.common.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("nothingcraft") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.GREENSTONEBLOCK);
        }
    };

    public void init() {

    }

}
