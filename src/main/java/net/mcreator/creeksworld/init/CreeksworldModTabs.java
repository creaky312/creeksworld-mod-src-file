/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creeksworld.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class CreeksworldModTabs {
	public static void load() {
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(tabData -> {
			tabData.accept(CreeksworldModBlocks.CREGRASS.asItem());
			tabData.accept(CreeksworldModBlocks.CREDIRT.asItem());
			tabData.accept(CreeksworldModBlocks.CRESAND.asItem());
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(CreeksworldModItems.CREEKSWORLD);
			tabData.accept(CreeksworldModItems.GREATNESS);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.SPAWN_EGGS).register(tabData -> {
			tabData.accept(CreeksworldModItems.CREEY_SPAWN_EGG);
		});
	}
}