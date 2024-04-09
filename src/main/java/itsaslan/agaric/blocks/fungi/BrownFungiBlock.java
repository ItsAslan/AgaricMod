package itsaslan.agaric.blocks.fungi;

import itsaslan.agaric.interfaces.IKnifeHarvestable;
import itsaslan.agaric.items.ModItems;
import itsaslan.agaric.tileentity.fungi.TileEntityBrownFungi;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BrownFungiBlock extends BlockContainer implements IKnifeHarvestable
{

    public BrownFungiBlock(Material material) {
        super(material);
        this.setHardness(50.0f);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return null;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        int orientation = MathHelper.floor_double((entity.rotationYaw * 4.0F) / 360.0F + 0.5D) & 3;
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile instanceof TileEntityBrownFungi) {
            ((TileEntityBrownFungi) tile).setOrientation(orientation);
        }
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityBrownFungi();
    }

    @Override
    public void onHarvested(World world, int x, int y, int z, Block block) {
        if (!world.isRemote) {
            world.setBlock(x, y, z, block);
            this.dropBlockAsItem(world, x, y, z, new ItemStack(ModItems.brownFungi, 2));
            world.playSoundEffect(x + 0.5, y + 0.5, z + 0.5, "mob.sheep.shear", 1.0F, 1.0F);
        }
    }
}
