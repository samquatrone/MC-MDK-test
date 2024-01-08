package com.redstonejunkie.rubies;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeTabsInit {
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Rubies.MODID);

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS
            .register("example_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable(Rubies.MOD_NAME))
                    .withTabsBefore(net.minecraft.world.item.CreativeModeTabs.COMBAT)
                    .icon(() -> ItemInit.RUBY.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        // Add the example item to the tab. For your own tabs, this method is preferred over the event
                        output.accept(ItemInit.RUBY.get());
                        output.accept(BlockInit.RUBY_BLOCK.get());
                        output.accept(BlockInit.RUBY_ORE.get());
                        output.accept(BlockInit.DEEPSLATE_RUBY_ORE.get());
                        output.accept(ItemInit.RUBY_PICKAXE.get());
                    }).build());

    static public void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ItemInit.RUBY_BLOCK_ITEM);
        }
    }
}