package com.redstonejunkie.rubies;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Rubies.MODID);
    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS
            .registerSimpleBlock(
                    "ruby_block",
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.COLOR_RED)
                            .strength(2.5f)
                            .requiresCorrectToolForDrops()
            );

    public static final DeferredBlock<DropExperienceBlock> RUBY_ORE = BLOCKS
            .register(
                    "ruby_ore",
                    () -> new DropExperienceBlock(
                            UniformInt.of(4,7),
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.COLOR_RED)
                                    .strength(3f)
                                    .requiresCorrectToolForDrops()
                    )
            );

    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_RUBY_ORE = BLOCKS
            .register(
                    "deepslate_ruby_ore",
                    () -> new DropExperienceBlock(
                            UniformInt.of(4,7),
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.COLOR_RED)
                                    .strength(4.5f)
                                    .requiresCorrectToolForDrops()
                    )
            );


}
