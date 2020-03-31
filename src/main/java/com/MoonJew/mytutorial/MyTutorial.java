package com.MoonJew.mytutorial;

import com.MoonJew.mytutorial.blocks.*;
import com.MoonJew.mytutorial.items.FirstItem;
import com.MoonJew.mytutorial.reg.ModBlocks;
import com.MoonJew.mytutorial.reg.Register;
import com.MoonJew.mytutorial.setup.ClientProxy;
import com.MoonJew.mytutorial.setup.IProxy;
import com.MoonJew.mytutorial.setup.ModSetup;
import com.MoonJew.mytutorial.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mytutorial")
public class MyTutorial
{

    public static final String MODID = "mytutorial";
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    // Directly reference a log4j logger.
    public static ModSetup setup = new ModSetup();
    private static final Logger LOGGER = LogManager.getLogger();

    public MyTutorial() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        Register.register();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
            event.getRegistry().register(TileEntityType.Builder.create(FirstBlockTile::new, ModBlocks.FIRSTBLOCK).build(null).setRegistryName("firstblock"));
        }

        @SubscribeEvent
        public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) {
            event.getRegistry().register(
                    IForgeContainerType.create(
                            (windowId, inv, data) -> {
                                BlockPos pos = data.readBlockPos();
                                return new FirstBlockContainer(windowId, MyTutorial.proxy.getClientWorld(), pos, inv, proxy.getClientPlayer());
                            }).setRegistryName("firstblock")
            );

        }
    }
}
