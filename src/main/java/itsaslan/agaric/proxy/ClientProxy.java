package itsaslan.agaric.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import itsaslan.agaric.render.tileentity.WhiteFungiTileRenderer;
import itsaslan.agaric.tileentity.fungi.TileEntityWhiteFungi;

public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent $e)
    {
        super.preInit($e);

    }

    public void init(FMLInitializationEvent $e)
    {
        super.init($e);
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWhiteFungi.class, new WhiteFungiTileRenderer());
    }

    public void postInit(FMLPostInitializationEvent $e)
    {
        super.postInit($e);

    }
}
