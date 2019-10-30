package com.hawaiianpizzaguy.nothingcraft.common.items;

import com.hawaiianpizzaguy.nothingcraft.NothingCraft;
import com.hawaiianpizzaguy.nothingcraft.reference.Names;
import net.minecraft.item.Item;

public class GreenStoneItem extends Item {

    public GreenStoneItem() {
        super(new Item.Properties()
                .group(NothingCraft.setup.itemGroup));
        setRegistryName(Names.Items.greenstoneitem);
    }
}
