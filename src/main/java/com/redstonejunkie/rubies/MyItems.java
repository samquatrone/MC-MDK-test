package com.redstonejunkie.rubies;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MyItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Rubies.MODID);

    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS
            .registerSimpleBlockItem(
                    "example_block",
                    MyBlocks.EXAMPLE_BLOCK
            );

    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS
            .registerSimpleBlockItem(
                    "ruby_block",
                    MyBlocks.RUBY_BLOCK
            );
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem(
            "ruby",
            new Item.Properties()
    );

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem(
            "example_item",
            new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .alwaysEat()
                            .nutrition(1)
                            .saturationMod(2f)
                            .build()
                    )
    );
}