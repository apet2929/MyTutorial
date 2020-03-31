package com.MoonJew.mytutorial.reg;

import com.MoonJew.mytutorial.MyTutorial;
import com.MoonJew.mytutorial.items.FirstItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, MyTutorial.MODID);
    @ObjectHolder("mytutorial:firstitem")
    public final static FirstItem FIRSTITEM = new FirstItem(true);

}
