package com.MoonJew.mytutorial.items;

import com.MoonJew.mytutorial.reg.ModItems;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

import static com.MoonJew.mytutorial.MyTutorial.setup;

public class TutorialItem extends Item {
    public TutorialItem(String name, Boolean creativeTab){
        super(prop(creativeTab));
        ModItems.ITEMS.register(name, () -> this); //Add this line to any item not extending the NutItem class

    }

    private static Properties prop(Boolean creativeTab) {
        Item.Properties a = new Item.Properties();
        return creativeTab ? a.group(setup.itemGroup) : a;
    }

}
