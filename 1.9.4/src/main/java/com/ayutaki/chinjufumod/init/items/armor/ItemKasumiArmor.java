package com.ayutaki.chinjufumod.init.items.armor;

import com.ayutaki.chinjufumod.init.ChinjufuModArmorMaterial;
import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemKasumiArmor extends ItemArmor {

	public ItemKasumiArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ChinjufuModArmorMaterial.KASUMI, renderIndexIn, equipmentSlotIn);
		this.setCreativeTab(ChinjufuModTabs.tabChinjufuMod);
	}


}
