package itsaslan.agaric.blocks.fungi;

import itsaslan.agaric.items.ModItems;
import itsaslan.agaric.tileentity.fungi.TileEntityWhiteFungi;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class WhiteFungiBlock extends BlockContainer
{

    public WhiteFungiBlock(Material material) {
        super(material);
        this.setHardness(50.0f);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {

        if(!world.isRemote && player.getHeldItem() != null && player.getHeldItem().getItem() == ModItems.itemKnife)
        {

            this.dropBlockAsItem(world, x, y, z, new ItemStack(ModItems.whiteFungi, 1));
            world.setBlockToAir(x, y, z);
            world.playSoundEffect(x + 0.5, y + 0.5, z + 0.5, "mob.sheep.shear", 1.0F, 1.0F);
            player.getHeldItem().damageItem(1, player);

            return true;

        }

        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        int orientation = MathHelper.floor_double((entity.rotationYaw * 4.0F) / 360.0F + 0.5D) & 3;
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile instanceof TileEntityWhiteFungi) {
            ((TileEntityWhiteFungi) tile).setOrientation(orientation);
        }
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityWhiteFungi();
    }

}
