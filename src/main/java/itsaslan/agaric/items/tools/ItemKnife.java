package itsaslan.agaric.items.tools;

import itsaslan.agaric.interfaces.IKnifeHarvestable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKnife extends Item
{

    public ItemKnife()
    {
        this.setMaxStackSize(1);
        this.setMaxDamage(10);
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {

        if(world.getBlock(x, y, z) instanceof IKnifeHarvestable)
        {
            ((IKnifeHarvestable) world.getBlock(x, y, z)).onHarvested(world, x, y, z, Blocks.air);
            player.getHeldItem().damageItem(1, player);
        }

        return true;

    }
}
