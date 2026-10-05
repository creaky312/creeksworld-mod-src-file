/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creeksworld.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.creeksworld.world.features.CretreeFeature;
import net.mcreator.creeksworld.CreeksworldMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class CreeksworldModFeatures {
	public static void load() {
		register("cretree", new CretreeFeature(), CretreeFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
	}

	private static void register(String registryname, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration stage) {
		register(registryname, feature);
		BiomeModifications.addFeature(biomes, stage, ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(CreeksworldMod.MODID, registryname)));
	}

	private static void register(String registryname, Feature feature) {
		Registry.register(BuiltInRegistries.FEATURE, Identifier.fromNamespaceAndPath(CreeksworldMod.MODID, registryname), feature);
	}
}