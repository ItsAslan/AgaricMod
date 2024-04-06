package itsaslan.agaric.blocks.fungi;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import itsaslan.agaric.lib.ModVars;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class WhiteFungiStem extends Block
{

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public WhiteFungiStem(Material material) {
        super(material);

        setHardness(0.5F);
        setResistance(1.0F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        icons = new IIcon[6];

        icons[0] = reg.registerIcon(ModVars.MOD_ID + ":whiteFungiTop"); // Bottom
        icons[1] = reg.registerIcon(ModVars.MOD_ID + ":whiteFungiTop"); // Top
        icons[2] = reg.registerIcon(ModVars.MOD_ID + ":whiteFungiStem"); // North
        icons[3] = reg.registerIcon(ModVars.MOD_ID + ":whiteFungiStem"); // South
        icons[4] = reg.registerIcon(ModVars.MOD_ID + ":whiteFungiStem"); // West
        icons[5] = reg.registerIcon(ModVars.MOD_ID + ":whiteFungiStem"); // East

    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return icons[side];
    }

}
