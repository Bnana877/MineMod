package com.io.github.bnana877.registry;

import com.io.github.bnana877.core.ModConstants;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class CreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, ModConstants.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register(ModConstants.MODID,
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> Items.POTATO_BLOCK.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        Items.ITEMS.getEntries().forEach(entry -> output.accept(entry.get()));
                    }).build());
}
