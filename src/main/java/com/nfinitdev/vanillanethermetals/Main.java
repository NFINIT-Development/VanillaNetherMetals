package com.nfinitdev.vanillanethermetals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;

import com.nfinitdev.vanillanethermetals.blocks.ExplosiveBlock;
import com.nfinitdev.vanillanethermetals.data.DataConstants;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION,
		dependencies = "required-after:forge",
		acceptedMinecraftVersions = "1.11,)",
		updateJSON = "https://raw.githubusercontent.com/MinecraftModDevelopment/NetherMetals/master/update.json")

public class Main {

	@Instance
	public static Main INSTANCE = null;

	public static final String MODID = "vanillanethermetals";
	public static final String MODNAME = "Vanilla Nether Metals";
	public static final String VERSION = "1.1";

	/** All ore-spawn files discovered in the ore-spawn folder */
	// public static final List<Path> oreSpawnConfigFiles = new LinkedList<>();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		INSTANCE = this;

		MinecraftForge.EVENT_BUS.register(this);

		// vanilla config loader
		ConfigHandler.startConfig(event);

		// load config
		final Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

				
			
		

		config.save();

		Main.proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Main.proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Main.proxy.postInit(event);
	}

	@SidedProxy(clientSide = "com.nfinitdev.vanillanethermetals.ClientProxy", serverSide = "com.nfinitdev.vanillanethermetals.ServerProxy")
	public static CommonProxy proxy;


			
	
	
}
