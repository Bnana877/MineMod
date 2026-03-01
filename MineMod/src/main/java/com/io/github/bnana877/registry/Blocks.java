package com.io.github.bnana877.registry;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.io.github.bnana877.block.common.PotatoBlock;
import com.io.github.bnana877.core.ModConstants;

import net.minecraft.world.level.block.Block;

public final class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ModConstants.MODID);

    public static final RegistryObject<Block> POTATOBLOCK = PotatoBlock.register(BLOCKS);

}
