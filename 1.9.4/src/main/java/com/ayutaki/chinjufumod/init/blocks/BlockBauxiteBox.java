package com.ayutaki.chinjufumod.init.blocks;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBauxiteBox extends Block {

	public BlockBauxiteBox() {
		super(Material.WOOD);
		setRegistryName("BlockBauxiteBox");
		setUnlocalizedName("bauxite_box");
		setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		setSoundType(SoundType.WOOD);
		//デフォルトを北向きにする
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}

	//向きをいれておく変数として FACING を宣言
	public static final PropertyDirection FACING;

	//getOppositeでプレイヤーの向きを取得
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	//ItemStackのmetadataからIBlockStateを生成。設置時に呼ばれる。
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}

	//IBlockStateからItemStackのmetadataを生成。ドロップ時とテクスチャ・モデル参照時に呼ばれる。
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
	}

	//初期BlockStateContainerの生成。
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}

	//向きをセット
	static {
		FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

}