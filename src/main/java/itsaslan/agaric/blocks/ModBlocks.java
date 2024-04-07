package itsaslan.agaric.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.agaric.blocks.fungi.RedFungiBlock;
import itsaslan.agaric.blocks.fungi.WhiteFungiBlock;
import itsaslan.agaric.blocks.fungi.WhiteFungiRoof;
import itsaslan.agaric.blocks.fungi.WhiteFungiStem;
import itsaslan.agaric.blocks.generic.BlockGeneric;
import itsaslan.agaric.lib.ModVars;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import static net.minecraft.block.Block.soundTypeCloth;

public class ModBlocks
{

    public static void MainRegistry()
    {
        BlockInit();
        BlockRegister();
    }

    public static Block whiteFungiBlock;
    public static Block whiteFungiStem;
    public static Block whiteFungiRoof;
    public static Block brownFungiBlock;
    public static Block redFungiBlock;

    public static void BlockInit()
    {
        whiteFungiBlock = new WhiteFungiBlock(Material.rock).setBlockName("whiteFungiBlock").setCreativeTab(CreativeTabs.tabBlock).setStepSound(soundTypeCloth).setBlockTextureName(ModVars.MOD_ID + ":whiteFungiRoof");
        whiteFungiRoof = new WhiteFungiRoof(Material.cloth).setBlockName("whiteFungiRoof").setCreativeTab(CreativeTabs.tabBlock).setStepSound(soundTypeCloth).setBlockTextureName(ModVars.MOD_ID + ":whiteFungiRoof");
        whiteFungiStem = new WhiteFungiStem(Material.cloth).setBlockName("whiteFungiStem").setCreativeTab(CreativeTabs.tabBlock).setStepSound(soundTypeCloth);
        brownFungiBlock = new BlockGeneric(Material.rock).setBlockName("brownFungiBlock").setCreativeTab(CreativeTabs.tabBlock).setStepSound(soundTypeCloth).setBlockTextureName(ModVars.MOD_ID + "brownFungiBlock");
        redFungiBlock = new RedFungiBlock(Material.rock).setBlockName("redFungiBlock").setCreativeTab(CreativeTabs.tabBlock).setStepSound(soundTypeCloth).setBlockTextureName(ModVars.MOD_ID + "models/redFungiBlock");
    }

    public static void BlockRegister()
    {
        GameRegistry.registerBlock(whiteFungiBlock, whiteFungiBlock.getUnlocalizedName());
        GameRegistry.registerBlock(whiteFungiStem, whiteFungiStem.getUnlocalizedName());
        GameRegistry.registerBlock(whiteFungiRoof, whiteFungiRoof.getUnlocalizedName());
        GameRegistry.registerBlock(brownFungiBlock, brownFungiBlock.getUnlocalizedName());
        GameRegistry.registerBlock(redFungiBlock, redFungiBlock.getUnlocalizedName());
    }

}
