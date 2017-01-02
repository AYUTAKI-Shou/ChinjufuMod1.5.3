package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeDesk_ac;
import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeDesk_bc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeDesk_dc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeDesk_jc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeDesk_oc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeDesk_sc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeTray_c;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterDesk_ac;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterDesk_bc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterDesk_dc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterDesk_jc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterDesk_oc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterDesk_sc;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterTray_c;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_a;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_b;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_d;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_j;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_s;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LetterTrays {

	public static Block LOWDESK;
	public static Block LOWDESK_a;
	public static Block LOWDESK_b;
	public static Block LOWDESK_d;
	public static Block LOWDESK_j;
	public static Block LOWDESK_s;

	public static Block FUDE_TRAY;
	public static Block FUDE_DESK_a;
	public static Block FUDE_DESK_b;
	public static Block FUDE_DESK_d;
	public static Block FUDE_DESK_j;
	public static Block FUDE_DESK_o;
	public static Block FUDE_DESK_s;

	public static Block LETTER_TRAY;
	public static Block LETTER_DESK_a;
	public static Block LETTER_DESK_b;
	public static Block LETTER_DESK_d;
	public static Block LETTER_DESK_j;
	public static Block LETTER_DESK_o;
	public static Block LETTER_DESK_s;

	public static void init() {
		//ブロックのインスタンス生成
		LOWDESK = new BlockLowDesk().setHardness(1.0F).setResistance(5.0F);
		LOWDESK_a = new BlockLowDesk_a().setHardness(1.0F).setResistance(5.0F);
		LOWDESK_b = new BlockLowDesk_b().setHardness(1.0F).setResistance(5.0F);
		LOWDESK_d = new BlockLowDesk_d().setHardness(1.0F).setResistance(5.0F);
		LOWDESK_j = new BlockLowDesk_j().setHardness(1.0F).setResistance(5.0F);
		LOWDESK_s = new BlockLowDesk_s().setHardness(1.0F).setResistance(5.0F);

		FUDE_TRAY = new BlockFudeTray_c().setHardness(1.0F).setResistance(5.0F);
		FUDE_DESK_a = new BlockFudeDesk_ac().setHardness(1.0F).setResistance(5.0F);
		FUDE_DESK_b = new BlockFudeDesk_bc().setHardness(1.0F).setResistance(5.0F);
		FUDE_DESK_d = new BlockFudeDesk_dc().setHardness(1.0F).setResistance(5.0F);
		FUDE_DESK_j = new BlockFudeDesk_jc().setHardness(1.0F).setResistance(5.0F);
		FUDE_DESK_o = new BlockFudeDesk_oc().setHardness(1.0F).setResistance(5.0F);
		FUDE_DESK_s = new BlockFudeDesk_sc().setHardness(1.0F).setResistance(5.0F);

		LETTER_TRAY = new BlockLetterTray_c().setHardness(1.0F).setResistance(5.0F);
		LETTER_DESK_a = new BlockLetterDesk_ac().setHardness(1.0F).setResistance(5.0F);
		LETTER_DESK_b = new BlockLetterDesk_bc().setHardness(1.0F).setResistance(5.0F);
		LETTER_DESK_d = new BlockLetterDesk_dc().setHardness(1.0F).setResistance(5.0F);
		LETTER_DESK_j = new BlockLetterDesk_jc().setHardness(1.0F).setResistance(5.0F);
		LETTER_DESK_o = new BlockLetterDesk_oc().setHardness(1.0F).setResistance(5.0F);
		LETTER_DESK_s = new BlockLetterDesk_sc().setHardness(1.0F).setResistance(5.0F);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(LOWDESK);
		registerBlock(LOWDESK_a);
		registerBlock(LOWDESK_b);
		registerBlock(LOWDESK_d);
		registerBlock(LOWDESK_j);
		registerBlock(LOWDESK_s);

		registerBlock(FUDE_TRAY);
		registerBlock(FUDE_DESK_a);
		registerBlock(FUDE_DESK_b);
		registerBlock(FUDE_DESK_d);
		registerBlock(FUDE_DESK_j);
		registerBlock(FUDE_DESK_o);
		registerBlock(FUDE_DESK_s);

		registerBlock(LETTER_TRAY);
		registerBlock(LETTER_DESK_a);
		registerBlock(LETTER_DESK_b);
		registerBlock(LETTER_DESK_d);
		registerBlock(LETTER_DESK_j);
		registerBlock(LETTER_DESK_o);
		registerBlock(LETTER_DESK_s);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}


	public static void registerRenders() {
		//ブロックのモデルを登録
		registerRender(LOWDESK);
		registerRender(LOWDESK_a);
		registerRender(LOWDESK_b);
		registerRender(LOWDESK_d);
		registerRender(LOWDESK_j);
		registerRender(LOWDESK_s);

		registerRender(FUDE_TRAY);
		registerRender(FUDE_DESK_a);
		registerRender(FUDE_DESK_b);
		registerRender(FUDE_DESK_d);
		registerRender(FUDE_DESK_j);
		registerRender(FUDE_DESK_o);
		registerRender(FUDE_DESK_s);

		registerRender(LETTER_TRAY);
		registerRender(LETTER_DESK_a);
		registerRender(LETTER_DESK_b);
		registerRender(LETTER_DESK_d);
		registerRender(LETTER_DESK_j);
		registerRender(LETTER_DESK_o);
		registerRender(LETTER_DESK_s);

	}


	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
