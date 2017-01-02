package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.items.weapons.ItemAmmunition_KC;
import com.ayutaki.chinjufumod.init.items.weapons.ItemKoukakuHou100;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou127;
import com.ayutaki.chinjufumod.init.items.weapons.ItemShigureHou;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModWeapons {

	public static Item AMMUNITION_KC;
	public static Item CARTRIDGE_KC;

	public static Item RENSOUHOU_127;
	public static Item SHIGUREHOU;
	public static Item KOUKAKUHOU_100;

	public static void init() {

		AMMUNITION_KC = registerItem(new ItemAmmunition_KC(), "ItemAmmunition_KC").setUnlocalizedName("ammunition_kc").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		CARTRIDGE_KC = registerItem(new Item(), "ItemCartridge_KC").setUnlocalizedName("cartridge_kc");

		RENSOUHOU_127 = registerItem(new ItemRensouHou127(), "ItemRensouHou127").setUnlocalizedName("rensouhou127").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
		SHIGUREHOU = registerItem(new ItemShigureHou(), "ItemShigureHou").setUnlocalizedName("shigurehou").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);;
		KOUKAKUHOU_100 = registerItem(new ItemKoukakuHou100(), "ItemKoukakuHou100").setUnlocalizedName("koukakuhou100").setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
	}

	public static Item registerItem(Item item, String registryName) {
		return registerItem(item, registryName, null);
	}

	public static Item registerItem(Item item, String registryName, CreativeTabs tab) {
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, registryName));
		return item;
	}


	public static void registerRenders() {

		registerRender(AMMUNITION_KC);
		registerRender(CARTRIDGE_KC);

		registerRender(RENSOUHOU_127);
		registerRender(SHIGUREHOU);
		registerRender(KOUKAKUHOU_100);

	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	}

}
