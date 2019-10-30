package com.hawaiianpizzaguy.nothingcraft;

import com.hawaiianpizzaguy.nothingcraft.client.proxy.ClientProxy;
import com.hawaiianpizzaguy.nothingcraft.common.blocks.GreenStoneBlock;
import com.hawaiianpizzaguy.nothingcraft.common.blocks.ModBlocks;
import com.hawaiianpizzaguy.nothingcraft.common.items.GreenStoneItem;
import com.hawaiianpizzaguy.nothingcraft.common.proxy.CommonProxy;
import com.hawaiianpizzaguy.nothingcraft.reference.Names;
import com.hawaiianpizzaguy.nothingcraft.reference.Reference;
import com.hawaiianpizzaguy.nothingcraft.setup.IProxy;
import com.hawaiianpizzaguy.nothingcraft.setup.ModSetup;
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

//TODO ore or mob drop for green stone, new texture for green stone block so I can use the core texture for the core
//TODO add core tile entity and gui with custom model, and write encryption code
//TODO link encryption code to core for encrypting written and maybe signed books

@Mod(Reference.MOD_ID)
public class NothingCraft {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new CommonProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public NothingCraft() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event) {

        setup.init();
        proxy.init();

    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {

            event.getRegistry().register(new GreenStoneBlock());

        }

        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> event) {

            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);

            event.getRegistry().register(new BlockItem(ModBlocks.GREENSTONEBLOCK, properties).setRegistryName(Names.Blocks.greenstoneblock));
            event.getRegistry().register(new GreenStoneItem());

        }

    }

}
