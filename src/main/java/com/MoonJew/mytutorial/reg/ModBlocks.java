package com.MoonJew.mytutorial.reg;
import com.MoonJew.mytutorial.MyTutorial;
import com.MoonJew.mytutorial.blocks.FirstBlock;
import com.MoonJew.mytutorial.blocks.FirstBlockContainer;
import com.MoonJew.mytutorial.blocks.FirstBlockTile;
import com.MoonJew.mytutorial.blocks.OnMyOwn;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, MyTutorial.MODID);
    @ObjectHolder("mytutorial:firstblock")
    public static final FirstBlock FIRSTBLOCK = new FirstBlock();
    @ObjectHolder("mytutorial:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
    @ObjectHolder("mytutorial:onmyown")
    public static final OnMyOwn ONMYOWN = new OnMyOwn();
    public static ContainerType<FirstBlockContainer> FIRSTBLOCK_CONTAINER;

}

