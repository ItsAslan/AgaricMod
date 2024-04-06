package itsaslan.agaric.items;

import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.agaric.items.tools.ItemKnife;
import net.minecraft.item.Item;

public class ModItems
{

    public static void MainRegistery()
    {
        ItemInit();
        ItemRegister();
    }

    // Generic Items
    public static Item testItem;

    // Tools
    public static Item itemKnife;


    public static void ItemInit()
    {
        // Generic Items
        testItem = new ItemGeneric();

        // Tools
        itemKnife = new ItemKnife();
    }

    public static void ItemRegister()
    {
        // Generic Items
        GameRegistry.registerItem(testItem, testItem.getUnlocalizedName());

        // Tools
        GameRegistry.registerItem(itemKnife, itemKnife.getUnlocalizedName());
    }

}
