package itsaslan.agaric.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import itsaslan.agaric.blocks.ModBlocks;
import itsaslan.agaric.items.ModItems;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent $e)
    {
        ModItems.MainRegistery();
        ModBlocks.MainRegistery();
    }

    public void init(FMLInitializationEvent $e)
    {

    }

    public void postInit(FMLPostInitializationEvent $e)
    {

    }
}
