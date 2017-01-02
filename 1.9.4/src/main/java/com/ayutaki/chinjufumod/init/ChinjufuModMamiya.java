package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockCafeTable;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockCafeTable_a;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockCafeTable_b;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockCafeTable_d;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockCafeTable_j;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockCafeTable_s;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockLogChair;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockLogChair_a;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockLogChair_b;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockLogChair_d;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockLogChair_j;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockLogChair_s;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMEndai;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMEndai_red;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_black;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_blue;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_brown;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_cyan;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_gray;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_green;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_lightb;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_lightg;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_lime;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_magenta;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_orange;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_pink;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_purple;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_red;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_white;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMKasa_yellow;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_black;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_blue;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_brown;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_cyan;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_gray;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_green;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_lightb;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_lightg;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_lime;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_magenta;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_orange;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_pink;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_purple;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_red;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_white;
import com.ayutaki.chinjufumod.init.furnitures.mamiya.BlockMZ_yellow;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModMamiya {

	public static Block ENDAI;
	public static Block ENDAI_red;

	public static Block ZABUTON_black;
	public static Block ZABUTON_blue;
	public static Block ZABUTON_brown;
	public static Block ZABUTON_cyan;
	public static Block ZABUTON_gray;
	public static Block ZABUTON_green;
	public static Block ZABUTON_lightb;
	public static Block ZABUTON_lightg;
	public static Block ZABUTON_lime;
	public static Block ZABUTON_magenta;
	public static Block ZABUTON_orange;
	public static Block ZABUTON_pink;
	public static Block ZABUTON_purple;
	public static Block ZABUTON_red;
	public static Block ZABUTON_white;
	public static Block ZABUTON_yellow;

	public static Block CAFETABLE;
	public static Block CAFETABLE_a;
	public static Block CAFETABLE_b;
	public static Block CAFETABLE_d;
	public static Block CAFETABLE_j;
	public static Block CAFETABLE_s;

	public static Block LOGCHAIR;
	public static Block LOGCHAIR_a;
	public static Block LOGCHAIR_b;
	public static Block LOGCHAIR_d;
	public static Block LOGCHAIR_j;
	public static Block LOGCHAIR_s;

	public static Block KASA_black;
	public static Block KASA_blue;
	public static Block KASA_brown;
	public static Block KASA_cyan;
	public static Block KASA_gray;
	public static Block KASA_green;
	public static Block KASA_lightb;
	public static Block KASA_lightg;
	public static Block KASA_lime;
	public static Block KASA_magenta;
	public static Block KASA_orange;
	public static Block KASA_pink;
	public static Block KASA_purple;
	public static Block KASA_red;
	public static Block KASA_white;
	public static Block KASA_yellow;


	public static void init() {
		//ブロックのインスタンス生成
		ENDAI = new BlockMEndai(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		ENDAI_red = new BlockMEndai_red(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		ZABUTON_black = new BlockMZ_black(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_blue = new BlockMZ_blue(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_brown = new BlockMZ_brown(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_cyan = new BlockMZ_cyan(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_gray = new BlockMZ_gray(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_green = new BlockMZ_green(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_lightb = new BlockMZ_lightb(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_lightg = new BlockMZ_lightg(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_lime = new BlockMZ_lime(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_magenta = new BlockMZ_magenta(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_orange = new BlockMZ_orange(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_pink = new BlockMZ_pink(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_purple = new BlockMZ_purple(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_red = new BlockMZ_red(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_white = new BlockMZ_white(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		ZABUTON_yellow = new BlockMZ_yellow(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);

		CAFETABLE = new BlockCafeTable(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFETABLE_a = new BlockCafeTable_a(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFETABLE_b = new BlockCafeTable_b(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFETABLE_d = new BlockCafeTable_d(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFETABLE_j = new BlockCafeTable_j(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		CAFETABLE_s = new BlockCafeTable_s(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		LOGCHAIR = new BlockLogChair(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		LOGCHAIR_a = new BlockLogChair_a(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		LOGCHAIR_b = new BlockLogChair_b(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		LOGCHAIR_d = new BlockLogChair_d(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		LOGCHAIR_j = new BlockLogChair_j(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		LOGCHAIR_s = new BlockLogChair_s(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		KASA_black = new BlockMKasa_black(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_blue = new BlockMKasa_blue(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_brown = new BlockMKasa_brown(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_cyan = new BlockMKasa_cyan(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_gray = new BlockMKasa_gray(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_green = new BlockMKasa_green(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_lightb = new BlockMKasa_lightb(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_lightg = new BlockMKasa_lightg(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_lime = new BlockMKasa_lime(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_magenta = new BlockMKasa_magenta(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_orange = new BlockMKasa_orange(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_pink = new BlockMKasa_pink(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_purple = new BlockMKasa_purple(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_red = new BlockMKasa_red(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_white = new BlockMKasa_white(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);
		KASA_yellow = new BlockMKasa_yellow(Material.CLOTH).setHardness(0.8F).setResistance(1.0F);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(ENDAI);
		registerBlock(ENDAI_red);

		registerBlock(ZABUTON_black);
		registerBlock(ZABUTON_blue);
		registerBlock(ZABUTON_brown);
		registerBlock(ZABUTON_cyan);
		registerBlock(ZABUTON_gray);
		registerBlock(ZABUTON_green);
		registerBlock(ZABUTON_lightb);
		registerBlock(ZABUTON_lightg);
		registerBlock(ZABUTON_lime);
		registerBlock(ZABUTON_magenta);
		registerBlock(ZABUTON_orange);
		registerBlock(ZABUTON_pink);
		registerBlock(ZABUTON_purple);
		registerBlock(ZABUTON_red);
		registerBlock(ZABUTON_white);
		registerBlock(ZABUTON_yellow);

		registerBlock(CAFETABLE);
		registerBlock(CAFETABLE_a);
		registerBlock(CAFETABLE_b);
		registerBlock(CAFETABLE_d);
		registerBlock(CAFETABLE_j);
		registerBlock(CAFETABLE_s);

		registerBlock(LOGCHAIR);
		registerBlock(LOGCHAIR_a);
		registerBlock(LOGCHAIR_b);
		registerBlock(LOGCHAIR_d);
		registerBlock(LOGCHAIR_j);
		registerBlock(LOGCHAIR_s);

		registerBlock(KASA_black);
		registerBlock(KASA_blue);
		registerBlock(KASA_brown);
		registerBlock(KASA_cyan);
		registerBlock(KASA_gray);
		registerBlock(KASA_green);
		registerBlock(KASA_lightb);
		registerBlock(KASA_lightg);
		registerBlock(KASA_lime);
		registerBlock(KASA_magenta);
		registerBlock(KASA_orange);
		registerBlock(KASA_pink);
		registerBlock(KASA_purple);
		registerBlock(KASA_red);
		registerBlock(KASA_white);
		registerBlock(KASA_yellow);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}


	public static void registerRenders() {
		//ブロックのモデルを登録
		registerRender(ENDAI);
		registerRender(ENDAI_red);

		registerRender(ZABUTON_black);
		registerRender(ZABUTON_blue);
		registerRender(ZABUTON_brown);
		registerRender(ZABUTON_cyan);
		registerRender(ZABUTON_lightb);
		registerRender(ZABUTON_lightg);
		registerRender(ZABUTON_gray);
		registerRender(ZABUTON_green);
		registerRender(ZABUTON_lime);
		registerRender(ZABUTON_magenta);
		registerRender(ZABUTON_orange);
		registerRender(ZABUTON_pink);
		registerRender(ZABUTON_purple);
		registerRender(ZABUTON_red);
		registerRender(ZABUTON_white);
		registerRender(ZABUTON_yellow);

		registerRender(CAFETABLE);
		registerRender(CAFETABLE_a);
		registerRender(CAFETABLE_b);
		registerRender(CAFETABLE_d);
		registerRender(CAFETABLE_j);
		registerRender(CAFETABLE_s);

		registerRender(LOGCHAIR);
		registerRender(LOGCHAIR_a);
		registerRender(LOGCHAIR_b);
		registerRender(LOGCHAIR_d);
		registerRender(LOGCHAIR_j);
		registerRender(LOGCHAIR_s);

		registerRender(KASA_black);
		registerRender(KASA_blue);
		registerRender(KASA_brown);
		registerRender(KASA_cyan);
		registerRender(KASA_lightb);
		registerRender(KASA_lightg);
		registerRender(KASA_gray);
		registerRender(KASA_green);
		registerRender(KASA_lime);
		registerRender(KASA_magenta);
		registerRender(KASA_orange);
		registerRender(KASA_pink);
		registerRender(KASA_purple);
		registerRender(KASA_red);
		registerRender(KASA_white);
		registerRender(KASA_yellow);

}


	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}