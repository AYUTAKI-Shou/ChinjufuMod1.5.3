package com.ayutaki.chinjufumod.init.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAdmiralStamp extends Item {

	public ItemAdmiralStamp() {
		super();
		//アイテムのスタック数・耐久値
		this.setMaxStackSize(1);
		this.setMaxDamage(15);
	}

	//getContainerItemStackを呼び出す
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	//クラフト後のアイテムに、ダメージを与えて返す
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		if (itemStack.getMaxDamage() == itemStack.getItemDamage()) {
			return (ItemStack) null;
		}
		else {
			ItemStack newItemStack = itemStack.copy();
			newItemStack.setItemDamage(itemStack.getItemDamage() + 1);
			return newItemStack;
		}
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> list, boolean par4) {
		list.add("This is a craft material in the form of a stamp.");
	}

}
