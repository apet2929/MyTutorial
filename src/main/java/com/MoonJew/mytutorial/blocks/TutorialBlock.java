package com.MoonJew.mytutorial.blocks;


import com.MoonJew.mytutorial.MyTutorial;
import com.MoonJew.mytutorial.items.TutorialBlockItem;
import com.MoonJew.mytutorial.reg.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class TutorialBlock extends Block {
    private final TutorialBlockItem ITEM;
    public TutorialBlock(String name, Material materialIn, float hardnessAndResistance, ToolType harvestTool, int lightVal, boolean creativeTab) {
        super(prop(materialIn, hardnessAndResistance, harvestTool, lightVal));
        ModBlocks.BLOCKS.register(name, () -> this);
        ITEM = new TutorialBlockItem(this, name, creativeTab);
    }
    private static Properties prop(Material materialIn, float hardnessAndResistance, ToolType harvestTool, int lightVal){
        return  Properties.create(materialIn).hardnessAndResistance(hardnessAndResistance).harvestTool(harvestTool).lightValue(lightVal);
    }
}
