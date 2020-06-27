package net.fabricmc.bmin.helpers;

import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class MyStairsBlock extends StairsBlock{
    public MyStairsBlock(Block block, Settings settings){
        super(block.getDefaultState(), settings);
    }
    
}