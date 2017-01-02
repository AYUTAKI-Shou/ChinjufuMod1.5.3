package com.ayutaki.chinjufumod.init.furnitures.mamiya;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;
import com.ayutaki.chinjufumod.init.furnitures.SittableUtil;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLogChair_a extends Block {

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.25, 0.0, 0.25, 0.75, 0.625, 0.75);

	public BlockLogChair_a(Material material) {
		super(Material.WOOD);
		this.setUnlocalizedName("logchair_a");
		this.setRegistryName("BlockLogChair_a");
		this.setCreativeTab(ChinjufuModTabs.tabChinjufuMod);

		this.setHardness(1.0F);
		this.setSoundType(SoundType.WOOD);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		if(SittableUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 6 * 0.0625)) {
			worldIn.updateComparatorOutputLevel(pos, this);
			return true;
		}
		return false;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}

	@Override
	public boolean hasComparatorInputOverride(IBlockState state) {
		return true;
	}

	@Override
	public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
		return SittableUtil.isSomeoneSitting(worldIn, pos.getX(), pos.getY(), pos.getZ()) ? 1 : 0;
	}
}