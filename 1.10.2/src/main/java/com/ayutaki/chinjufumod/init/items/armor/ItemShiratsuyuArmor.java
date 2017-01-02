package com.ayutaki.chinjufumod.init.items.armor;

import com.ayutaki.chinjufumod.init.ChinjufuModArmorMaterial;
import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemShiratsuyuArmor extends ItemArmor {

	public ItemShiratsuyuArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ChinjufuModArmorMaterial.SHIRATSUYU, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
	}


}
