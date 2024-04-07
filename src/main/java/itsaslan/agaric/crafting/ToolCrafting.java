package itsaslan.agaric.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import itsaslan.agaric.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ToolCrafting
{

    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.itemKnife), "I", "S", 'I', Items.iron_ingot, 'S', Items.stick);
    }

}
