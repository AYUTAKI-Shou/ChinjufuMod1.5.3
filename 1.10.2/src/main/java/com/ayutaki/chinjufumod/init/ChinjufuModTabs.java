package com.ayutaki.chinjufumod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ChinjufuModTabs {

	public static final CreativeTabs tabChinjufuMod = new CreativeTabs("tabChinjufuMod") {

		@Override
		public Item getTabIconItem() {

			return ChinjufuModItems.EMBLEM_C;
		}

	};

}
