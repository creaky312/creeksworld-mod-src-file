package net.mcreator.creeksworld.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.2.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcreey extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("creeksworld", "modelcreey"), "main");
	public final ModelPart root;
	public final ModelPart Waist;
	public final ModelPart head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public Modelcreey(ModelPart root) {
		super(root);
		this.root = root.getChild("root");
		this.Waist = this.root.getChild("Waist");
		this.head = this.Waist.getChild("head");
		this.Body = this.Waist.getChild("Body");
		this.RightArm = this.Waist.getChild("RightArm");
		this.LeftArm = this.Waist.getChild("LeftArm");
		this.LeftLeg = this.root.getChild("LeftLeg");
		this.RightLeg = this.root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Waist = root.addOrReplaceChild("Waist", CubeListBuilder.create(), PartPose.offset(-1.0F, -19.0F, 0.0F));
		PartDefinition head = Waist.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
				.addBox(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 12).addBox(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -11.0F, 0.0F));
		PartDefinition Body = Waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.0F, 1.0F));
		PartDefinition RightArm = Waist.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(22, 13).addBox(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, -9.5F, 1.5F));
		PartDefinition LeftArm = Waist.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(30, 40).addBox(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 12)
				.addBox(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 19).addBox(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -9.0F, 0.5F));
		PartDefinition LeftLeg = root.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(42, 40).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 55).addBox(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.5F, -16.0F, 0.5F));
		PartDefinition RightLeg = root.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 34).addBox(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 46)
				.addBox(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 34).addBox(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -17.5F, 0.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}