package net.fabricmc.bmin.helpers;

import net.minecraft.block.PressurePlateBlock;

public class MyPressurePlate extends PressurePlateBlock{
    // Wrapper to make stone pressure plates
    public MyPressurePlate(Settings settings){
        super(ActivationRule.MOBS, settings);
    }
}