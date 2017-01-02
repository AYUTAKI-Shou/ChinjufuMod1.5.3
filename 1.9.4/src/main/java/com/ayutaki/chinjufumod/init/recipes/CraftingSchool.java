package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;
import com.ayutaki.chinjufumod.init.ChinjufuModSchool;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingSchool {

	public CraftingSchool() {
		register();
	}

	public static void register() {

		/*黒板*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.BLACKBOARD, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(ChinjufuModItems.SUMI),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*ストーブ*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.CSTOVE, 1), new Object [] {
				"x",
				"y",
				"x",
				'x', new ItemStack(ChinjufuModBlocks.STEEL_BLOCK),
				'y', new ItemStack(Items.COAL, 1, 1)
		});

		/*やかん*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.KETTLE, 1), new Object [] {
				"xxx",
				"#xx",
				'x', new ItemStack(ChinjufuModItems.BAUXITE)
		});

		/*煙突ストーブ結合*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModSchool.STOVECHIMNEY_joint, 1), ChinjufuModSchool.STOVECHIMNEY);

		/*煙突*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.STOVECHIMNEY, 8), new Object [] {
				"x",
				"x",
				'x', new ItemStack(ChinjufuModBlocks.STEEL_BLOCK)
		});

		/*煙突トップ傘*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModSchool.STOVECHIMNEY_topk, 1), ChinjufuModSchool.STOVECHIMNEY_joint);

		/*煙突トップからの戻り*/
		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModSchool.STOVECHIMNEY, 1), ChinjufuModSchool.STOVECHIMNEY_topk);

		/*学校の椅子*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLCHAIR, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*学校の椅子(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLCHAIR_a, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*学校の椅子(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLCHAIR_b, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*学校の椅子(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLCHAIR_d, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*学校の椅子(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLCHAIR_j, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*学校の椅子(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLCHAIR_s, 1), new Object [] {
				"y##",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*学校の机*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLDESK, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*学校の机(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLDESK_a, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*学校の机(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLDESK_b, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*学校の机(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLDESK_d, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*学校の机(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLDESK_j, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*学校の机(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.SCHOOLDESK_s, 1), new Object [] {
				"yyy",
				"xyx",
				"x#x",
				'x', new ItemStack(Items.STICK, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});

		/*教卓*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.TEACHERDESK, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 0),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 0)
		});

		/*教卓(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.TEACHERDESK_a, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 4),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 4)
		});

		/*教卓(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.TEACHERDESK_b, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 2),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 2)
		});

		/*教卓(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.TEACHERDESK_d, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 5),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 5)
		});

		/*教卓(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.TEACHERDESK_j, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 3),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 3)
		});

		/*教卓(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.TEACHERDESK_s, 1), new Object [] {
				"xxx",
				"xyx",
				"x#x",
				'x', new ItemStack(Blocks.PLANKS, 1, 1),
				'y', new ItemStack(Blocks.WOODEN_SLAB, 1, 1)
		});


		/*窓*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.WINDOW, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 0)
		});

		/*窓(アカシア)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.WINDOW_a, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 4)
		});

		/*窓(シラカバ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.WINDOW_b, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 2)
		});

		/*窓(ダークオーク)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.WINDOW_d, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 5)
		});

		/*窓(ジャングル)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.WINDOW_j, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 3)
		});

		/*窓(マツ)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSchool.WINDOW_s, 8), new Object [] {
				"x",
				"y",
				'x', new ItemStack(Blocks.GLASS, 1, 0),
				'y', new ItemStack(Blocks.PLANKS, 1, 1)
		});

	}

}

