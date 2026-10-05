package net.mcreator.creeksworld.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.creeksworld.entity.CreeyEntity;
import net.mcreator.creeksworld.client.model.Modelcreey;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CreeyRenderer extends MobRenderer<CreeyEntity, LivingEntityRenderState, Modelcreey> {
	private final Identifier entityTexture = Identifier.parse("creeksworld:textures/entities/creey.png");

	public CreeyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcreey(context.bakeLayer(Modelcreey.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CreeyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}