package dev.anhgelus.betterlostcities;

import mcjty.lostcities.LostCities;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = BetterLostCities.MODID, name = BetterLostCities.NAME, version = BetterLostCities.VERSION, dependencies = "after:forge@[" + BetterLostCities.MIN_FORGE_VER + ",)")
public class BetterLostCities
{
    public static final String MODID = "betterlostcities";
    public static final String NAME = "Better Lost Cites";
    public static final String VERSION = "1.12-0.0.1";
    public static final String MIN_FORGE_VER = "14.23.5.2855";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
