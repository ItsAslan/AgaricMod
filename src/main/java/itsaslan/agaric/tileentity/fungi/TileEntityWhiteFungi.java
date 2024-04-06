package itsaslan.agaric.tileentity.fungi;

import net.minecraft.tileentity.TileEntity;

public class TileEntityWhiteFungi extends TileEntity
{

    private int orientation = 0;

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

}
