package itsaslan.agaric.items;

import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.agaric.items.generic.ItemGeneric;
import itsaslan.agaric.items.generic.ItemGenericFood;
import itsaslan.agaric.items.generic.ItemGenericPotionEffect;
import itsaslan.agaric.items.tools.ItemKnife;
import itsaslan.agaric.lib.ModVars;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;

public class ModItems
{

    public static void MainRegistry()
    {
        ItemInit();
        ItemRegister();
    }

    // Generic Items
    public static Item whiteFungi;
    public static Item brownFungi;
    public static Item redFungi;

    // Tools
    public static Item itemKnife;


    public static void ItemInit()
    {
        // Generic Items
        whiteFungi = new ItemGenericPotionEffect(2, 0.5f, false, new Potion[]{Potion.confusion}, new int[]{600}, new int[]{0}).setUnlocalizedName("whiteFungi").setMaxStackSize(16).setCreativeTab(CreativeTabs.tabFood).setTextureName(ModVars.MOD_ID + ":whiteFungi");
        brownFungi = new ItemGenericPotionEffect(2, 0.5f, false, new Potion[]{Potion.hunger}, new int[]{600}, new int[]{0}).setUnlocalizedName("brownFungi").setMaxStackSize(16).setCreativeTab(CreativeTabs.tabFood).setTextureName(ModVars.MOD_ID + ":brownFungi");
        redFungi = new ItemGenericPotionEffect(2, 0.5f, false, new Potion[]{Potion.weakness}, new int[]{600}, new int[]{0}).setUnlocalizedName("redFungi").setMaxStackSize(16).setCreativeTab(CreativeTabs.tabFood).setTextureName(ModVars.MOD_ID + ":redFungi");

        // Tools
        itemKnife = new ItemKnife().setUnlocalizedName("itemKnife").setCreativeTab(CreativeTabs.tabTools).setTextureName(ModVars.MOD_ID + ":itemKnife");
    }

    public static void ItemRegister()
    {
        // Generic Items
        GameRegistry.registerItem(whiteFungi, whiteFungi.getUnlocalizedName());
        GameRegistry.registerItem(brownFungi, brownFungi.getUnlocalizedName());
        GameRegistry.registerItem(redFungi, redFungi.getUnlocalizedName());

        // Tools
        GameRegistry.registerItem(itemKnife, itemKnife.getUnlocalizedName());
    }

}
