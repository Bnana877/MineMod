package com.io.github.bnana877.item.common;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class MashedPotato {
    public static final RegistryObject<Item> register(DeferredRegister<Item> ITEMS) {
        return ITEMS.register("mashed_potato",
                () -> new Item(new Item.Properties().setId(ITEMS.key("mashed_potato")).food(new FoodProperties.Builder()
                        .nutrition(12)
                        .saturationModifier(0.6f)
                        .build())));
    }
}
e