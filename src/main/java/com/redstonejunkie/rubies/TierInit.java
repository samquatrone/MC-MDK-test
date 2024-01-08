package com.redstonejunkie.rubies;

import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class TierInit {
    public static final SimpleTier RUBY = new SimpleTier(
            5,
            750,
            7f,
            4f,
            20,
            TagInit.NEEDS_RUBY_TOOL,
            () -> Ingredient.of(ItemInit.RUBY::get)
    );
}
