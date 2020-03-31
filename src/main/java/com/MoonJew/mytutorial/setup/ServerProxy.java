package com.MoonJew.mytutorial.setup;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ServerProxy implements IProxy{

    @Override
    public void init() { //Used to set server side initialization

    }

    @Override
    public PlayerEntity getClientPlayer() {
        throw new IllegalStateException("Only run this on the client!");
    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }
}

