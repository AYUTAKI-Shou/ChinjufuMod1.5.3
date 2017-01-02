package com.ayutaki.chinjufumod.init;

import com.ayutaki.chinjufumod.init.furnitures.school.BlockBlackBoard;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockCStove;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockKettle;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSChimney_joint;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolChair;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolChair_a;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolChair_b;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolChair_d;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolChair_j;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolChair_s;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolDesk;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolDesk_a;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolDesk_b;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolDesk_d;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolDesk_j;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockSchoolDesk_s;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockStoveChimney;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockStoveChimney_topk;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockTeacherDesk;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockTeacherDesk_a;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockTeacherDesk_b;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockTeacherDesk_d;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockTeacherDesk_j;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockTeacherDesk_s;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockWindow;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockWindow_a;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockWindow_b;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockWindow_d;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockWindow_j;
import com.ayutaki.chinjufumod.init.furnitures.school.BlockWindow_s;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChinjufuModSchool {

	public static Block BLACKBOARD;

	public static Block WINDOW;
	public static Block WINDOW_a;
	public static Block WINDOW_b;
	public static Block WINDOW_d;
	public static Block WINDOW_j;
	public static Block WINDOW_s;

	public static Block SCHOOLCHAIR;
	public static Block SCHOOLCHAIR_a;
	public static Block SCHOOLCHAIR_b;
	public static Block SCHOOLCHAIR_d;
	public static Block SCHOOLCHAIR_j;
	public static Block SCHOOLCHAIR_s;

	public static Block SCHOOLDESK;
	public static Block SCHOOLDESK_a;
	public static Block SCHOOLDESK_b;
	public static Block SCHOOLDESK_d;
	public static Block SCHOOLDESK_j;
	public static Block SCHOOLDESK_s;

	public static Block TEACHERDESK;
	public static Block TEACHERDESK_a;
	public static Block TEACHERDESK_b;
	public static Block TEACHERDESK_d;
	public static Block TEACHERDESK_j;
	public static Block TEACHERDESK_s;

	public static Block STOVECHIMNEY;
	public static Block STOVECHIMNEY_joint;
	public static Block STOVECHIMNEY_topk;

	public static Block CSTOVE;
	public static Block LIT_CSTOVE;

	public static Block KETTLE;

	public static void init() {
		//ブロックのインスタンス生成

		BLACKBOARD = new BlockBlackBoard(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		WINDOW = new BlockWindow(Material.WOOD).setHardness(1.0F).setResistance(0.5F);
		WINDOW_a = new BlockWindow_a(Material.WOOD).setHardness(1.0F).setResistance(0.5F);
		WINDOW_b = new BlockWindow_b(Material.WOOD).setHardness(1.0F).setResistance(0.5F);
		WINDOW_d = new BlockWindow_d(Material.WOOD).setHardness(1.0F).setResistance(0.5F);
		WINDOW_j = new BlockWindow_j(Material.WOOD).setHardness(1.0F).setResistance(0.5F);
		WINDOW_s = new BlockWindow_s(Material.WOOD).setHardness(1.0F).setResistance(0.5F);

		SCHOOLCHAIR = new BlockSchoolChair(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		SCHOOLCHAIR_a = new BlockSchoolChair_a(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		SCHOOLCHAIR_b = new BlockSchoolChair_b(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		SCHOOLCHAIR_d = new BlockSchoolChair_d(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		SCHOOLCHAIR_j = new BlockSchoolChair_j(Material.WOOD).setHardness(1.0F).setResistance(5.0F);
		SCHOOLCHAIR_s = new BlockSchoolChair_s(Material.WOOD).setHardness(1.0F).setResistance(5.0F);

		SCHOOLDESK = new BlockSchoolDesk().setHardness(1.0F).setResistance(5.0F);
		SCHOOLDESK_a = new BlockSchoolDesk_a().setHardness(1.0F).setResistance(5.0F);
		SCHOOLDESK_b = new BlockSchoolDesk_b().setHardness(1.0F).setResistance(5.0F);
		SCHOOLDESK_d = new BlockSchoolDesk_d().setHardness(1.0F).setResistance(5.0F);
		SCHOOLDESK_j = new BlockSchoolDesk_j().setHardness(1.0F).setResistance(5.0F);
		SCHOOLDESK_s = new BlockSchoolDesk_s().setHardness(1.0F).setResistance(5.0F);

		TEACHERDESK = new BlockTeacherDesk().setHardness(1.0F).setResistance(5.0F);
		TEACHERDESK_a = new BlockTeacherDesk_a().setHardness(1.0F).setResistance(5.0F);
		TEACHERDESK_b = new BlockTeacherDesk_b().setHardness(1.0F).setResistance(5.0F);
		TEACHERDESK_d = new BlockTeacherDesk_d().setHardness(1.0F).setResistance(5.0F);
		TEACHERDESK_j = new BlockTeacherDesk_j().setHardness(1.0F).setResistance(5.0F);
		TEACHERDESK_s = new BlockTeacherDesk_s().setHardness(1.0F).setResistance(5.0F);

		STOVECHIMNEY = new BlockStoveChimney(Material.WOOD).setCreativeTab(ChinjufuModTabs.tabChinjufuMod).setHardness(1.0F).setResistance(10.0F);
		STOVECHIMNEY_joint = new BlockSChimney_joint().setHardness(1.0F).setResistance(10.0F);
		STOVECHIMNEY_topk = new BlockStoveChimney_topk(Material.WOOD).setCreativeTab(ChinjufuModTabs.tabChinjufuMod).setHardness(1.0F).setResistance(10.0F);
		CSTOVE = new BlockCStove(false, "BlockCStove").setCreativeTab(ChinjufuModTabs.tabChinjufuMod).setHardness(1.0F).setResistance(10.0F);
		LIT_CSTOVE = new BlockCStove(true, "Lit_BlockCStove").setHardness(1.0F).setResistance(10.0F);

		KETTLE = new BlockKettle().setHardness(1.0F).setResistance(10.0F);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(BLACKBOARD);

		registerBlock(WINDOW);
		registerBlock(WINDOW_a);
		registerBlock(WINDOW_b);
		registerBlock(WINDOW_d);
		registerBlock(WINDOW_j);
		registerBlock(WINDOW_s);

		registerBlock(SCHOOLCHAIR);
		registerBlock(SCHOOLCHAIR_a);
		registerBlock(SCHOOLCHAIR_b);
		registerBlock(SCHOOLCHAIR_d);
		registerBlock(SCHOOLCHAIR_j);
		registerBlock(SCHOOLCHAIR_s);

		registerBlock(SCHOOLDESK);
		registerBlock(SCHOOLDESK_a);
		registerBlock(SCHOOLDESK_b);
		registerBlock(SCHOOLDESK_d);
		registerBlock(SCHOOLDESK_j);
		registerBlock(SCHOOLDESK_s);

		registerBlock(TEACHERDESK);
		registerBlock(TEACHERDESK_a);
		registerBlock(TEACHERDESK_b);
		registerBlock(TEACHERDESK_d);
		registerBlock(TEACHERDESK_j);
		registerBlock(TEACHERDESK_s);

		registerBlock(STOVECHIMNEY);
		registerBlock(STOVECHIMNEY_joint);
		registerBlock(STOVECHIMNEY_topk);

		registerBlock(CSTOVE);
		registerBlock(LIT_CSTOVE);

		registerBlock(KETTLE);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}


	public static void registerRenders() {
		//ブロックのモデルを登録

		registerRender(BLACKBOARD);

		registerRender(WINDOW);
		registerRender(WINDOW_a);
		registerRender(WINDOW_b);
		registerRender(WINDOW_d);
		registerRender(WINDOW_j);
		registerRender(WINDOW_s);

		registerRender(SCHOOLCHAIR);
		registerRender(SCHOOLCHAIR_a);
		registerRender(SCHOOLCHAIR_b);
		registerRender(SCHOOLCHAIR_d);
		registerRender(SCHOOLCHAIR_j);
		registerRender(SCHOOLCHAIR_s);

		registerRender(SCHOOLDESK);
		registerRender(SCHOOLDESK_a);
		registerRender(SCHOOLDESK_b);
		registerRender(SCHOOLDESK_d);
		registerRender(SCHOOLDESK_j);
		registerRender(SCHOOLDESK_s);

		registerRender(TEACHERDESK);
		registerRender(TEACHERDESK_a);
		registerRender(TEACHERDESK_b);
		registerRender(TEACHERDESK_d);
		registerRender(TEACHERDESK_j);
		registerRender(TEACHERDESK_s);

		registerRender(STOVECHIMNEY);
		registerRender(STOVECHIMNEY_joint);
		registerRender(STOVECHIMNEY_topk);

		registerRender(CSTOVE);
		registerRender(LIT_CSTOVE);

		registerRender(KETTLE);

	}


	public static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
