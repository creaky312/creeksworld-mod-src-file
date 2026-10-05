package net.mcreator.creeksworld.world.features;

import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class CretreeFeature extends TreeFeature {
	public CretreeFeature() {
		super(TreeConfiguration.CODEC);
	}

	public static final Predicate<BiomeSelectionContext> GENERATE_BIOMES = BiomeSelectors.includeByKey(ResourceKey.create(Registries.BIOME, Identifier.parse("creeksworld:creekworld")));
}