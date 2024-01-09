package com.redstonejunkie.rubies;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial RUBY = new ModArmorMaterial(
            new int[] {500, 1200, 600, 400},
            new int[] {11, 16, 15, 13},
            20,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            () -> Ingredient.of(ItemInit.RUBY::get),
            "ruby",
            1f,
            0.15f
    );
}
