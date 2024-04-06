package itsaslan.agaric.main;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import itsaslan.agaric.lib.ModVars;
import itsaslan.agaric.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = ModVars.MOD_ID, name = ModVars.MOD_NAME, version = ModVars.MOD_VERSION)
public class MainRegistry
{
    @Mod.Instance
    public static MainRegistry instance = new MainRegistry();

    @SidedProxy(clientSide = "itsaslan.agaric.proxy.ClientProxy", serverSide = "itsaslan.agaric.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent $e)
    {
        proxy.preInit($e);

        ModEventHandler handler = new ModEventHandler();
        FMLCommonHandler.instance().bus().register(handler);
        MinecraftForge.EVENT_BUS.register(handler);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent $e)
    {
        proxy.init($e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent $e)
    {
        proxy.postInit($e);
    }
}
