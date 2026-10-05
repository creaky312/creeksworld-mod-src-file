/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creeksworld.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.creeksworld.block.CresandBlock;
import net.mcreator.creeksworld.block.CregrassBlock;
import net.mcreator.creeksworld.block.CreeksworldPortalBlock;
import net.mcreator.creeksworld.block.CredirtBlock;
import net.mcreator.creeksworld.CreeksworldMod;

import java.util.function.Function;

public class CreeksworldModBlocks {
	public static Block CREGRASS;
	public static Block CREDIRT;
	public static Block CREEKSWORLD_PORTAL;
	public static Block CRESAND;

	public static void load() {
		CREGRASS = register("cregrass", CregrassBlock::new);
		CREDIRT = register("credirt", CredirtBlock::new);
		CREEKSWORLD_PORTAL = register("creeksworld_portal", CreeksworldPortalBlock::new);
		CRESAND = register("cresand", CresandBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CreeksworldMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}