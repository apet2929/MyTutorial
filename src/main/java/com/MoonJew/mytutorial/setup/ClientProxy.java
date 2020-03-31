package com.MoonJew.mytutorial.setup;

import com.MoonJew.mytutorial.blocks.FirstBlockScreen;
import com.MoonJew.mytutorial.reg.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy{
    @Override
    public void init() { //Used to set client side initialization
        ScreenManager.registerFactory(ModBlocks.FIRSTBLOCK_CONTAINER, FirstBlockScreen::new); //Couples Container to GUI on client
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
