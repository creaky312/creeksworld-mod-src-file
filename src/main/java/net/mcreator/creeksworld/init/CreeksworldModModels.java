/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creeksworld.init;

import net.mcreator.creeksworld.client.model.Modelcreey;

import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CreeksworldModModels {
	public static void clientLoad() {
		ModelLayerRegistry.registerModelLayer(Modelcreey.LAYER_LOCATION, Modelcreey::createBodyLayer);
	}
}