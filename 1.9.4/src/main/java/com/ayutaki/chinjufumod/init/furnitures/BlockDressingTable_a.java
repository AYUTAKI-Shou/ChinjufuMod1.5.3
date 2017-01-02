package com.ayutaki.chinjufumod.init.furnitures;

import java.util.List;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDressingTable_a extends Block {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

	private static final AxisAlignedBB TABLE_BASE = new AxisAlignedBB(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
	private static final AxisAlignedBB TABLE_MIRROR_NORTH = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB TABLE_MIRROR_EAST = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB TABLE_MIRROR_SOUTH = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);
	private static final AxisAlignedBB TABLE_MIRROR_WEST = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.125, 0.75, 0.125, 0.1875, 2.0, 0.875);

	public BlockDressingTable_a() {
		super(Material.WOOD);
		setRegistryName("BlockDressingTable_a");
		setUnlocalizedName("dressingtable_a");
		setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		setSoundType(SoundType.WOOD);

		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
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
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}

	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB axisAligned, List<AxisAlignedBB> axisAlignedList, Entity collidingEntity) {

		if (!(collidingEntity instanceof EntitySittableBlock)) {
			EnumFacing facing = state.getValue(FACING);
			switch(facing)
			{
			case NORTH:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, TABLE_MIRROR_NORTH);
				break;
			case SOUTH:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, TABLE_MIRROR_SOUTH);
				break;
			case WEST:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, TABLE_MIRROR_WEST);
				break;
			default:
				super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, TABLE_MIRROR_EAST);
				break;
			}
			super.addCollisionBoxToList(pos, axisAligned, axisAlignedList, TABLE_BASE);
		}
	}

	@Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}
}
