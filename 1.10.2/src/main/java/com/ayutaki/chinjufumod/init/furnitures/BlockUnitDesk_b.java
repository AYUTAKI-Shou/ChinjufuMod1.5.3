package com.ayutaki.chinjufumod.init.furnitures;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockUnitDesk_b extends Block {

	public static final PropertyBool BACK = PropertyBool.create("back");
	public static final PropertyBool FORWARD = PropertyBool.create("forward");
	public static final PropertyBool LEFT = PropertyBool.create("left");
	public static final PropertyBool RIGHT = PropertyBool.create("right");

	public BlockUnitDesk_b(Material material) {
		super(material);
		this.setUnlocalizedName("unitdesk_b");
		this.setRegistryName("BlockUnitDesk_b");
		this.setCreativeTab(ChinjufuModTabs.tabChinjufuMod);

		this.setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(BACK, false).withProperty(FORWARD, false).withProperty(LEFT, false).withProperty(RIGHT, false));
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
		return false;
	}

	@Override
	public boolean isSideSolid(IBlockState baseState, IBlockAccess world, BlockPos pos, EnumFacing side) {

		if (side == EnumFacing.UP)
		{
			return true;
		}
		return false;
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos) {

		boolean back = world.getBlockState(pos.south()).getBlock() == this;
		boolean forward = world.getBlockState(pos.north()).getBlock() == this;
		boolean left = world.getBlockState(pos.west()).getBlock() == this;
		boolean right = world.getBlockState(pos.east()).getBlock() == this;
		return state.withProperty(BACK, back).withProperty(FORWARD, forward).withProperty(LEFT, left).withProperty(RIGHT, right);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState();
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { BACK, FORWARD, LEFT, RIGHT });
	}
}
