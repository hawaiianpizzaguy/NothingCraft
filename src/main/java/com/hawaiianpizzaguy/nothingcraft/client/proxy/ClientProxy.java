package com.hawaiianpizzaguy.nothingcraft.client.proxy;

import com.hawaiianpizzaguy.nothingcraft.setup.IProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {


    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
