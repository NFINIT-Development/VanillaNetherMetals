package com.nfinitdev.vanillanethermetals;

import com.nfinitdev.vanillanethermetals.blocks.ModBlocks;
import com.nfinitdev.vanillanethermetals.crafting.ModCrafting;
import com.nfinitdev.vanillanethermetals.world.WorldGen;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	private static final Logger logger = FMLLog.getLogger();

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.createBlocks();
	}

	public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	}

	public void postInit(FMLPostInitializationEvent event) {
		//
	}

	public void info(String s) {
		logger.info(s);
	}

	public void error(String s) {
		logger.error(s);
	}
}
