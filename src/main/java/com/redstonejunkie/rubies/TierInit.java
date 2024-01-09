package com.redstonejunkie.rubies;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.TierSortingRegistry;

import java.util.List;

public class TierInit {
        public static final Tier RUBY = TierSortingRegistry.registerTier(
                new SimpleTier(
                        5,
                        750,
                        7f,
                        4f,
                        20,
                        TagInit.NEEDS_RUBY_TOOL,
                        () -> Ingredient.of(ItemInit.RUBY::get)
                ),
                new ResourceLocation(Rubies.MODID, "rubies"),
                List.of(Tiers.NETHERITE),
                List.of()
        );
}
