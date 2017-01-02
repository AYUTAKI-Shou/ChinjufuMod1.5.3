package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.furnitures.BlockAdmiralChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockAdmiralChair_red;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_black;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_blue;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_brown;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_cyan;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_gray;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_green;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_lightb;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_lightg;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_lime;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_magenta;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_orange;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_pink;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_purple;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_red;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_white;
import com.ayutaki.chinjufumod.init.furnitures.BlockCC_yellow;
import com.ayutaki.chinjufumod.init.furnitures.BlockDChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockDChair_a;
import com.ayutaki.chinjufumod.init.furnitures.BlockDChair_b;
import com.ayutaki.chinjufumod.init.furnitures.BlockDChair_d;
import com.ayutaki.chinjufumod.init.furnitures.BlockDChair_j;
import com.ayutaki.chinjufumod.init.furnitures.BlockDChair_s;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable_a;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable_b;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable_d;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable_j;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable_s;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_a;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_b;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_d;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_j;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_s;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_black;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_blue;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_brown;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_cyan;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_gray;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_green;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_lightb;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_lightg;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_lime;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_magenta;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_orange;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_pink;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_purple;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_red;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_white;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu_yellow;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModFurnitures {

	public static Block DRESSINGTABLE;
	public static Block DRESSINGTABLE_a;
	public static Block DRESSINGTABLE_b;
	public static Block DRESSINGTABLE_d;
	public static Block DRESSINGTABLE_j;
	public static Block DRESSINGTABLE_s;

	public static Block CAFECHAIR_black;
	public static Block CAFECHAIR_blue;
	public static Block CAFECHAIR_brown;
	public static Block CAFECHAIR_cyan;
	public static Block CAFECHAIR_gray;
	public static Block CAFECHAIR_green;
	public static Block CAFECHAIR_lightb;
	public static Block CAFECHAIR_lightg;
	public static Block CAFECHAIR_lime;
	public static Block CAFECHAIR_magenta;
	public static Block CAFECHAIR_orange;
	public static Block CAFECHAIR_pink;
	public static Block CAFECHAIR_purple;
	public static Block CAFECHAIR_red;
	public static Block CAFECHAIR_white;
	public static Block CAFECHAIR_yellow;

	public static Block DININGCHAIR;
	public static Block DININGCHAIR_a;
	public static Block DININGCHAIR_b;
	public static Block DININGCHAIR_d;
	public static Block DININGCHAIR_j;
	public static Block DININGCHAIR_s;

	public static Block UNITDESK;
	public static Block UNITDESK_a;
	public static Block UNITDESK_b;
	public static Block UNITDESK_d;
	public static Block UNITDESK_j;
	public static Block UNITDESK_s;

	public static Block ZAISU_black;
	public static Block ZAISU_blue;
	public static Block ZAISU_brown;
	public static Block ZAISU_cyan;
	public static Block ZAISU_gray;
	public static Block ZAISU_green;
	public static Block ZAISU_lightb;
	public static Block ZAISU_lightg;
	public static Block ZAISU_lime;
	public static Block ZAISU_magenta;
	public static Block ZAISU_orange;
	public static Block ZAISU_pink;
	public static Block ZAISU_purple;
	public static Block ZAISU_red;
	public static Block ZAISU_white;
	public static Block ZAISU_yellow;

	public static Block ADMIRALCHAIR;
	public static Block ADMIRALCHAIR_red;


	public static void init() {
		//ブロックのインスタンス生成

		DRESSINGTABLE = new BlockDressingTable().setHardness(1.0F).setResistance(5.0F);
		DRESSINGTABLE_a = new BlockDressingTable_a().setHardness(1.0F).setResistance(5.0F);
		DRESSINGTABLE_b = new BlockDressingTable_b().setHardness(1.0F).setResistance(5.0F);
		DRESSINGTABLE_d = new BlockDressingTable_d().setHardness(1.0F).setResistance(5.0F);
		DRESSINGTABLE_j = new BlockDressingTable_j().setHardness(1.0F).setResistance(5.0F);
		DRESSINGTABLE_s = new BlockDressingTable_s().setHardness(1.0F).setResistance(5.0F);

		CAFECHAIR_black = new BlockCC_black(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_blue = new BlockCC_blue(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_brown = new BlockCC_brown(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_cyan = new BlockCC_cyan(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_gray = new BlockCC_gray(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_green = new BlockCC_green(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_lightb = new BlockCC_lightb(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_lightg = new BlockCC_lightg(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_lime = new BlockCC_lime(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_magenta = new BlockCC_magenta(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_orange = new BlockCC_orange(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_pink = new BlockCC_pink(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_purple = new BlockCC_purple(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_red = new BlockCC_red(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_white = new BlockCC_white(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFECHAIR_yellow = new BlockCC_yellow(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		DININGCHAIR = new BlockDChair(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		DININGCHAIR_a = new BlockDChair_a(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		DININGCHAIR_b = new BlockDChair_b(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		DININGCHAIR_d = new BlockDChair_d(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		DININGCHAIR_j = new BlockDChair_j(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		DININGCHAIR_s = new BlockDChair_s(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		UNITDESK = new BlockUnitDesk(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		UNITDESK_a = new BlockUnitDesk_a(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		UNITDESK_b = new BlockUnitDesk_b(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		UNITDESK_d = new BlockUnitDesk_d(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		UNITDESK_j = new BlockUnitDesk_j(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		UNITDESK_s = new BlockUnitDesk_s(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		ZAISU_black = new BlockZaisu_black(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_blue = new BlockZaisu_blue(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_brown = new BlockZaisu_brown(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_cyan = new BlockZaisu_cyan(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_gray = new BlockZaisu_gray(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_green = new BlockZaisu_green(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_lightb = new BlockZaisu_lightb(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_lightg = new BlockZaisu_lightg(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_lime = new BlockZaisu_lime(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_magenta = new BlockZaisu_magenta(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_orange = new BlockZaisu_orange(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_pink = new BlockZaisu_pink(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_purple = new BlockZaisu_purple(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_red = new BlockZaisu_red(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_white = new BlockZaisu_white(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ZAISU_yellow = new BlockZaisu_yellow(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		ADMIRALCHAIR = new BlockAdmiralChair(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ADMIRALCHAIR_red = new BlockAdmiralChair_red(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(DRESSINGTABLE);
		registerBlock(DRESSINGTABLE_a);
		registerBlock(DRESSINGTABLE_b);
		registerBlock(DRESSINGTABLE_d);
		registerBlock(DRESSINGTABLE_j);
		registerBlock(DRESSINGTABLE_s);

		registerBlock(CAFECHAIR_black);
		registerBlock(CAFECHAIR_blue);
		registerBlock(CAFECHAIR_brown);
		registerBlock(CAFECHAIR_cyan);
		registerBlock(CAFECHAIR_gray);
		registerBlock(CAFECHAIR_green);
		registerBlock(CAFECHAIR_lightb);
		registerBlock(CAFECHAIR_lightg);
		registerBlock(CAFECHAIR_lime);
		registerBlock(CAFECHAIR_magenta);
		registerBlock(CAFECHAIR_orange);
		registerBlock(CAFECHAIR_pink);
		registerBlock(CAFECHAIR_purple);
		registerBlock(CAFECHAIR_red);
		registerBlock(CAFECHAIR_white);
		registerBlock(CAFECHAIR_yellow);

		registerBlock(DININGCHAIR);
		registerBlock(DININGCHAIR_a);
		registerBlock(DININGCHAIR_b);
		registerBlock(DININGCHAIR_d);
		registerBlock(DININGCHAIR_j);
		registerBlock(DININGCHAIR_s);

		registerBlock(UNITDESK);
		registerBlock(UNITDESK_a);
		registerBlock(UNITDESK_b);
		registerBlock(UNITDESK_d);
		registerBlock(UNITDESK_j);
		registerBlock(UNITDESK_s);

		registerBlock(ZAISU_black);
		registerBlock(ZAISU_blue);
		registerBlock(ZAISU_brown);
		registerBlock(ZAISU_cyan);
		registerBlock(ZAISU_gray);
		registerBlock(ZAISU_green);
		registerBlock(ZAISU_lightb);
		registerBlock(ZAISU_lightg);
		registerBlock(ZAISU_lime);
		registerBlock(ZAISU_magenta);
		registerBlock(ZAISU_orange);
		registerBlock(ZAISU_pink);
		registerBlock(ZAISU_purple);
		registerBlock(ZAISU_red);
		registerBlock(ZAISU_white);
		registerBlock(ZAISU_yellow);

		registerBlock(ADMIRALCHAIR);
		registerBlock(ADMIRALCHAIR_red);


	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}


	public static void registerRenders() {
		//ブロックのモデルを登録
		registerRender(DRESSINGTABLE);
		registerRender(DRESSINGTABLE_a);
		registerRender(DRESSINGTABLE_b);
		registerRender(DRESSINGTABLE_d);
		registerRender(DRESSINGTABLE_j);
		registerRender(DRESSINGTABLE_s);

		registerRender(CAFECHAIR_black);
		registerRender(CAFECHAIR_blue);
		registerRender(CAFECHAIR_brown);
		registerRender(CAFECHAIR_cyan);
		registerRender(CAFECHAIR_gray);
		registerRender(CAFECHAIR_green);
		registerRender(CAFECHAIR_lightb);
		registerRender(CAFECHAIR_lightg);
		registerRender(CAFECHAIR_lime);
		registerRender(CAFECHAIR_magenta);
		registerRender(CAFECHAIR_orange);
		registerRender(CAFECHAIR_pink);
		registerRender(CAFECHAIR_purple);
		registerRender(CAFECHAIR_red);
		registerRender(CAFECHAIR_white);
		registerRender(CAFECHAIR_yellow);

		registerRender(DININGCHAIR);
		registerRender(DININGCHAIR_a);
		registerRender(DININGCHAIR_b);
		registerRender(DININGCHAIR_d);
		registerRender(DININGCHAIR_j);
		registerRender(DININGCHAIR_s);

		registerRender(UNITDESK);
		registerRender(UNITDESK_a);
		registerRender(UNITDESK_b);
		registerRender(UNITDESK_d);
		registerRender(UNITDESK_j);
		registerRender(UNITDESK_s);

		registerRender(ZAISU_black);
		registerRender(ZAISU_blue);
		registerRender(ZAISU_brown);
		registerRender(ZAISU_cyan);
		registerRender(ZAISU_gray);
		registerRender(ZAISU_green);
		registerRender(ZAISU_lightb);
		registerRender(ZAISU_lightg);
		registerRender(ZAISU_lime);
		registerRender(ZAISU_magenta);
		registerRender(ZAISU_orange);
		registerRender(ZAISU_pink);
		registerRender(ZAISU_purple);
		registerRender(ZAISU_red);
		registerRender(ZAISU_white);
		registerRender(ZAISU_yellow);

		registerRender(ADMIRALCHAIR);
		registerRender(ADMIRALCHAIR_red);

	}


	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
