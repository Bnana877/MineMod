package com.io.github.bnana877.item.common;

import com.io.github.bnana877.registry.Blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class PotatoBlock {
    public static final RegistryObject<Item> register(DeferredRegister<Item> ITEMS) {
        return ITEMS.register("potato_block",
                () -> new BlockItem(Blocks.POTATOBLOCK.get(), new Item.Properties().setId(ITEMS.key("potato_block"))));
    }
}
