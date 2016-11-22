package com.nfinitdev.vanillanethermetals.crafting;

import com.nfinitdev.vanillanethermetals.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {

		// Vanilla
		GameRegistry.addSmelting(ModBlocks.coal_ore, new ItemStack(Blocks.COAL_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.diamond_ore, new ItemStack(Blocks.DIAMOND_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.emerald_ore, new ItemStack(Blocks.EMERALD_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.gold_ore, new ItemStack(Blocks.GOLD_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.iron_ore, new ItemStack(Blocks.IRON_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.lapis_ore, new ItemStack(Blocks.LAPIS_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.redstone_ore, new ItemStack(Blocks.REDSTONE_ORE, 2), 1.0f);



		// Vanilla BM Hammer Compat


		// Base Metals


		// Modern Metals

		}
	}

