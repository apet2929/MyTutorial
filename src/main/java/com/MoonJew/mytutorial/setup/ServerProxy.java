package com.MoonJew.mytutorial.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public World getCLientWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }
}

