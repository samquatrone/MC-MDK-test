package com.redstonejunkie.rubies;

import com.redstonejunkie.rubies.Rubies;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_RUBY_TOOL = tag("needs_ruby_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(Rubies.MODID, name));
    }
}
