package com.ayutaki.chinjufumod.main;

import org.apache.logging.log4j.Logger;

import com.ayutaki.chinjufumod.init.entity.EntityAmmunition_KC;
import com.ayutaki.chinjufumod.init.furnitures.EntitySittableBlock;
import com.ayutaki.chinjufumod.init.render.RenderAmmunition_KC;
import com.ayutaki.chinjufumod.init.worldgene.ChinjufuWorldGene;
import com.ayutaki.chinjufumod.proxy.CommonProxy;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class ChinjufuMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@Instance
	public static ChinjufuMod instance;

	public static Logger logger;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//init アイテム・ブロックの登録、コンフィグ読込など事前の初期化作業を行う
		logger = event.getModLog();
		proxy.preInit(event);

		EntityRegistry.registerModEntity(EntitySittableBlock.class, "MountableBlock", 0, this, 80, 1, false);

		EntityRegistry.registerModEntity(EntityAmmunition_KC.class, "ammunition_kc", 1, this, 64, 1, true);
		RenderingRegistry.registerEntityRenderingHandler(EntityAmmunition_KC.class, new IRenderFactory() {
            @Override
            public Render createRenderFor(RenderManager manager) {
                return new RenderAmmunition_KC(manager);
            }
        });

	}


	@EventHandler
	public void init(FMLInitializationEvent event) {
		//RegisterRender レシピ追加、レンダー登録など
		proxy.init(event);
		GameRegistry.registerWorldGenerator(new ChinjufuWorldGene(), 0);


    }


	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//他Modとの連携
		proxy.postInit(event);

	}
}
