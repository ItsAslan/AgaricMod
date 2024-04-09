package itsaslan.agaric.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.agaric.blocks.ModBlocks;
import itsaslan.agaric.crafting.RegisterCrafting;
import itsaslan.agaric.gen.AgaricGeneration;
import itsaslan.agaric.items.ModItems;
import itsaslan.agaric.main.RegisterTileEntity;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent $e)
    {
        ModItems.MainRegistry();
        ModBlocks.MainRegistry();
        RegisterTileEntity.MainRegistry();
        RegisterCrafting.MainRegistry();

        GameRegistry.registerWorldGenerator(new AgaricGeneration(), 0);
    }

    public void init(FMLInitializationEvent $e)
    {

    }

    public void postInit(FMLPostInitializationEvent $e)
    {

    }
}
