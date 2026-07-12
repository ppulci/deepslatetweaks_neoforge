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
        // Diagnostic: expected 1.5 / 2.0 / 3.0 — vanilla values here mean the mixin did not apply
        LOGGER.info("Deepslate Tweaks loaded! Effective hardness — deepslate: {}, cobbled: {}, deepslate iron ore: {}",
                Blocks.DEEPSLATE.defaultDestroyTime(),
                Blocks.COBBLED_DEEPSLATE.defaultDestroyTime(),
                Blocks.DEEPSLATE_IRON_ORE.defaultDestroyTime());
    }
}
