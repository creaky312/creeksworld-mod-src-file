/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creeksworld.init;

import net.mcreator.creeksworld.client.renderer.CreeyRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CreeksworldModEntityRenderers {
	public static void clientLoad() {
		EntityRendererRegistry.register(CreeksworldModEntities.CREEY, CreeyRenderer::new);
	}
}