package itsaslan.agaric.gen;

import cpw.mods.fml.common.IWorldGenerator;
import itsaslan.agaric.handlers.AgaricGenHandler;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class AgaricGeneration implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunckGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                genNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                genOverworld(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                genEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void genNether(World world, Random random, int x, int z)
    {

    }

    private void genOverworld(World world, Random random, int x, int z)
    {
        AgaricGenHandler.spawnMushroom(world, random, 48, x, z);
    }

    private void genEnd(World world, Random random, int x, int z)
    {

    }

}
