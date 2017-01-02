package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.items.armor.ItemFubukiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemKasumiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemShigureArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemShiratsuyuArmor;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModArmor {

	public static Item FUBUKI_HELMET, FUBUKI_CHESTPLATE, FUBUKI_LEGGINGS, FUBUKI_BOOTS;
	public static Item KASUMI_HELMET, KASUMI_CHESTPLATE, KASUMI_LEGGINGS, KASUMI_BOOTS;
	public static Item SHIGURE_HELMET, SHIGURE_CHESTPLATE, SHIGURE_LEGGINGS, SHIGURE_BOOTS;
	public static Item SHIRATSUYU_HELMET, SHIRATSUYU_CHESTPLATE, SHIRATSUYU_LEGGINGS, SHIRATSUYU_BOOTS;


	public static void init() {
		//アイテムのインスタンス(実体)生成

		FUBUKI_HELMET = registerItem(new ItemFubukiArmor(1, EntityEquipmentSlot.HEAD), "ItemFubukiHelmet").setUnlocalizedName("fubuki_helmet");
		FUBUKI_CHESTPLATE = registerItem(new ItemFubukiArmor(1,EntityEquipmentSlot.CHEST), "ItemFubukiChestplate").setUnlocalizedName("fubuki_chestplate");
		FUBUKI_LEGGINGS = registerItem(new ItemFubukiArmor(2, EntityEquipmentSlot.LEGS), "ItemFubukiLeggings").setUnlocalizedName("fubuki_leggings");
		FUBUKI_BOOTS = registerItem(new ItemFubukiArmor(1,EntityEquipmentSlot.FEET), "ItemFubukiBoots").setUnlocalizedName("fubuki_boots");

		KASUMI_HELMET = registerItem(new ItemKasumiArmor(1, EntityEquipmentSlot.HEAD), "ItemKasumiHelmet").setUnlocalizedName("kasumi_helmet");
		KASUMI_CHESTPLATE = registerItem(new ItemKasumiArmor(1,EntityEquipmentSlot.CHEST), "ItemKasumiChestplate").setUnlocalizedName("kasumi_chestplate");
		KASUMI_LEGGINGS = registerItem(new ItemKasumiArmor(2, EntityEquipmentSlot.LEGS), "ItemKasumiLeggings").setUnlocalizedName("kasumi_leggings");
		KASUMI_BOOTS = registerItem(new ItemKasumiArmor(1,EntityEquipmentSlot.FEET), "ItemKasumiBoots").setUnlocalizedName("kasumi_boots");

		SHIGURE_HELMET = registerItem(new ItemShigureArmor(1, EntityEquipmentSlot.HEAD), "ItemShigureHelmet").setUnlocalizedName("shigure_helmet");
		SHIGURE_CHESTPLATE = registerItem(new ItemShigureArmor(1,EntityEquipmentSlot.CHEST), "ItemShigureChestplate").setUnlocalizedName("shigure_chestplate");
		SHIGURE_LEGGINGS = registerItem(new ItemShigureArmor(2, EntityEquipmentSlot.LEGS), "ItemShigureLeggings").setUnlocalizedName("shigure_leggings");
		SHIGURE_BOOTS = registerItem(new ItemShigureArmor(1,EntityEquipmentSlot.FEET), "ItemShigureBoots").setUnlocalizedName("shigure_boots");

		SHIRATSUYU_HELMET = registerItem(new ItemShiratsuyuArmor(1, EntityEquipmentSlot.HEAD), "ItemShiratsuyuHelmet").setUnlocalizedName("shiratsuyu_helmet");
		SHIRATSUYU_CHESTPLATE = registerItem(new ItemShiratsuyuArmor(1,EntityEquipmentSlot.CHEST), "ItemShiratsuyuChestplate").setUnlocalizedName("shiratsuyu_chestplate");
		SHIRATSUYU_LEGGINGS = registerItem(new ItemShiratsuyuArmor(2, EntityEquipmentSlot.LEGS), "ItemShiratsuyuLeggings").setUnlocalizedName("shiratsuyu_leggings");
		SHIRATSUYU_BOOTS = registerItem(new ItemShiratsuyuArmor(1,EntityEquipmentSlot.FEET), "ItemShiratsuyuBoots").setUnlocalizedName("shiratsuyu_boots");

	}

	//アイテム登録をするメソッドの先頭
	public static Item registerItem(Item item, String registryName) {
		return registerItem(item, registryName, null);
	}

	public static Item registerItem(Item item, String registryName, CreativeTabs tab) {
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, registryName));
		return item;
	}
	//アイテム登録をするメソッドの末尾


	public static void registerRenders() {
		//アイテムのモデルを登録
		registerRender(FUBUKI_HELMET);
		registerRender(FUBUKI_CHESTPLATE);
		registerRender(FUBUKI_LEGGINGS);
		registerRender(FUBUKI_BOOTS);

		registerRender(KASUMI_HELMET);
		registerRender(KASUMI_CHESTPLATE);
		registerRender(KASUMI_LEGGINGS);
		registerRender(KASUMI_BOOTS);

		registerRender(SHIGURE_HELMET);
		registerRender(SHIGURE_CHESTPLATE);
		registerRender(SHIGURE_LEGGINGS);
		registerRender(SHIGURE_BOOTS);

		registerRender(SHIRATSUYU_HELMET);
		registerRender(SHIRATSUYU_CHESTPLATE);
		registerRender(SHIRATSUYU_LEGGINGS);
		registerRender(SHIRATSUYU_BOOTS);

	}

	public static void registerRender(Item item) {
	//アイテムのモデルを読込
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}

}
