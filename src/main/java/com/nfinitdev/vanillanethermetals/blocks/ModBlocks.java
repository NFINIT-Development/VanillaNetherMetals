package com.nfinitdev.vanillanethermetals.blocks;

import java.util.HashMap;
import java.util.Map;

import com.nfinitdev.vanillanethermetals.Main;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class ModBlocks {

	private static final Map<String, Block> allBlocks = new HashMap<>();

	public static Block coal_ore;
	public static Block diamond_ore;
	public static Block emerald_ore;
	public static Block gold_ore;
	public static Block iron_ore;
	public static Block lapis_ore;
	public static Block redstone_ore;


	public static void createBlocks() {

		// Vanilla
		coal_ore = createOre("coal", 4.0f, 15.0f);
		diamond_ore = createOre("diamond", 15.0f, 20.0f);
		emerald_ore = createOre("emerald", 4.0f, 15.0f);
		gold_ore = createOre("gold", 10.0f, 15.0f);
		iron_ore = createOre("iron", 4.0f, 15.0f);
		lapis_ore = createOre("lapis", 4.0f, 15.0f);
		redstone_ore = createOre("redstone", 4.0f, 15.0f);

	}

	private static Block addBlock(Block block, String name) {
		ResourceLocation location = new ResourceLocation(Main.MODID, name);
		block.setRegistryName(location);
		block.setUnlocalizedName(location.toString());
		GameRegistry.register(block);

		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(location);
		itemBlock.setUnlocalizedName(location.toString());
		GameRegistry.register(itemBlock);

		allBlocks.put(name, block);
		return block;
	}

	private static Block createOre(String name, float Hardness, float Resistance) {
		return addBlock(new ModBlockOre(Hardness, Resistance), "nether_" + name + "_ore");
	}

	@SideOnly(Side.CLIENT)
	public static void registerItemRenders(FMLInitializationEvent event) {
		for (final String name : allBlocks.keySet()) {
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
					net.minecraft.item.Item.getItemFromBlock(allBlocks.get(name)), 0,
					new ModelResourceLocation(new ResourceLocation(Main.MODID, name), "inventory"));
		}
	}
}
