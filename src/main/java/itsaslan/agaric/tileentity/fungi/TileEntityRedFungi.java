package itsaslan.agaric.tileentity.fungi;

import itsaslan.agaric.interfaces.OrientationHandler;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRedFungi extends TileEntity implements OrientationHandler
{

    private int orientation = 0;

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

}
