package com.redstonejunkie.rubies;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Rubies.MODID);

    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS
            .registerSimpleBlockItem(
                    "ruby_block",
                    BlockInit.RUBY_BLOCK
            );
    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem(
            "ruby",
            new Item.Properties()
    );

}