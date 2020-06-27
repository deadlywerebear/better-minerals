package net.fabricmc.bmin.helpers;

import net.minecraft.block.Block;
import net.minecraft.block.StoneButtonBlock;

public class MyButtonBlock extends StoneButtonBlock {
    // Wrapper to make stone buttons
    public MyButtonBlock(Block.Settings settings){
        super(settings);
    }
}