package itsaslan.agaric.handlers;

import itsaslan.agaric.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class AgaricGenHandler
{

    public static void addOreSpawn(Block block, World world, Random random, int blockX, int blockZ, int maxX, int maxZ, int maxVeinSize, int minVeinSize, int chanceToSpawn, int minY, int maxY)
    {
        for(int i = 0; i < chanceToSpawn; i++)
        {
            int xPos = blockX + random.nextInt(maxX);
            int yPos = minY + random.nextInt(maxY - minY);
            int zPos = blockZ + random.nextInt(maxZ);

            int veinSize = random.nextInt(maxVeinSize - minVeinSize);

            (new WorldGenMinable(block, veinSize)).generate(world, random, xPos, yPos, zPos);
        }
    }

    public static void spawnMushroom(World world, Random random, int chanceToSpawn, int x, int z)
    {

        int y = world.getHeightValue(x, z);
        boolean canSpawn = false;

        if(world.getBlock(x, y - 1, z) == Blocks.water && world.getBlock(x, y - 2, z).isOpaqueCube())
        {
            canSpawn = true;
            y--;
        }

        if(random.nextInt(1000) < chanceToSpawn && canSpawn)
        {
            int height = 3 + random.nextInt(2);
            for (int i = 0; i < height; i++) {
                world.setBlock(x, y + i, z, ModBlocks.whiteFungiStem, 0, 2);
            }

            for (int dx = -2; dx <= 2; dx++) {
                for (int dz = -2; dz <= 2; dz++) {
                    if (Math.abs(dx) != 2 || Math.abs(dz) != 2 ) {
                        if(dx >= -1 && dx <= 1 && dz >= -1 && dz <= 1)
                        {
                            world.setBlock(x + dx, y + height, z + dz, ModBlocks.whiteFungiRoof, 0, 2);
                        }
                        else
                        {
                            world.setBlock(x + dx, y + height - 1, z + dz, ModBlocks.whiteFungiRoof, 0, 2);
                        }
                    }
                }
            }
            System.out.println("Spawned at: " + x + " " + y + " " + z);
        }
    }

}
