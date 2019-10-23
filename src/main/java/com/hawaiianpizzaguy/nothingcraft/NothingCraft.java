package com.hawaiianpizzaguy.nothingcraft;

import com.hawaiianpizzaguy.nothingcraft.client.proxy.ClientProxy;
import com.hawaiianpizzaguy.nothingcraft.common.blocks.GreenStoneBlock;
import com.hawaiianpizzaguy.nothingcraft.common.blocks.ModBlocks;
import com.hawaiianpizzaguy.nothingcraft.common.proxy.CommonProxy;
import com.hawaiianpizzaguy.nothingcraft.setup.IProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("nothingcraft")
public class NothingCraft {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new CommonProxy());

    private static final Logger LOGGER = LogManager.getLogger();

    public NothingCraft() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {

            event.getRegistry().register(new GreenStoneBlock());

        }

        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> event) {

            event.getRegistry().register(new BlockItem(ModBlocks.GREENSTONEBLOCK, new Item.Properties()).setRegistryName("greenstoneblock"));

        }

    }

}
