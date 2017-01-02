package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;
import com.ayutaki.chinjufumod.init.ChinjufuModWeapons;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CraftingCBlocks {

	public CraftingCBlocks() {
		register();
	}

	public static void register() {
		//定形レシピ
		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.EMPTY_BOX, 8), new Object [] {
			"xxx",
			"xyx",
			"xxx",
			'x', new ItemStack(Blocks.PLANKS),
			'y', new ItemStack(ChinjufuModItems.WORK_ORDER, 1, 0)
		});


		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.OIL_DRUM, 1), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Items.COAL)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 4), ChinjufuModBlocks.OIL_DRUM);


		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.AMMUNITION_BOX, 1), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ChinjufuModWeapons.AMMUNITION_KC),
				'y', new ItemStack(ChinjufuModBlocks.EMPTY_BOX, 1, 0)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModWeapons.AMMUNITION_KC, 8), ChinjufuModBlocks.AMMUNITION_BOX);


		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.STEEL_BLOCK, 1), new Object [] {
				"xx",
				"xx",
				'x', new ItemStack(Items.IRON_INGOT)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 4), ChinjufuModBlocks.STEEL_BLOCK);


		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.BAUXITE_BOX, 1), new Object [] {
				"xxx",
				"xyx",
				"xxx",
				'x', new ItemStack(ChinjufuModItems.BAUXITE),
				'y', new ItemStack(ChinjufuModBlocks.EMPTY_BOX, 1, 0)
		});

		GameRegistry.addShapelessRecipe(new ItemStack(ChinjufuModItems.BAUXITE, 8), ChinjufuModBlocks.BAUXITE_BOX);

		/*提督ノ判子(ブロック)*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModBlocks.B_ADMIRAL_STAMP, 1), new Object [] {
				"x",
				'x', new ItemStack(ChinjufuModItems.ADMIRAL_STAMP, 1, OreDictionary.WILDCARD_VALUE)
		});

	}

}
