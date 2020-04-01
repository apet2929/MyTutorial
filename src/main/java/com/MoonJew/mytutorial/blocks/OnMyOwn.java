package com.MoonJew.mytutorial.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OnMyOwn extends TutorialBlock {
    public OnMyOwn(){
        super("onmyown", Material.WOOD, 5.0f, ToolType.PICKAXE, 0, true);
    }
}
