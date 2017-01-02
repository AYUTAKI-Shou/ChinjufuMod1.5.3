package com.ayutaki.chinjufumod.proxy;

import com.ayutaki.chinjufumod.init.furnitures.school.TileEntityCStove;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {


	public void preInit(FMLPreInitializationEvent event) {
		//init アイテム・ブロックの登録、コンフィグ読込など事前の初期化作業を行う

		GameRegistry.registerTileEntity(TileEntityCStove.class, "QF");
	}


	public void init(FMLInitializationEvent event) {
		//RegisterRender レシピ追加、レンダー登録など

	}


	public void postInit(FMLPostInitializationEvent event) {
		//他Modとの連携
	}


}
