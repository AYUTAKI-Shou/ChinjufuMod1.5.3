package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ChinjufuModSeasons;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingSeasons {

	public CraftingSeasons() {
		register();
	}

	public static void register() {
		/*鏡餅*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSeasons.KAGAMIMOCHI, 1), new Object [] {
			"xxx",
			"aaa",
			"cbc",
			'x', new ItemStack(Items.WHEAT),
			'a', new ItemStack(Items.PAPER),
			'b', new ItemStack(Blocks.PLANKS, 1, 2),
			'c', new ItemStack(Blocks.TALLGRASS, 1, 2)
		});

		/*しめ縄*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSeasons.SHIMENAWA, 1), new Object [] {
			"xxx",
			"xyx",
			"xzx",
			'x', new ItemStack(Items.WHEAT),
			'y', new ItemStack(Blocks.DOUBLE_PLANT, 1, 5),
			'z', new ItemStack(Items.PAPER)
		});

		/*門松*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModSeasons.KADOMATSU, 1), new Object [] {
			"bbb",
			"aca",
			"xyx",
			'x', new ItemStack(Items.WHEAT),
			'y', new ItemStack(Blocks.DIRT),
			'a', new ItemStack(Blocks.SAPLING, 1, 1),
			'b', new ItemStack(Items.REEDS),
			'c', new ItemStack(Blocks.DOUBLE_PLANT, 1, 4)
		});

	}

}
