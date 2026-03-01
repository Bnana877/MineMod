package com.io.github.bnana877.core;

import com.io.github.bnana877.registry.Blocks;
import com.io.github.bnana877.registry.CreativeTabs;
import com.io.github.bnana877.registry.Items;

import net.minecraftforge.eventbus.api.bus.BusGroup;

public final class ModRegistries {

        public static void register(BusGroup modBusGroup) {

                Blocks.BLOCKS.register(modBusGroup);
                Items.ITEMS.register(modBusGroup);
                CreativeTabs.CREATIVE_MODE_TABS.register(modBusGroup);
        }

}
