package com.MoonJew.mytutorial.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy{
    @Override
    public World getCLientWorld() {
        return Minecraft.getInstance().world;
    }
}
