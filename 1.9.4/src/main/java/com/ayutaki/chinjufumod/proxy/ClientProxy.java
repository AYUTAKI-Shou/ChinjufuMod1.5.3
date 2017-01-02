package com.ayutaki.chinjufumod.proxy;

import com.ayutaki.chinjufumod.init.ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModFurnitures;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;
import com.ayutaki.chinjufumod.init.ChinjufuModMamiya;
import com.ayutaki.chinjufumod.init.ChinjufuModSchool;
import com.ayutaki.chinjufumod.init.ChinjufuModSeasons;
import com.ayutaki.chinjufumod.init.ChinjufuModWeapons;
import com.ayutaki.chinjufumod.init.LetterTrays;
import com.ayutaki.chinjufumod.init.recipes.CraftingCArmor;
import com.ayutaki.chinjufumod.init.recipes.CraftingCBlocks;
import com.ayutaki.chinjufumod.init.recipes.CraftingCItems;
import com.ayutaki.chinjufumod.init.recipes.CraftingCWeapons;
import com.ayutaki.chinjufumod.init.recipes.CraftingFurnitures;
import com.ayutaki.chinjufumod.init.recipes.CraftingLetterTrays;
import com.ayutaki.chinjufumod.init.recipes.CraftingMamiya;
import com.ayutaki.chinjufumod.init.recipes.CraftingSchool;
import com.ayutaki.chinjufumod.init.recipes.CraftingSeasons;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		//init アイテム・ブロックの登録、コンフィグ読込など事前の初期化作業を行う
		ChinjufuModArmor.init();
		ChinjufuModItems.init();

		ChinjufuModBlocks.init();
		ChinjufuModBlocks.register();

		LetterTrays.init();
		LetterTrays.register();

		ChinjufuModFurnitures.init();
		ChinjufuModFurnitures.register();
		ChinjufuModMamiya.init();
		ChinjufuModMamiya.register();
		ChinjufuModSchool.init();
		ChinjufuModSchool.register();

		ChinjufuModSeasons.init();
		ChinjufuModSeasons.register();

		ChinjufuModWeapons.init();

	}


	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		//RegisterRender レシピ追加、レンダー登録など
		ChinjufuModArmor.registerRenders();
		ChinjufuModItems.registerRenders();

		ChinjufuModBlocks.registerRenders();

		LetterTrays.registerRenders();

		ChinjufuModFurnitures.registerRenders();
		ChinjufuModMamiya.registerRenders();
		ChinjufuModSchool.registerRenders();
		ChinjufuModSeasons.registerRenders();

		CraftingCArmor.register();
		CraftingCBlocks.register();
		CraftingCItems.register();
		CraftingCWeapons.register();
		CraftingFurnitures.register();
		CraftingLetterTrays.register();
		CraftingMamiya.register();
		CraftingSchool.register();
		CraftingSeasons.register();

		/*SmeltingChinjufuMod.register();*/

		ChinjufuModWeapons.registerRenders();


	}


	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		//他Modとの連携

	}

}
