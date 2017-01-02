package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.blocks.BlockAdmiralStamp;
import com.ayutaki.chinjufumod.init.blocks.BlockAmmunitionBox;
import com.ayutaki.chinjufumod.init.blocks.BlockBauxiteBox;
import com.ayutaki.chinjufumod.init.blocks.BlockBauxiteOre;
import com.ayutaki.chinjufumod.init.blocks.BlockEmptyBox;
import com.ayutaki.chinjufumod.init.blocks.BlockOilDrum;
import com.ayutaki.chinjufumod.init.blocks.BlockSteelBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModBlocks {

	public static Block EMPTY_BOX;
	public static Block OIL_DRUM;
	public static Block AMMUNITION_BOX;
	public static Block STEEL_BLOCK;
	public static Block BAUXITE_BOX;
	public static Block B_ADMIRAL_STAMP;

	public static Block BAUXITE_ORE;


	public static void init() {
		//ブロックのインスタンス生成
		EMPTY_BOX = new BlockEmptyBox().setHardness(1.0F).setResistance(5.0F);
		OIL_DRUM = new BlockOilDrum().setHardness(1.0F).setResistance(10.0F);
		AMMUNITION_BOX = new BlockAmmunitionBox().setHardness(1.0F).setResistance(5.0F);
		STEEL_BLOCK = new BlockSteelBlock().setHardness(1.0F).setResistance(10.0F);
		BAUXITE_BOX = new BlockBauxiteBox().setHardness(1.0F).setResistance(5.0F);
		B_ADMIRAL_STAMP = new BlockAdmiralStamp(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		BAUXITE_ORE = new BlockBauxiteOre().setHardness(2.0F).setResistance(10.0F);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(EMPTY_BOX);
		registerBlock(OIL_DRUM);
		registerBlock(AMMUNITION_BOX);
		registerBlock(STEEL_BLOCK);
		registerBlock(BAUXITE_BOX);
		registerBlock(B_ADMIRAL_STAMP);

		registerBlock(BAUXITE_ORE);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}


	public static void registerRenders() {
		//ブロックのモデルを登録
		registerRender(EMPTY_BOX);
		registerRender(OIL_DRUM);
		registerRender(AMMUNITION_BOX);
		registerRender(STEEL_BLOCK);
		registerRender(BAUXITE_BOX);
		registerRender(B_ADMIRAL_STAMP);

		registerRender(BAUXITE_ORE);

	}

	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
