package com.io.github.bnana877.block.common;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class PotatoBlock {
    public static final RegistryObject<Block> register(DeferredRegister<Block> BLOCKS) {
        return BLOCKS.register("potato_block",
                () -> new Block(BlockBehaviour.Properties.of()
                        .strength(1.5f, 1.5f)
                        .friction(0.8f)
                        .setId(BLOCKS.key("potato_block"))
                        .mapColor(MapColor.STONE)));
    }
}
