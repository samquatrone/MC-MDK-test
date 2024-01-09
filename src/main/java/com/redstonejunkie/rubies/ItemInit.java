package com.redstonejunkie.rubies;

import net.minecraft.world.item.*;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;

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

    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.register(
            "ruby_sword",
            () -> new SwordItem(
                    TierInit.RUBY,
                    4,
                    2,
                    new Item.Properties()
            )
    );

    public static final DeferredItem<AxeItem> RUBY_AXE = ITEMS.register(
            "ruby_axe",
            () -> new AxeItem(
                    TierInit.RUBY,
                    5,
                    1.5f,
                    new Item.Properties()
            )
    );

    public static final DeferredItem<ShovelItem> RUBY_SHOVEL = ITEMS.register(
            "ruby_shovel",
            () -> new ShovelItem(
                    TierInit.RUBY,
                    5,
                    1.5f,
                    new Item.Properties()
            )
    );

    public static final DeferredItem<HoeItem> RUBY_HOE = ITEMS.register(
            "ruby_hoe",
            () -> new HoeItem(
                    TierInit.RUBY,
                    5,
                    1.5f,
                    new Item.Properties()
            )
    );

    public static final DeferredItem<ArmorItem> RUBY_HELMET = ITEMS.register(
            "ruby_helmet",
            () -> new ArmorItem(
                    ArmorMaterialInit.RUBY,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            )
    );

    public static final DeferredItem<ArmorItem> RUBY_CHESTPLATE = ITEMS.register(
            "ruby_chestplate",
            () -> new ArmorItem(
                    ArmorMaterialInit.RUBY,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
            )
    );

    public static final DeferredItem<ArmorItem> RUBY_LEGGINGS = ITEMS.register(
            "ruby_leggings",
            () -> new ArmorItem(
                    ArmorMaterialInit.RUBY,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
            )
    );

    public static final DeferredItem<ArmorItem> RUBY_BOOTS = ITEMS.register(
            "ruby_boots",
            () -> new ArmorItem(
                    ArmorMaterialInit.RUBY,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
            )
    );
}