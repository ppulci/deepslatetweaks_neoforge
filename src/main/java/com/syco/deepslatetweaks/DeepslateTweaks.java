package com.syco.deepslatetweaks;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(DeepslateTweaks.MODID)
public class DeepslateTweaks {
    public static final String MODID = "deepslatetweaks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public DeepslateTweaks(IEventBus modEventBus, ModContainer modContainer) {
        // Diagnostic: expected 1.5 / 2.0 / 3.0 — vanilla values (3.0 / 3.5 / 4.5) mean the mixin
        // did not apply. Controls must stay vanilla (stone 1.5, dirt 0.5); anything else means the
        // mixin over-applied to unrelated blocks (seen when a slice anchor silently stops matching).
        LOGGER.info("Deepslate Tweaks loaded! Effective hardness — deepslate: {}, cobbled: {}, deepslate iron ore: {} | controls — stone: {}, dirt: {}",
                Blocks.DEEPSLATE.defaultDestroyTime(),
                Blocks.COBBLED_DEEPSLATE.defaultDestroyTime(),
                Blocks.DEEPSLATE_IRON_ORE.defaultDestroyTime(),
                Blocks.STONE.defaultDestroyTime(),
                Blocks.DIRT.defaultDestroyTime());
    }
}
