package itsaslan.agaric.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import itsaslan.agaric.blocks.ModBlocks;
import itsaslan.agaric.render.item.BrownFungiItemRenderer;
import itsaslan.agaric.render.item.RedFungiItemRenderer;
import itsaslan.agaric.render.item.WhiteFungiItemRenderer;
import itsaslan.agaric.render.tileentity.BrownFungiTileRenderer;
import itsaslan.agaric.render.tileentity.RedFungiTileRenderer;
import itsaslan.agaric.render.tileentity.WhiteFungiTileRenderer;
import itsaslan.agaric.tileentity.fungi.TileEntityBrownFungi;
import itsaslan.agaric.tileentity.fungi.TileEntityRedFungi;
import itsaslan.agaric.tileentity.fungi.TileEntityWhiteFungi;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

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
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRedFungi.class, new RedFungiTileRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBrownFungi.class, new BrownFungiTileRenderer());

        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.whiteFungiBlock), new WhiteFungiItemRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.redFungiBlock), new RedFungiItemRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.brownFungiBlock), new BrownFungiItemRenderer());
    }

    public void postInit(FMLPostInitializationEvent $e)
    {
        super.postInit($e);

    }
}
