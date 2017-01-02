package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.seasons.BlockKadomatsu;
import com.ayutaki.chinjufumod.init.seasons.BlockKagamiMochi;
import com.ayutaki.chinjufumod.init.seasons.BlockShimenawa;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModSeasons {

	public static Block KAGAMIMOCHI;
	public static Block SHIMENAWA;
	public static Block KADOMATSU;

	public static void init() {

		KAGAMIMOCHI = new BlockKagamiMochi().setHardness(1.0F).setResistance(5.0F);
		SHIMENAWA = new BlockShimenawa(Material.WOOD).setHardness(0.8F).setResistance(1.0F);
		KADOMATSU = new BlockKadomatsu().setHardness(1.0F).setResistance(5.0F);
	}


	public static void register() {

		registerBlock(KAGAMIMOCHI);
		registerBlock(SHIMENAWA);
		registerBlock(KADOMATSU);
	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}


	public static void registerRenders() {

		registerRender(KAGAMIMOCHI);
		registerRender(SHIMENAWA);
		registerRender(KADOMATSU);

	}


	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
