package com.syco.deepslatetweaks;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(DeepslateTweaks.MODID)
public class DeepslateTweaks {
    public static final String MODID = "deepslatetweaks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public DeepslateTweaks(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Deepslate Tweaks loaded!");
    }
}
