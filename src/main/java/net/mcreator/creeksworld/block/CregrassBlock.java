package net.mcreator.creeksworld.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CregrassBlock extends Block {
	public CregrassBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WET_GRASS).strength(0.7f));
	}

	@Override
	public int getLightDampening(BlockState state) {
		return 10;
	}
}