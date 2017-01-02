package com.ayutaki.chinjufumod.init.furnitures.school;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockStoveChimney_topk extends Block {

    public BlockStoveChimney_topk(Material material) {
        super(material);
        this.setRegistryName("BlockStoveChimney_topk");
        this.setUnlocalizedName("stovechimney_topk");
		this.setSoundType(SoundType.METAL);

    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
