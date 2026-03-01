package com.io.github.bnana877.registry;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.item.Item;
import com.io.github.bnana877.core.ModConstants;

import com.io.github.bnana877.item.common.MashedPotato;
import com.io.github.bnana877.item.common.PotatoBlock;

public final class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ModConstants.MODID);

    // アイテムの登録
    public static final RegistryObject<Item> MASHED_POTATO = MashedPotato.register(ITEMS);

    // ブロックアイテムの登録
    public static final RegistryObject<Item> POTATO_BLOCK = PotatoBlock.register(ITEMS);
}
