package com.ayutaki.chinjufumod.init.items.armor;

import com.ayutaki.chinjufumod.init.ChinjufuModArmorMaterial;
import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemShigureArmor extends ItemArmor {

	public ItemShigureArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ChinjufuModArmorMaterial.SHIGURE, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
	}


}
