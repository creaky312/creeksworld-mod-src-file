package net.mcreator.creeksworld.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class CresandBlock extends FallingBlock {
	public static final MapCodec<CresandBlock> CODEC = simpleCodec(CresandBlock::new);

	@Override
	public MapCodec<CresandBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public CresandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SOUL_SAND).strength(1f, 10f));
	}
}