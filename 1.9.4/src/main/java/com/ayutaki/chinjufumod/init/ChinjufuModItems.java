package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.items.ItemAdmiralStamp;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModItems {

	public static Item EMBLEM_C;
	public static Item ADMIRAL_STAMP;
	public static Item WORK_ORDER;
	public static Item BAUXITE;
	public static Item SUMI;



	public static void init() {
		//アイテムのインスタンス(実体)生成
		EMBLEM_C = registerItem(new Item(), "ItemEmblem_C").setUnlocalizedName("emblem_c");
		ADMIRAL_STAMP = registerItem(new ItemAdmiralStamp(), "ItemAdmiralStamp").setUnlocalizedName("admiral_stamp").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		WORK_ORDER = registerItem(new Item(), "ItemWorkOrder").setUnlocalizedName("work_order").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		BAUXITE = registerItem(new Item(), "ItemBauxite").setUnlocalizedName("bauxite").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		SUMI = registerItem(new Item(), "ItemSumi_c").setUnlocalizedName("sumi_c").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);

	}


	//アイテム登録をするメソッド 先頭//
	public static Item registerItem(Item item, String registryName) {
		return registerItem(item, registryName, null);
	}

	public static Item registerItem(Item item, String registryName, CreativeTabs tab) {
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, registryName));
		return item;
	}
	//アイテム登録をするメソッド 末尾//

	public static void registerRenders() {
		//アイテムのモデルを登録
		registerRender(EMBLEM_C);
		registerRender(ADMIRAL_STAMP);
		registerRender(WORK_ORDER);
		registerRender(BAUXITE);
		registerRender(SUMI);


	}

	public static void registerRender(Item item) {
	//アイテムのモデルを読込
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}
}