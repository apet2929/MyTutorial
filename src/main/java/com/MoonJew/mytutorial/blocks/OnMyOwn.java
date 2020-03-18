package com.MoonJew.mytutorial.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OnMyOwn extends Block {
    public OnMyOwn(){
        super(Properties.create(Material.WOOD)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(10)
        );
        setRegistryName("onmyown");
    }
}
