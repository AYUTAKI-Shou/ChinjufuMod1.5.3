package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingCArmor {

	public CraftingCArmor() {
		register();
	}

	public static void register() {

		/*吹雪型*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.FUBUKI_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.FUBUKI_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.FUBUKI_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.FUBUKI_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.SNOWBALL),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*霞型*/
		/*ヘルメット DYE, 個数, メタ値*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.KASUMI_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.KASUMI_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.KASUMI_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.KASUMI_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.DYE, 1, 10),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*時雨型*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIGURE_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIGURE_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIGURE_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIGURE_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.DYE, 1, 0),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*白露型*/
		/*ヘルメット*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIRATSUYU_HELMET, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_HELMET),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*チェストプレート*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIRATSUYU_CHESTPLATE, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_CHESTPLATE),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*レギンス*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIRATSUYU_LEGGINGS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_LEGGINGS),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

		/*ブーツ*/
		GameRegistry.addRecipe(new ItemStack(ChinjufuModArmor.SHIRATSUYU_BOOTS, 1), new Object [] {
				"xyz",
				'x', new ItemStack(Items.IRON_BOOTS),
				'y', new ItemStack(Items.DYE, 1, 8),
				'z', new ItemStack(ChinjufuModItems.WORK_ORDER)
		});

	}

}
