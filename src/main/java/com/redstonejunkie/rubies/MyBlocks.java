package com.redstonejunkie.rubies;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MyBlocks {
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Rubies.MODID);
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS
            .registerSimpleBlock(
                    "example_block",
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
            );
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS
            .registerSimpleBlock(
                    "ruby_block",
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
            );

}
