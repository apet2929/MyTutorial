package com.MoonJew.mytutorial.items;

import com.MoonJew.mytutorial.reg.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import static com.MoonJew.mytutorial.MyTutorial.setup;

public class TutorialBlockItem extends BlockItem {

    public TutorialBlockItem(Block block, String name, Boolean creativeTab){
        super(block, prop(creativeTab));
        ModItems.ITEMS.register(name, () -> this);
    }

    private static Item.Properties prop(Boolean creativeTab) {
        Properties a = new Item.Properties();
        return creativeTab ? a.group(setup.itemGroup) : a;

    }

}

