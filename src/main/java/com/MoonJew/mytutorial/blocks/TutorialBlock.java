package com.MoonJew.mytutorial.blocks;


import com.MoonJew.mytutorial.MyTutorial;
import com.MoonJew.mytutorial.items.TutorialBlockItem;
import com.MoonJew.mytutorial.reg.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TutorialBlock extends Block {
    private final TutorialBlockItem ITEM;
    public TutorialBlock(String name, Material materialIn, Boolean creativeTab) {
        super(prop(materialIn, creativeTab));
        ModBlocks.BLOCKS.register(name, () -> this);
        ITEM = new TutorialBlockItem(this, name, creativeTab);
    }
    private static Properties prop(Material materialIn, Boolean creativeTab){
        return creativeTab ? Properties.create(materialIn) : Properties.create(materialIn);
    }
}
