package com.MoonJew.mytutorial.blocks;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static com.MoonJew.mytutorial.blocks.ModBlocks.FIRSTBLOCK_TILE;
public class FirstBlockTile extends TileEntity implements ITickableTileEntity {
    public FirstBlockTile(){
        super(FIRSTBLOCK_TILE);
    }

    @Override
    public void tick() {
        if(world.isRemote) System.out.println("FirstBlockTile.tick");
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return super.getCapability(cap, side);
    }
}
