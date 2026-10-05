/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creeksworld.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.creeksworld.item.GreatnessItem;
import net.mcreator.creeksworld.item.CreeksworldItem;
import net.mcreator.creeksworld.CreeksworldMod;

import java.util.function.Function;

public class CreeksworldModItems {
	public static Item CREGRASS;
	public static Item CREDIRT;
	public static Item CREEKSWORLD;
	public static Item CREEY_SPAWN_EGG;
	public static Item GREATNESS;
	public static Item CRESAND;

	public static void load() {
		CREGRASS = block(CreeksworldModBlocks.CREGRASS, "cregrass");
		CREDIRT = block(CreeksworldModBlocks.CREDIRT, "credirt");
		CREEKSWORLD = register("creeksworld", CreeksworldItem::new);
		CREEY_SPAWN_EGG = register("creey_spawn_egg", properties -> new SpawnEggItem(properties.spawnEgg(CreeksworldModEntities.CREEY)));
		GREATNESS = register("greatness", GreatnessItem::new);
		CRESAND = block(CreeksworldModBlocks.CRESAND, "cresand");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CreeksworldMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CreeksworldMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}