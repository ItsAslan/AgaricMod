package itsaslan.agaric.interfaces;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public interface IKnifeHarvestable
{
    void onHarvested(World world, int x, int y, int z, Block block);
}
