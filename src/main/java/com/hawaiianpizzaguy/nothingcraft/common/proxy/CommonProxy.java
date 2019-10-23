package com.hawaiianpizzaguy.nothingcraft.common.proxy;

import com.hawaiianpizzaguy.nothingcraft.setup.IProxy;
import net.minecraft.world.World;

public class CommonProxy implements IProxy {

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this a the client");
    }

}
