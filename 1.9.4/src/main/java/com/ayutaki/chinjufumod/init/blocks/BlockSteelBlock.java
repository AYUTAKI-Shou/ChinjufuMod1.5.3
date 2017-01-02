package com.ayutaki.chinjufumod.init.blocks;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSteelBlock extends Block {

	public BlockSteelBlock() {
		super(Material.WOOD);
		setRegistryName("BlockSteelBlock");
		setUnlocalizedName("steel_block");
		setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		setSoundType(SoundType.METAL);
	}

}
