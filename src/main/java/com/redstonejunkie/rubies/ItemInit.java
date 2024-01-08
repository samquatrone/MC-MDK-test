package com.redstonejunkie.rubies;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Rubies.MODID);

    // Block items
    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS
            .registerSimpleBlockItem(
                    "ruby_block",
                    BlockInit.RUBY_BLOCK
            );

    public static final DeferredItem<BlockItem> RUBY_ORE_ITEM = ITEMS
            .registerSimpleBlockItem(
                    "ruby_ore",
                    BlockInit.RUBY_ORE
            );

    public static final DeferredItem<BlockItem> DEEPSLATE_RUBY_ORE_ITEM = ITEMS
            .registerSimpleBlockItem(
                    "deepslate_ruby_ore",
                    BlockInit.DEEPSLATE_RUBY_ORE
            );

    // Non-block items
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem(
            "ruby",
            new Item.Properties()
                    .stacksTo(69)
    );

    public static final DeferredItem<PickaxeItem> RUBY_PICKAXE = ITEMS.register(
            "ruby_pickaxe",
            () -> new PickaxeItem(
                    TierInit.RUBY,
                    5,
                    2.5f,
                    new Item.Properties()
            )
    );

}